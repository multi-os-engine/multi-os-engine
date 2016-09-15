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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRegularExpression extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSRegularExpression(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSRegularExpression alloc();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateMatchesInString:options:range:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/enumerateMatchesInString:options:range:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateMatchesInString:options:range:usingBlock:")
    public native void enumerateMatchesInStringOptionsRangeUsingBlock(String string, @NUInt long options,
            @ByValue NSRange range,
            @ObjCBlock(name = "call_enumerateMatchesInStringOptionsRangeUsingBlock") Block_enumerateMatchesInStringOptionsRangeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateMatchesInStringOptionsRangeUsingBlock {
        @Generated
        void call_enumerateMatchesInStringOptionsRangeUsingBlock(NSTextCheckingResult arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    /**
     * escapedPatternForString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/clm/NSRegularExpression/escapedPatternForString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("escapedPatternForString:")
    public static native String escapedPatternForString(String string);

    /**
     * escapedTemplateForString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/clm/NSRegularExpression/escapedTemplateForString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("escapedTemplateForString:")
    public static native String escapedTemplateForString(String string);

    /**
     * firstMatchInString:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/firstMatchInString:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("firstMatchInString:options:range:")
    public native NSTextCheckingResult firstMatchInStringOptionsRange(String string, @NUInt long options,
            @ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSRegularExpression init();

    @Generated
    @Selector("initWithCoder:")
    public native NSRegularExpression initWithCoder(NSCoder aDecoder);

    /**
     * initWithPattern:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/initWithPattern:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithPattern:options:error:")
    public native NSRegularExpression initWithPatternOptionsError(String pattern, @NUInt long options,
            Ptr<NSError> error);

    /**
     * matchesInString:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/matchesInString:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("matchesInString:options:range:")
    public native NSArray<? extends NSTextCheckingResult> matchesInStringOptionsRange(String string,
            @NUInt long options, @ByValue NSRange range);

    /**
     * numberOfCaptureGroups</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instp/NSRegularExpression/numberOfCaptureGroups">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfCaptureGroups")
    @NUInt
    public native long numberOfCaptureGroups();

    /**
     * numberOfMatchesInString:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/numberOfMatchesInString:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfMatchesInString:options:range:")
    @NUInt
    public native long numberOfMatchesInStringOptionsRange(String string, @NUInt long options, @ByValue NSRange range);

    /**
     * options</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instp/NSRegularExpression/options">iOS Dev Center</a>
     */
    @Generated
    @Selector("options")
    @NUInt
    public native long options();

    /**
     * pattern</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instp/NSRegularExpression/pattern">iOS Dev Center</a>
     */
    @Generated
    @Selector("pattern")
    public native String pattern();

    /**
     * rangeOfFirstMatchInString:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/rangeOfFirstMatchInString:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfFirstMatchInString:options:range:")
    @ByValue
    public native NSRange rangeOfFirstMatchInStringOptionsRange(String string, @NUInt long options,
            @ByValue NSRange range);

    /**
     * regularExpressionWithPattern:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/clm/NSRegularExpression/regularExpressionWithPattern:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("regularExpressionWithPattern:options:error:")
    public static native NSRegularExpression regularExpressionWithPatternOptionsError(String pattern,
            @NUInt long options, Ptr<NSError> error);

    /**
     * replaceMatchesInString:options:range:withTemplate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/replaceMatchesInString:options:range:withTemplate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceMatchesInString:options:range:withTemplate:")
    @NUInt
    public native long replaceMatchesInStringOptionsRangeWithTemplate(NSMutableString string, @NUInt long options,
            @ByValue NSRange range, String templ);

    /**
     * replacementStringForResult:inString:offset:template:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/replacementStringForResult:inString:offset:template:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replacementStringForResult:inString:offset:template:")
    public native String replacementStringForResultInStringOffsetTemplate(NSTextCheckingResult result, String string,
            @NInt long offset, String templ);

    /**
     * stringByReplacingMatchesInString:options:range:withTemplate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSRegularExpression_Class/index.html#//apple_ref/occ/instm/NSRegularExpression/stringByReplacingMatchesInString:options:range:withTemplate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByReplacingMatchesInString:options:range:withTemplate:")
    public native String stringByReplacingMatchesInStringOptionsRangeWithTemplate(String string, @NUInt long options,
            @ByValue NSRange range, String templ);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
