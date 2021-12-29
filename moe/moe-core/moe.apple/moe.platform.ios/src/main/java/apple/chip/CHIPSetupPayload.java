package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPSetupPayload extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPSetupPayload(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPSetupPayload alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPSetupPayload allocWithZone(VoidPtr zone);

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
    @Selector("commissioningFlow")
    @NUInt
    public native long commissioningFlow();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("discriminator")
    public native NSNumber discriminator();

    @Generated
    @Selector("getAllOptionalVendorData:")
    public native NSArray<? extends CHIPOptionalQRCodeInfo> getAllOptionalVendorData(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPSetupPayload init();

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
    public static native CHIPSetupPayload new_objc();

    @Generated
    @Selector("productID")
    public native NSNumber productID();

    @Generated
    @Selector("rendezvousInformation")
    @NUInt
    public native long rendezvousInformation();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("serialNumber")
    public native String serialNumber();

    @Generated
    @Selector("setCommissioningFlow:")
    public native void setCommissioningFlow(@NUInt long value);

    @Generated
    @Selector("setDiscriminator:")
    public native void setDiscriminator(NSNumber value);

    @Generated
    @Selector("setProductID:")
    public native void setProductID(NSNumber value);

    @Generated
    @Selector("setRendezvousInformation:")
    public native void setRendezvousInformation(@NUInt long value);

    @Generated
    @Selector("setSerialNumber:")
    public native void setSerialNumber(String value);

    @Generated
    @Selector("setSetUpPINCode:")
    public native void setSetUpPINCode(NSNumber value);

    @Generated
    @Selector("setUpPINCode")
    public native NSNumber setUpPINCode();

    @Generated
    @Selector("setVendorID:")
    public native void setVendorID(NSNumber value);

    @Generated
    @Selector("setVersion:")
    public native void setVersion(NSNumber value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("vendorID")
    public native NSNumber vendorID();

    @Generated
    @Selector("version")
    public native NSNumber version();
}
