package apple.spritekit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLRenderCommandEncoder;
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
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKRenderer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKRenderer alloc();

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
    @Selector("ignoresSiblingOrder")
    public native boolean ignoresSiblingOrder();

    @Generated
    @Selector("init")
    public native SKRenderer init();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("renderWithViewport:commandBuffer:renderPassDescriptor:")
    public native void renderWithViewportCommandBufferRenderPassDescriptor(@ByValue CGRect viewport,
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MTLRenderPassDescriptor renderPassDescriptor);

    @Generated
    @Selector("renderWithViewport:renderCommandEncoder:renderPassDescriptor:commandQueue:")
    public native void renderWithViewportRenderCommandEncoderRenderPassDescriptorCommandQueue(@ByValue CGRect viewport,
            @Mapped(ObjCObjectMapper.class) MTLRenderCommandEncoder renderCommandEncoder,
            MTLRenderPassDescriptor renderPassDescriptor, @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue);

    @Generated
    @Selector("rendererWithDevice:")
    public static native SKRenderer rendererWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scene")
    public native SKScene scene();

    @Generated
    @Selector("setIgnoresSiblingOrder:")
    public native void setIgnoresSiblingOrder(boolean value);

    @Generated
    @Selector("setScene:")
    public native void setScene(SKScene value);

    @Generated
    @Selector("setShouldCullNonVisibleNodes:")
    public native void setShouldCullNonVisibleNodes(boolean value);

    @Generated
    @Selector("setShowsDrawCount:")
    public native void setShowsDrawCount(boolean value);

    @Generated
    @Selector("setShowsFields:")
    public native void setShowsFields(boolean value);

    @Generated
    @Selector("setShowsNodeCount:")
    public native void setShowsNodeCount(boolean value);

    @Generated
    @Selector("setShowsPhysics:")
    public native void setShowsPhysics(boolean value);

    @Generated
    @Selector("setShowsQuadCount:")
    public native void setShowsQuadCount(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("shouldCullNonVisibleNodes")
    public native boolean shouldCullNonVisibleNodes();

    @Generated
    @Selector("showsDrawCount")
    public native boolean showsDrawCount();

    @Generated
    @Selector("showsFields")
    public native boolean showsFields();

    @Generated
    @Selector("showsNodeCount")
    public native boolean showsNodeCount();

    @Generated
    @Selector("showsPhysics")
    public native boolean showsPhysics();

    @Generated
    @Selector("showsQuadCount")
    public native boolean showsQuadCount();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("updateAtTime:")
    public native void updateAtTime(double currentTime);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}