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


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.protocol.NSKeyedArchiverDelegate;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import ios.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSKeyedArchiver extends NSCoder {
	static {
		NatJ.register();
	}

	@Generated
	protected NSKeyedArchiver(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSKeyedArchiver alloc();

	/**
	 * archiveRootObject:toFile:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/clm/NSKeyedArchiver/archiveRootObject:toFile:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("archiveRootObject:toFile:")
	public static native boolean archiveRootObjectToFile(
			@Mapped(ObjCObjectMapper.class) Object rootObject, String path);

	/**
	 * archivedDataWithRootObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/clm/NSKeyedArchiver/archivedDataWithRootObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("archivedDataWithRootObject:")
	public static native NSData archivedDataWithRootObject(
			@Mapped(ObjCObjectMapper.class) Object rootObject);

	/**
	 * classNameForClass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/clm/NSKeyedArchiver/classNameForClass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("classNameForClass:")
	public static native String classNameForClass_static(Class cls);

	/**
	 * classNameForClass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/classNameForClass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("classNameForClass:")
	public native String classNameForClass(Class cls);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instp/NSKeyedArchiver/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native NSKeyedArchiverDelegate delegate();

	/**
	 * encodeBool:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeBool:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeBool:forKey:")
	public native void encodeBoolForKey(boolean boolv, String key);

	/**
	 * encodeBytes:length:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeBytes:length:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeBytes:length:forKey:")
	public native void encodeBytesLengthForKey(
			ConstBytePtr bytesp,
			@NUInt long lenv, String key);

	/**
	 * encodeConditionalObject:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeConditionalObject:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeConditionalObject:forKey:")
	public native void encodeConditionalObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object objv, String key);

	/**
	 * encodeDouble:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeDouble:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeDouble:forKey:")
	public native void encodeDoubleForKey(double realv, String key);

	/**
	 * encodeFloat:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeFloat:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeFloat:forKey:")
	public native void encodeFloatForKey(float realv, String key);

	/**
	 * encodeInt32:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeInt32:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeInt32:forKey:")
	public native void encodeInt32ForKey(int intv, String key);

	/**
	 * encodeInt64:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeInt64:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeInt64:forKey:")
	public native void encodeInt64ForKey(long intv, String key);

	/**
	 * encodeInt:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeInt:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeInt:forKey:")
	public native void encodeIntForKey(int intv, String key);

	/**
	 * encodeObject:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/encodeObject:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeObject:forKey:")
	public native void encodeObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object objv, String key);

	/**
	 * finishEncoding</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/finishEncoding">iOS Dev Center</a>
	 */
	@Generated
	@Selector("finishEncoding")
	public native void finishEncoding();

	@Generated
	@Selector("init")
	public native NSKeyedArchiver init();

	/**
	 * initForWritingWithMutableData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/initForWritingWithMutableData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initForWritingWithMutableData:")
	public native NSKeyedArchiver initForWritingWithMutableData(
			NSMutableData data);

	/**
	 * outputFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instp/NSKeyedArchiver/outputFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputFormat")
	@NUInt
	public native long outputFormat();

	/**
	 * setClassName:forClass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/clm/NSKeyedArchiver/setClassName:forClass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setClassName:forClass:")
	public static native void setClassNameForClass_static(String codedName,
			Class cls);

	/**
	 * setClassName:forClass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedArchiver/setClassName:forClass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setClassName:forClass:")
	public native void setClassNameForClass(String codedName, Class cls);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instp/NSKeyedArchiver/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) NSKeyedArchiverDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instp/NSKeyedArchiver/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) NSKeyedArchiverDelegate value) {
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
	 * outputFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedArchiver_Class/index.html#//apple_ref/occ/instp/NSKeyedArchiver/outputFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOutputFormat:")
	public native void setOutputFormat(@NUInt long value);

	@Generated
	@Selector("setRequiresSecureCoding:")
	public native void setRequiresSecureCoding(boolean value);

	@Generated
	@Selector("requiresSecureCoding")
	public native boolean requiresSecureCoding();

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
