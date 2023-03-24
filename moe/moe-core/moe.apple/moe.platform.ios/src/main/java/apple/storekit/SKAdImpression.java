package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.5
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKAdImpression extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKAdImpression(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The ad campaign identifier.
     */
    @NotNull
    @Generated
    @Selector("adCampaignIdentifier")
    public native NSNumber adCampaignIdentifier();

    /**
     * The description of the ad.
     */
    @Nullable
    @Generated
    @Selector("adDescription")
    public native String adDescription();

    /**
     * The nonce used to generate the signature.
     */
    @NotNull
    @Generated
    @Selector("adImpressionIdentifier")
    public native String adImpressionIdentifier();

    /**
     * The identifier for the ad network.
     */
    @NotNull
    @Generated
    @Selector("adNetworkIdentifier")
    public native String adNetworkIdentifier();

    /**
     * Name of entity that purchased the ad being presented.
     */
    @Nullable
    @Generated
    @Selector("adPurchaserName")
    public native String adPurchaserName();

    /**
     * The type of ad being presented.
     */
    @Nullable
    @Generated
    @Selector("adType")
    public native String adType();

    /**
     * The App Store item identifier for the app being advertised.
     */
    @NotNull
    @Generated
    @Selector("advertisedAppStoreItemIdentifier")
    public native NSNumber advertisedAppStoreItemIdentifier();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKAdImpression alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKAdImpression allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SKAdImpression init();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SKAdImpression new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The ad campaign identifier.
     */
    @Generated
    @Selector("setAdCampaignIdentifier:")
    public native void setAdCampaignIdentifier(@NotNull NSNumber value);

    /**
     * The description of the ad.
     */
    @Generated
    @Selector("setAdDescription:")
    public native void setAdDescription(@Nullable String value);

    /**
     * The nonce used to generate the signature.
     */
    @Generated
    @Selector("setAdImpressionIdentifier:")
    public native void setAdImpressionIdentifier(@NotNull String value);

    /**
     * The identifier for the ad network.
     */
    @Generated
    @Selector("setAdNetworkIdentifier:")
    public native void setAdNetworkIdentifier(@NotNull String value);

    /**
     * Name of entity that purchased the ad being presented.
     */
    @Generated
    @Selector("setAdPurchaserName:")
    public native void setAdPurchaserName(@Nullable String value);

    /**
     * The type of ad being presented.
     */
    @Generated
    @Selector("setAdType:")
    public native void setAdType(@Nullable String value);

    /**
     * The App Store item identifier for the app being advertised.
     */
    @Generated
    @Selector("setAdvertisedAppStoreItemIdentifier:")
    public native void setAdvertisedAppStoreItemIdentifier(@NotNull NSNumber value);

    /**
     * The signature of the impression.
     */
    @Generated
    @Selector("setSignature:")
    public native void setSignature(@NotNull String value);

    /**
     * The App Store item identifier for the source app.
     */
    @Generated
    @Selector("setSourceAppStoreItemIdentifier:")
    public native void setSourceAppStoreItemIdentifier(@NotNull NSNumber value);

    /**
     * The timestamp of the start and end call.
     */
    @Generated
    @Selector("setTimestamp:")
    public native void setTimestamp(@NotNull NSNumber value);

    /**
     * The version of SKAdNetwork being used.
     */
    @Generated
    @Selector("setVersion:")
    public native void setVersion(@NotNull String value);

    /**
     * The signature of the impression.
     */
    @NotNull
    @Generated
    @Selector("signature")
    public native String signature();

    /**
     * The App Store item identifier for the source app.
     */
    @NotNull
    @Generated
    @Selector("sourceAppStoreItemIdentifier")
    public native NSNumber sourceAppStoreItemIdentifier();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The timestamp of the start and end call.
     */
    @NotNull
    @Generated
    @Selector("timestamp")
    public native NSNumber timestamp();

    /**
     * The version of SKAdNetwork being used.
     */
    @NotNull
    @Generated
    @Selector("version")
    public native String version();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithSourceAppStoreItemIdentifier:advertisedAppStoreItemIdentifier:adNetworkIdentifier:adCampaignIdentifier:adImpressionIdentifier:timestamp:signature:version:")
    public native SKAdImpression initWithSourceAppStoreItemIdentifierAdvertisedAppStoreItemIdentifierAdNetworkIdentifierAdCampaignIdentifierAdImpressionIdentifierTimestampSignatureVersion(
            @NotNull NSNumber sourceAppStoreItemIdentifier, @NotNull NSNumber advertisedAppStoreItemIdentifier,
            @NotNull String adNetworkIdentifier, @NotNull NSNumber adCampaignIdentifier,
            @NotNull String adImpressionIdentifier, @NotNull NSNumber timestamp, @NotNull String signature,
            @NotNull String version);

    /**
     * The source identifier
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSourceIdentifier:")
    public native void setSourceIdentifier(@NotNull NSNumber value);

    /**
     * The source identifier
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sourceIdentifier")
    public native NSNumber sourceIdentifier();
}
