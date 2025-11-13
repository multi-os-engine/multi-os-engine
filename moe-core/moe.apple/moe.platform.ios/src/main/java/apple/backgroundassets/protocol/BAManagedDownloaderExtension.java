package apple.backgroundassets.protocol;

import apple.backgroundassets.BAAssetPack;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * An application extension that uses the system implementation to schedule asset-pack downloads automatically.
 * 
 * The protocol provides default implementations for all of the inherited ``BADownloaderExtension-zuvm`` requirements.
 * - Warning: Don’t implement any of the inherited ``BADownloaderExtension-zuvm`` requirements aside from, optionally,
 * ``BADownloaderExtension-zuvm/backgroundDownload:didReceiveChallenge:completionHandler:``.
 * 
 * ## Creating an Objective-C Downloader Extension
 * Xcode’s Background Download extension template generates Swift code when you select either the “Apple-Hosted,
 * Managed” option or the “Self-Hosted, Managed” option, but you can easily switch to Objective-C instead if you prefer.
 * To do so, follow these steps:
 * 1. Remove `BackgroundDownloadHandler.swift`.
 * 2. Create `DownloaderExtension.h` with the following contents:
 * ### Apple Hosting
 * ```objc
 * #import <StoreKit/StoreKit.h>
 * 
 * \@interface DownloaderExtension : NSObject <SKDownloaderExtension>
 * 
 * [@end]
 * ```
 * 
 * ### Self Hosting
 * ```objc
 * #import <BackgroundAssets/BackgroundAssets.h>
 * 
 * \@interface DownloaderExtension : NSObject <BAManagedDownloaderExtension>
 * 
 * [@end]
 * ```
 * 
 * (Remove any backslash characters that may be rendered in the above code snippets.)
 * 
 * 3. Create `DownloaderExtension.m` with the following contents:
 * ```objc
 * #import "DownloaderExtension.h"
 * 
 * [@implementation] DownloaderExtension
 * 
 * - (BOOL)shouldDownloadAssetPack:(BAAssetPack *)assetPack {
 * // Use this method to filter out asset packs that the system would otherwise download automatically. You can also
 * remove this method entirely if you just want to rely on the default download behavior.
 * return true;
 * }
 * 
 * [@end]
 * ```
 * 4. Add `DownloaderExtension.m` to your extension’s target.
 * 5. Add the following snippet inside your extension’s `Info.plist`’s `EXAppExtensionAttributes` dictionary:
 * ```plist
 * <key>EXPrincipalClass</key>
 * <string>DownloaderExtension</string>
 * ```
 * 
 * API-Since: 26.0
 */
@Generated
@Library("BackgroundAssets")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BAManagedDownloaderExtension")
public interface BAManagedDownloaderExtension extends BADownloaderExtension {
    /**
     * Determines whether to download an asset pack.
     * 
     * By default, the system automatically downloads all applicable asset packs with either “essential” or “prefetch”
     * download policies for the current installation event type. You can optionally implement this method to filter out
     * unwanted asset packs at runtime.
     * - Parameter assetPack: An asset pack that’s being considered as a candidate to be downloaded.
     * - Returns: Whether the asset pack should be downloaded.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("shouldDownloadAssetPack:")
    default boolean shouldDownloadAssetPack(@NotNull BAAssetPack assetPack) {
        throw new java.lang.UnsupportedOperationException();
    }
}