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
 * MPSCNNUpsamplingBilinear
 * [@dependency] This depends on Metal.framework.
 * <p>
 * Specifies the bilinear spatial upsampling filter.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNUpsamplingBilinear extends MPSCNNUpsampling {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNUpsamplingBilinear(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNUpsamplingBilinear alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNUpsamplingBilinear allocWithZone(VoidPtr zone);

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
    public native MPSCNNUpsamplingBilinear init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNUpsamplingBilinear initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNUpsamplingBilinear initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNUpsamplingBilinear initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the bilinear spatial upsampling filter.
     *
     * @param device              The device the filter will run on.
     * @param integerScaleFactorX The upsampling factor for the x dimension.
     * @param integerScaleFactorY The upsampling factor for the y dimension.
     * @return A valid MPSCNNUpsamplingBilinear object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:integerScaleFactorX:integerScaleFactorY:")
    public native MPSCNNUpsamplingBilinear initWithDeviceIntegerScaleFactorXIntegerScaleFactorY(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long integerScaleFactorX,
            @NUInt long integerScaleFactorY);

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
    public static native MPSCNNUpsamplingBilinear new_objc();

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

    /**
     * Initialize the bilinear spatial upsampling filter.
     *
     * @param device              The device the filter will run on.
     * @param integerScaleFactorX The upsampling factor for the x dimension.
     * @param integerScaleFactorY The upsampling factor for the y dimension.
     * @param alignCorners        Specifier whether the centers of the 4 corner pixels of the input and output regions are aligned,
     *                            preserving the values at the corner pixels.
     * @return A valid MPSCNNUpsamplingBilinear object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:integerScaleFactorX:integerScaleFactorY:alignCorners:")
    public native MPSCNNUpsamplingBilinear initWithDeviceIntegerScaleFactorXIntegerScaleFactorYAlignCorners(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long integerScaleFactorX,
            @NUInt long integerScaleFactorY, boolean alignCorners);
}
