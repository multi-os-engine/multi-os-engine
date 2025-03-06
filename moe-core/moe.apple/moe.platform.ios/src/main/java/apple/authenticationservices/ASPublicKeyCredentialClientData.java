package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
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
 * This object represents the client data for a public key credential request, as defined in the WebAuthentication
 * standard.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASPublicKeyCredentialClientData extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASPublicKeyCredentialClientData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASPublicKeyCredentialClientData alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASPublicKeyCredentialClientData allocWithZone(VoidPtr zone);

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

    /**
     * The challenge to be signed during the operation.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("challenge")
    @NotNull
    public native NSData challenge();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Indicates whether this is a cross-origin request, if applicable.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("crossOrigin")
    @NInt
    public native long crossOrigin();

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
    public native ASPublicKeyCredentialClientData init();

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("initWithChallenge:origin:")
    public native ASPublicKeyCredentialClientData initWithChallengeOrigin(@NotNull NSData challenge,
            @NotNull String origin);

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
    public static native ASPublicKeyCredentialClientData new_objc();

    /**
     * The origin for where the request was performed.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("origin")
    @NotNull
    public native String origin();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The challenge to be signed during the operation.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setChallenge:")
    public native void setChallenge(@NotNull NSData value);

    /**
     * Indicates whether this is a cross-origin request, if applicable.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setCrossOrigin:")
    public native void setCrossOrigin(@NInt long value);

    /**
     * The origin for where the request was performed.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setOrigin:")
    public native void setOrigin(@NotNull String value);

    /**
     * The top-level origin, if applicable.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setTopOrigin:")
    public native void setTopOrigin(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The top-level origin, if applicable.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("topOrigin")
    @Nullable
    public native String topOrigin();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}