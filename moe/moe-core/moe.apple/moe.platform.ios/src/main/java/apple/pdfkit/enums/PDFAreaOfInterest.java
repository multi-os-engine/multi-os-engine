package apple.pdfkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * PDF areas of interest (bitfield, multiple bits below may be set).
 */
@Generated
public final class PDFAreaOfInterest {
    @Generated
    private PDFAreaOfInterest() {
    }

    @Generated @NInt public static final long NoArea = 0x0000000000000000L;
    @Generated @NInt public static final long PageArea = 0x0000000000000001L;
    @Generated @NInt public static final long TextArea = 0x0000000000000002L;
    @Generated @NInt public static final long AnnotationArea = 0x0000000000000004L;
    @Generated @NInt public static final long LinkArea = 0x0000000000000008L;
    @Generated @NInt public static final long ControlArea = 0x0000000000000010L;
    @Generated @NInt public static final long TextFieldArea = 0x0000000000000020L;
    @Generated @NInt public static final long IconArea = 0x0000000000000040L;
    @Generated @NInt public static final long PopupArea = 0x0000000000000080L;
    @Generated @NInt public static final long ImageArea = 0x0000000000000100L;
}