package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASAuthorizationPublicKeyCredentialRegistrationRequest;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest extends ASAuthorizationRequest
        implements ASAuthorizationPublicKeyCredentialRegistrationRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attestationPreference")
    public native String attestationPreference();

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
    @Selector("challenge")
    public native NSData challenge();

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

    /**
     * A list of parameters for the new credential which are supported by the Relying Party. The authenticator should choose from these parameters when creating the credential.
     */
    @Generated
    @Selector("credentialParameters")
    public native NSArray<? extends ASAuthorizationPublicKeyCredentialParameters> credentialParameters();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * A list of descriptors indicating credentials which must not already exist on the authenticator. If a credential already exists on the authenticator which matches one or more of these descriptors, a new credential will not be created and authentication will fail.
     */
    @Generated
    @Selector("excludedCredentials")
    public native NSArray<? extends ASAuthorizationSecurityKeyPublicKeyCredentialDescriptor> excludedCredentials();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest initWithCoder(NSCoder coder);

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
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest new_objc();

    @Generated
    @Selector("relyingPartyIdentifier")
    public native String relyingPartyIdentifier();

    /**
     * A preference whether the authenticator should store the private key of the newly created credential.
     */
    @Generated
    @Selector("residentKeyPreference")
    public native String residentKeyPreference();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAttestationPreference:")
    public native void setAttestationPreference(String value);

    @Generated
    @Selector("setChallenge:")
    public native void setChallenge(NSData value);

    /**
     * A list of parameters for the new credential which are supported by the Relying Party. The authenticator should choose from these parameters when creating the credential.
     */
    @Generated
    @Selector("setCredentialParameters:")
    public native void setCredentialParameters(NSArray<? extends ASAuthorizationPublicKeyCredentialParameters> value);

    @Generated
    @Selector("setDisplayName:")
    public native void setDisplayName(String value);

    /**
     * A list of descriptors indicating credentials which must not already exist on the authenticator. If a credential already exists on the authenticator which matches one or more of these descriptors, a new credential will not be created and authentication will fail.
     */
    @Generated
    @Selector("setExcludedCredentials:")
    public native void setExcludedCredentials(
            NSArray<? extends ASAuthorizationSecurityKeyPublicKeyCredentialDescriptor> value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * A preference whether the authenticator should store the private key of the newly created credential.
     */
    @Generated
    @Selector("setResidentKeyPreference:")
    public native void setResidentKeyPreference(String value);

    @Generated
    @Selector("setUserID:")
    public native void setUserID(NSData value);

    @Generated
    @Selector("setUserVerificationPreference:")
    public native void setUserVerificationPreference(String value);

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
    @Selector("userID")
    public native NSData userID();

    @Generated
    @Selector("userVerificationPreference")
    public native String userVerificationPreference();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
