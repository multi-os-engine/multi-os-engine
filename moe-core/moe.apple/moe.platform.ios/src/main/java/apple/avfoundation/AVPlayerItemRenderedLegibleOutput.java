package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVPlayerItemRenderedLegibleOutputPushDelegate;
import apple.corefoundation.struct.CGSize;
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
 * AVPlayerItemRenderedLegibleOutput
 * 
 * A subclass of AVPlayerItemOutput that can vend media with a legible characteristic as rendered CVPixelBufferRefs.
 * 
 * An instance of AVPlayerItemRenderedLegibleOutput is initialized using the -init method.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemRenderedLegibleOutput extends AVPlayerItemOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemRenderedLegibleOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] advanceIntervalForDelegateInvocation
     * 
     * Permits advance invocation of the associated delegate, if any.
     * 
     * If it is possible, an AVPlayerItemRenderedLegibleOutput will message its delegate
     * advanceIntervalForDelegateInvocation seconds earlier than otherwise. If the value you provide is large,
     * effectively requesting provision of samples earlier than the AVPlayerItemRenderedLegibleOutput is prepared to act
     * on them, the delegate will be invoked as soon as possible.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("advanceIntervalForDelegateInvocation")
    public native double advanceIntervalForDelegateInvocation();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemRenderedLegibleOutput alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVPlayerItemRenderedLegibleOutput allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * The delegate is held using a zeroing-weak reference, so this property will have a value of nil after a delegate
     * that was previously set has been deallocated. This property is not key-value observable.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native AVPlayerItemRenderedLegibleOutputPushDelegate delegate();

    /**
     * [@property] delegateQueue
     * 
     * The dispatch queue where the delegate is messaged.
     * 
     * This property is not key-value observable.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("delegateQueue")
    @Nullable
    public native dispatch_queue_t delegateQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVPlayerItemRenderedLegibleOutput init();

    /**
     * initWithVideoDisplaySize:
     * 
     * Creates an instance of AVPlayerItemRenderedLegibleOutput.
     * 
     * This is the only available initializer for AVPlayerItemRenderedLegibleOutput. The client can also choose to reset
     * videoDisplaySize after initialization or during playback. Initializing and resetting videoDisplaySize with a zero
     * height or width will result in an exception being thrown.
     * 
     * API-Since: 18.0
     * 
     * @param videoDisplaySize
     *                         CGSize for the video display area
     */
    @Generated
    @Selector("initWithVideoDisplaySize:")
    public native AVPlayerItemRenderedLegibleOutput initWithVideoDisplaySize(@ByValue CGSize videoDisplaySize);

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
    public static native AVPlayerItemRenderedLegibleOutput new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] advanceIntervalForDelegateInvocation
     * 
     * Permits advance invocation of the associated delegate, if any.
     * 
     * If it is possible, an AVPlayerItemRenderedLegibleOutput will message its delegate
     * advanceIntervalForDelegateInvocation seconds earlier than otherwise. If the value you provide is large,
     * effectively requesting provision of samples earlier than the AVPlayerItemRenderedLegibleOutput is prepared to act
     * on them, the delegate will be invoked as soon as possible.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAdvanceIntervalForDelegateInvocation:")
    public native void setAdvanceIntervalForDelegateInvocation(double value);

    /**
     * setDelegate:queue:
     * 
     * Sets the receiver's delegate and a dispatch queue on which the delegate will be called.
     * 
     * The delegate is held using a zeroing-weak reference, so it is safe to deallocate the delegate while the receiver
     * still has a reference to it.
     * 
     * API-Since: 18.0
     * 
     * @param delegate
     *                      An object conforming to AVPlayerItemRenderedLegibleOutputPushDelegate protocol.
     * @param delegateQueue
     *                      A dispatch queue on which all delegate methods will be called.
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(
            @Mapped(ObjCObjectMapper.class) @Nullable AVPlayerItemRenderedLegibleOutputPushDelegate delegate,
            @Nullable dispatch_queue_t delegateQueue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] videoDisplaySize
     * 
     * Permits rendering of pixel buffers according to the set width and height
     * 
     * The client is expected to set videodisplay size during init and may also set it again during playback. The pixel
     * buffers will be rendered according to the set width and height of display area. If this property is set during
     * the presentation time of a vended caption image, a new caption image rendered according to new videoDisplaySize,
     * will be vended out. Setting this property with a zero height or width will result in an exception being thrown
     * and it is client's responsibility to handle it using appropriate catch block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setVideoDisplaySize:")
    public native void setVideoDisplaySize(@ByValue CGSize value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] videoDisplaySize
     * 
     * Permits rendering of pixel buffers according to the set width and height
     * 
     * The client is expected to set videodisplay size during init and may also set it again during playback. The pixel
     * buffers will be rendered according to the set width and height of display area. If this property is set during
     * the presentation time of a vended caption image, a new caption image rendered according to new videoDisplaySize,
     * will be vended out. Setting this property with a zero height or width will result in an exception being thrown
     * and it is client's responsibility to handle it using appropriate catch block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("videoDisplaySize")
    @ByValue
    public native CGSize videoDisplaySize();
}