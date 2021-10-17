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

/**
 * [@interface] NEFilterProviderConfiguration
 * <p>
 * The NEFilterProviderConfiguration class declares the programmatic interface of an object that configures a plugin-based content filter.
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEFilterProviderConfiguration alloc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] filterBrowsers
     * <p>
     * If YES, the filter plugin will be allowed to filter browser traffic. If NO, the filter plugin will not see any browser flows. Defaults to NO. At least one of filterBrowsers and filterSockets should be set to YES to make the filter take effect.
     */
    @Generated
    @Selector("filterBrowsers")
    public native boolean filterBrowsers();

    /**
     * [@property] filterSockets
     * <p>
     * If YES, the filter plugin will be allowed to filter socket traffic. If NO, the filter plugin will not see any socket flows. Defaults to NO. At least one of filterBrowsers and filterSockets should be set to YES to make the filter take effect.
     */
    @Generated
    @Selector("filterSockets")
    public native boolean filterSockets();

    /**
     * [@property] identityReference
     * <p>
     * The optional certificate identity keychain reference associated with the filter.
     */
    @Generated
    @Selector("identityReference")
    public native NSData identityReference();

    @Generated
    @Selector("init")
    public native NEFilterProviderConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native NEFilterProviderConfiguration initWithCoder(NSCoder coder);

    /**
     * [@property] organization
     * <p>
     * The optional organization associated with the filter.
     */
    @Generated
    @Selector("organization")
    public native String organization();

    /**
     * [@property] passwordReference
     * <p>
     * The optional password keychain reference associated with the filter.
     */
    @Generated
    @Selector("passwordReference")
    public native NSData passwordReference();

    /**
     * [@property] serverAddress
     * <p>
     * The optional address of the server used to support the filter.
     */
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * [@property] filterBrowsers
     * <p>
     * If YES, the filter plugin will be allowed to filter browser traffic. If NO, the filter plugin will not see any browser flows. Defaults to NO. At least one of filterBrowsers and filterSockets should be set to YES to make the filter take effect.
     */
    @Generated
    @Selector("setFilterBrowsers:")
    public native void setFilterBrowsers(boolean value);

    /**
     * [@property] filterSockets
     * <p>
     * If YES, the filter plugin will be allowed to filter socket traffic. If NO, the filter plugin will not see any socket flows. Defaults to NO. At least one of filterBrowsers and filterSockets should be set to YES to make the filter take effect.
     */
    @Generated
    @Selector("setFilterSockets:")
    public native void setFilterSockets(boolean value);

    /**
     * [@property] identityReference
     * <p>
     * The optional certificate identity keychain reference associated with the filter.
     */
    @Generated
    @Selector("setIdentityReference:")
    public native void setIdentityReference(NSData value);

    /**
     * [@property] organization
     * <p>
     * The optional organization associated with the filter.
     */
    @Generated
    @Selector("setOrganization:")
    public native void setOrganization(String value);

    /**
     * [@property] passwordReference
     * <p>
     * The optional password keychain reference associated with the filter.
     */
    @Generated
    @Selector("setPasswordReference:")
    public native void setPasswordReference(NSData value);

    /**
     * [@property] serverAddress
     * <p>
     * The optional address of the server used to support the filter.
     */
    @Generated
    @Selector("setServerAddress:")
    public native void setServerAddress(String value);

    /**
     * [@property] username
     * <p>
     * The optional username associated with the filter.
     */
    @Generated
    @Selector("setUsername:")
    public native void setUsername(String value);

    /**
     * [@property] vendorConfiguration
     * <p>
     * An optional dictionary of plugin-specific keys to be passed to the plugin.
     */
    @Generated
    @Selector("setVendorConfiguration:")
    public native void setVendorConfiguration(NSDictionary<String, ?> value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] username
     * <p>
     * The optional username associated with the filter.
     */
    @Generated
    @Selector("username")
    public native String username();

    /**
     * [@property] vendorConfiguration
     * <p>
     * An optional dictionary of plugin-specific keys to be passed to the plugin.
     */
    @Generated
    @Selector("vendorConfiguration")
    public native NSDictionary<String, ?> vendorConfiguration();
}
