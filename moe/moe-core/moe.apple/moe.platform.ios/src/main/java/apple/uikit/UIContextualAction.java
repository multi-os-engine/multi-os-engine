package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIContextualAction extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIContextualAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIContextualAction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIContextualAction allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * a default background color is set from the action style
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

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
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native UIContextualAction init();

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
    public static native UIContextualAction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * a default background color is set from the action style
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    @Generated
    @Selector("setImage:")
    public native void setImage(UIImage value);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("style")
    @NInt
    public native long style();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("contextualActionWithStyle:title:handler:")
    public static native UIContextualAction contextualActionWithStyleTitleHandler(@NInt long style, String title,
            @ObjCBlock(name = "call_contextualActionWithStyleTitleHandler") Block_contextualActionWithStyleTitleHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_contextualActionWithStyleTitleHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_contextualActionWithStyleTitleHandler {
            @Generated
            void call_Block_contextualActionWithStyleTitleHandler(boolean arg0);
        }

        @Generated
        void call_contextualActionWithStyleTitleHandler(UIContextualAction action, UIView sourceView,
                @ObjCBlock(name = "call_Block_contextualActionWithStyleTitleHandler") Block_Block_contextualActionWithStyleTitleHandler completionHandler);
    }

    @Generated
    @Selector("handler")
    @ObjCBlock(name = "call_handler_ret")
    public native Block_handler_ret handler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handler_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_handler_ret {
            @Generated
            void call_Block_handler_ret(boolean arg0);
        }

        @Generated
        void call_handler_ret(UIContextualAction action, UIView sourceView,
                @ObjCBlock(name = "call_Block_handler_ret") Block_Block_handler_ret completionHandler);
    }

}
