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
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UICollectionViewDataSource;
import apple.uikit.protocol.UICollectionViewDataSourcePrefetching;
import apple.uikit.protocol.UICollectionViewDragDelegate;
import apple.uikit.protocol.UICollectionViewDropDelegate;
import apple.uikit.protocol.UIDataSourceTranslating;
import apple.uikit.protocol.UISpringLoadedInteractionSupporting;
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
 * API-Since: 6.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionView extends UIScrollView implements UIDataSourceTranslating,
        UISpringLoadedInteractionSupporting {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionView(Pointer peer) {
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
    public static native UICollectionView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionView allocWithZone(VoidPtr zone);

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
    public static native UICollectionView appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UICollectionView appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UICollectionView appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UICollectionView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UICollectionView appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UICollectionView appearanceWhenContainedInInstancesOfClasses(
            @NotNull NSArray<?> containerTypes);

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
    public static native UICollectionView new_objc();

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
     * default is NO
     */
    @Generated
    @Selector("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();

    /**
     * default is YES
     */
    @Generated
    @Selector("allowsSelection")
    public native boolean allowsSelection();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UICollectionView _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UICollectionView _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UICollectionView _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UICollectionView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UICollectionView _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UICollectionView _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * will be automatically resized to track the size of the collection view and placed behind all cells and
     * supplementary views.
     */
    @Nullable
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    /**
     * returns NO if reordering was prevented from beginning - otherwise YES
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("beginInteractiveMovementForItemAtIndexPath:")
    public native boolean beginInteractiveMovementForItemAtIndexPath(@NotNull NSIndexPath indexPath);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("cancelInteractiveMovement")
    public native void cancelInteractiveMovement();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("cancelInteractiveTransition")
    public native void cancelInteractiveTransition();

    /**
     * Returns any existing visible or prepared cell for the index path. Returns nil when no cell exists, or if index
     * path is out of range.
     */
    @Nullable
    @Generated
    @Selector("cellForItemAtIndexPath:")
    public native UICollectionViewCell cellForItemAtIndexPath(@NotNull NSIndexPath indexPath);

    @NotNull
    @Generated
    @Selector("collectionViewLayout")
    public native UICollectionViewLayout collectionViewLayout();

    @Nullable
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICollectionViewDataSource dataSource();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("deleteItemsAtIndexPaths:")
    public native void deleteItemsAtIndexPaths(@NotNull NSArray<? extends NSIndexPath> indexPaths);

    @Generated
    @Selector("deleteSections:")
    public native void deleteSections(@NotNull NSIndexSet sections);

    @NotNull
    @Generated
    @Selector("dequeueReusableCellWithReuseIdentifier:forIndexPath:")
    public native UICollectionViewCell dequeueReusableCellWithReuseIdentifierForIndexPath(@NotNull String identifier,
            @NotNull NSIndexPath indexPath);

    @NotNull
    @Generated
    @Selector("dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:")
    public native UICollectionReusableView dequeueReusableSupplementaryViewOfKindWithReuseIdentifierForIndexPath(
            @NotNull String elementKind, @NotNull String identifier, @NotNull NSIndexPath indexPath);

    @Generated
    @Selector("deselectItemAtIndexPath:animated:")
    public native void deselectItemAtIndexPathAnimated(@NotNull NSIndexPath indexPath, boolean animated);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("endInteractiveMovement")
    public native void endInteractiveMovement();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("finishInteractiveTransition")
    public native void finishInteractiveTransition();

    @Nullable
    @Generated
    @Selector("indexPathForCell:")
    public native NSIndexPath indexPathForCell(@NotNull UICollectionViewCell cell);

    @Nullable
    @Generated
    @Selector("indexPathForItemAtPoint:")
    public native NSIndexPath indexPathForItemAtPoint(@ByValue CGPoint point);

    /**
     * returns nil or an array of selected index paths
     */
    @Nullable
    @Generated
    @Selector("indexPathsForSelectedItems")
    public native NSArray<? extends NSIndexPath> indexPathsForSelectedItems();

    @NotNull
    @Generated
    @Selector("indexPathsForVisibleItems")
    public native NSArray<? extends NSIndexPath> indexPathsForVisibleItems();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("indexPathsForVisibleSupplementaryElementsOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsForVisibleSupplementaryElementsOfKind(
            @NotNull String elementKind);

    @Generated
    @Selector("init")
    public native UICollectionView init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionView initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UICollectionView initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("initWithFrame:collectionViewLayout:")
    public native UICollectionView initWithFrameCollectionViewLayout(@ByValue CGRect frame,
            @NotNull UICollectionViewLayout layout);

    @Generated
    @Selector("insertItemsAtIndexPaths:")
    public native void insertItemsAtIndexPaths(@NotNull NSArray<? extends NSIndexPath> indexPaths);

    /**
     * These methods allow dynamic modification of the current set of items in the collection view
     */
    @Generated
    @Selector("insertSections:")
    public native void insertSections(@NotNull NSIndexSet sections);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("isPrefetchingEnabled")
    public native boolean isPrefetchingEnabled();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPrefetchingEnabled:")
    public native void setPrefetchingEnabled(boolean value);

    @Nullable
    @Generated
    @Selector("layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForItemAtIndexPath(@NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @Selector("layoutAttributesForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryElementOfKindAtIndexPath(
            @NotNull String kind, @NotNull NSIndexPath indexPath);

    @Generated
    @Selector("moveItemAtIndexPath:toIndexPath:")
    public native void moveItemAtIndexPathToIndexPath(@NotNull NSIndexPath indexPath,
            @NotNull NSIndexPath newIndexPath);

    @Generated
    @Selector("moveSection:toSection:")
    public native void moveSectionToSection(@NInt long section, @NInt long newSection);

    @Generated
    @Selector("numberOfItemsInSection:")
    @NInt
    public native long numberOfItemsInSection(@NInt long section);

    /**
     * Information about the current state of the collection view.
     */
    @Generated
    @Selector("numberOfSections")
    @NInt
    public native long numberOfSections();

    /**
     * allows multiple insert/delete/reload/move calls to be animated simultaneously. Nestable.
     */
    @Generated
    @Selector("performBatchUpdates:completion:")
    public native void performBatchUpdatesCompletion(
            @Nullable @ObjCBlock(name = "call_performBatchUpdatesCompletion_0") Block_performBatchUpdatesCompletion_0 updates,
            @Nullable @ObjCBlock(name = "call_performBatchUpdatesCompletion_1") Block_performBatchUpdatesCompletion_1 completion);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("prefetchDataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICollectionViewDataSourcePrefetching prefetchDataSource();

    /**
     * For each reuse identifier that the collection view will use, register either a class or a nib from which to
     * instantiate a cell.
     * If a nib is registered, it must contain exactly 1 top level object which is a UICollectionViewCell.
     * If a class is registered, it will be instantiated via alloc/initWithFrame:
     */
    @Generated
    @Selector("registerClass:forCellWithReuseIdentifier:")
    public native void registerClassForCellWithReuseIdentifier(@Nullable Class cellClass, @NotNull String identifier);

    @Generated
    @Selector("registerClass:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerClassForSupplementaryViewOfKindWithReuseIdentifier(@Nullable Class viewClass,
            @NotNull String elementKind, @NotNull String identifier);

    @Generated
    @Selector("registerNib:forCellWithReuseIdentifier:")
    public native void registerNibForCellWithReuseIdentifier(@Nullable UINib nib, @NotNull String identifier);

    @Generated
    @Selector("registerNib:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerNibForSupplementaryViewOfKindWithReuseIdentifier(@Nullable UINib nib,
            @NotNull String kind, @NotNull String identifier);

    /**
     * discard the dataSource and delegate data and requery as necessary
     */
    @Generated
    @Selector("reloadData")
    public native void reloadData();

    @Generated
    @Selector("reloadItemsAtIndexPaths:")
    public native void reloadItemsAtIndexPaths(@NotNull NSArray<? extends NSIndexPath> indexPaths);

    @Generated
    @Selector("reloadSections:")
    public native void reloadSections(@NotNull NSIndexSet sections);

    /**
     * defaults to NO. If YES, when focusing on a collection view the last focused index path is focused automatically.
     * If the collection view has never been focused, then the preferred focused index path is used.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("remembersLastFocusedIndexPath")
    public native boolean remembersLastFocusedIndexPath();

    /**
     * Interacting with the collection view.
     */
    @Generated
    @Selector("scrollToItemAtIndexPath:atScrollPosition:animated:")
    public native void scrollToItemAtIndexPathAtScrollPositionAnimated(@NotNull NSIndexPath indexPath,
            @NUInt long scrollPosition, boolean animated);

    @Generated
    @Selector("selectItemAtIndexPath:animated:scrollPosition:")
    public native void selectItemAtIndexPathAnimatedScrollPosition(@Nullable NSIndexPath indexPath, boolean animated,
            @NUInt long scrollPosition);

    /**
     * default is NO
     */
    @Generated
    @Selector("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean value);

    /**
     * default is YES
     */
    @Generated
    @Selector("setAllowsSelection:")
    public native void setAllowsSelection(boolean value);

    /**
     * will be automatically resized to track the size of the collection view and placed behind all cells and
     * supplementary views.
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(@Nullable UIView value);

    @Generated
    @Selector("setCollectionViewLayout:")
    public native void setCollectionViewLayout(@NotNull UICollectionViewLayout value);

    /**
     * transition from one layout to another
     */
    @Generated
    @Selector("setCollectionViewLayout:animated:")
    public native void setCollectionViewLayoutAnimated(@NotNull UICollectionViewLayout layout, boolean animated);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setCollectionViewLayout:animated:completion:")
    public native void setCollectionViewLayoutAnimatedCompletion(@NotNull UICollectionViewLayout layout,
            boolean animated,
            @Nullable @ObjCBlock(name = "call_setCollectionViewLayoutAnimatedCompletion") Block_setCollectionViewLayoutAnimatedCompletion completion);

    @Generated
    @Selector("setDataSource:")
    public native void setDataSource_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UICollectionViewDataSource value);

    @Generated
    public void setDataSource(@Nullable @Mapped(ObjCObjectMapper.class) UICollectionViewDataSource value) {
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

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPrefetchDataSource:")
    public native void setPrefetchDataSource_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UICollectionViewDataSourcePrefetching value);

    /**
     * API-Since: 10.0
     */
    @Generated
    public void setPrefetchDataSource(
            @Nullable @Mapped(ObjCObjectMapper.class) UICollectionViewDataSourcePrefetching value) {
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
     * defaults to NO. If YES, when focusing on a collection view the last focused index path is focused automatically.
     * If the collection view has never been focused, then the preferred focused index path is used.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setRemembersLastFocusedIndexPath:")
    public native void setRemembersLastFocusedIndexPath(boolean value);

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("startInteractiveTransitionToCollectionViewLayout:completion:")
    public native UICollectionViewTransitionLayout startInteractiveTransitionToCollectionViewLayoutCompletion(
            @NotNull UICollectionViewLayout layout,
            @Nullable @ObjCBlock(name = "call_startInteractiveTransitionToCollectionViewLayoutCompletion") Block_startInteractiveTransitionToCollectionViewLayoutCompletion completion);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("supplementaryViewForElementKind:atIndexPath:")
    public native UICollectionReusableView supplementaryViewForElementKindAtIndexPath(@NotNull String elementKind,
            @NotNull NSIndexPath indexPath);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("updateInteractiveMovementTargetPosition:")
    public native void updateInteractiveMovementTargetPosition(@ByValue CGPoint targetPosition);

    @NotNull
    @Generated
    @Selector("visibleCells")
    public native NSArray<? extends UICollectionViewCell> visibleCells();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("visibleSupplementaryViewsOfKind:")
    public native NSArray<? extends UICollectionReusableView> visibleSupplementaryViewsOfKind(
            @NotNull String elementKind);

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

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCollectionViewLayoutAnimatedCompletion {
        @Generated
        void call_setCollectionViewLayoutAnimatedCompletion(boolean finished);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startInteractiveTransitionToCollectionViewLayoutCompletion {
        @Generated
        void call_startInteractiveTransitionToCollectionViewLayoutCompletion(boolean completed, boolean finished);
    }

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
    public native UICollectionViewDragDelegate dragDelegate();

    /**
     * You can force drags to be disabled for this collection view by setting this to NO.
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
    public native UICollectionViewDropDelegate dropDelegate();

    /**
     * YES if a drag session is currently active. A drag session begins after items are "lifted" from the collection
     * view.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("hasActiveDrag")
    public native boolean hasActiveDrag();

    /**
     * YES if collection view is currently tracking a drop session.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("hasActiveDrop")
    public native boolean hasActiveDrop();

    /**
     * Returns YES if the collection view is reordering or has drop placeholders.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("hasUncommittedUpdates")
    public native boolean hasUncommittedUpdates();

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

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
     * Reordering cadence affects how easily reordering occurs while dragging around a reorder-capable drop destination.
     * Default is UICollectionViewReorderingCadenceImmediate.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("reorderingCadence")
    @NInt
    public native long reorderingCadence();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDragDelegate:")
    public native void setDragDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UICollectionViewDragDelegate value);

    /**
     * API-Since: 11.0
     */
    @Generated
    public void setDragDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UICollectionViewDragDelegate value) {
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
     * You can force drags to be disabled for this collection view by setting this to NO.
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
    public native void setDropDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UICollectionViewDropDelegate value);

    /**
     * API-Since: 11.0
     */
    @Generated
    public void setDropDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UICollectionViewDropDelegate value) {
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
     * Reordering cadence affects how easily reordering occurs while dragging around a reorder-capable drop destination.
     * Default is UICollectionViewReorderingCadenceImmediate.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setReorderingCadence:")
    public native void setReorderingCadence(@NInt long value);

    @Generated
    @Selector("setSpringLoaded:")
    public native void setSpringLoaded(boolean value);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Controls whether multiple item selection can occur when the receiver is editing.
     * Defaults to NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsMultipleSelectionDuringEditing")
    public native boolean allowsMultipleSelectionDuringEditing();

    /**
     * Controls whether an item can be selected when the receiver is editing.
     * Defaults to NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsSelectionDuringEditing")
    public native boolean allowsSelectionDuringEditing();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("dequeueConfiguredReusableCellWithRegistration:forIndexPath:item:")
    public native UICollectionViewCell dequeueConfiguredReusableCellWithRegistrationForIndexPathItem(
            @NotNull UICollectionViewCellRegistration registration, @NotNull NSIndexPath indexPath,
            @NotNull @Mapped(ObjCObjectMapper.class) Object item);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("dequeueConfiguredReusableSupplementaryViewWithRegistration:forIndexPath:")
    public native UICollectionReusableView dequeueConfiguredReusableSupplementaryViewWithRegistrationForIndexPath(
            @NotNull UICollectionViewSupplementaryRegistration registration, @NotNull NSIndexPath indexPath);

    /**
     * Controls the editing state for the receiver.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isEditing")
    public native boolean isEditing();

    /**
     * When enabled, the collection view ensures that selection is automatically triggered when focus moves to a cell.
     * Defaults to a system derived value based on platform and other properties of the collection view.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("selectionFollowsFocus")
    public native boolean selectionFollowsFocus();

    /**
     * Controls whether multiple item selection can occur when the receiver is editing.
     * Defaults to NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsMultipleSelectionDuringEditing:")
    public native void setAllowsMultipleSelectionDuringEditing(boolean value);

    /**
     * Controls whether an item can be selected when the receiver is editing.
     * Defaults to NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsSelectionDuringEditing:")
    public native void setAllowsSelectionDuringEditing(boolean value);

    /**
     * Controls the editing state for the receiver.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setEditing:")
    public native void setEditing(boolean value);

    /**
     * When enabled, the collection view ensures that selection is automatically triggered when focus moves to a cell.
     * Defaults to a system derived value based on platform and other properties of the collection view.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSelectionFollowsFocus:")
    public native void setSelectionFollowsFocus(boolean value);

    /**
     * Determines if the collection view allows its cells to become focused.
     * When collectionView:canFocusItemAtIndexPath: is implemented, its return value takes precedence over this method.
     * Defaults to a system derived value based on platform and other properties of the collection view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowsFocus")
    public native boolean allowsFocus();

    /**
     * Determines if the collection view allows its cells to become focused while editing.
     * When collectionView:canFocusItemAtIndexPath: is implemented, its return value takes precedence over this method.
     * Defaults to a system derived value based on platform and other properties of the collection view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowsFocusDuringEditing")
    public native boolean allowsFocusDuringEditing();

    /**
     * API-Since: 13.2
     */
    @Nullable
    @Generated
    @Selector("contextMenuInteraction")
    public native UIContextMenuInteraction contextMenuInteraction();

    /**
     * Reconfigures any existing cells for the items. Reconfiguring is more efficient than reloading an item, as it does
     * not replace the
     * existing cell with a new cell. Prefer reconfiguring over reloading unless you actually need an entirely new cell
     * for the item.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("reconfigureItemsAtIndexPaths:")
    public native void reconfigureItemsAtIndexPaths(@NotNull NSArray<? extends NSIndexPath> indexPaths);

    /**
     * Determines if the collection view allows its cells to become focused.
     * When collectionView:canFocusItemAtIndexPath: is implemented, its return value takes precedence over this method.
     * Defaults to a system derived value based on platform and other properties of the collection view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowsFocus:")
    public native void setAllowsFocus(boolean value);

    /**
     * Determines if the collection view allows its cells to become focused while editing.
     * When collectionView:canFocusItemAtIndexPath: is implemented, its return value takes precedence over this method.
     * Defaults to a system derived value based on platform and other properties of the collection view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowsFocusDuringEditing:")
    public native void setAllowsFocusDuringEditing(boolean value);

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
