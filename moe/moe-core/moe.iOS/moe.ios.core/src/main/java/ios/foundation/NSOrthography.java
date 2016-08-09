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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOrthography extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOrthography(Pointer peer) {
		super(peer);
	}

	/**
	 * allLanguages</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/instp/NSOrthography/allLanguages">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allLanguages")
	public native NSArray<String> allLanguages();

	/**
	 * allScripts</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/instp/NSOrthography/allScripts">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allScripts")
	public native NSArray<String> allScripts();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOrthography alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * dominantLanguage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/instp/NSOrthography/dominantLanguage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dominantLanguage")
	public native String dominantLanguage();

	/**
	 * dominantLanguageForScript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/instm/NSOrthography/dominantLanguageForScript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dominantLanguageForScript:")
	public native String dominantLanguageForScript(String script);

	/**
	 * dominantScript</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/instp/NSOrthography/dominantScript">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dominantScript")
	public native String dominantScript();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSOrthography init();

	@Generated
	@Selector("initWithCoder:")
	public native NSOrthography initWithCoder(NSCoder aDecoder);

	/**
	 * initWithDominantScript:languageMap:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/instm/NSOrthography/initWithDominantScript:languageMap:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithDominantScript:languageMap:")
	public native NSOrthography initWithDominantScriptLanguageMap(
			String script, NSDictionary<String, ? extends NSArray<String>> map);

	/**
	 * languageMap</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/instp/NSOrthography/languageMap">iOS Dev Center</a>
	 */
	@Generated
	@Selector("languageMap")
	public native NSDictionary<String, ? extends NSArray<String>> languageMap();

	/**
	 * languagesForScript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/instm/NSOrthography/languagesForScript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("languagesForScript:")
	public native NSArray<String> languagesForScript(String script);

	/**
	 * orthographyWithDominantScript:languageMap:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOrthography_Class/index.html#//apple_ref/occ/clm/NSOrthography/orthographyWithDominantScript:languageMap:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orthographyWithDominantScript:languageMap:")
	public static native NSOrthography orthographyWithDominantScriptLanguageMap(
			String script, NSDictionary<String, ? extends NSArray<String>> map);

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
