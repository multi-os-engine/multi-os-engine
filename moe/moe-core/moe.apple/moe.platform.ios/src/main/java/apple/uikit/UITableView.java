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
import apple.uikit.protocol.UITableViewDataSource;
import apple.uikit.protocol.UITableViewDataSourcePrefetching;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableView extends UIScrollView implements NSCoding {
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

    @Generated
    @Selector("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();

    @Generated
    @Selector("allowsMultipleSelectionDuringEditing")
    public native boolean allowsMultipleSelectionDuringEditing();

    @Generated
    @Selector("allowsSelection")
    public native boolean allowsSelection();

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

    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    @Generated
    @Selector("beginUpdates")
    public native void beginUpdates();

    @Generated
    @Selector("cellForRowAtIndexPath:")
    public native UITableViewCell cellForRowAtIndexPath(NSIndexPath indexPath);

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

    @Generated
    @Selector("dequeueReusableCellWithIdentifier:")
    public native UITableViewCell dequeueReusableCellWithIdentifier(String identifier);

    @Generated
    @Selector("dequeueReusableCellWithIdentifier:forIndexPath:")
    public native UITableViewCell dequeueReusableCellWithIdentifierForIndexPath(String identifier,
            NSIndexPath indexPath);

    @Generated
    @Selector("dequeueReusableHeaderFooterViewWithIdentifier:")
    public native UITableViewHeaderFooterView dequeueReusableHeaderFooterViewWithIdentifier(String identifier);

    @Generated
    @Selector("deselectRowAtIndexPath:animated:")
    public native void deselectRowAtIndexPathAnimated(NSIndexPath indexPath, boolean animated);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("endUpdates")
    public native void endUpdates();

    @Generated
    @Selector("estimatedRowHeight")
    @NFloat
    public native double estimatedRowHeight();

    @Generated
    @Selector("estimatedSectionFooterHeight")
    @NFloat
    public native double estimatedSectionFooterHeight();

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

    @Generated
    @Selector("indexPathForCell:")
    public native NSIndexPath indexPathForCell(UITableViewCell cell);

    @Generated
    @Selector("indexPathForRowAtPoint:")
    public native NSIndexPath indexPathForRowAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("indexPathForSelectedRow")
    public native NSIndexPath indexPathForSelectedRow();

    @Generated
    @Selector("indexPathsForRowsInRect:")
    public native NSArray<? extends NSIndexPath> indexPathsForRowsInRect(@ByValue CGRect rect);

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
    public native UITableView initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithFrame:")
    public native UITableView initWithFrame(@ByValue CGRect frame);

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

    @Generated
    @Selector("isEditing")
    public native boolean isEditing();

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

    @Generated
    @Selector("registerNib:forCellReuseIdentifier:")
    public native void registerNibForCellReuseIdentifier(UINib nib, String identifier);

    @Generated
    @Selector("registerNib:forHeaderFooterViewReuseIdentifier:")
    public native void registerNibForHeaderFooterViewReuseIdentifier(UINib nib, String identifier);

    @Generated
    @Selector("reloadData")
    public native void reloadData();

    @Generated
    @Selector("reloadRowsAtIndexPaths:withRowAnimation:")
    public native void reloadRowsAtIndexPathsWithRowAnimation(NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    @Generated
    @Selector("reloadSectionIndexTitles")
    public native void reloadSectionIndexTitles();

    @Generated
    @Selector("reloadSections:withRowAnimation:")
    public native void reloadSectionsWithRowAnimation(NSIndexSet sections, @NInt long animation);

    @Generated
    @Selector("remembersLastFocusedIndexPath")
    public native boolean remembersLastFocusedIndexPath();

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

    @Generated
    @Selector("sectionFooterHeight")
    @NFloat
    public native double sectionFooterHeight();

    @Generated
    @Selector("sectionHeaderHeight")
    @NFloat
    public native double sectionHeaderHeight();

    @Generated
    @Selector("sectionIndexBackgroundColor")
    public native UIColor sectionIndexBackgroundColor();

    @Generated
    @Selector("sectionIndexColor")
    public native UIColor sectionIndexColor();

    @Generated
    @Selector("sectionIndexMinimumDisplayRowCount")
    @NInt
    public native long sectionIndexMinimumDisplayRowCount();

    @Generated
    @Selector("sectionIndexTrackingBackgroundColor")
    public native UIColor sectionIndexTrackingBackgroundColor();

    @Generated
    @Selector("selectRowAtIndexPath:animated:scrollPosition:")
    public native void selectRowAtIndexPathAnimatedScrollPosition(NSIndexPath indexPath, boolean animated,
            @NInt long scrollPosition);

    @Generated
    @Selector("separatorColor")
    public native UIColor separatorColor();

    @Generated
    @Selector("separatorEffect")
    public native UIVisualEffect separatorEffect();

    @Generated
    @Selector("separatorInset")
    @ByValue
    public native UIEdgeInsets separatorInset();

    @Generated
    @Selector("separatorStyle")
    @NInt
    public native long separatorStyle();

    @Generated
    @Selector("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean value);

    @Generated
    @Selector("setAllowsMultipleSelectionDuringEditing:")
    public native void setAllowsMultipleSelectionDuringEditing(boolean value);

    @Generated
    @Selector("setAllowsSelection:")
    public native void setAllowsSelection(boolean value);

    @Generated
    @Selector("setAllowsSelectionDuringEditing:")
    public native void setAllowsSelectionDuringEditing(boolean value);

    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(UIView value);

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

    @Generated
    @Selector("setEstimatedRowHeight:")
    public native void setEstimatedRowHeight(@NFloat double value);

    @Generated
    @Selector("setEstimatedSectionFooterHeight:")
    public native void setEstimatedSectionFooterHeight(@NFloat double value);

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

    @Generated
    @Selector("setRemembersLastFocusedIndexPath:")
    public native void setRemembersLastFocusedIndexPath(boolean value);

    @Generated
    @Selector("setRowHeight:")
    public native void setRowHeight(@NFloat double value);

    @Generated
    @Selector("setSectionFooterHeight:")
    public native void setSectionFooterHeight(@NFloat double value);

    @Generated
    @Selector("setSectionHeaderHeight:")
    public native void setSectionHeaderHeight(@NFloat double value);

    @Generated
    @Selector("setSectionIndexBackgroundColor:")
    public native void setSectionIndexBackgroundColor(UIColor value);

    @Generated
    @Selector("setSectionIndexColor:")
    public native void setSectionIndexColor(UIColor value);

    @Generated
    @Selector("setSectionIndexMinimumDisplayRowCount:")
    public native void setSectionIndexMinimumDisplayRowCount(@NInt long value);

    @Generated
    @Selector("setSectionIndexTrackingBackgroundColor:")
    public native void setSectionIndexTrackingBackgroundColor(UIColor value);

    @Generated
    @Selector("setSeparatorColor:")
    public native void setSeparatorColor(UIColor value);

    @Generated
    @Selector("setSeparatorEffect:")
    public native void setSeparatorEffect(UIVisualEffect value);

    @Generated
    @Selector("setSeparatorInset:")
    public native void setSeparatorInset(@ByValue UIEdgeInsets value);

    @Generated
    @Selector("setSeparatorStyle:")
    public native void setSeparatorStyle(@NInt long value);

    @Generated
    @Selector("setTableFooterView:")
    public native void setTableFooterView(UIView value);

    @Generated
    @Selector("setTableHeaderView:")
    public native void setTableHeaderView(UIView value);

    @Generated
    @Selector("style")
    @NInt
    public native long style();

    @Generated
    @Selector("tableFooterView")
    public native UIView tableFooterView();

    @Generated
    @Selector("tableHeaderView")
    public native UIView tableHeaderView();

    @Generated
    @Selector("visibleCells")
    public native NSArray<? extends UITableViewCell> visibleCells();
}
