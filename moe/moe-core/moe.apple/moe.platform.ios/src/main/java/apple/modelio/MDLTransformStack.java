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

    @Generated
    @Selector("addMatrixOp:inverse:")
    public native MDLTransformMatrixOp addMatrixOpInverse(String animatedValueName, boolean inverse);

    @Generated
    @Selector("addRotateOp:order:inverse:")
    public native MDLTransformRotateOp addRotateOpOrderInverse(String animatedValueName, @NUInt long order,
            boolean inverse);

    @Generated
    @Selector("addRotateXOp:inverse:")
    public native MDLTransformRotateXOp addRotateXOpInverse(String animatedValueName, boolean inverse);

    @Generated
    @Selector("addRotateYOp:inverse:")
    public native MDLTransformRotateYOp addRotateYOpInverse(String animatedValueName, boolean inverse);

    @Generated
    @Selector("addRotateZOp:inverse:")
    public native MDLTransformRotateZOp addRotateZOpInverse(String animatedValueName, boolean inverse);

    @Generated
    @Selector("addScaleOp:inverse:")
    public native MDLTransformScaleOp addScaleOpInverse(String animatedValueName, boolean inverse);

    @Generated
    @Selector("addTranslateOp:inverse:")
    public native MDLTransformTranslateOp addTranslateOpInverse(String animatedValueName, boolean inverse);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLTransformStack alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLTransformStack allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animatedValueWithName:")
    public native MDLAnimatedValue animatedValueWithName(String name);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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

    @Generated
    @Selector("transformOps")
    public native NSArray<?> transformOps();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addOrientOp:inverse:")
    public native MDLTransformOrientOp addOrientOpInverse(String animatedValueName, boolean inverse);
}
