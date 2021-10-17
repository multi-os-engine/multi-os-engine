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

package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVTextStyleRule extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVTextStyleRule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVTextStyleRule alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVTextStyleRule allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Owned
    @Selector("new")
    public static native AVTextStyleRule new_objc();

    /**
     * propertyListForTextStyleRules:
     * <p>
     * Converts an NSArray of AVTextStyleRules into a serializable property list that can be used for persistent storage.
     * <p>
     * For serialization utilities, see NSPropertyList.h.
     *
     * @param            textStyleRules An array of AVTextStyleRules.
     * @return A serializable property list.
     */
    @Generated
    @Selector("propertyListForTextStyleRules:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyListForTextStyleRules(NSArray<? extends AVTextStyleRule> textStyleRules);

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

    /**
     * textStyleRuleWithTextMarkupAttributes:
     * <p>
     * Creates an instance of AVTextStyleRule with the specified text markup attributes.
     * <p>
     * Equivalent to invoking +textStyleRuleWithTextMarkupAttributes:textSelector: with a value of nil for textSelector.
     *
     * @param            textMarkupAttributes An NSDictionary with keys representing text style attributes that are specifiable in text markup. Eligible keys are defined in <CoreMedia/CMTextMarkup.h>.
     * @return An instance of AVTextStyleRule
     */
    @Generated
    @Selector("textStyleRuleWithTextMarkupAttributes:")
    public static native AVTextStyleRule textStyleRuleWithTextMarkupAttributes(
            NSDictionary<String, ?> textMarkupAttributes);

    /**
     * textStyleRuleWithTextMarkupAttributes:textSelector:
     * <p>
     * Creates an instance of AVTextStyleRule with the specified text markup attributes and an identifier for the range or ranges of text to which the attributes should be applied.
     *
     * @param            textMarkupAttributes An NSDictionary with keys representing text style attributes that are specifiable in text markup. Eligible keys are defined in <CoreMedia/CMTextMarkup.h>.
     * @param            textSelector An identifier for the range or ranges of text to which the attributes should be applied. Eligible identifiers are determined by the format and content of the legible media. A value of nil indicates that the textMarkupAttributes should be applied as default styles for all text unless overridden by content markup or other applicable text selectors.
     * @return An instance of AVTextStyleRule
     */
    @Generated
    @Selector("textStyleRuleWithTextMarkupAttributes:textSelector:")
    public static native AVTextStyleRule textStyleRuleWithTextMarkupAttributesTextSelector(
            NSDictionary<String, ?> textMarkupAttributes, String textSelector);

    /**
     * textStyleRulesFromPropertyList:
     * <p>
     * Converts a property list into an NSArray of AVTextStyleRules.
     *
     * @param            plist A property list, normally obtained previously via an invocation of +propertyListForTextStyleRules:.
     * @return An NSArray of AVTextStyleRules
     */
    @Generated
    @Selector("textStyleRulesFromPropertyList:")
    public static native NSArray<? extends AVTextStyleRule> textStyleRulesFromPropertyList(
            @Mapped(ObjCObjectMapper.class) Object plist);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native AVTextStyleRule init();

    /**
     * initWithTextMarkupAttributes:
     * <p>
     * Creates an instance of AVTextStyleRule with the specified text markup attributes.
     * <p>
     * Equivalent to invoking -initWithTextMarkupAttributes:textSelector: with a value of nil for textSelector.
     *
     * @param            textMarkupAttributes An NSDictionary with keys representing text style attributes that are specifiable in text markup. Eligible keys are defined in <CoreMedia/CMTextMarkup.h>.
     * @return An instance of AVTextStyleRule
     */
    @Generated
    @Selector("initWithTextMarkupAttributes:")
    public native AVTextStyleRule initWithTextMarkupAttributes(NSDictionary<String, ?> textMarkupAttributes);

    /**
     * initWithTextMarkupAttributes:textSelector:
     * <p>
     * Creates an instance of AVTextStyleRule with the specified text markup attributes and an identifier for the range or ranges of text to which the attributes should be applied.
     *
     * @param            textMarkupAttributes An NSDictionary with keys representing text style attributes that are specifiable in text markup. Eligible keys are defined in <CoreMedia/CMTextMarkup.h>.
     * @param            textSelector An identifier for the range or ranges of text to which the attributes should be applied. Eligible identifiers are determined by the format and content of the legible media. A value of nil indicates that the textMarkupAttributes should be applied as default styles for all text unless overridden by content markup or other applicable text selectors.
     * @return An instance of AVTextStyleRule
     */
    @Generated
    @Selector("initWithTextMarkupAttributes:textSelector:")
    public native AVTextStyleRule initWithTextMarkupAttributesTextSelector(NSDictionary<String, ?> textMarkupAttributes,
            String textSelector);

    /**
     * [@property]		textMarkupAttributes
     * <p>
     * An NSDictionary with keys representing text style attributes that are specifiable in text markup. Eligible keys and the expected types of their corresponding values are defined in <CoreMedia/CMTextMarkup.h>.
     */
    @Generated
    @Selector("textMarkupAttributes")
    public native NSDictionary<String, ?> textMarkupAttributes();

    /**
     * [@property]		textSelector
     * <p>
     * A string that identifies the range or ranges of text to which the attributes should be applied. A value of nil indicates that the textMarkupAttributes should be applied as default styles for all text unless overridden by content markup or other applicable text selectors.
     * [@dicussion]		The syntax of text selectors is determined by the format of the legible media. Eligible selectors may be determined by the content of the legible media (e.g. CSS selectors that are valid for a specific WebVTT document).
     */
    @Generated
    @Selector("textSelector")
    public native String textSelector();
}
