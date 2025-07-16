package com.example.grpc;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: user.proto")
public interface UserService extends MutinyService {

    io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> createUser(com.example.grpc.CreateUserRequest request);

    io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> getUser(com.example.grpc.GetUserRequest request);

    io.smallrye.mutiny.Uni<com.example.grpc.GetAllUsersResponse> getAllUsers(com.example.grpc.GetAllUsersRequest request);

    io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> updateUser(com.example.grpc.UpdateUserRequest request);

    io.smallrye.mutiny.Uni<com.example.grpc.DeleteUserResponse> deleteUser(com.example.grpc.DeleteUserRequest request);
}
