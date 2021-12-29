package apple.avfaudio;

import apple.NSObject;
import apple.audiotoolbox.AUAudioUnit;
import apple.audiotoolbox.opaque.AudioComponentInstance;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioUnit
 * <p>
 * An AVAudioNode implemented by an audio unit.
 * <p>
 * An AVAudioUnit is an AVAudioNode implemented by an audio unit. Depending on the type of
 * the audio unit, audio is processed either in real-time or non real-time.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnit extends AVAudioNode {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnit(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] AUAudioUnit
     * <p>
     * An AUAudioUnit wrapping or underlying the implementation's AudioUnit.
     * <p>
     * This provides an AUAudioUnit which either wraps or underlies the implementation's
     * AudioUnit, depending on how that audio unit is packaged. Applications can interact with this
     * AUAudioUnit to control custom properties, select presets, change parameters, etc.
     * <p>
     * As with the audioUnit property, no operations that may conflict with state maintained by the
     * engine should be performed directly on the audio unit. These include changing initialization
     * state, stream formats, channel layouts or connections to other audio units.
     */
    @Generated
    @Selector("AUAudioUnit")
    public native AUAudioUnit AUAudioUnit();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnit alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnit allocWithZone(VoidPtr zone);

    /**
     * [@property] audioComponentDescription
     * <p>
     * AudioComponentDescription of the underlying audio unit.
     */
    @Generated
    @Selector("audioComponentDescription")
    @ByValue
    public native AudioComponentDescription audioComponentDescription();

    /**
     * [@property] audioUnit
     * <p>
     * Reference to the underlying audio unit.
     * <p>
     * A reference to the underlying audio unit is provided so that parameters that are not
     * exposed by AVAudioUnit subclasses can be modified using the AudioUnit C API.
     * <p>
     * No operations that may conflict with state maintained by the engine should be performed
     * directly on the audio unit. These include changing initialization state, stream formats,
     * channel layouts or connections to other audio units.
     */
    @Generated
    @Selector("audioUnit")
    public native AudioComponentInstance audioUnit();

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
    public native AVAudioUnit init();

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
     * instantiateWithComponentDescription:options:completionHandler:
     * <p>
     * Asynchronously create an instance of an audio unit component, wrapped in an AVAudioUnit.
     * <p>
     * Components whose flags include kAudioComponentFlag_RequiresAsyncInstantiation must be
     * instantiated asynchronously, via this method if they are to be used with AVAudioEngine.
     * See the discussion of this flag in AudioToolbox/AudioComponent.h.
     * <p>
     * The returned AVAudioUnit instance normally will be of a subclass (AVAudioUnitEffect,
     * AVAudioUnitGenerator, AVAudioUnitMIDIInstrument, or AVAudioUnitTimeEffect), selected
     * according to the component's type.
     *
     * @param audioComponentDescription The component to instantiate.
     * @param options                   Instantiation options.
     * @param completionHandler         Called in an arbitrary thread/queue context when instantiation is complete. The client
     *                                  should retain the provided AVAudioUnit.
     */
    @Generated
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription audioComponentDescription, int options,
            @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_instantiateWithComponentDescriptionOptionsCompletionHandler {
        @Generated
        void call_instantiateWithComponentDescriptionOptionsCompletionHandler(AVAudioUnit audioUnit, NSError error);
    }

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * loadAudioUnitPresetAtURL:error:
     * <p>
     * Load an audio unit preset.
     * <p>
     * If the .aupreset file cannot be successfully loaded, an error is returned.
     *
     * @param url      NSURL of the .aupreset file.
     * @param outError A pointer to a NSError object
     */
    @Generated
    @Selector("loadAudioUnitPresetAtURL:error:")
    public native boolean loadAudioUnitPresetAtURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] manufacturerName
     * <p>
     * Manufacturer name of the audio unit.
     */
    @Generated
    @Selector("manufacturerName")
    public native String manufacturerName();

    /**
     * [@property] name
     * <p>
     * Name of the audio unit.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioUnit new_objc();

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

    /**
     * [@property] version
     * <p>
     * Version number of the audio unit.
     */
    @Generated
    @Selector("version")
    @NUInt
    public native long version();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
