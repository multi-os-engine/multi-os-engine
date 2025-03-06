package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.matter.protocol.MTRDeviceControllerStorageDelegate;
import apple.matter.protocol.MTRKeypair;
import apple.opaque.dispatch_queue_t;
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
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceControllerExternalCertificateParameters extends MTRDeviceControllerParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceControllerExternalCertificateParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceControllerExternalCertificateParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceControllerExternalCertificateParameters allocWithZone(VoidPtr zone);

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
    public native MTRDeviceControllerExternalCertificateParameters init();

    /**
     * Prepare to initialize a controller that is not able to sign operational
     * certificates itself, and therefore needs to be provided with a complete
     * operational certificate chain.
     * 
     * A controller created from MTRDeviceControllerStartupParams initialized with
     * this method will not be able to commission devices unless
     * operationalCertificateIssuer and operationalCertificateIssuerQueue are set.
     * 
     * The fabric id and node id to use for the controller will be derived from the provided
     * operationalCertificate.
     * 
     * @param storageDelegate         The storage to use for the controller. This will be
     *                                called into on storageDelegateQueue.
     * 
     * @param storageDelegateQueue    The queue for calls into storageDelegate. See
     *                                MTRDeviceControllerStorageDelegate documentation
     *                                for the rules about what work is allowed to be
     *                                done on this queue.
     * 
     * @param uniqueIdentifier        The unique id to assign to the controller.
     * 
     * @param vendorID                The vendor ID (allocated by the Connectivity Standards Alliance) for
     *                                this controller. Must not be the "standard" vendor id (0).
     * 
     * @param ipk                     The Identity Protection Key. Must be 16 bytes in length.
     * 
     * @param intermediateCertificate Must be nil if operationalCertificate is
     *                                directly signed by rootCertificate. Otherwise
     *                                must be the certificate that signed
     *                                operationalCertificate.
     * 
     *                                API-Since: 17.6
     */
    @Generated
    @Selector("initWithStorageDelegate:storageDelegateQueue:uniqueIdentifier:ipk:vendorID:operationalKeypair:operationalCertificate:intermediateCertificate:rootCertificate:")
    public native MTRDeviceControllerExternalCertificateParameters initWithStorageDelegateStorageDelegateQueueUniqueIdentifierIpkVendorIDOperationalKeypairOperationalCertificateIntermediateCertificateRootCertificate(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRDeviceControllerStorageDelegate storageDelegate,
            @NotNull dispatch_queue_t storageDelegateQueue, @NotNull NSUUID uniqueIdentifier, @NotNull NSData ipk,
            @NotNull NSNumber vendorID, @Mapped(ObjCObjectMapper.class) @NotNull MTRKeypair operationalKeypair,
            @NotNull NSData operationalCertificate, @Nullable NSData intermediateCertificate,
            @NotNull NSData rootCertificate);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRDeviceControllerExternalCertificateParameters new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The root certificate we were initialized with.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("rootCertificate")
    @NotNull
    public native NSData rootCertificate();

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