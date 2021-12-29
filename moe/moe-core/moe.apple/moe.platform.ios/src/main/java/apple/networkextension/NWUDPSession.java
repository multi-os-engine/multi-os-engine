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
 * [@interface] NWUDPSession
 * <p>
 * Open UDP datagram sessions to an endpoint, and send and receive datagrams.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NWUDPSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NWUDPSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NWUDPSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NWUDPSession allocWithZone(VoidPtr zone);

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
    public static native NWUDPSession new_objc();

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

    /**
     * cancel
     * <p>
     * Move into the NWUDPSessionStateCancelled state. The connection will be terminated,
     * and all handlers will be cancelled.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * [@property] currentPath
     * <p>
     * The current evaluated path for the resolvedEndpoint. Use KVO to watch for changes.
     */
    @Generated
    @Selector("currentPath")
    public native NWPath currentPath();

    /**
     * [@property] endpoint
     * <p>
     * The provided endpoint.
     */
    @Generated
    @Selector("endpoint")
    public native NWEndpoint endpoint();

    /**
     * [@property] hasBetterPath
     * <p>
     * YES if there is another path available that is preferred over the currentPath.
     * To take advantage of this path, create a new UDPSession. Use KVO to watch for changes.
     */
    @Generated
    @Selector("hasBetterPath")
    public native boolean hasBetterPath();

    @Generated
    @Selector("init")
    public native NWUDPSession init();

    /**
     * initWithUpgradeForSession:
     * <p>
     * This convenience initializer can be used to create a new session based on the
     * original session's endpoint and parameters.
     * <p>
     * The application should create an NWUDPSession and watch the "hasBetterPath" property.
     * When this property is YES, it should call initWithUpgradeForSession: to create a new
     * session, with the goal to start transferring data on the new better path as soon as
     * possible to reduce power and potentially monetary cost. When the new "upgrade" session
     * becomes ready and when the application wraps up the previous application session on
     * the original session, the application can start using the new "upgrade" session and
     * tear down the original one.
     *
     * @param session The original session from which the application will upgrade
     * @return An initialized NWUDPSession object.
     */
    @Generated
    @Selector("initWithUpgradeForSession:")
    public native NWUDPSession initWithUpgradeForSession(NWUDPSession session);

    /**
     * [@property] viable
     * <p>
     * YES if the connection can read and write data, NO otherwise.
     * Use KVO to watch this property.
     */
    @Generated
    @Selector("isViable")
    public native boolean isViable();

    /**
     * [@property] maximumDatagramLength
     * <p>
     * The maximum size of a datagram to be written currently. If a datagram is written
     * with a longer length, the datagram may be fragmented or encounter an error. Note that this
     * value is not guaranteed to be the maximum datagram length for end-to-end communication
     * across the network. Use KVO to watch for changes.
     */
    @Generated
    @Selector("maximumDatagramLength")
    @NUInt
    public native long maximumDatagramLength();

    /**
     * [@property] resolvedEndpoint
     * <p>
     * The currently targeted remote endpoint. Use KVO to watch for changes.
     */
    @Generated
    @Selector("resolvedEndpoint")
    public native NWEndpoint resolvedEndpoint();

    /**
     * setReadHandler:maxDatagrams
     * <p>
     * Set a read handler for datagrams. Reads will be scheduled by the system, so this
     * method only needs to be called once for a session.
     *
     * @param handler      A handler called when datagrams have been read, or when an error has occurred.
     * @param maxDatagrams The maximum number of datagrams to send to the handler.
     */
    @Generated
    @Selector("setReadHandler:maxDatagrams:")
    public native void setReadHandlerMaxDatagrams(
            @ObjCBlock(name = "call_setReadHandlerMaxDatagrams") Block_setReadHandlerMaxDatagrams handler,
            @NUInt long maxDatagrams);

    /**
     * [@property] state
     * <p>
     * The current state of the UDP session. If the state is NWUDPSessionStateReady,
     * then the connection is eligible for reading and writing. The state will be
     * NWUDPSessionStateFailed if the endpoint could not be resolved, or all endpoints have been
     * rejected. Use KVO to watch for changes.
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * tryNextResolvedEndpoint
     * <p>
     * Mark the current value of resolvedEndpoint as unusable, and try to switch to the
     * next available endpoint. This should be used when the caller has attempted to communicate
     * with the current resolvedEndpoint, and the caller has determined that it is unusable. If
     * there are no other resolved endpoints, the session will move to the failed state.
     */
    @Generated
    @Selector("tryNextResolvedEndpoint")
    public native void tryNextResolvedEndpoint();

    /**
     * writeDatagram:completionHandler
     * <p>
     * Write a single datagram. Callers should wait until the completionHandler is executed
     * before issuing another write.
     *
     * @param datagram          An NSData containing the datagram to write.
     * @param completionHandler A handler called when the write request has either succeeded or failed.
     */
    @Generated
    @Selector("writeDatagram:completionHandler:")
    public native void writeDatagramCompletionHandler(NSData datagram,
            @ObjCBlock(name = "call_writeDatagramCompletionHandler") Block_writeDatagramCompletionHandler completionHandler);

    /**
     * writeMultipleDatagrams:completionHandler
     * <p>
     * Write multiple datagrams. Callers should wait until the completionHandler is executed
     * before issuing another write.
     *
     * @param datagramArray     An NSArray of NSData objects, containing the ordered list datagrams to write.
     * @param completionHandler A handler called when the write request has either succeeded or failed.
     */
    @Generated
    @Selector("writeMultipleDatagrams:completionHandler:")
    public native void writeMultipleDatagramsCompletionHandler(NSArray<? extends NSData> datagramArray,
            @ObjCBlock(name = "call_writeMultipleDatagramsCompletionHandler") Block_writeMultipleDatagramsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setReadHandlerMaxDatagrams {
        @Generated
        void call_setReadHandlerMaxDatagrams(NSArray<? extends NSData> datagrams, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeDatagramCompletionHandler {
        @Generated
        void call_writeDatagramCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeMultipleDatagramsCompletionHandler {
        @Generated
        void call_writeMultipleDatagramsCompletionHandler(NSError error);
    }
}
