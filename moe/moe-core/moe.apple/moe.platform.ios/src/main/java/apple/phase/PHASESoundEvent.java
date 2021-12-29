package apple.phase;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * [@interface] PHASESoundEvent
 * <p>
 * A PHASESoundEvent is an object that represents a playable sound event in the PHASE system.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASESoundEvent extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASESoundEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASESoundEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASESoundEvent allocWithZone(VoidPtr zone);

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
    public native PHASESoundEvent init();

    /**
     * initWithEngine:assetIdentifier:error
     * <p>
     * Creates a new sound event instance
     * <p>
     * This will look up the asset in the asset registry and create the necessary objects to play the sound event
     *
     * @param engine          The PHASEEngine object that the sound event will be played by.
     * @param assetIdentifier The identifier registered with the Asset Registry for the particular PHASESoundEventNodeAsset that this sound event will play.
     *                        If the asset identifier is not registered, this function will fail.
     */
    @Generated
    @Selector("initWithEngine:assetIdentifier:error:")
    public native PHASESoundEvent initWithEngineAssetIdentifierError(PHASEEngine engine, String assetIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * initWithEngine:assetIdentifier:mixerParameters:error
     * <p>
     * Creates a new sound event instance
     * <p>
     * This will look up the asset in the asset registry and create the necessary objects to play the sound event
     *
     * @param engine          The PHASEEngine object that the sound event will be played by.
     * @param assetIdentifier The identifier registered with the Asset Registry for the particular PHASESoundEventNodeAsset that this sound instance will play.
     *                        If the asset identifier is not registered, this function will fail.
     * @param mixerParameters A dictionary of PHASEMixerParameters objects with keys that match the identifiers of the spatial mixers in the sound event
     */
    @Generated
    @Selector("initWithEngine:assetIdentifier:mixerParameters:error:")
    public native PHASESoundEvent initWithEngineAssetIdentifierMixerParametersError(PHASEEngine engine,
            String assetIdentifier, PHASEMixerParameters mixerParameters,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
     * [@property] indefinite
     * <p>
     * A boolean that tell if this sound event will run indefinitely, or finish executing on its own
     */
    @Generated
    @Selector("isIndefinite")
    public native boolean isIndefinite();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] metaParameters
     * <p>
     * A Dictionary containing the MetaParameters associated with this sound event
     */
    @Generated
    @Selector("metaParameters")
    public native NSDictionary<String, ? extends PHASEMetaParameter> metaParameters();

    /**
     * [@property] mixNodes
     * <p>
     * A Dictionary containing the mix nodes associated with this sound event
     */
    @Generated
    @Selector("mixers")
    public native NSDictionary<String, ? extends PHASEMixer> mixers();

    @Generated
    @Owned
    @Selector("new")
    public static native PHASESoundEvent new_objc();

    /**
     * pause
     * <p>
     * Pause the sound event.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * [@property] prepareState
     * <p>
     * Sound Event's current preparation state
     */
    @Generated
    @Selector("prepareState")
    @NInt
    public native long prepareState();

    /**
     * prepareWithCompletion
     * <p>
     * Prepare the sound event
     * <p>
     * This function notifies the engine to begin preparing a sound event, then returns immediately.
     * Once the sound event is prepared (or has failed to prepare), you will receive a callback via the completion.
     * If you call startWithCompletion() before receiving the callback, the sound event will start as soon as it's prepared.
     *
     * @param handler The block that will be called when the PHASESoundEvent has finished preparing and is ready to start. Pass in nil for no handler.
     */
    @Generated
    @Selector("prepareWithCompletion:")
    public native void prepareWithCompletion(
            @ObjCBlock(name = "call_prepareWithCompletion") Block_prepareWithCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareWithCompletion {
        @Generated
        void call_prepareWithCompletion(@NInt long reason);
    }

    /**
     * [@property] pushStreamNodes
     * <p>
     * A Dictionary containing the push stream nodes associated with this sound event, for pushing buffers to.
     */
    @Generated
    @Selector("pushStreamNodes")
    public native NSDictionary<String, ? extends PHASEPushStreamNode> pushStreamNodes();

    /**
     * [@property] renderingState
     * <p>
     * Sound Event's current rendering state
     */
    @Generated
    @Selector("renderingState")
    @NInt
    public native long renderingState();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * resume
     * <p>
     * Resume the sound event.
     */
    @Generated
    @Selector("resume")
    public native void resume();

    /**
     * seekToTime:completion
     * <p>
     * Seeks all leaf nodes in a PHASESoundEvent to a specified time relative to the start of the sound event.
     * <p>
     * This function notifies the engine to seek the sound event, then returns immediately.
     * Once the sound event has seeked to the new offset (or has failed to seek), you will receive a callback via the completion.
     * If any leaf nodes do not support seeking, those nodes will ignore this command.
     * Nodes that have finished playing or have stopped will not seek.
     * Nodes that are sleeping will seek, and will resume at the correct time when they wake up.
     * [@note]
     * The time is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     */
    @Generated
    @Selector("seekToTime:completion:")
    public native void seekToTimeCompletion(double time,
            @ObjCBlock(name = "call_seekToTimeCompletion") Block_seekToTimeCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeCompletion {
        @Generated
        void call_seekToTimeCompletion(@NInt long reason);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * startWithCompletion
     * <p>
     * Start the sound event
     * <p>
     * This function notifies the engine to start the sound event, then returns immediately.
     * Once the sound event is playing (or has failed to start), you will receive a callback via the completion.
     * Playback will begin immediately if the sound event has been prepared; otherwise, it will start as soon as it is finished preparing.
     *
     * @param handler The block that will be called when the sound event has stopped.
     */
    @Generated
    @Selector("startWithCompletion:")
    public native void startWithCompletion(
            @ObjCBlock(name = "call_startWithCompletion") Block_startWithCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWithCompletion {
        @Generated
        void call_startWithCompletion(@NInt long reason);
    }

    /**
     * stopAndInvalidate
     * <p>
     * stop and invalidate the sound event
     */
    @Generated
    @Selector("stopAndInvalidate")
    public native void stopAndInvalidate();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
