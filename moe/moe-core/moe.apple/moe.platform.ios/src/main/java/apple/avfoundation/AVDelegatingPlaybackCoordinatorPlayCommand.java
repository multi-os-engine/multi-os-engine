package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
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
 * AVDelegatingPlaybackCoordinatorPlayCommand
 * 
 * A playback command requesting playback with specific timing.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVDelegatingPlaybackCoordinatorPlayCommand extends AVDelegatingPlaybackCoordinatorPlaybackControlCommand {
    static {
        NatJ.register();
    }

    @Generated
    protected AVDelegatingPlaybackCoordinatorPlayCommand(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVDelegatingPlaybackCoordinatorPlayCommand alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVDelegatingPlaybackCoordinatorPlayCommand allocWithZone(VoidPtr zone);

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

    /**
     * [@property] hostClockTime
     * 
     * This is the host clock time (see CMClockGetHostTimeClock()) defining when playback should start (or should have
     * started) at the given itemTime.
     */
    @Generated
    @Selector("hostClockTime")
    @ByValue
    public native CMTime hostClockTime();

    @Generated
    @Selector("init")
    public native AVDelegatingPlaybackCoordinatorPlayCommand init();

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

    /**
     * [@property] itemTime
     * 
     * The itemTime that playback should begin at.
     * 
     * The receiver of this command should verify that data is loaded for the requested time and potentially begin
     * loading it before beginning playback.
     * It is not important to load data for time exactly. If data "similar" to time is already loaded, it is acceptable
     * to start playback with the loaded data. Playback should still start with the requested timing.
     * Should the receiver be unable to start with the exact requested timing, playback will be out of sync with the
     * group.
     * If data for the requested time cannot be loaded, or playback stalls later, the command handler may want to
     * indicate this to the coordinator by beginning a suspension with
     * AVCoordinatedPlaybackSuspensionReasonStallRecovery.
     */
    @Generated
    @Selector("itemTime")
    @ByValue
    public native CMTime itemTime();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVDelegatingPlaybackCoordinatorPlayCommand new_objc();

    /**
     * [@property] rate
     * 
     * Playback rate. Will always be non-zero.
     */
    @Generated
    @Selector("rate")
    public native float rate();

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
