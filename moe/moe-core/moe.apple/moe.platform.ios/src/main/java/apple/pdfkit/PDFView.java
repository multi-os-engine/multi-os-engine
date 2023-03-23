package apple.pdfkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.pdfkit.protocol.PDFViewDelegate;
import apple.uikit.UIColor;
import apple.uikit.UIEvent;
import apple.uikit.UIGestureRecognizer;
import apple.uikit.UIPress;
import apple.uikit.UITouch;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIGestureRecognizerDelegate;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.pdfkit.protocol.PDFPageOverlayViewProvider;
import apple.uikit.UIFindInteraction;
import apple.uikit.UIFindSession;
import apple.uikit.protocol.UIFindInteractionDelegate;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 11.0
 */
@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PDFView extends UIView implements UIGestureRecognizerDelegate, UIFindInteractionDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PDFView allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    /**
     * Tells PDFView that an annotation has changed on the specified page. PDFView re-scans then for tooltips, popups,
     * and informs PDFThumbnailViews so the thumbnail can be redrawn.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("annotationsChangedOnPage:")
    public native void annotationsChangedOnPage(PDFPage page);

    @Generated
    @Selector("appearance")
    public static native PDFView appearance();

    @Generated
    @ProtocolClassMethod("appearance")
    public PDFView _appearance() {
        return appearance();
    }

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native PDFView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public PDFView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native PDFView appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public PDFView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native PDFView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public PDFView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native PDFView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public PDFView _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native PDFView appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public PDFView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    /**
     * Returns type of area (see defines above) mouse is over. This method is useful for subclasses.
     */
    @Generated
    @Selector("areaOfInterestForMouse:")
    @NInt
    public native long areaOfInterestForMouse(UIEvent event);

    @Generated
    @Selector("areaOfInterestForPoint:")
    @NInt
    public native long areaOfInterestForPoint(@ByValue CGPoint cursorLocation);

    /**
     * Toggles mode whereby the scale factor is automatically changed as the view is resized, or rotated, to maximize
     * the
     * PDF displayed. For continuous modes this is a "fit width" behavior, for non-continuous modes it is a "best fit"
     * behavior.
     */
    @Generated
    @Selector("autoScales")
    public native boolean autoScales();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Default is a 50% gray.
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    @Deprecated
    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

    /**
     * Page visitations done via goToFirstPage:, goToLastPage:, goToPage:, etc. methods are recorded with visitation
     * history
     * and can be revisited by executing goBack: or goForward:, much like a web browser. Note that visitiation history
     * also includes all rect, destination, and selection goTo*: methods.
     */
    @Generated
    @Selector("canGoBack")
    public native boolean canGoBack();

    @Generated
    @Selector("canGoForward")
    public native boolean canGoForward();

    /**
     * Simple page navigation methods.
     */
    @Generated
    @Selector("canGoToFirstPage")
    public native boolean canGoToFirstPage();

    @Generated
    @Selector("canGoToLastPage")
    public native boolean canGoToLastPage();

    @Generated
    @Selector("canGoToNextPage")
    public native boolean canGoToNextPage();

    @Generated
    @Selector("canGoToPreviousPage")
    public native boolean canGoToPreviousPage();

    @Generated
    @Selector("canZoomIn")
    public native boolean canZoomIn();

    @Generated
    @Selector("canZoomOut")
    public native boolean canZoomOut();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Equivalent to -[PDFView setCurrentSelection: nil].
     */
    @Generated
    @Selector("clearSelection")
    public native void clearSelection();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Deprecated
    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    /**
     * Converts a point from page coordinates to view coordinates.
     */
    @Generated
    @Selector("convertPoint:fromPage:")
    @ByValue
    public native CGPoint convertPointFromPage(@ByValue CGPoint point, PDFPage page);

    /**
     * Converts a point from view coordinates to page coordinates.
     */
    @Generated
    @Selector("convertPoint:toPage:")
    @ByValue
    public native CGPoint convertPointToPage(@ByValue CGPoint point, PDFPage page);

    /**
     * Converts a rect from page coordinates to view coordinates.
     */
    @Generated
    @Selector("convertRect:fromPage:")
    @ByValue
    public native CGRect convertRectFromPage(@ByValue CGRect rect, PDFPage page);

    /**
     * Converts a rect from view coordinates to page coordinates.
     */
    @Generated
    @Selector("convertRect:toPage:")
    @ByValue
    public native CGRect convertRectToPage(@ByValue CGRect rect, PDFPage page);

    /**
     * Copy the selection (if any) to the pasteboard.
     */
    @Generated
    @Selector("copy:")
    public native void copy(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Returns a PDFDestination representing the current page and point displayed (see -[currentPage] for more
     * comments).
     */
    @Generated
    @Selector("currentDestination")
    public native PDFDestination currentDestination();

    /**
     * Returns the current page you are on. For two-up modes, it is the left page (if there are two). For continuous
     * modes,
     * it finds the page crossing a horizontal line halfway between the views top and bottom bounds.
     */
    @Generated
    @Selector("currentPage")
    public native PDFPage currentPage();

    /**
     * Getter: Returns actual instance of the current PDFSelection object. If you wish to modify this, you should make a
     * copy of
     * the selection returned and modify that instead. Method may return nil if there is no selection.
     * Setter: Set current selection to selection. The view will redraw as necessary. The view will not scroll.
     * Call -[scrollSelectionToVisible:] to scroll to the current selection.
     */
    @Generated
    @Selector("currentSelection")
    public native PDFSelection currentSelection();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * -------- delegate
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native PDFViewDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Specifies the box to display/clip to. Default is kPDFDisplayBoxCropBox.
     */
    @Generated
    @Selector("displayBox")
    @NInt
    public native long displayBox();

    /**
     * Set the layout direction, either vertical or horizontal, for the given display mode
     * Defaults to vertical layout (kPDFDisplayDirectionVertical).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("displayDirection")
    @NInt
    public native long displayDirection();

    /**
     * See PDFDisplayMode constants above. Default is kPDFDisplaySinglePageContinuous.
     */
    @Generated
    @Selector("displayMode")
    @NInt
    public native long displayMode();

    /**
     * Specifies whether the first page is to be treated as a cover and (for two-up modes) displayed by itself.
     */
    @Generated
    @Selector("displaysAsBook")
    public native boolean displaysAsBook();

    /**
     * Toggle displaying or not displaying page breaks (spacing) between pages. This spacing value
     * is defined by the pageBreakMargins property. If displaysPageBreaks is NO, then pageBreakMargins
     * will always return { 0.0, 0.0, 0.0, 0.0 }. Default is YES.
     */
    @Generated
    @Selector("displaysPageBreaks")
    public native boolean displaysPageBreaks();

    /**
     * Specifies presentation of pages from right-to-left. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("displaysRTL")
    public native boolean displaysRTL();

    /**
     * Methods for associating a PDFDocument with a PDFView.
     */
    @Generated
    @Selector("document")
    public native PDFDocument document();

    /**
     * Returns the innermost view used by PDFView. This is the view representing the displayed document pages.
     */
    @Generated
    @Selector("documentView")
    public native UIView documentView();

    /**
     * For subclasses. This method is called for each visible page requiring rendering. By subclassing you can draw on
     * top
     * of the PDF page or draw the page entirely yourself. Default implementation erases page to white and calls:
     * [page drawWithBox: [self displayBox] toContext: context]. Note that this may be called multiple times for
     * the same page due to tiling of renderable content.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("drawPage:toContext:")
    public native void drawPageToContext(PDFPage page, CGContextRef context);

    /**
     * Also a handy method for sub-classing. Called for post-page rendering. In this method however no scaling/rotating
     * is
     * applied to the current context to map to page-space. The context is in "view-space" coordinates.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("drawPagePost:toContext:")
    public native void drawPagePostToContext(PDFPage page, CGContextRef context);

    /**
     * Turns on or off data detection. If enabled, page text will be scanned for results such as URL's, addresses, phone
     * numbers,
     * times/dates, etc., as the page becomes visible. Where URL's are found, Link annotations are created in place.
     * These are
     * temporary annotations and are not saved.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("enableDataDetectors")
    public native boolean enableDataDetectors();

    /**
     * Specifies if shadows should be drawn around page borders in a PDFView. Defaults to YES.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("enablePageShadows:")
    public native void enablePageShadows(boolean value);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean gestureRecognizerShouldBeRequiredToFailByGestureRecognizer(
            UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceivePress:")
    public native boolean gestureRecognizerShouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceiveTouch:")
    public native boolean gestureRecognizerShouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public native boolean gestureRecognizerShouldRecognizeSimultaneouslyWithGestureRecognizer(
            UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public native boolean gestureRecognizerShouldRequireFailureOfGestureRecognizer(
            UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    @Generated
    @IsOptional
    @Selector("gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer);

    @Generated
    @Selector("goBack:")
    public native void goBack(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("goForward:")
    public native void goForward(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Goes to the specified destination.
     */
    @Generated
    @Selector("goToDestination:")
    public native void goToDestination(PDFDestination destination);

    @Generated
    @Selector("goToFirstPage:")
    public native void goToFirstPage(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("goToLastPage:")
    public native void goToLastPage(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("goToNextPage:")
    public native void goToNextPage(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Scrolls to page.
     */
    @Generated
    @Selector("goToPage:")
    public native void goToPage(PDFPage page);

    @Generated
    @Selector("goToPreviousPage:")
    public native void goToPreviousPage(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Goes to the specified rectangle on the specified page. If already visible, does nothing. This allows you to
     * scroll
     * the PDFView to a specific PDFAnnotation or PDFSelection (since both object have bounds methods).
     * Note: rect is specified in page coordinates. Example: You might use this function when tabbing through a form to
     * keep
     * focus on the active element.
     */
    @Generated
    @Selector("goToRect:onPage:")
    public native void goToRectOnPage(@ByValue CGRect rect, PDFPage page);

    /**
     * Goes to the specified selection (since selections can be large, goes to the first character of the selection).
     */
    @Generated
    @Selector("goToSelection:")
    public native void goToSelection(PDFSelection selection);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The following calls allow you to associate an array of PDFSelections with a PDFView. Unlike the user selection
     * (above), these selections do not go away when the user clicks in the PDFView, etc. You must explicitly remove
     * them
     * by passing nil to -[setHighlightedSelections:]. These methods allow you to highlight text perhaps to indicate
     * matches from a text search. To avoid confusion you should probably make sure the PDFSelections passed in are a
     * different color from the user's default text selection color. Commonly used for highlighting search results.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("highlightedSelections")
    public native NSArray<? extends PDFSelection> highlightedSelections();

    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

    @Generated
    @Selector("init")
    public native PDFView init();

    @Generated
    @Selector("initWithCoder:")
    public native PDFView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native PDFView initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * Allows setting the interpolation quality for images drawn into the PDFView context.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("interpolationQuality")
    @NInt
    public native long interpolationQuality();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("isUsingPageViewController")
    public native boolean isUsingPageViewController();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    /**
     * Tells PDFView to calculate (layout) the inner views. Called automatically when -[setDocument] and
     * -[setDisplayBox]
     * are called. You'll need to call this if you add or remove a page on the document, rotate a page etc.
     */
    @Generated
    @Selector("layoutDocumentView")
    public native void layoutDocumentView();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("maxScaleFactor")
    @NFloat
    public native double maxScaleFactor();

    /**
     * Set the minimum and maximum scaling factors for the PDF document. Assigning these values will implicitly turn
     * off autoScales, and allows scaleFactor to vary between these min / max scale factors
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("minScaleFactor")
    @NFloat
    public native double minScaleFactor();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Generated
    @Owned
    @Selector("new")
    public static native PDFView new_objc();

    /**
     * If displaysPageBreaks is enabled, you may customize the spacing between pages by defining margins for
     * the top, bottom, left, and right of each page. Note that pageBreakMargins only allows positive values
     * and will clamp any negative value to 0.0. By default, if displaysPageBreaks is enabled, pageBreakMargins
     * is { 4.75, 4.0, 4.75, 4.0 } (with respect to top, left, bottom, right), otherwise it is { 0.0, 0.0, 0.0, 0.0 }
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("pageBreakMargins")
    @ByValue
    public native UIEdgeInsets pageBreakMargins();

    /**
     * Given a point in view coordinates, returns the page at that point. May return nil if no page at point and nearest
     * is NO.
     */
    @Generated
    @Selector("pageForPoint:nearest:")
    public native PDFPage pageForPointNearest(@ByValue CGPoint point, boolean nearest);

    /**
     * Specifies if shadows should be drawn around page borders in a PDFView. Defaults to YES.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("pageShadowsEnabled")
    public native boolean pageShadowsEnabled();

    /**
     * Performs the action specified by action.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("performAction:")
    public native void performAction(PDFAction action);

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Handy for initially sizing PDFView. Returns the size needed to display the 'row' of the view's current document
     * containing the specified page at the current scale factor and with the current display attributes.
     */
    @Generated
    @Selector("rowSizeForPage:")
    @ByValue
    public native CGSize rowSizeForPage(PDFPage page);

    /**
     * Method to get / set the current scaling on the displayed PDF document. Default is 1.0 (actual size).
     * Note that the given scaleFactor is clamped by the current min / max scale factors.
     * When using a page view controller layout on iOS, this only affects the currently visible page and
     * is ignored for any future loaded pages. You can observe the PDFViewPageChangedNotification notification
     * to see when new pages are visible to apply new scale factors to them.
     */
    @Generated
    @Selector("scaleFactor")
    @NFloat
    public native double scaleFactor();

    /**
     * Regardless of current autoScales mode, this returns the "size to fit" scale factor that autoScales would use
     * for scaling the current document and layout. For continuous modes this is a "fit width" scale, for
     * non-continuous modes it is a "best fit" scale.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("scaleFactorForSizeToFit")
    @NFloat
    public native double scaleFactorForSizeToFit();

    /**
     * If the selection is not visible, scrolls view so that it is.
     */
    @Generated
    @Selector("scrollSelectionToVisible:")
    public native void scrollSelectionToVisible(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Select all text for the entire document, unless in in page view controller mode for iOS,
     * where only the current page is selected.
     */
    @Generated
    @Selector("selectAll:")
    public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

    @Deprecated
    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Deprecated
    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Deprecated
    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Deprecated
    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Deprecated
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Deprecated
    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Deprecated
    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    /**
     * Toggles mode whereby the scale factor is automatically changed as the view is resized, or rotated, to maximize
     * the
     * PDF displayed. For continuous modes this is a "fit width" behavior, for non-continuous modes it is a "best fit"
     * behavior.
     */
    @Generated
    @Selector("setAutoScales:")
    public native void setAutoScales(boolean value);

    /**
     * Default is a 50% gray.
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * Getter: Returns actual instance of the current PDFSelection object. If you wish to modify this, you should make a
     * copy of
     * the selection returned and modify that instead. Method may return nil if there is no selection.
     * Setter: Set current selection to selection. The view will redraw as necessary. The view will not scroll.
     * Call -[scrollSelectionToVisible:] to scroll to the current selection.
     */
    @Generated
    @Selector("setCurrentSelection:")
    public native void setCurrentSelection(PDFSelection value);

    /**
     * Like -[setCurrentSelection:] above but with the additional parameter that specifies whether setting the selection
     * should be animated. The animation draws the user's attention to the new selection. Useful when searching.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setCurrentSelection:animate:")
    public native void setCurrentSelectionAnimate(PDFSelection selection, boolean animate);

    /**
     * -------- delegate
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) PDFViewDelegate value);

    /**
     * -------- delegate
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) PDFViewDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Specifies the box to display/clip to. Default is kPDFDisplayBoxCropBox.
     */
    @Generated
    @Selector("setDisplayBox:")
    public native void setDisplayBox(@NInt long value);

    /**
     * Set the layout direction, either vertical or horizontal, for the given display mode
     * Defaults to vertical layout (kPDFDisplayDirectionVertical).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDisplayDirection:")
    public native void setDisplayDirection(@NInt long value);

    /**
     * See PDFDisplayMode constants above. Default is kPDFDisplaySinglePageContinuous.
     */
    @Generated
    @Selector("setDisplayMode:")
    public native void setDisplayMode(@NInt long value);

    /**
     * Specifies whether the first page is to be treated as a cover and (for two-up modes) displayed by itself.
     */
    @Generated
    @Selector("setDisplaysAsBook:")
    public native void setDisplaysAsBook(boolean value);

    /**
     * Toggle displaying or not displaying page breaks (spacing) between pages. This spacing value
     * is defined by the pageBreakMargins property. If displaysPageBreaks is NO, then pageBreakMargins
     * will always return { 0.0, 0.0, 0.0, 0.0 }. Default is YES.
     */
    @Generated
    @Selector("setDisplaysPageBreaks:")
    public native void setDisplaysPageBreaks(boolean value);

    /**
     * Specifies presentation of pages from right-to-left. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDisplaysRTL:")
    public native void setDisplaysRTL(boolean value);

    /**
     * Methods for associating a PDFDocument with a PDFView.
     */
    @Generated
    @Selector("setDocument:")
    public native void setDocument(PDFDocument value);

    /**
     * Turns on or off data detection. If enabled, page text will be scanned for results such as URL's, addresses, phone
     * numbers,
     * times/dates, etc., as the page becomes visible. Where URL's are found, Link annotations are created in place.
     * These are
     * temporary annotations and are not saved.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setEnableDataDetectors:")
    public native void setEnableDataDetectors(boolean value);

    /**
     * The following calls allow you to associate an array of PDFSelections with a PDFView. Unlike the user selection
     * (above), these selections do not go away when the user clicks in the PDFView, etc. You must explicitly remove
     * them
     * by passing nil to -[setHighlightedSelections:]. These methods allow you to highlight text perhaps to indicate
     * matches from a text search. To avoid confusion you should probably make sure the PDFSelections passed in are a
     * different color from the user's default text selection color. Commonly used for highlighting search results.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setHighlightedSelections:")
    public native void setHighlightedSelections(NSArray<? extends PDFSelection> value);

    /**
     * Allows setting the interpolation quality for images drawn into the PDFView context.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setInterpolationQuality:")
    public native void setInterpolationQuality(@NInt long value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMaxScaleFactor:")
    public native void setMaxScaleFactor(@NFloat double value);

    /**
     * Set the minimum and maximum scaling factors for the PDF document. Assigning these values will implicitly turn
     * off autoScales, and allows scaleFactor to vary between these min / max scale factors
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMinScaleFactor:")
    public native void setMinScaleFactor(@NFloat double value);

    /**
     * If displaysPageBreaks is enabled, you may customize the spacing between pages by defining margins for
     * the top, bottom, left, and right of each page. Note that pageBreakMargins only allows positive values
     * and will clamp any negative value to 0.0. By default, if displaysPageBreaks is enabled, pageBreakMargins
     * is { 4.75, 4.0, 4.75, 4.0 } (with respect to top, left, bottom, right), otherwise it is { 0.0, 0.0, 0.0, 0.0 }
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPageBreakMargins:")
    public native void setPageBreakMargins(@ByValue UIEdgeInsets value);

    /**
     * Method to get / set the current scaling on the displayed PDF document. Default is 1.0 (actual size).
     * Note that the given scaleFactor is clamped by the current min / max scale factors.
     * When using a page view controller layout on iOS, this only affects the currently visible page and
     * is ignored for any future loaded pages. You can observe the PDFViewPageChangedNotification notification
     * to see when new pages are visible to apply new scale factors to them.
     */
    @Generated
    @Selector("setScaleFactor:")
    public native void setScaleFactor(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    /**
     * Changes the underlying scroll view to use a UIPageViewController as a way to layout and navigate
     * pages. Note that you can change the orientation via -[PDFView setDisplayDirection:], and that
     * the property -[PDFView displayMode] is ignored: layout is always assumed single page continuous.
     * The viewOptions argument is given to the UIPageViewController initializer, as a way to pass in page spacing, etc.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("usePageViewController:withViewOptions:")
    public native void usePageViewControllerWithViewOptions(boolean enable, NSDictionary<?, ?> viewOptions);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
            @NInt long semanticContentAttribute, @NInt long layoutDirection);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns an array of PDFPage objects representing the currently visible pages. May return empty array if no
     * document is assigned.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("visiblePages")
    public native NSArray<? extends PDFPage> visiblePages();

    /**
     * Zooming changes the scaling by root-2.
     */
    @Generated
    @Selector("zoomIn:")
    public native void zoomIn(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("zoomOut:")
    public native void zoomOut(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceiveEvent:")
    public native boolean gestureRecognizerShouldReceiveEvent(UIGestureRecognizer gestureRecognizer, UIEvent event);

    /**
     * If `findInteractionEnabled` is set to true, returns the receiver's built-in find interaction. Otherwise, nil.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("findInteraction")
    public native UIFindInteraction findInteraction();

    @Generated
    @IsOptional
    @Selector("findInteraction:didBeginFindSession:")
    public native void findInteractionDidBeginFindSession(UIFindInteraction interaction, UIFindSession session);

    @Generated
    @IsOptional
    @Selector("findInteraction:didEndFindSession:")
    public native void findInteractionDidEndFindSession(UIFindInteraction interaction, UIFindSession session);

    @Generated
    @Selector("findInteraction:sessionForView:")
    public native UIFindSession findInteractionSessionForView(UIFindInteraction interaction, UIView view);

    /**
     * Enables the built-in find interaction.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isFindInteractionEnabled")
    public native boolean isFindInteractionEnabled();

    /**
     * If YES, page overlay views will be hit tested and therefore receive gestures. If NO, PDFView will receive
     * gestures,
     * namely those for text selection.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isInMarkupMode")
    public native boolean isInMarkupMode();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("pageOverlayViewProvider")
    @MappedReturn(ObjCObjectMapper.class)
    public native PDFPageOverlayViewProvider pageOverlayViewProvider();

    /**
     * Enables the built-in find interaction.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setFindInteractionEnabled:")
    public native void setFindInteractionEnabled(boolean value);

    /**
     * If YES, page overlay views will be hit tested and therefore receive gestures. If NO, PDFView will receive
     * gestures,
     * namely those for text selection.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInMarkupMode:")
    public native void setInMarkupMode(boolean value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPageOverlayViewProvider:")
    public native void setPageOverlayViewProvider_unsafe(
            @Mapped(ObjCObjectMapper.class) PDFPageOverlayViewProvider value);

    /**
     * API-Since: 16.0
     */
    @Generated
    public void setPageOverlayViewProvider(@Mapped(ObjCObjectMapper.class) PDFPageOverlayViewProvider value) {
        Object __old = pageOverlayViewProvider();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPageOverlayViewProvider_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }
}
