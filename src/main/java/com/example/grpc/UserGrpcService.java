package com.example.grpc;

import com.example.entity.User;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import jakarta.transaction.Transactional;

@GrpcService
public class UserGrpcService implements UserService {

    @Override
    @Transactional
    public Uni<UserResponse> createUser(CreateUserRequest request) {
        return Uni.createFrom().item(() -> {
            User user = new User(request.getName(), request.getAge());
            user.persist();
            
            com.example.grpc.User grpcUser = com.example.grpc.User.newBuilder()
                    .setId(user.id)
                    .setName(user.name)
                    .setAge(user.age)
                    .build();
            
            return UserResponse.newBuilder()
                    .setUser(grpcUser)
                    .setSuccess(true)
                    .setMessage("User created successfully")
                    .build();
        });
    }

    @Override
    public Uni<UserResponse> getUser(GetUserRequest request) {
        return Uni.createFrom().item(() -> {
            User user = User.findById(request.getId());
            
            if (user == null) {
                return UserResponse.newBuilder()
                        .setSuccess(false)
                        .setMessage("User not found")
                        .build();
            }
            
            com.example.grpc.User grpcUser = com.example.grpc.User.newBuilder()
                    .setId(user.id)
                    .setName(user.name)
                    .setAge(user.age)
                    .build();
            
            return UserResponse.newBuilder()
                    .setUser(grpcUser)
                    .setSuccess(true)
                    .setMessage("User retrieved successfully")
                    .build();
        });
    }

    @Override
    public Uni<GetAllUsersResponse> getAllUsers(GetAllUsersRequest request) {
        return Uni.createFrom().item(() -> {
            var users = User.<User>listAll();
            
            GetAllUsersResponse.Builder responseBuilder = GetAllUsersResponse.newBuilder();
            
            for (User user : users) {
                com.example.grpc.User grpcUser = com.example.grpc.User.newBuilder()
                        .setId(user.id)
                        .setName(user.name)
                        .setAge(user.age)
                        .build();
                responseBuilder.addUsers(grpcUser);
            }
            
            return responseBuilder.build();
        });
    }

    @Override
    @Transactional
    public Uni<UserResponse> updateUser(UpdateUserRequest request) {
        return Uni.createFrom().item(() -> {
            User user = User.findById(request.getId());
            
            if (user == null) {
                return UserResponse.newBuilder()
                        .setSuccess(false)
                        .setMessage("User not found")
                        .build();
            }
            
            user.name = request.getName();
            user.age = request.getAge();
            
            com.example.grpc.User grpcUser = com.example.grpc.User.newBuilder()
                    .setId(user.id)
                    .setName(user.name)
                    .setAge(user.age)
                    .build();
            
            return UserResponse.newBuilder()
                    .setUser(grpcUser)
                    .setSuccess(true)
                    .setMessage("User updated successfully")
                    .build();
        });
    }

    @Override
    @Transactional
    public Uni<DeleteUserResponse> deleteUser(DeleteUserRequest request) {
        return Uni.createFrom().item(() -> {
            boolean deleted = User.deleteById(request.getId());
            
            if (!deleted) {
                return DeleteUserResponse.newBuilder()
                        .setSuccess(false)
                        .setMessage("User not found")
                        .build();
            }
            
            return DeleteUserResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("User deleted successfully")
                    .build();
        });
    }
}