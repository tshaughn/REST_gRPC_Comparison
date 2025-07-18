// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto
package com.example.grpc;

/**
 * Protobuf type {@code user.DeleteUserResponse}
 */
public final class DeleteUserResponse extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:user.DeleteUserResponse)
DeleteUserResponseOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use DeleteUserResponse.newBuilder() to construct.
    private DeleteUserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private DeleteUserResponse() {
        message_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new DeleteUserResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.example.grpc.UserProto.internal_static_user_DeleteUserResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.example.grpc.UserProto.internal_static_user_DeleteUserResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(com.example.grpc.DeleteUserResponse.class, com.example.grpc.DeleteUserResponse.Builder.class);
    }

    public static final int SUCCESS_FIELD_NUMBER = 1;

    private boolean success_ = false;

    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
        return success_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;

    @SuppressWarnings("serial")
    private volatile java.lang.Object message_ = "";

    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    @java.lang.Override
    public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            message_ = s;
            return s;
        }
    }

    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            message_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;
        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (success_ != false) {
            output.writeBool(1, success_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;
        size = 0;
        if (success_ != false) {
            size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, success_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.example.grpc.DeleteUserResponse)) {
            return super.equals(obj);
        }
        com.example.grpc.DeleteUserResponse other = (com.example.grpc.DeleteUserResponse) obj;
        if (getSuccess() != other.getSuccess())
            return false;
        if (!getMessage().equals(other.getMessage()))
            return false;
        if (!getUnknownFields().equals(other.getUnknownFields()))
            return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSuccess());
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.example.grpc.DeleteUserResponse parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.example.grpc.DeleteUserResponse parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.example.grpc.DeleteUserResponse parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.example.grpc.DeleteUserResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code user.DeleteUserResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:user.DeleteUserResponse)
    com.example.grpc.DeleteUserResponseOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.example.grpc.UserProto.internal_static_user_DeleteUserResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.example.grpc.UserProto.internal_static_user_DeleteUserResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(com.example.grpc.DeleteUserResponse.class, com.example.grpc.DeleteUserResponse.Builder.class);
        }

        // Construct using com.example.grpc.DeleteUserResponse.newBuilder()
        private Builder() {
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            success_ = false;
            message_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.example.grpc.UserProto.internal_static_user_DeleteUserResponse_descriptor;
        }

        @java.lang.Override
        public com.example.grpc.DeleteUserResponse getDefaultInstanceForType() {
            return com.example.grpc.DeleteUserResponse.getDefaultInstance();
        }

        @java.lang.Override
        public com.example.grpc.DeleteUserResponse build() {
            com.example.grpc.DeleteUserResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.example.grpc.DeleteUserResponse buildPartial() {
            com.example.grpc.DeleteUserResponse result = new com.example.grpc.DeleteUserResponse(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(com.example.grpc.DeleteUserResponse result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.success_ = success_;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.message_ = message_;
            }
        }

        @java.lang.Override
        public Builder clone() {
            return super.clone();
        }

        @java.lang.Override
        public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.example.grpc.DeleteUserResponse) {
                return mergeFrom((com.example.grpc.DeleteUserResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.example.grpc.DeleteUserResponse other) {
            if (other == com.example.grpc.DeleteUserResponse.getDefaultInstance())
                return this;
            if (other.getSuccess() != false) {
                setSuccess(other.getSuccess());
            }
            if (!other.getMessage().isEmpty()) {
                message_ = other.message_;
                bitField0_ |= 0x00000002;
                onChanged();
            }
            this.mergeUnknownFields(other.getUnknownFields());
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch(tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            {
                                success_ = input.readBool();
                                bitField0_ |= 0x00000001;
                                break;
                            }
                        // case 8
                        case 18:
                            {
                                message_ = input.readStringRequireUtf8();
                                bitField0_ |= 0x00000002;
                                break;
                            }
                        // case 18
                        default:
                            {
                                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                    // was an endgroup tag
                                    done = true;
                                }
                                break;
                            }
                    }
                    // switch (tag)
                }
                // while (!done)
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.unwrapIOException();
            } finally {
                onChanged();
            }
            // finally
            return this;
        }

        private int bitField0_;

        private boolean success_;

        /**
         * <code>bool success = 1;</code>
         * @return The success.
         */
        @java.lang.Override
        public boolean getSuccess() {
            return success_;
        }

        /**
         * <code>bool success = 1;</code>
         * @param value The success to set.
         * @return This builder for chaining.
         */
        public Builder setSuccess(boolean value) {
            success_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>bool success = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearSuccess() {
            bitField0_ = (bitField0_ & ~0x00000001);
            success_ = false;
            onChanged();
            return this;
        }

        private java.lang.Object message_ = "";

        /**
         * <code>string message = 2;</code>
         * @return The message.
         */
        public java.lang.String getMessage() {
            java.lang.Object ref = message_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                message_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string message = 2;</code>
         * @return The bytes for message.
         */
        public com.google.protobuf.ByteString getMessageBytes() {
            java.lang.Object ref = message_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string message = 2;</code>
         * @param value The message to set.
         * @return This builder for chaining.
         */
        public Builder setMessage(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            message_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>string message = 2;</code>
         * @return This builder for chaining.
         */
        public Builder clearMessage() {
            message_ = getDefaultInstance().getMessage();
            bitField0_ = (bitField0_ & ~0x00000002);
            onChanged();
            return this;
        }

        /**
         * <code>string message = 2;</code>
         * @param value The bytes for message to set.
         * @return This builder for chaining.
         */
        public Builder setMessageBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            message_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }
        // @@protoc_insertion_point(builder_scope:user.DeleteUserResponse)
    }

    // @@protoc_insertion_point(class_scope:user.DeleteUserResponse)
    private static final com.example.grpc.DeleteUserResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new com.example.grpc.DeleteUserResponse();
    }

    public static com.example.grpc.DeleteUserResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeleteUserResponse> PARSER = new com.google.protobuf.AbstractParser<DeleteUserResponse>() {

        @java.lang.Override
        public DeleteUserResponse parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            Builder builder = newBuilder();
            try {
                builder.mergeFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
            } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(builder.buildPartial());
            }
            return builder.buildPartial();
        }
    };

    public static com.google.protobuf.Parser<DeleteUserResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeleteUserResponse> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.example.grpc.DeleteUserResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
