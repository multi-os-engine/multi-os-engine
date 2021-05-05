/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSIndexPath;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIDataSourceTranslating;
import apple.uikit.protocol.UISpringLoadedInteractionSupporting;
import apple.uikit.protocol.UITableViewDataSource;
import apple.uikit.protocol.UITableViewDataSourcePrefetching;
import apple.uikit.protocol.UITableViewDragDelegate;
import apple.uikit.protocol.UITableViewDropDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * _______________________________________________________________________________________________________________
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableView extends UIScrollView
        implements NSCoding, UIDataSourceTranslating, UISpringLoadedInteractionSupporting {
    static {
        NatJ.register();
    }

    @Generated
    protected UITableView(Pointer peer) {
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
    public static native UITableView alloc();

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
    @Selector("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

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
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * default is NO. Controls whether multiple rows can be selected simultaneously
     */
    @Generated
    @Selector("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();

    /**
     * default is NO. Controls whether multiple rows can be selected simultaneously in editing mode
     */
    @Generated
    @Selector("allowsMultipleSelectionDuringEditing")
    public native boolean allowsMultipleSelectionDuringEditing();

    /**
     * default is YES. Controls whether rows can be selected when not in editing mode
     */
    @Generated
    @Selector("allowsSelection")
    public native boolean allowsSelection();

    /**
     * default is NO. Controls whether rows can be selected when in editing mode
     */
    @Generated
    @Selector("allowsSelectionDuringEditing")
    public native boolean allowsSelectionDuringEditing();

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * the background view will be automatically resized to track the size of the table view.  this will be placed as a subview of the table view behind all cells and headers/footers.  default may be non-nil for some devices.
     */
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    /**
     * Use -performBatchUpdates:completion: instead of these methods, which will be deprecated in a future release.
     */
    @Generated
    @Selector("beginUpdates")
    public native void beginUpdates();

    /**
     * returns nil if cell is not visible or index path is out of range
     */
    @Generated
    @Selector("cellForRowAtIndexPath:")
    public native UITableViewCell cellForRowAtIndexPath(NSIndexPath indexPath);

    /**
     * if cell layout margins are derived from the width of the readableContentGuide. default is NO.
     */
    @Generated
    @Selector("cellLayoutMarginsFollowReadableWidth")
    public native boolean cellLayoutMarginsFollowReadableWidth();

    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDataSource dataSource();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("deleteRowsAtIndexPaths:withRowAnimation:")
    public native void deleteRowsAtIndexPathsWithRowAnimation(NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    @Generated
    @Selector("deleteSections:withRowAnimation:")
    public native void deleteSectionsWithRowAnimation(NSIndexSet sections, @NInt long animation);

    /**
     * Used by the delegate to acquire an already allocated cell, in lieu of allocating a new one.
     */
    @Generated
    @Selector("dequeueReusableCellWithIdentifier:")
    public native UITableViewCell dequeueReusableCellWithIdentifier(String identifier);

    /**
     * newer dequeue method guarantees a cell is returned and resized properly, assuming identifier is registered
     */
    @Generated
    @Selector("dequeueReusableCellWithIdentifier:forIndexPath:")
    public native UITableViewCell dequeueReusableCellWithIdentifierForIndexPath(String identifier,
            NSIndexPath indexPath);

    /**
     * like dequeueReusableCellWithIdentifier:, but for headers/footers
     */
    @Generated
    @Selector("dequeueReusableHeaderFooterViewWithIdentifier:")
    public native UITableViewHeaderFooterView dequeueReusableHeaderFooterViewWithIdentifier(String identifier);

    @Generated
    @Selector("deselectRowAtIndexPath:animated:")
    public native void deselectRowAtIndexPathAnimated(NSIndexPath indexPath, boolean animated);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("endUpdates")
    public native void endUpdates();

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     */
    @Generated
    @Selector("estimatedRowHeight")
    @NFloat
    public native double estimatedRowHeight();

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     */
    @Generated
    @Selector("estimatedSectionFooterHeight")
    @NFloat
    public native double estimatedSectionFooterHeight();

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     */
    @Generated
    @Selector("estimatedSectionHeaderHeight")
    @NFloat
    public native double estimatedSectionHeaderHeight();

    @Generated
    @Selector("footerViewForSection:")
    public native UITableViewHeaderFooterView footerViewForSection(@NInt long section);

    @Generated
    @Selector("headerViewForSection:")
    public native UITableViewHeaderFooterView headerViewForSection(@NInt long section);

    /**
     * returns nil if cell is not visible
     */
    @Generated
    @Selector("indexPathForCell:")
    public native NSIndexPath indexPathForCell(UITableViewCell cell);

    /**
     * returns nil if point is outside of any row in the table
     */
    @Generated
    @Selector("indexPathForRowAtPoint:")
    public native NSIndexPath indexPathForRowAtPoint(@ByValue CGPoint point);

    /**
     * returns nil or index path representing section and row of selection.
     */
    @Generated
    @Selector("indexPathForSelectedRow")
    public native NSIndexPath indexPathForSelectedRow();

    /**
     * returns nil if rect not valid
     */
    @Generated
    @Selector("indexPathsForRowsInRect:")
    public native NSArray<? extends NSIndexPath> indexPathsForRowsInRect(@ByValue CGRect rect);

    /**
     * returns nil or a set of index paths representing the sections and rows of the selection.
     */
    @Generated
    @Selector("indexPathsForSelectedRows")
    public native NSArray<? extends NSIndexPath> indexPathsForSelectedRows();

    @Generated
    @Selector("indexPathsForVisibleRows")
    public native NSArray<? extends NSIndexPath> indexPathsForVisibleRows();

    @Generated
    @Selector("init")
    public native UITableView init();

    @Generated
    @Selector("initWithCoder:")
    public native UITableView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UITableView initWithFrame(@ByValue CGRect frame);

    /**
     * must specify style at creation. -initWithFrame: calls this with UITableViewStylePlain
     */
    @Generated
    @Selector("initWithFrame:style:")
    public native UITableView initWithFrameStyle(@ByValue CGRect frame, @NInt long style);

    @Generated
    @Selector("insertRowsAtIndexPaths:withRowAnimation:")
    public native void insertRowsAtIndexPathsWithRowAnimation(NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    @Generated
    @Selector("insertSections:withRowAnimation:")
    public native void insertSectionsWithRowAnimation(NSIndexSet sections, @NInt long animation);

    /**
     * default is NO. setting is not animated.
     */
    @Generated
    @Selector("isEditing")
    public native boolean isEditing();

    /**
     * default is NO. setting is not animated.
     */
    @Generated
    @Selector("setEditing:")
    public native void setEditing(boolean value);

    @Generated
    @Selector("moveRowAtIndexPath:toIndexPath:")
    public native void moveRowAtIndexPathToIndexPath(NSIndexPath indexPath, NSIndexPath newIndexPath);

    @Generated
    @Selector("moveSection:toSection:")
    public native void moveSectionToSection(@NInt long section, @NInt long newSection);

    @Generated
    @Selector("numberOfRowsInSection:")
    @NInt
    public native long numberOfRowsInSection(@NInt long section);

    /**
     * Info
     */
    @Generated
    @Selector("numberOfSections")
    @NInt
    public native long numberOfSections();

    @Generated
    @Selector("prefetchDataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDataSourcePrefetching prefetchDataSource();

    @Generated
    @Selector("rectForFooterInSection:")
    @ByValue
    public native CGRect rectForFooterInSection(@NInt long section);

    @Generated
    @Selector("rectForHeaderInSection:")
    @ByValue
    public native CGRect rectForHeaderInSection(@NInt long section);

    @Generated
    @Selector("rectForRowAtIndexPath:")
    @ByValue
    public native CGRect rectForRowAtIndexPath(NSIndexPath indexPath);

    /**
     * includes header, footer and all rows
     */
    @Generated
    @Selector("rectForSection:")
    @ByValue
    public native CGRect rectForSection(@NInt long section);

    @Generated
    @Selector("registerClass:forCellReuseIdentifier:")
    public native void registerClassForCellReuseIdentifier(Class cellClass, String identifier);

    @Generated
    @Selector("registerClass:forHeaderFooterViewReuseIdentifier:")
    public native void registerClassForHeaderFooterViewReuseIdentifier(Class aClass, String identifier);

    /**
     * Beginning in iOS 6, clients can register a nib or class for each cell.
     * If all reuse identifiers are registered, use the newer -dequeueReusableCellWithIdentifier:forIndexPath: to guarantee that a cell instance is returned.
     * Instances returned from the new dequeue method will also be properly sized when they are returned.
     */
    @Generated
    @Selector("registerNib:forCellReuseIdentifier:")
    public native void registerNibForCellReuseIdentifier(UINib nib, String identifier);

    @Generated
    @Selector("registerNib:forHeaderFooterViewReuseIdentifier:")
    public native void registerNibForHeaderFooterViewReuseIdentifier(UINib nib, String identifier);

    /**
     * Reloads everything from scratch. Redisplays visible rows. Note that this will cause any existing drop placeholder rows to be removed.
     */
    @Generated
    @Selector("reloadData")
    public native void reloadData();

    @Generated
    @Selector("reloadRowsAtIndexPaths:withRowAnimation:")
    public native void reloadRowsAtIndexPathsWithRowAnimation(NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    /**
     * Reloads the section index bar.
     */
    @Generated
    @Selector("reloadSectionIndexTitles")
    public native void reloadSectionIndexTitles();

    @Generated
    @Selector("reloadSections:withRowAnimation:")
    public native void reloadSectionsWithRowAnimation(NSIndexSet sections, @NInt long animation);

    /**
     * defaults to NO. If YES, when focusing on a table view the last focused index path is focused automatically. If the table view has never been focused, then the preferred focused index path is used.
     */
    @Generated
    @Selector("remembersLastFocusedIndexPath")
    public native boolean remembersLastFocusedIndexPath();

    /**
     * default is UITableViewAutomaticDimension
     */
    @Generated
    @Selector("rowHeight")
    @NFloat
    public native double rowHeight();

    @Generated
    @Selector("scrollToNearestSelectedRowAtScrollPosition:animated:")
    public native void scrollToNearestSelectedRowAtScrollPositionAnimated(@NInt long scrollPosition, boolean animated);

    @Generated
    @Selector("scrollToRowAtIndexPath:atScrollPosition:animated:")
    public native void scrollToRowAtIndexPathAtScrollPositionAnimated(NSIndexPath indexPath, @NInt long scrollPosition,
            boolean animated);

    /**
     * default is UITableViewAutomaticDimension
     */
    @Generated
    @Selector("sectionFooterHeight")
    @NFloat
    public native double sectionFooterHeight();

    /**
     * default is UITableViewAutomaticDimension
     */
    @Generated
    @Selector("sectionHeaderHeight")
    @NFloat
    public native double sectionHeaderHeight();

    /**
     * the background color of the section index while not being touched
     */
    @Generated
    @Selector("sectionIndexBackgroundColor")
    public native UIColor sectionIndexBackgroundColor();

    /**
     * color used for text of the section index
     */
    @Generated
    @Selector("sectionIndexColor")
    public native UIColor sectionIndexColor();

    /**
     * show special section index list on right when row count reaches this value. default is 0
     */
    @Generated
    @Selector("sectionIndexMinimumDisplayRowCount")
    @NInt
    public native long sectionIndexMinimumDisplayRowCount();

    /**
     * the background color of the section index while it is being touched
     */
    @Generated
    @Selector("sectionIndexTrackingBackgroundColor")
    public native UIColor sectionIndexTrackingBackgroundColor();

    /**
     * Selects and deselects rows. These methods will not call the delegate methods (-tableView:willSelectRowAtIndexPath: or tableView:didSelectRowAtIndexPath:), nor will it send out a notification.
     */
    @Generated
    @Selector("selectRowAtIndexPath:animated:scrollPosition:")
    public native void selectRowAtIndexPathAnimatedScrollPosition(NSIndexPath indexPath, boolean animated,
            @NInt long scrollPosition);

    /**
     * default is the standard separator gray
     */
    @Generated
    @Selector("separatorColor")
    public native UIColor separatorColor();

    /**
     * effect to apply to table separators
     */
    @Generated
    @Selector("separatorEffect")
    public native UIVisualEffect separatorEffect();

    /**
     * allows customization of the frame of cell separators; see also the separatorInsetReference property. Use UITableViewAutomaticDimension for the automatic inset for that edge.
     */
    @Generated
    @Selector("separatorInset")
    @ByValue
    public native UIEdgeInsets separatorInset();

    /**
     * default is UITableViewCellSeparatorStyleSingleLine
     */
    @Generated
    @Selector("separatorStyle")
    @NInt
    public native long separatorStyle();

    /**
     * default is NO. Controls whether multiple rows can be selected simultaneously
     */
    @Generated
    @Selector("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean value);

    /**
     * default is NO. Controls whether multiple rows can be selected simultaneously in editing mode
     */
    @Generated
    @Selector("setAllowsMultipleSelectionDuringEditing:")
    public native void setAllowsMultipleSelectionDuringEditing(boolean value);

    /**
     * default is YES. Controls whether rows can be selected when not in editing mode
     */
    @Generated
    @Selector("setAllowsSelection:")
    public native void setAllowsSelection(boolean value);

    /**
     * default is NO. Controls whether rows can be selected when in editing mode
     */
    @Generated
    @Selector("setAllowsSelectionDuringEditing:")
    public native void setAllowsSelectionDuringEditing(boolean value);

    /**
     * the background view will be automatically resized to track the size of the table view.  this will be placed as a subview of the table view behind all cells and headers/footers.  default may be non-nil for some devices.
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(UIView value);

    /**
     * if cell layout margins are derived from the width of the readableContentGuide. default is NO.
     */
    @Generated
    @Selector("setCellLayoutMarginsFollowReadableWidth:")
    public native void setCellLayoutMarginsFollowReadableWidth(boolean value);

    @Generated
    @Selector("setDataSource:")
    public native void setDataSource_unsafe(@Mapped(ObjCObjectMapper.class) UITableViewDataSource value);

    @Generated
    public void setDataSource(@Mapped(ObjCObjectMapper.class) UITableViewDataSource value) {
        Object __old = dataSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDataSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

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

    @Generated
    @Selector("setEditing:animated:")
    public native void setEditingAnimated(boolean editing, boolean animated);

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     */
    @Generated
    @Selector("setEstimatedRowHeight:")
    public native void setEstimatedRowHeight(@NFloat double value);

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     */
    @Generated
    @Selector("setEstimatedSectionFooterHeight:")
    public native void setEstimatedSectionFooterHeight(@NFloat double value);

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     */
    @Generated
    @Selector("setEstimatedSectionHeaderHeight:")
    public native void setEstimatedSectionHeaderHeight(@NFloat double value);

    @Generated
    @Selector("setPrefetchDataSource:")
    public native void setPrefetchDataSource_unsafe(
            @Mapped(ObjCObjectMapper.class) UITableViewDataSourcePrefetching value);

    @Generated
    public void setPrefetchDataSource(@Mapped(ObjCObjectMapper.class) UITableViewDataSourcePrefetching value) {
        Object __old = prefetchDataSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPrefetchDataSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * defaults to NO. If YES, when focusing on a table view the last focused index path is focused automatically. If the table view has never been focused, then the preferred focused index path is used.
     */
    @Generated
    @Selector("setRemembersLastFocusedIndexPath:")
    public native void setRemembersLastFocusedIndexPath(boolean value);

    /**
     * default is UITableViewAutomaticDimension
     */
    @Generated
    @Selector("setRowHeight:")
    public native void setRowHeight(@NFloat double value);

    /**
     * default is UITableViewAutomaticDimension
     */
    @Generated
    @Selector("setSectionFooterHeight:")
    public native void setSectionFooterHeight(@NFloat double value);

    /**
     * default is UITableViewAutomaticDimension
     */
    @Generated
    @Selector("setSectionHeaderHeight:")
    public native void setSectionHeaderHeight(@NFloat double value);

    /**
     * the background color of the section index while not being touched
     */
    @Generated
    @Selector("setSectionIndexBackgroundColor:")
    public native void setSectionIndexBackgroundColor(UIColor value);

    /**
     * color used for text of the section index
     */
    @Generated
    @Selector("setSectionIndexColor:")
    public native void setSectionIndexColor(UIColor value);

    /**
     * show special section index list on right when row count reaches this value. default is 0
     */
    @Generated
    @Selector("setSectionIndexMinimumDisplayRowCount:")
    public native void setSectionIndexMinimumDisplayRowCount(@NInt long value);

    /**
     * the background color of the section index while it is being touched
     */
    @Generated
    @Selector("setSectionIndexTrackingBackgroundColor:")
    public native void setSectionIndexTrackingBackgroundColor(UIColor value);

    /**
     * default is the standard separator gray
     */
    @Generated
    @Selector("setSeparatorColor:")
    public native void setSeparatorColor(UIColor value);

    /**
     * effect to apply to table separators
     */
    @Generated
    @Selector("setSeparatorEffect:")
    public native void setSeparatorEffect(UIVisualEffect value);

    /**
     * allows customization of the frame of cell separators; see also the separatorInsetReference property. Use UITableViewAutomaticDimension for the automatic inset for that edge.
     */
    @Generated
    @Selector("setSeparatorInset:")
    public native void setSeparatorInset(@ByValue UIEdgeInsets value);

    /**
     * default is UITableViewCellSeparatorStyleSingleLine
     */
    @Generated
    @Selector("setSeparatorStyle:")
    public native void setSeparatorStyle(@NInt long value);

    /**
     * accessory view below content. default is nil. not to be confused with section footer
     */
    @Generated
    @Selector("setTableFooterView:")
    public native void setTableFooterView(UIView value);

    /**
     * accessory view for above row content. default is nil. not to be confused with section header
     */
    @Generated
    @Selector("setTableHeaderView:")
    public native void setTableHeaderView(UIView value);

    @Generated
    @Selector("style")
    @NInt
    public native long style();

    /**
     * accessory view below content. default is nil. not to be confused with section footer
     */
    @Generated
    @Selector("tableFooterView")
    public native UIView tableFooterView();

    /**
     * accessory view for above row content. default is nil. not to be confused with section header
     */
    @Generated
    @Selector("tableHeaderView")
    public native UIView tableHeaderView();

    @Generated
    @Selector("visibleCells")
    public native NSArray<? extends UITableViewCell> visibleCells();

    @Generated
    @Selector("dataSourceIndexPathForPresentationIndexPath:")
    public native NSIndexPath dataSourceIndexPathForPresentationIndexPath(NSIndexPath presentationIndexPath);

    @Generated
    @Selector("dataSourceSectionIndexForPresentationSectionIndex:")
    @NInt
    public native long dataSourceSectionIndexForPresentationSectionIndex(@NInt long presentationSectionIndex);

    @Generated
    @Selector("dragDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDragDelegate dragDelegate();

    /**
     * To enable intra-app drags on iPhone, set this to YES.
     * You can also force drags to be disabled for this table view by setting this to NO.
     * By default, this will return YES on iPad and NO on iPhone.
     */
    @Generated
    @Selector("dragInteractionEnabled")
    public native boolean dragInteractionEnabled();

    @Generated
    @Selector("dropDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDropDelegate dropDelegate();

    /**
     * YES if a drag session is currently active. A drag session begins after rows are "lifted" from the table view.
     */
    @Generated
    @Selector("hasActiveDrag")
    public native boolean hasActiveDrag();

    /**
     * YES if table view is currently tracking a drop session.
     */
    @Generated
    @Selector("hasActiveDrop")
    public native boolean hasActiveDrop();

    /**
     * Returns YES if the table view is in the middle of reordering, is displaying a drop target gap, or has drop placeholders. If possible, avoid calling -reloadData while there are uncommitted updates to avoid interfering with user-initiated interactions that have not yet completed.
     */
    @Generated
    @Selector("hasUncommittedUpdates")
    public native boolean hasUncommittedUpdates();

    /**
     * default value is YES
     */
    @Generated
    @Selector("insetsContentViewsToSafeArea")
    public native boolean insetsContentViewsToSafeArea();

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

    /**
     * Allows multiple insert/delete/reload/move calls to be animated simultaneously. Nestable.
     */
    @Generated
    @Selector("performBatchUpdates:completion:")
    public native void performBatchUpdatesCompletion(
            @ObjCBlock(name = "call_performBatchUpdatesCompletion_0") Block_performBatchUpdatesCompletion_0 updates,
            @ObjCBlock(name = "call_performBatchUpdatesCompletion_1") Block_performBatchUpdatesCompletion_1 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBatchUpdatesCompletion_0 {
        @Generated
        void call_performBatchUpdatesCompletion_0();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBatchUpdatesCompletion_1 {
        @Generated
        void call_performBatchUpdatesCompletion_1(boolean finished);
    }

    @Generated
    @Selector("performUsingPresentationValues:")
    public native void performUsingPresentationValues(
            @ObjCBlock(name = "call_performUsingPresentationValues") UIDataSourceTranslating.Block_performUsingPresentationValues actionsToTranslate);

    @Generated
    @Selector("presentationIndexPathForDataSourceIndexPath:")
    public native NSIndexPath presentationIndexPathForDataSourceIndexPath(NSIndexPath dataSourceIndexPath);

    @Generated
    @Selector("presentationSectionIndexForDataSourceSectionIndex:")
    @NInt
    public native long presentationSectionIndexForDataSourceSectionIndex(@NInt long dataSourceSectionIndex);

    /**
     * Changes how custom separatorInset values are interpreted. The default value is UITableViewSeparatorInsetFromCellEdges
     */
    @Generated
    @Selector("separatorInsetReference")
    @NInt
    public native long separatorInsetReference();

    @Generated
    @Selector("setDragDelegate:")
    public native void setDragDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UITableViewDragDelegate value);

    @Generated
    public void setDragDelegate(@Mapped(ObjCObjectMapper.class) UITableViewDragDelegate value) {
        Object __old = dragDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDragDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * To enable intra-app drags on iPhone, set this to YES.
     * You can also force drags to be disabled for this table view by setting this to NO.
     * By default, this will return YES on iPad and NO on iPhone.
     */
    @Generated
    @Selector("setDragInteractionEnabled:")
    public native void setDragInteractionEnabled(boolean value);

    @Generated
    @Selector("setDropDelegate:")
    public native void setDropDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UITableViewDropDelegate value);

    @Generated
    public void setDropDelegate(@Mapped(ObjCObjectMapper.class) UITableViewDropDelegate value) {
        Object __old = dropDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDropDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * default value is YES
     */
    @Generated
    @Selector("setInsetsContentViewsToSafeArea:")
    public native void setInsetsContentViewsToSafeArea(boolean value);

    /**
     * Changes how custom separatorInset values are interpreted. The default value is UITableViewSeparatorInsetFromCellEdges
     */
    @Generated
    @Selector("setSeparatorInsetReference:")
    public native void setSeparatorInsetReference(@NInt long value);

    @Generated
    @Selector("setSpringLoaded:")
    public native void setSpringLoaded(boolean value);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * When enabled, the table view ensures that selection is automatically triggered when focus moves to a cell.
     */
    @Generated
    @Selector("selectionFollowsFocus")
    public native boolean selectionFollowsFocus();

    /**
     * When enabled, the table view ensures that selection is automatically triggered when focus moves to a cell.
     */
    @Generated
    @Selector("setSelectionFollowsFocus:")
    public native void setSelectionFollowsFocus(boolean value);
}
