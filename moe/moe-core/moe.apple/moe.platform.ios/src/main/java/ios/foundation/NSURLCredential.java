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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import ios.security.opaque.SecIdentityRef;
import ios.security.opaque.SecTrustRef;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLCredential extends NSObject implements NSSecureCoding,
		NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLCredential(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLCredential alloc();

	/**
	 * certificates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instp/NSURLCredential/certificates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("certificates")
	public native NSArray<?> certificates();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * credentialForTrust:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/clm/NSURLCredential/credentialForTrust:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("credentialForTrust:")
	public static native NSURLCredential credentialForTrust(SecTrustRef trust);

	/**
	 * credentialWithIdentity:certificates:persistence:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/clm/NSURLCredential/credentialWithIdentity:certificates:persistence:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("credentialWithIdentity:certificates:persistence:")
	public static native NSURLCredential credentialWithIdentityCertificatesPersistence(
			SecIdentityRef identity, NSArray<?> certArray, @NUInt long persistence);

	/**
	 * credentialWithUser:password:persistence:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/clm/NSURLCredential/credentialWithUser:password:persistence:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("credentialWithUser:password:persistence:")
	public static native NSURLCredential credentialWithUserPasswordPersistence(
			String user, String password, @NUInt long persistence);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * hasPassword</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instp/NSURLCredential/hasPassword">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasPassword")
	public native boolean hasPassword();

	/**
	 * identity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instp/NSURLCredential/identity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("identity")
	public native SecIdentityRef identity();

	@Generated
	@Selector("init")
	public native NSURLCredential init();

	@Generated
	@Selector("initWithCoder:")
	public native NSURLCredential initWithCoder(NSCoder aDecoder);

	/**
	 * initWithIdentity:certificates:persistence:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instm/NSURLCredential/initWithIdentity:certificates:persistence:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithIdentity:certificates:persistence:")
	public native NSURLCredential initWithIdentityCertificatesPersistence(
			SecIdentityRef identity, NSArray<?> certArray, @NUInt long persistence);

	/**
	 * initWithTrust:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instm/NSURLCredential/initWithTrust:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithTrust:")
	public native NSURLCredential initWithTrust(SecTrustRef trust);

	/**
	 * initWithUser:password:persistence:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instm/NSURLCredential/initWithUser:password:persistence:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithUser:password:persistence:")
	public native NSURLCredential initWithUserPasswordPersistence(String user,
			String password, @NUInt long persistence);

	/**
	 * password</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instp/NSURLCredential/password">iOS Dev Center</a>
	 */
	@Generated
	@Selector("password")
	public native String password();

	/**
	 * persistence</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instp/NSURLCredential/persistence">iOS Dev Center</a>
	 */
	@Generated
	@Selector("persistence")
	@NUInt
	public native long persistence();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * user</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLCredential_Class/index.html#//apple_ref/occ/instp/NSURLCredential/user">iOS Dev Center</a>
	 */
	@Generated
	@Selector("user")
	public native String user();

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
