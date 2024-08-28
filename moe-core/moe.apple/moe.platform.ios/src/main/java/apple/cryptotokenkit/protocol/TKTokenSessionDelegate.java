package apple.cryptotokenkit.protocol;

import apple.cryptotokenkit.TKTokenAuthOperation;
import apple.cryptotokenkit.TKTokenKeyAlgorithm;
import apple.cryptotokenkit.TKTokenKeyExchangeParameters;
import apple.cryptotokenkit.TKTokenSession;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * TKTokenSessionDelegate contains operations with token objects provided by token implementors which should be
 * performed in the context of authentication session.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TKTokenSessionDelegate")
public interface TKTokenSessionDelegate {
    /**
     * Establishes a context for the requested authentication operation.
     * 
     * @param session    Related TKTokenSession instance.
     * @param operation  Identifier of the operation.
     * @param constraint Constraint to be satisfied by this authentication operation.
     * @param error      Error details (see TKError.h).
     * @return authOperation Resulting context of the operation, which will be eventually finalized by receiving
     *         'finishWithError:'. The resulting 'authOperation' can be of any type based on TKTokenAuthOperation. For
     *         known types (e.g. TKTokenPasswordAuthOperation) the system will first fill in the context-specific
     *         properties (e.g. 'password') before triggering 'finishWithError:'. When no authentication is actually
     *         needed (typically because the session is already authenticated for requested constraint), return instance
     *         of TKTokenAuthOperation class instead of any specific subclass.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tokenSession:beginAuthForOperation:constraint:error:")
    default TKTokenAuthOperation tokenSessionBeginAuthForOperationConstraintError(@NotNull TKTokenSession session,
            @NInt long operation, @NotNull @Mapped(ObjCObjectMapper.class) Object constraint,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Decrypts ciphertext using private key.
     * 
     * @param session     Related TKTokenSession instance.
     * @param ciphertext  Encrypted data to decrypt.
     * @param keyObjectID Identifier of the private key object.
     * @param algorithm   Requested encryption/decryption algorithm to be used.
     * @param error       Error details (see TKError.h). If authentication is required (by invoking
     *                    beginAuthForOperation:), @c TKErrorCodeAuthenticationNeeded should be used.
     * @return Resulting decrypted plaintext, or nil if an error happened.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tokenSession:decryptData:usingKey:algorithm:error:")
    default NSData tokenSessionDecryptDataUsingKeyAlgorithmError(@NotNull TKTokenSession session,
            @NotNull NSData ciphertext, @NotNull @Mapped(ObjCObjectMapper.class) Object keyObjectID,
            @NotNull TKTokenKeyAlgorithm algorithm, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Performs Diffie-Hellman style key exchange operation.
     * 
     * @param session                 Related TKTokenSession instance.
     * @param otherPartyPublicKeyData Raw public data of other party public key.
     * @param objectID                Identifier of the private key object.
     * @param algorithm               Requested key exchange algorithm to be used.
     * @param parameters              Additional parameters for key exchange operation. Chosen algorithm dictates
     *                                meaning of parameters.
     * @param error                   Error details (see TKError.h). If authentication is required (by invoking
     *                                beginAuthForOperation:), @c TKErrorCodeAuthenticationNeeded should be used.
     * @return Result of key exchange operation, or nil if the operation failed.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tokenSession:performKeyExchangeWithPublicKey:usingKey:algorithm:parameters:error:")
    default NSData tokenSessionPerformKeyExchangeWithPublicKeyUsingKeyAlgorithmParametersError(
            @NotNull TKTokenSession session, @NotNull NSData otherPartyPublicKeyData,
            @NotNull @Mapped(ObjCObjectMapper.class) Object objectID, @NotNull TKTokenKeyAlgorithm algorithm,
            @NotNull TKTokenKeyExchangeParameters parameters,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Performs cryptographic signature operation.
     * 
     * @param session     Related TKTokenSession instance.
     * @param dataToSign  Input data for the signature operation.
     * @param keyObjectID Identifier of the private key object.
     * @param algorithm   Requested signature algorithm to be used.
     * @param error       Error details (see TKError.h). If authentication is required (by invoking
     *                    beginAuthForOperation:), @c TKErrorCodeAuthenticationNeeded should be used.
     * @return Resulting signature, or nil if an error happened.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tokenSession:signData:usingKey:algorithm:error:")
    default NSData tokenSessionSignDataUsingKeyAlgorithmError(@NotNull TKTokenSession session,
            @NotNull NSData dataToSign, @NotNull @Mapped(ObjCObjectMapper.class) Object keyObjectID,
            @NotNull TKTokenKeyAlgorithm algorithm, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Checks whether specified operation and algorithm is supported on specified key.
     * 
     * @param session     Related TKTokenSession instance.
     * @param operation   Type of cryptographic operation for which the list of supported algorithms should be
     *                    retrieved.
     * @param keyObjectID Identifier of the private key object.
     * @param algorithm   Algorithm with which the oepration should be performed.
     * @return YES if the operation is supported, NO otherwise.
     */
    @Generated
    @IsOptional
    @Selector("tokenSession:supportsOperation:usingKey:algorithm:")
    default boolean tokenSessionSupportsOperationUsingKeyAlgorithm(@NotNull TKTokenSession session,
            @NInt long operation, @NotNull @Mapped(ObjCObjectMapper.class) Object keyObjectID,
            @NotNull TKTokenKeyAlgorithm algorithm) {
        throw new java.lang.UnsupportedOperationException();
    }
}
