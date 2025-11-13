package apple.videotoolbox;

import apple.NSObject;
import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.videotoolbox.protocol.VTFrameProcessorConfiguration;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A configuration object to initiate a frame processor and use temporal noise-filter processor.
 * 
 * The class properties of `VTTemporalNoiseFilterConfiguration` help to identify the capabilities of temporal noise
 * filter processor on the current platform, prior to initiating a session. You can confirm the availability of temporal
 * noise-filter processor in the current platform by checking the ``isSupported`` class property. Verify the processor's
 * capability to process source frames by ensuring that the dimensions are no less than ``minimumDimensions`` and no
 * greater than ``maximumDimensions``. Use the instance properties such as ``frameSupportedPixelFormats``,
 * ``sourcePixelBufferAttributes``, and ``destinationPixelBufferAttributes`` to ensure that the input and output pixel
 * buffer formats and attributes of the processor align with the client's specific requirements. The properties
 * ``previousFrameCount`` and ``nextFrameCount`` represent the maximum number of preceding and subsequent reference
 * frames, used in the processing of a source frame, to achieve optimum noise-reduction quality.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTTemporalNoiseFilterConfiguration extends NSObject implements VTFrameProcessorConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected VTTemporalNoiseFilterConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTTemporalNoiseFilterConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTTemporalNoiseFilterConfiguration allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("destinationPixelBufferAttributes")
    @NotNull
    public native NSDictionary<String, ?> destinationPixelBufferAttributes();

    /**
     * Height of source frame in pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("frameHeight")
    @NInt
    public native long frameHeight();

    @Generated
    @Selector("frameSupportedPixelFormats")
    @NotNull
    public native NSArray<? extends NSNumber> frameSupportedPixelFormats();

    /**
     * Width of source frame in pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("frameWidth")
    @NInt
    public native long frameWidth();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VTTemporalNoiseFilterConfiguration init();

    /**
     * Creates a new temporal noise-processor configuration.
     * 
     * Returns nil if frameWidth, frameHeight, or sourcePixelFormat is unsupported.
     * 
     * - Parameters:
     * - frameWidth: Width of source frame in pixels.
     * - frameHeight: Height of source frame in pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithFrameWidth:frameHeight:sourcePixelFormat:")
    public native VTTemporalNoiseFilterConfiguration initWithFrameWidthFrameHeightSourcePixelFormat(
            @NInt long frameWidth, @NInt long frameHeight, int sourcePixelFormat);

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
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @ProtocolClassMethod("isSupported")
    public boolean _isSupported() {
        return isSupported();
    }

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Selector("maximumDimensions")
    @ByValue
    public static native CMVideoDimensions maximumDimensions();

    @Generated
    @ProtocolClassMethod("maximumDimensions")
    @ByValue
    public CMVideoDimensions _maximumDimensions() {
        return maximumDimensions();
    }

    @Generated
    @Selector("minimumDimensions")
    @ByValue
    public static native CMVideoDimensions minimumDimensions();

    @Generated
    @ProtocolClassMethod("minimumDimensions")
    @ByValue
    public CMVideoDimensions _minimumDimensions() {
        return minimumDimensions();
    }

    @Generated
    @Owned
    @Selector("new")
    public static native VTTemporalNoiseFilterConfiguration new_objc();

    @Generated
    @Selector("nextFrameCount")
    @NInt
    public native long nextFrameCount();

    @Generated
    @Selector("previousFrameCount")
    @NInt
    public native long previousFrameCount();

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
    @Selector("sourcePixelBufferAttributes")
    @NotNull
    public native NSDictionary<String, ?> sourcePixelBufferAttributes();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * List of all supported pixel formats for source frames.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportedSourcePixelFormats")
    @NotNull
    public static native NSArray<? extends NSNumber> supportedSourcePixelFormats();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}