package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Groups together properties of a color attachment for a ``MTL4RenderPipeline``.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4RenderPipelineColorAttachmentDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4RenderPipelineColorAttachmentDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4RenderPipelineColorAttachmentDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4RenderPipelineColorAttachmentDescriptor allocWithZone(VoidPtr zone);

    /**
     * Configures the alpha blending operation.
     * 
     * This property defaults to ``MTLBlendOperationAdd``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("alphaBlendOperation")
    @NUInt
    public native long alphaBlendOperation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Configure the blend state for color attachments the pipeline state uses.
     * 
     * This property's default value is ``MTL4BlendStateDisabled``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("blendingState")
    @NInt
    public native long blendingState();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Configures the destination-alpha blend factor.
     * 
     * This property defaults to ``MTLBlendFactorZero``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("destinationAlphaBlendFactor")
    @NUInt
    public native long destinationAlphaBlendFactor();

    /**
     * Configures the destination RGB blend factor.
     * 
     * This property defaults to ``MTLBlendFactorZero``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("destinationRGBBlendFactor")
    @NUInt
    public native long destinationRGBBlendFactor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTL4RenderPipelineColorAttachmentDescriptor init();

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
    public static native MTL4RenderPipelineColorAttachmentDescriptor new_objc();

    /**
     * Configures the pixel format.
     * 
     * This property defaults to ``MTLPixelFormatInvalid``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    /**
     * Resets this descriptor to its default state.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Configures the RGB blend operation.
     * 
     * This property defaults to ``MTLBlendOperationAdd``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rgbBlendOperation")
    @NUInt
    public native long rgbBlendOperation();

    /**
     * Configures the alpha blending operation.
     * 
     * This property defaults to ``MTLBlendOperationAdd``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAlphaBlendOperation:")
    public native void setAlphaBlendOperation(@NUInt long value);

    /**
     * Configure the blend state for color attachments the pipeline state uses.
     * 
     * This property's default value is ``MTL4BlendStateDisabled``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBlendingState:")
    public native void setBlendingState(@NInt long value);

    /**
     * Configures the destination-alpha blend factor.
     * 
     * This property defaults to ``MTLBlendFactorZero``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDestinationAlphaBlendFactor:")
    public native void setDestinationAlphaBlendFactor(@NUInt long value);

    /**
     * Configures the destination RGB blend factor.
     * 
     * This property defaults to ``MTLBlendFactorZero``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDestinationRGBBlendFactor:")
    public native void setDestinationRGBBlendFactor(@NUInt long value);

    /**
     * Configures the pixel format.
     * 
     * This property defaults to ``MTLPixelFormatInvalid``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPixelFormat:")
    public native void setPixelFormat(@NUInt long value);

    /**
     * Configures the RGB blend operation.
     * 
     * This property defaults to ``MTLBlendOperationAdd``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRgbBlendOperation:")
    public native void setRgbBlendOperation(@NUInt long value);

    /**
     * Configures the source-alpha blend factor.
     * 
     * This property defaults to ``MTLBlendFactorOne``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSourceAlphaBlendFactor:")
    public native void setSourceAlphaBlendFactor(@NUInt long value);

    /**
     * Configures the source RGB blend factor.
     * 
     * This property defaults to ``MTLBlendFactorOne``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSourceRGBBlendFactor:")
    public native void setSourceRGBBlendFactor(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Configures the color write mask.
     * 
     * This property defaults to ``MTLColorWriteMaskAll``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setWriteMask:")
    public native void setWriteMask(@NUInt long value);

    /**
     * Configures the source-alpha blend factor.
     * 
     * This property defaults to ``MTLBlendFactorOne``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sourceAlphaBlendFactor")
    @NUInt
    public native long sourceAlphaBlendFactor();

    /**
     * Configures the source RGB blend factor.
     * 
     * This property defaults to ``MTLBlendFactorOne``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sourceRGBBlendFactor")
    @NUInt
    public native long sourceRGBBlendFactor();

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

    /**
     * Configures the color write mask.
     * 
     * This property defaults to ``MTLColorWriteMaskAll``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("writeMask")
    @NUInt
    public native long writeMask();
}