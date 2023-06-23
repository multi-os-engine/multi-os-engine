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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An overlay configuration that can be used to show an app clip's full app.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKOverlayAppClipConfiguration extends SKOverlayConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected SKOverlayAppClipConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Nullable
    @Generated
    @Selector("additionalValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object additionalValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKOverlayAppClipConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKOverlayAppClipConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * A token representing an App Analytics campaign.
     */
    @Nullable
    @Generated
    @Selector("campaignToken")
    public native String campaignToken();

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
    public native SKOverlayAppClipConfiguration init();

    /**
     * Creates a new app overlay configuration that will show an app clip's full app.
     * 
     * @param position the desired position of the overlay.
     */
    @Generated
    @Selector("initWithPosition:")
    public native SKOverlayAppClipConfiguration initWithPosition(@NInt long position);

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
    public static native SKOverlayAppClipConfiguration new_objc();

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
    @Nullable
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
    public native void setAdditionalValueForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object value,
            @NotNull String key);

    /**
     * A token representing an App Analytics campaign.
     */
    @Generated
    @Selector("setCampaignToken:")
    public native void setCampaignToken(@Nullable String value);

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
    public native void setProviderToken(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * An optional identifier for a parent app's custom product page.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("customProductPageIdentifier")
    public native String customProductPageIdentifier();

    /**
     * An optional extra parameter for specifying the version of your app that will be shown to the user.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("latestReleaseID")
    public native String latestReleaseID();

    /**
     * An optional identifier for a parent app's custom product page.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCustomProductPageIdentifier:")
    public native void setCustomProductPageIdentifier(@Nullable String value);

    /**
     * An optional extra parameter for specifying the version of your app that will be shown to the user.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setLatestReleaseID:")
    public native void setLatestReleaseID(@Nullable String value);
}
