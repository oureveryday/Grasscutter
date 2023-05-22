// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PacmanSettleInfo.proto

package emu.grasscutter.net.proto;

public final class PacmanSettleInfoOuterClass {
    private PacmanSettleInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface PacmanSettleInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:PacmanSettleInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 final_score = 1;</code>
         *
         * @return The finalScore.
         */
        int getFinalScore();

        /**
         * <code>uint32 FJBKBMHJMMM = 9;</code>
         *
         * @return The fJBKBMHJMMM.
         */
        int getFJBKBMHJMMM();

        /**
         * <code>.FEEHAOJCNCG reason = 13;</code>
         *
         * @return The enum numeric value on the wire for reason.
         */
        int getReasonValue();
        /**
         * <code>.FEEHAOJCNCG reason = 13;</code>
         *
         * @return The reason.
         */
        emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG getReason();

        /**
         * <code>bool is_new_record = 3;</code>
         *
         * @return The isNewRecord.
         */
        boolean getIsNewRecord();

        /**
         * <code>uint32 BKECHEIMCGP = 5;</code>
         *
         * @return The bKECHEIMCGP.
         */
        int getBKECHEIMCGP();
    }
    /**
     *
     *
     * <pre>
     * Name: EMLPIPHPEBM
     * </pre>
     *
     * Protobuf type {@code PacmanSettleInfo}
     */
    public static final class PacmanSettleInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:PacmanSettleInfo)
            PacmanSettleInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use PacmanSettleInfo.newBuilder() to construct.
        private PacmanSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private PacmanSettleInfo() {
            reason_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new PacmanSettleInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PacmanSettleInfo(
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
                                finalScore_ = input.readUInt32();
                                break;
                            }
                        case 24:
                            {
                                isNewRecord_ = input.readBool();
                                break;
                            }
                        case 40:
                            {
                                bKECHEIMCGP_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                fJBKBMHJMMM_ = input.readUInt32();
                                break;
                            }
                        case 104:
                            {
                                int rawValue = input.readEnum();

                                reason_ = rawValue;
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
            return emu.grasscutter.net.proto.PacmanSettleInfoOuterClass
                    .internal_static_PacmanSettleInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.PacmanSettleInfoOuterClass
                    .internal_static_PacmanSettleInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo.class,
                            emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo.Builder.class);
        }

        public static final int FINAL_SCORE_FIELD_NUMBER = 1;
        private int finalScore_;
        /**
         * <code>uint32 final_score = 1;</code>
         *
         * @return The finalScore.
         */
        @java.lang.Override
        public int getFinalScore() {
            return finalScore_;
        }

        public static final int FJBKBMHJMMM_FIELD_NUMBER = 9;
        private int fJBKBMHJMMM_;
        /**
         * <code>uint32 FJBKBMHJMMM = 9;</code>
         *
         * @return The fJBKBMHJMMM.
         */
        @java.lang.Override
        public int getFJBKBMHJMMM() {
            return fJBKBMHJMMM_;
        }

        public static final int REASON_FIELD_NUMBER = 13;
        private int reason_;
        /**
         * <code>.FEEHAOJCNCG reason = 13;</code>
         *
         * @return The enum numeric value on the wire for reason.
         */
        @java.lang.Override
        public int getReasonValue() {
            return reason_;
        }
        /**
         * <code>.FEEHAOJCNCG reason = 13;</code>
         *
         * @return The reason.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG getReason() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG result =
                    emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG.valueOf(reason_);
            return result == null
                    ? emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG.UNRECOGNIZED
                    : result;
        }

        public static final int IS_NEW_RECORD_FIELD_NUMBER = 3;
        private boolean isNewRecord_;
        /**
         * <code>bool is_new_record = 3;</code>
         *
         * @return The isNewRecord.
         */
        @java.lang.Override
        public boolean getIsNewRecord() {
            return isNewRecord_;
        }

        public static final int BKECHEIMCGP_FIELD_NUMBER = 5;
        private int bKECHEIMCGP_;
        /**
         * <code>uint32 BKECHEIMCGP = 5;</code>
         *
         * @return The bKECHEIMCGP.
         */
        @java.lang.Override
        public int getBKECHEIMCGP() {
            return bKECHEIMCGP_;
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
            if (finalScore_ != 0) {
                output.writeUInt32(1, finalScore_);
            }
            if (isNewRecord_ != false) {
                output.writeBool(3, isNewRecord_);
            }
            if (bKECHEIMCGP_ != 0) {
                output.writeUInt32(5, bKECHEIMCGP_);
            }
            if (fJBKBMHJMMM_ != 0) {
                output.writeUInt32(9, fJBKBMHJMMM_);
            }
            if (reason_
                    != emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG
                            .FEEHAOJCNCG_PACMAN_DUNGEON_STOP_NONE.getNumber()) {
                output.writeEnum(13, reason_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (finalScore_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, finalScore_);
            }
            if (isNewRecord_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, isNewRecord_);
            }
            if (bKECHEIMCGP_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, bKECHEIMCGP_);
            }
            if (fJBKBMHJMMM_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, fJBKBMHJMMM_);
            }
            if (reason_
                    != emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG
                            .FEEHAOJCNCG_PACMAN_DUNGEON_STOP_NONE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(13, reason_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo other =
                    (emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo) obj;

            if (getFinalScore() != other.getFinalScore()) return false;
            if (getFJBKBMHJMMM() != other.getFJBKBMHJMMM()) return false;
            if (reason_ != other.reason_) return false;
            if (getIsNewRecord() != other.getIsNewRecord()) return false;
            if (getBKECHEIMCGP() != other.getBKECHEIMCGP()) return false;
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
            hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
            hash = (53 * hash) + getFinalScore();
            hash = (37 * hash) + FJBKBMHJMMM_FIELD_NUMBER;
            hash = (53 * hash) + getFJBKBMHJMMM();
            hash = (37 * hash) + REASON_FIELD_NUMBER;
            hash = (53 * hash) + reason_;
            hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsNewRecord());
            hash = (37 * hash) + BKECHEIMCGP_FIELD_NUMBER;
            hash = (53 * hash) + getBKECHEIMCGP();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parseFrom(
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
                emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo prototype) {
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
         * Name: EMLPIPHPEBM
         * </pre>
         *
         * Protobuf type {@code PacmanSettleInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:PacmanSettleInfo)
                emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.PacmanSettleInfoOuterClass
                        .internal_static_PacmanSettleInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.PacmanSettleInfoOuterClass
                        .internal_static_PacmanSettleInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo.class,
                                emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo.newBuilder()
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
                finalScore_ = 0;

                fJBKBMHJMMM_ = 0;

                reason_ = 0;

                isNewRecord_ = false;

                bKECHEIMCGP_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.PacmanSettleInfoOuterClass
                        .internal_static_PacmanSettleInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo build() {
                emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo buildPartial() {
                emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo result =
                        new emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo(this);
                result.finalScore_ = finalScore_;
                result.fJBKBMHJMMM_ = fJBKBMHJMMM_;
                result.reason_ = reason_;
                result.isNewRecord_ = isNewRecord_;
                result.bKECHEIMCGP_ = bKECHEIMCGP_;
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
                        instanceof emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo other) {
                if (other
                        == emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo
                                .getDefaultInstance()) return this;
                if (other.getFinalScore() != 0) {
                    setFinalScore(other.getFinalScore());
                }
                if (other.getFJBKBMHJMMM() != 0) {
                    setFJBKBMHJMMM(other.getFJBKBMHJMMM());
                }
                if (other.reason_ != 0) {
                    setReasonValue(other.getReasonValue());
                }
                if (other.getIsNewRecord() != false) {
                    setIsNewRecord(other.getIsNewRecord());
                }
                if (other.getBKECHEIMCGP() != 0) {
                    setBKECHEIMCGP(other.getBKECHEIMCGP());
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
                emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int finalScore_;
            /**
             * <code>uint32 final_score = 1;</code>
             *
             * @return The finalScore.
             */
            @java.lang.Override
            public int getFinalScore() {
                return finalScore_;
            }
            /**
             * <code>uint32 final_score = 1;</code>
             *
             * @param value The finalScore to set.
             * @return This builder for chaining.
             */
            public Builder setFinalScore(int value) {

                finalScore_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 final_score = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFinalScore() {

                finalScore_ = 0;
                onChanged();
                return this;
            }

            private int fJBKBMHJMMM_;
            /**
             * <code>uint32 FJBKBMHJMMM = 9;</code>
             *
             * @return The fJBKBMHJMMM.
             */
            @java.lang.Override
            public int getFJBKBMHJMMM() {
                return fJBKBMHJMMM_;
            }
            /**
             * <code>uint32 FJBKBMHJMMM = 9;</code>
             *
             * @param value The fJBKBMHJMMM to set.
             * @return This builder for chaining.
             */
            public Builder setFJBKBMHJMMM(int value) {

                fJBKBMHJMMM_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 FJBKBMHJMMM = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFJBKBMHJMMM() {

                fJBKBMHJMMM_ = 0;
                onChanged();
                return this;
            }

            private int reason_ = 0;
            /**
             * <code>.FEEHAOJCNCG reason = 13;</code>
             *
             * @return The enum numeric value on the wire for reason.
             */
            @java.lang.Override
            public int getReasonValue() {
                return reason_;
            }
            /**
             * <code>.FEEHAOJCNCG reason = 13;</code>
             *
             * @param value The enum numeric value on the wire for reason to set.
             * @return This builder for chaining.
             */
            public Builder setReasonValue(int value) {

                reason_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.FEEHAOJCNCG reason = 13;</code>
             *
             * @return The reason.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG getReason() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG result =
                        emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG.valueOf(reason_);
                return result == null
                        ? emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG.UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.FEEHAOJCNCG reason = 13;</code>
             *
             * @param value The reason to set.
             * @return This builder for chaining.
             */
            public Builder setReason(emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.FEEHAOJCNCG value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                reason_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.FEEHAOJCNCG reason = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearReason() {

                reason_ = 0;
                onChanged();
                return this;
            }

            private boolean isNewRecord_;
            /**
             * <code>bool is_new_record = 3;</code>
             *
             * @return The isNewRecord.
             */
            @java.lang.Override
            public boolean getIsNewRecord() {
                return isNewRecord_;
            }
            /**
             * <code>bool is_new_record = 3;</code>
             *
             * @param value The isNewRecord to set.
             * @return This builder for chaining.
             */
            public Builder setIsNewRecord(boolean value) {

                isNewRecord_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_new_record = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsNewRecord() {

                isNewRecord_ = false;
                onChanged();
                return this;
            }

            private int bKECHEIMCGP_;
            /**
             * <code>uint32 BKECHEIMCGP = 5;</code>
             *
             * @return The bKECHEIMCGP.
             */
            @java.lang.Override
            public int getBKECHEIMCGP() {
                return bKECHEIMCGP_;
            }
            /**
             * <code>uint32 BKECHEIMCGP = 5;</code>
             *
             * @param value The bKECHEIMCGP to set.
             * @return This builder for chaining.
             */
            public Builder setBKECHEIMCGP(int value) {

                bKECHEIMCGP_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 BKECHEIMCGP = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBKECHEIMCGP() {

                bKECHEIMCGP_ = 0;
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

            // @@protoc_insertion_point(builder_scope:PacmanSettleInfo)
        }

        // @@protoc_insertion_point(class_scope:PacmanSettleInfo)
        private static final emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo();
        }

        public static emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<PacmanSettleInfo> PARSER =
                new com.google.protobuf.AbstractParser<PacmanSettleInfo>() {
                    @java.lang.Override
                    public PacmanSettleInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PacmanSettleInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<PacmanSettleInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<PacmanSettleInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.PacmanSettleInfoOuterClass.PacmanSettleInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_PacmanSettleInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_PacmanSettleInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\026PacmanSettleInfo.proto\032\021FEEHAOJCNCG.pr"
                    + "oto\"\206\001\n\020PacmanSettleInfo\022\023\n\013final_score\030"
                    + "\001 \001(\r\022\023\n\013FJBKBMHJMMM\030\t \001(\r\022\034\n\006reason\030\r \001"
                    + "(\0162\014.FEEHAOJCNCG\022\025\n\ris_new_record\030\003 \001(\010\022"
                    + "\023\n\013BKECHEIMCGP\030\005 \001(\rB!\n\031emu.grasscutter."
                    + "net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.getDescriptor(),
                        });
        internal_static_PacmanSettleInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PacmanSettleInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_PacmanSettleInfo_descriptor,
                        new java.lang.String[] {
                            "FinalScore", "FJBKBMHJMMM", "Reason", "IsNewRecord", "BKECHEIMCGP",
                        });
        emu.grasscutter.net.proto.FEEHAOJCNCGOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
