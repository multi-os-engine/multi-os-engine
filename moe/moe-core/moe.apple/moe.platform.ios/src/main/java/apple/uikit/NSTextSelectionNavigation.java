package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.NSTextLocation;
import apple.uikit.protocol.NSTextSelectionDataSource;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextSelectionNavigation extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextSelectionNavigation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextSelectionNavigation alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * If YES, the object could produce selections with multiple disjoint ranges.
     */
    @Generated
    @Selector("allowsNonContiguousRanges")
    public native boolean allowsNonContiguousRanges();

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
     * Returns the ranges that should be deleted based on textSelection and movement arguments. The selection after deletion should contain a 0-length range starting at the location of the first range returned. destination is ignored when textSelection has a non-empty selection. allowsDecomposition only applies to NSTextSelectionNavigationDirectionBackward and NSTextSelectionNavigationDestinationCharacter with 0-length selection.
     */
    @Generated
    @Selector("deletionRangesForTextSelection:direction:destination:allowsDecomposition:")
    public native NSArray<? extends NSTextRange> deletionRangesForTextSelectionDirectionDestinationAllowsDecomposition(
            NSTextSelection textSelection, @NInt long direction, @NInt long destination, boolean allowsDecomposition);

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Returns a text selection moved from textSelection by the navigating operation presented by direction, destination, and extending. Returns nil when the requested operation does not produce any logically valid result. If 'confined' is YES, confine any movement to the text element that the selection already lies within.
     */
    @Generated
    @Selector("destinationSelectionForTextSelection:direction:destination:extending:confined:")
    public native NSTextSelection destinationSelectionForTextSelectionDirectionDestinationExtendingConfined(
            NSTextSelection textSelection, @NInt long direction, @NInt long destination, boolean extending,
            boolean confined);

    /**
     * Flushes cached layout information. Should be called whenever the document contents get changed.
     */
    @Generated
    @Selector("flushLayoutCache")
    public native void flushLayoutCache();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextSelectionNavigation init();

    @Generated
    @Selector("initWithDataSource:")
    public native NSTextSelectionNavigation initWithDataSource(
            @Mapped(ObjCObjectMapper.class) NSTextSelectionDataSource dataSource);

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

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the resolved location for inserting the next input if textSelection is isLogical=NO && secondarySelectionLocation!=nil. If not, returns nil.
     */
    @Generated
    @Selector("resolvedInsertionLocationForTextSelection:writingDirection:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation resolvedInsertionLocationForTextSelectionWritingDirection(
            NSTextSelection textSelection, @NInt long writingDirection);

    /**
     * If YES, rotates the coordinate system for arguments passed to the navigation methods such as -textSelectionsInteractingAtPoint:inContainerAtLocation:anchors:modifiers:selecting:bounds: based on the text container layout orientation. NO by default.
     */
    @Generated
    @Selector("rotatesCoordinateSystemForLayoutOrientation")
    public native boolean rotatesCoordinateSystemForLayoutOrientation();

    /**
     * If YES, the object could produce selections with multiple disjoint ranges.
     */
    @Generated
    @Selector("setAllowsNonContiguousRanges:")
    public native void setAllowsNonContiguousRanges(boolean value);

    /**
     * If YES, rotates the coordinate system for arguments passed to the navigation methods such as -textSelectionsInteractingAtPoint:inContainerAtLocation:anchors:modifiers:selecting:bounds: based on the text container layout orientation. NO by default.
     */
    @Generated
    @Selector("setRotatesCoordinateSystemForLayoutOrientation:")
    public native void setRotatesCoordinateSystemForLayoutOrientation(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The data source object providing the layout and document content information.
     */
    @Generated
    @Selector("textSelectionDataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextSelectionDataSource textSelectionDataSource();

    /**
     * Returns a text selection expanded to the nearest boundaries for selectionGranularity that contains point in the coordinate system of the text container at containerLocation. The returned selection will have granularity=selectionGranularity.
     */
    @Generated
    @Selector("textSelectionForSelectionGranularity:enclosingPoint:inContainerAtLocation:")
    public native NSTextSelection textSelectionForSelectionGranularityEnclosingPointInContainerAtLocation(
            @NInt long selectionGranularity, @ByValue CGPoint point,
            @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * Returns a text selection expanded to the nearest boundaries for selectionGranularity enclosing textSelection.textRanges. The returned selection will have granularity=selectionGranularity.
     */
    @Generated
    @Selector("textSelectionForSelectionGranularity:enclosingTextSelection:")
    public native NSTextSelection textSelectionForSelectionGranularityEnclosingTextSelection(
            @NInt long selectionGranularity, NSTextSelection textSelection);

    /**
     * Returns an array of text selections produced with tap/mouse down at point. anchors defines the last text selection state if selecting=YES or NSTextSelectionNavigationModifierExtend. selecting=YES indicates it's in a text selection dragging session. bounds defines the view area in the container coordinate system that can interact with events. It is typically the view's visible area.
     */
    @Generated
    @Selector("textSelectionsInteractingAtPoint:inContainerAtLocation:anchors:modifiers:selecting:bounds:")
    public native NSArray<? extends NSTextSelection> textSelectionsInteractingAtPointInContainerAtLocationAnchorsModifiersSelectingBounds(
            @ByValue CGPoint point, @Mapped(ObjCObjectMapper.class) NSTextLocation containerLocation,
            NSArray<? extends NSTextSelection> anchors, @NUInt long modifiers, boolean selecting,
            @ByValue CGRect bounds);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
