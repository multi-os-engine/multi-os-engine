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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NWTCPConnection
 * 
 * Establish TCP connections to an endpoint, and send and receive data on the TCP connection.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NWTCPConnection extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NWTCPConnection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NWTCPConnection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NWTCPConnection allocWithZone(VoidPtr zone);

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
    public static native NWTCPConnection new_objc();

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
     * cancel:
     * 
     * Cancel the connection. This will clean up the resources associated with this object
     * and transition this object to NWTCPConnectionStateCancelled state.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * [@property] connectedPath
     * 
     * The network path over which the connection was established. The caller can query
     * additional properties from the NWPath object for more information.
     * 
     * Note that this contains a snapshot of information at the time of connection establishment
     * for this connection only. As a result, some underlying properties might change in time and
     * might not reflect the path for other connections that might be established at different times.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("connectedPath")
    public native NWPath connectedPath();

    /**
     * [@property] endpoint
     * 
     * The destination endpoint with which this connection was created.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("endpoint")
    public native NWEndpoint endpoint();

    /**
     * [@property] error
     * 
     * The connection-wide error property indicates any fatal error that occurred while
     * processing the connection or performing data reading or writing.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * [@property] hasBetterPath
     * 
     * YES if the system determines there is a better path the destination can be reached if
     * the caller creates a new connection using the same endpoint and parameters. This can
     * be done using the convenience upgrade initializer method.
     * Use KVO to watch this property to get updates.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("hasBetterPath")
    public native boolean hasBetterPath();

    @Generated
    @Selector("init")
    public native NWTCPConnection init();

    /**
     * initWithUpgradeForConnection:
     * 
     * This convenience initializer can be used to create a new connection that would only
     * be connected if there exists a better path (as determined by the system) to the destination
     * endpoint of the original connection. It will be initialized using the same destination endpoint
     * and set of parameters from the original connection.
     * 
     * If the original connection becomes disconnected or cancelled, the new "upgrade" connection
     * would automatically be considered better.
     * 
     * The caller should create an NWTCPConnection and watch for the hasBetterPath property.
     * When this property is YES, the caller should attempt to create a new upgrade
     * connection, with the goal to start transferring data on the new better path as soon as
     * possible to reduce power and potentially monetary cost. When the new upgrade connection
     * becomes connected and when the caller wraps up the previous caller session on
     * the original connection, the caller can start using the new upgrade connection and
     * tear down the original one.
     * 
     * @param connection The original connection from which the caller will upgrade
     * @return An initialized NWTCPConnection
     * 
     *         API-Since: 9.0
     */
    @Generated
    @Selector("initWithUpgradeForConnection:")
    public native NWTCPConnection initWithUpgradeForConnection(@NotNull NWTCPConnection connection);

    /**
     * [@property] viable
     * 
     * YES if the connection can read and write data, NO otherwise. Use KVO to watch this property.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("isViable")
    public native boolean isViable();

    /**
     * [@property] localAddress
     * 
     * The IP address endpoint from which the connection was connected.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("localAddress")
    public native NWEndpoint localAddress();

    /**
     * readLength:completionHandler:
     * 
     * Read "length" number of bytes. See readMinimumLength:maximumLength:completionHandler:
     * for a complete discussion of the callback behavior.
     * 
     * @param length     The exact number of bytes the application wants to read
     * @param completion The completion handler to be invoked when there is data to read or an error occurred
     * 
     *                   API-Since: 9.0
     */
    @Generated
    @Selector("readLength:completionHandler:")
    public native void readLengthCompletionHandler(@NUInt long length,
            @NotNull @ObjCBlock(name = "call_readLengthCompletionHandler") Block_readLengthCompletionHandler completion);

    /**
     * readMinimumLength:maximumLength:completionHandler:
     * 
     * Read the requested range of bytes. The completion handler will be invoked when:
     * - Exactly "length" number of bytes have been read. 'data' will be non-nil.
     * 
     * - Fewer than "length" number of bytes, including 0 bytes, have been read, and the connection's
     * read side has been closed. 'data' might be nil, depending on whether there was any data to be
     * read when the connection's read side was closed.
     * 
     * - Some fatal error has occurred, and 'data' will be nil.
     * 
     * To know when to schedule a read again, check for the condition whether an error has occurred.
     * 
     * For better performance, the caller should pick the effective minimum and maximum lengths.
     * For example, if the caller absolutely needs a specific number of bytes before it can
     * make any progress, use that value as the minimum. The maximum bytes can be the upperbound
     * that the caller wants to read. Typically, the minimum length can be the caller
     * protocol fixed-size header and the maximum length can be the maximum size of the payload or
     * the size of the current read buffer.
     * 
     * @param minimum    The minimum number of bytes the caller wants to read
     * @param maximum    The maximum number of bytes the caller wants to read
     * @param completion The completion handler to be invoked when there is data to read or an error occurred
     * 
     *                   API-Since: 9.0
     */
    @Generated
    @Selector("readMinimumLength:maximumLength:completionHandler:")
    public native void readMinimumLengthMaximumLengthCompletionHandler(@NUInt long minimum, @NUInt long maximum,
            @NotNull @ObjCBlock(name = "call_readMinimumLengthMaximumLengthCompletionHandler") Block_readMinimumLengthMaximumLengthCompletionHandler completion);

    /**
     * [@property] remoteAddress
     * 
     * The IP address endpoint to which the connection was connected.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("remoteAddress")
    public native NWEndpoint remoteAddress();

    /**
     * [@property] state
     * 
     * The status of the connection. Use KVO to watch this property to get updates.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * [@property] txtRecord
     * 
     * When the connection is connected to a Bonjour service endpoint, the TXT record associated
     * with the Bonjour service is available via this property. Beware that the value comes from
     * the network. Care must be taken when parsing this potentially malicious value.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("txtRecord")
    public native NSData txtRecord();

    /**
     * write:completionHandler:
     * 
     * Write the given data object content. Callers should wait until the completionHandler is executed
     * before issuing another write.
     * 
     * @param data       The data object whose content will be written
     * @param completion The completion handler to be invoked when the data content has been written or an error has
     *                   occurred.
     *                   If the error is nil, the write succeeded and the caller can write more data.
     * 
     *                   API-Since: 9.0
     */
    @Generated
    @Selector("write:completionHandler:")
    public native void writeCompletionHandler(@NotNull NSData data,
            @NotNull @ObjCBlock(name = "call_writeCompletionHandler") Block_writeCompletionHandler completion);

    /**
     * writeClose:
     * 
     * Close this connection's write side such that further write requests won't succeed.
     * Note that this has the effect of closing the read side of the peer connection.
     * When the connection's read side and write side are closed, the connection is considered
     * disconnected and will transition to the appropriate state.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("writeClose")
    public native void writeClose();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readLengthCompletionHandler {
        @Generated
        void call_readLengthCompletionHandler(@Nullable NSData data, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readMinimumLengthMaximumLengthCompletionHandler {
        @Generated
        void call_readMinimumLengthMaximumLengthCompletionHandler(@Nullable NSData data, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeCompletionHandler {
        @Generated
        void call_writeCompletionHandler(@Nullable NSError error);
    }
}
