package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSNDArrayAllocator;
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
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArray extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArray alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("arrayViewWithCommandBuffer:descriptor:aliasing:")
    public native MPSNDArray arrayViewWithCommandBufferDescriptorAliasing(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArrayDescriptor descriptor,
            @NUInt long aliasing);

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
    @Selector("dataType")
    public native int dataType();

    @Generated
    @Selector("dataTypeSize")
    @NUInt
    public native long dataTypeSize();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public static native MPSNDArrayAllocator defaultAllocator();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("descriptor")
    public native MPSNDArrayDescriptor descriptor();

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("exportDataWithCommandBuffer:toBuffer:destinationDataType:offset:rowStrides:")
    public native void exportDataWithCommandBufferToBufferDestinationDataTypeOffsetRowStrides(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            int destinationDataType, @NUInt long offset, NIntPtr rowStrides);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("importDataWithCommandBuffer:fromBuffer:sourceDataType:offset:rowStrides:")
    public native void importDataWithCommandBufferFromBufferSourceDataTypeOffsetRowStrides(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            int sourceDataType, @NUInt long offset, NIntPtr rowStrides);

    @Generated
    @Selector("init")
    public native MPSNDArray init();

    @Generated
    @Selector("initWithDevice:descriptor:")
    public native MPSNDArray initWithDeviceDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSNDArrayDescriptor descriptor);

    @Generated
    @Selector("initWithDevice:scalar:")
    public native MPSNDArray initWithDeviceScalar(@Mapped(ObjCObjectMapper.class) MTLDevice device, double value);

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
    @Selector("label")
    public native String label();

    @Generated
    @Selector("lengthOfDimension:")
    @NUInt
    public native long lengthOfDimension(@NUInt long dimensionIndex);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("numberOfDimensions")
    @NUInt
    public native long numberOfDimensions();

    @Generated
    @Selector("parent")
    public native MPSNDArray parent();

    @Generated
    @Selector("readBytes:strideBytes:")
    public native void readBytesStrideBytes(VoidPtr buffer, NIntPtr strideBytesPerDimension);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resourceSize")
    @NUInt
    public native long resourceSize();

    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("writeBytes:strideBytes:")
    public native void writeBytesStrideBytes(VoidPtr buffer, NIntPtr strideBytesPerDimension);
}