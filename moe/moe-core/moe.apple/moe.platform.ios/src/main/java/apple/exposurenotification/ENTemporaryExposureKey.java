package apple.exposurenotification;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * ===========================================================================================================================
 * 
 * Key used to generate rolling proximity identifiers.
 * 
 * API-Since: 12.5
 */
@Generated
@Library("ExposureNotification")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ENTemporaryExposureKey extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ENTemporaryExposureKey(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ENTemporaryExposureKey alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ENTemporaryExposureKey allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ENTemporaryExposureKey init();

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

    /**
     * Key material used to generate Rolling Proximity Identifiers.
     */
    @Generated
    @Selector("keyData")
    public native NSData keyData();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ENTemporaryExposureKey new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Duration this key is valid. It's the number of 10-minute windows between key rolling.
     */
    @Generated
    @Selector("rollingPeriod")
    public native int rollingPeriod();

    /**
     * Interval number when the key's EKRollingPeriod started.
     */
    @Generated
    @Selector("rollingStartNumber")
    public native int rollingStartNumber();

    /**
     * Key material used to generate Rolling Proximity Identifiers.
     */
    @Generated
    @Selector("setKeyData:")
    public native void setKeyData(NSData value);

    /**
     * Duration this key is valid. It's the number of 10-minute windows between key rolling.
     */
    @Generated
    @Selector("setRollingPeriod:")
    public native void setRollingPeriod(int value);

    /**
     * Interval number when the key's EKRollingPeriod started.
     */
    @Generated
    @Selector("setRollingStartNumber:")
    public native void setRollingStartNumber(int value);

    /**
     * Risk of transmission associated with the person this key came from.
     */
    @Generated
    @Selector("setTransmissionRiskLevel:")
    public native void setTransmissionRiskLevel(byte value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Risk of transmission associated with the person this key came from.
     */
    @Generated
    @Selector("transmissionRiskLevel")
    public native byte transmissionRiskLevel();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
