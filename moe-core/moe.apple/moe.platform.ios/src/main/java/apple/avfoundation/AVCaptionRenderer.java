package apple.avfoundation;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.coregraphics.opaque.CGContextRef;
import apple.coremedia.struct.CMTime;
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
 * AVCaptionRenderer
 * 
 * An instance of AVCaptionRenderer represents a service that can render the captions for a particular time
 * 
 * An instance of AVCaptionRenderer performs drawing of a caption "scene" from a population of captions given a time. If
 * there are no captions or no captions at the specified time, "emptiness" will still be drawn (e.g., flood filling with
 * zero alpha or a color).
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptionRenderer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptionRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptionRenderer alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptionRenderer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] bounds
     * 
     * A CGRect holding bounds for the drawing of caption scene(s).
     * 
     * This is a CGRect indicating where captions are drawn using renderInContext:atTime: Once established, this CGRect
     * is used in each call to renderInContext:atTime: until it is changed to another value. This should be set up
     * earlier than drawing.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

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
     * captionSceneChangesInRange:
     * 
     * Determine render time ranges within an enclosing time range to account for visual changes among captions.
     * 
     * This is an optional service useful for optimizing drawing. A client can perform drawing without it.
     * 
     * As captions may become active and inactive throughout the timeline, this method will return a NSArray holding
     * scene objects with time ranges on whose edges there's a visual change. The client can use the ranges of time
     * between these edges with -renderInContext:atTime: to ensure all visual changes are rendered. The returned time
     * ranges consider activation/deactivation of captions, temporal overlapping, and intra-caption timing requirements
     * (e.g., character reveal animations). Time ranges may be returned where no captions are active as this is also a
     * change in the caption "scene".
     * 
     * The returned NSArray contains AVCaptionRendererScenes, each holding the CMTimeRange of that scene but potentially
     * other information that may be useful to the client during renderering.
     * 
     * The consideredTimeRange parameter is a CMTimeRange expressing the limits for consideration. The extent of this
     * range does not need to correspond to the timing of captions. It might be the range from 0 to some duration. For
     * efficiency, the range can be limited to a window of time. It is also possible to use the range anchored at a time
     * and extending in the direction of playback.
     * 
     * API-Since: 18.0
     * 
     * @return An NSArray of AVCaptionRendererScenes; perhaps empty if there are no captions intersecting with the
     *         consideredTimeRange
     */
    @Generated
    @Selector("captionSceneChangesInRange:")
    @NotNull
    public native NSArray<? extends AVCaptionRendererScene> captionSceneChangesInRange(
            @ByValue CMTimeRange consideredTimeRange);

    /**
     * [@property] captions
     * 
     * A NSArray holding captions to consider for rendering.
     * 
     * This is the array of AVCaptions to consider when drawing. The array can contain no captions.
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
    public native AVCaptionRenderer init();

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
    public static native AVCaptionRenderer new_objc();

    /**
     * renderInContext:forTime:
     * 
     * Draw the captions corresponding to a time established by the AVCaptions to a CGContext.
     * 
     * Captions are drawn into the CGContextRef based upon their activation at the specified time. If there are no
     * captions or no captions at the specified time, "emptiness" will still be drawn (e.g., flood filling with zero
     * alpha or a color).
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("renderInContext:forTime:")
    public native void renderInContextForTime(@NotNull CGContextRef ctx, @ByValue CMTime time);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] bounds
     * 
     * A CGRect holding bounds for the drawing of caption scene(s).
     * 
     * This is a CGRect indicating where captions are drawn using renderInContext:atTime: Once established, this CGRect
     * is used in each call to renderInContext:atTime: until it is changed to another value. This should be set up
     * earlier than drawing.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    /**
     * [@property] captions
     * 
     * A NSArray holding captions to consider for rendering.
     * 
     * This is the array of AVCaptions to consider when drawing. The array can contain no captions.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setCaptions:")
    public native void setCaptions(@NotNull NSArray<? extends AVCaption> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}