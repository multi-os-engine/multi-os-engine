package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPInterfaceControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UITraitCollection;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPInterfaceController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CPInterfaceController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPInterfaceController alloc();

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
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPInterfaceControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("dismissTemplateAnimated:")
    public native void dismissTemplateAnimated(boolean animated);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPInterfaceController init();

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
    @Selector("popTemplateAnimated:")
    public native void popTemplateAnimated(boolean animated);

    @Generated
    @Selector("popToRootTemplateAnimated:")
    public native void popToRootTemplateAnimated(boolean animated);

    @Generated
    @Selector("popToTemplate:animated:")
    public native void popToTemplateAnimated(CPTemplate targetTemplate, boolean animated);

    @Generated
    @Selector("prefersDarkUserInterfaceStyle")
    public native boolean prefersDarkUserInterfaceStyle();

    @Generated
    @Selector("presentTemplate:animated:")
    public native void presentTemplateAnimated(CPTemplate templateToPresent, boolean animated);

    @Generated
    @Selector("presentedTemplate")
    public native CPTemplate presentedTemplate();

    @Generated
    @Selector("pushTemplate:animated:")
    public native void pushTemplateAnimated(CPTemplate templateToPush, boolean animated);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("rootTemplate")
    public native CPTemplate rootTemplate();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CPInterfaceControllerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CPInterfaceControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setPrefersDarkUserInterfaceStyle:")
    public native void setPrefersDarkUserInterfaceStyle(boolean value);

    @Generated
    @Selector("setRootTemplate:animated:")
    public native void setRootTemplateAnimated(CPTemplate rootTemplate, boolean animated);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("templates")
    public native NSArray<? extends CPTemplate> templates();

    @Generated
    @Selector("topTemplate")
    public native CPTemplate topTemplate();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("carTraitCollection")
    public native UITraitCollection carTraitCollection();

    @Generated
    @Selector("dismissTemplateAnimated:completion:")
    public native void dismissTemplateAnimatedCompletion(boolean animated,
            @ObjCBlock(name = "call_dismissTemplateAnimatedCompletion") Block_dismissTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dismissTemplateAnimatedCompletion {
        @Generated
        void call_dismissTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("popTemplateAnimated:completion:")
    public native void popTemplateAnimatedCompletion(boolean animated,
            @ObjCBlock(name = "call_popTemplateAnimatedCompletion") Block_popTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popTemplateAnimatedCompletion {
        @Generated
        void call_popTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("popToRootTemplateAnimated:completion:")
    public native void popToRootTemplateAnimatedCompletion(boolean animated,
            @ObjCBlock(name = "call_popToRootTemplateAnimatedCompletion") Block_popToRootTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popToRootTemplateAnimatedCompletion {
        @Generated
        void call_popToRootTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("popToTemplate:animated:completion:")
    public native void popToTemplateAnimatedCompletion(CPTemplate targetTemplate, boolean animated,
            @ObjCBlock(name = "call_popToTemplateAnimatedCompletion") Block_popToTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_popToTemplateAnimatedCompletion {
        @Generated
        void call_popToTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("presentTemplate:animated:completion:")
    public native void presentTemplateAnimatedCompletion(CPTemplate templateToPresent, boolean animated,
            @ObjCBlock(name = "call_presentTemplateAnimatedCompletion") Block_presentTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentTemplateAnimatedCompletion {
        @Generated
        void call_presentTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("pushTemplate:animated:completion:")
    public native void pushTemplateAnimatedCompletion(CPTemplate templateToPush, boolean animated,
            @ObjCBlock(name = "call_pushTemplateAnimatedCompletion") Block_pushTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pushTemplateAnimatedCompletion {
        @Generated
        void call_pushTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("setRootTemplate:animated:completion:")
    public native void setRootTemplateAnimatedCompletion(CPTemplate rootTemplate, boolean animated,
            @ObjCBlock(name = "call_setRootTemplateAnimatedCompletion") Block_setRootTemplateAnimatedCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRootTemplateAnimatedCompletion {
        @Generated
        void call_setRootTemplateAnimatedCompletion(boolean arg0, NSError arg1);
    }
}