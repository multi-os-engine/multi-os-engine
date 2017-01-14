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
import org.moe.natj.general.ann.ReferenceInfo;
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSRegularExpression alloc();

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
    @Selector("escapedPatternForString:")
    public static native String escapedPatternForString(String string);

    @Generated
    @Selector("escapedTemplateForString:")
    public static native String escapedTemplateForString(String string);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("regularExpressionWithPattern:options:error:")
    public static native NSRegularExpression regularExpressionWithPatternOptionsError(String pattern,
            @NUInt long options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("enumerateMatchesInString:options:range:usingBlock:")
    public native void enumerateMatchesInStringOptionsRangeUsingBlock(String string, @NUInt long options,
            @ByValue NSRange range,
            @ObjCBlock(name = "call_enumerateMatchesInStringOptionsRangeUsingBlock") Block_enumerateMatchesInStringOptionsRangeUsingBlock block);

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

    @Generated
    @Selector("initWithPattern:options:error:")
    public native NSRegularExpression initWithPatternOptionsError(String pattern, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("matchesInString:options:range:")
    public native NSArray<? extends NSTextCheckingResult> matchesInStringOptionsRange(String string,
            @NUInt long options, @ByValue NSRange range);

    @Generated
    @Selector("numberOfCaptureGroups")
    @NUInt
    public native long numberOfCaptureGroups();

    @Generated
    @Selector("numberOfMatchesInString:options:range:")
    @NUInt
    public native long numberOfMatchesInStringOptionsRange(String string, @NUInt long options, @ByValue NSRange range);

    @Generated
    @Selector("options")
    @NUInt
    public native long options();

    @Generated
    @Selector("pattern")
    public native String pattern();

    @Generated
    @Selector("rangeOfFirstMatchInString:options:range:")
    @ByValue
    public native NSRange rangeOfFirstMatchInStringOptionsRange(String string, @NUInt long options,
            @ByValue NSRange range);

    @Generated
    @Selector("replaceMatchesInString:options:range:withTemplate:")
    @NUInt
    public native long replaceMatchesInStringOptionsRangeWithTemplate(NSMutableString string, @NUInt long options,
            @ByValue NSRange range, String templ);

    @Generated
    @Selector("replacementStringForResult:inString:offset:template:")
    public native String replacementStringForResultInStringOffsetTemplate(NSTextCheckingResult result, String string,
            @NInt long offset, String templ);

    @Generated
    @Selector("stringByReplacingMatchesInString:options:range:withTemplate:")
    public native String stringByReplacingMatchesInStringOptionsRangeWithTemplate(String string, @NUInt long options,
            @ByValue NSRange range, String templ);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateMatchesInStringOptionsRangeUsingBlock {
        @Generated
        void call_enumerateMatchesInStringOptionsRangeUsingBlock(NSTextCheckingResult arg0, @NUInt long arg1,
                BoolPtr arg2);
    }
}
