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
import org.jetbrains.annotations.NotNull;

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
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyAppearanceDictionary();

    /**
     * "/AS": Name
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyAppearanceState();

    /**
     * "/Border": Array of Integers; or a PDFBorder object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyBorder();

    /**
     * "/C": Array of Floats; or a PDFKitPlatformColor object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyColor();

    /**
     * "/Contents": String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyContents();

    /**
     * "/F": Integer
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyFlags();

    /**
     * "/M": Date or String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyDate();

    /**
     * "/NM": String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyName();

    /**
     * "/P": Dictionary; or a PDFPage object.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyPage();

    /**
     * "/Rect": CGRect
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyRect();

    /**
     * "/Subtype": Name (See Table 8.20: Annotation types)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeySubtype();

    /**
     * "/A": Dictionary; or a PDFAction object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyAction();

    /**
     * "/AA": Dictionary; or a PDFAction object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyAdditionalActions();

    /**
     * "/BS": Dictionary
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyBorderStyle();

    /**
     * "/DA": String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyDefaultAppearance();

    /**
     * "/Dest": Array, Name, or String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyDestination();

    /**
     * "/H": Name
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyHighlightingMode();

    /**
     * "/Inklist": Array of Arrays (each array representing a stroked path)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyInklist();

    /**
     * "/IC": Array of Floats; or a PDFKitPlatformColor object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyInteriorColor();

    /**
     * "/L": Array of Floats
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyLinePoints();

    /**
     * "/LE": Array of Strings
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyLineEndingStyles();

    /**
     * "/Name": Name
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyIconName();

    /**
     * "/Open": Boolean
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyOpen();

    /**
     * "/Parent": Dictionary; or a PDFAnnotation object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyParent();

    /**
     * "/Popup": Dictionary; or a PDFAnnotation object of type "Popup"
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyPopup();

    /**
     * "/Q": Integer
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyQuadding();

    /**
     * "/QuadPoints": Array of Floats
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyQuadPoints();

    /**
     * "/T": String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyTextLabel();

    /**
     * "/AC": String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetDownCaption();

    /**
     * "/BC": Array of Floats; or a PDFKitPlatformColor object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetBorderColor();

    /**
     * "/BG": Array of Floats; or a PDFKitPlatformColor object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetBackgroundColor();

    /**
     * "/CA": String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetCaption();

    /**
     * "/DV": (various)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetDefaultValue();

    /**
     * "/Ff": Integer
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetFieldFlags();

    /**
     * "/FT": Name
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetFieldType();

    /**
     * "/MK": Dictionary; or PDFAppearanceCharacteristics object
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetAppearanceDictionary();

    /**
     * "/MaxLen": Integer
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetMaxLen();

    /**
     * "/Opt": Array (each element is either a string, or an array of two strings)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetOptions();

    /**
     * "/R": Integer
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetRotation();

    /**
     * "/RC": String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetRolloverCaption();

    /**
     * "/TU": String
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetTextLabelUI();

    /**
     * "/V": (various)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationKeyWidgetValue();

    /**
     * All PDF annotation subtypes that PDFKit can render: based on Adobe PDF specification, Table 8.20: Annotation
     * types.
     * Annotation subtypes not supported: Polygon, PolyLine, Squiggly, Caret, Caret, FileAttachment,
     * Sound, Movie, Screen, PrinterMark, TrapNet, Watermark, 3D, Rect.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeText();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeLink();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeFreeText();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeLine();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeSquare();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeCircle();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeHighlight();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeUnderline();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeStrikeOut();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeInk();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeStamp();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypePopup();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationSubtypeWidget();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationWidgetSubtypeButton();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationWidgetSubtypeChoice();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationWidgetSubtypeSignature();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationWidgetSubtypeText();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleNone();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleSquare();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleCircle();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleDiamond();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleOpenArrow();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationLineEndingStyleClosedArrow();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeComment();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeKey();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeNote();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeHelp();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeNewParagraph();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeParagraph();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationTextIconTypeInsert();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationHighlightingModeNone();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationHighlightingModeInvert();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationHighlightingModeOutline();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAnnotationHighlightingModePush();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyBackgroundColor();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyBorderColor();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyRotation();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyCaption();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyRolloverCaption();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFAppearanceCharacteristicsKeyDownCaption();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFBorderKeyLineWidth();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFBorderKeyStyle();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFBorderKeyDashPattern();

    /**
     * To specify a destination point where you don't care about the x or y value (or either), use this value.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @NFloat
    public static native double kPDFDestinationUnspecifiedValue();

    /**
     * The notification object is self.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidUnlockNotification();

    /**
     * The notification object is self, no userInfo dictionary.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidBeginFindNotification();

    /**
     * The notification object is self, no userInfo dictionary.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidEndFindNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains the page index as an NSNumber for the key
     * PDFDocumentPageIndexKey.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidBeginPageFindNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains the page index as an NSNumber for the key
     * PDFDocumentPageIndexKey.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidEndPageFindNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains a PDFSelection (found instance) for the key
     * @"PDFDocumentFoundSelection".
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidFindMatchNotification();

    /**
     * The notification object is self, no userInfo dictionary.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidBeginWriteNotification();

    /**
     * The notification object is self, no userInfo dictionary.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidEndWriteNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains the page index as an NSNumber for the key
     * PDFDocumentPageIndexKey.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidBeginPageWriteNotification();

    /**
     * The notification object is self, the userInfo dictionary
     * contains the page index as an NSNumber for the key
     * PDFDocumentPageIndexKey.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentDidEndPageWriteNotification();

    /**
     * NSString containing document title.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentTitleAttribute();

    /**
     * NSString containing document author.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentAuthorAttribute();

    /**
     * NSString containing document title.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentSubjectAttribute();

    /**
     * NSString containing name of app that created document.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentCreatorAttribute();

    /**
     * NSString containing name of app that produced PDF data.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentProducerAttribute();

    /**
     * NSDate representing document creation date.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentCreationDateAttribute();

    /**
     * NSDate representing last document modification date.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentModificationDateAttribute();

    /**
     * NSArray of NSStrings containing document keywords.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentKeywordsAttribute();

    /**
     * NSString for the owner's password. Required for encryption.
     * Owners have full privilege over the document.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentOwnerPasswordOption();

    /**
     * NSString for the user's password. Optional for encryption.
     * Users can have limited access to modify, print, or write the file.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentUserPasswordOption();

    /**
     * Notification when PDFDocument is modified.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFThumbnailViewDocumentEditedNotification();

    /**
     * Notification when a new document is associated with view.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewDocumentChangedNotification();

    /**
     * Notification when the page history changes.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewChangedHistoryNotification();

    /**
     * Notification when a new page becomes current.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewPageChangedNotification();

    /**
     * Notification when the scale changes.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewScaleChangedNotification();

    /**
     * Notification when the user clicks on an annotation.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewAnnotationHitNotification();

    /**
     * Notification when the user is denied copy (permissions).
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewCopyPermissionNotification();

    /**
     * Notification when the user is denied print (permissions).
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewPrintPermissionNotification();

    /**
     * Notification before user clicks on an annotation.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewAnnotationWillHitNotification();

    /**
     * Notification when the current selection has changed.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewSelectionChangedNotification();

    /**
     * Notification when the display mode has changed.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewDisplayModeChangedNotification();

    /**
     * Notification when the display box has changed.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewDisplayBoxChangedNotification();

    /**
     * Notification when the scroll view has scrolled into the bounds of a new page.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFViewVisiblePagesChangedNotification();

    /**
     * User info dictionary key to get PDFSelection from some
     * notifications described above
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentFoundSelectionKey();

    /**
     * User info dictionary key to get page index from some
     * notifications described above
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentPageIndexKey();

    /**
     * NSNumber containing a PDFAccessPermissions
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentAccessPermissionsOption();

    /**
     * Value: CGRect as NSValue. If present, the page will have the given media box. Otherwise, the media box will be
     * [0, 0, imageWidth, imageHeight].
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFPageImageInitializationOptionMediaBox();

    /**
     * Value: int as NSNumber. If present, the image will be drawn on the page with the given rotation (in degrees
     * counterclockwise). The value must be a multiple of 90 or an exception will be thrown.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFPageImageInitializationOptionRotation();

    /**
     * Value: BOOL as NSNumber. If true, and the image is smaller then the media box, the image will be upscaled to fit
     * the media box, while maintaining aspect ratio.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFPageImageInitializationOptionUpscaleIfSmaller();

    /**
     * Value double as NSNumber. The value must be in the range 0.0 to 1.0 or an exception will be thrown. A value of
     * 0.0 implies that maximum compression is desired. A value of 1.0 implies that maximum quality is desired.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFPageImageInitializationOptionCompressionQuality();

    /**
     * [@YES] to enable, disabled by default
     * If enabled, annotations will be rendered into the content stream and NOT saved as annotations
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentBurnInAnnotationsOption();

    /**
     * [@YES] to enable, disabled by default
     * If enabled, OCR will be performed on all pages on which it has not been done already and saved as invisible, but
     * selectable, text
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PDFDocumentSaveTextFromOCROption();

    /**
     * [@YES] to enable, disabled by default
     * If enabled, images will be saved using JPEG encoding.
     * 
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String PDFDocumentSaveImagesAsJPEGOption();

    /**
     * [@YES] to enable, disabled by default
     * If enabled, the resolution of images will be limited to a resolution appropriate for screen display.
     * 
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String PDFDocumentOptimizeImagesForScreenOption();
}
