package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CKOperationGroup
 * 
 * A mechanism for your app to group several operations at the granularity of a user action.
 * 
 * For example, when building a Calendar application, these things might warrant being their own operation groups:
 * - an initial fetch of data from the server, consisting of many queries, fetchChanges, and fetch operations
 * - doing an incremental fetch of data in response to a push notification
 * - saving several records due to a user saving a calendar event
 * 
 * You associate @c CKOperationGroup s with@c  CKOperation s by setting the @c CKOperation.group property.  Create a new @c CKOperationGroup instance for each distinct user action.
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKOperationGroup extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CKOperationGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKOperationGroup alloc();

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

    /**
     * This is the default configuration applied to operations in this operation group.
     * 
     * If an operation associated with this operation group has its own configuration, then any explicitly-set properties in that operation's configuration will override these default configuration values.  See the example in CKOperation.h
     */
    @Generated
    @Selector("defaultConfiguration")
    public native CKOperationConfiguration defaultConfiguration();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Estimated size of traffic being downloaded from the CloudKit Server
     * 
     * Inform the system how much data you plan on transferring.  Obviously, these won't be exact.  Be as accurate as possible, but even an order-of-magnitude estimate is better than no value.  The system will consult these values when scheduling discretionary network requests (see the description of @c CKOperationConfiguration.qualityOfService).
     * Overestimating your workload means that an operation group issuing discretionary network requests may be delayed until network conditions are good.
     * Underestimating your workload may cause the system to oversaturate a constrained connection, leading to network failures.
     * You may update after the @c CKOperationGroup is created.  If it is increased, then subsequent @c CKOperation s associated with this operation group may be delayed until network conditions are good.
     * Defaults to @c CKOperationGroupTransferSizeUnknown
     */
    @Generated
    @Selector("expectedReceiveSize")
    @NInt
    public native long expectedReceiveSize();

    /**
     * Estimated size of traffic being uploaded to the CloudKit Server
     * 
     * Inform the system how much data you plan on transferring.  Obviously, these won't be exact.  Be as accurate as possible, but even an order-of-magnitude estimate is better than no value.  The system will consult these values when scheduling discretionary network requests (see the description of @c CKOperationConfiguration.qualityOfService).
     * Overestimating your workload means that an operation group issuing discretionary network requests may be delayed until network conditions are good.
     * Underestimating your workload may cause the system to oversaturate a constrained connection, leading to network failures.
     * You may update after the @c CKOperationGroup is created.  If it is increased, then subsequent @c CKOperation s associated with this operation group may be delayed until network conditions are good.
     * Defaults to @c CKOperationGroupTransferSizeUnknown
     */
    @Generated
    @Selector("expectedSendSize")
    @NInt
    public native long expectedSendSize();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CKOperationGroup init();

    @Generated
    @Selector("initWithCoder:")
    public native CKOperationGroup initWithCoder(NSCoder aDecoder);

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
     * Describes the user action attributed to the operation group.
     * 
     * [@c] name should describe the type of work being done.  Some examples:
     * "Initial Fetch"
     * "Incremental Fetch"
     * "Saving User-Entered Record"
     * This string will be sent to Apple servers to provide aggregate reporting for @c CKOperationGroup s and therefore must not include personally identifying data.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * This is an identifier unique to this @c CKOperationGroup
     * 
     * This value is chosen by the system, and will be unique to this instance of a @c CKOperationGroup.  This identifier will be sent to Apple's servers, and can be used to identify any server-side logging associated with this operation group.
     */
    @Generated
    @Selector("operationGroupID")
    public native String operationGroupID();

    /**
     * Describes an application-specific "number of elements" associated with the operation group.
     * 
     * [@c] quantity is intended to show the app-specific count of items contained within the operation group.  It is your job to assign meaning to this value.  For example, if an app created an operation group to save 3 calendar events the user had created, the app might want to set this to "3".  This value is not shown to your users, it's meant to aid your development and debugging.  This value will be reported in the CloudKit Dashboard's log entries for all operations associated with this operation group.
     */
    @Generated
    @Selector("quantity")
    @NUInt
    public native long quantity();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This is the default configuration applied to operations in this operation group.
     * 
     * If an operation associated with this operation group has its own configuration, then any explicitly-set properties in that operation's configuration will override these default configuration values.  See the example in CKOperation.h
     */
    @Generated
    @Selector("setDefaultConfiguration:")
    public native void setDefaultConfiguration(CKOperationConfiguration value);

    /**
     * Estimated size of traffic being downloaded from the CloudKit Server
     * 
     * Inform the system how much data you plan on transferring.  Obviously, these won't be exact.  Be as accurate as possible, but even an order-of-magnitude estimate is better than no value.  The system will consult these values when scheduling discretionary network requests (see the description of @c CKOperationConfiguration.qualityOfService).
     * Overestimating your workload means that an operation group issuing discretionary network requests may be delayed until network conditions are good.
     * Underestimating your workload may cause the system to oversaturate a constrained connection, leading to network failures.
     * You may update after the @c CKOperationGroup is created.  If it is increased, then subsequent @c CKOperation s associated with this operation group may be delayed until network conditions are good.
     * Defaults to @c CKOperationGroupTransferSizeUnknown
     */
    @Generated
    @Selector("setExpectedReceiveSize:")
    public native void setExpectedReceiveSize(@NInt long value);

    /**
     * Estimated size of traffic being uploaded to the CloudKit Server
     * 
     * Inform the system how much data you plan on transferring.  Obviously, these won't be exact.  Be as accurate as possible, but even an order-of-magnitude estimate is better than no value.  The system will consult these values when scheduling discretionary network requests (see the description of @c CKOperationConfiguration.qualityOfService).
     * Overestimating your workload means that an operation group issuing discretionary network requests may be delayed until network conditions are good.
     * Underestimating your workload may cause the system to oversaturate a constrained connection, leading to network failures.
     * You may update after the @c CKOperationGroup is created.  If it is increased, then subsequent @c CKOperation s associated with this operation group may be delayed until network conditions are good.
     * Defaults to @c CKOperationGroupTransferSizeUnknown
     */
    @Generated
    @Selector("setExpectedSendSize:")
    public native void setExpectedSendSize(@NInt long value);

    /**
     * Describes the user action attributed to the operation group.
     * 
     * [@c] name should describe the type of work being done.  Some examples:
     * "Initial Fetch"
     * "Incremental Fetch"
     * "Saving User-Entered Record"
     * This string will be sent to Apple servers to provide aggregate reporting for @c CKOperationGroup s and therefore must not include personally identifying data.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * Describes an application-specific "number of elements" associated with the operation group.
     * 
     * [@c] quantity is intended to show the app-specific count of items contained within the operation group.  It is your job to assign meaning to this value.  For example, if an app created an operation group to save 3 calendar events the user had created, the app might want to set this to "3".  This value is not shown to your users, it's meant to aid your development and debugging.  This value will be reported in the CloudKit Dashboard's log entries for all operations associated with this operation group.
     */
    @Generated
    @Selector("setQuantity:")
    public native void setQuantity(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}