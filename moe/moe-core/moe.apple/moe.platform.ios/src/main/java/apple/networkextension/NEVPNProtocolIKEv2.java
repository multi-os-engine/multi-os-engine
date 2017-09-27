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

package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEVPNProtocolIKEv2 alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("IKESecurityAssociationParameters")
    public native NEVPNIKEv2SecurityAssociationParameters IKESecurityAssociationParameters();

    @Generated
    @Selector("certificateType")
    @NInt
    public native long certificateType();

    @Generated
    @Selector("childSecurityAssociationParameters")
    public native NEVPNIKEv2SecurityAssociationParameters childSecurityAssociationParameters();

    @Generated
    @Selector("deadPeerDetectionRate")
    @NInt
    public native long deadPeerDetectionRate();

    @Generated
    @Selector("disableMOBIKE")
    public native boolean disableMOBIKE();

    @Generated
    @Selector("disableRedirect")
    public native boolean disableRedirect();

    @Generated
    @Selector("enablePFS")
    public native boolean enablePFS();

    @Generated
    @Selector("enableRevocationCheck")
    public native boolean enableRevocationCheck();

    @Generated
    @Selector("init")
    public native NEVPNProtocolIKEv2 init();

    @Generated
    @Selector("initWithCoder:")
    public native NEVPNProtocolIKEv2 initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("serverCertificateCommonName")
    public native String serverCertificateCommonName();

    @Generated
    @Selector("serverCertificateIssuerCommonName")
    public native String serverCertificateIssuerCommonName();

    @Generated
    @Selector("setCertificateType:")
    public native void setCertificateType(@NInt long value);

    @Generated
    @Selector("setDeadPeerDetectionRate:")
    public native void setDeadPeerDetectionRate(@NInt long value);

    @Generated
    @Selector("setDisableMOBIKE:")
    public native void setDisableMOBIKE(boolean value);

    @Generated
    @Selector("setDisableRedirect:")
    public native void setDisableRedirect(boolean value);

    @Generated
    @Selector("setEnablePFS:")
    public native void setEnablePFS(boolean value);

    @Generated
    @Selector("setEnableRevocationCheck:")
    public native void setEnableRevocationCheck(boolean value);

    @Generated
    @Selector("setServerCertificateCommonName:")
    public native void setServerCertificateCommonName(String value);

    @Generated
    @Selector("setServerCertificateIssuerCommonName:")
    public native void setServerCertificateIssuerCommonName(String value);

    @Generated
    @Selector("setStrictRevocationCheck:")
    public native void setStrictRevocationCheck(boolean value);

    @Generated
    @Selector("setUseConfigurationAttributeInternalIPSubnet:")
    public native void setUseConfigurationAttributeInternalIPSubnet(boolean value);

    @Generated
    @Selector("strictRevocationCheck")
    public native boolean strictRevocationCheck();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("useConfigurationAttributeInternalIPSubnet")
    public native boolean useConfigurationAttributeInternalIPSubnet();

    @Generated
    @Selector("maximumTLSVersion")
    @NInt
    public native long maximumTLSVersion();

    @Generated
    @Selector("minimumTLSVersion")
    @NInt
    public native long minimumTLSVersion();

    @Generated
    @Selector("setMaximumTLSVersion:")
    public native void setMaximumTLSVersion(@NInt long value);

    @Generated
    @Selector("setMinimumTLSVersion:")
    public native void setMinimumTLSVersion(@NInt long value);
}
