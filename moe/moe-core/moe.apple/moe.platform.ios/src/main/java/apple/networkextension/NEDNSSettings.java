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
 * [@interface] NEDNSSettings
 * <p>
 * The NEDNSSettings class declares the programmatic interface for an object that contains DNS settings.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEDNSSettings extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEDNSSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEDNSSettings alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEDNSSettings allocWithZone(VoidPtr zone);

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
    public static native NEDNSSettings new_objc();

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

    /**
     * [@property] domainName
     * <p>
     * A string containing the DNS domain.
     */
    @Generated
    @Selector("domainName")
    public native String domainName();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NEDNSSettings init();

    @Generated
    @Selector("initWithCoder:")
    public native NEDNSSettings initWithCoder(NSCoder coder);

    /**
     * initWithServers:
     * <p>
     * Initialize a newly-allocated NEDNSSettings object.
     *
     * @param servers An array of DNS server IP address strings.
     */
    @Generated
    @Selector("initWithServers:")
    public native NEDNSSettings initWithServers(NSArray<String> servers);

    /**
     * [@property] matchDomains
     * <p>
     * An array of strings containing domain strings. If this property is non-nil, the DNS settings will only be used to
     * resolve host names within the specified domains.
     */
    @Generated
    @Selector("matchDomains")
    public native NSArray<String> matchDomains();

    /**
     * [@property] matchDomainsNoSearch
     * <p>
     * A boolean indicating if the match domains should be appended to the search domain list. Default is NO (match
     * domains will be appended to the search domain list).
     */
    @Generated
    @Selector("matchDomainsNoSearch")
    public native boolean matchDomainsNoSearch();

    /**
     * [@property] searchDomains
     * <p>
     * An array of DNS server search domain strings.
     */
    @Generated
    @Selector("searchDomains")
    public native NSArray<String> searchDomains();

    /**
     * [@property] servers
     * <p>
     * An array of DNS server address strings.
     */
    @Generated
    @Selector("servers")
    public native NSArray<String> servers();

    /**
     * [@property] domainName
     * <p>
     * A string containing the DNS domain.
     */
    @Generated
    @Selector("setDomainName:")
    public native void setDomainName(String value);

    /**
     * [@property] matchDomains
     * <p>
     * An array of strings containing domain strings. If this property is non-nil, the DNS settings will only be used to
     * resolve host names within the specified domains.
     */
    @Generated
    @Selector("setMatchDomains:")
    public native void setMatchDomains(NSArray<String> value);

    /**
     * [@property] matchDomainsNoSearch
     * <p>
     * A boolean indicating if the match domains should be appended to the search domain list. Default is NO (match
     * domains will be appended to the search domain list).
     */
    @Generated
    @Selector("setMatchDomainsNoSearch:")
    public native void setMatchDomainsNoSearch(boolean value);

    /**
     * [@property] searchDomains
     * <p>
     * An array of DNS server search domain strings.
     */
    @Generated
    @Selector("setSearchDomains:")
    public native void setSearchDomains(NSArray<String> value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] dnsProtocol
     * <p>
     * The DNS protocol used by the settings.
     */
    @Generated
    @Selector("dnsProtocol")
    @NInt
    public native long dnsProtocol();
}
