package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CKOperationConfiguration
 * <p>
 * An operation configuration is a set of properties that describes how your operation should behave.  All properties have a default value.  When determining what properties to apply to an operation, we consult the operation's configuration property, as well as the operation->group->defaultConfiguration property.  We combine them following these rules:
 * [@code]
 * Group Default Configuration Value | Operation Configuration Value |        Value Applied To Operation
 * -----------------------------------+-------------------------------+-----------------------------------------
 * default value           |         default value         |                  default value
 * default value           |         explicit value        |       operation.configuration explicit value
 * explicit value          |         default value         | operation.group.defaultConfiguration explicit value
 * explicit value          |         explicit value        |       operation.configuration explicit value
 * [@endcode]
 * For example:
 * CKOperationGroup -> defaultConfiguration -> allowsCellularAccess explicitly set to NO
 * + CKOperation -> configuration -> allowsCellularAccess has default value of YES
 * = disallow cellular access
 * <p>
 * CKOperationGroup -> defaultConfiguration -> allowsCellularAccess explicitly set to NO
 * + CKOperation -> configuration -> allowsCellularAccess explicitly set to YES
 * = allow cellular access
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKOperationConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKOperationConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKOperationConfiguration alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CKOperationConfiguration allocWithZone(VoidPtr zone);

    /**
     * Defaults to @c YES
     */
    @Generated
    @Selector("allowsCellularAccess")
    public native boolean allowsCellularAccess();

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
     * If no container is set, [CKContainer defaultContainer] is used
     */
    @Generated
    @Selector("container")
    public native CKContainer container();

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
    public native CKOperationConfiguration init();

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

    /**
     * Long lived operations will continue running even if your process exits. If your process remains alive for the lifetime of the long lived operation its behavior is the same as a regular operation.
     * <p>
     * Long lived operations can be fetched and replayed from the container via the @c fetchAllLongLivedOperations: and @c fetchLongLivedOperationsWithIDs: APIs.
     * <p>
     * Long lived operations persist until their -[NSOperation completionBlock] returns or until the operation is cancelled.
     * Long lived operations may be garbage collected 24 hours after they finish running if no client has replayed them.
     * <p>
     * The default value for longLived is NO. Changing the value of longLived on an already started operation or on an outstanding long lived operation fetched from CKContainer has no effect.
     */
    @Generated
    @Selector("isLongLived")
    public native boolean isLongLived();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CKOperationConfiguration new_objc();

    /**
     * CKOperations behave differently depending on how you set qualityOfService.
     * <p>
     * [@code]
     * Quality of Service | timeoutIntervalForResource | Network Error Behavior | Discretionary Behavior
     * -------------------+----------------------------+------------------------+-----------------------
     * UserInteractive    | -1 (no enforcement)        | fail                   | nonDiscretionary
     * UserInitiated      | -1 (no enforcement)        | fail                   | nonDiscretionary
     * Default            | 1 week                     | fail                   | discretionary when app backgrounded
     * Utility            | 1 week                     | internally retried     | discretionary when app backgrounded
     * Background         | 1 week                     | internally retried     | discretionary
     * [@endcode]
     * timeoutIntervalForResource
     * - the timeout interval for any network resources retrieved by this operation
     * - this can be overridden via CKOperationConfiguration's timeoutIntervalForResource property
     * <p>
     * Network Error Behavior
     * - when a network request in service of a CKOperation fails due to a networking error, the operation may fail with that error, or internally retry the network request.  Only a subset of networking errors are retried, and limiting factors such as timeoutIntervalForResource are still applicable.
     * <p>
     * Discretionary Behavior
     * - network requests in service of a CKOperation may be marked as discretionary
     * - discretionary network requests are scheduled at the description of the system for optimal performance
     * <p>
     * CKOperations have a default qualityOfService of Default.
     */
    @Generated
    @Selector("qualityOfService")
    @NInt
    public native long qualityOfService();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Defaults to @c YES
     */
    @Generated
    @Selector("setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean value);

    /**
     * If no container is set, [CKContainer defaultContainer] is used
     */
    @Generated
    @Selector("setContainer:")
    public native void setContainer(CKContainer value);

    /**
     * Long lived operations will continue running even if your process exits. If your process remains alive for the lifetime of the long lived operation its behavior is the same as a regular operation.
     * <p>
     * Long lived operations can be fetched and replayed from the container via the @c fetchAllLongLivedOperations: and @c fetchLongLivedOperationsWithIDs: APIs.
     * <p>
     * Long lived operations persist until their -[NSOperation completionBlock] returns or until the operation is cancelled.
     * Long lived operations may be garbage collected 24 hours after they finish running if no client has replayed them.
     * <p>
     * The default value for longLived is NO. Changing the value of longLived on an already started operation or on an outstanding long lived operation fetched from CKContainer has no effect.
     */
    @Generated
    @Selector("setLongLived:")
    public native void setLongLived(boolean value);

    /**
     * CKOperations behave differently depending on how you set qualityOfService.
     * <p>
     * [@code]
     * Quality of Service | timeoutIntervalForResource | Network Error Behavior | Discretionary Behavior
     * -------------------+----------------------------+------------------------+-----------------------
     * UserInteractive    | -1 (no enforcement)        | fail                   | nonDiscretionary
     * UserInitiated      | -1 (no enforcement)        | fail                   | nonDiscretionary
     * Default            | 1 week                     | fail                   | discretionary when app backgrounded
     * Utility            | 1 week                     | internally retried     | discretionary when app backgrounded
     * Background         | 1 week                     | internally retried     | discretionary
     * [@endcode]
     * timeoutIntervalForResource
     * - the timeout interval for any network resources retrieved by this operation
     * - this can be overridden via CKOperationConfiguration's timeoutIntervalForResource property
     * <p>
     * Network Error Behavior
     * - when a network request in service of a CKOperation fails due to a networking error, the operation may fail with that error, or internally retry the network request.  Only a subset of networking errors are retried, and limiting factors such as timeoutIntervalForResource are still applicable.
     * <p>
     * Discretionary Behavior
     * - network requests in service of a CKOperation may be marked as discretionary
     * - discretionary network requests are scheduled at the description of the system for optimal performance
     * <p>
     * CKOperations have a default qualityOfService of Default.
     */
    @Generated
    @Selector("setQualityOfService:")
    public native void setQualityOfService(@NInt long value);

    /**
     * If non-zero, overrides the timeout interval for any network requests issued by this operation.
     * The default value is 60.
     *
     * @see NSURLSessionConfiguration.timeoutIntervalForRequest
     */
    @Generated
    @Selector("setTimeoutIntervalForRequest:")
    public native void setTimeoutIntervalForRequest(double value);

    /**
     * If set, overrides the timeout interval for any network resources retrieved by this operation.
     * If not explicitly set, defaults to a value based on the operation's @c qualityOfService
     *
     * @see NSURLSessionConfiguration.timeoutIntervalForResource
     */
    @Generated
    @Selector("setTimeoutIntervalForResource:")
    public native void setTimeoutIntervalForResource(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * If non-zero, overrides the timeout interval for any network requests issued by this operation.
     * The default value is 60.
     *
     * @see NSURLSessionConfiguration.timeoutIntervalForRequest
     */
    @Generated
    @Selector("timeoutIntervalForRequest")
    public native double timeoutIntervalForRequest();

    /**
     * If set, overrides the timeout interval for any network resources retrieved by this operation.
     * If not explicitly set, defaults to a value based on the operation's @c qualityOfService
     *
     * @see NSURLSessionConfiguration.timeoutIntervalForResource
     */
    @Generated
    @Selector("timeoutIntervalForResource")
    public native double timeoutIntervalForResource();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
