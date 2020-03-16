package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.struct.MPSNDArrayOffsets;
import apple.metalperformanceshaders.struct.MPSNDArraySizes;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
public class MPSNDArrayUnaryKernel extends MPSNDArrayMultiaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayUnaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayUnaryKernel alloc();

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

    @Generated
    @Selector("dilationRates")
    @ByValue
    public native MPSNDArraySizes dilationRates();

    @Generated
    @Selector("edgeMode")
    @NUInt
    public native long edgeMode();

    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:")
    public native MPSNDArray encodeToCommandBufferSourceArray(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf,
            MPSNDArray sourceArray);

    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:destinationArray:")
    public native void encodeToCommandBufferSourceArrayDestinationArray(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, MPSNDArray destination);

    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:resultState:destinationArray:")
    public native void encodeToCommandBufferSourceArrayResultStateDestinationArray(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, MPSState outGradientState,
            MPSNDArray destination);

    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:resultState:outputStateIsTemporary:")
    public native MPSNDArray encodeToCommandBufferSourceArrayResultStateOutputStateIsTemporary(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray sourceArray,
            @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outGradientState, boolean outputStateIsTemporary);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayUnaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayUnaryKernel initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayUnaryKernel initWithCoderDevice(NSCoder coder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayUnaryKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayUnaryKernel initWithDeviceSourceCount(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long count);

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
    @Selector("kernelSizes")
    @ByValue
    public native MPSNDArraySizes kernelSizes();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("offsets")
    @ByValue
    public native MPSNDArrayOffsets offsets();

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
    @Selector("strides")
    @ByValue
    public native MPSNDArrayOffsets strides();

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