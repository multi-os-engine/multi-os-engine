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
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCharacterSet extends NSObject implements NSCopying, NSMutableCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCharacterSet(Pointer peer) {
        super(peer);
    }

    /**
     * URLFragmentAllowedCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/URLFragmentAllowedCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLFragmentAllowedCharacterSet")
    public static native NSCharacterSet URLFragmentAllowedCharacterSet();

    /**
     * URLHostAllowedCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/URLHostAllowedCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLHostAllowedCharacterSet")
    public static native NSCharacterSet URLHostAllowedCharacterSet();

    /**
     * URLPasswordAllowedCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/URLPasswordAllowedCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLPasswordAllowedCharacterSet")
    public static native NSCharacterSet URLPasswordAllowedCharacterSet();

    /**
     * URLPathAllowedCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/URLPathAllowedCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLPathAllowedCharacterSet")
    public static native NSCharacterSet URLPathAllowedCharacterSet();

    /**
     * URLQueryAllowedCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/URLQueryAllowedCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLQueryAllowedCharacterSet")
    public static native NSCharacterSet URLQueryAllowedCharacterSet();

    /**
     * URLUserAllowedCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/URLUserAllowedCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLUserAllowedCharacterSet")
    public static native NSCharacterSet URLUserAllowedCharacterSet();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCharacterSet alloc();

    /**
     * alphanumericCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/alphanumericCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("alphanumericCharacterSet")
    public static native NSCharacterSet alphanumericCharacterSet();

    /**
     * bitmapRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/instp/NSCharacterSet/bitmapRepresentation">iOS Dev Center</a>
     */
    @Generated
    @Selector("bitmapRepresentation")
    public native NSData bitmapRepresentation();

    /**
     * capitalizedLetterCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/capitalizedLetterCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("capitalizedLetterCharacterSet")
    public static native NSCharacterSet capitalizedLetterCharacterSet();

    /**
     * characterIsMember:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/instm/NSCharacterSet/characterIsMember:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterIsMember:")
    public native boolean characterIsMember(char aCharacter);

    /**
     * characterSetWithBitmapRepresentation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/characterSetWithBitmapRepresentation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterSetWithBitmapRepresentation:")
    public static native NSCharacterSet characterSetWithBitmapRepresentation(NSData data);

    /**
     * characterSetWithCharactersInString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/characterSetWithCharactersInString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterSetWithCharactersInString:")
    public static native NSCharacterSet characterSetWithCharactersInString(String aString);

    /**
     * characterSetWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/characterSetWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterSetWithContentsOfFile:")
    public static native NSCharacterSet characterSetWithContentsOfFile(String fName);

    /**
     * characterSetWithRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/characterSetWithRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterSetWithRange:")
    public static native NSCharacterSet characterSetWithRange(@ByValue NSRange aRange);

    /**
     * controlCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/controlCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("controlCharacterSet")
    public static native NSCharacterSet controlCharacterSet();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * decimalDigitCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/decimalDigitCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("decimalDigitCharacterSet")
    public static native NSCharacterSet decimalDigitCharacterSet();

    /**
     * decomposableCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/decomposableCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("decomposableCharacterSet")
    public static native NSCharacterSet decomposableCharacterSet();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * hasMemberInPlane:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/instm/NSCharacterSet/hasMemberInPlane:">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasMemberInPlane:")
    public native boolean hasMemberInPlane(byte thePlane);

    /**
     * illegalCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/illegalCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("illegalCharacterSet")
    public static native NSCharacterSet illegalCharacterSet();

    @Generated
    @Selector("init")
    public native NSCharacterSet init();

    @Generated
    @Selector("initWithCoder:")
    public native NSCharacterSet initWithCoder(NSCoder aDecoder);

    /**
     * invertedSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/instp/NSCharacterSet/invertedSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("invertedSet")
    public native NSCharacterSet invertedSet();

    /**
     * isSupersetOfSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/instm/NSCharacterSet/isSupersetOfSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSupersetOfSet:")
    public native boolean isSupersetOfSet(NSCharacterSet theOtherSet);

    /**
     * letterCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/letterCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("letterCharacterSet")
    public static native NSCharacterSet letterCharacterSet();

    /**
     * longCharacterIsMember:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/instm/NSCharacterSet/longCharacterIsMember:">iOS Dev Center</a>
     */
    @Generated
    @Selector("longCharacterIsMember:")
    public native boolean longCharacterIsMember(int theLongChar);

    /**
     * lowercaseLetterCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/lowercaseLetterCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("lowercaseLetterCharacterSet")
    public static native NSCharacterSet lowercaseLetterCharacterSet();

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * newlineCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/newlineCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("newlineCharacterSet")
    public static native NSCharacterSet newlineCharacterSet();

    /**
     * nonBaseCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/nonBaseCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("nonBaseCharacterSet")
    public static native NSCharacterSet nonBaseCharacterSet();

    /**
     * punctuationCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/punctuationCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("punctuationCharacterSet")
    public static native NSCharacterSet punctuationCharacterSet();

    /**
     * symbolCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/symbolCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("symbolCharacterSet")
    public static native NSCharacterSet symbolCharacterSet();

    /**
     * uppercaseLetterCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/uppercaseLetterCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("uppercaseLetterCharacterSet")
    public static native NSCharacterSet uppercaseLetterCharacterSet();

    /**
     * whitespaceAndNewlineCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/whitespaceAndNewlineCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("whitespaceAndNewlineCharacterSet")
    public static native NSCharacterSet whitespaceAndNewlineCharacterSet();

    /**
     * whitespaceCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCharacterSet_Class/index.html#//apple_ref/occ/clm/NSCharacterSet/whitespaceCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("whitespaceCharacterSet")
    public static native NSCharacterSet whitespaceCharacterSet();

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
