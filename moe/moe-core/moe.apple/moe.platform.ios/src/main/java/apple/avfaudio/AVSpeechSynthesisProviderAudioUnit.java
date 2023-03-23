package apple.avfaudio;

import apple.NSObject;
import apple.audiotoolbox.AUAudioUnit;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * API-Since: 16.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSpeechSynthesisProviderAudioUnit extends AUAudioUnit {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSpeechSynthesisProviderAudioUnit(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSpeechSynthesisProviderAudioUnit alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVSpeechSynthesisProviderAudioUnit allocWithZone(VoidPtr zone);

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

    /**
     * Informs the audio unit that the speech request job should be discarded.
     */
    @Generated
    @Selector("cancelSpeechRequest")
    public native void cancelSpeechRequest();

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
    public native AVSpeechSynthesisProviderAudioUnit init();

    @Generated
    @Selector("initWithComponentDescription:error:")
    public native AVSpeechSynthesisProviderAudioUnit initWithComponentDescriptionError(
            @ByValue AudioComponentDescription componentDescription,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("initWithComponentDescription:options:error:")
    public native AVSpeechSynthesisProviderAudioUnit initWithComponentDescriptionOptionsError(
            @ByValue AudioComponentDescription componentDescription, int options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
            @ByValue AudioComponentDescription componentDescription, int options,
            @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") AUAudioUnit.Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVSpeechSynthesisProviderAudioUnit new_objc();

    @Generated
    @Selector("registerSubclass:asComponentDescription:name:version:")
    public static native void registerSubclassAsComponentDescriptionNameVersion(Class cls,
            @ByValue AudioComponentDescription componentDescription, String name, int version);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A property set by the host that is called by the audio unit to supply metadata for a speech request.
     * 
     * A synthesizer should call this method when it has produced relevant data to the audio buffers it is sending back
     * to the host. In some cases speech output may be delayed until these markers are delivered. For example, word
     * highlighting depends on marker data from synthesizers in order to properly time which words are highlighted. Many
     * speech synthesizers generate this information on the fly, while synthesizing the audio. The array of markers can
     * reference future audio buffers that have yet to be delivered.
     * 
     * There may be cases in which marker data is not fully known until further audio processing is done. In these
     * cases, and other casers where marker data has changed, calling this block with marker data that contains
     * perviously delivered audio buffer ranges will replace that audio buffer range's marker data, as it will be
     * considered stale.
     */
    @Generated
    @Selector("setSpeechSynthesisOutputMetadataBlock:")
    public native void setSpeechSynthesisOutputMetadataBlock(
            @ObjCBlock(name = "call_setSpeechSynthesisOutputMetadataBlock") Block_setSpeechSynthesisOutputMetadataBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSpeechSynthesisOutputMetadataBlock {
        @Generated
        void call_setSpeechSynthesisOutputMetadataBlock(NSArray<? extends AVSpeechSynthesisMarker> markers,
                AVSpeechSynthesisProviderRequest speechRequest);
    }

    /**
     * Returns the voices this audio unit has available and ready for synthesis.
     * 
     * This method should fetch and return the voices ready to synthesize that a user can select from (usually through
     * Settings).
     * Required for speech synthesizer audio unit extensions. An audio unit with a dynamic list of voices can override
     * this property's getter to perform a more complex fetch.
     */
    @Generated
    @Selector("setSpeechVoices:")
    public native void setSpeechVoices(NSArray<? extends AVSpeechSynthesisProviderVoice> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A property set by the host that is called by the audio unit to supply metadata for a speech request.
     * 
     * A synthesizer should call this method when it has produced relevant data to the audio buffers it is sending back
     * to the host. In some cases speech output may be delayed until these markers are delivered. For example, word
     * highlighting depends on marker data from synthesizers in order to properly time which words are highlighted. Many
     * speech synthesizers generate this information on the fly, while synthesizing the audio. The array of markers can
     * reference future audio buffers that have yet to be delivered.
     * 
     * There may be cases in which marker data is not fully known until further audio processing is done. In these
     * cases, and other casers where marker data has changed, calling this block with marker data that contains
     * perviously delivered audio buffer ranges will replace that audio buffer range's marker data, as it will be
     * considered stale.
     */
    @Generated
    @Selector("speechSynthesisOutputMetadataBlock")
    @ObjCBlock(name = "call_speechSynthesisOutputMetadataBlock_ret")
    public native Block_speechSynthesisOutputMetadataBlock_ret speechSynthesisOutputMetadataBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_speechSynthesisOutputMetadataBlock_ret {
        @Generated
        void call_speechSynthesisOutputMetadataBlock_ret(NSArray<? extends AVSpeechSynthesisMarker> markers,
                AVSpeechSynthesisProviderRequest speechRequest);
    }

    /**
     * Returns the voices this audio unit has available and ready for synthesis.
     * 
     * This method should fetch and return the voices ready to synthesize that a user can select from (usually through
     * Settings).
     * Required for speech synthesizer audio unit extensions. An audio unit with a dynamic list of voices can override
     * this property's getter to perform a more complex fetch.
     */
    @Generated
    @Selector("speechVoices")
    public native NSArray<? extends AVSpeechSynthesisProviderVoice> speechVoices();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Sends a new speech request to be synthesized
     * 
     * Sends a new speech request to the synthesizer to render. When the synthesizer audio unit is finished generating
     * audio buffers for the speech request, it should indicate this within its internal render block, @c
     * AUInternalRenderBlock, specifically through the @c AudioUnitRenderActionFlags flag @c
     * kAudioOfflineUnitRenderAction_Complete.
     */
    @Generated
    @Selector("synthesizeSpeechRequest:")
    public native void synthesizeSpeechRequest(AVSpeechSynthesisProviderRequest speechRequest);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}