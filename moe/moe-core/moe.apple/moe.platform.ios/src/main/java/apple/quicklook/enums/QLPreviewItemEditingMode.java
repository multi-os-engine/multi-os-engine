package apple.quicklook.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * QLPreviewItem editing support
 * 
 * API-Since: 13.0
 */
@Generated
public final class QLPreviewItemEditingMode {
    @Generated
    private QLPreviewItemEditingMode() {
    }

    /**
     * The item won't be editable.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000000L;
    /**
     * If QLPreviewController supports editing the file type of the preview item, it will automatically overwrite its
     * contents with the edited version of the user.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long UpdateContents = 0x0000000000000001L;
    /**
     * If QLPreviewController supports editing the file type of the preview item, it will notify its delegate that an
     * edited copy was created. The original document will be unchanged.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long CreateCopy = 0x0000000000000002L;
}