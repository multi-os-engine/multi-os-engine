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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.security.opaque.SecTrustRef;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLProtectionSpace extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLProtectionSpace(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLProtectionSpace alloc();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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

    /**
     * authenticationMethod</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/authenticationMethod">iOS Dev Center</a>
     */
    @Generated
    @Selector("authenticationMethod")
    public native String authenticationMethod();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * distinguishedNames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/distinguishedNames">iOS Dev Center</a>
     */
    @Generated
    @Selector("distinguishedNames")
    public native NSArray<? extends NSData> distinguishedNames();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * host</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/host">iOS Dev Center</a>
     */
    @Generated
    @Selector("host")
    public native String host();

    @Generated
    @Selector("init")
    public native NSURLProtectionSpace init();

    @Generated
    @Selector("initWithCoder:")
    public native NSURLProtectionSpace initWithCoder(NSCoder aDecoder);

    /**
     * initWithHost:port:protocol:realm:authenticationMethod:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instm/NSURLProtectionSpace/initWithHost:port:protocol:realm:authenticationMethod:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithHost:port:protocol:realm:authenticationMethod:")
    public native NSURLProtectionSpace initWithHostPortProtocolRealmAuthenticationMethod(String host, @NInt long port,
            String protocol, String realm, String authenticationMethod);

    /**
     * initWithProxyHost:port:type:realm:authenticationMethod:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instm/NSURLProtectionSpace/initWithProxyHost:port:type:realm:authenticationMethod:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithProxyHost:port:type:realm:authenticationMethod:")
    public native NSURLProtectionSpace initWithProxyHostPortTypeRealmAuthenticationMethod(String host, @NInt long port,
            String type, String realm, String authenticationMethod);

    /**
     * isProxy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/isProxy">iOS Dev Center</a>
     */
    @Generated
    @Selector("isProxy")
    public native boolean isProxy();

    /**
     * port</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/port">iOS Dev Center</a>
     */
    @Generated
    @Selector("port")
    @NInt
    public native long port();

    /**
     * protocol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/protocol">iOS Dev Center</a>
     */
    @Generated
    @Selector("protocol")
    public native String protocol();

    /**
     * proxyType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/proxyType">iOS Dev Center</a>
     */
    @Generated
    @Selector("proxyType")
    public native String proxyType();

    /**
     * realm</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/realm">iOS Dev Center</a>
     */
    @Generated
    @Selector("realm")
    public native String realm();

    /**
     * receivesCredentialSecurely</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/receivesCredentialSecurely">iOS Dev Center</a>
     */
    @Generated
    @Selector("receivesCredentialSecurely")
    public native boolean receivesCredentialSecurely();

    /**
     * serverTrust</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtectionSpace_Class/index.html#//apple_ref/occ/instp/NSURLProtectionSpace/serverTrust">iOS Dev Center</a>
     */
    @Generated
    @Selector("serverTrust")
    public native SecTrustRef serverTrust();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
