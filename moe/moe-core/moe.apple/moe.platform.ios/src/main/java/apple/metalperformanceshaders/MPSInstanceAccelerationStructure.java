package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
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
public class MPSInstanceAccelerationStructure extends MPSAccelerationStructure {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSInstanceAccelerationStructure(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accelerationStructures")
    public native NSArray<? extends MPSPolygonAccelerationStructure> accelerationStructures();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSInstanceAccelerationStructure alloc();

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSInstanceAccelerationStructure init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSInstanceAccelerationStructure initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSInstanceAccelerationStructure initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithCoder:group:")
    public native MPSInstanceAccelerationStructure initWithCoderGroup(NSCoder aDecoder,
            MPSAccelerationStructureGroup group);

    @Generated
    @Selector("initWithDevice:")
    public native MPSInstanceAccelerationStructure initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithGroup:")
    public native MPSInstanceAccelerationStructure initWithGroup(MPSAccelerationStructureGroup group);

    @Generated
    @Selector("instanceBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer instanceBuffer();

    @Generated
    @Selector("instanceBufferOffset")
    @NUInt
    public native long instanceBufferOffset();

    @Generated
    @Selector("instanceCount")
    @NUInt
    public native long instanceCount();

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
    @Selector("maskBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer maskBuffer();

    @Generated
    @Selector("maskBufferOffset")
    @NUInt
    public native long maskBufferOffset();

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

    @Generated
    @Selector("setAccelerationStructures:")
    public native void setAccelerationStructures(NSArray<? extends MPSPolygonAccelerationStructure> value);

    @Generated
    @Selector("setInstanceBuffer:")
    public native void setInstanceBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    @Generated
    @Selector("setInstanceBufferOffset:")
    public native void setInstanceBufferOffset(@NUInt long value);

    @Generated
    @Selector("setInstanceCount:")
    public native void setInstanceCount(@NUInt long value);

    @Generated
    @Selector("setMaskBuffer:")
    public native void setMaskBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    @Generated
    @Selector("setMaskBufferOffset:")
    public native void setMaskBufferOffset(@NUInt long value);

    @Generated
    @Selector("setTransformBuffer:")
    public native void setTransformBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    @Generated
    @Selector("setTransformBufferOffset:")
    public native void setTransformBufferOffset(@NUInt long value);

    @Generated
    @Selector("setTransformType:")
    public native void setTransformType(@NUInt long value);

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
    @Selector("transformBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer transformBuffer();

    @Generated
    @Selector("transformBufferOffset")
    @NUInt
    public native long transformBufferOffset();

    @Generated
    @Selector("transformType")
    @NUInt
    public native long transformType();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}