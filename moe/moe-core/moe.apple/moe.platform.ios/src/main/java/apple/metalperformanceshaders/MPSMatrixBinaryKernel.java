package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLOrigin;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSMatrixBinaryKernel
 * [@dependency] This depends on Metal.framework
 * <p>
 * A MPSMatrixBinaryKernel consumes two MPSMatrix objects and produces
 * one MPSMatrix object.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixBinaryKernel extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixBinaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixBinaryKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixBinaryKernel allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] batchSize
     * <p>
     * The number of matrices in the batch to process. This property
     * is modifiable and by default allows all matrices available at
     * encoding time to be processed. If a single matrix should be
     * processed set this value to 1.
     */
    @Generated
    @Selector("batchSize")
    @NUInt
    public native long batchSize();

    /**
     * [@property] batchStart
     * <p>
     * The index of the first matrix in the batch. This property is
     * modifiable and defaults to 0 at initialization time. If
     * batch processing should begin at a different matrix this value
     * should be modified prior to encoding the kernel.
     */
    @Generated
    @Selector("batchStart")
    @NUInt
    public native long batchStart();

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
    public native MPSMatrixBinaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixBinaryKernel initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixBinaryKernel initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixBinaryKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSMatrixBinaryKernel new_objc();

    /**
     * [@property] primarySourceMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the primary source matrix, at which to
     * start reading values. This property is modifiable and defaults to
     * [0, 0] at initialization time. If a different origin is desired then
     * this should be modified prior to encoding the kernel. The z value
     * must be 0.
     */
    @Generated
    @Selector("primarySourceMatrixOrigin")
    @ByValue
    public native MTLOrigin primarySourceMatrixOrigin();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] resultMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the result matrix, at which to
     * start writing results. This property is modifiable and defaults
     * to [0, 0] at initialization time. If a different origin is desired
     * then this should be modified prior to encoding the kernel. The z
     * value must be 0.
     */
    @Generated
    @Selector("resultMatrixOrigin")
    @ByValue
    public native MTLOrigin resultMatrixOrigin();

    /**
     * [@property] secondarySourceMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the secondary source matrix, at which to
     * start reading values. This property is modifiable and defaults to
     * [0, 0] at initialization time. If a different origin is desired then
     * this should be modified prior to encoding the kernel. The z value
     * must be 0.
     */
    @Generated
    @Selector("secondarySourceMatrixOrigin")
    @ByValue
    public native MTLOrigin secondarySourceMatrixOrigin();

    /**
     * [@property] batchSize
     * <p>
     * The number of matrices in the batch to process. This property
     * is modifiable and by default allows all matrices available at
     * encoding time to be processed. If a single matrix should be
     * processed set this value to 1.
     */
    @Generated
    @Selector("setBatchSize:")
    public native void setBatchSize(@NUInt long value);

    /**
     * [@property] batchStart
     * <p>
     * The index of the first matrix in the batch. This property is
     * modifiable and defaults to 0 at initialization time. If
     * batch processing should begin at a different matrix this value
     * should be modified prior to encoding the kernel.
     */
    @Generated
    @Selector("setBatchStart:")
    public native void setBatchStart(@NUInt long value);

    /**
     * [@property] primarySourceMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the primary source matrix, at which to
     * start reading values. This property is modifiable and defaults to
     * [0, 0] at initialization time. If a different origin is desired then
     * this should be modified prior to encoding the kernel. The z value
     * must be 0.
     */
    @Generated
    @Selector("setPrimarySourceMatrixOrigin:")
    public native void setPrimarySourceMatrixOrigin(@ByValue MTLOrigin value);

    /**
     * [@property] resultMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the result matrix, at which to
     * start writing results. This property is modifiable and defaults
     * to [0, 0] at initialization time. If a different origin is desired
     * then this should be modified prior to encoding the kernel. The z
     * value must be 0.
     */
    @Generated
    @Selector("setResultMatrixOrigin:")
    public native void setResultMatrixOrigin(@ByValue MTLOrigin value);

    /**
     * [@property] secondarySourceMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the secondary source matrix, at which to
     * start reading values. This property is modifiable and defaults to
     * [0, 0] at initialization time. If a different origin is desired then
     * this should be modified prior to encoding the kernel. The z value
     * must be 0.
     */
    @Generated
    @Selector("setSecondarySourceMatrixOrigin:")
    public native void setSecondarySourceMatrixOrigin(@ByValue MTLOrigin value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
