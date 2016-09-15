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
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
public class NEVPNProtocol extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NEVPNProtocol(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEVPNProtocol alloc();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * disconnectOnSleep</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/disconnectOnSleep">iOS Dev Center</a>
     */
    @Generated
    @Selector("disconnectOnSleep")
    public native boolean disconnectOnSleep();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * identityData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/identityData">iOS Dev Center</a>
     */
    @Generated
    @Selector("identityData")
    public native NSData identityData();

    /**
     * identityDataPassword</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/identityDataPassword">iOS Dev Center</a>
     */
    @Generated
    @Selector("identityDataPassword")
    public native String identityDataPassword();

    @Generated
    @Selector("init")
    public native NEVPNProtocol init();

    @Generated
    @Selector("initWithCoder:")
    public native NEVPNProtocol initWithCoder(NSCoder aDecoder);

    /**
     * passwordReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/passwordReference">iOS Dev Center</a>
     */
    @Generated
    @Selector("passwordReference")
    public native NSData passwordReference();

    /**
     * serverAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/serverAddress">iOS Dev Center</a>
     */
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * disconnectOnSleep</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/disconnectOnSleep">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDisconnectOnSleep:")
    public native void setDisconnectOnSleep(boolean value);

    /**
     * identityData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/identityData">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdentityData:")
    public native void setIdentityData(NSData value);

    /**
     * identityDataPassword</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/identityDataPassword">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdentityDataPassword:")
    public native void setIdentityDataPassword(String value);

    /**
     * passwordReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/passwordReference">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPasswordReference:")
    public native void setPasswordReference(NSData value);

    /**
     * serverAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/serverAddress">iOS Dev Center</a>
     */
    @Generated
    @Selector("setServerAddress:")
    public native void setServerAddress(String value);

    /**
     * username</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/username">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsername:")
    public native void setUsername(String value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * username</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/username">iOS Dev Center</a>
     */
    @Generated
    @Selector("username")
    public native String username();

    /**
     * identityReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/identityReference">iOS Dev Center</a>
     */
    @Generated
    @Selector("identityReference")
    public native NSData identityReference();

    /**
     * proxySettings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/proxySettings">iOS Dev Center</a>
     */
    @Generated
    @Selector("proxySettings")
    public native NEProxySettings proxySettings();

    /**
     * identityReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/identityReference">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdentityReference:")
    public native void setIdentityReference(NSData value);

    /**
     * proxySettings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEVPNProtocolClassRef/index.html#//apple_ref/occ/instp/NEVPNProtocol/proxySettings">iOS Dev Center</a>
     */
    @Generated
    @Selector("setProxySettings:")
    public native void setProxySettings(NEProxySettings value);

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
    @Selector("initialize")
    public static native void initialize();

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
