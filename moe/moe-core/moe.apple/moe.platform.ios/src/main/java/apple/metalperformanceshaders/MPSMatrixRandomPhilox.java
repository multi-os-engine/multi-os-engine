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
 * MPSMatrixRandomPhilox
 * <p>
 * Generates random numbers using a counter based algorithm.
 * For further details see:
 * John K. Salmon, Mark A. Moraes, Ron O. Dror, and David E. Shaw. Parallel Random Numbers: As Easy as 1, 2, 3.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixRandomPhilox extends MPSMatrixRandom {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixRandomPhilox(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixRandomPhilox alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixRandomPhilox allocWithZone(VoidPtr zone);

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
    public native MPSMatrixRandomPhilox init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixRandomPhilox initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixRandomPhilox initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * initialize a MPSMatrixRandomPhilox filter to generate 32-bit unsigned
     * integer values with an initial seed of 0.
     *
     * @param device The device the filter will run on
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixRandomPhilox initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * initialize a MPSMatrixRandomPhilox filter using a default distribution.
     *
     * @param device              The device the filter will run on
     * @param destinationDataType The data type of the result.
     * @param seed                The seed to initialize the random number generators with.
     */
    @Generated
    @Selector("initWithDevice:destinationDataType:seed:")
    public native MPSMatrixRandomPhilox initWithDeviceDestinationDataTypeSeed(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, int destinationDataType, @NUInt long seed);

    /**
     * initialize a MPSMatrixRandomPhilox filter
     *
     * @param device                 The device the filter will run on
     * @param destinationDataType    The data type of the result.
     * @param seed                   The seed to initialize the random number generators with.
     * @param distributionDescriptor A descriptor containing information about the distribution.
     */
    @Generated
    @Selector("initWithDevice:destinationDataType:seed:distributionDescriptor:")
    public native MPSMatrixRandomPhilox initWithDeviceDestinationDataTypeSeedDistributionDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, int destinationDataType, @NUInt long seed,
            MPSMatrixRandomDistributionDescriptor distributionDescriptor);

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
    public static native MPSMatrixRandomPhilox new_objc();

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
