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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.uikit.protocol.UIMenuLeaf;
import apple.uikit.protocol.UIPopoverPresentationControllerSourceItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an action to take.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICommand extends UIMenuElement implements UIMenuLeaf {
    static {
        NatJ.register();
    }

    @Generated
    protected UICommand(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Action to take on choosing this command.
     */
    @NotNull
    @Generated
    @Selector("action")
    public native SEL action();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICommand alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICommand allocWithZone(VoidPtr zone);

    /**
     * Alternates that differ in modifier flags, if any.
     */
    @NotNull
    @Generated
    @Selector("alternates")
    public native NSArray<? extends UICommandAlternate> alternates();

    /**
     * Command attributes.
     */
    @Generated
    @Selector("attributes")
    @NUInt
    public native long attributes();

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

    /**
     * Initializes a keyless command.
     * 
     * @param title        Short display title. This should be localized.
     * @param image        Image that can appear next to this command, if needed.
     * @param action       Action to take on choosing this command.
     * @param propertyList Property list object to distinguish commands, if needed.
     * @return A new keyless command.
     */
    @Generated
    @Selector("commandWithTitle:image:action:propertyList:")
    public static native UICommand commandWithTitleImageActionPropertyList(@NotNull String title,
            @Nullable UIImage image, @NotNull SEL action,
            @Nullable @Mapped(ObjCObjectMapper.class) Object propertyList);

    /**
     * Initializes a keyless command with alternates.
     * 
     * @param title        Short display title. This should be localized.
     * @param image        Image that can appear next to this command, if needed.
     * @param action       Action to take on choosing this command.
     * @param propertyList Property list object to distinguish commands, if needed.
     * @param alternates   Alternates that differ in modifier flags.
     * @return A new keyless command with alternates.
     */
    @Generated
    @Selector("commandWithTitle:image:action:propertyList:alternates:")
    public static native UICommand commandWithTitleImageActionPropertyListAlternates(@NotNull String title,
            @Nullable UIImage image, @NotNull SEL action, @Nullable @Mapped(ObjCObjectMapper.class) Object propertyList,
            @NotNull NSArray<? extends UICommandAlternate> alternates);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Elaborated title, if any.
     */
    @Nullable
    @Generated
    @Selector("discoverabilityTitle")
    public native String discoverabilityTitle();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Image that can appear next to this command
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native UICommand init();

    @Generated
    @Selector("initWithCoder:")
    public native UICommand initWithCoder(@NotNull NSCoder coder);

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
    public static native UICommand new_objc();

    /**
     * Property list object to distinguish commands, if needed.
     */
    @Nullable
    @Generated
    @Selector("propertyList")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyList();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Command attributes.
     */
    @Generated
    @Selector("setAttributes:")
    public native void setAttributes(@NUInt long value);

    /**
     * Elaborated title, if any.
     */
    @Generated
    @Selector("setDiscoverabilityTitle:")
    public native void setDiscoverabilityTitle(@Nullable String value);

    /**
     * Image that can appear next to this command
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * State that can appear next to the command.
     */
    @Generated
    @Selector("setState:")
    public native void setState(@NInt long value);

    /**
     * Short display title.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * State that can appear next to the command.
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
    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("performWithSender:target:")
    public native void performWithSenderTarget(@Nullable @Mapped(ObjCObjectMapper.class) Object sender,
            @Nullable @Mapped(ObjCObjectMapper.class) Object target);

    @Nullable
    @Generated
    @Selector("presentationSourceItem")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIPopoverPresentationControllerSourceItem presentationSourceItem();

    @Nullable
    @Generated
    @Selector("sender")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object sender();
}
