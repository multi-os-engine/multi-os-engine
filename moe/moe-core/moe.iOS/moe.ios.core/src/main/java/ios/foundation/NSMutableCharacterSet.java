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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSMutableCopying;
import ios.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableCharacterSet extends NSCharacterSet implements NSCopying,
		NSMutableCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableCharacterSet(Pointer peer) {
		super(peer);
	}

	/**
	 * addCharactersInRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableCharacterSet_Class/index.html#//apple_ref/occ/instm/NSMutableCharacterSet/addCharactersInRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addCharactersInRange:")
	public native void addCharactersInRange(@ByValue NSRange aRange);

	/**
	 * addCharactersInString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableCharacterSet_Class/index.html#//apple_ref/occ/instm/NSMutableCharacterSet/addCharactersInString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addCharactersInString:")
	public native void addCharactersInString(String aString);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableCharacterSet alloc();

	@Generated
	@Selector("alphanumericCharacterSet")
	public static native NSMutableCharacterSet alphanumericCharacterSet();

	@Generated
	@Selector("capitalizedLetterCharacterSet")
	public static native NSMutableCharacterSet capitalizedLetterCharacterSet();

	@Generated
	@Selector("characterSetWithBitmapRepresentation:")
	public static native NSMutableCharacterSet characterSetWithBitmapRepresentation(
			NSData data);

	@Generated
	@Selector("characterSetWithCharactersInString:")
	public static native NSMutableCharacterSet characterSetWithCharactersInString(
			String aString);

	@Generated
	@Selector("characterSetWithContentsOfFile:")
	public static native NSMutableCharacterSet characterSetWithContentsOfFile(
			String fName);

	@Generated
	@Selector("characterSetWithRange:")
	public static native NSMutableCharacterSet characterSetWithRange(
			@ByValue NSRange aRange);

	@Generated
	@Selector("controlCharacterSet")
	public static native NSMutableCharacterSet controlCharacterSet();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("decimalDigitCharacterSet")
	public static native NSMutableCharacterSet decimalDigitCharacterSet();

	@Generated
	@Selector("decomposableCharacterSet")
	public static native NSMutableCharacterSet decomposableCharacterSet();

	/**
	 * formIntersectionWithCharacterSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableCharacterSet_Class/index.html#//apple_ref/occ/instm/NSMutableCharacterSet/formIntersectionWithCharacterSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("formIntersectionWithCharacterSet:")
	public native void formIntersectionWithCharacterSet(NSCharacterSet otherSet);

	/**
	 * formUnionWithCharacterSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableCharacterSet_Class/index.html#//apple_ref/occ/instm/NSMutableCharacterSet/formUnionWithCharacterSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("formUnionWithCharacterSet:")
	public native void formUnionWithCharacterSet(NSCharacterSet otherSet);

	@Generated
	@Selector("illegalCharacterSet")
	public static native NSMutableCharacterSet illegalCharacterSet();

	@Generated
	@Selector("init")
	public native NSMutableCharacterSet init();

	@Generated
	@Selector("initWithCoder:")
	public native NSMutableCharacterSet initWithCoder(NSCoder aDecoder);

	/**
	 * invert</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableCharacterSet_Class/index.html#//apple_ref/occ/instm/NSMutableCharacterSet/invert">iOS Dev Center</a>
	 */
	@Generated
	@Selector("invert")
	public native void invert();

	@Generated
	@Selector("letterCharacterSet")
	public static native NSMutableCharacterSet letterCharacterSet();

	@Generated
	@Selector("lowercaseLetterCharacterSet")
	public static native NSMutableCharacterSet lowercaseLetterCharacterSet();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("newlineCharacterSet")
	public static native NSMutableCharacterSet newlineCharacterSet();

	@Generated
	@Selector("nonBaseCharacterSet")
	public static native NSMutableCharacterSet nonBaseCharacterSet();

	@Generated
	@Selector("punctuationCharacterSet")
	public static native NSMutableCharacterSet punctuationCharacterSet();

	/**
	 * removeCharactersInRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableCharacterSet_Class/index.html#//apple_ref/occ/instm/NSMutableCharacterSet/removeCharactersInRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeCharactersInRange:")
	public native void removeCharactersInRange(@ByValue NSRange aRange);

	/**
	 * removeCharactersInString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableCharacterSet_Class/index.html#//apple_ref/occ/instm/NSMutableCharacterSet/removeCharactersInString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeCharactersInString:")
	public native void removeCharactersInString(String aString);

	@Generated
	@Selector("symbolCharacterSet")
	public static native NSMutableCharacterSet symbolCharacterSet();

	@Generated
	@Selector("uppercaseLetterCharacterSet")
	public static native NSMutableCharacterSet uppercaseLetterCharacterSet();

	@Generated
	@Selector("whitespaceAndNewlineCharacterSet")
	public static native NSMutableCharacterSet whitespaceAndNewlineCharacterSet();

	@Generated
	@Selector("whitespaceCharacterSet")
	public static native NSMutableCharacterSet whitespaceCharacterSet();

	@Generated
	@Selector("URLFragmentAllowedCharacterSet")
	public static native NSCharacterSet URLFragmentAllowedCharacterSet();

	@Generated
	@Selector("URLHostAllowedCharacterSet")
	public static native NSCharacterSet URLHostAllowedCharacterSet();

	@Generated
	@Selector("URLPasswordAllowedCharacterSet")
	public static native NSCharacterSet URLPasswordAllowedCharacterSet();

	@Generated
	@Selector("URLPathAllowedCharacterSet")
	public static native NSCharacterSet URLPathAllowedCharacterSet();

	@Generated
	@Selector("URLQueryAllowedCharacterSet")
	public static native NSCharacterSet URLQueryAllowedCharacterSet();

	@Generated
	@Selector("URLUserAllowedCharacterSet")
	public static native NSCharacterSet URLUserAllowedCharacterSet();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
