package com.example.grpc;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: user.proto")
public class UserServiceClient implements UserService, MutinyClient<MutinyUserServiceGrpc.MutinyUserServiceStub> {

    private final MutinyUserServiceGrpc.MutinyUserServiceStub stub;

    public UserServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyUserServiceGrpc.MutinyUserServiceStub, MutinyUserServiceGrpc.MutinyUserServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyUserServiceGrpc.newMutinyStub(channel));
    }

    private UserServiceClient(MutinyUserServiceGrpc.MutinyUserServiceStub stub) {
        this.stub = stub;
    }

    public UserServiceClient newInstanceWithStub(MutinyUserServiceGrpc.MutinyUserServiceStub stub) {
        return new UserServiceClient(stub);
    }

    @Override
    public MutinyUserServiceGrpc.MutinyUserServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> createUser(com.example.grpc.CreateUserRequest request) {
        return stub.createUser(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> getUser(com.example.grpc.GetUserRequest request) {
        return stub.getUser(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.GetAllUsersResponse> getAllUsers(com.example.grpc.GetAllUsersRequest request) {
        return stub.getAllUsers(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> updateUser(com.example.grpc.UpdateUserRequest request) {
        return stub.updateUser(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.DeleteUserResponse> deleteUser(com.example.grpc.DeleteUserRequest request) {
        return stub.deleteUser(request);
    }
}
