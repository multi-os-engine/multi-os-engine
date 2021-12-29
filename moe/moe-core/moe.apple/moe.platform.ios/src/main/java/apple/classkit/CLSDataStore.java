package apple.classkit;

import apple.NSObject;
import apple.classkit.protocol.CLSDataStoreDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

/**
 * The data store maintains and syncs your app's contexts.
 */
@Generated
@Library("ClassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLSDataStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLSDataStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Returns the context that is currently active. If no context is active, this will return nil.
     */
    @Generated
    @Selector("activeContext")
    public native CLSContext activeContext();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLSDataStore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CLSDataStore allocWithZone(VoidPtr zone);

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

    /**
     * Complete all assigned actvities.
     * <p>
     * Marks all of the currently active assigned activities for this contextPath as complete.
     */
    @Generated
    @Selector("completeAllAssignedActivitiesMatching:")
    public native void completeAllAssignedActivitiesMatching(NSArray<String> contextPath);

    /**
     * Returns contexts matching a set of identifiers where each identifier is the parent of the following identifier.
     * <p>
     * For example: @c@["math-game", @c"level1"] returns two contexts where @em math-game is the parent of @em level1.
     * If there are any missing contexts, they will be filled in by calling the following method on the data store's delegate:
     * [@code] -[CLSDataStoreDelegate createContextForIdentifier:parentContext:parentIdentifierPath:] @endcode
     * If the dataStore does not have a delegate and there are missing contexts then an incomplete list of contexts will be passed to the completion handler.  Completion block may be called on a background thread.
     */
    @Generated
    @Selector("contextsMatchingIdentifierPath:completion:")
    public native void contextsMatchingIdentifierPathCompletion(NSArray<String> identifierPath,
            @ObjCBlock(name = "call_contextsMatchingIdentifierPathCompletion") Block_contextsMatchingIdentifierPathCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_contextsMatchingIdentifierPathCompletion {
        @Generated
        void call_contextsMatchingIdentifierPathCompletion(NSArray<? extends CLSContext> contexts, NSError error);
    }

    /**
     * Fetch contexts matching a predicate.
     * <p>
     * For example: NSPredicate<topic == kCLSContextTopicPhysics AND parent == someContext>.  Completion block may be called on a background thread.
     */
    @Generated
    @Selector("contextsMatchingPredicate:completion:")
    public native void contextsMatchingPredicateCompletion(NSPredicate predicate,
            @ObjCBlock(name = "call_contextsMatchingPredicateCompletion") Block_contextsMatchingPredicateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_contextsMatchingPredicateCompletion {
        @Generated
        void call_contextsMatchingPredicateCompletion(NSArray<? extends CLSContext> contexts, NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The data store delegate allows for easy population of the app's context hierarchy.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CLSDataStoreDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CLSDataStore init();

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

    /**
     * Fetch the top level context for the current app.
     * <p>
     * The main context is automatically created. Add child contexts to this context to persist them in the data store.
     */
    @Generated
    @Selector("mainAppContext")
    public native CLSContext mainAppContext();

    @Generated
    @Owned
    @Selector("new")
    public static native CLSDataStore new_objc();

    /**
     * Mark a context for removal.
     * <p>
     * Save to commit removal. Removal cascades and deletes all descendants.
     */
    @Generated
    @Selector("removeContext:")
    public native void removeContext(CLSContext context);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the most recently started activity that is running.
     */
    @Generated
    @Selector("runningActivity")
    public native CLSActivity runningActivity();

    /**
     * Save changes made in the data store.
     * <p>
     * Save new/modified/removed contexts, activities, etc. to the local store. In case of an error -[NSError userInfo] will contain the object that caused the error under the CLSErrorObjectKey..
     */
    @Generated
    @Selector("saveWithCompletion:")
    public native void saveWithCompletion(
            @ObjCBlock(name = "call_saveWithCompletion") Block_saveWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveWithCompletion {
        @Generated
        void call_saveWithCompletion(NSError error);
    }

    /**
     * The data store delegate allows for easy population of the app's context hierarchy.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CLSDataStoreDelegate value);

    /**
     * The data store delegate allows for easy population of the app's context hierarchy.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CLSDataStoreDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The data store provides read/write access to your app's ClassKit data.
     * <p>
     * Data written to the data store is automatically synced via iCloud across the user's devices.
     */
    @Generated
    @Selector("shared")
    public static native CLSDataStore shared();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Implement to fetch the current CLSActivity instance for your document to add progress to.
     * <p>
     * Gets the currently CLSActivity for the file. If no current activity exists, one will be created for you.
     *
     * @param url File url for the document.
     */
    @Generated
    @Selector("fetchActivityForURL:completion:")
    public native void fetchActivityForURLCompletion(NSURL url,
            @ObjCBlock(name = "call_fetchActivityForURLCompletion") Block_fetchActivityForURLCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchActivityForURLCompletion {
        @Generated
        void call_fetchActivityForURLCompletion(CLSActivity activity, NSError error);
    }
}
