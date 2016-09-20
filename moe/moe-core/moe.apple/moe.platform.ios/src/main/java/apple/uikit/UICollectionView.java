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
import apple.uikit.protocol.UICollectionViewDataSource;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionView extends UIScrollView {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionView alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

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
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

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
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setAnimationDuration(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount(float repeatCount);

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
    public static native void setVersion(@NInt long aVersion);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * allowsMultipleSelection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/allowsMultipleSelection">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();

    /**
     * allowsSelection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/allowsSelection">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsSelection")
    public native boolean allowsSelection();

    /**
     * backgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/backgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    /**
     * cancelInteractiveTransition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/cancelInteractiveTransition">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelInteractiveTransition")
    public native void cancelInteractiveTransition();

    /**
     * cellForItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/cellForItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cellForItemAtIndexPath:")
    public native UICollectionViewCell cellForItemAtIndexPath(NSIndexPath indexPath);

    /**
     * collectionViewLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/collectionViewLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("collectionViewLayout")
    public native UICollectionViewLayout collectionViewLayout();

    /**
     * dataSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/dataSource">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICollectionViewDataSource dataSource();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    /**
     * deleteItemsAtIndexPaths:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/deleteItemsAtIndexPaths:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteItemsAtIndexPaths:")
    public native void deleteItemsAtIndexPaths(NSArray<? extends NSIndexPath> indexPaths);

    /**
     * deleteSections:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/deleteSections:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteSections:")
    public native void deleteSections(NSIndexSet sections);

    /**
     * dequeueReusableCellWithReuseIdentifier:forIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/dequeueReusableCellWithReuseIdentifier:forIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dequeueReusableCellWithReuseIdentifier:forIndexPath:")
    public native UICollectionViewCell dequeueReusableCellWithReuseIdentifierForIndexPath(String identifier,
            NSIndexPath indexPath);

    /**
     * dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:")
    public native UICollectionReusableView dequeueReusableSupplementaryViewOfKindWithReuseIdentifierForIndexPath(
            String elementKind, String identifier, NSIndexPath indexPath);

    /**
     * deselectItemAtIndexPath:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/deselectItemAtIndexPath:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deselectItemAtIndexPath:animated:")
    public native void deselectItemAtIndexPathAnimated(NSIndexPath indexPath, boolean animated);

    /**
     * finishInteractiveTransition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/finishInteractiveTransition">iOS Dev Center</a>
     */
    @Generated
    @Selector("finishInteractiveTransition")
    public native void finishInteractiveTransition();

    /**
     * indexPathForCell:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/indexPathForCell:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathForCell:")
    public native NSIndexPath indexPathForCell(UICollectionViewCell cell);

    /**
     * indexPathForItemAtPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/indexPathForItemAtPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathForItemAtPoint:")
    public native NSIndexPath indexPathForItemAtPoint(@ByValue CGPoint point);

    /**
     * indexPathsForSelectedItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/indexPathsForSelectedItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsForSelectedItems")
    public native NSArray<? extends NSIndexPath> indexPathsForSelectedItems();

    /**
     * indexPathsForVisibleItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/indexPathsForVisibleItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsForVisibleItems")
    public native NSArray<? extends NSIndexPath> indexPathsForVisibleItems();

    @Generated
    @Selector("init")
    public native UICollectionView init();

    @Generated
    @Selector("initWithFrame:")
    public native UICollectionView initWithFrame(@ByValue CGRect frame);

    /**
     * initWithFrame:collectionViewLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/initWithFrame:collectionViewLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFrame:collectionViewLayout:")
    public native UICollectionView initWithFrameCollectionViewLayout(@ByValue CGRect frame,
            UICollectionViewLayout layout);

    /**
     * insertItemsAtIndexPaths:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/insertItemsAtIndexPaths:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertItemsAtIndexPaths:")
    public native void insertItemsAtIndexPaths(NSArray<? extends NSIndexPath> indexPaths);

    /**
     * insertSections:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/insertSections:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertSections:")
    public native void insertSections(NSIndexSet sections);

    /**
     * layoutAttributesForItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/layoutAttributesForItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForItemAtIndexPath(NSIndexPath indexPath);

    /**
     * layoutAttributesForSupplementaryElementOfKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/layoutAttributesForSupplementaryElementOfKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutAttributesForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryElementOfKindAtIndexPath(String kind,
            NSIndexPath indexPath);

    /**
     * moveItemAtIndexPath:toIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/moveItemAtIndexPath:toIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveItemAtIndexPath:toIndexPath:")
    public native void moveItemAtIndexPathToIndexPath(NSIndexPath indexPath, NSIndexPath newIndexPath);

    /**
     * moveSection:toSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/moveSection:toSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveSection:toSection:")
    public native void moveSectionToSection(@NInt long section, @NInt long newSection);

    /**
     * numberOfItemsInSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/numberOfItemsInSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfItemsInSection:")
    @NInt
    public native long numberOfItemsInSection(@NInt long section);

    /**
     * numberOfSections</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/numberOfSections">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfSections")
    @NInt
    public native long numberOfSections();

    /**
     * performBatchUpdates:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/performBatchUpdates:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performBatchUpdates:completion:")
    public native void performBatchUpdatesCompletion(
            @ObjCBlock(name = "call_performBatchUpdatesCompletion_0") Block_performBatchUpdatesCompletion_0 updates,
            @ObjCBlock(name = "call_performBatchUpdatesCompletion_1") Block_performBatchUpdatesCompletion_1 completion);

    /**
     * registerClass:forCellWithReuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/registerClass:forCellWithReuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerClass:forCellWithReuseIdentifier:")
    public native void registerClassForCellWithReuseIdentifier(Class cellClass, String identifier);

    /**
     * registerClass:forSupplementaryViewOfKind:withReuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/registerClass:forSupplementaryViewOfKind:withReuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerClass:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerClassForSupplementaryViewOfKindWithReuseIdentifier(Class viewClass, String elementKind,
            String identifier);

    /**
     * registerNib:forCellWithReuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/registerNib:forCellWithReuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerNib:forCellWithReuseIdentifier:")
    public native void registerNibForCellWithReuseIdentifier(UINib nib, String identifier);

    /**
     * registerNib:forSupplementaryViewOfKind:withReuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/registerNib:forSupplementaryViewOfKind:withReuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerNib:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerNibForSupplementaryViewOfKindWithReuseIdentifier(UINib nib, String kind,
            String identifier);

    /**
     * reloadData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/reloadData">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadData")
    public native void reloadData();

    /**
     * reloadItemsAtIndexPaths:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/reloadItemsAtIndexPaths:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadItemsAtIndexPaths:")
    public native void reloadItemsAtIndexPaths(NSArray<? extends NSIndexPath> indexPaths);

    /**
     * reloadSections:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/reloadSections:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadSections:")
    public native void reloadSections(NSIndexSet sections);

    /**
     * scrollToItemAtIndexPath:atScrollPosition:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/scrollToItemAtIndexPath:atScrollPosition:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scrollToItemAtIndexPath:atScrollPosition:animated:")
    public native void scrollToItemAtIndexPathAtScrollPositionAnimated(NSIndexPath indexPath,
            @NUInt long scrollPosition, boolean animated);

    /**
     * selectItemAtIndexPath:animated:scrollPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/selectItemAtIndexPath:animated:scrollPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectItemAtIndexPath:animated:scrollPosition:")
    public native void selectItemAtIndexPathAnimatedScrollPosition(NSIndexPath indexPath, boolean animated,
            @NUInt long scrollPosition);

    /**
     * allowsMultipleSelection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/allowsMultipleSelection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean value);

    /**
     * allowsSelection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/allowsSelection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsSelection:")
    public native void setAllowsSelection(boolean value);

    /**
     * backgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/backgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(UIView value);

    /**
     * collectionViewLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/collectionViewLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCollectionViewLayout:")
    public native void setCollectionViewLayout(UICollectionViewLayout value);

    /**
     * setCollectionViewLayout:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/setCollectionViewLayout:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCollectionViewLayout:animated:")
    public native void setCollectionViewLayoutAnimated(UICollectionViewLayout layout, boolean animated);

    /**
     * setCollectionViewLayout:animated:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/setCollectionViewLayout:animated:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCollectionViewLayout:animated:completion:")
    public native void setCollectionViewLayoutAnimatedCompletion(UICollectionViewLayout layout, boolean animated,
            @ObjCBlock(name = "call_setCollectionViewLayoutAnimatedCompletion") Block_setCollectionViewLayoutAnimatedCompletion completion);

    /**
     * dataSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/dataSource">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDataSource:")
    public native void setDataSource_unsafe(@Mapped(ObjCObjectMapper.class) UICollectionViewDataSource value);

    /**
     * dataSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/dataSource">iOS Dev Center</a>
     */
    @Generated
    public void setDataSource(@Mapped(ObjCObjectMapper.class) UICollectionViewDataSource value) {
        Object __old = dataSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDataSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/delegate">iOS Dev Center</a>
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
     * startInteractiveTransitionToCollectionViewLayout:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/startInteractiveTransitionToCollectionViewLayout:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("startInteractiveTransitionToCollectionViewLayout:completion:")
    public native UICollectionViewTransitionLayout startInteractiveTransitionToCollectionViewLayoutCompletion(
            UICollectionViewLayout layout,
            @ObjCBlock(name = "call_startInteractiveTransitionToCollectionViewLayoutCompletion") Block_startInteractiveTransitionToCollectionViewLayoutCompletion completion);

    /**
     * visibleCells</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/visibleCells">iOS Dev Center</a>
     */
    @Generated
    @Selector("visibleCells")
    public native NSArray<? extends UICollectionViewCell> visibleCells();

    /**
     * beginInteractiveMovementForItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/beginInteractiveMovementForItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginInteractiveMovementForItemAtIndexPath:")
    public native boolean beginInteractiveMovementForItemAtIndexPath(NSIndexPath indexPath);

    /**
     * cancelInteractiveMovement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/cancelInteractiveMovement">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelInteractiveMovement")
    public native void cancelInteractiveMovement();

    /**
     * endInteractiveMovement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/endInteractiveMovement">iOS Dev Center</a>
     */
    @Generated
    @Selector("endInteractiveMovement")
    public native void endInteractiveMovement();

    /**
     * indexPathsForVisibleSupplementaryElementsOfKind:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/indexPathsForVisibleSupplementaryElementsOfKind:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsForVisibleSupplementaryElementsOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsForVisibleSupplementaryElementsOfKind(String elementKind);

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionView initWithCoder(NSCoder aDecoder);

    /**
     * supplementaryViewForElementKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/supplementaryViewForElementKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("supplementaryViewForElementKind:atIndexPath:")
    public native UICollectionReusableView supplementaryViewForElementKindAtIndexPath(String elementKind,
            NSIndexPath indexPath);

    /**
     * updateInteractiveMovementTargetPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/updateInteractiveMovementTargetPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateInteractiveMovementTargetPosition:")
    public native void updateInteractiveMovementTargetPosition(@ByValue CGPoint targetPosition);

    /**
     * visibleSupplementaryViewsOfKind:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instm/UICollectionView/visibleSupplementaryViewsOfKind:">iOS Dev Center</a>
     */
    @Generated
    @Selector("visibleSupplementaryViewsOfKind:")
    public native NSArray<? extends UICollectionReusableView> visibleSupplementaryViewsOfKind(String elementKind);

    /**
     * remembersLastFocusedIndexPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/remembersLastFocusedIndexPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("remembersLastFocusedIndexPath")
    public native boolean remembersLastFocusedIndexPath();

    /**
     * remembersLastFocusedIndexPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionView_class/index.html#//apple_ref/occ/instp/UICollectionView/remembersLastFocusedIndexPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRemembersLastFocusedIndexPath:")
    public native void setRemembersLastFocusedIndexPath(boolean value);

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
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
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
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

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
        void call_performBatchUpdatesCompletion_1(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCollectionViewLayoutAnimatedCompletion {
        @Generated
        void call_setCollectionViewLayoutAnimatedCompletion(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startInteractiveTransitionToCollectionViewLayoutCompletion {
        @Generated
        void call_startInteractiveTransitionToCollectionViewLayoutCompletion(boolean arg0, boolean arg1);
    }
}
