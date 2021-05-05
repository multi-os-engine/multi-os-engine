package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNNGramMatrixCalculation
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSNNGramMatrixCalculation filter specifies a layer which computes the uncentered cross-correlation
 *             values between the image planes of each feature channel of an image. If the input image batch is
 *             x = x[b, y, x, c], where 'b' is batch index, 'y' and 'x' are the image coordinate and
 *             'c' is the feature channel index then this filter computes the values:
 * 
 *             y = y[b, 1, f, c] = alpha * sum_{x,y} x[b,y,x,f] * x[b,y,x,c], where
 * 
 *             'alpha' is a scaling factor. This operation can be interpreted to be computing all combinations
 *             of fully connected layers between the different image planes of the input image. The results
 *             are stored in the feature channel and 'x'-coordinate indices of the output batch.
 *             The operation is performed independently on different images in the batch.
 * 
 *             NOTE: Due to the nature of the operation this filter specifies a special padding policy
 *             and hence does not support non-default offset or cliprect properties.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNGramMatrixCalculation extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNGramMatrixCalculation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNGramMatrixCalculation alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * [@property]   alpha
     * 
     * Scaling factor for the output. Default: 1.0f.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

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
    public native MPSNNGramMatrixCalculation init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNGramMatrixCalculation initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     *             -initWithCoder: should work, since the file can't
     *             know which device your data is allocated on, we
     *             have to guess and may guess incorrectly.  To avoid
     *             that problem, use initWithCoder:device instead.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSKernel
     * @param      device      The MTLDevice on which to make the MPSKernel
     * @return     A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNGramMatrixCalculation initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a MPSNNGramMatrixCalculation kernel with scaling factor alpha = 1.0f.
     * 
     * @param      device      The MTLDevice on which this MPSNNGramMatrixCalculation filter will be used.
     * @return     A valid MPSNNGramMatrixCalculation object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNNGramMatrixCalculation initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a MPSNNGramMatrixCalculation kernel.
     * 
     * @param      device      The MTLDevice on which this MPSNNGramMatrixCalculation filter will be used.
     * @param      alpha       Scaling factor for the output.
     * @return     A valid MPSNNGramMatrixCalculation object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:alpha:")
    public native MPSNNGramMatrixCalculation initWithDeviceAlpha(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            float alpha);

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
     * [@property]   alpha
     * 
     * Scaling factor for the output. Default: 1.0f.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(float value);

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