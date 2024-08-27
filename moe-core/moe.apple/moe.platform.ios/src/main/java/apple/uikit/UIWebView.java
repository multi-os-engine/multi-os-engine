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
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIScrollViewDelegate;
import apple.uikit.protocol.UIWebViewDelegate;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 * Deprecated-Since: 12.0
 * Deprecated-Message: No longer supported; please adopt WKWebView.
 */
@Deprecated
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIWebView extends UIView implements NSCoding, UIScrollViewDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected UIWebView(Pointer peer) {
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
    public static native UIWebView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIWebView allocWithZone(VoidPtr zone);

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
    public static native UIWebView appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIWebView appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIWebView appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIWebView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIWebView appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIWebView appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    public static native UIWebView new_objc();

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
     * iPhone Safari defaults to NO. iPad Safari defaults to YES
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("allowsInlineMediaPlayback")
    public native boolean allowsInlineMediaPlayback();

    /**
     * default is NO
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowsLinkPreview")
    public native boolean allowsLinkPreview();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowsPictureInPictureMediaPlayback")
    public native boolean allowsPictureInPictureMediaPlayback();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UIWebView _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIWebView _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIWebView _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIWebView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIWebView _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIWebView _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("canGoBack")
    public native boolean canGoBack();

    @Generated
    @Selector("canGoForward")
    public native boolean canGoForward();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("dataDetectorTypes")
    @NUInt
    public native long dataDetectorTypes();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIWebViewDelegate delegate();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     */
    @Generated
    @Deprecated
    @Selector("detectsPhoneNumbers")
    public native boolean detectsPhoneNumbers();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("gapBetweenPages")
    @NFloat
    public native double gapBetweenPages();

    @Generated
    @Selector("goBack")
    public native void goBack();

    @Generated
    @Selector("goForward")
    public native void goForward();

    @Generated
    @Selector("init")
    public native UIWebView init();

    @Generated
    @Selector("initWithCoder:")
    public native UIWebView initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UIWebView initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("isLoading")
    public native boolean isLoading();

    /**
     * default is YES
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("keyboardDisplayRequiresUserAction")
    public native boolean keyboardDisplayRequiresUserAction();

    @Generated
    @Selector("loadData:MIMEType:textEncodingName:baseURL:")
    public native void loadDataMIMETypeTextEncodingNameBaseURL(@NotNull NSData data, @NotNull String MIMEType,
            @NotNull String textEncodingName, @NotNull NSURL baseURL);

    @Generated
    @Selector("loadHTMLString:baseURL:")
    public native void loadHTMLStringBaseURL(@NotNull String string, @Nullable NSURL baseURL);

    @Generated
    @Selector("loadRequest:")
    public native void loadRequest(@NotNull NSURLRequest request);

    /**
     * iPhone and iPad Safari both default to YES
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("mediaPlaybackAllowsAirPlay")
    public native boolean mediaPlaybackAllowsAirPlay();

    /**
     * iPhone and iPad Safari both default to YES
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("mediaPlaybackRequiresUserAction")
    public native boolean mediaPlaybackRequiresUserAction();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("pageCount")
    @NUInt
    public native long pageCount();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("pageLength")
    @NFloat
    public native double pageLength();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("paginationBreakingMode")
    @NInt
    public native long paginationBreakingMode();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("paginationMode")
    @NInt
    public native long paginationMode();

    @Generated
    @Selector("reload")
    public native void reload();

    @Nullable
    @Generated
    @Selector("request")
    public native NSURLRequest request();

    @Generated
    @Selector("scalesPageToFit")
    public native boolean scalesPageToFit();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("scrollView")
    public native UIScrollView scrollView();

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDecelerating:")
    public native void scrollViewDidEndDecelerating(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDragging:willDecelerate:")
    public native void scrollViewDidEndDraggingWillDecelerate(@NotNull UIScrollView scrollView, boolean decelerate);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndScrollingAnimation:")
    public native void scrollViewDidEndScrollingAnimation(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndZooming:withView:atScale:")
    public native void scrollViewDidEndZoomingWithViewAtScale(@NotNull UIScrollView scrollView, @Nullable UIView view,
            @NFloat double scale);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScroll:")
    public native void scrollViewDidScroll(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScrollToTop:")
    public native void scrollViewDidScrollToTop(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidZoom:")
    public native void scrollViewDidZoom(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewShouldScrollToTop:")
    public native boolean scrollViewShouldScrollToTop(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDecelerating:")
    public native void scrollViewWillBeginDecelerating(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDragging:")
    public native void scrollViewWillBeginDragging(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginZooming:withView:")
    public native void scrollViewWillBeginZoomingWithView(@NotNull UIScrollView scrollView, @Nullable UIView view);

    @Generated
    @IsOptional
    @Selector("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void scrollViewWillEndDraggingWithVelocityTargetContentOffset(@NotNull UIScrollView scrollView,
            @ByValue CGPoint velocity, @NotNull CGPoint targetContentOffset);

    /**
     * iPhone Safari defaults to NO. iPad Safari defaults to YES
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setAllowsInlineMediaPlayback:")
    public native void setAllowsInlineMediaPlayback(boolean value);

    /**
     * default is NO
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowsLinkPreview:")
    public native void setAllowsLinkPreview(boolean value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowsPictureInPictureMediaPlayback:")
    public native void setAllowsPictureInPictureMediaPlayback(boolean value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setDataDetectorTypes:")
    public native void setDataDetectorTypes(@NUInt long value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UIWebViewDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UIWebViewDelegate value) {
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
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     */
    @Generated
    @Deprecated
    @Selector("setDetectsPhoneNumbers:")
    public native void setDetectsPhoneNumbers(boolean value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setGapBetweenPages:")
    public native void setGapBetweenPages(@NFloat double value);

    /**
     * default is YES
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setKeyboardDisplayRequiresUserAction:")
    public native void setKeyboardDisplayRequiresUserAction(boolean value);

    /**
     * iPhone and iPad Safari both default to YES
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setMediaPlaybackAllowsAirPlay:")
    public native void setMediaPlaybackAllowsAirPlay(boolean value);

    /**
     * iPhone and iPad Safari both default to YES
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setMediaPlaybackRequiresUserAction:")
    public native void setMediaPlaybackRequiresUserAction(boolean value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setPageLength:")
    public native void setPageLength(@NFloat double value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setPaginationBreakingMode:")
    public native void setPaginationBreakingMode(@NInt long value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setPaginationMode:")
    public native void setPaginationMode(@NInt long value);

    @Generated
    @Selector("setScalesPageToFit:")
    public native void setScalesPageToFit(boolean value);

    /**
     * iPhone and iPad Safari both default to NO
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setSuppressesIncrementalRendering:")
    public native void setSuppressesIncrementalRendering(boolean value);

    @Generated
    @Selector("stopLoading")
    public native void stopLoading();

    @Nullable
    @Generated
    @Selector("stringByEvaluatingJavaScriptFromString:")
    public native String stringByEvaluatingJavaScriptFromString(@NotNull String script);

    /**
     * iPhone and iPad Safari both default to NO
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("suppressesIncrementalRendering")
    public native boolean suppressesIncrementalRendering();

    @Nullable
    @Generated
    @IsOptional
    @Selector("viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidChangeAdjustedContentInset:")
    public native void scrollViewDidChangeAdjustedContentInset(@NotNull UIScrollView scrollView);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

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
