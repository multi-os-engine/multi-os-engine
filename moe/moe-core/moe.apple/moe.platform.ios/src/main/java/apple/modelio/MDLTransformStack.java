package apple.modelio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.modelio.protocol.MDLTransformComponent;
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
 * API-Since: 11.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLTransformStack extends NSObject implements NSCopying, MDLTransformComponent {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLTransformStack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @NotNull
    @Generated
    @Selector("addMatrixOp:inverse:")
    public native MDLTransformMatrixOp addMatrixOpInverse(@NotNull String animatedValueName, boolean inverse);

    @NotNull
    @Generated
    @Selector("addRotateOp:order:inverse:")
    public native MDLTransformRotateOp addRotateOpOrderInverse(@NotNull String animatedValueName, @NUInt long order,
            boolean inverse);

    @NotNull
    @Generated
    @Selector("addRotateXOp:inverse:")
    public native MDLTransformRotateXOp addRotateXOpInverse(@NotNull String animatedValueName, boolean inverse);

    @NotNull
    @Generated
    @Selector("addRotateYOp:inverse:")
    public native MDLTransformRotateYOp addRotateYOpInverse(@NotNull String animatedValueName, boolean inverse);

    @NotNull
    @Generated
    @Selector("addRotateZOp:inverse:")
    public native MDLTransformRotateZOp addRotateZOpInverse(@NotNull String animatedValueName, boolean inverse);

    @NotNull
    @Generated
    @Selector("addScaleOp:inverse:")
    public native MDLTransformScaleOp addScaleOpInverse(@NotNull String animatedValueName, boolean inverse);

    @NotNull
    @Generated
    @Selector("addTranslateOp:inverse:")
    public native MDLTransformTranslateOp addTranslateOpInverse(@NotNull String animatedValueName, boolean inverse);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLTransformStack alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLTransformStack allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("animatedValueWithName:")
    public native MDLAnimatedValue animatedValueWithName(@NotNull String name);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
    @Selector("count")
    @NUInt
    public native long count();

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
    public native MDLTransformStack init();

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

    @NotNull
    @Generated
    @Selector("keyTimes")
    public native NSArray<? extends NSNumber> keyTimes();

    @Generated
    @Selector("maximumTime")
    public native double maximumTime();

    @Generated
    @Selector("minimumTime")
    public native double minimumTime();

    @Generated
    @Owned
    @Selector("new")
    public static native MDLTransformStack new_objc();

    @Generated
    @Selector("resetsTransform")
    public native boolean resetsTransform();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setResetsTransform:")
    public native void setResetsTransform(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("transformOps")
    public native NSArray<?> transformOps();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Selector("addOrientOp:inverse:")
    public native MDLTransformOrientOp addOrientOpInverse(@NotNull String animatedValueName, boolean inverse);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
