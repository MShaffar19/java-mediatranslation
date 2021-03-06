/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/mediatranslation/v1beta1/media_translation.proto

package com.google.cloud.mediatranslation.v1beta1;

public final class MediaTranslationProto {
  private MediaTranslationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_mediatranslation_v1beta1_TranslateSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_mediatranslation_v1beta1_TranslateSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_TextTranslationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_TextTranslationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/mediatranslation/v1beta1/"
          + "media_translation.proto\022%google.cloud.me"
          + "diatranslation.v1beta1\032\037google/api/field"
          + "_behavior.proto\032\027google/rpc/status.proto"
          + "\032\027google/api/client.proto\"\336\001\n\025TranslateS"
          + "peechConfig\022\033\n\016audio_encoding\030\001 \001(\tB\003\340A\002"
          + "\022!\n\024source_language_code\030\002 \001(\tB\003\340A\002\022.\n!a"
          + "lternative_source_language_codes\030\006 \003(\tB\003"
          + "\340A\001\022!\n\024target_language_code\030\003 \001(\tB\003\340A\002\022\036"
          + "\n\021sample_rate_hertz\030\004 \001(\005B\003\340A\001\022\022\n\005model\030"
          + "\005 \001(\tB\003\340A\001\"\230\001\n\036StreamingTranslateSpeechC"
          + "onfig\022W\n\014audio_config\030\001 \001(\0132<.google.clo"
          + "ud.mediatranslation.v1beta1.TranslateSpe"
          + "echConfigB\003\340A\002\022\035\n\020single_utterance\030\002 \001(\010"
          + "B\003\340A\001\"\262\001\n\037StreamingTranslateSpeechReques"
          + "t\022a\n\020streaming_config\030\001 \001(\0132E.google.clo"
          + "ud.mediatranslation.v1beta1.StreamingTra"
          + "nslateSpeechConfigH\000\022\027\n\raudio_content\030\002 "
          + "\001(\014H\000B\023\n\021streaming_request\"\301\002\n\036Streaming"
          + "TranslateSpeechResult\022~\n\027text_translatio"
          + "n_result\030\001 \001(\0132[.google.cloud.mediatrans"
          + "lation.v1beta1.StreamingTranslateSpeechR"
          + "esult.TextTranslationResultH\000\022\037\n\022recogni"
          + "tion_result\030\003 \001(\tB\003\340A\003\032t\n\025TextTranslatio"
          + "nResult\022\030\n\013translation\030\001 \001(\tB\003\340A\003\022\025\n\010is_"
          + "final\030\002 \001(\010B\003\340A\003\022*\n\035detected_source_lang"
          + "uage_code\030\003 \001(\tB\003\340A\003B\010\n\006result\"\362\002\n Strea"
          + "mingTranslateSpeechResponse\022&\n\005error\030\001 \001"
          + "(\0132\022.google.rpc.StatusB\003\340A\003\022Z\n\006result\030\002 "
          + "\001(\0132E.google.cloud.mediatranslation.v1be"
          + "ta1.StreamingTranslateSpeechResultB\003\340A\003\022"
          + "w\n\021speech_event_type\030\003 \001(\0162W.google.clou"
          + "d.mediatranslation.v1beta1.StreamingTran"
          + "slateSpeechResponse.SpeechEventTypeB\003\340A\003"
          + "\"Q\n\017SpeechEventType\022!\n\035SPEECH_EVENT_TYPE"
          + "_UNSPECIFIED\020\000\022\033\n\027END_OF_SINGLE_UTTERANC"
          + "E\020\0012\243\002\n\030SpeechTranslationService\022\261\001\n\030Str"
          + "eamingTranslateSpeech\022F.google.cloud.med"
          + "iatranslation.v1beta1.StreamingTranslate"
          + "SpeechRequest\032G.google.cloud.mediatransl"
          + "ation.v1beta1.StreamingTranslateSpeechRe"
          + "sponse\"\000(\0010\001\032S\312A\037mediatranslation.google"
          + "apis.com\322A.https://www.googleapis.com/au"
          + "th/cloud-platformB\231\002\n)com.google.cloud.m"
          + "ediatranslation.v1beta1B\025MediaTranslatio"
          + "nProtoP\001ZUgoogle.golang.org/genproto/goo"
          + "gleapis/cloud/mediatranslation/v1beta1;m"
          + "ediatranslation\370\001\001\252\002%Google.Cloud.MediaT"
          + "ranslation.V1Beta1\312\002%Google\\Cloud\\MediaT"
          + "ranslation\\V1beta1\352\002(Google::Cloud::Medi"
          + "aTranslation::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_mediatranslation_v1beta1_TranslateSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_mediatranslation_v1beta1_TranslateSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_mediatranslation_v1beta1_TranslateSpeechConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SourceLanguageCode",
              "AlternativeSourceLanguageCodes",
              "TargetLanguageCode",
              "SampleRateHertz",
              "Model",
            });
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_descriptor,
            new java.lang.String[] {
              "AudioConfig", "SingleUtterance",
            });
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechRequest_descriptor,
            new java.lang.String[] {
              "StreamingConfig", "AudioContent", "StreamingRequest",
            });
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_descriptor,
            new java.lang.String[] {
              "TextTranslationResult", "RecognitionResult", "Result",
            });
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_TextTranslationResult_descriptor =
        internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_TextTranslationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResult_TextTranslationResult_descriptor,
            new java.lang.String[] {
              "Translation", "IsFinal", "DetectedSourceLanguageCode",
            });
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechResponse_descriptor,
            new java.lang.String[] {
              "Error", "Result", "SpeechEventType",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
