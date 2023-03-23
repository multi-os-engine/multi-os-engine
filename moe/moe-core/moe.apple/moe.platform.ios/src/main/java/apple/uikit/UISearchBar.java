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
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIAppearanceContainer;
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
import apple.corefoundation.struct.CGRect;

/**
 * UISearchBar officially conformed to UITextInputTraits in iOS 8.0 and privately conformed in iOS 7.0. Prior to 7.0,
 * UISearchBar only implemented these four traits: autocapitalizationType, autocorrectionType, spellCheckingType and
 * keyboardType. If your deployment target is <7.0 and you are using any trait other than one of the four mentioned, you
 * must check its availability with respondsToSelector:
 * 
 * API-Since: 2.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISearchBar allocWithZone(VoidPtr zone);

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
    public static native UISearchBar appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UISearchBar appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UISearchBar appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UISearchBar appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UISearchBar appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UISearchBar appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Deprecated
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UISearchBar new_objc();

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
    public UISearchBar _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UISearchBar _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UISearchBar _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UISearchBar _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UISearchBar _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UISearchBar _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
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

    /**
     * 1pt wide images and resizable images will be scaled or tiled according to the resizable area, otherwise the image
     * will be tiled
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("backgroundImage")
    public native UIImage backgroundImage();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("backgroundImageForBarPosition:barMetrics:")
    public native UIImage backgroundImageForBarPositionBarMetrics(@NInt long barPosition, @NInt long barMetrics);

    @Generated
    @Selector("barPosition")
    @NInt
    public native long barPosition();

    /**
     * default is UIBarStyleDefault (blue)
     */
    @Generated
    @Selector("barStyle")
    @NInt
    public native long barStyle();

    /**
     * default is nil
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("barTintColor")
    public native UIColor barTintColor();

    /**
     * weak reference. default is nil
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISearchBarDelegate delegate();

    @Generated
    @IsOptional
    @Selector("enablesReturnKeyAutomatically")
    public native boolean enablesReturnKeyAutomatically();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("imageForSearchBarIcon:state:")
    public native UIImage imageForSearchBarIconState(@NInt long icon, @NUInt long state);

    @Generated
    @Selector("init")
    public native UISearchBar init();

    @Generated
    @Selector("initWithCoder:")
    public native UISearchBar initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UISearchBar initWithFrame(@ByValue CGRect frame);

    /**
     * Allow placement of an input accessory view to the keyboard for the search bar
     */
    @Generated
    @Selector("inputAccessoryView")
    public native UIView inputAccessoryView();

    /**
     * Use this method to modify the contents of the Unified Content Bar, shown on top of the keyboard when search is
     * engaged.
     * You may modify the returned inputAssistantItem to add to or replace the existing items on the bar.
     * Modifications made to the returned UITextInputAssistantItem are reflected automatically.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("inputAssistantItem")
    public native UITextInputAssistantItem inputAssistantItem();

    /**
     * default is NO
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("isSearchResultsButtonSelected")
    public native boolean isSearchResultsButtonSelected();

    /**
     * default is NO
     * 
     * API-Since: 3.2
     */
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

    /**
     * Default is NO on iOS 6 and earlier. Always YES if barStyle is set to UIBarStyleBlackTranslucent
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isTranslucent")
    public native boolean isTranslucent();

    /**
     * Default is NO on iOS 6 and earlier. Always YES if barStyle is set to UIBarStyleBlackTranslucent
     * 
     * API-Since: 3.0
     */
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

    /**
     * default is nil
     */
    @Generated
    @Selector("placeholder")
    public native String placeholder();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("positionAdjustmentForSearchBarIcon:")
    @ByValue
    public native UIOffset positionAdjustmentForSearchBarIcon(@NInt long icon);

    /**
     * default is nil
     */
    @Generated
    @Selector("prompt")
    public native String prompt();

    @Generated
    @IsOptional
    @Selector("returnKeyType")
    @NInt
    public native long returnKeyType();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("scopeBarBackgroundImage")
    public native UIImage scopeBarBackgroundImage();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("scopeBarButtonBackgroundImageForState:")
    public native UIImage scopeBarButtonBackgroundImageForState(@NUInt long state);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("scopeBarButtonDividerImageForLeftSegmentState:rightSegmentState:")
    public native UIImage scopeBarButtonDividerImageForLeftSegmentStateRightSegmentState(@NUInt long leftState,
            @NUInt long rightState);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("scopeBarButtonTitleTextAttributesForState:")
    public native NSDictionary<String, ?> scopeBarButtonTitleTextAttributesForState(@NUInt long state);

    /**
     * array of NSStrings. no scope bar shown unless 2 or more items
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("scopeButtonTitles")
    public native NSArray<String> scopeButtonTitles();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("searchBarStyle")
    @NUInt
    public native long searchBarStyle();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("searchFieldBackgroundImageForState:")
    public native UIImage searchFieldBackgroundImageForState(@NUInt long state);

    /**
     * To nudge the position of the search text field background in the search bar
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("searchFieldBackgroundPositionAdjustment")
    @ByValue
    public native UIOffset searchFieldBackgroundPositionAdjustment();

    /**
     * To nudge the position of the text within the search text field background
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("searchTextPositionAdjustment")
    @ByValue
    public native UIOffset searchTextPositionAdjustment();

    /**
     * index into array of scope button titles. default is 0. ignored if out of range
     * 
     * API-Since: 3.0
     */
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

    /**
     * 1pt wide images and resizable images will be scaled or tiled according to the resizable area, otherwise the image
     * will be tiled
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setBackgroundImage:")
    public native void setBackgroundImage(UIImage value);

    /**
     * Use UIBarMetricsDefaultPrompt to set a separate backgroundImage for a search bar with a prompt
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImageForBarPositionBarMetrics(UIImage backgroundImage, @NInt long barPosition,
            @NInt long barMetrics);

    /**
     * default is UIBarStyleDefault (blue)
     */
    @Generated
    @Selector("setBarStyle:")
    public native void setBarStyle(@NInt long value);

    /**
     * default is nil
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setBarTintColor:")
    public native void setBarTintColor(UIColor value);

    /**
     * weak reference. default is nil
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UISearchBarDelegate value);

    /**
     * weak reference. default is nil
     */
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

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setImage:forSearchBarIcon:state:")
    public native void setImageForSearchBarIconState(UIImage iconImage, @NInt long icon, @NUInt long state);

    /**
     * Allow placement of an input accessory view to the keyboard for the search bar
     */
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

    /**
     * default is nil
     */
    @Generated
    @Selector("setPlaceholder:")
    public native void setPlaceholder(String value);

    /**
     * To nudge the position of the icon within the search text field
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setPositionAdjustment:forSearchBarIcon:")
    public native void setPositionAdjustmentForSearchBarIcon(@ByValue UIOffset adjustment, @NInt long icon);

    /**
     * default is nil
     */
    @Generated
    @Selector("setPrompt:")
    public native void setPrompt(String value);

    @Generated
    @IsOptional
    @Selector("setReturnKeyType:")
    public native void setReturnKeyType(@NInt long value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setScopeBarBackgroundImage:")
    public native void setScopeBarBackgroundImage(UIImage value);

    /**
     * If backgroundImage is an image returned from -[UIImage resizableImageWithCapInsets:] the cap widths will be
     * calculated from the edge insets, otherwise, the cap width will be calculated by subtracting one from the image's
     * width then dividing by 2. The cap widths will also be used as the margins for text placement. To adjust the
     * margin use the margin adjustment methods.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setScopeBarButtonBackgroundImage:forState:")
    public native void setScopeBarButtonBackgroundImageForState(UIImage backgroundImage, @NUInt long state);

    /**
     * To customize the segmented control appearance you will need to provide divider images to go between two
     * unselected segments (leftSegmentState:UIControlStateNormal rightSegmentState:UIControlStateNormal), selected on
     * the left and unselected on the right (leftSegmentState:UIControlStateSelected
     * rightSegmentState:UIControlStateNormal), and unselected on the left and selected on the right
     * (leftSegmentState:UIControlStateNormal rightSegmentState:UIControlStateSelected).
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setScopeBarButtonDividerImage:forLeftSegmentState:rightSegmentState:")
    public native void setScopeBarButtonDividerImageForLeftSegmentStateRightSegmentState(UIImage dividerImage,
            @NUInt long leftState, @NUInt long rightState);

    /**
     * You may specify the font, text color, and shadow properties for the title in the text attributes dictionary,
     * using the keys found in NSAttributedString.h.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setScopeBarButtonTitleTextAttributes:forState:")
    public native void setScopeBarButtonTitleTextAttributesForState(NSDictionary<String, ?> attributes,
            @NUInt long state);

    /**
     * array of NSStrings. no scope bar shown unless 2 or more items
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setScopeButtonTitles:")
    public native void setScopeButtonTitles(NSArray<String> value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setSearchBarStyle:")
    public native void setSearchBarStyle(@NUInt long value);

    /**
     * The rounded-rect search text field image. Valid states are UIControlStateNormal and UIControlStateDisabled
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setSearchFieldBackgroundImage:forState:")
    public native void setSearchFieldBackgroundImageForState(UIImage backgroundImage, @NUInt long state);

    /**
     * To nudge the position of the search text field background in the search bar
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setSearchFieldBackgroundPositionAdjustment:")
    public native void setSearchFieldBackgroundPositionAdjustment(@ByValue UIOffset value);

    /**
     * To nudge the position of the text within the search text field background
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setSearchTextPositionAdjustment:")
    public native void setSearchTextPositionAdjustment(@ByValue UIOffset value);

    /**
     * index into array of scope button titles. default is 0. ignored if out of range
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setSelectedScopeButtonIndex:")
    public native void setSelectedScopeButtonIndex(@NInt long value);

    /**
     * default is NO
     */
    @Generated
    @Selector("setShowsBookmarkButton:")
    public native void setShowsBookmarkButton(boolean value);

    /**
     * default is NO
     */
    @Generated
    @Selector("setShowsCancelButton:")
    public native void setShowsCancelButton(boolean value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setShowsCancelButton:animated:")
    public native void setShowsCancelButtonAnimated(boolean showsCancelButton, boolean animated);

    /**
     * default is NO. if YES, shows the scope bar. call sizeToFit: to update frame
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setShowsScopeBar:")
    public native void setShowsScopeBar(boolean value);

    /**
     * default is NO
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("setShowsSearchResultsButton:")
    public native void setShowsSearchResultsButton(boolean value);

    @Generated
    @IsOptional
    @Selector("setSpellCheckingType:")
    public native void setSpellCheckingType(@NInt long value);

    /**
     * current/starting search text
     */
    @Generated
    @Selector("setText:")
    public native void setText(String value);

    @Generated
    @IsOptional
    @Selector("setTextContentType:")
    public native void setTextContentType(String value);

    /**
     * The behavior of tintColor for bars has changed on iOS 7.0. It no longer affects the bar's background
     * and behaves as described for the tintColor property added to UIView.
     * To tint the bar's background, please use -barTintColor.
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    /**
     * default is NO
     */
    @Generated
    @Selector("showsBookmarkButton")
    public native boolean showsBookmarkButton();

    /**
     * default is NO
     */
    @Generated
    @Selector("showsCancelButton")
    public native boolean showsCancelButton();

    /**
     * default is NO. if YES, shows the scope bar. call sizeToFit: to update frame
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("showsScopeBar")
    public native boolean showsScopeBar();

    /**
     * default is NO
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("showsSearchResultsButton")
    public native boolean showsSearchResultsButton();

    @Generated
    @IsOptional
    @Selector("spellCheckingType")
    @NInt
    public native long spellCheckingType();

    /**
     * current/starting search text
     */
    @Generated
    @Selector("text")
    public native String text();

    @Generated
    @IsOptional
    @Selector("textContentType")
    public native String textContentType();

    /**
     * The behavior of tintColor for bars has changed on iOS 7.0. It no longer affects the bar's background
     * and behaves as described for the tintColor property added to UIView.
     * To tint the bar's background, please use -barTintColor.
     */
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    @Generated
    @IsOptional
    @Selector("setSmartDashesType:")
    public native void setSmartDashesType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setSmartInsertDeleteType:")
    public native void setSmartInsertDeleteType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setSmartQuotesType:")
    public native void setSmartQuotesType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("smartDashesType")
    @NInt
    public native long smartDashesType();

    @Generated
    @IsOptional
    @Selector("smartInsertDeleteType")
    @NInt
    public native long smartInsertDeleteType();

    @Generated
    @IsOptional
    @Selector("smartQuotesType")
    @NInt
    public native long smartQuotesType();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Generated
    @IsOptional
    @Selector("passwordRules")
    public native UITextInputPasswordRules passwordRules();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("searchTextField")
    public native UISearchTextField searchTextField();

    @Generated
    @IsOptional
    @Selector("setPasswordRules:")
    public native void setPasswordRules(UITextInputPasswordRules value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setShowsScopeBar:animated:")
    public native void setShowsScopeBarAnimated(boolean show, boolean animate);
}
