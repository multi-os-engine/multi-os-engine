package apple.oslog;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * OSLogStore
 * 
 * A set of entries from the unified logging system. Instances
 * represent a fixed range of entries and may be backed by a
 * logarchive or the Mac's local store.
 * 
 * Entries in OSLogStore objects are used by OSLogEnumerator
 * instances; one store can support multiple OSLogEnumerator
 * instances concurrently.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("OSLog")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OSLogStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected OSLogStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native OSLogStore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native OSLogStore allocWithZone(VoidPtr zone);

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
     * entriesEnumeratorAndReturnError
     * 
     * Return an OSLogEnumerator object with default options for
     * viewing the entries; all are viewed, from earliest to latest.
     * 
     * @param error
     *              If the enumerator cannot be set up, return nil and set this
     *              to a pointer to an error object that describes the reason.
     * 
     *              API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("entriesEnumeratorAndReturnError:")
    public native OSLogEnumerator entriesEnumeratorAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * entriesEnumeratorWithOptions
     * 
     * Return an OSLogEnumerator object based on an underlying store.
     * This object represents the sequence of entries for the store.
     * OSLogStore. Additional parameters control which entries are
     * yielded and their order.
     * 
     * @param options
     *                  Control the direction of iteration.
     * 
     * @param position
     *                  Where to start iteration. If nil, depend on the direction of
     *                  the iteration: if forwards, start with the earliest entry; if
     *                  reverse, start with the latest entry.
     * 
     * @param predicate
     *                  A predicate that filters which entries are in the sequence. If
     *                  this is nil, yield all entries.
     * 
     * @param error
     *                  If the enumerator cannot be set up --- for example, the
     *                  predicate has an unrecognized key --- return nil and set this
     *                  to a pointer to an error object that describes the reason.
     * 
     *                  API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("entriesEnumeratorWithOptions:position:predicate:error:")
    public native OSLogEnumerator entriesEnumeratorWithOptionsPositionPredicateError(@NUInt long options,
            @Nullable OSLogPosition position, @Nullable NSPredicate predicate,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native OSLogStore init();

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
    public static native OSLogStore new_objc();

    /**
     * positionWithDate
     * 
     * Return a position representing the time specified.
     * 
     * If there are multiple occurences of the same time --- if, for
     * example, there was a time change during the range of entries
     * --- the earliest occurrence is used.
     * 
     * API-Since: 15.0
     * 
     * @param date
     *             The date to look for.
     */
    @NotNull
    @Generated
    @Selector("positionWithDate:")
    public native OSLogPosition positionWithDate(@NotNull NSDate date);

    /**
     * positionWithTimeIntervalSinceEnd
     * 
     * Return a position representing an offset since the end of the time
     * range that the entries span.
     * 
     * @param seconds
     *                The seconds to add to the last time point in the range of entries.
     * 
     *                API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("positionWithTimeIntervalSinceEnd:")
    public native OSLogPosition positionWithTimeIntervalSinceEnd(double seconds);

    /**
     * positionWithTimeIntervalSinceLatestBoot
     * 
     * Return a position representing time since the last boot in the
     * series of entries.
     * 
     * Negative seconds would create an ambiguous or imprecise position;
     * this function asserts that the interval is positive.
     * 
     * API-Since: 15.0
     * 
     * @param seconds
     *                The seconds to add to the boot time point in the log time range.
     */
    @NotNull
    @Generated
    @Selector("positionWithTimeIntervalSinceLatestBoot:")
    public native OSLogPosition positionWithTimeIntervalSinceLatestBoot(double seconds);

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
     * storeWithScope
     * 
     * Create an OSLogStore for a subset of entries in the local store.
     * 
     * @param scope
     *              The kind of subset the OSLogStore is for.
     * 
     * @param error
     *              If initialization is unsuccessful, return nil and set this parameter to a
     *              pointer to an error object that describes the reason.
     * 
     *              API-Since: 15.0
     */
    @Generated
    @Selector("storeWithScope:error:")
    public static native OSLogStore storeWithScopeError(@NInt long scope,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * storeWithURL
     * 
     * Create an OSLogStore based on a logarchive.
     * 
     * @param url
     *              The path identifying a logarchive to be read.
     * 
     * @param error
     *              If initialization is unsuccessful --- for example, the path is not
     *              to a valid logarchive or the logarchive is not compatible because
     *              it is from a newer version --- return nil and set this parameter
     *              to a pointer to an error object that describes the reason.
     * 
     *              API-Since: 15.0
     */
    @Generated
    @Selector("storeWithURL:error:")
    public static native OSLogStore storeWithURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
