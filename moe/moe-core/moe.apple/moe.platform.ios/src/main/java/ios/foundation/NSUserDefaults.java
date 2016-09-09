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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserDefaults extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUserDefaults(Pointer peer) {
		super(peer);
	}

	/**
	 * URLForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/URLForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URLForKey:")
	public native NSURL URLForKey(String defaultName);

	/**
	 * addSuiteNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/addSuiteNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addSuiteNamed:")
	public native void addSuiteNamed(String suiteName);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUserDefaults alloc();

	/**
	 * arrayForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/arrayForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("arrayForKey:")
	public native NSArray<?> arrayForKey(String defaultName);

	/**
	 * boolForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/boolForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("boolForKey:")
	public native boolean boolForKey(String defaultName);

	/**
	 * dataForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/dataForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataForKey:")
	public native NSData dataForKey(String defaultName);

	/**
	 * dictionaryForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/dictionaryForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dictionaryForKey:")
	public native NSDictionary<String, ?> dictionaryForKey(String defaultName);

	/**
	 * dictionaryRepresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/dictionaryRepresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dictionaryRepresentation")
	public native NSDictionary<String, ?> dictionaryRepresentation();

	/**
	 * doubleForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/doubleForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("doubleForKey:")
	public native double doubleForKey(String defaultName);

	/**
	 * floatForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/floatForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatForKey:")
	public native float floatForKey(String defaultName);

	/**
	 * init</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/init">iOS Dev Center</a>
	 */
	@Generated
	@Selector("init")
	public native NSUserDefaults init();

	/**
	 * initWithSuiteName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/initWithSuiteName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithSuiteName:")
	public native NSUserDefaults initWithSuiteName(String suitename);

	/**
	 * initWithUser:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/initWithUser:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("initWithUser:")
	public native NSUserDefaults initWithUser(String username);

	/**
	 * integerForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/integerForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("integerForKey:")
	@NInt
	public native long integerForKey(String defaultName);

	/**
	 * objectForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/objectForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(String defaultName);

	/**
	 * objectIsForcedForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/objectIsForcedForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectIsForcedForKey:")
	public native boolean objectIsForcedForKey(String key);

	/**
	 * objectIsForcedForKey:inDomain:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/objectIsForcedForKey:inDomain:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectIsForcedForKey:inDomain:")
	public native boolean objectIsForcedForKeyInDomain(String key, String domain);

	/**
	 * persistentDomainForName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/persistentDomainForName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("persistentDomainForName:")
	public native NSDictionary<String, ?> persistentDomainForName(String domainName);

	/**
	 * persistentDomainNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/persistentDomainNames">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("persistentDomainNames")
	public native NSArray<?> persistentDomainNames();

	/**
	 * registerDefaults:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/registerDefaults:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("registerDefaults:")
	public native void registerDefaults(NSDictionary<String, ?> registrationDictionary);

	/**
	 * removeObjectForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/removeObjectForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObjectForKey:")
	public native void removeObjectForKey(String defaultName);

	/**
	 * removePersistentDomainForName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/removePersistentDomainForName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removePersistentDomainForName:")
	public native void removePersistentDomainForName(String domainName);

	/**
	 * removeSuiteNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/removeSuiteNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeSuiteNamed:")
	public native void removeSuiteNamed(String suiteName);

	/**
	 * removeVolatileDomainForName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/removeVolatileDomainForName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeVolatileDomainForName:")
	public native void removeVolatileDomainForName(String domainName);

	/**
	 * resetStandardUserDefaults</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/clm/NSUserDefaults/resetStandardUserDefaults">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resetStandardUserDefaults")
	public static native void resetStandardUserDefaults();

	/**
	 * setBool:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/setBool:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBool:forKey:")
	public native void setBoolForKey(boolean value, String defaultName);

	/**
	 * setDouble:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/setDouble:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDouble:forKey:")
	public native void setDoubleForKey(double value, String defaultName);

	/**
	 * setFloat:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/setFloat:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloat:forKey:")
	public native void setFloatForKey(float value, String defaultName);

	/**
	 * setInteger:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/setInteger:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInteger:forKey:")
	public native void setIntegerForKey(@NInt long value, String defaultName);

	/**
	 * setObject:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/setObject:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setObject:forKey:")
	public native void setObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String defaultName);

	/**
	 * setPersistentDomain:forName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/setPersistentDomain:forName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPersistentDomain:forName:")
	public native void setPersistentDomainForName(NSDictionary<String, ?> domain,
			String domainName);

	/**
	 * setURL:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/setURL:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURL:forKey:")
	public native void setURLForKey(NSURL url, String defaultName);

	/**
	 * setVolatileDomain:forName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/setVolatileDomain:forName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVolatileDomain:forName:")
	public native void setVolatileDomainForName(NSDictionary<String, ?> domain,
			String domainName);

	/**
	 * standardUserDefaults</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/clm/NSUserDefaults/standardUserDefaults">iOS Dev Center</a>
	 */
	@Generated
	@Selector("standardUserDefaults")
	public static native NSUserDefaults standardUserDefaults();

	/**
	 * stringArrayForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/stringArrayForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringArrayForKey:")
	public native NSArray<String> stringArrayForKey(String defaultName);

	/**
	 * stringForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/stringForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringForKey:")
	public native String stringForKey(String defaultName);

	/**
	 * synchronize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/synchronize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("synchronize")
	public native boolean synchronize();

	/**
	 * volatileDomainForName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instm/NSUserDefaults/volatileDomainForName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("volatileDomainForName:")
	public native NSDictionary<String, ?> volatileDomainForName(String domainName);

	/**
	 * volatileDomainNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUserDefaults_Class/index.html#//apple_ref/occ/instp/NSUserDefaults/volatileDomainNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("volatileDomainNames")
	public native NSArray<String> volatileDomainNames();

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
