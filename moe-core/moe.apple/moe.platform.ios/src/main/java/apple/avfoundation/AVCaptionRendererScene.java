package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * AVCaptionRendererScene
 * 
 * An instance of AVCaptionRendererScene holds a time range and associated state indicating when the AVCaptionRenderer
 * will draw different output.
 * 
 * In rendering the timeline established by the captions referenced by an AVCaptionRenderer, there are considerations
 * such as temporal overlapping of captions, the existence of captions and other graphical elements like regions, and
 * whether captions may be animated (e.g., scrolling in regions, character reveal in a caption). To communicate to the
 * AVCaptionRenderer client the minimal set of time ranges where there are any visual differences,
 * AVCaptionRendererScenes can be requested from -[AVCaptionRenderer captionSceneChangesInRange:]. A client wanting to
 * optimize drawing performance may use this timing information to draw scenes only once per scene. Alternatively,
 * clients can ignore scenes and repeatedly call renderInContext:atTime: but this may have additional performance
 * impact.
 * 
 * Other information about the rendering of a caption scene can be communicated through the AVCaptionRendererScene. For
 * example, if captions are animated, an AVCaptionRendererScene with the time range and an indication of the animation
 * occurring will be returned. There should be no inference from the number of scenes to the number of captions. Even a
 * single caption with internal animations in part of its duration could result in multiple AVCaptionRendererScenes
 * being produced.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptionRendererScene extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptionRendererScene(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptionRendererScene alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptionRendererScene allocWithZone(VoidPtr zone);

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
     * [@property] hasActiveCaptions
     * 
     * The scene contains one or more active captions.
     * 
     * Clients should not use this to restrict their drawing and should call renderInContext:atTime: to draw
     * "emptiness". However, this information may be useful for purposes such as scrubbing to times where captions are
     * present, skipping scenes in which no captions are present.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("hasActiveCaptions")
    public native boolean hasActiveCaptions();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptionRendererScene init();

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

    /**
     * [@property] needsPeriodicRefresh
     * 
     * The scene may have embedded animations or other state where periodic redrawing while playing through this scene
     * is needed.
     * 
     * This property indicates if refreshing should occur if the client is progressing through the content. If the
     * client is not progressing (i.e., it is treating playback as though the rate is 0.0), a single render at the
     * current render time suffices. This property does not prescribe a refresh rate. A client is free to choose a
     * refresh rate corresponding to rates of associated video frames or other timing appropriate for the client.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("needsPeriodicRefresh")
    public native boolean needsPeriodicRefresh();

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptionRendererScene new_objc();

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
     * The time range during which new captions will not be introduced into or existing captions will be retired from
     * the caption scene
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