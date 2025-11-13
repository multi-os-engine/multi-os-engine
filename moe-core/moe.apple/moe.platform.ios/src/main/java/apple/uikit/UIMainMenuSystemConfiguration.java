package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * A configuration for the main menu system.
 * You can specify whether or not certain elements are present in the initial main menu, as well as a block to build the
 * menu using a UIMenuBuilder.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIMainMenuSystemConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIMainMenuSystemConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIMainMenuSystemConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIMainMenuSystemConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Specifies a preference for document elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("documentPreference")
    @NInt
    public native long documentPreference();

    /**
     * Configuration for the find elements should they be present in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("findingConfiguration")
    @NotNull
    public native UIMenuSystemFindElementGroupConfiguration findingConfiguration();

    /**
     * Specifies a preference for finding elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("findingPreference")
    @NInt
    public native long findingPreference();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIMainMenuSystemConfiguration init();

    /**
     * Specifies a preference for inspector elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inspectorPreference")
    @NInt
    public native long inspectorPreference();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIMainMenuSystemConfiguration new_objc();

    /**
     * Specifies a preference for new scene elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newScenePreference")
    @NInt
    public native long newScenePreference();

    /**
     * Specifies a preference for printing elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("printingPreference")
    @NInt
    public native long printingPreference();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Specifies a preference for document elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDocumentPreference:")
    public native void setDocumentPreference(@NInt long value);

    /**
     * Specifies a preference for finding elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFindingPreference:")
    public native void setFindingPreference(@NInt long value);

    /**
     * Specifies a preference for inspector elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInspectorPreference:")
    public native void setInspectorPreference(@NInt long value);

    /**
     * Specifies a preference for new scene elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setNewScenePreference:")
    public native void setNewScenePreference(@NInt long value);

    /**
     * Specifies a preference for printing elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPrintingPreference:")
    public native void setPrintingPreference(@NInt long value);

    /**
     * Specifies a preference for sidebar elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSidebarPreference:")
    public native void setSidebarPreference(@NInt long value);

    /**
     * Specifies a preference for text formatting elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTextFormattingPreference:")
    public native void setTextFormattingPreference(@NInt long value);

    /**
     * Specifies a preference for toolbar elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setToolbarPreference:")
    public native void setToolbarPreference(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Specifies a preference for sidebar elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sidebarPreference")
    @NInt
    public native long sidebarPreference();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Specifies a preference for text formatting elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("textFormattingPreference")
    @NInt
    public native long textFormattingPreference();

    /**
     * Specifies a preference for toolbar elements in the main menu.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("toolbarPreference")
    @NInt
    public native long toolbarPreference();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}