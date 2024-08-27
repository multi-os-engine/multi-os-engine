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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSMatrixRandomPhilox
 * 
 * Generates random numbers using a counter based algorithm.
 * For further details see:
 * John K. Salmon, Mark A. Moraes, Ron O. Dror, and David E. Shaw. Parallel Random Numbers: As Easy as 1, 2, 3.
 * 
 * API-Since: 13.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixRandomPhilox allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
    public native MPSMatrixRandomPhilox initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixRandomPhilox initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * initialize a MPSMatrixRandomPhilox filter to generate 32-bit unsigned
     * integer values with an initial seed of 0.
     * 
     * @param device The device the filter will run on
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixRandomPhilox initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, int destinationDataType, @NUInt long seed);

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
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, int destinationDataType, @NUInt long seed,
            @NotNull MPSMatrixRandomDistributionDescriptor distributionDescriptor);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
