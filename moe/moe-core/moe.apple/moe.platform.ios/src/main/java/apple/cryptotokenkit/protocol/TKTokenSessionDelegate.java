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

@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TKTokenSessionDelegate")
public interface TKTokenSessionDelegate {
    @Generated
    @IsOptional
    @Selector("tokenSession:beginAuthForOperation:constraint:error:")
    default TKTokenAuthOperation tokenSessionBeginAuthForOperationConstraintError(TKTokenSession session,
            @NInt long operation, @Mapped(ObjCObjectMapper.class) Object constraint,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tokenSession:decryptData:usingKey:algorithm:error:")
    default NSData tokenSessionDecryptDataUsingKeyAlgorithmError(TKTokenSession session, NSData ciphertext,
            @Mapped(ObjCObjectMapper.class) Object keyObjectID, TKTokenKeyAlgorithm algorithm,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tokenSession:performKeyExchangeWithPublicKey:usingKey:algorithm:parameters:error:")
    default NSData tokenSessionPerformKeyExchangeWithPublicKeyUsingKeyAlgorithmParametersError(TKTokenSession session,
            NSData otherPartyPublicKeyData, @Mapped(ObjCObjectMapper.class) Object objectID,
            TKTokenKeyAlgorithm algorithm, TKTokenKeyExchangeParameters parameters,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tokenSession:signData:usingKey:algorithm:error:")
    default NSData tokenSessionSignDataUsingKeyAlgorithmError(TKTokenSession session, NSData dataToSign,
            @Mapped(ObjCObjectMapper.class) Object keyObjectID, TKTokenKeyAlgorithm algorithm,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tokenSession:supportsOperation:usingKey:algorithm:")
    default boolean tokenSessionSupportsOperationUsingKeyAlgorithm(TKTokenSession session, @NInt long operation,
            @Mapped(ObjCObjectMapper.class) Object keyObjectID, TKTokenKeyAlgorithm algorithm) {
        throw new java.lang.UnsupportedOperationException();
    }
}