package apple.avfoundation;

import apple.NSObject;
import apple.coreaudiotypes.struct.AudioBufferList;
import apple.coreaudiotypes.struct.AudioTimeStamp;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class AVAudioSinkNode
 *   @abstract AVAudioSinkNode wraps a client provided block to receive input audio on the audio IO thread.
 *   @discussion
 *       AVAudioSinkNode is restricted to be used in the input chain and does not support format
 *       conversion. Hence when connecting to an AVAudioSinkNode node, the format for the connection
 *       should be the output scope format of the input node (essentialy the format should match the input hardware
 * 	sample rate).
 * 
 * The voice processing IO unit is an exception to the above as it supports sample rate conversion. 
 *       The input scope format (HW format) and output scope format (client format) of the input node can differ 
 *       in that case.
 * 
 *       This node is only supported when the engine is rendering to the audio device and not in
 *       manual rendering mode.
 * 
 *       AVAudioSinkNode does not have an output bus and therefore it does not support tapping.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSinkNode extends AVAudioNode {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioSinkNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSinkNode alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    public native AVAudioSinkNode init();

    /**
     * @method initWithReceiverBlock:
     * @abstract Create a node with a receiver block.
     * @param block
     *     The block that receives audio data from the input.
     * @discussion
     *     The receiver block is called when the input data is available.
     * 
     *     The block will be called on the realtime thread and it is the client's responsibility to
     *     handle it in a thread-safe manner and to not make any blocking calls.
     * 
     *     The audio format for the input bus will be set from the connection format when connecting
     *     to another node.
     * 
     *     The audio format for the data received by the block will be set to the node's input format.
     */
    @Generated
    @Selector("initWithReceiverBlock:")
    public native AVAudioSinkNode initWithReceiverBlock(
            @ObjCBlock(name = "call_initWithReceiverBlock") Block_initWithReceiverBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithReceiverBlock {
        @Generated
        int call_initWithReceiverBlock(
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp timestamp,
                int frameCount,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList inputData);
    }

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}