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
import apple.foundation.NSDictionary;
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
public class NEFilterProviderConfiguration extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEFilterProviderConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEFilterProviderConfiguration alloc();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * filterBrowsers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/filterBrowsers">iOS Dev Center</a>
     */
    @Generated
    @Selector("filterBrowsers")
    public native boolean filterBrowsers();

    /**
     * filterSockets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/filterSockets">iOS Dev Center</a>
     */
    @Generated
    @Selector("filterSockets")
    public native boolean filterSockets();

    /**
     * identityReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/identityReference">iOS Dev Center</a>
     */
    @Generated
    @Selector("identityReference")
    public native NSData identityReference();

    @Generated
    @Selector("init")
    public native NEFilterProviderConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native NEFilterProviderConfiguration initWithCoder(NSCoder aDecoder);

    /**
     * organization</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/organization">iOS Dev Center</a>
     */
    @Generated
    @Selector("organization")
    public native String organization();

    /**
     * passwordReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/passwordReference">iOS Dev Center</a>
     */
    @Generated
    @Selector("passwordReference")
    public native NSData passwordReference();

    /**
     * serverAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/serverAddress">iOS Dev Center</a>
     */
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * filterBrowsers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/filterBrowsers">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFilterBrowsers:")
    public native void setFilterBrowsers(boolean value);

    /**
     * filterSockets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/filterSockets">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFilterSockets:")
    public native void setFilterSockets(boolean value);

    /**
     * identityReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/identityReference">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdentityReference:")
    public native void setIdentityReference(NSData value);

    /**
     * organization</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/organization">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOrganization:")
    public native void setOrganization(String value);

    /**
     * passwordReference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/passwordReference">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPasswordReference:")
    public native void setPasswordReference(NSData value);

    /**
     * serverAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/serverAddress">iOS Dev Center</a>
     */
    @Generated
    @Selector("setServerAddress:")
    public native void setServerAddress(String value);

    /**
     * username</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/username">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsername:")
    public native void setUsername(String value);

    /**
     * vendorConfiguration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/vendorConfiguration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVendorConfiguration:")
    public native void setVendorConfiguration(NSDictionary<String, ?> value);

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
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/username">iOS Dev Center</a>
     */
    @Generated
    @Selector("username")
    public native String username();

    /**
     * vendorConfiguration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterProviderConfigurationClassRef/index.html#//apple_ref/occ/instp/NEFilterProviderConfiguration/vendorConfiguration">iOS Dev Center</a>
     */
    @Generated
    @Selector("vendorConfiguration")
    public native NSDictionary<String, ?> vendorConfiguration();

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
