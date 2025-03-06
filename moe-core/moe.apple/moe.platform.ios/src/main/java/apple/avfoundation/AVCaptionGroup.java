package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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

/**
 * AVCaptionGroup
 * 
 * An instance of AVCaptionGroup represents zero or more captions that intersect in time.
 * 
 * The time range of each caption may overlap as there can be more than one active caption at a time. A sequence of
 * AVCaptionGroup objects represents such overlapping caption timeline.
 * 
 * An instance of AVCaptionGroup has a time range and a list of active captions for the time range. Two successive
 * AVCaptionGroup objects have contiguous and non-overlapping time ranges. A new AVCaptionGroup time range commences
 * whenever any of caption becomes active or inactive. When a caption spans over multiple AVCaptionGroup time ranges,
 * these AVCaptionGroup objects refer to an equal AVCaption object.
 * 
 * An empty AVCaptionGroup represents the time range without any active captions.
 * 
 * The list of captions in the group is ordered according to the document order. For example, suppose a TTML document
 * has two temporally overhapping captions:
 * 
 * <div>
 * <p begin="1s" end="3s">Hello<p>
 * <p begin="0s" end="2s">World<p>
 * </div>
 * 
 * AVCaptionGroup for time range 1s to 2s has the list of captions: Hello and World in this order despite the fact that
 * "World" is shown earlier than "Hello".
 * 
 * A client may use AVCaptionGroup to get the list of active captions for the time range. For example, presentation
 * processing may find the AVCaptionGroup object for the current time, get the list of captions, and place them into the
 * destination display region.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptionGroup extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptionGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptionGroup alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptionGroup allocWithZone(VoidPtr zone);

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

    /**
     * [@property] captions
     * 
     * An array of AVCaption objects.
     * 
     * If the value is an empty array, the caption group represents a region of the timeline in which there are no
     * captions.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("captions")
    @NotNull
    public native NSArray<? extends AVCaption> captions();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native AVCaptionGroup init();

    /**
     * initWithCaptions:timeRange:
     * 
     * Initializes a caption group with the given set of captions and the time range.
     * 
     * Every caption in the array must be equal or sub range of the time range, otherwise an exception is raised.
     * 
     * @param captions
     *                 The captions that will be included in the group. The array is coped.
     * @return
     *         A newly-initialized caption group.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("initWithCaptions:timeRange:")
    public native AVCaptionGroup initWithCaptionsTimeRange(@NotNull NSArray<? extends AVCaption> captions,
            @ByValue CMTimeRange timeRange);

    /**
     * initWithTimeRange:
     * 
     * Initializes an empty caption group with the given time range.
     * 
     * This is a convenient initializer to create an empty caption group time range.
     * 
     * @param timeRange
     *                  The time range for which there are no captions.
     * @return
     *         A newly-initialized empty caption group.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("initWithTimeRange:")
    public native AVCaptionGroup initWithTimeRange(@ByValue CMTimeRange timeRange);

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
    public static native AVCaptionGroup new_objc();

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

    /**
     * [@property] timeRange
     * 
     * The time range represented by the caption group.
     * 
     * If there are no captions in the group (i.e. the value of the captions property is an empty array), then the value
     * of this property represents the time range of a sequence where no captions are present.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}