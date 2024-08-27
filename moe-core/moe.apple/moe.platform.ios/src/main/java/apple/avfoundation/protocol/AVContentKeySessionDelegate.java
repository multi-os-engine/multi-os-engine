package apple.avfoundation.protocol;

import apple.avfoundation.AVContentKeyRequest;
import apple.avfoundation.AVContentKeySession;
import apple.avfoundation.AVPersistableContentKeyRequest;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 10.3
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVContentKeySessionDelegate")
public interface AVContentKeySessionDelegate {
    @Generated
    @IsOptional
    @Selector("contentKeySession:contentKeyRequest:didFailWithError:")
    default void contentKeySessionContentKeyRequestDidFailWithError(@NotNull AVContentKeySession session,
            @NotNull AVContentKeyRequest keyRequest, @NotNull NSError err) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("contentKeySession:didProvideContentKeyRequest:")
    void contentKeySessionDidProvideContentKeyRequest(@NotNull AVContentKeySession session,
            @NotNull AVContentKeyRequest keyRequest);

    @Generated
    @IsOptional
    @Selector("contentKeySession:didProvidePersistableContentKeyRequest:")
    default void contentKeySessionDidProvidePersistableContentKeyRequest(@NotNull AVContentKeySession session,
            @NotNull AVPersistableContentKeyRequest keyRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contentKeySession:didProvideRenewingContentKeyRequest:")
    default void contentKeySessionDidProvideRenewingContentKeyRequest(@NotNull AVContentKeySession session,
            @NotNull AVContentKeyRequest keyRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("contentKeySession:didUpdatePersistableContentKey:forContentKeyIdentifier:")
    default void contentKeySessionDidUpdatePersistableContentKeyForContentKeyIdentifier(
            @NotNull AVContentKeySession session, @NotNull NSData persistableContentKey,
            @NotNull @Mapped(ObjCObjectMapper.class) Object keyIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contentKeySession:shouldRetryContentKeyRequest:reason:")
    default boolean contentKeySessionShouldRetryContentKeyRequestReason(@NotNull AVContentKeySession session,
            @NotNull AVContentKeyRequest keyRequest, @NotNull String retryReason) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contentKeySessionContentProtectionSessionIdentifierDidChange:")
    default void contentKeySessionContentProtectionSessionIdentifierDidChange(@NotNull AVContentKeySession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("contentKeySession:contentKeyRequestDidSucceed:")
    default void contentKeySessionContentKeyRequestDidSucceed(@NotNull AVContentKeySession session,
            @NotNull AVContentKeyRequest keyRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("contentKeySessionDidGenerateExpiredSessionReport:")
    default void contentKeySessionDidGenerateExpiredSessionReport(@NotNull AVContentKeySession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}