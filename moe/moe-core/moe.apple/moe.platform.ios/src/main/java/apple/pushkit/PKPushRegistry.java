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

/**
 * PKPushRegistry
 * 
 * An instance of this class can be used to register for 3rd party notifications. The supported push
 *                notification types are listed above as PKPushType constants.
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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]      delegate
     * 
     * Setting a delegate is required to receive device push tokens and incoming pushes.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native PKPushRegistryDelegate delegate();

    /**
     * [@property]      desiredPushTypes
     * 
     * An app requests registration for various types of pushes by setting this NSSet to the desired
     *                PKPushType constants. Push tokens and notifications will be delivered via delegate callback.
     */
    @Generated
    @Selector("desiredPushTypes")
    public native NSSet<String> desiredPushTypes();

    @Generated
    @Selector("init")
    public native PKPushRegistry init();

    /**
     * initWithQueue:
     * 
     * Instantiates a PKPushRegistry with a delegate callback dispatch queue.
     * 
     * @param         queue
     *                All delegate callbacks are performed asynchronously by PKPushRegistry on this queue.
     * @return        A PKPushRegistry instance that can be used to register for push tokens and notifications for supported
     *                push types.
     */
    @Generated
    @Selector("initWithQueue:")
    public native PKPushRegistry initWithQueue(NSObject queue);

    /**
     * pushTokenForType:
     * 
     * Access the locally cached push token for a specified PKPushType.
     * 
     * A push token returned here has previously been given to the delegate via handlePushTokenUpdate:forType:
     *                callback.
     * 
     * @param         type
     *                This is a PKPushType constant that is already in desiredPushTypes.
     * @return        Returns the push token that can be used to send pushes to the device for the specified PKPushType.
     *                Returns nil if no push token is available for this PKPushType at the time of invocation.
     */
    @Generated
    @Selector("pushTokenForType:")
    public native NSData pushTokenForType(String type);

    /**
     * [@property]      delegate
     * 
     * Setting a delegate is required to receive device push tokens and incoming pushes.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) PKPushRegistryDelegate value);

    /**
     * [@property]      delegate
     * 
     * Setting a delegate is required to receive device push tokens and incoming pushes.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) PKPushRegistryDelegate value) {
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
     * [@property]      desiredPushTypes
     * 
     * An app requests registration for various types of pushes by setting this NSSet to the desired
     *                PKPushType constants. Push tokens and notifications will be delivered via delegate callback.
     */
    @Generated
    @Selector("setDesiredPushTypes:")
    public native void setDesiredPushTypes(NSSet<String> value);
}
