package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPTabBarTemplateDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPTabBarTemplate extends CPTemplate {
    static {
        NatJ.register();
    }

    @Generated
    protected CPTabBarTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPTabBarTemplate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPTabBarTemplate allocWithZone(VoidPtr zone);

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

    /**
     * The tab bar delegate is informed of tab bar events, like selecting a tab.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPTabBarTemplateDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPTabBarTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPTabBarTemplate initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize the tab bar with an array of templates. Each template in the array
     * becomes a tab on the tab bar.
     * 
     * The maximum number of tabs in the tab bar template is given by @c maximumTabCount.
     */
    @Generated
    @Selector("initWithTemplates:")
    public native CPTabBarTemplate initWithTemplates(@NotNull NSArray<? extends CPTemplate> templates);

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
     * The maximum number of tabs that your app may display in a @c CPTabBarTemplate,
     * depending on the entitlements that your app declares.
     * 
     * [@warning] The system will throw an exception if your app attempts to display more
     * than this number of tabs in your tab bar template.
     */
    @NInt
    @Generated
    @Selector("maximumTabCount")
    public static native long maximumTabCount();

    @Generated
    @Owned
    @Selector("new")
    public static native CPTabBarTemplate new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The currently-selected template in the tab bar.
     */
    @Nullable
    @Generated
    @Selector("selectedTemplate")
    public native CPTemplate selectedTemplate();

    /**
     * The tab bar delegate is informed of tab bar events, like selecting a tab.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) CPTabBarTemplateDelegate value);

    /**
     * The tab bar delegate is informed of tab bar events, like selecting a tab.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CPTabBarTemplateDelegate value) {
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
     * The currently-visible templates in the tab bar. Each template corresponds to
     * a single tab on the tab bar.
     */
    @NotNull
    @Generated
    @Selector("templates")
    public native NSArray<? extends CPTemplate> templates();

    /**
     * Update the tabs displayed in this tab bar, replacing the currently-visible tabs.
     * Each template in the array becomes a tab on the tab bar.
     */
    @Generated
    @Selector("updateTemplates:")
    public native void updateTemplates(@NotNull NSArray<? extends CPTemplate> newTemplates);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Update the currently-selected tab in this tab bar template, switching to the first tab
     * that is currently hosting @c newTemplate.
     * 
     * @param newTemplate The template that should become selected in the tab bar.
     * 
     *                    API-Since: 17.0
     */
    @Generated
    @Selector("selectTemplate:")
    public native void selectTemplate(@NotNull CPTemplate newTemplate);

    /**
     * Update the currently-selected tab in this tab bar template, switching to the tab
     * at the specified index.
     * 
     * @param index The index of the tab to select. This must be less than the number
     *              of tabs in this tab bar template.
     * 
     *              API-Since: 17.0
     */
    @Generated
    @Selector("selectTemplateAtIndex:")
    public native void selectTemplateAtIndex(@NInt long index);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
