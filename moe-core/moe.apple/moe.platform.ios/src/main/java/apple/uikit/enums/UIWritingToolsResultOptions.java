package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * UIWritingToolsResultOptions
 * 
 * Controls the configuration of the available Writing Tools UI
 * 
 * 
 * API-Since: 18.0
 */
@Generated
public final class UIWritingToolsResultOptions {
    @Generated
    private UIWritingToolsResultOptions() {
    }

    /**
     * System-defined behavior
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Writing Tools will provide plain text in proofreading suggestions or rewrites
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long PlainText = 0x0000000000000001L;
    /**
     * As well as plain text, Writing Tools will provide text attributes in proofreading suggestions or rewrites that
     * are natively supported or known to be easily adopted (such as lists)
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long RichText = 0x0000000000000002L;
    /**
     * implies `RichText`, and Writing Tools may provide attributes for list layout
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long List = 0x0000000000000004L;
    /**
     * implies `RichText`, and Writing Tools may provide attributes for tabular layout
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Table = 0x0000000000000008L;
    /**
     * implies `RichText`, `List`, and `Table`, and Writing Tools may provide text with presentation intent attributes.
     * Writing Tools will use `NSPresentationIntent` instead of `NSTextList` and `NSTextTable` to represent lists and
     * tables.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long PresentationIntent = 0x0000000000000010L;
}