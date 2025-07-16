package com.example.grpc;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: user.proto")
public class UserServiceBean extends MutinyUserServiceGrpc.UserServiceImplBase implements BindableService, MutinyBean {

    private final UserService delegate;

    UserServiceBean(@GrpcService UserService delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> createUser(com.example.grpc.CreateUserRequest request) {
        try {
            return delegate.createUser(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> getUser(com.example.grpc.GetUserRequest request) {
        try {
            return delegate.getUser(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.GetAllUsersResponse> getAllUsers(com.example.grpc.GetAllUsersRequest request) {
        try {
            return delegate.getAllUsers(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> updateUser(com.example.grpc.UpdateUserRequest request) {
        try {
            return delegate.updateUser(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.DeleteUserResponse> deleteUser(com.example.grpc.DeleteUserRequest request) {
        try {
            return delegate.deleteUser(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
