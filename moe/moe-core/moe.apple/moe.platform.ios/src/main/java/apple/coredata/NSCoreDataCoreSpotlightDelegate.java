package apple.coredata;

import apple.NSObject;
import apple.corespotlight.CSSearchableIndex;
import apple.corespotlight.CSSearchableItemAttributeSet;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NSCoreDataSpotlightDelegate implements the CSSearchableIndexDelegate API, but can't
 * publicly declare it due to linkage requirements.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCoreDataCoreSpotlightDelegate extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCoreDataCoreSpotlightDelegate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCoreDataCoreSpotlightDelegate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCoreDataCoreSpotlightDelegate allocWithZone(VoidPtr zone);

    /**
     * Create the searchable attributes for the managed object. Override to return nil if you do not want the object
     * included in the index.
     */
    @Nullable
    @Generated
    @Selector("attributeSetForObject:")
    public native CSSearchableItemAttributeSet attributeSetForObject(@NotNull NSManagedObject object);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
     * CoreSpotlight domain identifer; default is the store's identifier
     */
    @NotNull
    @Generated
    @Selector("domainIdentifier")
    public native String domainIdentifier();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * CoreSpotlight index name; default nil
     */
    @Nullable
    @Generated
    @Selector("indexName")
    public native String indexName();

    @Generated
    @Selector("init")
    public native NSCoreDataCoreSpotlightDelegate init();

    /**
     * API-Since: 11.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("initForStoreWithDescription:model:")
    public native NSCoreDataCoreSpotlightDelegate initForStoreWithDescriptionModel(
            @NotNull NSPersistentStoreDescription description, @NotNull NSManagedObjectModel model);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSCoreDataCoreSpotlightDelegate new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * CSSearchableIndexDelegate conformance
     */
    @Generated
    @Selector("searchableIndex:reindexAllSearchableItemsWithAcknowledgementHandler:")
    public native void searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler(
            @NotNull CSSearchableIndex searchableIndex,
            @NotNull @ObjCBlock(name = "call_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler") Block_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler acknowledgementHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler {
        @Generated
        void call_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler();
    }

    @Generated
    @Selector("searchableIndex:reindexSearchableItemsWithIdentifiers:acknowledgementHandler:")
    public native void searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler(
            @NotNull CSSearchableIndex searchableIndex, @NotNull NSArray<String> identifiers,
            @NotNull @ObjCBlock(name = "call_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler") Block_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler acknowledgementHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler {
        @Generated
        void call_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler();
    }

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
     * Deletes all searchable items for the configured Spotlight index. Calling this method may return
     * errors from lower layer dependencies, such as Core Data and Core Spotlight.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("deleteSpotlightIndexWithCompletionHandler:")
    public native void deleteSpotlightIndexWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_deleteSpotlightIndexWithCompletionHandler") Block_deleteSpotlightIndexWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSpotlightIndexWithCompletionHandler {
        @Generated
        void call_deleteSpotlightIndexWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Designated initializer for NSCoreDataCoreSpotlightDelegate. If this method is used to create the object,
     * -[NSCoreDataCoreSpotlightDelegate startSpotlightIndexing] must be called for the delegate to begin indexing.
     * 
     * NSCoreDataSpotlightDelegate requires that
     * - the store type is NSSQLiteStoreType.
     * - the store has persistent history tracking enabled.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("initForStoreWithDescription:coordinator:")
    public native NSCoreDataCoreSpotlightDelegate initForStoreWithDescriptionCoordinator(
            @NotNull NSPersistentStoreDescription description, @NotNull NSPersistentStoreCoordinator psc);

    /**
     * Returns if indexing is enabled or not.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isIndexingEnabled")
    public native boolean isIndexingEnabled();

    /**
     * Starts Spotlight indexing.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("startSpotlightIndexing")
    public native void startSpotlightIndexing();

    /**
     * Stops Spotlight indexing.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("stopSpotlightIndexing")
    public native void stopSpotlightIndexing();
}
