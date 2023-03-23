package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphRandomOpDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphRandomOpDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphRandomOpDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSGraphRandomOpDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * [@property] dataType
     * 
     * The data type of the generated result values.
     * When sampling from the uniform distribution, valid types are MPSDataTypeFloat16,
     * MPSDataTypeFloat32, and MPSDataTypeInt32.
     * When sampling from the normal or truncated normal distribution, valid types are
     * MPSDataTypeFloat16 and MPSDataTypeFloat32.
     */
    @Generated
    @Selector("dataType")
    public native int dataType();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("descriptorWithDistribution:dataType:")
    public static native MPSGraphRandomOpDescriptor descriptorWithDistributionDataType(long distribution, int dataType);

    /**
     * [@property] distribution
     * 
     * The type of distribution to draw samples from. See MPSGraphRandomDistribution.
     */
    @Generated
    @Selector("distribution")
    public native long distribution();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphRandomOpDescriptor init();

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

    /**
     * [@property] max
     * 
     * The upper range of the distribution. This value is used for Uniform distributions with float data types and
     * Truncated Normal disributions.
     * Defaults to 1 for uniform distributions and 2 for normal distributions.
     */
    @Generated
    @Selector("max")
    public native float max();

    /**
     * [@property] maxInteger
     * 
     * The upper range of the distribution. This value is used for Uniform with integer data types
     * Defaults to INT32_MAX for uniform distributions and 0 for normal distributions.
     */
    @Generated
    @Selector("maxInteger")
    @NInt
    public native long maxInteger();

    /**
     * [@property] mean
     * 
     * The mean of the distribution. This value is used for Normal and Truncated Normal disributions.
     * Defaults to 0.
     */
    @Generated
    @Selector("mean")
    public native float mean();

    /**
     * [@property] min
     * 
     * The lower range of the distribution. This value is used for Uniform distributions with float data types and
     * Truncated Normal disributions.
     * Defaults to 0 for uniform distributions and -2 for normal distributions.
     */
    @Generated
    @Selector("min")
    public native float min();

    /**
     * [@property] minInteger
     * 
     * The lower range of the distribution. This value is used for Uniform with integer data types
     * Defaults to 0.
     */
    @Generated
    @Selector("minInteger")
    @NInt
    public native long minInteger();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphRandomOpDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] samplingMethod
     * 
     * The sampling method of the distribution. This value is used for Normal and Truncated Normal disributions. See
     * MPSGraphRandomNormalSamplingMethod.
     * Defaults to MPSGraphRandomNormalSamplingInvCDF.
     */
    @Generated
    @Selector("samplingMethod")
    public native long samplingMethod();

    /**
     * [@property] dataType
     * 
     * The data type of the generated result values.
     * When sampling from the uniform distribution, valid types are MPSDataTypeFloat16,
     * MPSDataTypeFloat32, and MPSDataTypeInt32.
     * When sampling from the normal or truncated normal distribution, valid types are
     * MPSDataTypeFloat16 and MPSDataTypeFloat32.
     */
    @Generated
    @Selector("setDataType:")
    public native void setDataType(int value);

    /**
     * [@property] distribution
     * 
     * The type of distribution to draw samples from. See MPSGraphRandomDistribution.
     */
    @Generated
    @Selector("setDistribution:")
    public native void setDistribution(long value);

    /**
     * [@property] max
     * 
     * The upper range of the distribution. This value is used for Uniform distributions with float data types and
     * Truncated Normal disributions.
     * Defaults to 1 for uniform distributions and 2 for normal distributions.
     */
    @Generated
    @Selector("setMax:")
    public native void setMax(float value);

    /**
     * [@property] maxInteger
     * 
     * The upper range of the distribution. This value is used for Uniform with integer data types
     * Defaults to INT32_MAX for uniform distributions and 0 for normal distributions.
     */
    @Generated
    @Selector("setMaxInteger:")
    public native void setMaxInteger(@NInt long value);

    /**
     * [@property] mean
     * 
     * The mean of the distribution. This value is used for Normal and Truncated Normal disributions.
     * Defaults to 0.
     */
    @Generated
    @Selector("setMean:")
    public native void setMean(float value);

    /**
     * [@property] min
     * 
     * The lower range of the distribution. This value is used for Uniform distributions with float data types and
     * Truncated Normal disributions.
     * Defaults to 0 for uniform distributions and -2 for normal distributions.
     */
    @Generated
    @Selector("setMin:")
    public native void setMin(float value);

    /**
     * [@property] minInteger
     * 
     * The lower range of the distribution. This value is used for Uniform with integer data types
     * Defaults to 0.
     */
    @Generated
    @Selector("setMinInteger:")
    public native void setMinInteger(@NInt long value);

    /**
     * [@property] samplingMethod
     * 
     * The sampling method of the distribution. This value is used for Normal and Truncated Normal disributions. See
     * MPSGraphRandomNormalSamplingMethod.
     * Defaults to MPSGraphRandomNormalSamplingInvCDF.
     */
    @Generated
    @Selector("setSamplingMethod:")
    public native void setSamplingMethod(long value);

    /**
     * [@property] standardDeviation
     * 
     * The standardDeviation of the distribution. This value is used for Normal and Truncated Normal disributions.
     * For Truncated Normal distribution this defines the standard deviation parameter of the underlying Normal
     * distribution, that is the width
     * of the Gaussian, not the true standard deviation of the truncated distribution which typically differs from the
     * standard deviation of the
     * original Normal distribution.
     * Defaults to 0 for uniform distributions and 1 for normal distributions.
     */
    @Generated
    @Selector("setStandardDeviation:")
    public native void setStandardDeviation(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] standardDeviation
     * 
     * The standardDeviation of the distribution. This value is used for Normal and Truncated Normal disributions.
     * For Truncated Normal distribution this defines the standard deviation parameter of the underlying Normal
     * distribution, that is the width
     * of the Gaussian, not the true standard deviation of the truncated distribution which typically differs from the
     * standard deviation of the
     * original Normal distribution.
     * Defaults to 0 for uniform distributions and 1 for normal distributions.
     */
    @Generated
    @Selector("standardDeviation")
    public native float standardDeviation();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
