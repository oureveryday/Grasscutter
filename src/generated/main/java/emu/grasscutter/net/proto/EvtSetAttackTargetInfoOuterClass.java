// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtSetAttackTargetInfo.proto

package emu.grasscutter.net.proto;

public final class EvtSetAttackTargetInfoOuterClass {
    private EvtSetAttackTargetInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface EvtSetAttackTargetInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:EvtSetAttackTargetInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 attack_target_id = 15;</code>
         *
         * @return The attackTargetId.
         */
        int getAttackTargetId();

        /**
         * <code>uint32 select_point_index = 5;</code>
         *
         * @return The selectPointIndex.
         */
        int getSelectPointIndex();

        /**
         * <code>uint32 entity_id = 1;</code>
         *
         * @return The entityId.
         */
        int getEntityId();
    }
    /**
     *
     *
     * <pre>
     * Handcrafted by Magix!
     * </pre>
     *
     * Protobuf type {@code EvtSetAttackTargetInfo}
     */
    public static final class EvtSetAttackTargetInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:EvtSetAttackTargetInfo)
            EvtSetAttackTargetInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use EvtSetAttackTargetInfo.newBuilder() to construct.
        private EvtSetAttackTargetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private EvtSetAttackTargetInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new EvtSetAttackTargetInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EvtSetAttackTargetInfo(
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
                        case 8:
                            {
                                entityId_ = input.readUInt32();
                                break;
                            }
                        case 40:
                            {
                                selectPointIndex_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                attackTargetId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass
                    .internal_static_EvtSetAttackTargetInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass
                    .internal_static_EvtSetAttackTargetInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                                    .class,
                            emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                                    .Builder.class);
        }

        public static final int ATTACK_TARGET_ID_FIELD_NUMBER = 15;
        private int attackTargetId_;
        /**
         * <code>uint32 attack_target_id = 15;</code>
         *
         * @return The attackTargetId.
         */
        @java.lang.Override
        public int getAttackTargetId() {
            return attackTargetId_;
        }

        public static final int SELECT_POINT_INDEX_FIELD_NUMBER = 5;
        private int selectPointIndex_;
        /**
         * <code>uint32 select_point_index = 5;</code>
         *
         * @return The selectPointIndex.
         */
        @java.lang.Override
        public int getSelectPointIndex() {
            return selectPointIndex_;
        }

        public static final int ENTITY_ID_FIELD_NUMBER = 1;
        private int entityId_;
        /**
         * <code>uint32 entity_id = 1;</code>
         *
         * @return The entityId.
         */
        @java.lang.Override
        public int getEntityId() {
            return entityId_;
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
            if (entityId_ != 0) {
                output.writeUInt32(1, entityId_);
            }
            if (selectPointIndex_ != 0) {
                output.writeUInt32(5, selectPointIndex_);
            }
            if (attackTargetId_ != 0) {
                output.writeUInt32(15, attackTargetId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (entityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, entityId_);
            }
            if (selectPointIndex_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, selectPointIndex_);
            }
            if (attackTargetId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, attackTargetId_);
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
                    emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo other =
                    (emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo) obj;

            if (getAttackTargetId() != other.getAttackTargetId()) return false;
            if (getSelectPointIndex() != other.getSelectPointIndex()) return false;
            if (getEntityId() != other.getEntityId()) return false;
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
            hash = (37 * hash) + ATTACK_TARGET_ID_FIELD_NUMBER;
            hash = (53 * hash) + getAttackTargetId();
            hash = (37 * hash) + SELECT_POINT_INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getSelectPointIndex();
            hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getEntityId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
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
                emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
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
         * Handcrafted by Magix!
         * </pre>
         *
         * Protobuf type {@code EvtSetAttackTargetInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:EvtSetAttackTargetInfo)
                emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass
                        .internal_static_EvtSetAttackTargetInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass
                        .internal_static_EvtSetAttackTargetInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                                        .class,
                                emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.newBuilder()
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
                attackTargetId_ = 0;

                selectPointIndex_ = 0;

                entityId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass
                        .internal_static_EvtSetAttackTargetInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                    build() {
                emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                    buildPartial() {
                emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo result =
                        new emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo(
                                this);
                result.attackTargetId_ = attackTargetId_;
                result.selectPointIndex_ = selectPointIndex_;
                result.entityId_ = entityId_;
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
                        emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo other) {
                if (other
                        == emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                                .getDefaultInstance()) return this;
                if (other.getAttackTargetId() != 0) {
                    setAttackTargetId(other.getAttackTargetId());
                }
                if (other.getSelectPointIndex() != 0) {
                    setSelectPointIndex(other.getSelectPointIndex());
                }
                if (other.getEntityId() != 0) {
                    setEntityId(other.getEntityId());
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
                emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int attackTargetId_;
            /**
             * <code>uint32 attack_target_id = 15;</code>
             *
             * @return The attackTargetId.
             */
            @java.lang.Override
            public int getAttackTargetId() {
                return attackTargetId_;
            }
            /**
             * <code>uint32 attack_target_id = 15;</code>
             *
             * @param value The attackTargetId to set.
             * @return This builder for chaining.
             */
            public Builder setAttackTargetId(int value) {

                attackTargetId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 attack_target_id = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAttackTargetId() {

                attackTargetId_ = 0;
                onChanged();
                return this;
            }

            private int selectPointIndex_;
            /**
             * <code>uint32 select_point_index = 5;</code>
             *
             * @return The selectPointIndex.
             */
            @java.lang.Override
            public int getSelectPointIndex() {
                return selectPointIndex_;
            }
            /**
             * <code>uint32 select_point_index = 5;</code>
             *
             * @param value The selectPointIndex to set.
             * @return This builder for chaining.
             */
            public Builder setSelectPointIndex(int value) {

                selectPointIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 select_point_index = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSelectPointIndex() {

                selectPointIndex_ = 0;
                onChanged();
                return this;
            }

            private int entityId_;
            /**
             * <code>uint32 entity_id = 1;</code>
             *
             * @return The entityId.
             */
            @java.lang.Override
            public int getEntityId() {
                return entityId_;
            }
            /**
             * <code>uint32 entity_id = 1;</code>
             *
             * @param value The entityId to set.
             * @return This builder for chaining.
             */
            public Builder setEntityId(int value) {

                entityId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 entity_id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntityId() {

                entityId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:EvtSetAttackTargetInfo)
        }

        // @@protoc_insertion_point(class_scope:EvtSetAttackTargetInfo)
        private static final emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass
                        .EvtSetAttackTargetInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo();
        }

        public static emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<EvtSetAttackTargetInfo> PARSER =
                new com.google.protobuf.AbstractParser<EvtSetAttackTargetInfo>() {
                    @java.lang.Override
                    public EvtSetAttackTargetInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new EvtSetAttackTargetInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<EvtSetAttackTargetInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<EvtSetAttackTargetInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_EvtSetAttackTargetInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_EvtSetAttackTargetInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\034EvtSetAttackTargetInfo.proto\"a\n\026EvtSet"
                    + "AttackTargetInfo\022\030\n\020attack_target_id\030\017 \001"
                    + "(\r\022\032\n\022select_point_index\030\005 \001(\r\022\021\n\tentity"
                    + "_id\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006"
                    + "proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_EvtSetAttackTargetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EvtSetAttackTargetInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_EvtSetAttackTargetInfo_descriptor,
                        new java.lang.String[] {
                            "AttackTargetId", "SelectPointIndex", "EntityId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
