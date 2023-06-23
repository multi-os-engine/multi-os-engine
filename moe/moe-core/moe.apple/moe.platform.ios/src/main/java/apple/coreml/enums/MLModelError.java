package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * MLModelError defines the set of MLModel related error codes.
 * 
 * The framework communicates the error code to the application through NSError's code property. The
 * application could use the error code to present an helpful error message to the user or to
 * diagnose the problem.
 * 
 * See also NSError's localizedDescription property, which often contains more detailed information.
 * 
 * API-Since: 11.0
 */
@Generated
public final class MLModelError {
    @Generated
    private MLModelError() {
    }

    /**
     * Core ML throws/returns this error when the framework encounters an generic error.
     * 
     * The typical cause for this error is an unexpected framework level problem.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Generic = 0x0000000000000000L;
    /**
     * Core ML throws/returns this error when the model client, typically an application, sends
     * the wrong feature type to a model's input.
     * 
     * The typical cause for this error is a programming mistake.
     * 
     * For example, a prediction method will throw/return the error when the caller passes an image
     * to a model's input that expects an `MLMultiArray`.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long FeatureType = 0x0000000000000001L;
    /**
     * Core ML throws/returns this error when the framework encounters some I/O problem, most
     * likely a file I/O problem.
     * 
     * For example, a model loading will throw/return the error when the caller requests a
     * non-existing model URL.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long IO = 0x0000000000000003L;
    /**
     * Core ML throws/returns this error when the framework encounters an error in the custom
     * layer subsystem.
     * 
     * The typical cause for this error is a programming mistake.
     * 
     * For example, a prediction method will throw/return the error when it fails to find the custom
     * layer implementation.
     * 
     * API-Since: 11.2
     */
    @Generated @NInt public static final long CustomLayer = 0x0000000000000004L;
    /**
     * Core ML throws/returns this error when the framework encounters an error in the custom
     * model subsystem.
     * 
     * The typical cause for this error is a programming mistake.
     * 
     * For example, a prediction method will throw/return the error when it fails to find the custom
     * model implementation.
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long CustomModel = 0x0000000000000005L;
    /**
     * Core ML throws/returns this error when the framework encounters an error while performing
     * the on-device model update.
     * 
     * For example, the framework will throw/return the error when it fails to save the updated model.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Update = 0x0000000000000006L;
    /**
     * Core ML throws/returns this error when the model client, typically an application, queries
     * an unsupported model parameter (see MLParameterKey).
     * 
     * The typical cause for this error is a programming mistake.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Parameters = 0x0000000000000007L;
    /**
     * Core ML throws/returns this error when the framework fails to download the model decryption
     * key.
     * 
     * The typical cause for this error is a network connection issue to the key server.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ModelDecryptionKeyFetch = 0x0000000000000008L;
    /**
     * Core ML throws/returns this error when the framework encounters an error in the model
     * decryption subsystem.
     * 
     * The typical cause for this error is in the key server configuration and the client application
     * cannot do much about it.
     * 
     * For example, a model loading method will throw/return the error when it uses incorrect model
     * decryption key.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ModelDecryption = 0x0000000000000009L;
    /**
     * Core ML throws/returns this error when the framework encounters an error in the model
     * collection deployment subsystem.
     * 
     * The typical cause for this error is the network connectability issue to the model deployment
     * server.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ModelCollection = 0x000000000000000AL;
}
