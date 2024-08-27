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

package apple.pushkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.pushkit.protocol.PKPushRegistryDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

/**
 * An object that requests the delivery and handles the receipt of PushKit notifications.
 * 
 * A `PKPushRegistry` object manages only certain types of notifications,
 * such as high-priority notifications needed by a VoIP app. PushKit wakes up your app
 * as needed to deliver incoming notifications and delivers the notifications directly
 * to the push registry object that requested them.
 * 
 * Every time your app launches, whether in the foreground or in the background, create
 * a push registry object and configure it. Typically, you keep the push registry object
 * running for the duration of your app. Each push registry object delivers incoming
 * notifications to its ``PushKit/PKPushRegistry/delegate`` object, which also handles
 * the responses for registration requests. The listing below shows how to create
 * a push registry object and request VoIP notifications. Always assign an appropriate
 * delegate object before modifying the ``PushKit/PKPushRegistry/desiredPushTypes``
 * property.
 * 
 * ```objc
 * - (void) registerForVoIPPushes {
 * self.voipRegistry = [[PKPushRegistry alloc] initWithQueue:nil];
 * self.voipRegistry.delegate = self;
 * 
 * // Initiate registration.
 * self.voipRegistry.desiredPushTypes = [NSSet setWithObject:PKPushTypeVoIP];
 * }
 * ```
 * 
 * Assigning a new value to the ``PushKit/PKPushRegistry/desiredPushTypes`` property
 * registers the push registry object with the PushKit servers. The server reports the
 * success or failure of your registration attempts asynchronously to the push registry,
 * which then reports those results to its delegate object. The push registry also delivers
 * all received notifications to the delegate object. For more information about the
 * delegate methods, see ``PushKit/PKPushRegistryDelegate``.
 * 
 * ## Topics
 * 
 * ### Initializing a Push Registry
 * 
 * - ``PushKit/PKPushRegistry/initWithQueue:``
 * 
 * ### Receiving the Notification Data
 * 
 * - ``PushKit/PKPushRegistry/delegate``
 * - ``PushKit/PKPushRegistryDelegate``
 * 
 * ### Managing the Push Registry
 * 
 * - ``PushKit/PKPushRegistry/desiredPushTypes``
 * - ``PushKit/PKPushRegistry/pushTokenForType:``
 * 
 * 
 * API-Since: 8.0
 */
@Generated
@Library("PushKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPushRegistry extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPushRegistry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPushRegistry alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKPushRegistry allocWithZone(VoidPtr zone);

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
    public static native PKPushRegistry new_objc();

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
     * The delegate object that receives notifications coming from the push registry object.
     * 
     * You must assign a valid object to this property before modifying the ``PushKit/PKPushRegistry/desiredPushTypes``
     * property. A valid delegate object is required to receive push tokens and payload
     * data from incoming pushes.
     * 
     * For more information about the methods of the `PKPushRegistryDelegate`
     * protocol, see ``PushKit/PKPushRegistryDelegate``.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native PKPushRegistryDelegate delegate();

    /**
     * Registers the push types for this push registry object.
     * 
     * When you assign a value to this property, the push registry object makes a registration
     * request with the PushKit server. This request is asynchronous, and the success or
     * failure of the request is reported to your registery's delegate object. For a successful
     * registration, PushKit delivers a push token to the delegate. Use that token to generate
     * push requests from your server.
     * 
     * For a list of push types that you may include in the set, see ``PushKit/PKPushType``.
     */
    @Nullable
    @Generated
    @Selector("desiredPushTypes")
    public native NSSet<String> desiredPushTypes();

    @Generated
    @Selector("init")
    public native PKPushRegistry init();

    /**
     * Creates a push registry with the specified dispatch queue.
     * 
     * - Parameters:
     * - queue: The dispatch queue on which to execute the delegate methods. It is recommended that
     * you specify a serial queue for this parameter. Specify `nil` to execute the delegate
     * methods on the app’s main queue.
     * 
     * - Returns: A `PKPushRegistry` object that you can use to register for push tokens and use to
     * receive notifications.
     */
    @Generated
    @Selector("initWithQueue:")
    public native PKPushRegistry initWithQueue(@Nullable dispatch_queue_t queue);

    /**
     * Retrieves the locally cached push token for the specified push type.
     * 
     * If registration for a specific push type is successful, the push registry delivers
     * the corresponding push token to its delegate and adds a copy of the token to its
     * local cache. Use this method to retrieve the token at a later time.
     * 
     * - Parameters:
     * - type: A push type requested by this push registry object. For a list of possible types,
     * see ``PushKit/PKPushType``.
     * 
     * - Returns: The push token used to send pushes to the device or `nil` if no token is available
     * for the specified type.
     */
    @Nullable
    @Generated
    @Selector("pushTokenForType:")
    public native NSData pushTokenForType(@NotNull String type);

    /**
     * The delegate object that receives notifications coming from the push registry object.
     * 
     * You must assign a valid object to this property before modifying the ``PushKit/PKPushRegistry/desiredPushTypes``
     * property. A valid delegate object is required to receive push tokens and payload
     * data from incoming pushes.
     * 
     * For more information about the methods of the `PKPushRegistryDelegate`
     * protocol, see ``PushKit/PKPushRegistryDelegate``.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) PKPushRegistryDelegate value);

    /**
     * The delegate object that receives notifications coming from the push registry object.
     * 
     * You must assign a valid object to this property before modifying the ``PushKit/PKPushRegistry/desiredPushTypes``
     * property. A valid delegate object is required to receive push tokens and payload
     * data from incoming pushes.
     * 
     * For more information about the methods of the `PKPushRegistryDelegate`
     * protocol, see ``PushKit/PKPushRegistryDelegate``.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) PKPushRegistryDelegate value) {
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
     * Registers the push types for this push registry object.
     * 
     * When you assign a value to this property, the push registry object makes a registration
     * request with the PushKit server. This request is asynchronous, and the success or
     * failure of the request is reported to your registery's delegate object. For a successful
     * registration, PushKit delivers a push token to the delegate. Use that token to generate
     * push requests from your server.
     * 
     * For a list of push types that you may include in the set, see ``PushKit/PKPushType``.
     */
    @Generated
    @Selector("setDesiredPushTypes:")
    public native void setDesiredPushTypes(@Nullable NSSet<String> value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
