package com.example.grpc;

import static com.example.grpc.UserServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: user.proto")
public final class MutinyUserServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyUserServiceGrpc() {
    }

    public static MutinyUserServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyUserServiceStub(channel);
    }

    public static class MutinyUserServiceStub extends io.grpc.stub.AbstractStub<MutinyUserServiceStub> implements io.quarkus.grpc.MutinyStub {

        private UserServiceGrpc.UserServiceStub delegateStub;

        private MutinyUserServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = UserServiceGrpc.newStub(channel);
        }

        private MutinyUserServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = UserServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyUserServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyUserServiceStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> createUser(com.example.grpc.CreateUserRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createUser);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> getUser(com.example.grpc.GetUserRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getUser);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.GetAllUsersResponse> getAllUsers(com.example.grpc.GetAllUsersRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getAllUsers);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> updateUser(com.example.grpc.UpdateUserRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateUser);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.DeleteUserResponse> deleteUser(com.example.grpc.DeleteUserRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteUser);
        }
    }

    public static abstract class UserServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public UserServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> createUser(com.example.grpc.CreateUserRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> getUser(com.example.grpc.GetUserRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.GetAllUsersResponse> getAllUsers(com.example.grpc.GetAllUsersRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.UserResponse> updateUser(com.example.grpc.UpdateUserRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.example.grpc.DeleteUserResponse> deleteUser(com.example.grpc.DeleteUserRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.example.grpc.UserServiceGrpc.getCreateUserMethod(), asyncUnaryCall(new MethodHandlers<com.example.grpc.CreateUserRequest, com.example.grpc.UserResponse>(this, METHODID_CREATE_USER, compression))).addMethod(com.example.grpc.UserServiceGrpc.getGetUserMethod(), asyncUnaryCall(new MethodHandlers<com.example.grpc.GetUserRequest, com.example.grpc.UserResponse>(this, METHODID_GET_USER, compression))).addMethod(com.example.grpc.UserServiceGrpc.getGetAllUsersMethod(), asyncUnaryCall(new MethodHandlers<com.example.grpc.GetAllUsersRequest, com.example.grpc.GetAllUsersResponse>(this, METHODID_GET_ALL_USERS, compression))).addMethod(com.example.grpc.UserServiceGrpc.getUpdateUserMethod(), asyncUnaryCall(new MethodHandlers<com.example.grpc.UpdateUserRequest, com.example.grpc.UserResponse>(this, METHODID_UPDATE_USER, compression))).addMethod(com.example.grpc.UserServiceGrpc.getDeleteUserMethod(), asyncUnaryCall(new MethodHandlers<com.example.grpc.DeleteUserRequest, com.example.grpc.DeleteUserResponse>(this, METHODID_DELETE_USER, compression))).build();
        }
    }

    private static final int METHODID_CREATE_USER = 0;

    private static final int METHODID_GET_USER = 1;

    private static final int METHODID_GET_ALL_USERS = 2;

    private static final int METHODID_UPDATE_USER = 3;

    private static final int METHODID_DELETE_USER = 4;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final UserServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(UserServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_CREATE_USER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.example.grpc.CreateUserRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.UserResponse>) responseObserver, compression, serviceImpl::createUser);
                    break;
                case METHODID_GET_USER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.example.grpc.GetUserRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.UserResponse>) responseObserver, compression, serviceImpl::getUser);
                    break;
                case METHODID_GET_ALL_USERS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.example.grpc.GetAllUsersRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.GetAllUsersResponse>) responseObserver, compression, serviceImpl::getAllUsers);
                    break;
                case METHODID_UPDATE_USER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.example.grpc.UpdateUserRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.UserResponse>) responseObserver, compression, serviceImpl::updateUser);
                    break;
                case METHODID_DELETE_USER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.example.grpc.DeleteUserRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.DeleteUserResponse>) responseObserver, compression, serviceImpl::deleteUser);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
