package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCoordinatedPlaybackSuspension
 * <p>
 * A representation of a temporary break in participation.
 * [@note]		See AVPlaybackCoordinator's beginSuspensionForReason: method for details on use.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCoordinatedPlaybackSuspension extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCoordinatedPlaybackSuspension(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCoordinatedPlaybackSuspension alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVCoordinatedPlaybackSuspension allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]	beginDate
     * <p>
     * The begin time of the suspension.
     */
    @Generated
    @Selector("beginDate")
    public native NSDate beginDate();

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

    /**
     * end
     * <p>
     * Ends the suspension.
     * <p>
     * If this is the last suspension, the coordinator will adjust timing of its playback object to match the group.
     * Also see endProposingNewTime: for a way to end a suspension and simultaneously proposing a new time to the group.
     */
    @Generated
    @Selector("end")
    public native void end();

    /**
     * endProposingNewTime:
     * <p>
     * Ends the suspension and proposes a new time that everyone should seek to.
     * <p>
     * If this is the last suspension, the coordinator will propose the new time to the group without changing the groups playback rate.
     * If this is not the last suspension, the time will be ignored.
     * If the time is not numeric, this will behave like a call to [suspension end].
     */
    @Generated
    @Selector("endProposingNewTime:")
    public native void endProposingNewTime(@ByValue CMTime time);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCoordinatedPlaybackSuspension init();

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
    public static native AVCoordinatedPlaybackSuspension new_objc();

    /**
     * [@property]	reason
     * <p>
     * The reason for the suspension. This will be communicated to other participants while coordination is suspended.
     */
    @Generated
    @Selector("reason")
    public native String reason();

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
