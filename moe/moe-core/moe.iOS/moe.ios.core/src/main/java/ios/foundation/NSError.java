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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSError extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSError(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSError alloc();

	/**
	 * code</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/code">iOS Dev Center</a>
	 */
	@Generated
	@Selector("code")
	@NInt
	public native long code();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * domain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/domain">iOS Dev Center</a>
	 */
	@Generated
	@Selector("domain")
	public native String domain();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * errorWithDomain:code:userInfo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/clm/NSError/errorWithDomain:code:userInfo:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("errorWithDomain:code:userInfo:")
	public static native NSError errorWithDomainCodeUserInfo(String domain,
			@NInt long code, NSDictionary<?, ?> dict);

	/**
	 * helpAnchor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/helpAnchor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("helpAnchor")
	public native String helpAnchor();

	@Generated
	@Selector("init")
	public native NSError init();

	@Generated
	@Selector("initWithCoder:")
	public native NSError initWithCoder(NSCoder aDecoder);

	/**
	 * initWithDomain:code:userInfo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instm/NSError/initWithDomain:code:userInfo:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithDomain:code:userInfo:")
	public native NSError initWithDomainCodeUserInfo(String domain,
			@NInt long code, NSDictionary<?, ?> dict);

	/**
	 * localizedDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/localizedDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedDescription")
	public native String localizedDescription();

	/**
	 * localizedFailureReason</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/localizedFailureReason">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedFailureReason")
	public native String localizedFailureReason();

	/**
	 * localizedRecoveryOptions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/localizedRecoveryOptions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedRecoveryOptions")
	public native NSArray<String> localizedRecoveryOptions();

	/**
	 * localizedRecoverySuggestion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/localizedRecoverySuggestion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedRecoverySuggestion")
	public native String localizedRecoverySuggestion();

	/**
	 * recoveryAttempter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/recoveryAttempter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recoveryAttempter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object recoveryAttempter();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * userInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSError_Class/index.html#//apple_ref/occ/instp/NSError/userInfo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("userInfo")
	public native NSDictionary<?, ?> userInfo();

	@Generated
	@Selector("setUserInfoValueProviderForDomain:provider:")
	public static native void setUserInfoValueProviderForDomainProvider(String errorDomain,
			@ObjCBlock(name = "call_setUserInfoValueProviderForDomainProvider") Block_setUserInfoValueProviderForDomainProvider provider);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setUserInfoValueProviderForDomainProvider {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		Object call_setUserInfoValueProviderForDomainProvider(NSError arg0, String arg1);
	}

	@Generated
	@Selector("userInfoValueProviderForDomain:")
	@ObjCBlock(name = "call_userInfoValueProviderForDomain_ret")
	public static native Block_userInfoValueProviderForDomain_ret userInfoValueProviderForDomain(String errorDomain);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_userInfoValueProviderForDomain_ret {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		Object call_userInfoValueProviderForDomain_ret(NSError arg0, String arg1);
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
