package com.example.rest;

import com.example.entity.User;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import java.util.List;

@Path("/api/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "User Management", description = "Operations for managing users")
public class UserResource {

    @GET
    @Operation(summary = "Get all users", description = "Retrieve a list of all users")
    @APIResponse(responseCode = "200", description = "List of users", content = @Content(schema = @Schema(implementation = User.class)))
    public List<User> getAllUsers() {
        return User.listAll();
    }

    @GET
    @Path("/{id}")
    @Operation(summary = "Get user by ID", description = "Retrieve a specific user by their ID")
    @APIResponse(responseCode = "200", description = "User found", content = @Content(schema = @Schema(implementation = User.class)))
    @APIResponse(responseCode = "404", description = "User not found")
    public Response getUser(@Parameter(description = "User ID") @PathParam("id") Long id) {
        User user = User.findById(id);
        if (user == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"message\":\"User not found\"}")
                    .build();
        }
        return Response.ok(user).build();
    }

    @POST
    @Transactional
    @Operation(summary = "Create a new user", description = "Create a new user with name and age")
    @APIResponse(responseCode = "201", description = "User created successfully", content = @Content(schema = @Schema(implementation = User.class)))
    @APIResponse(responseCode = "400", description = "Invalid input")
    public Response createUser(CreateUserRequest request) {
        User user = new User(request.name, request.age);
        user.persist();
        return Response.status(Response.Status.CREATED).entity(user).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    @Operation(summary = "Update user", description = "Update an existing user's information")
    @APIResponse(responseCode = "200", description = "User updated successfully", content = @Content(schema = @Schema(implementation = User.class)))
    @APIResponse(responseCode = "404", description = "User not found")
    public Response updateUser(@Parameter(description = "User ID") @PathParam("id") Long id,
            UpdateUserRequest request) {
        User user = User.findById(id);
        if (user == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"message\":\"User not found\"}")
                    .build();
        }
        user.name = request.name;
        user.age = request.age;
        return Response.ok(user).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    @Operation(summary = "Delete user", description = "Delete a user by their ID")
    @APIResponse(responseCode = "200", description = "User deleted successfully")
    @APIResponse(responseCode = "404", description = "User not found")
    public Response deleteUser(@Parameter(description = "User ID") @PathParam("id") Long id) {
        boolean deleted = User.deleteById(id);
        if (!deleted) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"message\":\"User not found\"}")
                    .build();
        }
        return Response.ok("{\"message\":\"User deleted successfully\"}").build();
    }

    // DTOs for REST API
    @Schema(description = "Request object for creating a new user")
    public static class CreateUserRequest {
        @Schema(description = "User's name", example = "John Doe", required = true)
        public String name;

        @Schema(description = "User's age", example = "30", required = true)
        public Integer age;
    }

    @Schema(description = "Request object for updating an existing user")
    public static class UpdateUserRequest {
        @Schema(description = "User's name", example = "Jane Doe", required = true)
        public String name;

        @Schema(description = "User's age", example = "25", required = true)
        public Integer age;
    }
}