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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSAttributedString;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UILabel extends UIView implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected UILabel(Pointer peer) {
		super(peer);
	}

	/**
	 * adjustsFontSizeToFitWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/adjustsFontSizeToFitWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("adjustsFontSizeToFitWidth")
	public native boolean adjustsFontSizeToFitWidth();

	/**
	 * adjustsLetterSpacingToFitWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/adjustsLetterSpacingToFitWidth">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("adjustsLetterSpacingToFitWidth")
	public native boolean adjustsLetterSpacingToFitWidth();

	@Generated
	@Owned
	@Selector("alloc")
	public static native UILabel alloc();

	/**
	 * attributedText</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/attributedText">iOS Dev Center</a>
	 */
	@Generated
	@Selector("attributedText")
	public native NSAttributedString attributedText();

	/**
	 * baselineAdjustment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/baselineAdjustment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("baselineAdjustment")
	@NInt
	public native long baselineAdjustment();

	/**
	 * drawTextInRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instm/UILabel/drawTextInRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawTextInRect:")
	public native void drawTextInRect(@ByValue CGRect rect);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * font</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/font">iOS Dev Center</a>
	 */
	@Generated
	@Selector("font")
	public native UIFont font();

	/**
	 * highlightedTextColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/highlightedTextColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("highlightedTextColor")
	public native UIColor highlightedTextColor();

	@Generated
	@Selector("init")
	public native UILabel init();

	@Generated
	@Selector("initWithCoder:")
	public native UILabel initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native UILabel initWithFrame(@ByValue CGRect frame);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	/**
	 * highlighted</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/highlighted">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isHighlighted")
	public native boolean isHighlighted();

	/**
	 * userInteractionEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/userInteractionEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isUserInteractionEnabled")
	public native boolean isUserInteractionEnabled();

	/**
	 * lineBreakMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/lineBreakMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineBreakMode")
	@NInt
	public native long lineBreakMode();

	/**
	 * minimumFontSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/minimumFontSize">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("minimumFontSize")
	@NFloat
	public native double minimumFontSize();

	/**
	 * minimumScaleFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/minimumScaleFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minimumScaleFactor")
	@NFloat
	public native double minimumScaleFactor();

	/**
	 * numberOfLines</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/numberOfLines">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfLines")
	@NInt
	public native long numberOfLines();

	/**
	 * preferredMaxLayoutWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/preferredMaxLayoutWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredMaxLayoutWidth")
	@NFloat
	public native double preferredMaxLayoutWidth();

	/**
	 * adjustsFontSizeToFitWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/adjustsFontSizeToFitWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAdjustsFontSizeToFitWidth:")
	public native void setAdjustsFontSizeToFitWidth(boolean value);

	/**
	 * adjustsLetterSpacingToFitWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/adjustsLetterSpacingToFitWidth">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setAdjustsLetterSpacingToFitWidth:")
	public native void setAdjustsLetterSpacingToFitWidth(boolean value);

	/**
	 * attributedText</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/attributedText">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAttributedText:")
	public native void setAttributedText(NSAttributedString value);

	/**
	 * baselineAdjustment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/baselineAdjustment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBaselineAdjustment:")
	public native void setBaselineAdjustment(@NInt long value);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean value);

	/**
	 * font</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/font">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFont:")
	public native void setFont(UIFont value);

	/**
	 * highlighted</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/highlighted">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHighlighted:")
	public native void setHighlighted(boolean value);

	/**
	 * highlightedTextColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/highlightedTextColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHighlightedTextColor:")
	public native void setHighlightedTextColor(UIColor value);

	/**
	 * lineBreakMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/lineBreakMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineBreakMode:")
	public native void setLineBreakMode(@NInt long value);

	/**
	 * minimumFontSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/minimumFontSize">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setMinimumFontSize:")
	public native void setMinimumFontSize(@NFloat double value);

	/**
	 * minimumScaleFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/minimumScaleFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinimumScaleFactor:")
	public native void setMinimumScaleFactor(@NFloat double value);

	/**
	 * numberOfLines</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/numberOfLines">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNumberOfLines:")
	public native void setNumberOfLines(@NInt long value);

	/**
	 * preferredMaxLayoutWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/preferredMaxLayoutWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredMaxLayoutWidth:")
	public native void setPreferredMaxLayoutWidth(@NFloat double value);

	/**
	 * shadowColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/shadowColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowColor:")
	public native void setShadowColor(UIColor value);

	/**
	 * shadowOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/shadowOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowOffset:")
	public native void setShadowOffset(@ByValue CGSize value);

	/**
	 * text</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/text">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setText:")
	public native void setText(String value);

	/**
	 * textAlignment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/textAlignment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTextAlignment:")
	public native void setTextAlignment(@NInt long value);

	/**
	 * textColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/textColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTextColor:")
	public native void setTextColor(UIColor value);

	/**
	 * userInteractionEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/userInteractionEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUserInteractionEnabled:")
	public native void setUserInteractionEnabled(boolean value);

	/**
	 * shadowColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/shadowColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowColor")
	public native UIColor shadowColor();

	/**
	 * shadowOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/shadowOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowOffset")
	@ByValue
	public native CGSize shadowOffset();

	/**
	 * text</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/text">iOS Dev Center</a>
	 */
	@Generated
	@Selector("text")
	public native String text();

	/**
	 * textAlignment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/textAlignment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textAlignment")
	@NInt
	public native long textAlignment();

	/**
	 * textColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/textColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textColor")
	public native UIColor textColor();

	/**
	 * textRectForBounds:limitedToNumberOfLines:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instm/UILabel/textRectForBounds:limitedToNumberOfLines:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textRectForBounds:limitedToNumberOfLines:")
	@ByValue
	public native CGRect textRectForBoundsLimitedToNumberOfLines(
			@ByValue CGRect bounds, @NInt long numberOfLines);

	/**
	 * allowsDefaultTighteningForTruncation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/allowsDefaultTighteningForTruncation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsDefaultTighteningForTruncation")
	public native boolean allowsDefaultTighteningForTruncation();

	/**
	 * allowsDefaultTighteningForTruncation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UILabel_Class/index.html#//apple_ref/occ/instp/UILabel/allowsDefaultTighteningForTruncation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsDefaultTighteningForTruncation:")
	public native void setAllowsDefaultTighteningForTruncation(boolean value);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
	public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(
			double frameStartTime,
			double frameDuration,
			@ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
	public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:animations:")
	public static native void animateWithDurationAnimations(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

	@Generated
	@Selector("animateWithDuration:animations:completion:")
	public static native void animateWithDurationAnimationsCompletion(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

	@Generated
	@Selector("animateWithDuration:delay:options:animations:completion:")
	public static native void animateWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
	public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NFloat double dampingRatio,
			@NFloat double velocity,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

	@Generated
	@Selector("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearance();

	@Generated
	@ProtocolClassMethod("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearance() {
		return appearance();
	}

	@Generated
	@Selector("appearanceForTraitCollection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollection(
			UITraitCollection trait);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollection")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollection(UITraitCollection trait) {
		return appearanceForTraitCollection(trait);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceForTraitCollection:whenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceForTraitCollectionWhenContainedIn(trait,
				ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes) {
		return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
				trait, containerTypes);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceWhenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceWhenContainedIn(ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceWhenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes) {
		return appearanceWhenContainedInInstancesOfClasses(containerTypes);
	}

	@Generated
	@Selector("areAnimationsEnabled")
	public static native boolean areAnimationsEnabled();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("beginAnimations:context:")
	public static native void beginAnimationsContext(String animationID,
			VoidPtr context);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
	public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(
			@NUInt long animation,
			NSArray<? extends UIView> views,
			@NUInt long options,
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
	public static native void setAnimationBeginsFromCurrentState(
			boolean fromCurrentState);

	@Generated
	@Selector("setAnimationCurve:")
	public static native void setAnimationCurve(@NInt long curve);

	@Generated
	@Selector("setAnimationDelay:")
	public static native void setAnimationDelay(double delay);

	@Generated
	@Selector("setAnimationDelegate:")
	public static native void setAnimationDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setAnimationDidStopSelector:")
	public static native void setAnimationDidStopSelector(SEL selector);

	@Generated
	@Selector("setAnimationDuration:")
	public static native void setAnimationDuration(double duration);

	@Generated
	@Selector("setAnimationRepeatAutoreverses:")
	public static native void setAnimationRepeatAutoreverses(
			boolean repeatAutoreverses);

	@Generated
	@Selector("setAnimationRepeatCount:")
	public static native void setAnimationRepeatCount(float repeatCount);

	@Generated
	@Selector("setAnimationStartDate:")
	public static native void setAnimationStartDate(NSDate startDate);

	@Generated
	@Selector("setAnimationTransition:forView:cache:")
	public static native void setAnimationTransitionForViewCache(
			@NInt long transition, UIView view, boolean cache);

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
	public static native void transitionFromViewToViewDurationOptionsCompletion(
			UIView fromView,
			UIView toView,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

	@Generated
	@Selector("transitionWithView:duration:options:animations:completion:")
	public static native void transitionWithViewDurationOptionsAnimationsCompletion(
			UIView view,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
	@NInt
	public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(
			@NInt long attribute);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
