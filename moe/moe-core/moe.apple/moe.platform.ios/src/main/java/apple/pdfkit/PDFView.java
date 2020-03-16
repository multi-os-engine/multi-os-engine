package apple.pdfkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
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

@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PDFView extends UIView implements UIGestureRecognizerDelegate {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("annotationsChangedOnPage:")
    public native void annotationsChangedOnPage(PDFPage page);

    @Generated
    @Selector("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearance();

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearance() {
        return appearance();
    }

    @Generated
    @Selector("appearanceForTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("areaOfInterestForMouse:")
    @NInt
    public native long areaOfInterestForMouse(UIEvent event);

    @Generated
    @Selector("areaOfInterestForPoint:")
    @NInt
    public native long areaOfInterestForPoint(@ByValue CGPoint cursorLocation);

    @Generated
    @Selector("autoScales")
    public native boolean autoScales();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

    @Generated
    @Selector("canGoBack")
    public native boolean canGoBack();

    @Generated
    @Selector("canGoForward")
    public native boolean canGoForward();

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

    @Generated
    @Selector("clearSelection")
    public native void clearSelection();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    @Generated
    @Selector("convertPoint:fromPage:")
    @ByValue
    public native CGPoint convertPointFromPage(@ByValue CGPoint point, PDFPage page);

    @Generated
    @Selector("convertPoint:toPage:")
    @ByValue
    public native CGPoint convertPointToPage(@ByValue CGPoint point, PDFPage page);

    @Generated
    @Selector("convertRect:fromPage:")
    @ByValue
    public native CGRect convertRectFromPage(@ByValue CGRect rect, PDFPage page);

    @Generated
    @Selector("convertRect:toPage:")
    @ByValue
    public native CGRect convertRectToPage(@ByValue CGRect rect, PDFPage page);

    @Generated
    @Selector("copy:")
    public native void copy(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("currentDestination")
    public native PDFDestination currentDestination();

    @Generated
    @Selector("currentPage")
    public native PDFPage currentPage();

    @Generated
    @Selector("currentSelection")
    public native PDFSelection currentSelection();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native PDFViewDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("displayBox")
    @NInt
    public native long displayBox();

    @Generated
    @Selector("displayDirection")
    @NInt
    public native long displayDirection();

    @Generated
    @Selector("displayMode")
    @NInt
    public native long displayMode();

    @Generated
    @Selector("displaysAsBook")
    public native boolean displaysAsBook();

    @Generated
    @Selector("displaysPageBreaks")
    public native boolean displaysPageBreaks();

    @Generated
    @Selector("displaysRTL")
    public native boolean displaysRTL();

    @Generated
    @Selector("document")
    public native PDFDocument document();

    @Generated
    @Selector("documentView")
    public native UIView documentView();

    @Generated
    @Selector("drawPage:toContext:")
    public native void drawPageToContext(PDFPage page, CGContextRef context);

    @Generated
    @Selector("drawPagePost:toContext:")
    public native void drawPagePostToContext(PDFPage page, CGContextRef context);

    @Generated
    @Selector("enableDataDetectors")
    public native boolean enableDataDetectors();

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

    @Generated
    @Selector("goToPage:")
    public native void goToPage(PDFPage page);

    @Generated
    @Selector("goToPreviousPage:")
    public native void goToPreviousPage(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("goToRect:onPage:")
    public native void goToRectOnPage(@ByValue CGRect rect, PDFPage page);

    @Generated
    @Selector("goToSelection:")
    public native void goToSelection(PDFSelection selection);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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

    @Generated
    @Selector("interpolationQuality")
    @NInt
    public native long interpolationQuality();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isUsingPageViewController")
    public native boolean isUsingPageViewController();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Selector("layoutDocumentView")
    public native void layoutDocumentView();

    @Generated
    @Selector("maxScaleFactor")
    @NFloat
    public native double maxScaleFactor();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("pageBreakMargins")
    @ByValue
    public native UIEdgeInsets pageBreakMargins();

    @Generated
    @Selector("pageForPoint:nearest:")
    public native PDFPage pageForPointNearest(@ByValue CGPoint point, boolean nearest);

    @Generated
    @Selector("pageShadowsEnabled")
    public native boolean pageShadowsEnabled();

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

    @Generated
    @Selector("rowSizeForPage:")
    @ByValue
    public native CGSize rowSizeForPage(PDFPage page);

    @Generated
    @Selector("scaleFactor")
    @NFloat
    public native double scaleFactor();

    @Generated
    @Selector("scaleFactorForSizeToFit")
    @NFloat
    public native double scaleFactorForSizeToFit();

    @Generated
    @Selector("scrollSelectionToVisible:")
    public native void scrollSelectionToVisible(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("selectAll:")
    public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setAutoScales:")
    public native void setAutoScales(boolean value);

    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    @Generated
    @Selector("setCurrentSelection:")
    public native void setCurrentSelection(PDFSelection value);

    @Generated
    @Selector("setCurrentSelection:animate:")
    public native void setCurrentSelectionAnimate(PDFSelection selection, boolean animate);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) PDFViewDelegate value);

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

    @Generated
    @Selector("setDisplayBox:")
    public native void setDisplayBox(@NInt long value);

    @Generated
    @Selector("setDisplayDirection:")
    public native void setDisplayDirection(@NInt long value);

    @Generated
    @Selector("setDisplayMode:")
    public native void setDisplayMode(@NInt long value);

    @Generated
    @Selector("setDisplaysAsBook:")
    public native void setDisplaysAsBook(boolean value);

    @Generated
    @Selector("setDisplaysPageBreaks:")
    public native void setDisplaysPageBreaks(boolean value);

    @Generated
    @Selector("setDisplaysRTL:")
    public native void setDisplaysRTL(boolean value);

    @Generated
    @Selector("setDocument:")
    public native void setDocument(PDFDocument value);

    @Generated
    @Selector("setEnableDataDetectors:")
    public native void setEnableDataDetectors(boolean value);

    @Generated
    @Selector("setHighlightedSelections:")
    public native void setHighlightedSelections(NSArray<? extends PDFSelection> value);

    @Generated
    @Selector("setInterpolationQuality:")
    public native void setInterpolationQuality(@NInt long value);

    @Generated
    @Selector("setMaxScaleFactor:")
    public native void setMaxScaleFactor(@NFloat double value);

    @Generated
    @Selector("setMinScaleFactor:")
    public native void setMinScaleFactor(@NFloat double value);

    @Generated
    @Selector("setPageBreakMargins:")
    public native void setPageBreakMargins(@ByValue UIEdgeInsets value);

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

    @Generated
    @Selector("visiblePages")
    public native NSArray<? extends PDFPage> visiblePages();

    @Generated
    @Selector("zoomIn:")
    public native void zoomIn(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("zoomOut:")
    public native void zoomOut(@Mapped(ObjCObjectMapper.class) Object sender);
}