// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: peer/peer.proto

package org.hyperledger.fabric.protos.peer;

public final class Peer {
  private Peer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017peer/peer.proto\022\006protos\032\023peer/proposal" +
      ".proto\032\034peer/proposal_response.proto2O\n\010" +
      "Endorser\022C\n\017ProcessProposal\022\026.protos.Sig" +
      "nedProposal\032\030.protos.ProposalResponseBR\n" +
      "\"org.hyperledger.fabric.protos.peerZ,git" +
      "hub.com/hyperledger/fabric-protos-go/pee" +
      "rb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.hyperledger.fabric.protos.peer.ProposalPackage.getDescriptor(),
          org.hyperledger.fabric.protos.peer.ProposalResponsePackage.getDescriptor(),
        }, assigner);
    org.hyperledger.fabric.protos.peer.ProposalPackage.getDescriptor();
    org.hyperledger.fabric.protos.peer.ProposalResponsePackage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
