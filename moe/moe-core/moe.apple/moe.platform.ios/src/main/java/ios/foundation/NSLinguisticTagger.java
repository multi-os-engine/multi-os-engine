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

package ios.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLinguisticTagger extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSLinguisticTagger(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSLinguisticTagger alloc();

	/**
	 * availableTagSchemesForLanguage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/clm/NSLinguisticTagger/availableTagSchemesForLanguage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableTagSchemesForLanguage:")
	public static native NSArray<String> availableTagSchemesForLanguage(String language);

	/**
	 * enumerateTagsInRange:scheme:options:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/enumerateTagsInRange:scheme:options:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateTagsInRange:scheme:options:usingBlock:")
	public native void enumerateTagsInRangeSchemeOptionsUsingBlock(
			@ByValue NSRange range,
			String tagScheme,
			@NUInt long opts,
			@ObjCBlock(name = "call_enumerateTagsInRangeSchemeOptionsUsingBlock") Block_enumerateTagsInRangeSchemeOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateTagsInRangeSchemeOptionsUsingBlock {
		@Generated
		void call_enumerateTagsInRangeSchemeOptionsUsingBlock(
				String arg0, @ByValue NSRange arg1, @ByValue NSRange arg2,
				BoolPtr arg3);
	}

	@Generated
	@Selector("init")
	public native NSLinguisticTagger init();

	/**
	 * initWithTagSchemes:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/initWithTagSchemes:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithTagSchemes:options:")
	public native NSLinguisticTagger initWithTagSchemesOptions(
			NSArray<String> tagSchemes, @NUInt long opts);

	/**
	 * orthographyAtIndex:effectiveRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/orthographyAtIndex:effectiveRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orthographyAtIndex:effectiveRange:")
	public native NSOrthography orthographyAtIndexEffectiveRange(
			@NUInt long charIndex,
			NSRange effectiveRange);

	/**
	 * possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:")
	public native NSArray<String> possibleTagsAtIndexSchemeTokenRangeSentenceRangeScores(
			@NUInt long charIndex,
			String tagScheme,
			NSRange tokenRange,
			NSRange sentenceRange,
			Ptr<NSArray<? extends NSValue>> scores);

	/**
	 * sentenceRangeForRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/sentenceRangeForRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sentenceRangeForRange:")
	@ByValue
	public native NSRange sentenceRangeForRange(@ByValue NSRange range);

	/**
	 * setOrthography:range:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/setOrthography:range:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOrthography:range:")
	public native void setOrthographyRange(NSOrthography orthography,
			@ByValue NSRange range);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instp/NSLinguisticTagger/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setString:")
	public native void setString(String value);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instp/NSLinguisticTagger/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("string")
	public native String string();

	/**
	 * stringEditedInRange:changeInLength:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/stringEditedInRange:changeInLength:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringEditedInRange:changeInLength:")
	public native void stringEditedInRangeChangeInLength(
			@ByValue NSRange newRange, @NInt long delta);

	/**
	 * tagAtIndex:scheme:tokenRange:sentenceRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/tagAtIndex:scheme:tokenRange:sentenceRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tagAtIndex:scheme:tokenRange:sentenceRange:")
	public native String tagAtIndexSchemeTokenRangeSentenceRange(
			@NUInt long charIndex,
			String tagScheme,
			NSRange tokenRange,
			NSRange sentenceRange);

	/**
	 * tagSchemes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instp/NSLinguisticTagger/tagSchemes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tagSchemes")
	public native NSArray<String> tagSchemes();

	/**
	 * tagsInRange:scheme:options:tokenRanges:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLinguisticTagger_Class/index.html#//apple_ref/occ/instm/NSLinguisticTagger/tagsInRange:scheme:options:tokenRanges:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tagsInRange:scheme:options:tokenRanges:")
	public native NSArray<String> tagsInRangeSchemeOptionsTokenRanges(
			@ByValue NSRange range, String tagScheme, @NUInt long opts,
			Ptr<NSArray<? extends NSValue>> tokenRanges);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

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
	@Selector("load")
	public static native void load_objc_static();

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

	@Generated
	@Selector("setVersion:")
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
