package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uniformtypeidentifiers.UTType;
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
 * HKAttachmentStore
 * 
 * The HKAttachmentStore class provides an interface for accessing and storing HKAttachment objects.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKAttachmentStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKAttachmentStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addAttachmentToObject:name:contentType:URL:metadata:completion:
     * 
     * Creates a new HKAttachment using the passed in NSURL and attaches it to the specified HKObject.
     * 
     * @param object      The object for which to add the HKAttachment.
     * @param name        The name of the attachment.
     * @param contentType The content type of the attachment.
     * @param URL         The NSURL to use to create the attachment.
     * @param metadata    Extra information describing the attachment.
     * @param completion  Called with an HKAttachment instance once the file was successfully saved and attached,
     *                    otherwise called with an error.
     */
    @Generated
    @Selector("addAttachmentToObject:name:contentType:URL:metadata:completion:")
    public native void addAttachmentToObjectNameContentTypeURLMetadataCompletion(HKObject object, String name,
            UTType contentType, NSURL URL, NSDictionary<String, ?> metadata,
            @ObjCBlock(name = "call_addAttachmentToObjectNameContentTypeURLMetadataCompletion") Block_addAttachmentToObjectNameContentTypeURLMetadataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAttachmentToObjectNameContentTypeURLMetadataCompletion {
        @Generated
        void call_addAttachmentToObjectNameContentTypeURLMetadataCompletion(HKAttachment attachment, NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKAttachmentStore alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKAttachmentStore allocWithZone(VoidPtr zone);

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

    /**
     * getAttachmentsForObject:completion:
     * 
     * Retrieves a list of attachments for a given object.
     * 
     * @param object     The object for which to retrieve attachments.
     * @param completion Called with a list of attachments or an error.
     */
    @Generated
    @Selector("getAttachmentsForObject:completion:")
    public native void getAttachmentsForObjectCompletion(HKObject object,
            @ObjCBlock(name = "call_getAttachmentsForObjectCompletion") Block_getAttachmentsForObjectCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getAttachmentsForObjectCompletion {
        @Generated
        void call_getAttachmentsForObjectCompletion(NSArray<? extends HKAttachment> attachments, NSError error);
    }

    /**
     * getDataForAttachment:completion:
     * 
     * Retrieves the NSData for the given HKAttachment.
     * 
     * Prefer @c streamDataForAttachment:completion: for large files that support incremental reading to limit your
     * app's peak memory usage.
     * The attachment's data may not always be available locally, and could be stored in iCloud.
     * 
     * @param attachment The attachment object to read data from.
     * @param completion Called with an NSData or an error.
     * @return An NSProgress object to use for tracking the progress of downloading the attachment's data from iCloud.
     */
    @Generated
    @Selector("getDataForAttachment:completion:")
    public native NSProgress getDataForAttachmentCompletion(HKAttachment attachment,
            @ObjCBlock(name = "call_getDataForAttachmentCompletion") Block_getDataForAttachmentCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDataForAttachmentCompletion {
        @Generated
        void call_getDataForAttachmentCompletion(NSData attachmentData, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKAttachmentStore init();

    /**
     * initWithHealthStore:
     * 
     * The designated initializer to create an HKAttachmentStore.
     * 
     * @param healthStore Specifies the HKHealthStore object to use.
     */
    @Generated
    @Selector("initWithHealthStore:")
    public native HKAttachmentStore initWithHealthStore(HKHealthStore healthStore);

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
    public static native HKAttachmentStore new_objc();

    /**
     * removeAttachment:fromObject:completion:
     * 
     * Removes the given HKAttachment from the specified HKObject.
     * 
     * @param attachment The HKAttachment to be removed.
     * @param object     The object from which to remove the attachment.
     * @param completion Called once the remove operation finishes.
     */
    @Generated
    @Selector("removeAttachment:fromObject:completion:")
    public native void removeAttachmentFromObjectCompletion(HKAttachment attachment, HKObject object,
            @ObjCBlock(name = "call_removeAttachmentFromObjectCompletion") Block_removeAttachmentFromObjectCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAttachmentFromObjectCompletion {
        @Generated
        void call_removeAttachmentFromObjectCompletion(boolean success, NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * streamDataForAttachment:dataHandler:
     * 
     * Streams the given HKAttachment's data as ordered NSData chunks.
     * 
     * The dataHandler's done parameter is set to YES when all chunks have been streamed.
     * The attachment's data may not always be available locally, and could be stored in iCloud.
     * 
     * @param attachment  The attachment object to read data from.
     * @param dataHandler Called with an NSData chunk or an error. When done is YES, the operation has completed.
     * @return An NSProgress object to use for tracking the progress of downloading the attachment's data from iCloud.
     */
    @Generated
    @Selector("streamDataForAttachment:dataHandler:")
    public native NSProgress streamDataForAttachmentDataHandler(HKAttachment attachment,
            @ObjCBlock(name = "call_streamDataForAttachmentDataHandler") Block_streamDataForAttachmentDataHandler dataHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_streamDataForAttachmentDataHandler {
        @Generated
        void call_streamDataForAttachmentDataHandler(NSData dataChunk, NSError error, boolean done);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}