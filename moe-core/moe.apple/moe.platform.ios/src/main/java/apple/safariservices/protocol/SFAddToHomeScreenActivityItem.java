package apple.safariservices.protocol;

import apple.browserenginekit.BEWebAppManifest;
import apple.foundation.NSItemProvider;
import apple.foundation.NSURL;
import apple.safariservices.SFAddToHomeScreenInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] SFAddToHomeScreenActivityItem
 * An activity item for adding "Add to Home Screen" activity type into activity view (share sheet) list.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("SafariServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SFAddToHomeScreenActivityItem")
public interface SFAddToHomeScreenActivityItem {
    /**
     * The URL for the home screen bookmark item.
     * The URL scheme should be HTTP or HTTPS.
     * This URL will be shown to user in the confirmation sheet.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("URL")
    @NotNull
    NSURL URL();

    /**
     * An optional method to fetch the SFAddToHomeScreenInfo.
     * This will fetch all of the asynchronous data in one operation. If this method is
     * implemented, it will be used instead of getWebAppManifestWithCompletionHandler:.
     * 
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("getHomeScreenWebAppInfoWithCompletionHandler:")
    default void getHomeScreenWebAppInfoWithCompletionHandler(
            @ObjCBlock(name = "call_getHomeScreenWebAppInfoWithCompletionHandler") @NotNull Block_getHomeScreenWebAppInfoWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getHomeScreenWebAppInfoWithCompletionHandler {
        @Generated
        void call_getHomeScreenWebAppInfoWithCompletionHandler(@Nullable SFAddToHomeScreenInfo arg0);
    }

    /**
     * An optional method to provide the web app manifest.
     * This is only available to apps that can use BrowserEngineKit.
     * 
     * API-Since: 17.5
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Create a SFAddToHomeScreenInfo instead
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("getWebAppManifestWithCompletionHandler:")
    default void getWebAppManifestWithCompletionHandler(
            @ObjCBlock(name = "call_getWebAppManifestWithCompletionHandler") @NotNull Block_getWebAppManifestWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWebAppManifestWithCompletionHandler {
        @Generated
        void call_getWebAppManifestWithCompletionHandler(@Nullable BEWebAppManifest arg0);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("iconItemProvider")
    @Nullable
    default NSItemProvider iconItemProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The title for the home screen bookmark item.
     * This title will be shown to user in the confirmation sheet.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("title")
    @NotNull
    String title();
}