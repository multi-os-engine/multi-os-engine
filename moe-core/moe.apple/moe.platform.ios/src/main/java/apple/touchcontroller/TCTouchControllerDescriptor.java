package apple.touchcontroller;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metalkit.MTKView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * A descriptor for configuring a touch controller.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TCTouchControllerDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TCTouchControllerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TCTouchControllerDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native TCTouchControllerDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * The pixel format for the drawable texture.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorPixelFormat")
    @NUInt
    public native long colorPixelFormat();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The pixel format for the depth attachment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("depthAttachmentPixelFormat")
    @NUInt
    public native long depthAttachmentPixelFormat();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The Metal device to use for rendering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native MTLDevice device();

    /**
     * The size of the drawable to which the touch controller's contents be drawn, in native pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawableSize")
    @ByValue
    public native CGSize drawableSize();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("init")
    public native TCTouchControllerDescriptor init();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithMTKView:")
    public native TCTouchControllerDescriptor initWithMTKView(@NotNull MTKView mtkView);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native TCTouchControllerDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The number of samples per pixel for multisampling.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    public native long sampleCount();

    /**
     * The pixel format for the drawable texture.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setColorPixelFormat:")
    public native void setColorPixelFormat(@NUInt long value);

    /**
     * The pixel format for the depth attachment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthAttachmentPixelFormat:")
    public native void setDepthAttachmentPixelFormat(@NUInt long value);

    /**
     * The Metal device to use for rendering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDevice:")
    public native void setDevice(@Mapped(ObjCObjectMapper.class) @NotNull MTLDevice value);

    /**
     * The size of the drawable to which the touch controller's contents be drawn, in native pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDrawableSize:")
    public native void setDrawableSize(@ByValue CGSize value);

    /**
     * The number of samples per pixel for multisampling.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@NUInt long value);

    /**
     * The size of the view the touch controller's drawable is embedded in, in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * The pixel format for the stencil attachment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStencilAttachmentPixelFormat:")
    public native void setStencilAttachmentPixelFormat(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The size of the view the touch controller's drawable is embedded in, in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * The pixel format for the stencil attachment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("stencilAttachmentPixelFormat")
    @NUInt
    public native long stencilAttachmentPixelFormat();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}