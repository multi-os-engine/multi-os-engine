package apple.messages.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MSMessagesAppPresentationContext
 * <p>
 * Describes the context for which the extension was launched
 * [@constant] MSMessagesAppPresentationContextMessages The extension was launched for presentation in Messages
 * [@constant] MSMessagesAppPresentationContextMedia The extension was launched for presentation over media content,
 * such as a photo or camera feed
 */
@Generated
public final class MSMessagesAppPresentationContext {
    @Generated
    private MSMessagesAppPresentationContext() {
    }

    @Generated @NUInt public static final long Messages = 0x0000000000000000L;
    @Generated @NUInt public static final long Media = 0x0000000000000001L;
}
