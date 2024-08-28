package apple.cryptotokenkit.protocol;

import apple.cryptotokenkit.TKSmartCardUserInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * Delegate for user interactions involving the SmartCard reader.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TKSmartCardUserInteractionDelegate")
public interface TKSmartCardUserInteractionDelegate {
    /**
     * A valid character has been entered.
     */
    @Generated
    @IsOptional
    @Selector("characterEnteredInUserInteraction:")
    default void characterEnteredInUserInteraction(@NotNull TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A correction key has been pressed.
     */
    @Generated
    @IsOptional
    @Selector("correctionKeyPressedInUserInteraction:")
    default void correctionKeyPressedInUserInteraction(@NotNull TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * An invalid character has been entered.
     */
    @Generated
    @IsOptional
    @Selector("invalidCharacterEnteredInUserInteraction:")
    default void invalidCharacterEnteredInUserInteraction(@NotNull TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indicates that the new PIN needs to be confirmed (re-entered).
     */
    @Generated
    @IsOptional
    @Selector("newPINConfirmationRequestedInUserInteraction:")
    default void newPINConfirmationRequestedInUserInteraction(@NotNull TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indicates that the new PIN needs to be entered.
     */
    @Generated
    @IsOptional
    @Selector("newPINRequestedInUserInteraction:")
    default void newPINRequestedInUserInteraction(@NotNull TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indicates that the old PIN needs to be entered.
     */
    @Generated
    @IsOptional
    @Selector("oldPINRequestedInUserInteraction:")
    default void oldPINRequestedInUserInteraction(@NotNull TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The validation key has been pressed (end of PIN entry).
     */
    @Generated
    @IsOptional
    @Selector("validationKeyPressedInUserInteraction:")
    default void validationKeyPressedInUserInteraction(@NotNull TKSmartCardUserInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}