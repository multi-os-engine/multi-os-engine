package apple.quicklookthumbnailing;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 13.0
 */
@Generated
@Library("QuickLookThumbnailing")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class QLThumbnailGenerator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected QLThumbnailGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native QLThumbnailGenerator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native QLThumbnailGenerator allocWithZone(VoidPtr zone);

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

    /**
     * Cancels the given QLThumbnailGenerationRequest.
     * 
     * @param request The request that should be cancelled.
     */
    @Generated
    @Selector("cancelRequest:")
    public native void cancelRequest(QLThumbnailGenerationRequest request);

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

    /**
     * @param completionHandler
     *                          Always called when the thumbnail generation is over.
     *                          The thumbnail passed to this handler is the most representative version of the thumbnail
     *                          that was successfully generated (if any).
     *                          If set, the error contains information about the issue that occurred while trying to
     *                          generate the thumbnail.
     *                          QLThumbnail error codes can be found in <QuickLookThumbnailing/QLThumbnailErrors.h>.
     */
    @Generated
    @Selector("generateBestRepresentationForRequest:completionHandler:")
    public native void generateBestRepresentationForRequestCompletionHandler(QLThumbnailGenerationRequest request,
            @ObjCBlock(name = "call_generateBestRepresentationForRequestCompletionHandler") Block_generateBestRepresentationForRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateBestRepresentationForRequestCompletionHandler {
        @Generated
        void call_generateBestRepresentationForRequestCompletionHandler(QLThumbnailRepresentation thumbnail,
                NSError error);
    }

    /**
     * @param updateHandler
     *                      Called for the successive requested representations of a thumbnail.
     *                      If a representation was not successfully generated, this may be called with a nil
     *                      representation.
     *                      If a requested more representative version was successfully generated before a less
     *                      representative one, this handler will be called only for the more representative version,
     *                      skipping the less representative one.
     *                      This handler is guaranteed to be called at least once, for the requested most representative
     *                      version, whether a representation could be successfully generated or not.
     *                      If set, the error contains information about the issue that occurred while trying to
     *                      generate the representation of the given type.
     *                      QLThumbnail error codes can be found in <QuickLookThumbnailing/QLThumbnailErrors.h>.
     */
    @Generated
    @Selector("generateRepresentationsForRequest:updateHandler:")
    public native void generateRepresentationsForRequestUpdateHandler(QLThumbnailGenerationRequest request,
            @ObjCBlock(name = "call_generateRepresentationsForRequestUpdateHandler") Block_generateRepresentationsForRequestUpdateHandler updateHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateRepresentationsForRequestUpdateHandler {
        @Generated
        void call_generateRepresentationsForRequestUpdateHandler(QLThumbnailRepresentation thumbnail, @NInt long type,
                NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native QLThumbnailGenerator init();

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
    public static native QLThumbnailGenerator new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Saves a thumbnail for the request on disk at fileURL.
     * The file saved at fileURL has to be deleted when it is not used anymore.
     * This is primarily intended for file provider extensions which need to upload thumbnails and have a small memory
     * limit.
     * 
     * @param contentType       An image content type to save the thumbnail as, supported by CGImageDestination, such as
     *                          kUTTypePNG or kUTTypeJPEG
     * @param completionHandler
     *                          Always called when the thumbnail generation is over. Will contain an error if the
     *                          thumbnail could not be successfully saved to disk at fileURL.
     */
    @Generated
    @Selector("saveBestRepresentationForRequest:toFileAtURL:withContentType:completionHandler:")
    public native void saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler(
            QLThumbnailGenerationRequest request, NSURL fileURL, String contentType,
            @ObjCBlock(name = "call_saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler") Block_saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler {
        @Generated
        void call_saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler(NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sharedGenerator")
    public static native QLThumbnailGenerator sharedGenerator();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
