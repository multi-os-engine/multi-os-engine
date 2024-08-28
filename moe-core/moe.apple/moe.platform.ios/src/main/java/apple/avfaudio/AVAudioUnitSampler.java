package apple.avfaudio;

import apple.NSObject;
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
 * AVAudioUnitSampler
 * 
 * Apple's sampler audio unit.
 * 
 * An AVAudioUnit for Apple's Sampler Audio Unit. The sampler can be configured by loading
 * instruments from different types of files such as an aupreset, a DLS or SF2 sound bank,
 * an EXS24 instrument, a single audio file, or an array of audio files.
 * 
 * The output is a single stereo bus.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitSampler extends AVAudioUnitMIDIInstrument {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnitSampler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnitSampler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnitSampler allocWithZone(VoidPtr zone);

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

    /**
     * [@property] globalTuning
     * 
     * adjusts the tuning of all the notes played.
     * Range: -2400 -> +2400 cents
     * Default: 0
     */
    @Generated
    @Selector("globalTuning")
    public native float globalTuning();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioUnitSampler init();

    @Generated
    @Selector("initWithAudioComponentDescription:")
    public native AVAudioUnitSampler initWithAudioComponentDescription(@ByValue AudioComponentDescription description);

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
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription audioComponentDescription, int options,
            @NotNull @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") AVAudioUnit.Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * loadAudioFilesAtURLs:error:
     * 
     * configures the sampler by loading a set of audio files.
     * 
     * The audio files are loaded into a new default instrument with each audio file placed
     * into its own sampler zone. Any information contained in the audio file regarding
     * their placement on the keyboard (e.g. root key, key range) will be used.
     * This method reads from file and allocates memory, so it should not be called on a real time thread.
     * 
     * @param audioFiles
     *                   array of URLs for audio files to be loaded
     * @param outError
     *                   the status of the operation
     */
    @Generated
    @Selector("loadAudioFilesAtURLs:error:")
    public native boolean loadAudioFilesAtURLsError(@NotNull NSArray<? extends NSURL> audioFiles,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * loadInstrumentAtURL:error:
     * 
     * configures the sampler by loading the specified preset file.
     * 
     * The file can be of one of the following types: Logic/GarageBand EXS24 instrument,
     * the Sampler AU's native aupreset, or an audio file (eg. .caf, .aiff, .wav, .mp3).
     * 
     * If an audio file URL is loaded, it will become the sole sample in a new default instrument.
     * Any information contained in the file regarding its keyboard placement (e.g. root key,
     * key range) will be used.
     * This method reads from file and allocates memory, so it should not be called on a real time thread.
     * 
     * @param instrumentURL
     *                      URL to the preset file or audio file
     * @param outError
     *                      the status of the operation
     */
    @Generated
    @Selector("loadInstrumentAtURL:error:")
    public native boolean loadInstrumentAtURLError(@NotNull NSURL instrumentURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * loadSoundBankInstrumentAtURL:program:bankMSB:bankLSB:error:
     * 
     * loads a specific instrument from the specified sound bank
     * 
     * This method reads from file and allocates memory, so it should not be called on a real time thread.
     * 
     * @param bankURL
     *                 URL for a Soundbank file. The file can be either a DLS bank (.dls) or a SoundFont bank (.sf2).
     * @param program
     *                 program number for the instrument to load
     * @param bankMSB
     *                 MSB for the bank number for the instrument to load. This is usually 0x79 for melodic
     *                 instruments and 0x78 for percussion instruments.
     * @param bankLSB
     *                 LSB for the bank number for the instrument to load. This is often 0, and represents the "bank
     *                 variation".
     * @param outError
     *                 the status of the operation
     */
    @Generated
    @Selector("loadSoundBankInstrumentAtURL:program:bankMSB:bankLSB:error:")
    public native boolean loadSoundBankInstrumentAtURLProgramBankMSBBankLSBError(@NotNull NSURL bankURL, byte program,
            byte bankMSB, byte bankLSB, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] masterGain
     * 
     * adjusts the gain of all the notes played
     * Range: -90.0 -> +12 db
     * Default: 0 db
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("masterGain")
    public native float masterGain();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioUnitSampler new_objc();

    /**
     * [@property] overallGain
     * 
     * adjusts the gain of all the notes played
     * Range: -90.0 -> +12 db
     * Default: 0 db
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("overallGain")
    public native float overallGain();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] globalTuning
     * 
     * adjusts the tuning of all the notes played.
     * Range: -2400 -> +2400 cents
     * Default: 0
     */
    @Generated
    @Selector("setGlobalTuning:")
    public native void setGlobalTuning(float value);

    /**
     * [@property] masterGain
     * 
     * adjusts the gain of all the notes played
     * Range: -90.0 -> +12 db
     * Default: 0 db
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("setMasterGain:")
    public native void setMasterGain(float value);

    /**
     * [@property] overallGain
     * 
     * adjusts the gain of all the notes played
     * Range: -90.0 -> +12 db
     * Default: 0 db
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setOverallGain:")
    public native void setOverallGain(float value);

    /**
     * [@property] stereoPan
     * 
     * adjusts the pan for all the notes played.
     * Range: -100 -> +100
     * Default: 0
     */
    @Generated
    @Selector("setStereoPan:")
    public native void setStereoPan(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] stereoPan
     * 
     * adjusts the pan for all the notes played.
     * Range: -100 -> +100
     * Default: 0
     */
    @Generated
    @Selector("stereoPan")
    public native float stereoPan();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
