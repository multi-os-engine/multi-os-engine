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
 * API-Since: 16.5
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRFabricInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRFabricInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRFabricInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRFabricInfo allocWithZone(VoidPtr zone);

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

    /**
     * Fabric identifier (scoped to the root public key) for the fabric.
     */
    @Generated
    @Selector("fabricID")
    @NotNull
    public native NSNumber fabricID();

    /**
     * The fabric index which identifies the fabric on the node.
     */
    @Generated
    @Selector("fabricIndex")
    @NotNull
    public native NSNumber fabricIndex();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRFabricInfo init();

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
     * The intermediate certificate for the node. This might be nil if there is
     * no intermediate certificate, or if the node is not on a fabric we have
     * access to.
     */
    @Generated
    @Selector("intermediateCertificate")
    @Nullable
    public native NSData intermediateCertificate();

    /**
     * The same intermediate certificate as intermediateCertificate, in Matter TLV format.
     */
    @Generated
    @Selector("intermediateCertificateTLV")
    @Nullable
    public native NSData intermediateCertificateTLV();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The string label for the fabric. May be empty.
     */
    @Generated
    @Selector("label")
    @NotNull
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRFabricInfo new_objc();

    /**
     * Node identifier for the given node on the fabric.
     */
    @Generated
    @Selector("nodeID")
    @NotNull
    public native NSNumber nodeID();

    /**
     * The operational certificate for the node. This might be nil if
     * the node is not on a fabric we have access to.
     */
    @Generated
    @Selector("operationalCertificate")
    @Nullable
    public native NSData operationalCertificate();

    /**
     * The same operational certificate as operationalCertificate, in Matter TLV format.
     */
    @Generated
    @Selector("operationalCertificateTLV")
    @Nullable
    public native NSData operationalCertificateTLV();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The root certificate for the fabric. This might be nil if a root
     * certificate is not available (e.g. if this is information about some remote
     * node that we don't have root certificate information for).
     */
    @Generated
    @Selector("rootCertificate")
    @Nullable
    public native NSData rootCertificate();

    /**
     * The same root certificate as rootCertificate, in Matter TLV format.
     */
    @Generated
    @Selector("rootCertificateTLV")
    @Nullable
    public native NSData rootCertificateTLV();

    /**
     * Root public key for the fabric.
     */
    @Generated
    @Selector("rootPublicKey")
    @NotNull
    public native NSData rootPublicKey();

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

    /**
     * Vendor identifier for the fabric.
     */
    @Generated
    @Selector("vendorID")
    @NotNull
    public native NSNumber vendorID();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}