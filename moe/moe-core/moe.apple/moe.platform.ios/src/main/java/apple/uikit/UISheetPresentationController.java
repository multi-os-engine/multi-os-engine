package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISheetPresentationController extends UIPresentationController {
    static {
        NatJ.register();
    }

    @Generated
    protected UISheetPresentationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISheetPresentationController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISheetPresentationController allocWithZone(VoidPtr zone);

    /**
     * To animate changing any of the above properties, set them inside a block passed to this method.
     * By the time this method returns, the receiver and all adjacent sheets in the sheet stack and their subviews will
     * have been laid out.
     */
    @Generated
    @Selector("animateChanges:")
    public native void animateChanges(@ObjCBlock(name = "call_animateChanges") Block_animateChanges changes);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateChanges {
        @Generated
        void call_animateChanges();
    }

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The delegate inherited from UIPresentationController, redeclared with conformance to
     * UISheetPresentationControllerDelegate.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The array of detents that the sheet may rest at.
     * This array must have at least one element.
     * Detents must be specified in order from smallest to largest height.
     * Default: an array of only [UISheetPresentationControllerDetent largeDetent]
     */
    @Generated
    @Selector("detents")
    public native NSArray<? extends UISheetPresentationControllerDetent> detents();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UISheetPresentationController init();

    @Generated
    @Selector("initWithPresentedViewController:presentingViewController:")
    public native UISheetPresentationController initWithPresentedViewControllerPresentingViewController(
            UIViewController presentedViewController, UIViewController presentingViewController);

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
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The identifier of the largest detent that is not dimmed. When nil or the identifier is not found in detents, all
     * detents are dimmed.
     * Default: nil
     */
    @Generated
    @Selector("largestUndimmedDetentIdentifier")
    public native String largestUndimmedDetentIdentifier();

    @Generated
    @Owned
    @Selector("new")
    public static native UISheetPresentationController new_objc();

    /**
     * The preferred corner radius of the sheet when presented.
     * This value is only respected when the sheet is at the front of its stack.
     * Default: UISheetPresentationControllerAutomaticDimension
     */
    @Generated
    @Selector("preferredCornerRadius")
    @NFloat
    public native double preferredCornerRadius();

    /**
     * Set to YES to cause the sheet to layout with an edge-attached appearance in compact height instead of full
     * screen.
     * Default: NO
     */
    @Generated
    @Selector("prefersEdgeAttachedInCompactHeight")
    public native boolean prefersEdgeAttachedInCompactHeight();

    /**
     * Set to YES to show a grabber at the top of the sheet.
     * Default: NO
     */
    @Generated
    @Selector("prefersGrabberVisible")
    public native boolean prefersGrabberVisible();

    /**
     * If there is a larger detent to expand to than the selected detent, and a descendent scroll view is scrolled to
     * top, this controls whether scrolling down will expand to a larger detent.
     * Useful to set to NO for non-modal sheets, where scrolling in the sheet should not expand the sheet and obscure
     * the content above.
     * Default: YES
     */
    @Generated
    @Selector("prefersScrollingExpandsWhenScrolledToEdge")
    public native boolean prefersScrollingExpandsWhenScrolledToEdge();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The identifier of the selected detent. When nil or the identifier is not found in detents, the sheet is displayed
     * at the smallest detent.
     * Default: nil
     */
    @Generated
    @Selector("selectedDetentIdentifier")
    public native String selectedDetentIdentifier();

    /**
     * The delegate inherited from UIPresentationController, redeclared with conformance to
     * UISheetPresentationControllerDelegate.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * The delegate inherited from UIPresentationController, redeclared with conformance to
     * UISheetPresentationControllerDelegate.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
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
     * The array of detents that the sheet may rest at.
     * This array must have at least one element.
     * Detents must be specified in order from smallest to largest height.
     * Default: an array of only [UISheetPresentationControllerDetent largeDetent]
     */
    @Generated
    @Selector("setDetents:")
    public native void setDetents(NSArray<? extends UISheetPresentationControllerDetent> value);

    /**
     * The identifier of the largest detent that is not dimmed. When nil or the identifier is not found in detents, all
     * detents are dimmed.
     * Default: nil
     */
    @Generated
    @Selector("setLargestUndimmedDetentIdentifier:")
    public native void setLargestUndimmedDetentIdentifier(String value);

    /**
     * The preferred corner radius of the sheet when presented.
     * This value is only respected when the sheet is at the front of its stack.
     * Default: UISheetPresentationControllerAutomaticDimension
     */
    @Generated
    @Selector("setPreferredCornerRadius:")
    public native void setPreferredCornerRadius(@NFloat double value);

    /**
     * Set to YES to cause the sheet to layout with an edge-attached appearance in compact height instead of full
     * screen.
     * Default: NO
     */
    @Generated
    @Selector("setPrefersEdgeAttachedInCompactHeight:")
    public native void setPrefersEdgeAttachedInCompactHeight(boolean value);

    /**
     * Set to YES to show a grabber at the top of the sheet.
     * Default: NO
     */
    @Generated
    @Selector("setPrefersGrabberVisible:")
    public native void setPrefersGrabberVisible(boolean value);

    /**
     * If there is a larger detent to expand to than the selected detent, and a descendent scroll view is scrolled to
     * top, this controls whether scrolling down will expand to a larger detent.
     * Useful to set to NO for non-modal sheets, where scrolling in the sheet should not expand the sheet and obscure
     * the content above.
     * Default: YES
     */
    @Generated
    @Selector("setPrefersScrollingExpandsWhenScrolledToEdge:")
    public native void setPrefersScrollingExpandsWhenScrolledToEdge(boolean value);

    /**
     * The identifier of the selected detent. When nil or the identifier is not found in detents, the sheet is displayed
     * at the smallest detent.
     * Default: nil
     */
    @Generated
    @Selector("setSelectedDetentIdentifier:")
    public native void setSelectedDetentIdentifier(String value);

    /**
     * If specified, the sheet will attempt to visually center itself over this view.
     * Default: nil
     */
    @Generated
    @Selector("setSourceView:")
    public native void setSourceView(UIView value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Set to YES to allow preferredContentSize to influence the width of the sheet when edge-attached.
     * When NO, the width of the sheet when edge-attached is always equal to the safe area width of the container.
     * The value of this property is not respected in compact width regular height.
     * Default: NO
     */
    @Generated
    @Selector("setWidthFollowsPreferredContentSizeWhenEdgeAttached:")
    public native void setWidthFollowsPreferredContentSizeWhenEdgeAttached(boolean value);

    /**
     * If specified, the sheet will attempt to visually center itself over this view.
     * Default: nil
     */
    @Generated
    @Selector("sourceView")
    public native UIView sourceView();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Set to YES to allow preferredContentSize to influence the width of the sheet when edge-attached.
     * When NO, the width of the sheet when edge-attached is always equal to the safe area width of the container.
     * The value of this property is not respected in compact width regular height.
     * Default: NO
     */
    @Generated
    @Selector("widthFollowsPreferredContentSizeWhenEdgeAttached")
    public native boolean widthFollowsPreferredContentSizeWhenEdgeAttached();

    /**
     * If an external input (e.g. a captured property) to a custom detent changes, call this to notify the sheet to
     * re-evaluate the detent in the next layout pass.
     * There is no need to call this if `detents` only contains system detents, or if custom detents only use
     * information from the passed in context.
     * Call within an `animateChanges:` block to animate custom detents to their new heights.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("invalidateDetents")
    public native void invalidateDetents();
}
