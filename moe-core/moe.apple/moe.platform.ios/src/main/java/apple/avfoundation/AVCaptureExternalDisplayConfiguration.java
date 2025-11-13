package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * A class you use to specify a configuration to your external display configurator.
 * 
 * Using an ``AVCaptureExternalDisplayConfiguration``, you direct your ``AVCaptureExternalDisplayConfigurator`` how to
 * configure an external display to match your device's active video format.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureExternalDisplayConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureExternalDisplayConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureExternalDisplayConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureExternalDisplayConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * A property indicating whether the color space of the configurator's preview layer should be preserved on the
     * output display by avoiding color space conversions.
     * 
     * Set ``bypassColorSpaceConversion`` to `true` if you would like the configurator's ``AVCaptureVideoPreviewLayer``
     * color space preserved on the output display. This is accomplished by setting the working color space to match the
     * color space of the external display. The color properties of the ``CALayer`` remain untouched. The default value
     * is `false`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("bypassColorSpaceConversion")
    public native boolean bypassColorSpaceConversion();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native AVCaptureExternalDisplayConfiguration init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureExternalDisplayConfiguration new_objc();

    /**
     * Your preferred external display resolution.
     * 
     * Use ``preferredResolution`` to set your desired resolution of the external display. When left at the default
     * value of { 0, 0 }, the native resolution of the external display is used.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("preferredResolution")
    @ByValue
    public native CMVideoDimensions preferredResolution();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A property indicating whether the color space of the configurator's preview layer should be preserved on the
     * output display by avoiding color space conversions.
     * 
     * Set ``bypassColorSpaceConversion`` to `true` if you would like the configurator's ``AVCaptureVideoPreviewLayer``
     * color space preserved on the output display. This is accomplished by setting the working color space to match the
     * color space of the external display. The color properties of the ``CALayer`` remain untouched. The default value
     * is `false`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBypassColorSpaceConversion:")
    public native void setBypassColorSpaceConversion(boolean value);

    /**
     * Your preferred external display resolution.
     * 
     * Use ``preferredResolution`` to set your desired resolution of the external display. When left at the default
     * value of { 0, 0 }, the native resolution of the external display is used.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPreferredResolution:")
    public native void setPreferredResolution(@ByValue CMVideoDimensions value);

    /**
     * A property indicating whether the frame rate of the external display should be configured to match the camera's
     * frame rate.
     * 
     * If you want to configure your ``AVCaptureVideoPreviewLayer`` to match its source
     * ``AVCaptureDevice/activeVideoMinFrameDuration``, set ``shouldMatchFrameRate`` to `true`. The default value is
     * `false`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setShouldMatchFrameRate:")
    public native void setShouldMatchFrameRate(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A property indicating whether the frame rate of the external display should be configured to match the camera's
     * frame rate.
     * 
     * If you want to configure your ``AVCaptureVideoPreviewLayer`` to match its source
     * ``AVCaptureDevice/activeVideoMinFrameDuration``, set ``shouldMatchFrameRate`` to `true`. The default value is
     * `false`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("shouldMatchFrameRate")
    public native boolean shouldMatchFrameRate();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}