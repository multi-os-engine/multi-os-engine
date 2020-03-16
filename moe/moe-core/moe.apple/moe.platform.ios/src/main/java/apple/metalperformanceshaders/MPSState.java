package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLTextureDescriptor;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLResource;
import apple.metalperformanceshaders.struct.MPSStateTextureInfo;
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
public class MPSState extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSState alloc();

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
    public native MPSState init();

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
    @Selector("isTemporary")
    public native boolean isTemporary();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("readCount")
    @NUInt
    public native long readCount();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setReadCount:")
    public native void setReadCount(@NUInt long value);

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

    @Generated
    @Selector("bufferSizeAtIndex:")
    @NUInt
    public native long bufferSizeAtIndex(@NUInt long index);

    @Generated
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:forKernel:suggestedDescriptor:")
    public native MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStatesForKernelSuggestedDescriptor(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates, MPSKernel kernel,
            MPSImageDescriptor inDescriptor);

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSState initWithDeviceBufferSize(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long bufferSize);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSState initWithDeviceResourceList(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSState initWithDeviceTextureDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MTLTextureDescriptor descriptor);

    @Generated
    @Selector("initWithResource:")
    public native MPSState initWithResource(@Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSState initWithResources(NSArray<?> resources);

    @Generated
    @Selector("resource")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLResource resource();

    @Generated
    @Selector("resourceAtIndex:allocateMemory:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLResource resourceAtIndexAllocateMemory(@NUInt long index, boolean allocateMemory);

    @Generated
    @Selector("resourceCount")
    @NUInt
    public native long resourceCount();

    @Generated
    @Selector("resourceSize")
    @NUInt
    public native long resourceSize();

    @Generated
    @Selector("resourceTypeAtIndex:")
    @NUInt
    public native long resourceTypeAtIndex(@NUInt long index);

    @Generated
    @Selector("synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object temporaryStateWithCommandBuffer(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object temporaryStateWithCommandBufferBufferSize(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object temporaryStateWithCommandBufferResourceList(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSStateResourceList resourceList);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object temporaryStateWithCommandBufferTextureDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MTLTextureDescriptor descriptor);

    @Generated
    @Selector("textureInfoAtIndex:")
    @ByValue
    public native MPSStateTextureInfo textureInfoAtIndex(@NUInt long index);
}