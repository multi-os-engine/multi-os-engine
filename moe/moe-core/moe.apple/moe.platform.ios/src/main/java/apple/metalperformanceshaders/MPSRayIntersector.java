package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
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

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSRayIntersector extends MPSKernel implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRayIntersector(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRayIntersector alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("boundingBoxIntersectionTestType")
    @NUInt
    public native long boundingBoxIntersectionTestType();

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
    @Owned
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("cullMode")
    @NUInt
    public native long cullMode();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:intersectionBuffer:intersectionBufferOffset:rayCount:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayBufferRayBufferOffsetIntersectionBufferIntersectionBufferOffsetRayCountAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @Mapped(ObjCObjectMapper.class) MTLBuffer rayBuffer, @NUInt long rayBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer intersectionBuffer, @NUInt long intersectionBufferOffset,
            @NUInt long rayCount, MPSAccelerationStructure accelerationStructure);

    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:intersectionBuffer:intersectionBufferOffset:rayCountBuffer:rayCountBufferOffset:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayBufferRayBufferOffsetIntersectionBufferIntersectionBufferOffsetRayCountBufferRayCountBufferOffsetAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @Mapped(ObjCObjectMapper.class) MTLBuffer rayBuffer, @NUInt long rayBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer intersectionBuffer, @NUInt long intersectionBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer rayCountBuffer, @NUInt long rayCountBufferOffset,
            MPSAccelerationStructure accelerationStructure);

    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:rayIndexBuffer:rayIndexBufferOffset:intersectionBuffer:intersectionBufferOffset:rayIndexCount:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayBufferRayBufferOffsetRayIndexBufferRayIndexBufferOffsetIntersectionBufferIntersectionBufferOffsetRayIndexCountAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @Mapped(ObjCObjectMapper.class) MTLBuffer rayBuffer, @NUInt long rayBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer rayIndexBuffer, @NUInt long rayIndexBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer intersectionBuffer, @NUInt long intersectionBufferOffset,
            @NUInt long rayIndexCount, MPSAccelerationStructure accelerationStructure);

    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:rayIndexBuffer:rayIndexBufferOffset:intersectionBuffer:intersectionBufferOffset:rayIndexCountBuffer:rayIndexCountBufferOffset:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayBufferRayBufferOffsetRayIndexBufferRayIndexBufferOffsetIntersectionBufferIntersectionBufferOffsetRayIndexCountBufferRayIndexCountBufferOffsetAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @Mapped(ObjCObjectMapper.class) MTLBuffer rayBuffer, @NUInt long rayBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer rayIndexBuffer, @NUInt long rayIndexBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer intersectionBuffer, @NUInt long intersectionBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer rayIndexCountBuffer, @NUInt long rayIndexCountBufferOffset,
            MPSAccelerationStructure accelerationStructure);

    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayTexture:intersectionTexture:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayTextureIntersectionTextureAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @Mapped(ObjCObjectMapper.class) MTLTexture rayTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture intersectionTexture,
            MPSAccelerationStructure accelerationStructure);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("frontFacingWinding")
    @NUInt
    public native long frontFacingWinding();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSRayIntersector init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSRayIntersector initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSRayIntersector initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSRayIntersector initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    @Selector("intersectionDataType")
    @NUInt
    public native long intersectionDataType();

    @Generated
    @Selector("intersectionStride")
    @NUInt
    public native long intersectionStride();

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
    @Selector("rayDataType")
    @NUInt
    public native long rayDataType();

    @Generated
    @Selector("rayIndexDataType")
    public native int rayIndexDataType();

    @Generated
    @Selector("rayMask")
    public native int rayMask();

    @Generated
    @Selector("rayMaskOperator")
    @NUInt
    public native long rayMaskOperator();

    @Generated
    @Selector("rayMaskOptions")
    @NUInt
    public native long rayMaskOptions();

    @Generated
    @Selector("rayStride")
    @NUInt
    public native long rayStride();

    @Generated
    @Selector("recommendedMinimumRayBatchSizeForRayCount:")
    @NUInt
    public native long recommendedMinimumRayBatchSizeForRayCount(@NUInt long rayCount);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setBoundingBoxIntersectionTestType:")
    public native void setBoundingBoxIntersectionTestType(@NUInt long value);

    @Generated
    @Selector("setCullMode:")
    public native void setCullMode(@NUInt long value);

    @Generated
    @Selector("setFrontFacingWinding:")
    public native void setFrontFacingWinding(@NUInt long value);

    @Generated
    @Selector("setIntersectionDataType:")
    public native void setIntersectionDataType(@NUInt long value);

    @Generated
    @Selector("setIntersectionStride:")
    public native void setIntersectionStride(@NUInt long value);

    @Generated
    @Selector("setRayDataType:")
    public native void setRayDataType(@NUInt long value);

    @Generated
    @Selector("setRayIndexDataType:")
    public native void setRayIndexDataType(int value);

    @Generated
    @Selector("setRayMask:")
    public native void setRayMask(int value);

    @Generated
    @Selector("setRayMaskOperator:")
    public native void setRayMaskOperator(@NUInt long value);

    @Generated
    @Selector("setRayMaskOptions:")
    public native void setRayMaskOptions(@NUInt long value);

    @Generated
    @Selector("setRayStride:")
    public native void setRayStride(@NUInt long value);

    @Generated
    @Selector("setTriangleIntersectionTestType:")
    public native void setTriangleIntersectionTestType(@NUInt long value);

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
    @Selector("triangleIntersectionTestType")
    @NUInt
    public native long triangleIntersectionTestType();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}