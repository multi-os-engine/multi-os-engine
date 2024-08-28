package apple.authenticationservices.protocol;

import apple.authenticationservices.ASCredentialServiceIdentifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] ASCredentialIdentity
 * An ASCredentialIdentity is used to describe an identity that can use a service upon successful authentication.
 * Use this class to save entries into ASCredentialIdentityStore.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASCredentialIdentity")
public interface ASCredentialIdentity {
    /**
     * Get or set the rank of the credential identity object.
     * 
     * The system may utilize the rank to decide which credential identity precedes the other
     * if two identities have the same service identifier. A credential identity with a larger rank value
     * precedes one with a smaller value if both credential identities have the same service identifier.
     * The default value of this property is 0.
     */
    @Generated
    @Selector("rank")
    @NInt
    long rank();

    /**
     * Get the record identifier.
     * 
     * You can utilize the record identifier to uniquely identify the credential identity in your local database.
     */
    @Generated
    @Selector("recordIdentifier")
    @Nullable
    String recordIdentifier();

    /**
     * Get the service identifier.
     */
    @Generated
    @Selector("serviceIdentifier")
    @NotNull
    ASCredentialServiceIdentifier serviceIdentifier();

    /**
     * Get or set the rank of the credential identity object.
     * 
     * The system may utilize the rank to decide which credential identity precedes the other
     * if two identities have the same service identifier. A credential identity with a larger rank value
     * precedes one with a smaller value if both credential identities have the same service identifier.
     * The default value of this property is 0.
     */
    @Generated
    @Selector("setRank:")
    void setRank(@NInt long value);

    /**
     * Get the user.
     */
    @Generated
    @Selector("user")
    @NotNull
    String user();
}