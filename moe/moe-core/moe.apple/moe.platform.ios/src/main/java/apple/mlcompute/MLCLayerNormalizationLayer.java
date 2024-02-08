package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLCLayerNormalizationLayer
 * 
 * The layer normalizaion layer. For more information, refer to https://pytorch.org/docs/stable/nn.html#layernorm.
 * 
 * API-Since: 14.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: Use Metal Performance Shaders Graph or BNNS instead.
 */
@Deprecated
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCLayerNormalizationLayer extends MLCLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCLayerNormalizationLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCLayerNormalizationLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCLayerNormalizationLayer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] beta
     * 
     * The beta tensor
     */
    @Nullable
    @Generated
    @Selector("beta")
    public native MLCTensor beta();

    /**
     * [@property] betaParameter
     * 
     * The beta tensor parameter used for optimizer update
     */
    @Nullable
    @Generated
    @Selector("betaParameter")
    public native MLCTensorParameter betaParameter();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] gamma
     * 
     * The gamma tensor
     */
    @Nullable
    @Generated
    @Selector("gamma")
    public native MLCTensor gamma();

    /**
     * [@property] gammaParameter
     * 
     * The gamma tensor parameter used for optimizer update
     */
    @Nullable
    @Generated
    @Selector("gammaParameter")
    public native MLCTensorParameter gammaParameter();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCLayerNormalizationLayer init();

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

    /**
     * Create a layer normalization layer
     * 
     * @param normalizedShape The shape of the axes over which normalization occurs, currently (C,H,W) only
     * @param beta            Training parameter
     * @param gamma           Training parameter
     * @param varianceEpsilon A small numerical value added to variance for stability
     * @return A new layer normalization layer.
     */
    @Nullable
    @Generated
    @Selector("layerWithNormalizedShape:beta:gamma:varianceEpsilon:")
    public static native MLCLayerNormalizationLayer layerWithNormalizedShapeBetaGammaVarianceEpsilon(
            @NotNull NSArray<? extends NSNumber> normalizedShape, @Nullable MLCTensor beta, @Nullable MLCTensor gamma,
            float varianceEpsilon);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCLayerNormalizationLayer new_objc();

    /**
     * [@property] normalizedShape
     * 
     * The shape of the axes over which normalization occurs, (W), (H,W) or (C,H,W)
     */
    @NotNull
    @Generated
    @Selector("normalizedShape")
    public native NSArray<? extends NSNumber> normalizedShape();

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
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, @NotNull MLCDevice device);

    /**
     * [@property] varianceEpsilon
     * 
     * A value used for numerical stability
     */
    @Generated
    @Selector("varianceEpsilon")
    public native float varianceEpsilon();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
