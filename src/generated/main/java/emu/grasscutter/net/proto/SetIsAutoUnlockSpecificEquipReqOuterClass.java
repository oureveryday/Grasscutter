// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetIsAutoUnlockSpecificEquipReq.proto

package emu.grasscutter.net.proto;

public final class SetIsAutoUnlockSpecificEquipReqOuterClass {
    private SetIsAutoUnlockSpecificEquipReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface SetIsAutoUnlockSpecificEquipReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:SetIsAutoUnlockSpecificEquipReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool is_auto_unlock_specific_equip = 14;</code>
         *
         * @return The isAutoUnlockSpecificEquip.
         */
        boolean getIsAutoUnlockSpecificEquip();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 636
     * Name: OBLLFNIAALA
     * </pre>
     *
     * Protobuf type {@code SetIsAutoUnlockSpecificEquipReq}
     */
    public static final class SetIsAutoUnlockSpecificEquipReq
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:SetIsAutoUnlockSpecificEquipReq)
            SetIsAutoUnlockSpecificEquipReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use SetIsAutoUnlockSpecificEquipReq.newBuilder() to construct.
        private SetIsAutoUnlockSpecificEquipReq(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SetIsAutoUnlockSpecificEquipReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new SetIsAutoUnlockSpecificEquipReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private SetIsAutoUnlockSpecificEquipReq(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 112:
                            {
                                isAutoUnlockSpecificEquip_ = input.readBool();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                    .internal_static_SetIsAutoUnlockSpecificEquipReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                    .internal_static_SetIsAutoUnlockSpecificEquipReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                    .SetIsAutoUnlockSpecificEquipReq.class,
                            emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                    .SetIsAutoUnlockSpecificEquipReq.Builder.class);
        }

        public static final int IS_AUTO_UNLOCK_SPECIFIC_EQUIP_FIELD_NUMBER = 14;
        private boolean isAutoUnlockSpecificEquip_;
        /**
         * <code>bool is_auto_unlock_specific_equip = 14;</code>
         *
         * @return The isAutoUnlockSpecificEquip.
         */
        @java.lang.Override
        public boolean getIsAutoUnlockSpecificEquip() {
            return isAutoUnlockSpecificEquip_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (isAutoUnlockSpecificEquip_ != false) {
                output.writeBool(14, isAutoUnlockSpecificEquip_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isAutoUnlockSpecificEquip_ != false) {
                size +=
                        com.google.protobuf.CodedOutputStream.computeBoolSize(14, isAutoUnlockSpecificEquip_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                            .SetIsAutoUnlockSpecificEquipReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                            .SetIsAutoUnlockSpecificEquipReq
                    other =
                            (emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                            .SetIsAutoUnlockSpecificEquipReq)
                                    obj;

            if (getIsAutoUnlockSpecificEquip() != other.getIsAutoUnlockSpecificEquip()) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + IS_AUTO_UNLOCK_SPECIFIC_EQUIP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsAutoUnlockSpecificEquip());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                .SetIsAutoUnlockSpecificEquipReq
                        prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * CmdId: 636
         * Name: OBLLFNIAALA
         * </pre>
         *
         * Protobuf type {@code SetIsAutoUnlockSpecificEquipReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:SetIsAutoUnlockSpecificEquipReq)
                emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .internal_static_SetIsAutoUnlockSpecificEquipReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .internal_static_SetIsAutoUnlockSpecificEquipReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                        .SetIsAutoUnlockSpecificEquipReq.class,
                                emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                        .SetIsAutoUnlockSpecificEquipReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass.SetIsAutoUnlockSpecificEquipReq.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                isAutoUnlockSpecificEquip_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .internal_static_SetIsAutoUnlockSpecificEquipReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                            .SetIsAutoUnlockSpecificEquipReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                            .SetIsAutoUnlockSpecificEquipReq
                    build() {
                emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                .SetIsAutoUnlockSpecificEquipReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                            .SetIsAutoUnlockSpecificEquipReq
                    buildPartial() {
                emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                .SetIsAutoUnlockSpecificEquipReq
                        result =
                                new emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                        .SetIsAutoUnlockSpecificEquipReq(this);
                result.isAutoUnlockSpecificEquip_ = isAutoUnlockSpecificEquip_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
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
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                .SetIsAutoUnlockSpecificEquipReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                            .SetIsAutoUnlockSpecificEquipReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                    .SetIsAutoUnlockSpecificEquipReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                .SetIsAutoUnlockSpecificEquipReq.getDefaultInstance()) return this;
                if (other.getIsAutoUnlockSpecificEquip() != false) {
                    setIsAutoUnlockSpecificEquip(other.getIsAutoUnlockSpecificEquip());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                .SetIsAutoUnlockSpecificEquipReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                                            .SetIsAutoUnlockSpecificEquipReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean isAutoUnlockSpecificEquip_;
            /**
             * <code>bool is_auto_unlock_specific_equip = 14;</code>
             *
             * @return The isAutoUnlockSpecificEquip.
             */
            @java.lang.Override
            public boolean getIsAutoUnlockSpecificEquip() {
                return isAutoUnlockSpecificEquip_;
            }
            /**
             * <code>bool is_auto_unlock_specific_equip = 14;</code>
             *
             * @param value The isAutoUnlockSpecificEquip to set.
             * @return This builder for chaining.
             */
            public Builder setIsAutoUnlockSpecificEquip(boolean value) {

                isAutoUnlockSpecificEquip_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_auto_unlock_specific_equip = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsAutoUnlockSpecificEquip() {

                isAutoUnlockSpecificEquip_ = false;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:SetIsAutoUnlockSpecificEquipReq)
        }

        // @@protoc_insertion_point(class_scope:SetIsAutoUnlockSpecificEquipReq)
        private static final emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                            .SetIsAutoUnlockSpecificEquipReq();
        }

        public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SetIsAutoUnlockSpecificEquipReq> PARSER =
                new com.google.protobuf.AbstractParser<SetIsAutoUnlockSpecificEquipReq>() {
                    @java.lang.Override
                    public SetIsAutoUnlockSpecificEquipReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SetIsAutoUnlockSpecificEquipReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<SetIsAutoUnlockSpecificEquipReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SetIsAutoUnlockSpecificEquipReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipReqOuterClass
                        .SetIsAutoUnlockSpecificEquipReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_SetIsAutoUnlockSpecificEquipReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_SetIsAutoUnlockSpecificEquipReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n%SetIsAutoUnlockSpecificEquipReq.proto\""
                    + "H\n\037SetIsAutoUnlockSpecificEquipReq\022%\n\035is"
                    + "_auto_unlock_specific_equip\030\016 \001(\010B!\n\031emu"
                    + ".grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_SetIsAutoUnlockSpecificEquipReq_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_SetIsAutoUnlockSpecificEquipReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_SetIsAutoUnlockSpecificEquipReq_descriptor,
                        new java.lang.String[] {
                            "IsAutoUnlockSpecificEquip",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
