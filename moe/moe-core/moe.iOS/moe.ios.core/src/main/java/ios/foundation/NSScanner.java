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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScanner extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScanner(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScanner alloc();

	/**
	 * caseSensitive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/caseSensitive">iOS Dev Center</a>
	 */
	@Generated
	@Selector("caseSensitive")
	public native boolean caseSensitive();

	/**
	 * charactersToBeSkipped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/charactersToBeSkipped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("charactersToBeSkipped")
	public native NSCharacterSet charactersToBeSkipped();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("init")
	public native NSScanner init();

	/**
	 * initWithString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/initWithString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithString:")
	public native NSScanner initWithString(String string);

	/**
	 * atEnd</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/atEnd">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAtEnd")
	public native boolean isAtEnd();

	/**
	 * locale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/locale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("locale")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object locale();

	/**
	 * localizedScannerWithString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/clm/NSScanner/localizedScannerWithString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedScannerWithString:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object localizedScannerWithString(String string);

	/**
	 * scanCharactersFromSet:intoString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanCharactersFromSet:intoString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanCharactersFromSet:intoString:")
	public native boolean scanCharactersFromSetIntoString(NSCharacterSet set,
			Ptr<NSString> result);

	/**
	 * scanDecimal:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanDecimal:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanDecimal:")
	public native boolean scanDecimal(VoidPtr dcm);

	/**
	 * scanDouble:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanDouble:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanDouble:")
	public native boolean scanDouble(DoublePtr result);

	/**
	 * scanFloat:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanFloat:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanFloat:")
	public native boolean scanFloat(FloatPtr result);

	/**
	 * scanHexDouble:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanHexDouble:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanHexDouble:")
	public native boolean scanHexDouble(DoublePtr result);

	/**
	 * scanHexFloat:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanHexFloat:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanHexFloat:")
	public native boolean scanHexFloat(FloatPtr result);

	/**
	 * scanHexInt:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanHexInt:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanHexInt:")
	public native boolean scanHexInt(IntPtr result);

	/**
	 * scanHexLongLong:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanHexLongLong:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanHexLongLong:")
	public native boolean scanHexLongLong(LongPtr result);

	/**
	 * scanInt:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanInt:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanInt:")
	public native boolean scanInt(IntPtr result);

	/**
	 * scanInteger:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanInteger:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanInteger:")
	public native boolean scanInteger(NIntPtr result);

	/**
	 * scanLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/scanLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanLocation")
	@NUInt
	public native long scanLocation();

	/**
	 * scanLongLong:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanLongLong:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanLongLong:")
	public native boolean scanLongLong(LongPtr result);

	/**
	 * scanString:intoString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanString:intoString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanString:intoString:")
	public native boolean scanStringIntoString(String string,
			Ptr<NSString> result);

	/**
	 * scanUnsignedLongLong:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanUnsignedLongLong:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanUnsignedLongLong:")
	public native boolean scanUnsignedLongLong(LongPtr result);

	/**
	 * scanUpToCharactersFromSet:intoString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanUpToCharactersFromSet:intoString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanUpToCharactersFromSet:intoString:")
	public native boolean scanUpToCharactersFromSetIntoString(
			NSCharacterSet set, Ptr<NSString> result);

	/**
	 * scanUpToString:intoString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instm/NSScanner/scanUpToString:intoString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scanUpToString:intoString:")
	public native boolean scanUpToStringIntoString(String string,
			Ptr<NSString> result);

	/**
	 * scannerWithString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/clm/NSScanner/scannerWithString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scannerWithString:")
	public static native NSScanner scannerWithString(String string);

	/**
	 * caseSensitive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/caseSensitive">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCaseSensitive:")
	public native void setCaseSensitive(boolean value);

	/**
	 * charactersToBeSkipped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/charactersToBeSkipped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCharactersToBeSkipped:")
	public native void setCharactersToBeSkipped(NSCharacterSet value);

	/**
	 * locale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/locale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLocale:")
	public native void setLocale(@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * scanLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/scanLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setScanLocation:")
	public native void setScanLocation(@NUInt long value);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSScanner_Class/index.html#//apple_ref/occ/instp/NSScanner/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("string")
	public native String string();

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
