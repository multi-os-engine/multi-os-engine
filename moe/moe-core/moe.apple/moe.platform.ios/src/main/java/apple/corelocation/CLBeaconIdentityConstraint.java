package apple.corelocation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.foundation.protocol.NSCopying;
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
 * CLBeaconIdentityConstraint
 * 
 * Discussion:
 * A constraint that describes the identity caracteristics of a beacon.
 * 
 * A beacon identity is defined by UUID, major and minor values.
 * UUID must be specified. If only UUID is specified, the major and
 * minor values will be wildcarded and any beacons with the same
 * UUID will satisfy the constraint. Similarly if only UUID and
 * major value are specified, the minor value will be wildcarded
 * and any beacons with the same UUID and major value will satisfy
 * the constraint.
 * 
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLBeaconIdentityConstraint extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CLBeaconIdentityConstraint(Pointer peer) {
        super(peer);
    }

    /**
     * UUID
     * 
     * Discussion:
     * UUID associated with the beacon.
     */
    @Generated
    @Selector("UUID")
    public native NSUUID UUID();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLBeaconIdentityConstraint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CLBeaconIdentityConstraint allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CLBeaconIdentityConstraint init();

    @Generated
    @Selector("initWithCoder:")
    public native CLBeaconIdentityConstraint initWithCoder(NSCoder coder);

    /**
     * initWithUUID:
     * 
     * Discussion:
     * Initialize a beacon identity constraint with a UUID. Major and
     * minor values will be wildcarded.
     */
    @Generated
    @Selector("initWithUUID:")
    public native CLBeaconIdentityConstraint initWithUUID(NSUUID uuid);

    /**
     * initWithUUID:major:
     * 
     * Discussion:
     * Initialize a beacon identity constraint with a UUID and major
     * value. Minor value will be wildcarded.
     */
    @Generated
    @Selector("initWithUUID:major:")
    public native CLBeaconIdentityConstraint initWithUUIDMajor(NSUUID uuid, char major);

    /**
     * initWithUUID:major:minor:
     * 
     * Discussion:
     * Initialize a beacon identity constraint with a UUID, major, and
     * minor values.
     */
    @Generated
    @Selector("initWithUUID:major:minor:")
    public native CLBeaconIdentityConstraint initWithUUIDMajorMinor(NSUUID uuid, char major, char minor);

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
     * major
     * 
     * Discussion:
     * Most significant value associated with the beacon.
     */
    @Generated
    @Selector("major")
    public native NSNumber major();

    /**
     * minor
     * 
     * Discussion:
     * Least significant value associated with the beacon.
     */
    @Generated
    @Selector("minor")
    public native NSNumber minor();

    @Generated
    @Owned
    @Selector("new")
    public static native CLBeaconIdentityConstraint new_objc();

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
