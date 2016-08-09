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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSCoder;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEVPNProtocolIKEv2 extends NEVPNProtocolIPSec {
	static {
		NatJ.register();
	}

	@Generated
	protected NEVPNProtocolIKEv2(Pointer peer) {
		super(peer);
	}

	/**
	 * IKESecurityAssociationParameters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/IKESecurityAssociationParameters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("IKESecurityAssociationParameters")
	public native NEVPNIKEv2SecurityAssociationParameters IKESecurityAssociationParameters();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NEVPNProtocolIKEv2 alloc();

	/**
	 * certificateType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/certificateType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("certificateType")
	@NInt
	public native long certificateType();

	/**
	 * childSecurityAssociationParameters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/childSecurityAssociationParameters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("childSecurityAssociationParameters")
	public native NEVPNIKEv2SecurityAssociationParameters childSecurityAssociationParameters();

	/**
	 * deadPeerDetectionRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/deadPeerDetectionRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deadPeerDetectionRate")
	@NInt
	public native long deadPeerDetectionRate();

	@Generated
	@Selector("init")
	public native NEVPNProtocolIKEv2 init();

	/**
	 * serverCertificateCommonName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/serverCertificateCommonName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("serverCertificateCommonName")
	public native String serverCertificateCommonName();

	/**
	 * serverCertificateIssuerCommonName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/serverCertificateIssuerCommonName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("serverCertificateIssuerCommonName")
	public native String serverCertificateIssuerCommonName();

	/**
	 * certificateType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/certificateType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCertificateType:")
	public native void setCertificateType(@NInt long value);

	/**
	 * deadPeerDetectionRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/deadPeerDetectionRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDeadPeerDetectionRate:")
	public native void setDeadPeerDetectionRate(@NInt long value);

	/**
	 * serverCertificateCommonName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/serverCertificateCommonName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setServerCertificateCommonName:")
	public native void setServerCertificateCommonName(String value);

	/**
	 * serverCertificateIssuerCommonName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/serverCertificateIssuerCommonName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setServerCertificateIssuerCommonName:")
	public native void setServerCertificateIssuerCommonName(String value);

	/**
	 * disableMOBIKE</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/disableMOBIKE">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disableMOBIKE")
	public native boolean disableMOBIKE();

	/**
	 * disableRedirect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/disableRedirect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disableRedirect")
	public native boolean disableRedirect();

	/**
	 * enablePFS</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/enablePFS">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enablePFS")
	public native boolean enablePFS();

	/**
	 * enableRevocationCheck</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/enableRevocationCheck">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enableRevocationCheck")
	public native boolean enableRevocationCheck();

	/**
	 * disableMOBIKE</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/disableMOBIKE">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDisableMOBIKE:")
	public native void setDisableMOBIKE(boolean value);

	/**
	 * disableRedirect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/disableRedirect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDisableRedirect:")
	public native void setDisableRedirect(boolean value);

	/**
	 * enablePFS</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/enablePFS">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnablePFS:")
	public native void setEnablePFS(boolean value);

	/**
	 * enableRevocationCheck</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/enableRevocationCheck">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnableRevocationCheck:")
	public native void setEnableRevocationCheck(boolean value);

	/**
	 * strictRevocationCheck</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/strictRevocationCheck">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStrictRevocationCheck:")
	public native void setStrictRevocationCheck(boolean value);

	/**
	 * useConfigurationAttributeInternalIPSubnet</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/useConfigurationAttributeInternalIPSubnet">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUseConfigurationAttributeInternalIPSubnet:")
	public native void setUseConfigurationAttributeInternalIPSubnet(boolean value);

	/**
	 * strictRevocationCheck</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/strictRevocationCheck">iOS Dev Center</a>
	 */
	@Generated
	@Selector("strictRevocationCheck")
	public native boolean strictRevocationCheck();

	/**
	 * useConfigurationAttributeInternalIPSubnet</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolIKEv2ClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocolIKEv2/useConfigurationAttributeInternalIPSubnet">iOS Dev Center</a>
	 */
	@Generated
	@Selector("useConfigurationAttributeInternalIPSubnet")
	public native boolean useConfigurationAttributeInternalIPSubnet();

	@Generated
	@Selector("initWithCoder:")
	public native NEVPNProtocolIKEv2 initWithCoder(NSCoder aDecoder);

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
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
