package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPBarButtonProviding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPGridTemplate extends CPTemplate implements CPBarButtonProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPGridTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPGridTemplate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPGridTemplate allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("backButton")
    public native CPBarButton backButton();

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
     * Array of grid buttons displayed on the template
     */
    @NotNull
    @Generated
    @Selector("gridButtons")
    public native NSArray<? extends CPGridButton> gridButtons();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPGridTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPGridTemplate initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize a grid template with an array of @c CPGridButton and a title.
     * 
     * [@note] A grid template will only display the first @c CPGridTemplateMaximumItems buttons in the provided @c
     * gridButtons array.
     * 
     * @param title       Title shown in template's navigation bar.
     * @param gridButtons A list of grid buttons on the template. The maximum button count is @c
     *                    CPGridTemplateMaximumItems.
     */
    @Generated
    @Selector("initWithTitle:gridButtons:")
    public native CPGridTemplate initWithTitleGridButtons(@Nullable String title,
            @NotNull NSArray<? extends CPGridButton> gridButtons);

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
    @Selector("leadingNavigationBarButtons")
    public native NSArray<? extends CPBarButton> leadingNavigationBarButtons();

    @Generated
    @Owned
    @Selector("new")
    public static native CPGridTemplate new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setBackButton:")
    public native void setBackButton(@Nullable CPBarButton value);

    @Generated
    @Selector("setLeadingNavigationBarButtons:")
    public native void setLeadingNavigationBarButtons(@NotNull NSArray<? extends CPBarButton> value);

    @Generated
    @Selector("setTrailingNavigationBarButtons:")
    public native void setTrailingNavigationBarButtons(@NotNull NSArray<? extends CPBarButton> value);

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
     * Title shown in template's navigation bar
     */
    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    @NotNull
    @Generated
    @Selector("trailingNavigationBarButtons")
    public native NSArray<? extends CPBarButton> trailingNavigationBarButtons();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Update the grid buttons displayed in this template, reloading
     * the view displaying these buttons.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("updateGridButtons:")
    public native void updateGridButtons(@NotNull NSArray<? extends CPGridButton> gridButtons);

    /**
     * Update the title displayed in this template.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("updateTitle:")
    public native void updateTitle(@NotNull String title);
}
