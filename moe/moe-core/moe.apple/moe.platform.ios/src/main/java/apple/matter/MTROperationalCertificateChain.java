package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * A representation of the operational certificate chain for a node.
 * 
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTROperationalCertificateChain extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTROperationalCertificateChain(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * adminSubject is passed to the device as part of the AddNOC command. A nil
     * adminSubject means the node id of the relevant MTRDeviceController will be
     * used.
     */
    @Generated
    @Selector("adminSubject")
    @Nullable
    public native NSNumber adminSubject();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTROperationalCertificateChain alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTROperationalCertificateChain allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native MTROperationalCertificateChain init();

    @Generated
    @Selector("initWithOperationalCertificate:intermediateCertificate:rootCertificate:adminSubject:")
    public native MTROperationalCertificateChain initWithOperationalCertificateIntermediateCertificateRootCertificateAdminSubject(
            @NotNull NSData operationalCertificate, @Nullable NSData intermediateCertificate,
            @NotNull NSData rootCertificate, @Nullable NSNumber adminSubject);

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
     * A nil intermediateCertificate means there is no intermediate.
     */
    @Generated
    @Selector("intermediateCertificate")
    @Nullable
    public native NSData intermediateCertificate();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTROperationalCertificateChain new_objc();

    @Generated
    @Selector("operationalCertificate")
    @NotNull
    public native NSData operationalCertificate();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("rootCertificate")
    @NotNull
    public native NSData rootCertificate();

    /**
     * adminSubject is passed to the device as part of the AddNOC command. A nil
     * adminSubject means the node id of the relevant MTRDeviceController will be
     * used.
     */
    @Generated
    @Selector("setAdminSubject:")
    public native void setAdminSubject(@Nullable NSNumber value);

    /**
     * A nil intermediateCertificate means there is no intermediate.
     */
    @Generated
    @Selector("setIntermediateCertificate:")
    public native void setIntermediateCertificate(@Nullable NSData value);

    @Generated
    @Selector("setOperationalCertificate:")
    public native void setOperationalCertificate(@NotNull NSData value);

    @Generated
    @Selector("setRootCertificate:")
    public native void setRootCertificate(@NotNull NSData value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}