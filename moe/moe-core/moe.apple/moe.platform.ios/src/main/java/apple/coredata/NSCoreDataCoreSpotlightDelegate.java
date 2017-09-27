package apple.coredata;

import apple.NSObject;
import apple.corespotlight.CSSearchableIndex;
import apple.corespotlight.CSSearchableItemAttributeSet;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attributeSetForObject:")
    public native CSSearchableItemAttributeSet attributeSetForObject(NSManagedObject object);

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
    @Selector("domainIdentifier")
    public native String domainIdentifier();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("indexName")
    public native String indexName();

    @Generated
    @Selector("init")
    public native NSCoreDataCoreSpotlightDelegate init();

    @Generated
    @Selector("initForStoreWithDescription:model:")
    public native NSCoreDataCoreSpotlightDelegate initForStoreWithDescriptionModel(
            NSPersistentStoreDescription description, NSManagedObjectModel model);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("searchableIndex:reindexAllSearchableItemsWithAcknowledgementHandler:")
    public native void searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler(
            CSSearchableIndex searchableIndex,
            @ObjCBlock(name = "call_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler") Block_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler acknowledgementHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler {
        @Generated
        void call_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler();
    }

    @Generated
    @Selector("searchableIndex:reindexSearchableItemsWithIdentifiers:acknowledgementHandler:")
    public native void searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler(
            CSSearchableIndex searchableIndex, NSArray<String> identifiers,
            @ObjCBlock(name = "call_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler") Block_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler acknowledgementHandler);

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
}