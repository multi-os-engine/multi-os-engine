package apple.photosui;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.photos.PHPhotoLibrary;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A configuration for \c PHPickerViewController.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("PhotosUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHPickerConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PHPickerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHPickerConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHPickerConfiguration allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Types of assets that can be shown. Default is \c nil.
     * 
     * Setting \c filter to \c nil means all asset types can be shown.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("filter")
    public native PHPickerFilter filter();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Initializes a new configuration with the system photo library. This configuration never returns asset
     * identifiers.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("init")
    public native PHPickerConfiguration init();

    /**
     * Initializes a new configuration with the \c photoLibrary the picker should use.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithPhotoLibrary:")
    public native PHPickerConfiguration initWithPhotoLibrary(@NotNull PHPhotoLibrary photoLibrary);

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
    public static native PHPickerConfiguration new_objc();

    /**
     * The preferred representation mode of selected assets. Default is \c
     * PHPickerConfigurationAssetRepresentationModeAutomatic.
     * 
     * Setting \c preferredAssetRepresentationMode to \c PHPickerConfigurationAssetRepresentationModeAutomatic means the
     * best representation determined by the system will be used.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("preferredAssetRepresentationMode")
    @NInt
    public native long preferredAssetRepresentationMode();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The maximum number of assets that can be selected. Default is 1.
     * 
     * Setting \c selectionLimit to 0 means maximum supported by the system.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("selectionLimit")
    @NInt
    public native long selectionLimit();

    /**
     * Types of assets that can be shown. Default is \c nil.
     * 
     * Setting \c filter to \c nil means all asset types can be shown.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setFilter:")
    public native void setFilter(@Nullable PHPickerFilter value);

    /**
     * The preferred representation mode of selected assets. Default is \c
     * PHPickerConfigurationAssetRepresentationModeAutomatic.
     * 
     * Setting \c preferredAssetRepresentationMode to \c PHPickerConfigurationAssetRepresentationModeAutomatic means the
     * best representation determined by the system will be used.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPreferredAssetRepresentationMode:")
    public native void setPreferredAssetRepresentationMode(@NInt long value);

    /**
     * The maximum number of assets that can be selected. Default is 1.
     * 
     * Setting \c selectionLimit to 0 means maximum supported by the system.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSelectionLimit:")
    public native void setSelectionLimit(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Local identifiers of assets to be shown as selected when the picker is presented. Default is an empty array.
     * 
     * \c preselectedAssetIdentifiers should be an empty array if \c selectionLimit is 1 or \c photoLibrary is not
     * specified. Returned item providers for preselected assets are always empty.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("preselectedAssetIdentifiers")
    public native NSArray<String> preselectedAssetIdentifiers();

    /**
     * The selection behavior of the picker. Default is \c PHPickerConfigurationSelectionDefault.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("selection")
    @NInt
    public native long selection();

    /**
     * Local identifiers of assets to be shown as selected when the picker is presented. Default is an empty array.
     * 
     * \c preselectedAssetIdentifiers should be an empty array if \c selectionLimit is 1 or \c photoLibrary is not
     * specified. Returned item providers for preselected assets are always empty.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPreselectedAssetIdentifiers:")
    public native void setPreselectedAssetIdentifiers(@NotNull NSArray<String> value);

    /**
     * The selection behavior of the picker. Default is \c PHPickerConfigurationSelectionDefault.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSelection:")
    public native void setSelection(@NInt long value);

    /**
     * Capabilities of the picker that should be disabled. Default is \c PHPickerCapabilitiesNone.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("disabledCapabilities")
    @NUInt
    public native long disabledCapabilities();

    /**
     * Edges of the picker that have no margin between the content and the edge (e.g. without bars in between). Default
     * is \c NSDirectionalRectEdgeNone.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("edgesWithoutContentMargins")
    @NUInt
    public native long edgesWithoutContentMargins();

    /**
     * The mode of the picker. Default is \c PHPickerModeDefault.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("mode")
    @NInt
    public native long mode();

    /**
     * Capabilities of the picker that should be disabled. Default is \c PHPickerCapabilitiesNone.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setDisabledCapabilities:")
    public native void setDisabledCapabilities(@NUInt long value);

    /**
     * Edges of the picker that have no margin between the content and the edge (e.g. without bars in between). Default
     * is \c NSDirectionalRectEdgeNone.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setEdgesWithoutContentMargins:")
    public native void setEdgesWithoutContentMargins(@NUInt long value);

    /**
     * The mode of the picker. Default is \c PHPickerModeDefault.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setMode:")
    public native void setMode(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
