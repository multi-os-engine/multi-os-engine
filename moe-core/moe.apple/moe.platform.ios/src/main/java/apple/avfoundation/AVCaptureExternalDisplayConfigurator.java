package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CALayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * A configurator class allowing you to configure properties of an external display to match the camera's active video
 * format.
 * 
 * An ``AVCaptureExternalDisplayConfigurator`` allows you to configure a connected external display to output a clean
 * feed using a ``CALayer``. Using the configurator, you can opt into automatic adjustment of the external display’s
 * color space and / or frame rate to match your device’s capture configuration. These adjustments are only applied to
 * the external display, not to the device.
 * 
 * - Note: Not all displays support the same configuration options as the device’s capture formats. Your adjustments to
 * the external display are applied with utmost effort to accurately represent the capture device. When your capture
 * device's ``AVCaptureDevice/activeFormat`` is unavailable on the external display, the configurator automatically
 * chooses the closest available format.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureExternalDisplayConfigurator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureExternalDisplayConfigurator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The currently configured frame rate on the external display that's displaying the preview layer.
     * 
     * Observe this property to determine if the configured frame rate matches the max frame rate
     * (``AVCaptureDevice/activeVideoMinFrameDuration``) of the device. When the ``active`` property becomes `false`,
     * this property changes to 0.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("activeExternalDisplayFrameRate")
    public native double activeExternalDisplayFrameRate();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureExternalDisplayConfigurator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureExternalDisplayConfigurator allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    /**
     * The device for which the coordinator configures the preview layer.
     * 
     * The value of this property is the ``AVCaptureDevice`` instance you provided when instantiating the configurator.
     * ``AVCaptureExternalDisplayConfigurator`` holds a weak reference to the device. If the device is released, this
     * property returns `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @Nullable
    public native AVCaptureDevice device();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureExternalDisplayConfigurator init();

    /**
     * An external display configurator instance that attempts to synchronize the preview layer configuration with the
     * device capture configuration.
     * 
     * - Parameter device: The device for which to monitor the configuration.
     * - Parameter previewLayer: The layer that is being used on an external display for displaying the camera preview.
     * - Parameter configuration: A configuration specifying which aspects of the camera's active format to monitor and
     * configure on the external display.
     * - Returns: an ``AVCaptureExternalDisplayConfigurator`` instance.
     * 
     * An ``AVCaptureExternalDisplayConfigurator`` is only applicable to external displays. It determines which
     * properties to configure on the external display based on your provided configuration (see
     * ``AVCaptureExternalDisplayConfiguration``). The configurator observes changes to your camera''s configuration,
     * and when changes are observed, it modifies the external display's properties to match.
     * 
     * If multiple configurators are linked to the same external display ,the last one created becomes the active
     * configurator for the external display (see ``active``).
     * 
     * - Important: An `NSInvalidArgumentException` is thrown if any of the ``AVCaptureExternalDisplayConfiguration``
     * options are not supported.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithDevice:previewLayer:configuration:")
    public native AVCaptureExternalDisplayConfigurator initWithDevicePreviewLayerConfiguration(
            @NotNull AVCaptureDevice device, @NotNull CALayer previewLayer,
            @NotNull AVCaptureExternalDisplayConfiguration configuration);

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

    /**
     * This property tells you whether the configurator is actively configuring the external display.
     * 
     * When this property returns `true`, the external display is successfully configured to match the device. If it
     * returns`false`, the configurator is not making any configuration changes to the external display. If another
     * ``AVCaptureExternalDisplayConfigurator`` instance takes over the configuration of the external display, this
     * property returns `false`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * Whether the external display supports bypassing color space conversion.
     * 
     * If `true`, you may instantiate a configurator with a configuration specifying
     * ``AVCaptureExternalDisplayConfiguration/bypassColorSpaceConversion`` set to `true`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isBypassingColorSpaceConversionSupported")
    public static native boolean isBypassingColorSpaceConversionSupported();

    /**
     * Whether the external display supports matching frame rate to a capture device.
     * 
     * If `true`, you may instantiate a configurator with a configuration specifying
     * ``AVCaptureExternalDisplayConfiguration/shouldMatchFrameRate`` set to `true`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isMatchingFrameRateSupported")
    public static native boolean isMatchingFrameRateSupported();

    /**
     * Whether the external display supports configuration to your preferred resolution.
     * 
     * If `true`, you may instantiate a configurator with a configuration specifying
     * ``AVCaptureExternalDisplayConfiguration/preferredResolution`` set to `true`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isPreferredResolutionSupported")
    public static native boolean isPreferredResolutionSupported();

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
    public static native AVCaptureExternalDisplayConfigurator new_objc();

    /**
     * The layer for which the configurator adjusts display properties to match the device's state.
     * 
     * The value of this property is the ``CALayer`` instance that you provided when instantiating the configurator. You
     * may specify either an ``AVCaptureVideoPreviewLayer`` or another ``CALayer`` instance that displays a camera's
     * video preview. ``AVCaptureExternalDisplayConfigurator``holds a weak reference to the layer. If the layer is
     * released, this property returns `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("previewLayer")
    @Nullable
    public native CALayer previewLayer();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Forces the external display configurator to asynchronously stop configuring the external display.
     * 
     * Call ``stop`` to force the ``AVCaptureExternalDisplayConfigurator`` to asynchronously stop configuring the
     * external display. Once stopped, the ``active`` property changes to `false` and the
     * ``activeExternalDisplayFrameRate`` becomes 0.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("stop")
    public native void stop();

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