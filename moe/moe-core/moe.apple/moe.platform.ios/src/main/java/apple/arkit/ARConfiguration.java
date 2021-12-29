package apple.arkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * An object to describe and configure the Augmented Reality techniques to be used in an ARSession.
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected ARConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARConfiguration allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
    public native ARConfiguration init();

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
     * Enable or disable light estimation.
     * <p>
     * Enabled by default.
     */
    @Generated
    @Selector("isLightEstimationEnabled")
    public native boolean isLightEstimationEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * Determines whether this device supports the ARConfiguration.
     */
    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ARConfiguration new_objc();

    /**
     * Determines whether to capture and provide audio data.
     * <p>
     * Disabled by default.
     */
    @Generated
    @Selector("providesAudioData")
    public native boolean providesAudioData();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Enable or disable light estimation.
     * <p>
     * Enabled by default.
     */
    @Generated
    @Selector("setLightEstimationEnabled:")
    public native void setLightEstimationEnabled(boolean value);

    /**
     * Determines whether to capture and provide audio data.
     * <p>
     * Disabled by default.
     */
    @Generated
    @Selector("setProvidesAudioData:")
    public native void setProvidesAudioData(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Determines how the coordinate system should be aligned with the world.
     * <p>
     * The default is ARWorldAlignmentGravity.
     */
    @Generated
    @Selector("setWorldAlignment:")
    public native void setWorldAlignment(@NInt long value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Determines how the coordinate system should be aligned with the world.
     * <p>
     * The default is ARWorldAlignmentGravity.
     */
    @Generated
    @Selector("worldAlignment")
    @NInt
    public native long worldAlignment();

    /**
     * The type of semantic understanding to provide with each frame.
     * <p>
     * Use the `supportsFrameSemantics` class method to check if the configuration type you intend to run supports the set of frame semantics. For example, when running a session with
     * a configuration of type ARWorldTrackingConfiguration one would need to use `+[ ARWorldTrackingConfiguration supportsFrameSemantics:]` to perform said check.
     * An exception is thrown if the option
     * is not supported. Defaults to ARFrameSemanticNone.
     *
     * @see ARFrameSemantics
     * @see +[ARConfiguration supportsFrameSemantics:]
     */
    @Generated
    @Selector("frameSemantics")
    @NUInt
    public native long frameSemantics();

    /**
     * The type of semantic understanding to provide with each frame.
     * <p>
     * Use the `supportsFrameSemantics` class method to check if the configuration type you intend to run supports the set of frame semantics. For example, when running a session with
     * a configuration of type ARWorldTrackingConfiguration one would need to use `+[ ARWorldTrackingConfiguration supportsFrameSemantics:]` to perform said check.
     * An exception is thrown if the option
     * is not supported. Defaults to ARFrameSemanticNone.
     *
     * @see ARFrameSemantics
     * @see +[ARConfiguration supportsFrameSemantics:]
     */
    @Generated
    @Selector("setFrameSemantics:")
    public native void setFrameSemantics(@NUInt long value);

    /**
     * Video format of the session output.
     */
    @Generated
    @Selector("setVideoFormat:")
    public native void setVideoFormat(ARVideoFormat value);

    /**
     * A list of supported video formats for this configuration and device.
     * <p>
     * The first element in the list is the default format for session output.
     */
    @Generated
    @Selector("supportedVideoFormats")
    public static native NSArray<? extends ARVideoFormat> supportedVideoFormats();

    /**
     * Determines whether the type of frame semantics is supported by the device and ARConfiguration class.
     * <p>
     * Semantic frame understanding is not supported on all devices. Use the `supportsFrameSemantics` class method to check if the configuration type you intend to run supports the
     * set of frame semantics. For example, when running a session with a configuration of type ARWorldTrackingConfiguration one would need to use
     * `+[ ARWorldTrackingConfiguration supportsFrameSemantics:]` to perform said check.
     *
     * @see ARFrameSemantics
     */
    @Generated
    @Selector("supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(@NUInt long frameSemantics);

    /**
     * Video format of the session output.
     */
    @Generated
    @Selector("videoFormat")
    public native ARVideoFormat videoFormat();
}
