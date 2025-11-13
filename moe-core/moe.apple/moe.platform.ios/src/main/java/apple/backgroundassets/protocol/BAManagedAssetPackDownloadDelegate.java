package apple.backgroundassets.protocol;

import apple.backgroundassets.BAAssetPack;
import apple.foundation.NSError;
import apple.foundation.NSProgress;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * An object that handles status updates when downloading an asset pack.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("BackgroundAssets")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BAManagedAssetPackDownloadDelegate")
public interface BAManagedAssetPackDownloadDelegate {
    /**
     * Notifies the receiver that the download failed.
     * - Parameters:
     * - assetPack: The asset pack.
     * - error: The error that occurred.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("downloadOfAssetPack:failedWithError:")
    default void downloadOfAssetPackFailedWithError(@NotNull BAAssetPack assetPack, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the receiver that the download is in progress.
     * - Parameters:
     * - assetPack: The asset pack.
     * - progress: The download progress.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("downloadOfAssetPack:hasProgress:")
    default void downloadOfAssetPackHasProgress(@NotNull BAAssetPack assetPack, @NotNull NSProgress progress) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the receiver that the download began or resumed after being paused.
     * - Parameter assetPack: The asset pack.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("downloadOfAssetPackBegan:")
    default void downloadOfAssetPackBegan(@NotNull BAAssetPack assetPack) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the receiver that the download completed and that the asset pack is available locally.
     * - Parameter assetPack: The asset pack.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("downloadOfAssetPackFinished:")
    default void downloadOfAssetPackFinished(@NotNull BAAssetPack assetPack) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the receiver that the download paused.
     * - Parameter assetPack: The asset pack.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("downloadOfAssetPackPaused:")
    default void downloadOfAssetPackPaused(@NotNull BAAssetPack assetPack) {
        throw new java.lang.UnsupportedOperationException();
    }
}