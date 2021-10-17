package apple.photos;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHProject extends PHAssetCollection {
    static {
        NatJ.register();
    }

    @Generated
    protected PHProject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHProject alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native PHProject allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("fetchAssetCollectionsContainingAsset:withType:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchAssetCollectionsContainingAssetWithTypeOptions(
            PHAsset asset, @NInt long type, PHFetchOptions options);

    @Generated
    @Selector("fetchAssetCollectionsWithALAssetGroupURLs:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchAssetCollectionsWithALAssetGroupURLsOptions(
            NSArray<? extends NSURL> assetGroupURLs, PHFetchOptions options);

    @Generated
    @Selector("fetchAssetCollectionsWithLocalIdentifiers:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchAssetCollectionsWithLocalIdentifiersOptions(
            NSArray<String> identifiers, PHFetchOptions options);

    @Generated
    @Selector("fetchAssetCollectionsWithType:subtype:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchAssetCollectionsWithTypeSubtypeOptions(
            @NInt long type, @NInt long subtype, PHFetchOptions options);

    @Generated
    @Selector("fetchCollectionsInCollectionList:options:")
    public static native PHFetchResult<? extends PHCollection> fetchCollectionsInCollectionListOptions(
            PHCollectionList collectionList, PHFetchOptions options);

    @Generated
    @Selector("fetchMomentsInMomentList:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchMomentsInMomentListOptions(
            PHCollectionList momentList, PHFetchOptions options);

    @Generated
    @Selector("fetchMomentsWithOptions:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchMomentsWithOptions(PHFetchOptions options);

    @Generated
    @Selector("fetchTopLevelUserCollectionsWithOptions:")
    public static native PHFetchResult<? extends PHCollection> fetchTopLevelUserCollectionsWithOptions(
            PHFetchOptions options);

    /**
     * Property to determine if a project preview was previously set.
     * Use -[PHProjectChangeRequest setProjectPreviewImage:] to set a project preview.
     */
    @Generated
    @Selector("hasProjectPreview")
    public native boolean hasProjectPreview();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHProject init();

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
    public static native PHProject new_objc();

    @Generated
    @Selector("projectExtensionData")
    public native NSData projectExtensionData();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transientAssetCollectionWithAssetFetchResult:title:")
    public static native PHAssetCollection transientAssetCollectionWithAssetFetchResultTitle(
            PHFetchResult<? extends PHAsset> fetchResult, String title);

    @Generated
    @Selector("transientAssetCollectionWithAssets:title:")
    public static native PHAssetCollection transientAssetCollectionWithAssetsTitle(NSArray<? extends PHAsset> assets,
            String title);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
