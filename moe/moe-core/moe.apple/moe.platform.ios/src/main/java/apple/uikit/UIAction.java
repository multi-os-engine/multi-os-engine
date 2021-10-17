package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIAction extends UIMenuElement {
    static {
        NatJ.register();
    }

    @Generated
    protected UIAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Creates a UIAction with the given arguments.
     *
     * @param title      The action's title.
     * @param image      Image that can appear next to this action, if needed.
     * @param identifier The action's identifier. Pass nil to use an auto-generated identifier.
     * @param handler    Handler block. Called when the user selects the action.
     * @return A new UIAction.
     */
    @Generated
    @Selector("actionWithTitle:image:identifier:handler:")
    public static native UIAction actionWithTitleImageIdentifierHandler(String title, UIImage image, String identifier,
            @ObjCBlock(name = "call_actionWithTitleImageIdentifierHandler") Block_actionWithTitleImageIdentifierHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_actionWithTitleImageIdentifierHandler {
        @Generated
        void call_actionWithTitleImageIdentifierHandler(UIAction action);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIAction alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * This action's style.
     */
    @Generated
    @Selector("attributes")
    @NUInt
    public native long attributes();

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

    /**
     * Elaborated title, if any.
     */
    @Generated
    @Selector("discoverabilityTitle")
    public native String discoverabilityTitle();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * This action's identifier.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * Image that can appear next to this action.
     */
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native UIAction init();

    @Generated
    @Selector("initWithCoder:")
    public native UIAction initWithCoder(NSCoder coder);

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
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This action's style.
     */
    @Generated
    @Selector("setAttributes:")
    public native void setAttributes(@NUInt long value);

    /**
     * Elaborated title, if any.
     */
    @Generated
    @Selector("setDiscoverabilityTitle:")
    public native void setDiscoverabilityTitle(String value);

    /**
     * Image that can appear next to this action.
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(UIImage value);

    /**
     * State that can appear next to this action.
     */
    @Generated
    @Selector("setState:")
    public native void setState(@NInt long value);

    /**
     * Short display title.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * State that can appear next to this action.
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

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

    /**
     * Short display title.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Creates a UIAction with an empty title, nil image, and automatically generated identifier
     *
     * @param handler Handler block. Called when the user selects the action.
     * @return A new UIAction.
     */
    @Generated
    @Selector("actionWithHandler:")
    public static native UIAction actionWithHandler(
            @ObjCBlock(name = "call_actionWithHandler") Block_actionWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_actionWithHandler {
        @Generated
        void call_actionWithHandler(UIAction action);
    }

    /**
     * If available, the object on behalf of which the actionHandler is called.
     */
    @Generated
    @Selector("sender")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object sender();

    /**
     * Creates a new UIAction for the captureTextFromCamera: standard edit action.
     *
     * @param responder  The UIKeyInput responder to send captureTextFromCamera: to.
     * @param identifier The action's identifier. Pass nil to use an auto-generated identifier.
     * @return A new UIAction.
     */
    @Generated
    @Selector("captureTextFromCameraActionForResponder:identifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object captureTextFromCameraActionForResponderIdentifier(UIResponder responder,
            String identifier);
}
