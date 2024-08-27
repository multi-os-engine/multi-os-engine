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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * _______________________________________________________________________________________________________________
 * 
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableView extends UIScrollView implements NSCoding, UIDataSourceTranslating,
        UISpringLoadedInteractionSupporting {
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
            @NotNull @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITableView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITableView allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @NotNull
    @Generated
    @Selector("appearance")
    public static native UITableView appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UITableView appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UITableView appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UITableView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UITableView appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UITableView appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Deprecated
    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(@Nullable String animationID, @Nullable VoidPtr context);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @Deprecated
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UITableView new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            @NotNull NSArray<? extends UIView> views, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @NotNull @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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
    public static native void setAnimationDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object delegate);

    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(@Nullable SEL selector);

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
    public static native void setAnimationStartDate(@NotNull NSDate startDate);

    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, @NotNull UIView view,
            boolean cache);

    @Deprecated
    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(@Nullable SEL selector);

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
    public static native void transitionFromViewToViewDurationOptionsCompletion(@NotNull UIView fromView,
            @NotNull UIView toView, double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(@NotNull UIView view,
            double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

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
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();

    /**
     * default is NO. Controls whether multiple rows can be selected simultaneously in editing mode
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("allowsMultipleSelectionDuringEditing")
    public native boolean allowsMultipleSelectionDuringEditing();

    /**
     * default is YES. Controls whether rows can be selected when not in editing mode
     * 
     * API-Since: 3.0
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

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UITableView _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UITableView _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UITableView _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UITableView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UITableView _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UITableView _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * the background view will be automatically resized to track the size of the table view. this will be placed as a
     * subview of the table view behind all cells and headers/footers. default may be non-nil for some devices.
     * 
     * API-Since: 3.2
     */
    @Nullable
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
     * Returns any existing visible or prepared cell for the index path. Returns nil when no cell exists, or if index
     * path is out of range.
     */
    @Nullable
    @Generated
    @Selector("cellForRowAtIndexPath:")
    public native UITableViewCell cellForRowAtIndexPath(@NotNull NSIndexPath indexPath);

    /**
     * if cell layout margins are derived from the width of the readableContentGuide. default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("cellLayoutMarginsFollowReadableWidth")
    public native boolean cellLayoutMarginsFollowReadableWidth();

    @Nullable
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDataSource dataSource();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("deleteRowsAtIndexPaths:withRowAnimation:")
    public native void deleteRowsAtIndexPathsWithRowAnimation(@NotNull NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    @Generated
    @Selector("deleteSections:withRowAnimation:")
    public native void deleteSectionsWithRowAnimation(@NotNull NSIndexSet sections, @NInt long animation);

    /**
     * Used by the delegate to acquire an already allocated cell, in lieu of allocating a new one.
     */
    @Nullable
    @Generated
    @Selector("dequeueReusableCellWithIdentifier:")
    public native UITableViewCell dequeueReusableCellWithIdentifier(@NotNull String identifier);

    /**
     * newer dequeue method guarantees a cell is returned and resized properly, assuming identifier is registered
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("dequeueReusableCellWithIdentifier:forIndexPath:")
    public native UITableViewCell dequeueReusableCellWithIdentifierForIndexPath(@NotNull String identifier,
            @NotNull NSIndexPath indexPath);

    /**
     * like dequeueReusableCellWithIdentifier:, but for headers/footers
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("dequeueReusableHeaderFooterViewWithIdentifier:")
    public native UITableViewHeaderFooterView dequeueReusableHeaderFooterViewWithIdentifier(@NotNull String identifier);

    @Generated
    @Selector("deselectRowAtIndexPath:animated:")
    public native void deselectRowAtIndexPathAnimated(@NotNull NSIndexPath indexPath, boolean animated);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("endUpdates")
    public native void endUpdates();

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("estimatedRowHeight")
    @NFloat
    public native double estimatedRowHeight();

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("estimatedSectionFooterHeight")
    @NFloat
    public native double estimatedSectionFooterHeight();

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("estimatedSectionHeaderHeight")
    @NFloat
    public native double estimatedSectionHeaderHeight();

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("footerViewForSection:")
    public native UITableViewHeaderFooterView footerViewForSection(@NInt long section);

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("headerViewForSection:")
    public native UITableViewHeaderFooterView headerViewForSection(@NInt long section);

    /**
     * returns nil if cell is not visible
     */
    @Nullable
    @Generated
    @Selector("indexPathForCell:")
    public native NSIndexPath indexPathForCell(@NotNull UITableViewCell cell);

    /**
     * returns nil if point is outside of any row in the table
     */
    @Nullable
    @Generated
    @Selector("indexPathForRowAtPoint:")
    public native NSIndexPath indexPathForRowAtPoint(@ByValue CGPoint point);

    /**
     * returns nil or index path representing section and row of selection.
     */
    @Nullable
    @Generated
    @Selector("indexPathForSelectedRow")
    public native NSIndexPath indexPathForSelectedRow();

    /**
     * returns nil if rect not valid
     */
    @Nullable
    @Generated
    @Selector("indexPathsForRowsInRect:")
    public native NSArray<? extends NSIndexPath> indexPathsForRowsInRect(@ByValue CGRect rect);

    /**
     * returns nil or a set of index paths representing the sections and rows of the selection.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("indexPathsForSelectedRows")
    public native NSArray<? extends NSIndexPath> indexPathsForSelectedRows();

    @Nullable
    @Generated
    @Selector("indexPathsForVisibleRows")
    public native NSArray<? extends NSIndexPath> indexPathsForVisibleRows();

    @Generated
    @Selector("init")
    public native UITableView init();

    @Generated
    @Selector("initWithCoder:")
    public native UITableView initWithCoder(@NotNull NSCoder coder);

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
    public native void insertRowsAtIndexPathsWithRowAnimation(@NotNull NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    @Generated
    @Selector("insertSections:withRowAnimation:")
    public native void insertSectionsWithRowAnimation(@NotNull NSIndexSet sections, @NInt long animation);

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

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("moveRowAtIndexPath:toIndexPath:")
    public native void moveRowAtIndexPathToIndexPath(@NotNull NSIndexPath indexPath, @NotNull NSIndexPath newIndexPath);

    /**
     * API-Since: 5.0
     */
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

    /**
     * API-Since: 10.0
     */
    @Nullable
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
    public native CGRect rectForRowAtIndexPath(@NotNull NSIndexPath indexPath);

    /**
     * includes header, footer and all rows
     */
    @Generated
    @Selector("rectForSection:")
    @ByValue
    public native CGRect rectForSection(@NInt long section);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("registerClass:forCellReuseIdentifier:")
    public native void registerClassForCellReuseIdentifier(@Nullable Class cellClass, @NotNull String identifier);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("registerClass:forHeaderFooterViewReuseIdentifier:")
    public native void registerClassForHeaderFooterViewReuseIdentifier(@Nullable Class aClass,
            @NotNull String identifier);

    /**
     * Beginning in iOS 6, clients can register a nib or class for each cell.
     * If all reuse identifiers are registered, use the newer -dequeueReusableCellWithIdentifier:forIndexPath: to
     * guarantee that a cell instance is returned.
     * Instances returned from the new dequeue method will also be properly sized when they are returned.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("registerNib:forCellReuseIdentifier:")
    public native void registerNibForCellReuseIdentifier(@Nullable UINib nib, @NotNull String identifier);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("registerNib:forHeaderFooterViewReuseIdentifier:")
    public native void registerNibForHeaderFooterViewReuseIdentifier(@Nullable UINib nib, @NotNull String identifier);

    /**
     * Reloads everything from scratch. Redisplays visible rows. Note that this will cause any existing drop placeholder
     * rows to be removed.
     */
    @Generated
    @Selector("reloadData")
    public native void reloadData();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("reloadRowsAtIndexPaths:withRowAnimation:")
    public native void reloadRowsAtIndexPathsWithRowAnimation(@NotNull NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    /**
     * Reloads the section index bar.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("reloadSectionIndexTitles")
    public native void reloadSectionIndexTitles();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("reloadSections:withRowAnimation:")
    public native void reloadSectionsWithRowAnimation(@NotNull NSIndexSet sections, @NInt long animation);

    /**
     * defaults to NO. If YES, when focusing on a table view the last focused index path is focused automatically. If
     * the table view has never been focused, then the preferred focused index path is used.
     * 
     * API-Since: 9.0
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
    public native void scrollToRowAtIndexPathAtScrollPositionAnimated(@NotNull NSIndexPath indexPath,
            @NInt long scrollPosition, boolean animated);

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
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("sectionIndexBackgroundColor")
    public native UIColor sectionIndexBackgroundColor();

    /**
     * color used for text of the section index
     * 
     * API-Since: 6.0
     */
    @Nullable
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
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("sectionIndexTrackingBackgroundColor")
    public native UIColor sectionIndexTrackingBackgroundColor();

    /**
     * Selects and deselects rows. These methods will not call the delegate methods
     * (-tableView:willSelectRowAtIndexPath: or tableView:didSelectRowAtIndexPath:), nor will it send out a
     * notification.
     */
    @Generated
    @Selector("selectRowAtIndexPath:animated:scrollPosition:")
    public native void selectRowAtIndexPathAnimatedScrollPosition(@Nullable NSIndexPath indexPath, boolean animated,
            @NInt long scrollPosition);

    /**
     * default is the standard separator gray
     */
    @Nullable
    @Generated
    @Selector("separatorColor")
    public native UIColor separatorColor();

    /**
     * effect to apply to table separators
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("separatorEffect")
    public native UIVisualEffect separatorEffect();

    /**
     * allows customization of the frame of cell separators; see also the separatorInsetReference property. Use
     * UITableViewAutomaticDimension for the automatic inset for that edge.
     * 
     * API-Since: 7.0
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
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean value);

    /**
     * default is NO. Controls whether multiple rows can be selected simultaneously in editing mode
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setAllowsMultipleSelectionDuringEditing:")
    public native void setAllowsMultipleSelectionDuringEditing(boolean value);

    /**
     * default is YES. Controls whether rows can be selected when not in editing mode
     * 
     * API-Since: 3.0
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
     * the background view will be automatically resized to track the size of the table view. this will be placed as a
     * subview of the table view behind all cells and headers/footers. default may be non-nil for some devices.
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(@Nullable UIView value);

    /**
     * if cell layout margins are derived from the width of the readableContentGuide. default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setCellLayoutMarginsFollowReadableWidth:")
    public native void setCellLayoutMarginsFollowReadableWidth(boolean value);

    @Generated
    @Selector("setDataSource:")
    public native void setDataSource_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITableViewDataSource value);

    @Generated
    public void setDataSource(@Nullable @Mapped(ObjCObjectMapper.class) UITableViewDataSource value) {
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
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object value) {
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
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setEstimatedRowHeight:")
    public native void setEstimatedRowHeight(@NFloat double value);

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setEstimatedSectionFooterHeight:")
    public native void setEstimatedSectionFooterHeight(@NFloat double value);

    /**
     * default is UITableViewAutomaticDimension, set to 0 to disable
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setEstimatedSectionHeaderHeight:")
    public native void setEstimatedSectionHeaderHeight(@NFloat double value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPrefetchDataSource:")
    public native void setPrefetchDataSource_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UITableViewDataSourcePrefetching value);

    /**
     * API-Since: 10.0
     */
    @Generated
    public void setPrefetchDataSource(
            @Nullable @Mapped(ObjCObjectMapper.class) UITableViewDataSourcePrefetching value) {
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
     * defaults to NO. If YES, when focusing on a table view the last focused index path is focused automatically. If
     * the table view has never been focused, then the preferred focused index path is used.
     * 
     * API-Since: 9.0
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
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setSectionIndexBackgroundColor:")
    public native void setSectionIndexBackgroundColor(@Nullable UIColor value);

    /**
     * color used for text of the section index
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setSectionIndexColor:")
    public native void setSectionIndexColor(@Nullable UIColor value);

    /**
     * show special section index list on right when row count reaches this value. default is 0
     */
    @Generated
    @Selector("setSectionIndexMinimumDisplayRowCount:")
    public native void setSectionIndexMinimumDisplayRowCount(@NInt long value);

    /**
     * the background color of the section index while it is being touched
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setSectionIndexTrackingBackgroundColor:")
    public native void setSectionIndexTrackingBackgroundColor(@Nullable UIColor value);

    /**
     * default is the standard separator gray
     */
    @Generated
    @Selector("setSeparatorColor:")
    public native void setSeparatorColor(@Nullable UIColor value);

    /**
     * effect to apply to table separators
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setSeparatorEffect:")
    public native void setSeparatorEffect(@Nullable UIVisualEffect value);

    /**
     * allows customization of the frame of cell separators; see also the separatorInsetReference property. Use
     * UITableViewAutomaticDimension for the automatic inset for that edge.
     * 
     * API-Since: 7.0
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
    public native void setTableFooterView(@Nullable UIView value);

    /**
     * accessory view for above row content. default is nil. not to be confused with section header
     */
    @Generated
    @Selector("setTableHeaderView:")
    public native void setTableHeaderView(@Nullable UIView value);

    @Generated
    @Selector("style")
    @NInt
    public native long style();

    /**
     * accessory view below content. default is nil. not to be confused with section footer
     */
    @Nullable
    @Generated
    @Selector("tableFooterView")
    public native UIView tableFooterView();

    /**
     * accessory view for above row content. default is nil. not to be confused with section header
     */
    @Nullable
    @Generated
    @Selector("tableHeaderView")
    public native UIView tableHeaderView();

    @NotNull
    @Generated
    @Selector("visibleCells")
    public native NSArray<? extends UITableViewCell> visibleCells();

    @Nullable
    @Generated
    @Selector("dataSourceIndexPathForPresentationIndexPath:")
    public native NSIndexPath dataSourceIndexPathForPresentationIndexPath(@Nullable NSIndexPath presentationIndexPath);

    @Generated
    @Selector("dataSourceSectionIndexForPresentationSectionIndex:")
    @NInt
    public native long dataSourceSectionIndexForPresentationSectionIndex(@NInt long presentationSectionIndex);

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("dragDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDragDelegate dragDelegate();

    /**
     * You can force drags to be disabled for this table view by setting this to NO.
     * As of iOS 15, this is true for both iPhone and iPad by default. Prior to iOS 15, it defaulted to false on iPhone.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("dragInteractionEnabled")
    public native boolean dragInteractionEnabled();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("dropDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDropDelegate dropDelegate();

    /**
     * YES if a drag session is currently active. A drag session begins after rows are "lifted" from the table view.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("hasActiveDrag")
    public native boolean hasActiveDrag();

    /**
     * YES if table view is currently tracking a drop session.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("hasActiveDrop")
    public native boolean hasActiveDrop();

    /**
     * Returns YES if the table view is in the middle of reordering, is displaying a drop target gap, or has drop
     * placeholders. If possible, avoid calling -reloadData while there are uncommitted updates to avoid interfering
     * with user-initiated interactions that have not yet completed.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("hasUncommittedUpdates")
    public native boolean hasUncommittedUpdates();

    /**
     * default value is YES
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("insetsContentViewsToSafeArea")
    public native boolean insetsContentViewsToSafeArea();

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

    /**
     * Allows multiple insert/delete/reload/move calls to be animated simultaneously. Nestable.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("performBatchUpdates:completion:")
    public native void performBatchUpdatesCompletion(
            @Nullable @ObjCBlock(name = "call_performBatchUpdatesCompletion_0") Block_performBatchUpdatesCompletion_0 updates,
            @Nullable @ObjCBlock(name = "call_performBatchUpdatesCompletion_1") Block_performBatchUpdatesCompletion_1 completion);

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
            @NotNull @ObjCBlock(name = "call_performUsingPresentationValues") UIDataSourceTranslating.Block_performUsingPresentationValues actionsToTranslate);

    @Nullable
    @Generated
    @Selector("presentationIndexPathForDataSourceIndexPath:")
    public native NSIndexPath presentationIndexPathForDataSourceIndexPath(@Nullable NSIndexPath dataSourceIndexPath);

    @Generated
    @Selector("presentationSectionIndexForDataSourceSectionIndex:")
    @NInt
    public native long presentationSectionIndexForDataSourceSectionIndex(@NInt long dataSourceSectionIndex);

    /**
     * Changes how custom separatorInset values are interpreted. The default value is
     * UITableViewSeparatorInsetFromCellEdges
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("separatorInsetReference")
    @NInt
    public native long separatorInsetReference();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDragDelegate:")
    public native void setDragDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITableViewDragDelegate value);

    /**
     * API-Since: 11.0
     */
    @Generated
    public void setDragDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UITableViewDragDelegate value) {
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
     * You can force drags to be disabled for this table view by setting this to NO.
     * As of iOS 15, this is true for both iPhone and iPad by default. Prior to iOS 15, it defaulted to false on iPhone.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDragInteractionEnabled:")
    public native void setDragInteractionEnabled(boolean value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDropDelegate:")
    public native void setDropDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITableViewDropDelegate value);

    /**
     * API-Since: 11.0
     */
    @Generated
    public void setDropDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UITableViewDropDelegate value) {
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
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setInsetsContentViewsToSafeArea:")
    public native void setInsetsContentViewsToSafeArea(boolean value);

    /**
     * Changes how custom separatorInset values are interpreted. The default value is
     * UITableViewSeparatorInsetFromCellEdges
     * 
     * API-Since: 11.0
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
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * When enabled, the table view ensures that selection is automatically triggered when focus moves to a cell.
     * Defaults to a system derived value based on platform and other properties of the table view.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("selectionFollowsFocus")
    public native boolean selectionFollowsFocus();

    /**
     * When enabled, the table view ensures that selection is automatically triggered when focus moves to a cell.
     * Defaults to a system derived value based on platform and other properties of the table view.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSelectionFollowsFocus:")
    public native void setSelectionFollowsFocus(boolean value);

    /**
     * Determines if the table view allows its cells to become focused.
     * When tableView:canFocusRowAtIndexPath: is implemented, its return value takes precedence over this method.
     * Defaults to a system derived value based on platform and other properties of the table view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowsFocus")
    public native boolean allowsFocus();

    /**
     * Determines if the table view allows its cells to become focused while editing.
     * When tableView:canFocusRowAtIndexPath: is implemented, its return value takes precedence over this method.
     * Defaults to a system derived value based on platform and other properties of the table view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowsFocusDuringEditing")
    public native boolean allowsFocusDuringEditing();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("contextMenuInteraction")
    public native UIContextMenuInteraction contextMenuInteraction();

    /**
     * The height for filler rows added below the last row when there aren't enough rows to fill a plain style table
     * view.
     * Set 0 to disable filler rows entirely, use `UITableViewAutomaticDimension` for the default height.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("fillerRowHeight")
    @NFloat
    public native double fillerRowHeight();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("isPrefetchingEnabled")
    public native boolean isPrefetchingEnabled();

    /**
     * Reconfigures any existing cells for the rows. Reconfiguring is more efficient than reloading a row, as it does
     * not replace the
     * existing cell with a new cell. Prefer reconfiguring over reloading unless you actually need an entirely new cell
     * for the row.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("reconfigureRowsAtIndexPaths:")
    public native void reconfigureRowsAtIndexPaths(@NotNull NSArray<? extends NSIndexPath> indexPaths);

    /**
     * Padding above each section header. The default value is `UITableViewAutomaticDimension`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("sectionHeaderTopPadding")
    @NFloat
    public native double sectionHeaderTopPadding();

    /**
     * Determines if the table view allows its cells to become focused.
     * When tableView:canFocusRowAtIndexPath: is implemented, its return value takes precedence over this method.
     * Defaults to a system derived value based on platform and other properties of the table view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowsFocus:")
    public native void setAllowsFocus(boolean value);

    /**
     * Determines if the table view allows its cells to become focused while editing.
     * When tableView:canFocusRowAtIndexPath: is implemented, its return value takes precedence over this method.
     * Defaults to a system derived value based on platform and other properties of the table view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowsFocusDuringEditing:")
    public native void setAllowsFocusDuringEditing(boolean value);

    /**
     * The height for filler rows added below the last row when there aren't enough rows to fill a plain style table
     * view.
     * Set 0 to disable filler rows entirely, use `UITableViewAutomaticDimension` for the default height.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFillerRowHeight:")
    public native void setFillerRowHeight(@NFloat double value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPrefetchingEnabled:")
    public native void setPrefetchingEnabled(boolean value);

    /**
     * Padding above each section header. The default value is `UITableViewAutomaticDimension`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSectionHeaderTopPadding:")
    public native void setSectionHeaderTopPadding(@NFloat double value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("selfSizingInvalidation")
    @NInt
    public native long selfSizingInvalidation();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSelfSizingInvalidation:")
    public native void setSelfSizingInvalidation(@NInt long value);

    @Generated
    @Selector("animateWithSpringDuration:bounce:initialSpringVelocity:delay:options:animations:completion:")
    public static native void animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion(
            double duration, @NFloat double bounce, @NFloat double velocity, double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5") @NotNull UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6") @Nullable UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6 completion);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
