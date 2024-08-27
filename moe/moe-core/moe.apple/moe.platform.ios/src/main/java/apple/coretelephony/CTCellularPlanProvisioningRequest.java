package apple.coretelephony;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 12.0
 */
@Generated
@Library("CoreTelephony")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CTCellularPlanProvisioningRequest extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CTCellularPlanProvisioningRequest(Pointer peer) {
        super(peer);
    }

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("EID")
    public native String EID();

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("ICCID")
    public native String ICCID();

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("OID")
    public native String OID();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("address")
    public native String address();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CTCellularPlanProvisioningRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CTCellularPlanProvisioningRequest allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("confirmationCode")
    public native String confirmationCode();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CTCellularPlanProvisioningRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native CTCellularPlanProvisioningRequest initWithCoder(@NotNull NSCoder coder);

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

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("matchingID")
    public native String matchingID();

    @Generated
    @Owned
    @Selector("new")
    public static native CTCellularPlanProvisioningRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setAddress:")
    public native void setAddress(@NotNull String value);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setConfirmationCode:")
    public native void setConfirmationCode(@Nullable String value);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setEID:")
    public native void setEID(@Nullable String value);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setICCID:")
    public native void setICCID(@Nullable String value);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setMatchingID:")
    public native void setMatchingID(@Nullable String value);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setOID:")
    public native void setOID(@Nullable String value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
