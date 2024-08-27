package apple.messages.protocol;

import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 11.0
 */
@Generated
@Library("Messages")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MSMessagesAppTranscriptPresentation")
public interface MSMessagesAppTranscriptPresentation {
    /**
     * contentSizeThatFits:
     * 
     * The content size of the view controller's view fitting the constraining size.
     * 
     * This method will only be called if the `presentationStyle` is `MSMessagesAppPresentationStyleTranscript`.
     * 
     * @param size The maximum size the view will be displayed at.
     * 
     *             API-Since: 11.0
     */
    @Generated
    @Selector("contentSizeThatFits:")
    @ByValue
    CGSize contentSizeThatFits(@ByValue CGSize size);
}
