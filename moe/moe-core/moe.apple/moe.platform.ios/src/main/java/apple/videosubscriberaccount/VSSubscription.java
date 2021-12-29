package apple.videosubscriberaccount;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
 * A VSSubscription instance describes the extent to which a subscriber has
 * access to content.
 */
@Generated
@Library("VideoSubscriberAccount")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VSSubscription extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VSSubscription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Describes the level of access the subscriber has to your catalog of content.
     * <p>
     * It is an error to provide a subscription with an unknown access level as
     * the current subscription.  Instead, choose the access level that describes
     * the content that the subscriber can play.
     */
    @Generated
    @Selector("accessLevel")
    @NInt
    public native long accessLevel();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VSSubscription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VSSubscription allocWithZone(VoidPtr zone);

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
     * After this point in time, the subscription will be considered inactive.
     * <p>
     * If the current subscription becomes inactive, the system will behave as
     * though the user is not subscribed at all, i.e. as though the registration
     * center's current subscription had been set to nil.
     * <p>
     * Defaults to distantFuture.
     * <p>
     * Providing a value is useful in a limited number of scenarios, e.g. when the
     * a subscriber decides not to renew their subscription, you should provide an
     * expiration date that corresponds to the point in time when the final billing
     * cycle will end.
     * <p>
     * This might also be useful if the subscription only grants access to content
     * that is time-limited, e.g. a single season of games for a sports league.
     */
    @Generated
    @Selector("expirationDate")
    public native NSDate expirationDate();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VSSubscription init();

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
    public static native VSSubscription new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Describes the level of access the subscriber has to your catalog of content.
     * <p>
     * It is an error to provide a subscription with an unknown access level as
     * the current subscription.  Instead, choose the access level that describes
     * the content that the subscriber can play.
     */
    @Generated
    @Selector("setAccessLevel:")
    public native void setAccessLevel(@NInt long value);

    /**
     * After this point in time, the subscription will be considered inactive.
     * <p>
     * If the current subscription becomes inactive, the system will behave as
     * though the user is not subscribed at all, i.e. as though the registration
     * center's current subscription had been set to nil.
     * <p>
     * Defaults to distantFuture.
     * <p>
     * Providing a value is useful in a limited number of scenarios, e.g. when the
     * a subscriber decides not to renew their subscription, you should provide an
     * expiration date that corresponds to the point in time when the final billing
     * cycle will end.
     * <p>
     * This might also be useful if the subscription only grants access to content
     * that is time-limited, e.g. a single season of games for a sports league.
     */
    @Generated
    @Selector("setExpirationDate:")
    public native void setExpirationDate(NSDate value);

    /**
     * Identifies a subset of content from your catalog that subscriber can play.
     * <p>
     * Only provide values that are used in your availability feed's tier restrictions.
     */
    @Generated
    @Selector("setTierIdentifiers:")
    public native void setTierIdentifiers(NSArray<String> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Identifies a subset of content from your catalog that subscriber can play.
     * <p>
     * Only provide values that are used in your availability feed's tier restrictions.
     */
    @Generated
    @Selector("tierIdentifiers")
    public native NSArray<String> tierIdentifiers();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Identifies the billing group associated with the subscription.  May be used,
     * for example, to restrict content availability based on the proximity of the
     * billing address to a specific venue.
     */
    @Generated
    @Selector("billingIdentifier")
    public native String billingIdentifier();

    /**
     * Identifies the billing group associated with the subscription.  May be used,
     * for example, to restrict content availability based on the proximity of the
     * billing address to a specific venue.
     */
    @Generated
    @Selector("setBillingIdentifier:")
    public native void setBillingIdentifier(String value);
}
