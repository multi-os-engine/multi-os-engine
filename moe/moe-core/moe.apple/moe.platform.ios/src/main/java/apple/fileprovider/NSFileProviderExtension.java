package apple.fileprovider;

import apple.NSObject;
import apple.coregraphics.struct.CGSize;
import apple.fileprovider.protocol.NSFileProviderEnumerator;
import apple.fileprovider.protocol.NSFileProviderItem;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileProviderExtension extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileProviderExtension(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("URLForItemWithPersistentIdentifier:")
    public native NSURL URLForItemWithPersistentIdentifier(String identifier);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileProviderExtension alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("documentStorageURL")
    public native NSURL documentStorageURL();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSFileProviderExtension init();

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
    @Selector("itemChangedAtURL:")
    public native void itemChangedAtURL(NSURL url);

    @Generated
    @Selector("itemForIdentifier:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileProviderItem itemForIdentifierError(String identifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("persistentIdentifierForItemAtURL:")
    public native String persistentIdentifierForItemAtURL(NSURL url);

    @Generated
    @Selector("placeholderURLForURL:")
    public static native NSURL placeholderURLForURL(NSURL url);

    @Generated
    @Selector("providePlaceholderAtURL:completionHandler:")
    public native void providePlaceholderAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_providePlaceholderAtURLCompletionHandler") Block_providePlaceholderAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_providePlaceholderAtURLCompletionHandler {
        @Generated
        void call_providePlaceholderAtURLCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("providerIdentifier")
    public native String providerIdentifier();

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
    @Selector("startProvidingItemAtURL:completionHandler:")
    public native void startProvidingItemAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_startProvidingItemAtURLCompletionHandler") Block_startProvidingItemAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startProvidingItemAtURLCompletionHandler {
        @Generated
        void call_startProvidingItemAtURLCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("stopProvidingItemAtURL:")
    public native void stopProvidingItemAtURL(NSURL url);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("writePlaceholderAtURL:withMetadata:error:")
    public static native boolean writePlaceholderAtURLWithMetadataError(NSURL placeholderURL,
            NSDictionary<String, ?> metadata, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("createDirectoryWithName:inParentItemIdentifier:completionHandler:")
    public native void createDirectoryWithNameInParentItemIdentifierCompletionHandler(String directoryName,
            String parentItemIdentifier,
            @ObjCBlock(name = "call_createDirectoryWithNameInParentItemIdentifierCompletionHandler") Block_createDirectoryWithNameInParentItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_createDirectoryWithNameInParentItemIdentifierCompletionHandler {
        @Generated
        void call_createDirectoryWithNameInParentItemIdentifierCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }

    @Generated
    @Selector("deleteItemWithIdentifier:completionHandler:")
    public native void deleteItemWithIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_deleteItemWithIdentifierCompletionHandler") Block_deleteItemWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteItemWithIdentifierCompletionHandler {
        @Generated
        void call_deleteItemWithIdentifierCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("domain")
    public native NSFileProviderDomain domain();

    @Generated
    @Selector("enumeratorForContainerItemIdentifier:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileProviderEnumerator enumeratorForContainerItemIdentifierError(String containerItemIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("fetchThumbnailsForItemIdentifiers:requestedSize:perThumbnailCompletionHandler:completionHandler:")
    public native NSProgress fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler(
            NSArray<String> itemIdentifiers, @ByValue CGSize size,
            @ObjCBlock(name = "call_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_2") Block_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_2 perThumbnailCompletionHandler,
            @ObjCBlock(name = "call_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_3") Block_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_3 completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_2 {
        @Generated
        void call_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_2(
                String arg0, NSData arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_3 {
        @Generated
        void call_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_3(
                NSError arg0);
    }

    @Generated
    @Selector("importDocumentAtURL:toParentItemIdentifier:completionHandler:")
    public native void importDocumentAtURLToParentItemIdentifierCompletionHandler(NSURL fileURL,
            String parentItemIdentifier,
            @ObjCBlock(name = "call_importDocumentAtURLToParentItemIdentifierCompletionHandler") Block_importDocumentAtURLToParentItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_importDocumentAtURLToParentItemIdentifierCompletionHandler {
        @Generated
        void call_importDocumentAtURLToParentItemIdentifierCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }

    @Generated
    @Selector("renameItemWithIdentifier:toName:completionHandler:")
    public native void renameItemWithIdentifierToNameCompletionHandler(String itemIdentifier, String itemName,
            @ObjCBlock(name = "call_renameItemWithIdentifierToNameCompletionHandler") Block_renameItemWithIdentifierToNameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_renameItemWithIdentifierToNameCompletionHandler {
        @Generated
        void call_renameItemWithIdentifierToNameCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Generated
    @Selector("reparentItemWithIdentifier:toParentItemWithIdentifier:newName:completionHandler:")
    public native void reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler(
            String itemIdentifier, String parentItemIdentifier, String newName,
            @ObjCBlock(name = "call_reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler") Block_reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler {
        @Generated
        void call_reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }

    @Generated
    @Selector("setFavoriteRank:forItemIdentifier:completionHandler:")
    public native void setFavoriteRankForItemIdentifierCompletionHandler(NSNumber favoriteRank, String itemIdentifier,
            @ObjCBlock(name = "call_setFavoriteRankForItemIdentifierCompletionHandler") Block_setFavoriteRankForItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFavoriteRankForItemIdentifierCompletionHandler {
        @Generated
        void call_setFavoriteRankForItemIdentifierCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Generated
    @Selector("setLastUsedDate:forItemIdentifier:completionHandler:")
    public native void setLastUsedDateForItemIdentifierCompletionHandler(NSDate lastUsedDate, String itemIdentifier,
            @ObjCBlock(name = "call_setLastUsedDateForItemIdentifierCompletionHandler") Block_setLastUsedDateForItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setLastUsedDateForItemIdentifierCompletionHandler {
        @Generated
        void call_setLastUsedDateForItemIdentifierCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Generated
    @Selector("setTagData:forItemIdentifier:completionHandler:")
    public native void setTagDataForItemIdentifierCompletionHandler(NSData tagData, String itemIdentifier,
            @ObjCBlock(name = "call_setTagDataForItemIdentifierCompletionHandler") Block_setTagDataForItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTagDataForItemIdentifierCompletionHandler {
        @Generated
        void call_setTagDataForItemIdentifierCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Generated
    @Selector("supportedServiceSourcesForItemIdentifier:error:")
    public native NSArray<?> supportedServiceSourcesForItemIdentifierError(String itemIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("trashItemWithIdentifier:completionHandler:")
    public native void trashItemWithIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_trashItemWithIdentifierCompletionHandler") Block_trashItemWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_trashItemWithIdentifierCompletionHandler {
        @Generated
        void call_trashItemWithIdentifierCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }

    @Generated
    @Selector("untrashItemWithIdentifier:toParentItemIdentifier:completionHandler:")
    public native void untrashItemWithIdentifierToParentItemIdentifierCompletionHandler(String itemIdentifier,
            String parentItemIdentifier,
            @ObjCBlock(name = "call_untrashItemWithIdentifierToParentItemIdentifierCompletionHandler") Block_untrashItemWithIdentifierToParentItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_untrashItemWithIdentifierToParentItemIdentifierCompletionHandler {
        @Generated
        void call_untrashItemWithIdentifierToParentItemIdentifierCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }
}