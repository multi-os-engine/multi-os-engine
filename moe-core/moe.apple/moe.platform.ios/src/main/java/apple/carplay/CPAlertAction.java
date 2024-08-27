package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.uikit.UIColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@c] CPAlertAction represents a single action that appears inside of a @c CPActionSheetTemplate or @c
 * CPAlertTemplate.
 * 
 * The style of the parent template and the style of the @c CPAlertAction will together
 * determine the action's appearance.
 * 
 * The action has a customizable title, style, and a block callback
 * that is invoked when the user taps this button.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPAlertAction extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPAlertAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPAlertAction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPAlertAction allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Selector("handler")
    @ObjCBlock(name = "call_handler_ret")
    public native Block_handler_ret handler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handler_ret {
        @Generated
        void call_handler_ret(@NotNull CPAlertAction arg0);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPAlertAction init();

    @Generated
    @Selector("initWithCoder:")
    public native CPAlertAction initWithCoder(@NotNull NSCoder coder);

    /**
     * Create an alert action with a title, display style, and a callback handler that is invoked
     * when the user taps this action.
     */
    @Generated
    @Selector("initWithTitle:style:handler:")
    public native CPAlertAction initWithTitleStyleHandler(@NotNull String title, @NUInt long style,
            @NotNull @ObjCBlock(name = "call_initWithTitleStyleHandler") Block_initWithTitleStyleHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTitleStyleHandler {
        @Generated
        void call_initWithTitleStyleHandler(@NotNull CPAlertAction arg0);
    }

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
    public static native CPAlertAction new_objc();

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
    @Selector("style")
    @NUInt
    public native long style();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * Create an alert action with a title, a custom action color, and a callback handler that is invoked
     * when the user taps this action.
     * 
     * The system will automatically determine if the provided color meets contrast requirements.
     * If the provided color does not meet contrast requirements, the system default will be used.
     * Font color will automatically be adjusted by the system to correspond with this color.
     * Alpha values will be ignored.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithTitle:color:handler:")
    public native CPAlertAction initWithTitleColorHandler(@NotNull String title, @NotNull UIColor color,
            @NotNull @ObjCBlock(name = "call_initWithTitleColorHandler") Block_initWithTitleColorHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTitleColorHandler {
        @Generated
        void call_initWithTitleColorHandler(@NotNull CPAlertAction arg0);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
