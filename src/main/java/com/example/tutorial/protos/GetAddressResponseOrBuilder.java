// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package com.example.tutorial.protos;

public interface GetAddressResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.GetAddressResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tutorial.ResponseStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.tutorial.ResponseStatus status = 1;</code>
   * @return The status.
   */
  com.example.tutorial.protos.ResponseStatus getStatus();

  /**
   * <code>repeated .tutorial.AddressBook addressBook = 2;</code>
   */
  java.util.List<com.example.tutorial.protos.AddressBook> 
      getAddressBookList();
  /**
   * <code>repeated .tutorial.AddressBook addressBook = 2;</code>
   */
  com.example.tutorial.protos.AddressBook getAddressBook(int index);
  /**
   * <code>repeated .tutorial.AddressBook addressBook = 2;</code>
   */
  int getAddressBookCount();
  /**
   * <code>repeated .tutorial.AddressBook addressBook = 2;</code>
   */
  java.util.List<? extends com.example.tutorial.protos.AddressBookOrBuilder> 
      getAddressBookOrBuilderList();
  /**
   * <code>repeated .tutorial.AddressBook addressBook = 2;</code>
   */
  com.example.tutorial.protos.AddressBookOrBuilder getAddressBookOrBuilder(
      int index);
}
