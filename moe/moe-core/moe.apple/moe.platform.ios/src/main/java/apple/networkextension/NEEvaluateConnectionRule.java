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

/**
 * [@interface] NEEvaluateConnectionRule
 * 
 * The NEEvaluateConnectionRule class declares the programmatic interface for an object that associates properties of
 * network connections with an action.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEEvaluateConnectionRule extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEEvaluateConnectionRule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEEvaluateConnectionRule alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEEvaluateConnectionRule allocWithZone(VoidPtr zone);

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
    public static native NEEvaluateConnectionRule new_objc();

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
     * [@property] action
     * 
     * The action to take if the properties of the network connection being established match the rule.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("action")
    @NInt
    public native long action();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NEEvaluateConnectionRule init();

    @Generated
    @Selector("initWithCoder:")
    public native NEEvaluateConnectionRule initWithCoder(NSCoder coder);

    /**
     * initWithMatchDomains:andAction
     * 
     * Initialize an NEEvaluateConnectionRule instance with a list of destination host domains and an action
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("initWithMatchDomains:andAction:")
    public native NEEvaluateConnectionRule initWithMatchDomainsAndAction(NSArray<String> domains, @NInt long action);

    /**
     * [@property] matchDomains
     * 
     * An array of NSString objects. If the host name of the destination of the network connection being established
     * shares a suffix with one of the strings in this array, then the rule matches.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("matchDomains")
    public native NSArray<String> matchDomains();

    /**
     * [@property] probeURL
     * 
     * An HTTP or HTTPS URL. If the rule matches the connection being established and the action is
     * NEEvaluateConnectionRuleActionConnectIfNeeded and a request sent to this URL results in a response with an HTTP
     * response code other than 200, then the VPN is started.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("probeURL")
    public native NSURL probeURL();

    /**
     * [@property] probeURL
     * 
     * An HTTP or HTTPS URL. If the rule matches the connection being established and the action is
     * NEEvaluateConnectionRuleActionConnectIfNeeded and a request sent to this URL results in a response with an HTTP
     * response code other than 200, then the VPN is started.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setProbeURL:")
    public native void setProbeURL(NSURL value);

    /**
     * [@property] useDNSServers
     * 
     * An array of NSString objects. If the rule matches the connection being established and the action is
     * NEEvaluateConnectionRuleActionConnectIfNeeded, the DNS servers specified in this array are used to resolve the
     * host name of the destination while evaluating connectivity to the destination. If the resolution fails for any
     * reason, the VPN is started.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setUseDNSServers:")
    public native void setUseDNSServers(NSArray<String> value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] useDNSServers
     * 
     * An array of NSString objects. If the rule matches the connection being established and the action is
     * NEEvaluateConnectionRuleActionConnectIfNeeded, the DNS servers specified in this array are used to resolve the
     * host name of the destination while evaluating connectivity to the destination. If the resolution fails for any
     * reason, the VPN is started.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("useDNSServers")
    public native NSArray<String> useDNSServers();
}
