package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
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

/**
 * An overlay configuration that can be used to show any app from the App Store.
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKOverlayAppConfiguration extends SKOverlayConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected SKOverlayAppConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("additionalValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object additionalValueForKey(String key);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKOverlayAppConfiguration alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * The identifier of the app that will be shown.
     */
    @Generated
    @Selector("appIdentifier")
    public native String appIdentifier();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * A token representing an App Analytics campaign.
     */
    @Generated
    @Selector("campaignToken")
    public native String campaignToken();

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
    public native SKOverlayAppConfiguration init();

    /**
     * Creates a new app overlay configuration that will show an app from the App Store.
     * @param appIdentifier the app identifier of the app to show.
     * @param position the desired position of the overlay.
     */
    @Generated
    @Selector("initWithAppIdentifier:position:")
    public native SKOverlayAppConfiguration initWithAppIdentifierPosition(String appIdentifier, @NInt long position);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * The position an overlay will show at on screen.
     */
    @Generated
    @Selector("position")
    @NInt
    public native long position();

    /**
     * The provider token for the developer that created the app being presented.
     */
    @Generated
    @Selector("providerToken")
    public native String providerToken();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAdditionalValue:forKey:")
    public native void setAdditionalValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * The identifier of the app that will be shown.
     */
    @Generated
    @Selector("setAppIdentifier:")
    public native void setAppIdentifier(String value);

    /**
     * A token representing an App Analytics campaign.
     */
    @Generated
    @Selector("setCampaignToken:")
    public native void setCampaignToken(String value);

    /**
     * The position an overlay will show at on screen.
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@NInt long value);

    /**
     * The provider token for the developer that created the app being presented.
     */
    @Generated
    @Selector("setProviderToken:")
    public native void setProviderToken(String value);

    /**
     * Allows the user to interactively dismiss an overlay.
     */
    @Generated
    @Selector("setUserDismissible:")
    public native void setUserDismissible(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Allows the user to interactively dismiss an overlay.
     */
    @Generated
    @Selector("userDismissible")
    public native boolean userDismissible();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}