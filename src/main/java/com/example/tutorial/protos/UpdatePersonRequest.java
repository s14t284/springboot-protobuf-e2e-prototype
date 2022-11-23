// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package com.example.tutorial.protos;

/**
 * <pre>
 * 人物情報を更新するリクエスト
 * </pre>
 *
 * Protobuf type {@code tutorial.UpdatePersonRequest}
 */
public final class UpdatePersonRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.UpdatePersonRequest)
    UpdatePersonRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePersonRequest.newBuilder() to construct.
  private UpdatePersonRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePersonRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePersonRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdatePersonRequest(
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
          case 10: {
            com.example.tutorial.protos.Person.Builder subBuilder = null;
            if (person_ != null) {
              subBuilder = person_.toBuilder();
            }
            person_ = input.readMessage(com.example.tutorial.protos.Person.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(person_);
              person_ = subBuilder.buildPartial();
            }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.tutorial.protos.AddressBookProtos.internal_static_tutorial_UpdatePersonRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.tutorial.protos.AddressBookProtos.internal_static_tutorial_UpdatePersonRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.tutorial.protos.UpdatePersonRequest.class, com.example.tutorial.protos.UpdatePersonRequest.Builder.class);
  }

  public static final int PERSON_FIELD_NUMBER = 1;
  private com.example.tutorial.protos.Person person_;
  /**
   * <code>.tutorial.Person person = 1;</code>
   * @return Whether the person field is set.
   */
  @java.lang.Override
  public boolean hasPerson() {
    return person_ != null;
  }
  /**
   * <code>.tutorial.Person person = 1;</code>
   * @return The person.
   */
  @java.lang.Override
  public com.example.tutorial.protos.Person getPerson() {
    return person_ == null ? com.example.tutorial.protos.Person.getDefaultInstance() : person_;
  }
  /**
   * <code>.tutorial.Person person = 1;</code>
   */
  @java.lang.Override
  public com.example.tutorial.protos.PersonOrBuilder getPersonOrBuilder() {
    return getPerson();
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
    if (person_ != null) {
      output.writeMessage(1, getPerson());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (person_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPerson());
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
    if (!(obj instanceof com.example.tutorial.protos.UpdatePersonRequest)) {
      return super.equals(obj);
    }
    com.example.tutorial.protos.UpdatePersonRequest other = (com.example.tutorial.protos.UpdatePersonRequest) obj;

    if (hasPerson() != other.hasPerson()) return false;
    if (hasPerson()) {
      if (!getPerson()
          .equals(other.getPerson())) return false;
    }
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
    if (hasPerson()) {
      hash = (37 * hash) + PERSON_FIELD_NUMBER;
      hash = (53 * hash) + getPerson().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.tutorial.protos.UpdatePersonRequest parseFrom(
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
  public static Builder newBuilder(com.example.tutorial.protos.UpdatePersonRequest prototype) {
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
   * <pre>
   * 人物情報を更新するリクエスト
   * </pre>
   *
   * Protobuf type {@code tutorial.UpdatePersonRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.UpdatePersonRequest)
      com.example.tutorial.protos.UpdatePersonRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.tutorial.protos.AddressBookProtos.internal_static_tutorial_UpdatePersonRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.tutorial.protos.AddressBookProtos.internal_static_tutorial_UpdatePersonRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.tutorial.protos.UpdatePersonRequest.class, com.example.tutorial.protos.UpdatePersonRequest.Builder.class);
    }

    // Construct using com.example.tutorial.protos.UpdatePersonRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (personBuilder_ == null) {
        person_ = null;
      } else {
        person_ = null;
        personBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.tutorial.protos.AddressBookProtos.internal_static_tutorial_UpdatePersonRequest_descriptor;
    }

    @java.lang.Override
    public com.example.tutorial.protos.UpdatePersonRequest getDefaultInstanceForType() {
      return com.example.tutorial.protos.UpdatePersonRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.tutorial.protos.UpdatePersonRequest build() {
      com.example.tutorial.protos.UpdatePersonRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.tutorial.protos.UpdatePersonRequest buildPartial() {
      com.example.tutorial.protos.UpdatePersonRequest result = new com.example.tutorial.protos.UpdatePersonRequest(this);
      if (personBuilder_ == null) {
        result.person_ = person_;
      } else {
        result.person_ = personBuilder_.build();
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
      if (other instanceof com.example.tutorial.protos.UpdatePersonRequest) {
        return mergeFrom((com.example.tutorial.protos.UpdatePersonRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.tutorial.protos.UpdatePersonRequest other) {
      if (other == com.example.tutorial.protos.UpdatePersonRequest.getDefaultInstance()) return this;
      if (other.hasPerson()) {
        mergePerson(other.getPerson());
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
      com.example.tutorial.protos.UpdatePersonRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.tutorial.protos.UpdatePersonRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.tutorial.protos.Person person_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.tutorial.protos.Person, com.example.tutorial.protos.Person.Builder, com.example.tutorial.protos.PersonOrBuilder> personBuilder_;
    /**
     * <code>.tutorial.Person person = 1;</code>
     * @return Whether the person field is set.
     */
    public boolean hasPerson() {
      return personBuilder_ != null || person_ != null;
    }
    /**
     * <code>.tutorial.Person person = 1;</code>
     * @return The person.
     */
    public com.example.tutorial.protos.Person getPerson() {
      if (personBuilder_ == null) {
        return person_ == null ? com.example.tutorial.protos.Person.getDefaultInstance() : person_;
      } else {
        return personBuilder_.getMessage();
      }
    }
    /**
     * <code>.tutorial.Person person = 1;</code>
     */
    public Builder setPerson(com.example.tutorial.protos.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        person_ = value;
        onChanged();
      } else {
        personBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tutorial.Person person = 1;</code>
     */
    public Builder setPerson(
        com.example.tutorial.protos.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        person_ = builderForValue.build();
        onChanged();
      } else {
        personBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tutorial.Person person = 1;</code>
     */
    public Builder mergePerson(com.example.tutorial.protos.Person value) {
      if (personBuilder_ == null) {
        if (person_ != null) {
          person_ =
            com.example.tutorial.protos.Person.newBuilder(person_).mergeFrom(value).buildPartial();
        } else {
          person_ = value;
        }
        onChanged();
      } else {
        personBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tutorial.Person person = 1;</code>
     */
    public Builder clearPerson() {
      if (personBuilder_ == null) {
        person_ = null;
        onChanged();
      } else {
        person_ = null;
        personBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tutorial.Person person = 1;</code>
     */
    public com.example.tutorial.protos.Person.Builder getPersonBuilder() {
      
      onChanged();
      return getPersonFieldBuilder().getBuilder();
    }
    /**
     * <code>.tutorial.Person person = 1;</code>
     */
    public com.example.tutorial.protos.PersonOrBuilder getPersonOrBuilder() {
      if (personBuilder_ != null) {
        return personBuilder_.getMessageOrBuilder();
      } else {
        return person_ == null ?
            com.example.tutorial.protos.Person.getDefaultInstance() : person_;
      }
    }
    /**
     * <code>.tutorial.Person person = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.tutorial.protos.Person, com.example.tutorial.protos.Person.Builder, com.example.tutorial.protos.PersonOrBuilder> 
        getPersonFieldBuilder() {
      if (personBuilder_ == null) {
        personBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.tutorial.protos.Person, com.example.tutorial.protos.Person.Builder, com.example.tutorial.protos.PersonOrBuilder>(
                getPerson(),
                getParentForChildren(),
                isClean());
        person_ = null;
      }
      return personBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tutorial.UpdatePersonRequest)
  }

  // @@protoc_insertion_point(class_scope:tutorial.UpdatePersonRequest)
  private static final com.example.tutorial.protos.UpdatePersonRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.tutorial.protos.UpdatePersonRequest();
  }

  public static com.example.tutorial.protos.UpdatePersonRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePersonRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePersonRequest>() {
    @java.lang.Override
    public UpdatePersonRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdatePersonRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdatePersonRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePersonRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.tutorial.protos.UpdatePersonRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

