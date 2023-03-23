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
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] NEAppProxyUDPFlow
 * 
 * The NEAppProxyUDPFlow class declares the programmatic interface of an object that is used by NEAppProxyProvider
 * implementations to proxy the payload of UDP datagrams.
 * 
 * NEAppProxyUDPFlow is part of NetworkExtension.framework.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEAppProxyUDPFlow extends NEAppProxyFlow {
    static {
        NatJ.register();
    }

    @Generated
    protected NEAppProxyUDPFlow(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEAppProxyUDPFlow alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEAppProxyUDPFlow allocWithZone(VoidPtr zone);

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
    public static native NEAppProxyUDPFlow new_objc();

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
    @Selector("init")
    public native NEAppProxyUDPFlow init();

    /**
     * [@property] localEndpoint
     * 
     * An NWEndpoint object containing the local endpoint of the flow's corresponding socket.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("localEndpoint")
    public native NWEndpoint localEndpoint();

    /**
     * readDatagramWithCompletionHandler:
     * 
     * Read a datagram from the flow.
     * 
     * @param completionHandler A block that will be executed when datagrams have been read from the flow. The block
     *                          takes the datagrams that were read, the destination endpoints of the datagrams, and an
     *                          NSError. If an error occurred while reading then the error parameter will be non-nil. If
     *                          the datagrams and remoteEndpoints arrays are non-nill but
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("readDatagramsWithCompletionHandler:")
    public native void readDatagramsWithCompletionHandler(
            @ObjCBlock(name = "call_readDatagramsWithCompletionHandler") Block_readDatagramsWithCompletionHandler completionHandler);

    /**
     * writeDatagram:sentByEndpoint:completionHandler:
     * 
     * Write a datagram to the flow.
     * 
     * @param datagrams         An array of NSData objects containing the data to be written.
     * @param remoteEndpoints   The source endpoints of the datagrams.
     * @param completionHandler A block that will be executed when the datagrams have been written to the corresponding
     *                          socket's receive buffer.
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("writeDatagrams:sentByEndpoints:completionHandler:")
    public native void writeDatagramsSentByEndpointsCompletionHandler(NSArray<? extends NSData> datagrams,
            NSArray<? extends NWEndpoint> remoteEndpoints,
            @ObjCBlock(name = "call_writeDatagramsSentByEndpointsCompletionHandler") Block_writeDatagramsSentByEndpointsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readDatagramsWithCompletionHandler {
        @Generated
        void call_readDatagramsWithCompletionHandler(NSArray<? extends NSData> datagrams,
                NSArray<? extends NWEndpoint> remoteEndpoints, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeDatagramsSentByEndpointsCompletionHandler {
        @Generated
        void call_writeDatagramsSentByEndpointsCompletionHandler(NSError error);
    }
}
