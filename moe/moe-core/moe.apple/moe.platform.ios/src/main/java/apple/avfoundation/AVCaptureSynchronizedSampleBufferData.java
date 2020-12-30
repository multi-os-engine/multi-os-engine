package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMSampleBufferRef;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class AVCaptureSynchronizedSampleBufferData
 * @abstract
 *    An concrete subclass of AVCaptureSynchronizedData representing the data delivered by an AVCaptureVideoDataOutput or AVCaptureAudioDataOutput.
 * 
 * @discussion
 *    Synchronized sample buffer data is valid for the duration of AVCaptureDataOutputSynchronizer's -dataOutputSynchronizer:didOutputSynchronizedData: delegate callback. To extend the sample buffer data beyond the callback, you must CFRetain it, and later call CFRelease when you're done with it.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureSynchronizedSampleBufferData extends AVCaptureSynchronizedData {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureSynchronizedSampleBufferData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureSynchronizedSampleBufferData alloc();

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

    /**
     * @property droppedReason
     * @abstract
     *    If sampleBufferWasDropped is YES, the reason for the drop, otherwise AVCaptureOutputDataDroppedReasonNone.
     * 
     * @discussion
     *    AVCaptureOutputDataDroppedReasons are defined in AVCaptureOutputBase.h.
     */
    @Generated
    @Selector("droppedReason")
    @NInt
    public native long droppedReason();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureSynchronizedSampleBufferData init();

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

    /**
     * @property sampleBuffer
     * @abstract
     *    A sample buffer containing video or audio data.
     * 
     * @discussion
     *    If sampleBufferWasDropped is YES, the returned sampleBuffer was dropped before it could be delivered to you, and thus this sample buffer is a shell containing metadata and format information, but no actual pixel data. This property is never NULL. If a data output has no data to return, it is simply not present in the dictionary of synchronized data returned by AVCaptureDataOutputSynchronizer's -dataOutputSynchronizer:didOutputSynchronizedData: delegate callback.
     */
    @Generated
    @Selector("sampleBuffer")
    public native CMSampleBufferRef sampleBuffer();

    /**
     * @property sampleBufferWasDropped
     * @abstract
     *    YES if the sample buffer was dropped.
     * 
     * @discussion
     *    AVCaptureVideoDataOutput has a delegate callback for dropped sample buffers. AVCaptureAudioDataOutput does not. Therefore, sampleBufferWasDropped may be YES for video, but never for audio.
     */
    @Generated
    @Selector("sampleBufferWasDropped")
    public native boolean sampleBufferWasDropped();

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