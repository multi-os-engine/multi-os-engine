package apple.mediaplayer;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
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
 * An animated image, such as an animated music album cover art, for a media item.
 * 
 * A single instance of animated artwork is comprised of two assets: an artwork video asset, and a
 * preview image which should match the first frame of the artwork video. The preview image may be
 * used when displaying the animated artwork whilst the video becomes available.
 * 
 * Both the preview image and artwork video can be fetched asynchronously and will only be
 * requested when required at point of display. Aim to provide preview images as quickly as
 * possible once requested, and ideally synchronously.
 * 
 * Video asset `URL`s you provide must be local file `URL`s. You should make the associated assets
 * available locally before providing them via the relevant handler, for example by fetching the
 * associated video asset over the network. The `URL`s should remain valid for the lifetime of the
 * ``MPMediaItemAnimatedArtwork``, once provided.
 * 
 * ``MPMediaItemAnimatedArtwork`` should not be subclassed.
 * 
 * API-Since: 19.0
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMediaItemAnimatedArtwork extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMediaItemAnimatedArtwork(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaItemAnimatedArtwork alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPMediaItemAnimatedArtwork allocWithZone(VoidPtr zone);

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
    public native MPMediaItemAnimatedArtwork init();

    /**
     * Creates an animated artwork.
     * 
     * - Parameters:
     * - artworkID: A unique identifier for this animated artwork. This identifier should encapsulate
     * the identity of both the preview frame and video asset. If you change either, you should
     * provide an ``MPMediaItemAnimatedArtwork`` with an updated `artworkID`.
     * - previewImageRequestHandler: A handler to return a preview image for this artwork, for the
     * requested `CGSize` in pixels. Once requested, you should pass the preview image to the
     * provided completion handler, or you can pass `nil` if the preview image cannot be resolved
     * for any reason. You can call the completion handler on an arbitrary queue, however it must
     * only be called once. The `UIImage` you provide should ideally have a size equal to the
     * requested `CGSize`, however an image of the same aspect ratio is acceptable. Images that
     * diverge significantly from the requested aspect ratio may be rejected by the system. Aim to
     * provide preview images quickly and ideally synchronously, and if possible you should preload
     * these images in order to reduce perceived latency when displaying animated artwork to the
     * user.
     * - videoAssetFileURLRequestHandler: A handler to return a file `URL` for the artwork video
     * asset for this artwork, for the requested `CGSize` in pixels. Once requested, you should pass
     * the `URL` to the provided completion handler, or you can pass `nil` if the artwork video asset
     * cannot be resolved for any reason. You can call the completion handler on an arbitrary queue,
     * however it must only be called once. The `URL` you provide must reference a local asset,
     * ideally with a size equal to the requested `CGSize`, however an asset with the same aspect
     * ratio is acceptable. Assets that diverge significantly from the requested aspect ratio may be
     * rejected by the system. The video assets you provide should loop cleanly, and should be
     * available relatively quickly from this handler (particularly when re-fetched). It’s advised
     * that assets are cached for subsequent fetches.
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("initWithArtworkID:previewImageRequestHandler:videoAssetFileURLRequestHandler:")
    public native MPMediaItemAnimatedArtwork initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler(
            @NotNull String artworkID,
            @ObjCBlock(name = "call_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_1") @NotNull Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_1 previewImageRequestHandler,
            @ObjCBlock(name = "call_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_2") @NotNull Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_2 videoAssetFileURLRequestHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_1 {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_1 {
            @Generated
            void call_Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_1(
                    @Nullable UIImage arg0);
        }

        @Generated
        void call_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_1(@ByValue CGSize size,
                @ObjCBlock(name = "call_Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_1") @NotNull Block_Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_1 completion);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_2 {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_2 {
            @Generated
            void call_Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_2(
                    @Nullable NSURL arg0);
        }

        @Generated
        void call_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_2(@ByValue CGSize size,
                @ObjCBlock(name = "call_Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_2") @NotNull Block_Block_initWithArtworkIDPreviewImageRequestHandlerVideoAssetFileURLRequestHandler_2 completion);
    }

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
    public static native MPMediaItemAnimatedArtwork new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}