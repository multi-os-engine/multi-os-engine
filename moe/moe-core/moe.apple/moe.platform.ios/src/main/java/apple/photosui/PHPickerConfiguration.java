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

/**
 * A configuration for \c PHPickerViewController.
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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Applying a filter to restrict the types that can be displayed. Default is \c nil.
     * <p>
     * Setting \c filter to \c nil means all asset types can be displayed.
     */
    @Generated
    @Selector("filter")
    public native PHPickerFilter filter();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Initializes a new configuration with the system photo library. This configuration never returns asset identifiers.
     */
    @Generated
    @Selector("init")
    public native PHPickerConfiguration init();

    /**
     * Initializes a new configuration with the \c photoLibrary the picker should use.
     */
    @Generated
    @Selector("initWithPhotoLibrary:")
    public native PHPickerConfiguration initWithPhotoLibrary(PHPhotoLibrary photoLibrary);

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
    public static native PHPickerConfiguration new_objc();

    /**
     * Preferred representation mode of selected assets. Default is \c PHPickerConfigurationAssetRepresentationModeAutomatic.
     * <p>
     * Setting \c preferredAssetRepresentationMode to \c PHPickerConfigurationAssetRepresentationModeAutomatic means the best representation determined by the system will be used.
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
     * Maximum number of assets that can be selected. Default is 1.
     * <p>
     * Setting \c selectionLimit to 0 means maximum supported by the system.
     */
    @Generated
    @Selector("selectionLimit")
    @NInt
    public native long selectionLimit();

    /**
     * Applying a filter to restrict the types that can be displayed. Default is \c nil.
     * <p>
     * Setting \c filter to \c nil means all asset types can be displayed.
     */
    @Generated
    @Selector("setFilter:")
    public native void setFilter(PHPickerFilter value);

    /**
     * Preferred representation mode of selected assets. Default is \c PHPickerConfigurationAssetRepresentationModeAutomatic.
     * <p>
     * Setting \c preferredAssetRepresentationMode to \c PHPickerConfigurationAssetRepresentationModeAutomatic means the best representation determined by the system will be used.
     */
    @Generated
    @Selector("setPreferredAssetRepresentationMode:")
    public native void setPreferredAssetRepresentationMode(@NInt long value);

    /**
     * Maximum number of assets that can be selected. Default is 1.
     * <p>
     * Setting \c selectionLimit to 0 means maximum supported by the system.
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
     * <p>
     * \c preselectedAssetIdentifiers should be an empty array if \c selectionLimit is 1 or \c photoLibrary is not specified. Returned item providers for preselected assets are always empty.
     */
    @Generated
    @Selector("preselectedAssetIdentifiers")
    public native NSArray<String> preselectedAssetIdentifiers();

    /**
     * Selection behavior of the picker. Default is \c PHPickerConfigurationSelectionDefault.
     */
    @Generated
    @Selector("selection")
    @NInt
    public native long selection();

    /**
     * Local identifiers of assets to be shown as selected when the picker is presented. Default is an empty array.
     * <p>
     * \c preselectedAssetIdentifiers should be an empty array if \c selectionLimit is 1 or \c photoLibrary is not specified. Returned item providers for preselected assets are always empty.
     */
    @Generated
    @Selector("setPreselectedAssetIdentifiers:")
    public native void setPreselectedAssetIdentifiers(NSArray<String> value);

    /**
     * Selection behavior of the picker. Default is \c PHPickerConfigurationSelectionDefault.
     */
    @Generated
    @Selector("setSelection:")
    public native void setSelection(@NInt long value);
}
