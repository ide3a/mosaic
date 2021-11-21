// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zeromq_interact.proto

package org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf;

/**
 * Protobuf type {@code ZInteractSpace.ZVehicleUpdatesMinimal}
 */
public final class ZVehicleUpdatesMinimal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ZInteractSpace.ZVehicleUpdatesMinimal)
    ZVehicleUpdatesMinimalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ZVehicleUpdatesMinimal.newBuilder() to construct.
  private ZVehicleUpdatesMinimal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ZVehicleUpdatesMinimal() {
    updated_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ZVehicleUpdatesMinimal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ZVehicleUpdatesMinimal(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              updated_ = new java.util.ArrayList<org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal>();
              mutable_bitField0_ |= 0x00000001;
            }
            updated_.add(
                input.readMessage(org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        updated_ = java.util.Collections.unmodifiableList(updated_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZInteractProtos.internal_static_ZInteractSpace_ZVehicleUpdatesMinimal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZInteractProtos.internal_static_ZInteractSpace_ZVehicleUpdatesMinimal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal.class, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal.Builder.class);
  }

  public static final int UPDATED_FIELD_NUMBER = 1;
  private java.util.List<org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal> updated_;
  /**
   * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal> getUpdatedList() {
    return updated_;
  }
  /**
   * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimalOrBuilder> 
      getUpdatedOrBuilderList() {
    return updated_;
  }
  /**
   * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
   */
  @java.lang.Override
  public int getUpdatedCount() {
    return updated_.size();
  }
  /**
   * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
   */
  @java.lang.Override
  public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal getUpdated(int index) {
    return updated_.get(index);
  }
  /**
   * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
   */
  @java.lang.Override
  public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimalOrBuilder getUpdatedOrBuilder(
      int index) {
    return updated_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < updated_.size(); i++) {
      output.writeMessage(1, updated_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < updated_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, updated_.get(i));
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
    if (!(obj instanceof org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal)) {
      return super.equals(obj);
    }
    org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal other = (org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal) obj;

    if (!getUpdatedList()
        .equals(other.getUpdatedList())) return false;
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
    if (getUpdatedCount() > 0) {
      hash = (37 * hash) + UPDATED_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ZInteractSpace.ZVehicleUpdatesMinimal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ZInteractSpace.ZVehicleUpdatesMinimal)
      org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZInteractProtos.internal_static_ZInteractSpace_ZVehicleUpdatesMinimal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZInteractProtos.internal_static_ZInteractSpace_ZVehicleUpdatesMinimal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal.class, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal.Builder.class);
    }

    // Construct using org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getUpdatedFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updatedBuilder_ == null) {
        updated_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        updatedBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZInteractProtos.internal_static_ZInteractSpace_ZVehicleUpdatesMinimal_descriptor;
    }

    @java.lang.Override
    public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal getDefaultInstanceForType() {
      return org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal build() {
      org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal buildPartial() {
      org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal result = new org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal(this);
      int from_bitField0_ = bitField0_;
      if (updatedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          updated_ = java.util.Collections.unmodifiableList(updated_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.updated_ = updated_;
      } else {
        result.updated_ = updatedBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal) {
        return mergeFrom((org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal other) {
      if (other == org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal.getDefaultInstance()) return this;
      if (updatedBuilder_ == null) {
        if (!other.updated_.isEmpty()) {
          if (updated_.isEmpty()) {
            updated_ = other.updated_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUpdatedIsMutable();
            updated_.addAll(other.updated_);
          }
          onChanged();
        }
      } else {
        if (!other.updated_.isEmpty()) {
          if (updatedBuilder_.isEmpty()) {
            updatedBuilder_.dispose();
            updatedBuilder_ = null;
            updated_ = other.updated_;
            bitField0_ = (bitField0_ & ~0x00000001);
            updatedBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUpdatedFieldBuilder() : null;
          } else {
            updatedBuilder_.addAllMessages(other.updated_);
          }
        }
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
      org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal> updated_ =
      java.util.Collections.emptyList();
    private void ensureUpdatedIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        updated_ = new java.util.ArrayList<org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal>(updated_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimalOrBuilder> updatedBuilder_;

    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public java.util.List<org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal> getUpdatedList() {
      if (updatedBuilder_ == null) {
        return java.util.Collections.unmodifiableList(updated_);
      } else {
        return updatedBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public int getUpdatedCount() {
      if (updatedBuilder_ == null) {
        return updated_.size();
      } else {
        return updatedBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal getUpdated(int index) {
      if (updatedBuilder_ == null) {
        return updated_.get(index);
      } else {
        return updatedBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder setUpdated(
        int index, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal value) {
      if (updatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatedIsMutable();
        updated_.set(index, value);
        onChanged();
      } else {
        updatedBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder setUpdated(
        int index, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder builderForValue) {
      if (updatedBuilder_ == null) {
        ensureUpdatedIsMutable();
        updated_.set(index, builderForValue.build());
        onChanged();
      } else {
        updatedBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder addUpdated(org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal value) {
      if (updatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatedIsMutable();
        updated_.add(value);
        onChanged();
      } else {
        updatedBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder addUpdated(
        int index, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal value) {
      if (updatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatedIsMutable();
        updated_.add(index, value);
        onChanged();
      } else {
        updatedBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder addUpdated(
        org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder builderForValue) {
      if (updatedBuilder_ == null) {
        ensureUpdatedIsMutable();
        updated_.add(builderForValue.build());
        onChanged();
      } else {
        updatedBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder addUpdated(
        int index, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder builderForValue) {
      if (updatedBuilder_ == null) {
        ensureUpdatedIsMutable();
        updated_.add(index, builderForValue.build());
        onChanged();
      } else {
        updatedBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder addAllUpdated(
        java.lang.Iterable<? extends org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal> values) {
      if (updatedBuilder_ == null) {
        ensureUpdatedIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, updated_);
        onChanged();
      } else {
        updatedBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder clearUpdated() {
      if (updatedBuilder_ == null) {
        updated_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        updatedBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public Builder removeUpdated(int index) {
      if (updatedBuilder_ == null) {
        ensureUpdatedIsMutable();
        updated_.remove(index);
        onChanged();
      } else {
        updatedBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder getUpdatedBuilder(
        int index) {
      return getUpdatedFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimalOrBuilder getUpdatedOrBuilder(
        int index) {
      if (updatedBuilder_ == null) {
        return updated_.get(index);  } else {
        return updatedBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public java.util.List<? extends org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimalOrBuilder> 
         getUpdatedOrBuilderList() {
      if (updatedBuilder_ != null) {
        return updatedBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(updated_);
      }
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder addUpdatedBuilder() {
      return getUpdatedFieldBuilder().addBuilder(
          org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.getDefaultInstance());
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder addUpdatedBuilder(
        int index) {
      return getUpdatedFieldBuilder().addBuilder(
          index, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.getDefaultInstance());
    }
    /**
     * <code>repeated .ZInteractSpace.ZVehicleDataMinimal updated = 1;</code>
     */
    public java.util.List<org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder> 
         getUpdatedBuilderList() {
      return getUpdatedFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimalOrBuilder> 
        getUpdatedFieldBuilder() {
      if (updatedBuilder_ == null) {
        updatedBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimal.Builder, org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleDataMinimalOrBuilder>(
                updated_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        updated_ = null;
      }
      return updatedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ZInteractSpace.ZVehicleUpdatesMinimal)
  }

  // @@protoc_insertion_point(class_scope:ZInteractSpace.ZVehicleUpdatesMinimal)
  private static final org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal();
  }

  public static org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ZVehicleUpdatesMinimal>
      PARSER = new com.google.protobuf.AbstractParser<ZVehicleUpdatesMinimal>() {
    @java.lang.Override
    public ZVehicleUpdatesMinimal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ZVehicleUpdatesMinimal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ZVehicleUpdatesMinimal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ZVehicleUpdatesMinimal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.mosaic.fed.output.generator.zeromq.zprotobuf.ZVehicleUpdatesMinimal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
