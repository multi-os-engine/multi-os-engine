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

/**
 * An action that facilitates activating a @c UIWindowScene when performed.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIWindowSceneActivationAction extends UIAction {
    static {
        NatJ.register();
    }

    @Generated
    protected UIWindowSceneActivationAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("actionWithHandler:")
    public static native UIWindowSceneActivationAction actionWithHandler(
            @ObjCBlock(name = "call_actionWithHandler") UIAction.Block_actionWithHandler handler);

    /**
     * Returns a new @c UIWindowSceneActivationAction
     * 
     * @param identifier            The action's identifier. Pass nil to use an auto-generated identifier.
     * @param alternateAction       If running on a platform that doesn't support multiple windows, the alternate action
     *                              is used. Otherwise, the alternates handler is called if the scene activation request
     *                              fails.
     * @param configurationProvider Called when the action has been triggered. It should return a @c
     *                              UIWindowSceneActivationConfiguration whose user activity will be used to request
     *                              scene activation.
     */
    @Generated
    @Selector("actionWithIdentifier:alternateAction:configurationProvider:")
    public static native UIWindowSceneActivationAction actionWithIdentifierAlternateActionConfigurationProvider(
            String identifier, UIAction alternateAction,
            @ObjCBlock(name = "call_actionWithIdentifierAlternateActionConfigurationProvider") Block_actionWithIdentifierAlternateActionConfigurationProvider configurationProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_actionWithIdentifierAlternateActionConfigurationProvider {
        @Generated
        UIWindowSceneActivationConfiguration call_actionWithIdentifierAlternateActionConfigurationProvider(
                UIWindowSceneActivationAction action);
    }

    @Generated
    @Selector("actionWithTitle:image:identifier:handler:")
    public static native UIWindowSceneActivationAction actionWithTitleImageIdentifierHandler(String title,
            UIImage image, String identifier,
            @ObjCBlock(name = "call_actionWithTitleImageIdentifierHandler") UIAction.Block_actionWithTitleImageIdentifierHandler handler);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIWindowSceneActivationAction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIWindowSceneActivationAction allocWithZone(VoidPtr zone);

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
    @Selector("captureTextFromCameraActionForResponder:identifier:")
    public static native UIWindowSceneActivationAction captureTextFromCameraActionForResponderIdentifier(
            UIResponder responder, String identifier);

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
    @Selector("init")
    public native UIWindowSceneActivationAction init();

    @Generated
    @Selector("initWithCoder:")
    public native UIWindowSceneActivationAction initWithCoder(NSCoder coder);

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
    public static native UIWindowSceneActivationAction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The actions title. Set to nil to use the default title.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
     * The actions title. Set to nil to use the default title.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
