package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.59.0)", comments = "Source: user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

    private UserServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "user.UserService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.example.grpc.CreateUserRequest, com.example.grpc.UserResponse> getCreateUserMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "CreateUser", requestType = com.example.grpc.CreateUserRequest.class, responseType = com.example.grpc.UserResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.grpc.CreateUserRequest, com.example.grpc.UserResponse> getCreateUserMethod() {
        io.grpc.MethodDescriptor<com.example.grpc.CreateUserRequest, com.example.grpc.UserResponse> getCreateUserMethod;
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
                    UserServiceGrpc.getCreateUserMethod = getCreateUserMethod = io.grpc.MethodDescriptor.<com.example.grpc.CreateUserRequest, com.example.grpc.UserResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.CreateUserRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.UserResponse.getDefaultInstance())).setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser")).build();
                }
            }
        }
        return getCreateUserMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.example.grpc.GetUserRequest, com.example.grpc.UserResponse> getGetUserMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetUser", requestType = com.example.grpc.GetUserRequest.class, responseType = com.example.grpc.UserResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.grpc.GetUserRequest, com.example.grpc.UserResponse> getGetUserMethod() {
        io.grpc.MethodDescriptor<com.example.grpc.GetUserRequest, com.example.grpc.UserResponse> getGetUserMethod;
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
                    UserServiceGrpc.getGetUserMethod = getGetUserMethod = io.grpc.MethodDescriptor.<com.example.grpc.GetUserRequest, com.example.grpc.UserResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.GetUserRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.UserResponse.getDefaultInstance())).setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser")).build();
                }
            }
        }
        return getGetUserMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.example.grpc.GetAllUsersRequest, com.example.grpc.GetAllUsersResponse> getGetAllUsersMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetAllUsers", requestType = com.example.grpc.GetAllUsersRequest.class, responseType = com.example.grpc.GetAllUsersResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.grpc.GetAllUsersRequest, com.example.grpc.GetAllUsersResponse> getGetAllUsersMethod() {
        io.grpc.MethodDescriptor<com.example.grpc.GetAllUsersRequest, com.example.grpc.GetAllUsersResponse> getGetAllUsersMethod;
        if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
                    UserServiceGrpc.getGetAllUsersMethod = getGetAllUsersMethod = io.grpc.MethodDescriptor.<com.example.grpc.GetAllUsersRequest, com.example.grpc.GetAllUsersResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUsers")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.GetAllUsersRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.GetAllUsersResponse.getDefaultInstance())).setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUsers")).build();
                }
            }
        }
        return getGetAllUsersMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.example.grpc.UpdateUserRequest, com.example.grpc.UserResponse> getUpdateUserMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "UpdateUser", requestType = com.example.grpc.UpdateUserRequest.class, responseType = com.example.grpc.UserResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.grpc.UpdateUserRequest, com.example.grpc.UserResponse> getUpdateUserMethod() {
        io.grpc.MethodDescriptor<com.example.grpc.UpdateUserRequest, com.example.grpc.UserResponse> getUpdateUserMethod;
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
                    UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod = io.grpc.MethodDescriptor.<com.example.grpc.UpdateUserRequest, com.example.grpc.UserResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.UpdateUserRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.UserResponse.getDefaultInstance())).setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser")).build();
                }
            }
        }
        return getUpdateUserMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.example.grpc.DeleteUserRequest, com.example.grpc.DeleteUserResponse> getDeleteUserMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "DeleteUser", requestType = com.example.grpc.DeleteUserRequest.class, responseType = com.example.grpc.DeleteUserResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.grpc.DeleteUserRequest, com.example.grpc.DeleteUserResponse> getDeleteUserMethod() {
        io.grpc.MethodDescriptor<com.example.grpc.DeleteUserRequest, com.example.grpc.DeleteUserResponse> getDeleteUserMethod;
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
                    UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod = io.grpc.MethodDescriptor.<com.example.grpc.DeleteUserRequest, com.example.grpc.DeleteUserResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.DeleteUserRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.DeleteUserResponse.getDefaultInstance())).setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser")).build();
                }
            }
        }
        return getDeleteUserMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static UserServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {

            @java.lang.Override
            public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new UserServiceStub(channel, callOptions);
            }
        };
        return UserServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static UserServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {

            @java.lang.Override
            public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new UserServiceBlockingStub(channel, callOptions);
            }
        };
        return UserServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static UserServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {

            @java.lang.Override
            public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new UserServiceFutureStub(channel, callOptions);
            }
        };
        return UserServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void createUser(com.example.grpc.CreateUserRequest request, io.grpc.stub.StreamObserver<com.example.grpc.UserResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
        }

        /**
         */
        default void getUser(com.example.grpc.GetUserRequest request, io.grpc.stub.StreamObserver<com.example.grpc.UserResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
        }

        /**
         */
        default void getAllUsers(com.example.grpc.GetAllUsersRequest request, io.grpc.stub.StreamObserver<com.example.grpc.GetAllUsersResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
        }

        /**
         */
        default void updateUser(com.example.grpc.UpdateUserRequest request, io.grpc.stub.StreamObserver<com.example.grpc.UserResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
        }

        /**
         */
        default void deleteUser(com.example.grpc.DeleteUserRequest request, io.grpc.stub.StreamObserver<com.example.grpc.DeleteUserResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service UserService.
     */
    public static abstract class UserServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return UserServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service UserService.
     */
    public static class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {

        private UserServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected UserServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new UserServiceStub(channel, callOptions);
        }

        /**
         */
        public void createUser(com.example.grpc.CreateUserRequest request, io.grpc.stub.StreamObserver<com.example.grpc.UserResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUser(com.example.grpc.GetUserRequest request, io.grpc.stub.StreamObserver<com.example.grpc.UserResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getAllUsers(com.example.grpc.GetAllUsersRequest request, io.grpc.stub.StreamObserver<com.example.grpc.GetAllUsersResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void updateUser(com.example.grpc.UpdateUserRequest request, io.grpc.stub.StreamObserver<com.example.grpc.UserResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void deleteUser(com.example.grpc.DeleteUserRequest request, io.grpc.stub.StreamObserver<com.example.grpc.DeleteUserResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service UserService.
     */
    public static class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {

        private UserServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected UserServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new UserServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.example.grpc.UserResponse createUser(com.example.grpc.CreateUserRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateUserMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.example.grpc.UserResponse getUser(com.example.grpc.GetUserRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetUserMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.example.grpc.GetAllUsersResponse getAllUsers(com.example.grpc.GetAllUsersRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.example.grpc.UserResponse updateUser(com.example.grpc.UpdateUserRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getUpdateUserMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.example.grpc.DeleteUserResponse deleteUser(com.example.grpc.DeleteUserRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDeleteUserMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
     */
    public static class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {

        private UserServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected UserServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new UserServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.UserResponse> createUser(com.example.grpc.CreateUserRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.UserResponse> getUser(com.example.grpc.GetUserRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GetAllUsersResponse> getAllUsers(com.example.grpc.GetAllUsersRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.UserResponse> updateUser(com.example.grpc.UpdateUserRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.DeleteUserResponse> deleteUser(com.example.grpc.DeleteUserRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_CREATE_USER = 0;

    private static final int METHODID_GET_USER = 1;

    private static final int METHODID_GET_ALL_USERS = 2;

    private static final int METHODID_UPDATE_USER = 3;

    private static final int METHODID_DELETE_USER = 4;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_CREATE_USER:
                    serviceImpl.createUser((com.example.grpc.CreateUserRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.UserResponse>) responseObserver);
                    break;
                case METHODID_GET_USER:
                    serviceImpl.getUser((com.example.grpc.GetUserRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.UserResponse>) responseObserver);
                    break;
                case METHODID_GET_ALL_USERS:
                    serviceImpl.getAllUsers((com.example.grpc.GetAllUsersRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.GetAllUsersResponse>) responseObserver);
                    break;
                case METHODID_UPDATE_USER:
                    serviceImpl.updateUser((com.example.grpc.UpdateUserRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.UserResponse>) responseObserver);
                    break;
                case METHODID_DELETE_USER:
                    serviceImpl.deleteUser((com.example.grpc.DeleteUserRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.DeleteUserResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getCreateUserMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.grpc.CreateUserRequest, com.example.grpc.UserResponse>(service, METHODID_CREATE_USER))).addMethod(getGetUserMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.grpc.GetUserRequest, com.example.grpc.UserResponse>(service, METHODID_GET_USER))).addMethod(getGetAllUsersMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.grpc.GetAllUsersRequest, com.example.grpc.GetAllUsersResponse>(service, METHODID_GET_ALL_USERS))).addMethod(getUpdateUserMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.grpc.UpdateUserRequest, com.example.grpc.UserResponse>(service, METHODID_UPDATE_USER))).addMethod(getDeleteUserMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.grpc.DeleteUserRequest, com.example.grpc.DeleteUserResponse>(service, METHODID_DELETE_USER))).build();
    }

    private static abstract class UserServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        UserServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.example.grpc.UserProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("UserService");
        }
    }

    private static final class UserServiceFileDescriptorSupplier extends UserServiceBaseDescriptorSupplier {

        UserServiceFileDescriptorSupplier() {
        }
    }

    private static final class UserServiceMethodDescriptorSupplier extends UserServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (UserServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new UserServiceFileDescriptorSupplier()).addMethod(getCreateUserMethod()).addMethod(getGetUserMethod()).addMethod(getGetAllUsersMethod()).addMethod(getUpdateUserMethod()).addMethod(getDeleteUserMethod()).build();
                }
            }
        }
        return result;
    }
}
