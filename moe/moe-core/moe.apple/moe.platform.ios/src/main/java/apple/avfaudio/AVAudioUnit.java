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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAudioUnit
 * 
 * An AVAudioNode implemented by an audio unit.
 * 
 * An AVAudioUnit is an AVAudioNode implemented by an audio unit. Depending on the type of
 * the audio unit, audio is processed either in real-time or non real-time.
 * 
 * API-Since: 8.0
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
     * 
     * An AUAudioUnit wrapping or underlying the implementation's AudioUnit.
     * 
     * This provides an AUAudioUnit which either wraps or underlies the implementation's
     * AudioUnit, depending on how that audio unit is packaged. Applications can interact with this
     * AUAudioUnit to control custom properties, select presets, change parameters, etc.
     * 
     * As with the audioUnit property, no operations that may conflict with state maintained by the
     * engine should be performed directly on the audio unit. These include changing initialization
     * state, stream formats, channel layouts or connections to other audio units.
     * 
     * API-Since: 9.0
     */
    @NotNull
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
     * 
     * AudioComponentDescription of the underlying audio unit.
     */
    @Generated
    @Selector("audioComponentDescription")
    @ByValue
    public native AudioComponentDescription audioComponentDescription();

    /**
     * [@property] audioUnit
     * 
     * Reference to the underlying audio unit.
     * 
     * A reference to the underlying audio unit is provided so that parameters that are not
     * exposed by AVAudioUnit subclasses can be modified using the AudioUnit C API.
     * 
     * No operations that may conflict with state maintained by the engine should be performed
     * directly on the audio unit. These include changing initialization state, stream formats,
     * channel layouts or connections to other audio units.
     */
    @NotNull
    @Generated
    @Selector("audioUnit")
    public native AudioComponentInstance audioUnit();

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
     * 
     * Asynchronously create an instance of an audio unit component, wrapped in an AVAudioUnit.
     * 
     * Components whose flags include kAudioComponentFlag_RequiresAsyncInstantiation must be
     * instantiated asynchronously, via this method if they are to be used with AVAudioEngine.
     * See the discussion of this flag in AudioToolbox/AudioComponent.h.
     * 
     * The returned AVAudioUnit instance normally will be of a subclass (AVAudioUnitEffect,
     * AVAudioUnitGenerator, AVAudioUnitMIDIInstrument, or AVAudioUnitTimeEffect), selected
     * according to the component's type.
     * 
     * API-Since: 9.0
     * 
     * @param audioComponentDescription
     *                                  The component to instantiate.
     * @param options
     *                                  Instantiation options.
     * @param completionHandler
     *                                  Called in an arbitrary thread/queue context when instantiation is complete. The
     *                                  client
     *                                  should retain the provided AVAudioUnit.
     */
    @Generated
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription audioComponentDescription, int options,
            @NotNull @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_instantiateWithComponentDescriptionOptionsCompletionHandler {
        @Generated
        void call_instantiateWithComponentDescriptionOptionsCompletionHandler(@Nullable AVAudioUnit audioUnit,
                @Nullable NSError error);
    }

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * loadAudioUnitPresetAtURL:error:
     * 
     * Load an audio unit preset.
     * 
     * If the .aupreset file cannot be successfully loaded, an error is returned.
     * 
     * @param url
     *                 NSURL of the .aupreset file.
     * @param outError
     *                 A pointer to a NSError object
     */
    @Generated
    @Selector("loadAudioUnitPresetAtURL:error:")
    public native boolean loadAudioUnitPresetAtURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] manufacturerName
     * 
     * Manufacturer name of the audio unit.
     */
    @NotNull
    @Generated
    @Selector("manufacturerName")
    public native String manufacturerName();

    /**
     * [@property] name
     * 
     * Name of the audio unit.
     */
    @NotNull
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
     * 
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
