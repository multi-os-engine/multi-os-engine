package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
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

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayUnaryGradientKernel extends MPSNDArrayMultiaryGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayUnaryGradientKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayUnaryGradientKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNDArrayUnaryGradientKernel allocWithZone(VoidPtr zone);

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
     * Gradient encode methods
     * Inference encode calls.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:sourceGradient:gradientState:")
    public native MPSNDArray encodeToCommandBufferSourceArraySourceGradientGradientState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, MPSNDArray gradient,
            MPSState state);

    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:sourceGradient:gradientState:destinationArray:")
    public native void encodeToCommandBufferSourceArraySourceGradientGradientStateDestinationArray(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, MPSNDArray gradient,
            MPSState state, MPSNDArray destination);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayUnaryGradientKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayUnaryGradientKernel initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayUnaryGradientKernel initWithCoderDevice(NSCoder coder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * RFC: While this design is nice as it allows the same set of source arrays to
     * be used for forward and gradient passees, it causes a problem for the
     * getters and setters of properties like offset, kernel size, etc.
     * There is currently no way to manually set this information for the gradient.
     * This may not be viewed as a problem as this information is automatically
     * set by the gradient state.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayUnaryGradientKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayUnaryGradientKernel initWithDeviceSourceCount(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long count);

    @Generated
    @Selector("initWithDevice:sourceCount:sourceGradientIndex:")
    public native MPSNDArrayUnaryGradientKernel initWithDeviceSourceCountSourceGradientIndex(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long count, @NUInt long sourceGradientIndex);

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
    public static native MPSNDArrayUnaryGradientKernel new_objc();

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
