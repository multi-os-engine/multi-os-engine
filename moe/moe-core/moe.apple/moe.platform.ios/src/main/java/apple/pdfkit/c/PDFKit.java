package apple.pdfkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("PDFKit")
@Runtime(CRuntime.class)
public final class PDFKit {
    static {
        NatJ.register();
    }

    @Generated
    private PDFKit() {
    }

    /**
     * "/AP": Dictionary
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyAppearanceDictionary();

    /**
     * "/AS": Name
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyAppearanceState();

    /**
     * "/Border": Array of Integers; or a PDFBorder object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyBorder();

    /**
     * "/C": Array of Floats; or a PDFKitPlatformColor object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyColor();

    /**
     * "/Contents": String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyContents();

    /**
     * "/F": Integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyFlags();

    /**
     * "/M": Date or String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyDate();

    /**
     * "/NM": String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyName();

    /**
     * "/P": Dictionary; or a PDFPage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyPage();

    /**
     * "/Rect": CGRect
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyRect();

    /**
     * "/Subtype": Name (See Table 8.20: Annotation types)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeySubtype();

    /**
     * "/A": Dictionary; or a PDFAction object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyAction();

    /**
     * "/AA": Dictionary; or a PDFAction object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyAdditionalActions();

    /**
     * "/BS": Dictionary
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyBorderStyle();

    /**
     * "/DA": String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyDefaultAppearance();

    /**
     * "/Dest": Array, Name, or String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyDestination();

    /**
     * "/H": Name
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyHighlightingMode();

    /**
     * "/Inklist": Array of Arrays (each array representing a stroked path)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyInklist();

    /**
     * "/IC": Array of Floats; or a PDFKitPlatformColor object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyInteriorColor();

    /**
     * "/L": Array of Floats
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyLinePoints();

    /**
     * "/LE": Array of Strings
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyLineEndingStyles();

    /**
     * "/Name": Name
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyIconName();

    /**
     * "/Open": Boolean
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyOpen();

    /**
     * "/Parent": Dictionary; or a PDFAnnotation object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyParent();

    /**
     * "/Popup": Dictionary; or a PDFAnnotation object of type "Popup"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyPopup();

    /**
     * "/Q": Integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyQuadding();

    /**
     * "/QuadPoints": Array of Floats
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyQuadPoints();

    /**
     * "/T": String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyTextLabel();

    /**
     * "/AC": String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetDownCaption();

    /**
     * "/BC": Array of Floats; or a PDFKitPlatformColor object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetBorderColor();

    /**
     * "/BG": Array of Floats; or a PDFKitPlatformColor object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetBackgroundColor();

    /**
     * "/CA": String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetCaption();

    /**
     * "/DV": (various)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetDefaultValue();

    /**
     * "/Ff": Integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetFieldFlags();

    /**
     * "/FT": Name
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetFieldType();

    /**
     * "/MK": Dictionary; or PDFAppearanceCharacteristics object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetAppearanceDictionary();

    /**
     * "/MaxLen": Integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetMaxLen();

    /**
     * "/Opt": Array (each element is either a string, or an array of two strings)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetOptions();

    /**
     * "/R": Integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetRotation();

    /**
     * "/RC": String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetRolloverCaption();

    /**
     * "/TU": String
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetTextLabelUI();

    /**
     * "/V": (various)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetValue();

    /**
     * All PDF annotation subtypes that PDFKit can render: based on Adobe PDF specification, Table 8.20: Annotation
     * types.
     * Annotation subtypes not supported: Polygon, PolyLine, Squiggly, Caret, Caret, FileAttachment,
     * Sound, Movie, Screen, PrinterMark, TrapNet, Watermark, 3D, Rect.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeText();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeLink();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeFreeText();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeLine();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeSquare();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeCircle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeHighlight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeUnderline();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeStrikeOut();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeInk();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeStamp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypePopup();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeWidget();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationWidgetSubtypeButton();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationWidgetSubtypeChoice();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationWidgetSubtypeSignature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationWidgetSubtypeText();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleNone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleSquare();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleCircle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleDiamond();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleOpenArrow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleClosedArrow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeComment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeNote();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeHelp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeNewParagraph();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeParagraph();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeInsert();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationHighlightingModeNone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationHighlightingModeInvert();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationHighlightingModeOutline();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationHighlightingModePush();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyBackgroundColor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyBorderColor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyRotation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyCaption();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyRolloverCaption();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyDownCaption();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFBorderKeyLineWidth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFBorderKeyStyle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFBorderKeyDashPattern();

    /**
     * To specify a destination point where you don't care about the x or y value (or either), use this value.
     */
    @Generated
    @CVariable()
    @NFloat
    public static native double kPDFDestinationUnspecifiedValue();

