package apple.photosui;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * A filter that restricts which types of assets \c PHPickerViewController can show.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("PhotosUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHPickerFilter extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PHPickerFilter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHPickerFilter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHPickerFilter allocWithZone(VoidPtr zone);

    /**
     * Returns a new filter formed by OR-ing the filters in a given array.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("anyFilterMatchingSubfilters:")
    public static native PHPickerFilter anyFilterMatchingSubfilters(NSArray<? extends PHPickerFilter> subfilters);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The filter for images.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("imagesFilter")
    public static native PHPickerFilter imagesFilter();

    @Generated
    @Selector("init")
    public native PHPickerFilter init();

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

    /**
     * The filter for live photos.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("livePhotosFilter")
    public static native PHPickerFilter livePhotosFilter();

    @Generated
    @Owned
    @Selector("new")
    public static native PHPickerFilter new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The filter for videos.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("videosFilter")
    public static native PHPickerFilter videosFilter();

    /**
     * Returns a new filter formed by AND-ing the filters in a given array.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allFilterMatchingSubfilters:")
    public static native PHPickerFilter allFilterMatchingSubfilters(NSArray<? extends PHPickerFilter> subfilters);

    /**
     * The filter for bursts.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("burstsFilter")
    public static native PHPickerFilter burstsFilter();

    /**
     * The filter for Cinematic videos.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("cinematicVideosFilter")
    public static native PHPickerFilter cinematicVideosFilter();

    /**
     * The filter for Depth Effect photos.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("depthEffectPhotosFilter")
    public static native PHPickerFilter depthEffectPhotosFilter();

    /**
     * Returns a new filter formed by negating the given filter.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("notFilterOfSubfilter:")
    public static native PHPickerFilter notFilterOfSubfilter(PHPickerFilter subfilter);

    /**
     * The filter for panorama photos.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("panoramasFilter")
    public static native PHPickerFilter panoramasFilter();

    /**
     * Returns a new filter based on the asset playback style.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("playbackStyleFilter:")
    public static native PHPickerFilter playbackStyleFilter(@NInt long playbackStyle);

    /**
     * The filter for screen recordings.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("screenRecordingsFilter")
    public static native PHPickerFilter screenRecordingsFilter();

    /**
     * The filter for screenshots.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("screenshotsFilter")
    public static native PHPickerFilter screenshotsFilter();

    /**
     * The filter for Slow-Mo videos.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("slomoVideosFilter")
    public static native PHPickerFilter slomoVideosFilter();

    /**
     * The filter for time-lapse videos.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("timelapseVideosFilter")
    public static native PHPickerFilter timelapseVideosFilter();
}
