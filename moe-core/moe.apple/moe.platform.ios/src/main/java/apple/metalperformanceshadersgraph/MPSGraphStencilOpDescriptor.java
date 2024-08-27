package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class defines parameters for a stencil operation.
 * 
 * Use this descriptor with the following ``MPSGraph`` methods:
 * - ``MPSGraph/stencilWithSourceTensor:weightsTensor:descriptor:name:``.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphStencilOpDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphStencilOpDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphStencilOpDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphStencilOpDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The property that determines which values to use for padding the input tensor.
     * Default value: `MPSGraphPaddingModeZero`.
     */
    @Generated
    @Selector("boundaryMode")
    @NInt
    public native long boundaryMode();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a stencil operation descriptor with default values.
     * 
     * - Parameters:
     * - paddingStyle: See `paddingStyle` property.
     * - Returns: A valid MPSGraphStencilOpDescriptor object
     */
    @Generated
    @Selector("descriptorWithPaddingStyle:")
    public static native MPSGraphStencilOpDescriptor descriptorWithPaddingStyle(@NUInt long paddingStyle);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphStencilOpDescriptor init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphStencilOpDescriptor new_objc();

    /**
     * The padding value for `boundaryMode = MPSGraphPaddingModeConstant`.
     * Default value: 0.
     */
    @Generated
    @Selector("paddingConstant")
    public native float paddingConstant();

    /**
     * The property that defines what kind of padding to apply to the stencil operation.
     * Default value: `MPSGraphPaddingStyleExplicit`.
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * The reduction mode to use within the stecil window. Default value: `MPSGraphReductionModeSum`.
     */
    @Generated
    @Selector("reductionMode")
    @NUInt
    public native long reductionMode();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The property that determines which values to use for padding the input tensor.
     * Default value: `MPSGraphPaddingModeZero`.
     */
    @Generated
    @Selector("setBoundaryMode:")
    public native void setBoundaryMode(@NInt long value);

    /**
     * The padding value for `boundaryMode = MPSGraphPaddingModeConstant`.
     * Default value: 0.
     */
    @Generated
    @Selector("setPaddingConstant:")
    public native void setPaddingConstant(float value);

    /**
     * The property that defines what kind of padding to apply to the stencil operation.
     * Default value: `MPSGraphPaddingStyleExplicit`.
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * The reduction mode to use within the stecil window. Default value: `MPSGraphReductionModeSum`.
     */
    @Generated
    @Selector("setReductionMode:")
    public native void setReductionMode(@NUInt long value);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
