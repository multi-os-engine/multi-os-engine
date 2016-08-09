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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSSecureCoding;
import ios.foundation.protocol.NSURLAuthenticationChallengeSender;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLAuthenticationChallenge extends NSObject implements
		NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLAuthenticationChallenge(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLAuthenticationChallenge alloc();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * error</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLAuthenticationChallenge_Class/index.html#//apple_ref/occ/instp/NSURLAuthenticationChallenge/error">iOS Dev Center</a>
	 */
	@Generated
	@Selector("error")
	public native NSError error();

	/**
	 * failureResponse</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLAuthenticationChallenge_Class/index.html#//apple_ref/occ/instp/NSURLAuthenticationChallenge/failureResponse">iOS Dev Center</a>
	 */
	@Generated
	@Selector("failureResponse")
	public native NSURLResponse failureResponse();

	@Generated
	@Selector("init")
	public native NSURLAuthenticationChallenge init();

	/**
	 * initWithAuthenticationChallenge:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLAuthenticationChallenge_Class/index.html#//apple_ref/occ/instm/NSURLAuthenticationChallenge/initWithAuthenticationChallenge:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithAuthenticationChallenge:sender:")
	public native NSURLAuthenticationChallenge initWithAuthenticationChallengeSender(
			NSURLAuthenticationChallenge challenge,
			@Mapped(ObjCObjectMapper.class) NSURLAuthenticationChallengeSender sender);

	@Generated
	@Selector("initWithCoder:")
	public native NSURLAuthenticationChallenge initWithCoder(NSCoder aDecoder);

	/**
	 * initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLAuthenticationChallenge_Class/index.html#//apple_ref/occ/instm/NSURLAuthenticationChallenge/initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:")
	public native NSURLAuthenticationChallenge initWithProtectionSpaceProposedCredentialPreviousFailureCountFailureResponseErrorSender(
			NSURLProtectionSpace space, NSURLCredential credential,
			@NInt long previousFailureCount, NSURLResponse response,
			NSError error, @Mapped(ObjCObjectMapper.class) NSURLAuthenticationChallengeSender sender);

	/**
	 * previousFailureCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLAuthenticationChallenge_Class/index.html#//apple_ref/occ/instp/NSURLAuthenticationChallenge/previousFailureCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("previousFailureCount")
	@NInt
	public native long previousFailureCount();

	/**
	 * proposedCredential</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLAuthenticationChallenge_Class/index.html#//apple_ref/occ/instp/NSURLAuthenticationChallenge/proposedCredential">iOS Dev Center</a>
	 */
	@Generated
	@Selector("proposedCredential")
	public native NSURLCredential proposedCredential();

	/**
	 * protectionSpace</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLAuthenticationChallenge_Class/index.html#//apple_ref/occ/instp/NSURLAuthenticationChallenge/protectionSpace">iOS Dev Center</a>
	 */
	@Generated
	@Selector("protectionSpace")
	public native NSURLProtectionSpace protectionSpace();

	/**
	 * sender</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLAuthenticationChallenge_Class/index.html#//apple_ref/occ/instp/NSURLAuthenticationChallenge/sender">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sender")
	@MappedReturn(ObjCObjectMapper.class)
	public native NSURLAuthenticationChallengeSender sender();

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
