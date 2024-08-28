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
import apple.foundation.NSURL;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEOnDemandRule
 * 
 * The NEOnDemandRule class declares the programmatic interface for an object that defines an On Demand rule.
 * 
 * NEOnDemandRule is an abstract base class from which other action-specific rule classes are derived.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEOnDemandRule extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEOnDemandRule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEOnDemandRule alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEOnDemandRule allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NEOnDemandRule new_objc();

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

    /**
     * [@property] DNSSearchDomainMatch
     * 
     * An array of NSString objects. If the current default search domain is equal to one of the strings in this array
     * and all of the other conditions in the rule match, then the rule matches. If this property is nil (the default),
     * then the current default search domain does not factor into the rule match.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("DNSSearchDomainMatch")
    public native NSArray<String> DNSSearchDomainMatch();

    /**
     * [@property] DNSServerAddressMatch
     * 
     * An array of DNS server IP addresses represented as NSString objects. If each of the current default DNS servers
     * is equal to one of the strings in this array and all of the other conditions in the rule match, then the rule
     * matches. If this property is nil (the default), then the default DNS servers do not factor into the rule match.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("DNSServerAddressMatch")
    public native NSArray<String> DNSServerAddressMatch();

    /**
     * [@property] SSIDMatch
     * 
     * An array of NSString objects. If the Service Set Identifier (SSID) of the current primary connected network
     * matches one of the strings in this array and all of the other conditions in the rule match, then the rule
     * matches. If this property is nil (the default), then the current primary connected network SSID does not factor
     * into the rule match.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("SSIDMatch")
    public native NSArray<String> SSIDMatch();

    /**
     * [@property] action
     * 
     * The rule's action
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("action")
    @NInt
    public native long action();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native NEOnDemandRule init();

    @Generated
    @Selector("initWithCoder:")
    public native NEOnDemandRule initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] interfaceTypeMatch
     * 
     * The type of interface that this rule matches. If the current primary network interface is of this type and all of
     * the other conditions in the rule match, then the rule matches. If this property is 0 (the default), then the
     * current primary interface type does not factor into the rule match.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("interfaceTypeMatch")
    @NInt
    public native long interfaceTypeMatch();

    /**
     * [@property] probeURL
     * 
     * An HTTP or HTTPS URL. If a request sent to this URL results in a HTTP 200 OK response and all of the other
     * conditions in the rule match, then then rule matches. If this property is nil (the default), then an HTTP request
     * does not factor into the rule match.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("probeURL")
    public native NSURL probeURL();

    /**
     * [@property] DNSSearchDomainMatch
     * 
     * An array of NSString objects. If the current default search domain is equal to one of the strings in this array
     * and all of the other conditions in the rule match, then the rule matches. If this property is nil (the default),
     * then the current default search domain does not factor into the rule match.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setDNSSearchDomainMatch:")
    public native void setDNSSearchDomainMatch(@Nullable NSArray<String> value);

    /**
     * [@property] DNSServerAddressMatch
     * 
     * An array of DNS server IP addresses represented as NSString objects. If each of the current default DNS servers
     * is equal to one of the strings in this array and all of the other conditions in the rule match, then the rule
     * matches. If this property is nil (the default), then the default DNS servers do not factor into the rule match.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setDNSServerAddressMatch:")
    public native void setDNSServerAddressMatch(@Nullable NSArray<String> value);

    /**
     * [@property] interfaceTypeMatch
     * 
     * The type of interface that this rule matches. If the current primary network interface is of this type and all of
     * the other conditions in the rule match, then the rule matches. If this property is 0 (the default), then the
     * current primary interface type does not factor into the rule match.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setInterfaceTypeMatch:")
    public native void setInterfaceTypeMatch(@NInt long value);

    /**
     * [@property] probeURL
     * 
     * An HTTP or HTTPS URL. If a request sent to this URL results in a HTTP 200 OK response and all of the other
     * conditions in the rule match, then then rule matches. If this property is nil (the default), then an HTTP request
     * does not factor into the rule match.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setProbeURL:")
    public native void setProbeURL(@Nullable NSURL value);

    /**
     * [@property] SSIDMatch
     * 
     * An array of NSString objects. If the Service Set Identifier (SSID) of the current primary connected network
     * matches one of the strings in this array and all of the other conditions in the rule match, then the rule
     * matches. If this property is nil (the default), then the current primary connected network SSID does not factor
     * into the rule match.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setSSIDMatch:")
    public native void setSSIDMatch(@Nullable NSArray<String> value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
