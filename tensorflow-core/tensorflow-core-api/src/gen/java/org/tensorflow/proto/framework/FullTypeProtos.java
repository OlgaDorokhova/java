// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/full_type.proto

package org.tensorflow.proto.framework;

public final class FullTypeProtos {
  private FullTypeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FullTypeDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FullTypeDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)tensorflow/core/framework/full_type.pr" +
      "oto\022\ntensorflow\"r\n\013FullTypeDef\022\'\n\007type_i" +
      "d\030\001 \001(\0162\026.tensorflow.FullTypeId\022%\n\004args\030" +
      "\002 \003(\0132\027.tensorflow.FullTypeDef\022\013\n\001s\030\003 \001(" +
      "\tH\000B\006\n\004attr*\254\003\n\nFullTypeId\022\r\n\tTFT_UNSET\020" +
      "\000\022\013\n\007TFT_VAR\020\001\022\013\n\007TFT_ANY\020\002\022\017\n\013TFT_PRODU" +
      "CT\020\003\022\020\n\014TFT_CALLABLE\020d\022\017\n\nTFT_TENSOR\020\350\007\022" +
      "\016\n\tTFT_ARRAY\020\351\007\022\021\n\014TFT_OPTIONAL\020\352\007\022\020\n\013TF" +
      "T_DATASET\020\366N\022\r\n\010TFT_BOOL\020\310\001\022\016\n\tTFT_UINT8" +
      "\020\311\001\022\017\n\nTFT_UINT16\020\312\001\022\017\n\nTFT_UINT32\020\313\001\022\017\n" +
      "\nTFT_UINT64\020\314\001\022\r\n\010TFT_INT8\020\315\001\022\016\n\tTFT_INT" +
      "16\020\316\001\022\016\n\tTFT_INT32\020\317\001\022\016\n\tTFT_INT64\020\320\001\022\r\n" +
      "\010TFT_HALF\020\321\001\022\016\n\tTFT_FLOAT\020\322\001\022\017\n\nTFT_DOUB" +
      "LE\020\323\001\022\021\n\014TFT_BFLOAT16\020\327\001\022\022\n\rTFT_COMPLEX6" +
      "4\020\324\001\022\023\n\016TFT_COMPLEX128\020\325\001\022\017\n\nTFT_STRING\020" +
      "\326\001B\203\001\n\036org.tensorflow.proto.frameworkB\016F" +
      "ullTypeProtosP\001ZLgithub.com/tensorflow/t" +
      "ensorflow/tensorflow/go/core/framework/t" +
      "ypes_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_FullTypeDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_FullTypeDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FullTypeDef_descriptor,
        new java.lang.String[] { "TypeId", "Args", "S", "Attr", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
