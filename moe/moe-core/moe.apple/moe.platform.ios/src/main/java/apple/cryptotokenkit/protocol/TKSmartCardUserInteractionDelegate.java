package apple.cryptotokenkit.protocol;

import apple.cryptotokenkit.TKSmartCardUserInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TKSmartCardUserInteractionDelegate")
public interface TKSmartCardUserInteractionDelegate {
    @Generated
    @IsOptional
    @Selector("characterEnteredInUserInteraction:")
    default void characterEnteredInUserInteraction(TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("correctionKeyPressedInUserInteraction:")
    default void correctionKeyPressedInUserInteraction(TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("invalidCharacterEnteredInUserInteraction:")
    default void invalidCharacterEnteredInUserInteraction(TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("newPINConfirmationRequestedInUserInteraction:")
    default void newPINConfirmationRequestedInUserInteraction(TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("newPINRequestedInUserInteraction:")
    default void newPINRequestedInUserInteraction(TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("oldPINRequestedInUserInteraction:")
    default void oldPINRequestedInUserInteraction(TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("validationKeyPressedInUserInteraction:")
    default void validationKeyPressedInUserInteraction(TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}