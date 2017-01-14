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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIBarPositioning;
import apple.uikit.protocol.UISearchBarDelegate;
import apple.uikit.protocol.UITextInputTraits;
import apple.uikit.struct.UIOffset;
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
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISearchBar extends UIView implements UIBarPositioning, UITextInputTraits {
    static {
        NatJ.register();
    }

    @Generated
    protected UISearchBar(Pointer peer) {
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
    public static native UISearchBar alloc();

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
    @IsOptional
    @Selector("autocapitalizationType")
    @NInt
    public native long autocapitalizationType();

    @Generated
    @IsOptional
    @Selector("autocorrectionType")
    @NInt
    public native long autocorrectionType();

    @Generated
    @Selector("backgroundImage")
    public native UIImage backgroundImage();

    @Generated
    @Selector("backgroundImageForBarPosition:barMetrics:")
    public native UIImage backgroundImageForBarPositionBarMetrics(@NInt long barPosition, @NInt long barMetrics);

    @Generated
    @Selector("barPosition")
    @NInt
    public native long barPosition();

    @Generated
    @Selector("barStyle")
    @NInt
    public native long barStyle();

    @Generated
    @Selector("barTintColor")
    public native UIColor barTintColor();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISearchBarDelegate delegate();

    @Generated
    @IsOptional
    @Selector("enablesReturnKeyAutomatically")
    public native boolean enablesReturnKeyAutomatically();

    @Generated
    @Selector("imageForSearchBarIcon:state:")
    public native UIImage imageForSearchBarIconState(@NInt long icon, @NUInt long state);

    @Generated
    @Selector("init")
    public native UISearchBar init();

    @Generated
    @Selector("initWithCoder:")
    public native UISearchBar initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithFrame:")
    public native UISearchBar initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("inputAccessoryView")
    public native UIView inputAccessoryView();

    @Generated
    @Selector("inputAssistantItem")
    public native UITextInputAssistantItem inputAssistantItem();

    @Generated
    @Selector("isSearchResultsButtonSelected")
    public native boolean isSearchResultsButtonSelected();

    @Generated
    @Selector("setSearchResultsButtonSelected:")
    public native void setSearchResultsButtonSelected(boolean value);

    @Generated
    @IsOptional
    @Selector("isSecureTextEntry")
    public native boolean isSecureTextEntry();

    @Generated
    @IsOptional
    @Selector("setSecureTextEntry:")
    public native void setSecureTextEntry(boolean value);

    @Generated
    @Selector("isTranslucent")
    public native boolean isTranslucent();

    @Generated
    @Selector("setTranslucent:")
    public native void setTranslucent(boolean value);

    @Generated
    @IsOptional
    @Selector("keyboardAppearance")
    @NInt
    public native long keyboardAppearance();

    @Generated
    @IsOptional
    @Selector("keyboardType")
    @NInt
    public native long keyboardType();

    @Generated
    @Selector("placeholder")
    public native String placeholder();

    @Generated
    @Selector("positionAdjustmentForSearchBarIcon:")
    @ByValue
    public native UIOffset positionAdjustmentForSearchBarIcon(@NInt long icon);

    @Generated
    @Selector("prompt")
    public native String prompt();

    @Generated
    @IsOptional
    @Selector("returnKeyType")
    @NInt
    public native long returnKeyType();

    @Generated
    @Selector("scopeBarBackgroundImage")
    public native UIImage scopeBarBackgroundImage();

    @Generated
    @Selector("scopeBarButtonBackgroundImageForState:")
    public native UIImage scopeBarButtonBackgroundImageForState(@NUInt long state);

    @Generated
    @Selector("scopeBarButtonDividerImageForLeftSegmentState:rightSegmentState:")
    public native UIImage scopeBarButtonDividerImageForLeftSegmentStateRightSegmentState(@NUInt long leftState,
            @NUInt long rightState);

    @Generated
    @Selector("scopeBarButtonTitleTextAttributesForState:")
    public native NSDictionary<String, ?> scopeBarButtonTitleTextAttributesForState(@NUInt long state);

    @Generated
    @Selector("scopeButtonTitles")
    public native NSArray<String> scopeButtonTitles();

    @Generated
    @Selector("searchBarStyle")
    @NUInt
    public native long searchBarStyle();

    @Generated
    @Selector("searchFieldBackgroundImageForState:")
    public native UIImage searchFieldBackgroundImageForState(@NUInt long state);

    @Generated
    @Selector("searchFieldBackgroundPositionAdjustment")
    @ByValue
    public native UIOffset searchFieldBackgroundPositionAdjustment();

    @Generated
    @Selector("searchTextPositionAdjustment")
    @ByValue
    public native UIOffset searchTextPositionAdjustment();

    @Generated
    @Selector("selectedScopeButtonIndex")
    @NInt
    public native long selectedScopeButtonIndex();

    @Generated
    @IsOptional
    @Selector("setAutocapitalizationType:")
    public native void setAutocapitalizationType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setAutocorrectionType:")
    public native void setAutocorrectionType(@NInt long value);

    @Generated
    @Selector("setBackgroundImage:")
    public native void setBackgroundImage(UIImage value);

    @Generated
    @Selector("setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImageForBarPositionBarMetrics(UIImage backgroundImage, @NInt long barPosition,
            @NInt long barMetrics);

    @Generated
    @Selector("setBarStyle:")
    public native void setBarStyle(@NInt long value);

    @Generated
    @Selector("setBarTintColor:")
    public native void setBarTintColor(UIColor value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UISearchBarDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UISearchBarDelegate value) {
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
    @IsOptional
    @Selector("setEnablesReturnKeyAutomatically:")
    public native void setEnablesReturnKeyAutomatically(boolean value);

    @Generated
    @Selector("setImage:forSearchBarIcon:state:")
    public native void setImageForSearchBarIconState(UIImage iconImage, @NInt long icon, @NUInt long state);

    @Generated
    @Selector("setInputAccessoryView:")
    public native void setInputAccessoryView(UIView value);

    @Generated
    @IsOptional
    @Selector("setKeyboardAppearance:")
    public native void setKeyboardAppearance(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setKeyboardType:")
    public native void setKeyboardType(@NInt long value);

    @Generated
    @Selector("setPlaceholder:")
    public native void setPlaceholder(String value);

    @Generated
    @Selector("setPositionAdjustment:forSearchBarIcon:")
    public native void setPositionAdjustmentForSearchBarIcon(@ByValue UIOffset adjustment, @NInt long icon);

    @Generated
    @Selector("setPrompt:")
    public native void setPrompt(String value);

    @Generated
    @IsOptional
    @Selector("setReturnKeyType:")
    public native void setReturnKeyType(@NInt long value);

    @Generated
    @Selector("setScopeBarBackgroundImage:")
    public native void setScopeBarBackgroundImage(UIImage value);

    @Generated
    @Selector("setScopeBarButtonBackgroundImage:forState:")
    public native void setScopeBarButtonBackgroundImageForState(UIImage backgroundImage, @NUInt long state);

    @Generated
    @Selector("setScopeBarButtonDividerImage:forLeftSegmentState:rightSegmentState:")
    public native void setScopeBarButtonDividerImageForLeftSegmentStateRightSegmentState(UIImage dividerImage,
            @NUInt long leftState, @NUInt long rightState);

    @Generated
    @Selector("setScopeBarButtonTitleTextAttributes:forState:")
    public native void setScopeBarButtonTitleTextAttributesForState(NSDictionary<String, ?> attributes,
            @NUInt long state);

    @Generated
    @Selector("setScopeButtonTitles:")
    public native void setScopeButtonTitles(NSArray<String> value);

    @Generated
    @Selector("setSearchBarStyle:")
    public native void setSearchBarStyle(@NUInt long value);

    @Generated
    @Selector("setSearchFieldBackgroundImage:forState:")
    public native void setSearchFieldBackgroundImageForState(UIImage backgroundImage, @NUInt long state);

    @Generated
    @Selector("setSearchFieldBackgroundPositionAdjustment:")
    public native void setSearchFieldBackgroundPositionAdjustment(@ByValue UIOffset value);

    @Generated
    @Selector("setSearchTextPositionAdjustment:")
    public native void setSearchTextPositionAdjustment(@ByValue UIOffset value);

    @Generated
    @Selector("setSelectedScopeButtonIndex:")
    public native void setSelectedScopeButtonIndex(@NInt long value);

    @Generated
    @Selector("setShowsBookmarkButton:")
    public native void setShowsBookmarkButton(boolean value);

    @Generated
    @Selector("setShowsCancelButton:")
    public native void setShowsCancelButton(boolean value);

    @Generated
    @Selector("setShowsCancelButton:animated:")
    public native void setShowsCancelButtonAnimated(boolean showsCancelButton, boolean animated);

    @Generated
    @Selector("setShowsScopeBar:")
    public native void setShowsScopeBar(boolean value);

    @Generated
    @Selector("setShowsSearchResultsButton:")
    public native void setShowsSearchResultsButton(boolean value);

    @Generated
    @IsOptional
    @Selector("setSpellCheckingType:")
    public native void setSpellCheckingType(@NInt long value);

    @Generated
    @Selector("setText:")
    public native void setText(String value);

    @Generated
    @IsOptional
    @Selector("setTextContentType:")
    public native void setTextContentType(String value);

    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    @Generated
    @Selector("showsBookmarkButton")
    public native boolean showsBookmarkButton();

    @Generated
    @Selector("showsCancelButton")
    public native boolean showsCancelButton();

    @Generated
    @Selector("showsScopeBar")
    public native boolean showsScopeBar();

    @Generated
    @Selector("showsSearchResultsButton")
    public native boolean showsSearchResultsButton();

    @Generated
    @IsOptional
    @Selector("spellCheckingType")
    @NInt
    public native long spellCheckingType();

    @Generated
    @Selector("text")
    public native String text();

    @Generated
    @IsOptional
    @Selector("textContentType")
    public native String textContentType();

    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();
}
