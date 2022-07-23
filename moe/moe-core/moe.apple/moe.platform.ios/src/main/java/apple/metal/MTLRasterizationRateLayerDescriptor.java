package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.struct.MTLSize;
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
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] MTLRasterizationRateLayerDescriptor
 * <p>
 * Describes the minimum rasterization rate screen space using two piecewise linear functions.
 * <p>
 * The two piecewise linear function (PLF) describe the desired rasterization quality on the horizontal and vertical
 * axis separately.
 * Each quality sample in the PLF is stored in an array as single precision floating point value between 0 (lowest
 * quality) and 1 (highest quality).
 * The first sample in the array describes the quality at the top (vertical) or left (horizontal) edge of screen space.
 * The last sample in the array describes the quality at the bottom (vertical) or right (horizontal) edge of screen
 * space.
 * All other samples are spaced equidistant in screen space.
 * MTLRasterizationRateLayerDescriptor instances will be stored inside a MTLRasterizationRateMapDescriptor which in turn
 * is compiled by MTLDevice into a MTLRasterizationRateMap.
 * Because MTLDevice may not support the requested granularity, the provided samples may be rounded up (towards higher
 * quality) during compilation.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLRasterizationRateLayerDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRasterizationRateLayerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRasterizationRateLayerDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLRasterizationRateLayerDescriptor allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] horizontal
     * <p>
     * Provide convenient bounds-checked access to the quality samples stored in the descriptor.
     *
     * @return Returns a syntactic sugar helper to get or set sample values on the horizontal axis.
     */
    @Generated
    @Selector("horizontal")
    public native MTLRasterizationRateSampleArray horizontal();

    /**
     * [@property] horizontalSampleStorage
     * <p>
     * Provide direct access to the quality samples stored in the descriptor.
     * <p>
     * The returned pointer points to the first element of an array of sampleCount.width elements.
     *
     * @return Pointer to the (mutable) storage array for samples on the horizontal axis.
     */
    @Generated
    @Selector("horizontalSampleStorage")
    public native FloatPtr horizontalSampleStorage();

    @Generated
    @Selector("init")
    public native MTLRasterizationRateLayerDescriptor init();

    /**
     * initWithSampleCount:
     * <p>
     * Initialize a descriptor for a layer with the given number of quality samples on the horizontal and vertical axis.
     * <p>
     * All values are initialized to zero.
     *
     * @param sampleCount The width and height components are the number of samples on the horizontal and vertical axis
     *                    respectively. The depth component is ignored.
     */
    @Generated
    @Selector("initWithSampleCount:")
    public native MTLRasterizationRateLayerDescriptor initWithSampleCount(@ByValue MTLSize sampleCount);

    /**
     * initWithSampleCount:horizontal:vertical:
     * <p>
     * Initialize a descriptor for a layer with the given number of quality samples on the horizontal and vertical axis.
     * <p>
     * Use initWithSampleCount: to initialize with zeroes instead.
     *
     * @param sampleCount The width and height components are the number of samples on the horizontal and vertical axis
     *                    respectively. The depth component is ignored.
     * @param horizontal  The initial sample values on the horizontal axis. Must point to an array of sampleCount.width
     *                    elements, of which the values will be copied into the MTLRasterizationRateLayerDescriptor.
     * @param vertical    The initial sample values on the vertical axis. Must point to an array of sampleCount.height
     *                    elements, of which the values will be copied into the MTLRasterizationRateLayerDescriptor.
     */
    @Generated
    @Selector("initWithSampleCount:horizontal:vertical:")
    public native MTLRasterizationRateLayerDescriptor initWithSampleCountHorizontalVertical(
            @ByValue MTLSize sampleCount, ConstFloatPtr horizontal, ConstFloatPtr vertical);

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
    public static native MTLRasterizationRateLayerDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sampleCount
     *
     * @return The number of quality samples that this descriptor uses to describe its current function, for the
     *         horizontal and vertical axis. The depth component of the returned MTLSize is always 0.
     */
    @Generated
    @Selector("sampleCount")
    @ByValue
    public native MTLSize sampleCount();

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

    /**
     * [@property] vertical
     * <p>
     * Provide convenient bounds-checked access to the quality samples stored in the descriptor.
     *
     * @return Returns a syntactic sugar helper to get or set sample values on the vertical axis.
     */
    @Generated
    @Selector("vertical")
    public native MTLRasterizationRateSampleArray vertical();

    /**
     * [@property] verticalSampleStorage
     * <p>
     * Provide direct access to the quality samples stored in the descriptor.
     * <p>
     * The returned pointer points to the first element of an array of sampleCount.height elements.
     *
     * @return Pointer to the (mutable) storage array for samples on the vertical axis.
     */
    @Generated
    @Selector("verticalSampleStorage")
    public native FloatPtr verticalSampleStorage();

    /**
     * [@property] maxSampleCount
     *
     * @return The maximum number of quality samples that this descriptor can use to describe its function, for the
     *         horizontal and vertical axis, this is the sampleCount that the descriptor was initialized with. The depth
     *         component of the returned MTLSize is always 0.
     */
    @Generated
    @Selector("maxSampleCount")
    @ByValue
    public native MTLSize maxSampleCount();

    /**
     * [@property] sampleCount
     * <p>
     * This declaration adds a setter to the previously (prior to macOS 12.0 and iOS 15.0) read-only property.
     * <p>
     * Setting a value (must be <= maxSampleCount) to allow MTLRasterizationRateLayerDescriptor to be re-used with a
     * different number of samples without having to be recreated.
     */
    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@ByValue MTLSize value);
}
