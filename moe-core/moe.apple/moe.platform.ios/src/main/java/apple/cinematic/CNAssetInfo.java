package apple.cinematic;

import apple.NSObject;
import apple.avfoundation.AVAsset;
import apple.avfoundation.AVAssetTrack;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGSize;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Information associated with an AVAsset for a cinematic video.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Cinematic")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNAssetInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CNAssetInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allCinematicTracks")
    @NotNull
    public native NSArray<? extends AVAssetTrack> allCinematicTracks();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNAssetInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CNAssetInfo allocWithZone(VoidPtr zone);

    @Generated
    @Selector("asset")
    @NotNull
    public native AVAsset asset();

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
     * Check if asset is cinematic asynchronously.
     */
    @Generated
    @Selector("checkIfCinematic:completionHandler:")
    public static native void checkIfCinematicCompletionHandler(@NotNull AVAsset asset,
            @ObjCBlock(name = "call_checkIfCinematicCompletionHandler") @NotNull Block_checkIfCinematicCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkIfCinematicCompletionHandler {
        @Generated
        void call_checkIfCinematicCompletionHandler(boolean result);
    }

    @Generated
    @Selector("cinematicDisparityTrack")
    @NotNull
    public native AVAssetTrack cinematicDisparityTrack();

    @Generated
    @Selector("cinematicMetadataTrack")
    @NotNull
    public native AVAssetTrack cinematicMetadataTrack();

    @Generated
    @Selector("cinematicVideoTrack")
    @NotNull
    public native AVAssetTrack cinematicVideoTrack();

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

    /**
     * Track to be used for frame timing
     */
    @Generated
    @Selector("frameTimingTrack")
    @NotNull
    public native AVAssetTrack frameTimingTrack();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CNAssetInfo init();

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
     * Load cinematic asset information asynchronously.
     */
    @Generated
    @Selector("loadFromAsset:completionHandler:")
    public static native void loadFromAssetCompletionHandler(@NotNull AVAsset asset,
            @ObjCBlock(name = "call_loadFromAssetCompletionHandler") @NotNull Block_loadFromAssetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromAssetCompletionHandler {
        @Generated
        void call_loadFromAssetCompletionHandler(@Nullable CNAssetInfo cinematicAssetInfo, @Nullable NSError error);
    }

    /**
     * Natural size at which cinematic video would be rendered
     */
    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    @Generated
    @Owned
    @Selector("new")
    public static native CNAssetInfo new_objc();

    /**
     * Natural size at which cinematic video would be displayed.
     * Same as naturalSize with preferredTransform applied.
     */
    @Generated
    @Selector("preferredSize")
    @ByValue
    public native CGSize preferredSize();

    /**
     * The preferred transform of the rendered image for display purposes.
     * Always the identity transform or a multiple of a 90º rotation with no scaling.
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Source metadata track IDs required to implement AVVideoCompositionInstruction protocol
     */
    @Generated
    @Selector("sampleDataTrackIDs")
    @NotNull
    public native NSArray<? extends NSNumber> sampleDataTrackIDs();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Time range over which all cinematic tracks are valid.
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

    /**
     * Source video track IDs required to implement AVVideoCompositionInstruction protocol
     */
    @Generated
    @Selector("videoCompositionTrackIDs")
    @NotNull
    public native NSArray<? extends NSNumber> videoCompositionTrackIDs();

    /**
     * Tracks required to construct AVAssetReaderVideoCompositionOutput.
     */
    @Generated
    @Selector("videoCompositionTracks")
    @NotNull
    public native NSArray<? extends AVAssetTrack> videoCompositionTracks();
}