    /**
     * The notification object is self.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidUnlockNotification();

    /**
     * The notification object is self, no userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidBeginFindNotification();

    /**
     * The notification object is self, no userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidEndFindNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains the page index as an NSNumber for the key
     * PDFDocumentPageIndexKey.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidBeginPageFindNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains the page index as an NSNumber for the key
     * PDFDocumentPageIndexKey.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidEndPageFindNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains a PDFSelection (found instance) for the key
     *
     * @"PDFDocumentFoundSelection".
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidFindMatchNotification();

    /**
     * The notification object is self, no userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidBeginWriteNotification();

    /**
     * The notification object is self, no userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidEndWriteNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains the page index as an NSNumber for the key
     * PDFDocumentPageIndexKey.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidBeginPageWriteNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains the page index as an NSNumber for the key
     * PDFDocumentPageIndexKey.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidEndPageWriteNotification();

    /**
     * NSString containing document title.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentTitleAttribute();

    /**
     * NSString containing document author.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentAuthorAttribute();

    /**
     * NSString containing document title.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentSubjectAttribute();

    /**
     * NSString containing name of app that created document.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentCreatorAttribute();

    /**
     * NSString containing name of app that produced PDF data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentProducerAttribute();

    /**
     * NSDate representing document creation date.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentCreationDateAttribute();

    /**
     * NSDate representing last document modification date.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentModificationDateAttribute();

    /**
     * NSArray of NSStrings containing document keywords.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentKeywordsAttribute();

    /**
     * NSString for the owner's password. Required for encryption.
     * Owners have full privilege over the document.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentOwnerPasswordOption();

    /**
     * NSString for the user's password. Optional for encryption.
     * Users can have limited access to modify, print, or write the file.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentUserPasswordOption();

    /**
     * Notification when PDFDocument is modified.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFThumbnailViewDocumentEditedNotification();

    /**
     * Notification when a new document is associated with view.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewDocumentChangedNotification();

    /**
     * Notification when the page history changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewChangedHistoryNotification();

    /**
     * Notification when a new page becomes current.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewPageChangedNotification();

    /**
     * Notification when the scale changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewScaleChangedNotification();

    /**
     * Notification when the user clicks on an annotation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewAnnotationHitNotification();

    /**
     * Notification when the user is denied copy (permissions).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewCopyPermissionNotification();

    /**
     * Notification when the user is denied print (permissions).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewPrintPermissionNotification();

    /**
     * Notification before user clicks on an annotation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewAnnotationWillHitNotification();

    /**
     * Notification when the current selection has changed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewSelectionChangedNotification();

    /**
     * Notification when the display mode has changed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewDisplayModeChangedNotification();

    /**
     * Notification when the display box has changed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewDisplayBoxChangedNotification();

    /**
     * Notification when the scroll view has scrolled into the bounds of a new page.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewVisiblePagesChangedNotification();

    /**
     * User info dictionary key to get PDFSelection from some
     * notifications described above
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentFoundSelectionKey();

    /**
     * User info dictionary key to get page index from some
     * notifications described above
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentPageIndexKey();

    /**
     * NSNumber containing a PDFAccessPermissions
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentAccessPermissionsOption();
}
