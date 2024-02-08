package apple.appclip;

import apple.NSObject;
import apple.corelocation.CLRegion;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Information that’s passed to an App Clip on launch.
 * 
 * When users launch an App Clip, the platform passes an activation payload to
 * the App Clip as part of an
 * <doc://com.apple.documentation/documentation/foundation/nsuseractivity>
 * object. When the App Clip receives the payload, confirm the user’s physical
 * location at the time of the invocation.
 * 
 * For more information, see <doc:responding-to-invocations>.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("AppClip")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class APActivationPayload extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected APActivationPayload(Pointer peer) {
        super(peer);
    }

    /**
     * The URL of the link that launched the App Clip.
     * 
     * Use `url` to retrieve data that’s passed to an App Clip on launch, and use
     * the data to update the user interface of the App Clip.
     * 
     * The value of `url` is the same as the
     * <doc://com.apple.documentation/documentation/foundation/nsuseractivity>
     * <doc://com.apple.documentation/documentation/foundation/nsuseractivity/1418086-webpageurl>
     * property. If you don’t need to verify the user’s location when they launch
     * your App Clip, use `webpageURL` instead.
     * 
     * For more information, see <doc:responding-to-invocations>.
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native APActivationPayload alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native APActivationPayload allocWithZone(VoidPtr zone);

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

    /**
     * Checks whether an App Clip invocation happened at an expected physical
     * location.
     * 
     * - Parameters:
     * - region: The expected physical location at the time of the App Clip
     * invocation.
     * - completionHandler: A closure called when the platform confirms the
     * expected physical location at the time of the App Clip invocation.
     * 
     * The closure takes the following parameters:
     * 
     * - term `inRegion`: A Boolean value that indicates whether the App Clip
     * invocation happened at the expected physical location.
     * - term `error`: The error object that describes why the platform
     * couldn't confirm the user's physical location.
     * 
     * This parameter is `nil` if the platform was able to determine the user's
     * physical location at the time of the App Clip invocation.
     * 
     * Confirm the user's location at the time of the App Clip invocation if the
     * App Clip is associated with a physical location. The request to confirm the
     * location fails with ``App_clips/Apactivationpayloaderror/disallowed`` if the
     * source of the invocation isn't an NFC tag or visual code.
     * 
     * For the platform to accept the request to confirm the user's location, you
     * need to make modifications to the `Info.plist` file of the App Clip. For
     * more information, see <doc:enabling-notifications-in-app-clips>.
     * 
     * - Note: Functionality to confirm the user's location is only available to
     * App Clips. For the full app, request permission to access the user's
     * location and make use of the
     * <doc://com.apple.documentation/documentation/corelocation> framework. For
     * more information, see
     * <doc://com.apple.documentation/documentation/corelocation/getting_the_current_location_of_a_device>.
     */
    @Generated
    @Selector("confirmAcquiredInRegion:completionHandler:")
    public native void confirmAcquiredInRegionCompletionHandler(@NotNull CLRegion region,
            @NotNull @ObjCBlock(name = "call_confirmAcquiredInRegionCompletionHandler") Block_confirmAcquiredInRegionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmAcquiredInRegionCompletionHandler {
        @Generated
        void call_confirmAcquiredInRegionCompletionHandler(boolean inRegion, @Nullable NSError error);
    }

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native APActivationPayload init();

    @Generated
    @Selector("initWithCoder:")
    public native APActivationPayload initWithCoder(@NotNull NSCoder coder);

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
    public static native APActivationPayload new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
