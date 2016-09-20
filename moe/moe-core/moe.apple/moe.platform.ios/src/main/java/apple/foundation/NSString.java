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
import apple.cloudkit.protocol.CKRecordValue;
import apple.contacts.protocol.CNKeyDescriptor;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.uikit.NSStringDrawingContext;
import apple.uikit.UIFont;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.c.map.CStringMapper;
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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NUIntPtr;
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
public class NSString extends NSObject
        implements NSCopying, NSMutableCopying, NSSecureCoding, CKRecordValue, CNKeyDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected NSString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSString alloc();

    /**
     * availableStringEncodings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/availableStringEncodings">iOS Dev Center</a>
     */
    @Generated
    @Selector("availableStringEncodings")
    public static native ConstNUIntPtr availableStringEncodings();

    /**
     * defaultCStringEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/defaultCStringEncoding">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultCStringEncoding")
    @NUInt
    public static native long defaultCStringEncoding();

    /**
     * localizedNameOfStringEncoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/localizedNameOfStringEncoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedNameOfStringEncoding:")
    public static native String localizedNameOfStringEncoding(@NUInt long encoding);

    /**
     * localizedStringWithFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/localizedStringWithFormat:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("localizedStringWithFormat:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object localizedStringWithFormat(String format, Object... varargs);

    /**
     * pathWithComponents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/pathWithComponents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathWithComponents:")
    public static native String pathWithComponents(NSArray<String> components);

    /**
     * string</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/string">iOS Dev Center</a>
     */
    @Generated
    @Selector("string")
    public static native NSString string();

    /**
     * stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:")
    @NUInt
    public static native long stringEncodingForDataEncodingOptionsConvertedStringUsedLossyConversion(NSData data,
            NSDictionary<String, ?> opts, Ptr<NSString> string, BoolPtr usedLossyConversion);

    /**
     * stringWithCString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithCString:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("stringWithCString:")
    public static native NSString stringWithCString(ConstBytePtr bytes);

    /**
     * stringWithCString:encoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithCString:encoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithCString:encoding:")
    public static native NSString stringWithCStringEncoding(ConstBytePtr cString, @NUInt long enc);

    /**
     * stringWithCString:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithCString:length:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("stringWithCString:length:")
    public static native NSString stringWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    /**
     * stringWithCharacters:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithCharacters:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithCharacters:length:")
    public static native NSString stringWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    /**
     * stringWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("stringWithContentsOfFile:")
    public static native NSString stringWithContentsOfFile(String path);

    /**
     * stringWithContentsOfFile:encoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithContentsOfFile:encoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithContentsOfFile:encoding:error:")
    public static native NSString stringWithContentsOfFileEncodingError(String path, @NUInt long enc,
            Ptr<NSError> error);

    /**
     * stringWithContentsOfFile:usedEncoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithContentsOfFile:usedEncoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithContentsOfFile:usedEncoding:error:")
    public static native NSString stringWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
            Ptr<NSError> error);

    /**
     * stringWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("stringWithContentsOfURL:")
    public static native NSString stringWithContentsOfURL(NSURL url);

    /**
     * stringWithContentsOfURL:encoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithContentsOfURL:encoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithContentsOfURL:encoding:error:")
    public static native NSString stringWithContentsOfURLEncodingError(NSURL url, @NUInt long enc, Ptr<NSError> error);

    /**
     * stringWithContentsOfURL:usedEncoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithContentsOfURL:usedEncoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithContentsOfURL:usedEncoding:error:")
    public static native NSString stringWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc, Ptr<NSError> error);

    /**
     * stringWithFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithFormat:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("stringWithFormat:")
    public static native NSString stringWithFormat(String format, Object... varargs);

    /**
     * stringWithString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithString:")
    public static native NSString stringWithString(String string);

    /**
     * stringWithUTF8String:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/clm/NSString/stringWithUTF8String:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithUTF8String:")
    public static native NSString stringWithUTF8String(ConstBytePtr nullTerminatedCString);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
    public static native void load_objc();

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
    public static native long version();

    /**
     * UTF8String</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/UTF8String">iOS Dev Center</a>
     */
    @Generated
    @Selector("UTF8String")
    public native ConstBytePtr UTF8String();

    /**
     * boolValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/boolValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("boolValue")
    public native boolean boolValue();

    /**
     * boundingRectWithSize:options:attributes:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/boundingRectWithSize:options:attributes:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("boundingRectWithSize:options:attributes:context:")
    @ByValue
    public native CGRect boundingRectWithSizeOptionsAttributesContext(@ByValue CGSize size, @NInt long options,
            NSDictionary<String, ?> attributes, NSStringDrawingContext context);

    /**
     * cString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/cString">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("cString")
    public native ConstBytePtr cString();

    /**
     * cStringLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/cStringLength">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("cStringLength")
    @NUInt
    public native long cStringLength();

    /**
     * cStringUsingEncoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/cStringUsingEncoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cStringUsingEncoding:")
    public native ConstBytePtr cStringUsingEncoding(@NUInt long encoding);

    /**
     * canBeConvertedToEncoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/canBeConvertedToEncoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canBeConvertedToEncoding:")
    public native boolean canBeConvertedToEncoding(@NUInt long encoding);

    /**
     * capitalizedString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/capitalizedString">iOS Dev Center</a>
     */
    @Generated
    @Selector("capitalizedString")
    public native String capitalizedString();

    /**
     * capitalizedStringWithLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/capitalizedStringWithLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("capitalizedStringWithLocale:")
    public native String capitalizedStringWithLocale(NSLocale locale);

    /**
     * caseInsensitiveCompare:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/caseInsensitiveCompare:">iOS Dev Center</a>
     */
    @Generated
    @Selector("caseInsensitiveCompare:")
    @NInt
    public native long caseInsensitiveCompare(String string);

    /**
     * characterAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/characterAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterAtIndex:")
    public native char characterAtIndex(@NUInt long index);

    /**
     * commonPrefixWithString:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/commonPrefixWithString:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("commonPrefixWithString:options:")
    public native String commonPrefixWithStringOptions(String str, @NUInt long mask);

    /**
     * compare:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/compare:">iOS Dev Center</a>
     */
    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(String string);

    /**
     * compare:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/compare:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("compare:options:")
    @NInt
    public native long compareOptions(String string, @NUInt long mask);

    /**
     * compare:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/compare:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("compare:options:range:")
    @NInt
    public native long compareOptionsRange(String string, @NUInt long mask, @ByValue NSRange compareRange);

    /**
     * compare:options:range:locale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/compare:options:range:locale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("compare:options:range:locale:")
    @NInt
    public native long compareOptionsRangeLocale(String string, @NUInt long mask, @ByValue NSRange compareRange,
            @Mapped(ObjCObjectMapper.class) Object locale);

    /**
     * completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:")
    @NUInt
    public native long completePathIntoStringCaseSensitiveMatchesIntoArrayFilterTypes(Ptr<NSString> outputName,
            boolean flag, Ptr<NSArray<String>> outputArray, NSArray<String> filterTypes);

    /**
     * componentsSeparatedByCharactersInSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/componentsSeparatedByCharactersInSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentsSeparatedByCharactersInSet:")
    public native NSArray<String> componentsSeparatedByCharactersInSet(NSCharacterSet separator);

    /**
     * componentsSeparatedByString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/componentsSeparatedByString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentsSeparatedByString:")
    public native NSArray<String> componentsSeparatedByString(String separator);

    /**
     * containsString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/containsString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsString:")
    public native boolean containsString(String str);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * dataUsingEncoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/dataUsingEncoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataUsingEncoding:")
    public native NSData dataUsingEncoding(@NUInt long encoding);

    /**
     * dataUsingEncoding:allowLossyConversion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/dataUsingEncoding:allowLossyConversion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataUsingEncoding:allowLossyConversion:")
    public native NSData dataUsingEncodingAllowLossyConversion(@NUInt long encoding, boolean lossy);

    /**
     * decomposedStringWithCanonicalMapping</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/decomposedStringWithCanonicalMapping">iOS Dev Center</a>
     */
    @Generated
    @Selector("decomposedStringWithCanonicalMapping")
    public native String decomposedStringWithCanonicalMapping();

    /**
     * decomposedStringWithCompatibilityMapping</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/decomposedStringWithCompatibilityMapping">iOS Dev Center</a>
     */
    @Generated
    @Selector("decomposedStringWithCompatibilityMapping")
    public native String decomposedStringWithCompatibilityMapping();

    /**
     * description</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/description">iOS Dev Center</a>
     */
    @Generated
    @Selector("description")
    public native String description();

    /**
     * doubleValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/doubleValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("doubleValue")
    public native double doubleValue();

    /**
     * drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontFontSizeLineBreakModeBaselineAdjustment(@ByValue CGPoint point,
            @NFloat double width, UIFont font, @NFloat double fontSize, @NInt long lineBreakMode,
            @NInt long baselineAdjustment);

    /**
     * drawAtPoint:forWidth:withFont:lineBreakMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawAtPoint:forWidth:withFont:lineBreakMode:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:lineBreakMode:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontLineBreakMode(@ByValue CGPoint point, @NFloat double width,
            UIFont font, @NInt long lineBreakMode);

    /**
     * drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontMinFontSizeActualFontSizeLineBreakModeBaselineAdjustment(
            @ByValue CGPoint point, @NFloat double width, UIFont font, @NFloat double minFontSize,
            NFloatPtr actualFontSize, @NInt long lineBreakMode, @NInt long baselineAdjustment);

    /**
     * drawAtPoint:withAttributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawAtPoint:withAttributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawAtPoint:withAttributes:")
    public native void drawAtPointWithAttributes(@ByValue CGPoint point, NSDictionary<String, ?> attrs);

    /**
     * drawAtPoint:withFont:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawAtPoint:withFont:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("drawAtPoint:withFont:")
    @ByValue
    public native CGSize drawAtPointWithFont(@ByValue CGPoint point, UIFont font);

    /**
     * drawInRect:withAttributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawInRect:withAttributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawInRect:withAttributes:")
    public native void drawInRectWithAttributes(@ByValue CGRect rect, NSDictionary<String, ?> attrs);

    /**
     * drawInRect:withFont:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawInRect:withFont:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:")
    @ByValue
    public native CGSize drawInRectWithFont(@ByValue CGRect rect, UIFont font);

    /**
     * drawInRect:withFont:lineBreakMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawInRect:withFont:lineBreakMode:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:lineBreakMode:")
    @ByValue
    public native CGSize drawInRectWithFontLineBreakMode(@ByValue CGRect rect, UIFont font, @NInt long lineBreakMode);

    /**
     * drawInRect:withFont:lineBreakMode:alignment:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawInRect:withFont:lineBreakMode:alignment:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:lineBreakMode:alignment:")
    @ByValue
    public native CGSize drawInRectWithFontLineBreakModeAlignment(@ByValue CGRect rect, UIFont font,
            @NInt long lineBreakMode, @NInt long alignment);

    /**
     * drawWithRect:options:attributes:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/drawWithRect:options:attributes:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawWithRect:options:attributes:context:")
    public native void drawWithRectOptionsAttributesContext(@ByValue CGRect rect, @NInt long options,
            NSDictionary<String, ?> attributes, NSStringDrawingContext context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateLinesUsingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/enumerateLinesUsingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateLinesUsingBlock:")
    public native void enumerateLinesUsingBlock(
            @ObjCBlock(name = "call_enumerateLinesUsingBlock") Block_enumerateLinesUsingBlock block);

    /**
     * enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:")
    public native void enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock(@ByValue NSRange range,
            String tagScheme, @NUInt long opts, NSOrthography orthography,
            @ObjCBlock(name = "call_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock") Block_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock block);

    /**
     * enumerateSubstringsInRange:options:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/enumerateSubstringsInRange:options:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateSubstringsInRange:options:usingBlock:")
    public native void enumerateSubstringsInRangeOptionsUsingBlock(@ByValue NSRange range, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateSubstringsInRangeOptionsUsingBlock") Block_enumerateSubstringsInRangeOptionsUsingBlock block);

    /**
     * fastestEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/fastestEncoding">iOS Dev Center</a>
     */
    @Generated
    @Selector("fastestEncoding")
    @NUInt
    public native long fastestEncoding();

    /**
     * fileSystemRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/fileSystemRepresentation">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileSystemRepresentation")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentation();

    /**
     * floatValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/floatValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("floatValue")
    public native float floatValue();

    /**
     * getBytes:maxLength:usedLength:encoding:options:range:remainingRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getBytes:maxLength:usedLength:encoding:options:range:remainingRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getBytes:maxLength:usedLength:encoding:options:range:remainingRange:")
    public native boolean getBytesMaxLengthUsedLengthEncodingOptionsRangeRemainingRange(VoidPtr buffer,
            @NUInt long maxBufferCount, NUIntPtr usedBufferCount, @NUInt long encoding, @NUInt long options,
            @ByValue NSRange range, NSRange leftover);

    /**
     * getCString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getCString:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("getCString:")
    public native void getCString(BytePtr bytes);

    /**
     * getCString:maxLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getCString:maxLength:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("getCString:maxLength:")
    public native void getCStringMaxLength(BytePtr bytes, @NUInt long maxLength);

    /**
     * getCString:maxLength:encoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getCString:maxLength:encoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getCString:maxLength:encoding:")
    public native boolean getCStringMaxLengthEncoding(BytePtr buffer, @NUInt long maxBufferCount, @NUInt long encoding);

    /**
     * getCString:maxLength:range:remainingRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getCString:maxLength:range:remainingRange:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("getCString:maxLength:range:remainingRange:")
    public native void getCStringMaxLengthRangeRemainingRange(BytePtr bytes, @NUInt long maxLength,
            @ByValue NSRange aRange, NSRange leftoverRange);

    /**
     * getCharacters:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getCharacters:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getCharacters:")
    public native void getCharacters(CharPtr buffer);

    /**
     * getCharacters:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getCharacters:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getCharacters:range:")
    public native void getCharactersRange(CharPtr buffer, @ByValue NSRange range);

    /**
     * getFileSystemRepresentation:maxLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getFileSystemRepresentation:maxLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentationMaxLength(BytePtr cname, @NUInt long max);

    /**
     * getLineStart:end:contentsEnd:forRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getLineStart:end:contentsEnd:forRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getLineStart:end:contentsEnd:forRange:")
    public native void getLineStartEndContentsEndForRange(NUIntPtr startPtr, NUIntPtr lineEndPtr,
            NUIntPtr contentsEndPtr, @ByValue NSRange range);

    /**
     * getParagraphStart:end:contentsEnd:forRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/getParagraphStart:end:contentsEnd:forRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getParagraphStart:end:contentsEnd:forRange:")
    public native void getParagraphStartEndContentsEndForRange(NUIntPtr startPtr, NUIntPtr parEndPtr,
            NUIntPtr contentsEndPtr, @ByValue NSRange range);

    /**
     * hasPrefix:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/hasPrefix:">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasPrefix:")
    public native boolean hasPrefix(String str);

    /**
     * hasSuffix:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/hasSuffix:">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasSuffix:")
    public native boolean hasSuffix(String str);

    /**
     * hash</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/hash">iOS Dev Center</a>
     */
    @Generated
    @Selector("hash")
    @NUInt
    public native long hash();

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSString init();

    /**
     * initWithBytes:length:encoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithBytes:length:encoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBytes:length:encoding:")
    public native NSString initWithBytesLengthEncoding(ConstVoidPtr bytes, @NUInt long len, @NUInt long encoding);

    /**
     * initWithBytesNoCopy:length:encoding:freeWhenDone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithBytesNoCopy:length:encoding:freeWhenDone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
    public native NSString initWithBytesNoCopyLengthEncodingFreeWhenDone(VoidPtr bytes, @NUInt long len,
            @NUInt long encoding, boolean freeBuffer);

    /**
     * initWithCString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithCString:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("initWithCString:")
    public native NSString initWithCString(ConstBytePtr bytes);

    /**
     * initWithCString:encoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithCString:encoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCString:encoding:")
    public native NSString initWithCStringEncoding(ConstBytePtr nullTerminatedCString, @NUInt long encoding);

    /**
     * initWithCString:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithCString:length:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("initWithCString:length:")
    public native NSString initWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    /**
     * initWithCStringNoCopy:length:freeWhenDone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithCStringNoCopy:length:freeWhenDone:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("initWithCStringNoCopy:length:freeWhenDone:")
    public native NSString initWithCStringNoCopyLengthFreeWhenDone(BytePtr bytes, @NUInt long length,
            boolean freeBuffer);

    /**
     * initWithCharacters:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithCharacters:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCharacters:length:")
    public native NSString initWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    /**
     * initWithCharactersNoCopy:length:freeWhenDone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithCharactersNoCopy:length:freeWhenDone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCharactersNoCopy:length:freeWhenDone:")
    public native NSString initWithCharactersNoCopyLengthFreeWhenDone(CharPtr characters, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCoder:")
    public native NSString initWithCoder(NSCoder aDecoder);

    /**
     * initWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("initWithContentsOfFile:")
    public native NSString initWithContentsOfFile(String path);

    /**
     * initWithContentsOfFile:encoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithContentsOfFile:encoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfFile:encoding:error:")
    public native NSString initWithContentsOfFileEncodingError(String path, @NUInt long enc, Ptr<NSError> error);

    /**
     * initWithContentsOfFile:usedEncoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithContentsOfFile:usedEncoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfFile:usedEncoding:error:")
    public native NSString initWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc, Ptr<NSError> error);

    /**
     * initWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("initWithContentsOfURL:")
    public native NSString initWithContentsOfURL(NSURL url);

    /**
     * initWithContentsOfURL:encoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithContentsOfURL:encoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:encoding:error:")
    public native NSString initWithContentsOfURLEncodingError(NSURL url, @NUInt long enc, Ptr<NSError> error);

    /**
     * initWithContentsOfURL:usedEncoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithContentsOfURL:usedEncoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:usedEncoding:error:")
    public native NSString initWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc, Ptr<NSError> error);

    /**
     * initWithData:encoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithData:encoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithData:encoding:")
    public native NSString initWithDataEncoding(NSData data, @NUInt long encoding);

    /**
     * initWithFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithFormat:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("initWithFormat:")
    public native NSString initWithFormat(String format, Object... varargs);

    /**
     * initWithFormat:arguments:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithFormat:arguments:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFormat:arguments:")
    public native NSString initWithFormatArguments(String format, BytePtr argList);

    /**
     * initWithFormat:locale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithFormat:locale:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("initWithFormat:locale:")
    public native NSString initWithFormatLocale(String format, @Mapped(ObjCObjectMapper.class) Object locale,
            Object... varargs);

    /**
     * initWithFormat:locale:arguments:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithFormat:locale:arguments:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFormat:locale:arguments:")
    public native NSString initWithFormatLocaleArguments(String format, @Mapped(ObjCObjectMapper.class) Object locale,
            BytePtr argList);

    /**
     * initWithString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithString:")
    public native NSString initWithString(String aString);

    /**
     * initWithUTF8String:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/initWithUTF8String:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUTF8String:")
    public native NSString initWithUTF8String(ConstBytePtr nullTerminatedCString);

    /**
     * intValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/intValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("intValue")
    public native int intValue();

    /**
     * integerValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/integerValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("integerValue")
    @NInt
    public native long integerValue();

    /**
     * absolutePath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/absolutePath">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAbsolutePath")
    public native boolean isAbsolutePath();

    /**
     * isEqualToString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/isEqualToString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToString:")
    public native boolean isEqualToString(String aString);

    /**
     * lastPathComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/lastPathComponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("lastPathComponent")
    public native String lastPathComponent();

    /**
     * length</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/length">iOS Dev Center</a>
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    /**
     * lengthOfBytesUsingEncoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/lengthOfBytesUsingEncoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lengthOfBytesUsingEncoding:")
    @NUInt
    public native long lengthOfBytesUsingEncoding(@NUInt long enc);

    /**
     * lineRangeForRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/lineRangeForRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineRangeForRange:")
    @ByValue
    public native NSRange lineRangeForRange(@ByValue NSRange range);

    /**
     * linguisticTagsInRange:scheme:options:orthography:tokenRanges:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/linguisticTagsInRange:scheme:options:orthography:tokenRanges:">iOS Dev Center</a>
     */
    @Generated
    @Selector("linguisticTagsInRange:scheme:options:orthography:tokenRanges:")
    public native NSArray<String> linguisticTagsInRangeSchemeOptionsOrthographyTokenRanges(@ByValue NSRange range,
            String tagScheme, @NUInt long opts, NSOrthography orthography, Ptr<NSArray<? extends NSValue>> tokenRanges);

    /**
     * localizedCaseInsensitiveCompare:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/localizedCaseInsensitiveCompare:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedCaseInsensitiveCompare:")
    @NInt
    public native long localizedCaseInsensitiveCompare(String string);

    /**
     * localizedCaseInsensitiveContainsString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/localizedCaseInsensitiveContainsString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedCaseInsensitiveContainsString:")
    public native boolean localizedCaseInsensitiveContainsString(String str);

    /**
     * localizedCompare:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/localizedCompare:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedCompare:")
    @NInt
    public native long localizedCompare(String string);

    /**
     * localizedStandardCompare:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/localizedStandardCompare:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedStandardCompare:")
    @NInt
    public native long localizedStandardCompare(String string);

    /**
     * longLongValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/longLongValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("longLongValue")
    public native long longLongValue();

    /**
     * lossyCString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/lossyCString">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("lossyCString")
    public native ConstBytePtr lossyCString();

    /**
     * lowercaseString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/lowercaseString">iOS Dev Center</a>
     */
    @Generated
    @Selector("lowercaseString")
    public native String lowercaseString();

    /**
     * lowercaseStringWithLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/lowercaseStringWithLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lowercaseStringWithLocale:")
    public native String lowercaseStringWithLocale(NSLocale locale);

    /**
     * maximumLengthOfBytesUsingEncoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/maximumLengthOfBytesUsingEncoding:">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumLengthOfBytesUsingEncoding:")
    @NUInt
    public native long maximumLengthOfBytesUsingEncoding(@NUInt long enc);

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * paragraphRangeForRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/paragraphRangeForRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("paragraphRangeForRange:")
    @ByValue
    public native NSRange paragraphRangeForRange(@ByValue NSRange range);

    /**
     * pathComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/pathComponents">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathComponents")
    public native NSArray<String> pathComponents();

    /**
     * pathExtension</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/pathExtension">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathExtension")
    public native String pathExtension();

    /**
     * precomposedStringWithCanonicalMapping</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/precomposedStringWithCanonicalMapping">iOS Dev Center</a>
     */
    @Generated
    @Selector("precomposedStringWithCanonicalMapping")
    public native String precomposedStringWithCanonicalMapping();

    /**
     * precomposedStringWithCompatibilityMapping</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/precomposedStringWithCompatibilityMapping">iOS Dev Center</a>
     */
    @Generated
    @Selector("precomposedStringWithCompatibilityMapping")
    public native String precomposedStringWithCompatibilityMapping();

    /**
     * propertyList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/propertyList">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertyList")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyList();

    /**
     * propertyListFromStringsFileFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/propertyListFromStringsFileFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertyListFromStringsFileFormat")
    public native NSDictionary<?, ?> propertyListFromStringsFileFormat();

    /**
     * rangeOfCharacterFromSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfCharacterFromSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfCharacterFromSet:")
    @ByValue
    public native NSRange rangeOfCharacterFromSet(NSCharacterSet searchSet);

    /**
     * rangeOfCharacterFromSet:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfCharacterFromSet:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfCharacterFromSet:options:")
    @ByValue
    public native NSRange rangeOfCharacterFromSetOptions(NSCharacterSet searchSet, @NUInt long mask);

    /**
     * rangeOfCharacterFromSet:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfCharacterFromSet:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfCharacterFromSet:options:range:")
    @ByValue
    public native NSRange rangeOfCharacterFromSetOptionsRange(NSCharacterSet searchSet, @NUInt long mask,
            @ByValue NSRange searchRange);

    /**
     * rangeOfComposedCharacterSequenceAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfComposedCharacterSequenceAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfComposedCharacterSequenceAtIndex:")
    @ByValue
    public native NSRange rangeOfComposedCharacterSequenceAtIndex(@NUInt long index);

    /**
     * rangeOfComposedCharacterSequencesForRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfComposedCharacterSequencesForRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfComposedCharacterSequencesForRange:")
    @ByValue
    public native NSRange rangeOfComposedCharacterSequencesForRange(@ByValue NSRange range);

    /**
     * rangeOfString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfString:")
    @ByValue
    public native NSRange rangeOfString(String searchString);

    /**
     * rangeOfString:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfString:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfString:options:")
    @ByValue
    public native NSRange rangeOfStringOptions(String searchString, @NUInt long mask);

    /**
     * rangeOfString:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfString:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfString:options:range:")
    @ByValue
    public native NSRange rangeOfStringOptionsRange(String searchString, @NUInt long mask,
            @ByValue NSRange searchRange);

    /**
     * rangeOfString:options:range:locale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/rangeOfString:options:range:locale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfString:options:range:locale:")
    @ByValue
    public native NSRange rangeOfStringOptionsRangeLocale(String searchString, @NUInt long mask,
            @ByValue NSRange searchRange, NSLocale locale);

    /**
     * sizeWithAttributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/sizeWithAttributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sizeWithAttributes:")
    @ByValue
    public native CGSize sizeWithAttributes(NSDictionary<String, ?> attrs);

    /**
     * sizeWithFont:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/sizeWithFont:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:")
    @ByValue
    public native CGSize sizeWithFont(UIFont font);

    /**
     * sizeWithFont:constrainedToSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/sizeWithFont:constrainedToSize:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:constrainedToSize:")
    @ByValue
    public native CGSize sizeWithFontConstrainedToSize(UIFont font, @ByValue CGSize size);

    /**
     * sizeWithFont:constrainedToSize:lineBreakMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/sizeWithFont:constrainedToSize:lineBreakMode:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:constrainedToSize:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontConstrainedToSizeLineBreakMode(UIFont font, @ByValue CGSize size,
            @NInt long lineBreakMode);

    /**
     * sizeWithFont:forWidth:lineBreakMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/sizeWithFont:forWidth:lineBreakMode:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:forWidth:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontForWidthLineBreakMode(UIFont font, @NFloat double width, @NInt long lineBreakMode);

    /**
     * sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontMinFontSizeActualFontSizeForWidthLineBreakMode(UIFont font,
            @NFloat double minFontSize, NFloatPtr actualFontSize, @NFloat double width, @NInt long lineBreakMode);

    /**
     * smallestEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/smallestEncoding">iOS Dev Center</a>
     */
    @Generated
    @Selector("smallestEncoding")
    @NUInt
    public native long smallestEncoding();

    /**
     * stringByAbbreviatingWithTildeInPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/stringByAbbreviatingWithTildeInPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByAbbreviatingWithTildeInPath")
    public native String stringByAbbreviatingWithTildeInPath();

    /**
     * stringByAddingPercentEncodingWithAllowedCharacters:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByAddingPercentEncodingWithAllowedCharacters:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByAddingPercentEncodingWithAllowedCharacters:")
    public native String stringByAddingPercentEncodingWithAllowedCharacters(NSCharacterSet allowedCharacters);

    /**
     * stringByAddingPercentEscapesUsingEncoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByAddingPercentEscapesUsingEncoding:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("stringByAddingPercentEscapesUsingEncoding:")
    public native String stringByAddingPercentEscapesUsingEncoding(@NUInt long enc);

    /**
     * stringByAppendingFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByAppendingFormat:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("stringByAppendingFormat:")
    public native String stringByAppendingFormat(String format, Object... varargs);

    /**
     * stringByAppendingPathComponent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByAppendingPathComponent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByAppendingPathComponent:")
    public native String stringByAppendingPathComponent(String str);

    /**
     * stringByAppendingPathExtension:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByAppendingPathExtension:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByAppendingPathExtension:")
    public native String stringByAppendingPathExtension(String str);

    /**
     * stringByAppendingString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByAppendingString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByAppendingString:")
    public native String stringByAppendingString(String aString);

    /**
     * stringByDeletingLastPathComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/stringByDeletingLastPathComponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByDeletingLastPathComponent")
    public native String stringByDeletingLastPathComponent();

    /**
     * stringByDeletingPathExtension</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/stringByDeletingPathExtension">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByDeletingPathExtension")
    public native String stringByDeletingPathExtension();

    /**
     * stringByExpandingTildeInPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/stringByExpandingTildeInPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByExpandingTildeInPath")
    public native String stringByExpandingTildeInPath();

    /**
     * stringByFoldingWithOptions:locale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByFoldingWithOptions:locale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByFoldingWithOptions:locale:")
    public native String stringByFoldingWithOptionsLocale(@NUInt long options, NSLocale locale);

    /**
     * stringByPaddingToLength:withString:startingAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByPaddingToLength:withString:startingAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByPaddingToLength:withString:startingAtIndex:")
    public native String stringByPaddingToLengthWithStringStartingAtIndex(@NUInt long newLength, String padString,
            @NUInt long padIndex);

    @Generated
    @Selector("stringByRemovingPercentEncoding")
    public native String stringByRemovingPercentEncoding();

    /**
     * stringByReplacingCharactersInRange:withString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByReplacingCharactersInRange:withString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByReplacingCharactersInRange:withString:")
    public native String stringByReplacingCharactersInRangeWithString(@ByValue NSRange range, String replacement);

    /**
     * stringByReplacingOccurrencesOfString:withString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByReplacingOccurrencesOfString:withString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByReplacingOccurrencesOfString:withString:")
    public native String stringByReplacingOccurrencesOfStringWithString(String target, String replacement);

    /**
     * stringByReplacingOccurrencesOfString:withString:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByReplacingOccurrencesOfString:withString:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByReplacingOccurrencesOfString:withString:options:range:")
    public native String stringByReplacingOccurrencesOfStringWithStringOptionsRange(String target, String replacement,
            @NUInt long options, @ByValue NSRange searchRange);

    /**
     * stringByReplacingPercentEscapesUsingEncoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByReplacingPercentEscapesUsingEncoding:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("stringByReplacingPercentEscapesUsingEncoding:")
    public native String stringByReplacingPercentEscapesUsingEncoding(@NUInt long enc);

    /**
     * stringByResolvingSymlinksInPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/stringByResolvingSymlinksInPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByResolvingSymlinksInPath")
    public native String stringByResolvingSymlinksInPath();

    /**
     * stringByStandardizingPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/stringByStandardizingPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByStandardizingPath")
    public native String stringByStandardizingPath();

    /**
     * stringByTrimmingCharactersInSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringByTrimmingCharactersInSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringByTrimmingCharactersInSet:")
    public native String stringByTrimmingCharactersInSet(NSCharacterSet set);

    /**
     * stringsByAppendingPaths:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/stringsByAppendingPaths:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringsByAppendingPaths:")
    public native NSArray<String> stringsByAppendingPaths(NSArray<String> paths);

    /**
     * substringFromIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/substringFromIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("substringFromIndex:")
    public native String substringFromIndex(@NUInt long from);

    /**
     * substringToIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/substringToIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("substringToIndex:")
    public native String substringToIndex(@NUInt long to);

    /**
     * substringWithRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/substringWithRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("substringWithRange:")
    public native String substringWithRange(@ByValue NSRange range);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * uppercaseString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instp/NSString/uppercaseString">iOS Dev Center</a>
     */
    @Generated
    @Selector("uppercaseString")
    public native String uppercaseString();

    /**
     * uppercaseStringWithLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/uppercaseStringWithLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("uppercaseStringWithLocale:")
    public native String uppercaseStringWithLocale(NSLocale locale);

    /**
     * writeToFile:atomically:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/writeToFile:atomically:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    /**
     * writeToFile:atomically:encoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/writeToFile:atomically:encoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToFile:atomically:encoding:error:")
    public native boolean writeToFileAtomicallyEncodingError(String path, boolean useAuxiliaryFile, @NUInt long enc,
            Ptr<NSError> error);

    /**
     * writeToURL:atomically:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/writeToURL:atomically:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(NSURL url, boolean atomically);

    /**
     * writeToURL:atomically:encoding:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/writeToURL:atomically:encoding:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToURL:atomically:encoding:error:")
    public native boolean writeToURLAtomicallyEncodingError(NSURL url, boolean useAuxiliaryFile, @NUInt long enc,
            Ptr<NSError> error);

    @Generated
    @Selector("localizedCapitalizedString")
    public native String localizedCapitalizedString();

    @Generated
    @Selector("localizedLowercaseString")
    public native String localizedLowercaseString();

    /**
     * localizedStandardContainsString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/localizedStandardContainsString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedStandardContainsString:")
    public native boolean localizedStandardContainsString(String str);

    /**
     * localizedStandardRangeOfString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSString_Class/index.html#//apple_ref/occ/instm/NSString/localizedStandardRangeOfString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedStandardRangeOfString:")
    @ByValue
    public native NSRange localizedStandardRangeOfString(String str);

    @Generated
    @Selector("localizedUppercaseString")
    public native String localizedUppercaseString();

    @Generated
    @Selector("stringByApplyingTransform:reverse:")
    public native String stringByApplyingTransformReverse(String transform, boolean reverse);

    @Generated
    @Selector("variantFittingPresentationWidth:")
    public native String variantFittingPresentationWidth(@NInt long width);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateLinesUsingBlock {
        @Generated
        void call_enumerateLinesUsingBlock(String arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock {
        @Generated
        void call_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock(String arg0, @ByValue NSRange arg1,
                @ByValue NSRange arg2, BoolPtr arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateSubstringsInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateSubstringsInRangeOptionsUsingBlock(String arg0, @ByValue NSRange arg1, @ByValue NSRange arg2,
                BoolPtr arg3);
    }
}
