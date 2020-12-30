package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLCounterSampleBuffer;
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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLBlitPassSampleBufferAttachmentDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLBlitPassSampleBufferAttachmentDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLBlitPassSampleBufferAttachmentDescriptor alloc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @property endOfEncoderSampleIndex
     * @abstract The sample index to use to store the sample taken at the end of
     * Command encoder processing.  Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * @discussion On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a blit pass will fail.
     */
    @Generated
    @Selector("endOfEncoderSampleIndex")
    @NUInt
    public native long endOfEncoderSampleIndex();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLBlitPassSampleBufferAttachmentDescriptor init();

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
     * @abstract The sample buffer to store samples for the blit-pass defined samples.
     * If sampleBuffer is non-nil, the sample indices will be used to store samples into
     * the sample buffer.  If no sample buffer is provided, no samples will be taken.
     * If any of the sample indices are specified as MTLCounterDontSample, no sample
     * will be taken for that action.
     */
    @Generated
    @Selector("sampleBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCounterSampleBuffer sampleBuffer();

    /**
     * @property endOfEncoderSampleIndex
     * @abstract The sample index to use to store the sample taken at the end of
     * Command encoder processing.  Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * @discussion On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a blit pass will fail.
     */
    @Generated
    @Selector("setEndOfEncoderSampleIndex:")
    public native void setEndOfEncoderSampleIndex(@NUInt long value);

    /**
     * @property sampleBuffer
     * @abstract The sample buffer to store samples for the blit-pass defined samples.
     * If sampleBuffer is non-nil, the sample indices will be used to store samples into
     * the sample buffer.  If no sample buffer is provided, no samples will be taken.
     * If any of the sample indices are specified as MTLCounterDontSample, no sample
     * will be taken for that action.
     */
    @Generated
    @Selector("setSampleBuffer:")
    public native void setSampleBuffer(@Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer value);

    /**
     * @property startOfEncoderSampleIndex
     * @abstract The sample index to use to store the sample taken at the start of
     * command encoder processing.  Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * @discussion On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a blit pass will fail.
     */
    @Generated
    @Selector("setStartOfEncoderSampleIndex:")
    public native void setStartOfEncoderSampleIndex(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @property startOfEncoderSampleIndex
     * @abstract The sample index to use to store the sample taken at the start of
     * command encoder processing.  Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * @discussion On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a blit pass will fail.
     */
    @Generated
    @Selector("startOfEncoderSampleIndex")
    @NUInt
    public native long startOfEncoderSampleIndex();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}