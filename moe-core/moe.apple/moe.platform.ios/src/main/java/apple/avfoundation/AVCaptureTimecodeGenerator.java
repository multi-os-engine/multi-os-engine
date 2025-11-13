package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVCaptureTimecodeGeneratorDelegate;
import apple.avfoundation.struct.AVCaptureTimecode;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * Generates and synchronizes timecode data from various sources for precise video and audio synchronization.
 * 
 * The ``AVCaptureTimecodeGenerator`` class supports multiple timecode sources, including frame counting, system clock
 * synchronization, and MIDI timecode input (MTC). Suitable for playback, recording, or other time-sensitive operations
 * where precise timecode metadata is required.
 * 
 * Use the ``startSynchronizationWithTimecodeSource:`` method to set up the desired timecode source.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureTimecodeGenerator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureTimecodeGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureTimecodeGenerator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureTimecodeGenerator allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * An array of available timecode synchronization sources that can be used by the timecode generator.
     * 
     * This property provides a list of ``AVCaptureTimecodeSource`` objects representing the available timecode sources
     * with which the generator can synchronize. The sources may include built-in options such as the frame counter and
     * real-time clock, as well as dynamically detected sources such as connected MIDI or HID devices.
     * 
     * This array is key-value observable, allowing you to monitor changes in real-time. For example, when a new MIDI
     * device is connected, the array is updated to include the corresponding timecode source.
     * 
     * - Returns: A read-only array of ``AVCaptureTimecodeSource`` objects representing the available timecode
     * synchronization sources.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("availableSources")
    @NotNull
    public native NSArray<? extends AVCaptureTimecodeSource> availableSources();

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

    /**
     * The active timecode source used by ``AVCaptureTimecodeGenerator`` to maintain clock synchronization for accurate
     * timecode generation.
     * 
     * Indicates the active timecode source, as defined in the ``AVCaptureTimecodeSynchronizationSourceType`` enum. If
     * an ``AVCaptureTimecodeGenerator`` becomes disconnected from its source, it continues generating timecodes using
     * historical data from its ring buffer. This approach allows the generator to maintain synchronization during brief
     * disruptions, as is common in cinema workflows where timecode signals may experience discontinuities.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("currentSource")
    @NotNull
    public native AVCaptureTimecodeSource currentSource();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The delegate that receives timecode updates from the timecode generator.
     * 
     * You can use your ``delegate`` to receive real-time timecode updates. Implement the
     * ``timecodeGenerator:didReceiveUpdate:`` method in your delegate to handle updates.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native AVCaptureTimecodeGeneratorDelegate delegate();

    /**
     * The dispatch queue on which delegate callbacks are invoked.
     * 
     * Provides the queue set in ``setDelegate:queue:``. If no delegate is assigned, this property is `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("delegateCallbackQueue")
    @Nullable
    public native dispatch_queue_t delegateCallbackQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A frame counter timecode source that operates independently of any internal or external synchronization.
     * 
     * This class property represents a standalone timecode source that advances based purely on frame count,
     * independent of any real-time or external synchronization. It is ideal for scenarios where a simple,
     * self-contained timing reference is sufficient, without requiring alignment to system clocks or external devices.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("frameCountSource")
    @NotNull
    public static native AVCaptureTimecodeSource frameCountSource();

    /**
     * Generates an initial timecode intended to be the first in a sequence.
     * 
     * - Returns: A populated ``AVCaptureTimecode`` structure.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("generateInitialTimecode")
    @ByValue
    public native AVCaptureTimecode generateInitialTimecode();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureTimecodeGenerator init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureTimecodeGenerator new_objc();

    /**
     * A predefined timecode source synchronized to the real-time system clock.
     * 
     * This class property provides a default timecode source based on the real-time system clock, requiring no external
     * device. It is ideal for live events or scenarios where alignment with the current time of day is necessary.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("realTimeClockSource")
    @NotNull
    public static native AVCaptureTimecodeSource realTimeClockSource();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Assigns a delegate to receive real-time timecode updates and specifies a queue for callbacks.
     * 
     * - Parameter delegate: An object conforming to the ``AVCaptureTimecodeGeneratorDelegate`` protocol.
     * - Parameter callbackQueue: The dispatch queue on which the delegate methods are invoked. The `callbackQueue`
     * parameter may not be `nil`, except when setting the ``AVCaptureTimecodeGeneratorDelegate`` to `nil`, otherwise
     * ``setDelegate:queue:`` throws an `NSInvalidArgumentException`.
     * 
     * Use this method to configure a delegate that handles timecode updates. The specified `queue` ensures thread-safe
     * invocation of delegate methods.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(
            @Mapped(ObjCObjectMapper.class) @Nullable AVCaptureTimecodeGeneratorDelegate delegate,
            @Nullable dispatch_queue_t callbackQueue);

    /**
     * The maximum time interval allowed for source synchronization attempts before timing out.
     * 
     * This property specifies the duration, in seconds, that the ``AVCaptureTimecodeGenerator`` will attempt to
     * synchronize with a timecode source before timing out if synchronization cannot be achieved. If this threshold is
     * exceeded, the synchronization status updates to reflect a timeout, and your
     * ``AVCaptureTimecodeGeneratorDelegate/timecodeGenerator:transitionedToSynchronizationStatus:forSource:`` delegate
     * method fires, informing you of the event. The default value is 15 seconds.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSynchronizationTimeout:")
    public native void setSynchronizationTimeout(double value);

    /**
     * The time offset, in seconds, applied to the generated timecode.
     * 
     * This offset allows fine-tuning of time alignment for synchronization with external sources or to accommodate any
     * intentional delay. The default value is 0 seconds.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTimecodeAlignmentOffset:")
    public native void setTimecodeAlignmentOffset(double value);

    /**
     * The frame duration that the generator will use to generate timecodes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTimecodeFrameDuration:")
    public native void setTimecodeFrameDuration(@ByValue CMTime value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Synchronizes the generator with the specified timecode source.
     * 
     * - Parameter source: The timecode source for synchronization.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("startSynchronizationWithTimecodeSource:")
    public native void startSynchronizationWithTimecodeSource(@NotNull AVCaptureTimecodeSource source);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The maximum time interval allowed for source synchronization attempts before timing out.
     * 
     * This property specifies the duration, in seconds, that the ``AVCaptureTimecodeGenerator`` will attempt to
     * synchronize with a timecode source before timing out if synchronization cannot be achieved. If this threshold is
     * exceeded, the synchronization status updates to reflect a timeout, and your
     * ``AVCaptureTimecodeGeneratorDelegate/timecodeGenerator:transitionedToSynchronizationStatus:forSource:`` delegate
     * method fires, informing you of the event. The default value is 15 seconds.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("synchronizationTimeout")
    public native double synchronizationTimeout();

    /**
     * The time offset, in seconds, applied to the generated timecode.
     * 
     * This offset allows fine-tuning of time alignment for synchronization with external sources or to accommodate any
     * intentional delay. The default value is 0 seconds.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("timecodeAlignmentOffset")
    public native double timecodeAlignmentOffset();

    /**
     * The frame duration that the generator will use to generate timecodes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("timecodeFrameDuration")
    @ByValue
    public native CMTime timecodeFrameDuration();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}