package apple.pdfkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Type of control.
 */
@Generated
public final class PDFWidgetControlType {
    @Generated
    private PDFWidgetControlType() {
    }

    @Generated @NInt public static final long UnknownControl = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long PushButtonControl = 0x0000000000000000L;
    @Generated @NInt public static final long RadioButtonControl = 0x0000000000000001L;
    @Generated @NInt public static final long CheckBoxControl = 0x0000000000000002L;
}