package apple.messages.protocol;

import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGSize;
import apple.uikit.UIColor;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.NFloat;

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

    /**
     * invalidateMessageTintColor
     * 
     * Call this when `messageTintColor` changes, e.g. due to change in app state or trait collection.
     * 
     * The message will be updated to reflect the new color. This method will only work if the `presentationStyle` is
     * `MSMessagesAppPresentationStyleTranscript`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("invalidateMessageTintColor")
    void invalidateMessageTintColor();

    /**
     * [@property] messageCornerRadius
     * 
     * The corner radius of the message when presented in the transcript. Use this value to create concentric rounded
     * subviews inside your view. Use continuous corners (kCACornerCurveContinuous) on your view.
     * 
     * This property varies with dynamic type size. Use trait collection registration to trigger an updated layout when
     * dynamic type size changes. To avoid the edges of the transcript view, use `layoutMargins`. This value is only
     * valid when `presentationStyle` is `MSMessagesAppPresentationStyleTranscript`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("messageCornerRadius")
    @NFloat
    double messageCornerRadius();

    /**
     * [@property] messageTintColor
     * 
     * Override to provide a message tint color, e.g. to match the content of the message, or your app's brand color.
     * 
     * This color will be drawn either in a material or as a solid color, depending on transcript context. The default
     * value is nil, which renders the plugin balloon with the system standard background color. This must be a simple
     * RGB color - other color types such as displayP3 or pattern images are not supported. This also does not support
     * dynamic colors. If your color needs to be dynamic, you must call `invalidateMessageTintColor` when the dynamic
     * conditions change.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("messageTintColor")
    @Nullable
    UIColor messageTintColor();
}
