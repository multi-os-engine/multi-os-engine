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

package apple.multipeerconnectivity;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.multipeerconnectivity.protocol.MCAdvertiserAssistantDelegate;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MCAdvertiserAssistant
 * <p>
 * MCAdvertiserAssistant is a convenience class that handles advertising,
 * presents incoming invitations to the user and handles user's responses.
 * <p>
 * To create the MCAdvertiserAssistant object a new MCPeerID should be
 * created to represent the local peer, and a service type needs to be
 * specified.
 * <p>
 * The serviceType parameter is a short text string used to describe the
 * app's networking protocol.  It should be in the same format as a
 * Bonjour service type: up to 15 characters long and valid characters
 * include ASCII lowercase letters, numbers, and the hyphen. A short name
 * that distinguishes itself from unrelated services is recommended;
 * for example, a text chat app made by ABC company could use the service
 * type "abc-txtchat".
 * <p>
 * The discoveryInfo parameter is a dictionary of string key/value pairs
 * that will be advertised for browsers to see. Both keys and values must
 * be NSString objects. The content of discoveryInfo will be advertised
 * within Bonjour TXT records, and keeping the dictionary small is good
 * for keeping network traffic low.
 * <p>
 * A delegate that conforms to the MCAdvertiserAssistantDelegate protocol
 * must be provided. No assumption should be made as to which queue the
 * callbacks are called on.
 * <p>
 * See Bonjour APIs https://developer.apple.com/bonjour/ for more
 * information about service types.
 */
@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MCAdvertiserAssistant extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MCAdvertiserAssistant(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MCAdvertiserAssistant alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MCAdvertiserAssistant allocWithZone(VoidPtr zone);

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
    public static native MCAdvertiserAssistant new_objc();

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

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MCAdvertiserAssistantDelegate delegate();

    @Generated
    @Selector("discoveryInfo")
    public native NSDictionary<String, String> discoveryInfo();

    @Generated
    @Selector("init")
    public native MCAdvertiserAssistant init();

    @Generated
    @Selector("initWithServiceType:discoveryInfo:session:")
    public native MCAdvertiserAssistant initWithServiceTypeDiscoveryInfoSession(String serviceType,
            NSDictionary<String, String> info, MCSession session);

    @Generated
    @Selector("serviceType")
    public native String serviceType();

    @Generated
    @Selector("session")
    public native MCSession session();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) MCAdvertiserAssistantDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) MCAdvertiserAssistantDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The methods -start and -stop are used to start and stop the assistant.
     */
    @Generated
    @Selector("start")
    public native void start();

    @Generated
    @Selector("stop")
    public native void stop();
}
