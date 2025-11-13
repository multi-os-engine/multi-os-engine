package apple.avfoundation.protocol;

import apple.avfoundation.AVAssetReaderOutputCaptionAdaptor;
import apple.avfoundation.AVCaption;
import apple.foundation.NSArray;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVAssetReaderCaptionValidationHandling
 * 
 * A protocol to receive caption validation notifications
 * 
 * A client can implement the protocol on its own class which processes the caption validation calls.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAssetReaderCaptionValidationHandling")
public interface AVAssetReaderCaptionValidationHandling {
    /**
     * captionAdaptor:didVendCaption:skippingUnsupportedSourceSyntaxElements:
     * 
     * Called when one or more syntax elements were ignored in the process of creating the caption object.
     * 
     * While the reported string content is human readable, it is highly technical and probably meaningful only to
     * clients who are familiar with the source caption format. It is primarily designed for logging purposes and would
     * not be suitable for UI purposes.
     * 
     * API-Since: 18.0
     * 
     * @param adaptor        The caption adaptor object
     * @param caption        The caption object. The parser skipped unsupported syntax elements when creating this
     *                       object.
     * @param syntaxElements Array of NSString to represent the skipped syntax.
     */
    @Generated
    @IsOptional
    @Selector("captionAdaptor:didVendCaption:skippingUnsupportedSourceSyntaxElements:")
    default void captionAdaptorDidVendCaptionSkippingUnsupportedSourceSyntaxElements(
            @NotNull AVAssetReaderOutputCaptionAdaptor adaptor, @NotNull AVCaption caption,
            @NotNull NSArray<String> syntaxElements) {
        throw new java.lang.UnsupportedOperationException();
    }
}