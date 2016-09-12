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

package ios.networkextension;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSData;
import ios.foundation.NSNumber;
import ios.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NWTLSParameters extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NWTLSParameters(Pointer peer) {
		super(peer);
	}

	/**
	 * SSLCipherSuites</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTLSParametersClassRef/index.html#//apple_ref/occ/instp/NWTLSParameters/SSLCipherSuites">iOS Dev Center</a>
	 */
	@Generated
	@Selector("SSLCipherSuites")
	public native NSSet<? extends NSNumber> SSLCipherSuites();

	/**
	 * TLSSessionID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTLSParametersClassRef/index.html#//apple_ref/occ/instp/NWTLSParameters/TLSSessionID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("TLSSessionID")
	public native NSData TLSSessionID();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NWTLSParameters alloc();

	@Generated
	@Selector("init")
	public native NWTLSParameters init();

	/**
	 * maximumSSLProtocolVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTLSParametersClassRef/index.html#//apple_ref/occ/instp/NWTLSParameters/maximumSSLProtocolVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumSSLProtocolVersion")
	@NUInt
	public native long maximumSSLProtocolVersion();

	/**
	 * minimumSSLProtocolVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTLSParametersClassRef/index.html#//apple_ref/occ/instp/NWTLSParameters/minimumSSLProtocolVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minimumSSLProtocolVersion")
	@NUInt
	public native long minimumSSLProtocolVersion();

	/**
	 * maximumSSLProtocolVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTLSParametersClassRef/index.html#//apple_ref/occ/instp/NWTLSParameters/maximumSSLProtocolVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumSSLProtocolVersion:")
	public native void setMaximumSSLProtocolVersion(@NUInt long value);

	/**
	 * minimumSSLProtocolVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTLSParametersClassRef/index.html#//apple_ref/occ/instp/NWTLSParameters/minimumSSLProtocolVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinimumSSLProtocolVersion:")
	public native void setMinimumSSLProtocolVersion(@NUInt long value);

	/**
	 * SSLCipherSuites</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTLSParametersClassRef/index.html#//apple_ref/occ/instp/NWTLSParameters/SSLCipherSuites">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSSLCipherSuites:")
	public native void setSSLCipherSuites(NSSet<? extends NSNumber> value);

	/**
	 * TLSSessionID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTLSParametersClassRef/index.html#//apple_ref/occ/instp/NWTLSParameters/TLSSessionID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTLSSessionID:")
	public native void setTLSSessionID(NSData value);

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
