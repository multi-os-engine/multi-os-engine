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
    @Generated
    @Selector("adCampaignIdentifier")
    public native NSNumber adCampaignIdentifier();

    /**
     * The description of the ad.
     */
    @Generated
    @Selector("adDescription")
    public native String adDescription();

    /**
     * The nonce used to generate the signature.
     */
    @Generated
    @Selector("adImpressionIdentifier")
    public native String adImpressionIdentifier();

    /**
     * The identifier for the ad network.
     */
    @Generated
    @Selector("adNetworkIdentifier")
    public native String adNetworkIdentifier();

    /**
     * Name of entity that purchased the ad being presented.
     */
    @Generated
    @Selector("adPurchaserName")
    public native String adPurchaserName();

    /**
     * The type of ad being presented.
     */
    @Generated
    @Selector("adType")
    public native String adType();

    /**
     * The App Store item identifier for the app being advertised.
     */
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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
    public native void setAdCampaignIdentifier(NSNumber value);

    /**
     * The description of the ad.
     */
    @Generated
    @Selector("setAdDescription:")
    public native void setAdDescription(String value);

    /**
     * The nonce used to generate the signature.
     */
    @Generated
    @Selector("setAdImpressionIdentifier:")
    public native void setAdImpressionIdentifier(String value);

    /**
     * The identifier for the ad network.
     */
    @Generated
    @Selector("setAdNetworkIdentifier:")
    public native void setAdNetworkIdentifier(String value);

    /**
     * Name of entity that purchased the ad being presented.
     */
    @Generated
    @Selector("setAdPurchaserName:")
    public native void setAdPurchaserName(String value);

    /**
     * The type of ad being presented.
     */
    @Generated
    @Selector("setAdType:")
    public native void setAdType(String value);

    /**
     * The App Store item identifier for the app being advertised.
     */
    @Generated
    @Selector("setAdvertisedAppStoreItemIdentifier:")
    public native void setAdvertisedAppStoreItemIdentifier(NSNumber value);

    /**
     * The signature of the impression.
     */
    @Generated
    @Selector("setSignature:")
    public native void setSignature(String value);

    /**
     * The App Store item identifier for the source app.
     */
    @Generated
    @Selector("setSourceAppStoreItemIdentifier:")
    public native void setSourceAppStoreItemIdentifier(NSNumber value);

    /**
     * The timestamp of the start and end call.
     */
    @Generated
    @Selector("setTimestamp:")
    public native void setTimestamp(NSNumber value);

    /**
     * The version of SKAdNetwork being used.
     */
    @Generated
    @Selector("setVersion:")
    public native void setVersion(String value);

    /**
     * The signature of the impression.
     */
    @Generated
    @Selector("signature")
    public native String signature();

    /**
     * The App Store item identifier for the source app.
     */
    @Generated
    @Selector("sourceAppStoreItemIdentifier")
    public native NSNumber sourceAppStoreItemIdentifier();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The timestamp of the start and end call.
     */
    @Generated
    @Selector("timestamp")
    public native NSNumber timestamp();

    /**
     * The version of SKAdNetwork being used.
     */
    @Generated
    @Selector("version")
    public native String version();
}
