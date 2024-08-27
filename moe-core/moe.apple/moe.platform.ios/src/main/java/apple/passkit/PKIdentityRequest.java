package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.passkit.protocol.PKIdentityDocumentDescriptor;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Request for information from an identity document stored as a Wallet pass.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKIdentityRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKIdentityRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKIdentityRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKIdentityRequest allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A descriptor describing the identity document to request.
     */
    @Nullable
    @Generated
    @Selector("descriptor")
    @MappedReturn(ObjCObjectMapper.class)
    public native PKIdentityDocumentDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKIdentityRequest init();

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
     * Identifies the merchant making the request, as previously agreed with Apple.
     * This must match one of the merchant identifiers in the application's entitlement.
     * This property must be set when requestDocument is invoked.
     */
    @Nullable
    @Generated
    @Selector("merchantIdentifier")
    public native String merchantIdentifier();

    @Generated
    @Owned
    @Selector("new")
    public static native PKIdentityRequest new_objc();

    /**
     * A caller-specified nonce that will be included in the signed response payload.
     * This is treated as opaque by the PKIdentityAuthorizationController, and has a
     * maximum allowed size of 64 bytes.
     */
    @Nullable
    @Generated
    @Selector("nonce")
    public native NSData nonce();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A descriptor describing the identity document to request.
     */
    @Generated
    @Selector("setDescriptor:")
    public native void setDescriptor(@Nullable @Mapped(ObjCObjectMapper.class) PKIdentityDocumentDescriptor value);

    /**
     * Identifies the merchant making the request, as previously agreed with Apple.
     * This must match one of the merchant identifiers in the application's entitlement.
     * This property must be set when requestDocument is invoked.
     */
    @Generated
    @Selector("setMerchantIdentifier:")
    public native void setMerchantIdentifier(@Nullable String value);

    /**
     * A caller-specified nonce that will be included in the signed response payload.
     * This is treated as opaque by the PKIdentityAuthorizationController, and has a
     * maximum allowed size of 64 bytes.
     */
    @Generated
    @Selector("setNonce:")
    public native void setNonce(@Nullable NSData value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}