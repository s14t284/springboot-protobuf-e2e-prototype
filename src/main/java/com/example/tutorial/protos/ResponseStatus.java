// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package com.example.tutorial.protos;

/**
 * Protobuf enum {@code tutorial.ResponseStatus}
 */
public enum ResponseStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUCCESS = 0;</code>
   */
  SUCCESS(0),
  /**
   * <code>FAILED = 1;</code>
   */
  FAILED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUCCESS = 0;</code>
   */
  public static final int SUCCESS_VALUE = 0;
  /**
   * <code>FAILED = 1;</code>
   */
  public static final int FAILED_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ResponseStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResponseStatus forNumber(int value) {
    switch (value) {
      case 0: return SUCCESS;
      case 1: return FAILED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResponseStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResponseStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResponseStatus>() {
          public ResponseStatus findValueByNumber(int number) {
            return ResponseStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.example.tutorial.protos.AddressBookProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResponseStatus[] VALUES = values();

  public static ResponseStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResponseStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tutorial.ResponseStatus)
}

