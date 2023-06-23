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

package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.homekit.protocol.HMHomeManagerDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Manages collection of one or more homes.
 * 
 * This class is responsible for managing a collection of homes.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMHomeManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMHomeManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMHomeManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HMHomeManager allocWithZone(VoidPtr zone);

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
    public static native HMHomeManager new_objc();

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
     * Adds a new home to the collection.
     * 
     * @param homeName   Name of the home to create and add to the collection.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addHomeWithName:completionHandler:")
    public native void addHomeWithNameCompletionHandler(@NotNull String homeName,
            @NotNull @ObjCBlock(name = "call_addHomeWithNameCompletionHandler") Block_addHomeWithNameCompletionHandler completion);

    /**
     * Delegate that receives updates on the collection of homes.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native HMHomeManagerDelegate delegate();

    /**
     * Array of HMHome objects that represents the homes associated with the home manager.
     * 
     * When a new home manager is created, this array is initialized as an empty array. It is
     * not guaranteed to be filled with the list of homes, represented as HMHome objects,
     * until the homeManagerDidUpdateHomes: delegate method has been invoked.
     */
    @NotNull
    @Generated
    @Selector("homes")
    public native NSArray<? extends HMHome> homes();

    @Generated
    @Selector("init")
    public native HMHomeManager init();

    /**
     * The primary home for this collection.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.1
     * Deprecated-Message: No longer supported.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("primaryHome")
    public native HMHome primaryHome();

    /**
     * Removes an existing home from the collection.
     * 
     * @param home       Home object that needs to be removed from the collection.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeHome:completionHandler:")
    public native void removeHomeCompletionHandler(@NotNull HMHome home,
            @NotNull @ObjCBlock(name = "call_removeHomeCompletionHandler") Block_removeHomeCompletionHandler completion);

    /**
     * Delegate that receives updates on the collection of homes.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) HMHomeManagerDelegate value);

    /**
     * Delegate that receives updates on the collection of homes.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) HMHomeManagerDelegate value) {
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
     * This method is used to change the primary home.
     * 
     * @param home       New primary home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     * 
     *                   API-Since: 8.0
     *                   Deprecated-Since: 16.1
     *                   Deprecated-Message: No longer supported.
     */
    @Deprecated
    @Generated
    @Selector("updatePrimaryHome:completionHandler:")
    public native void updatePrimaryHomeCompletionHandler(@NotNull HMHome home,
            @NotNull @ObjCBlock(name = "call_updatePrimaryHomeCompletionHandler") Block_updatePrimaryHomeCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addHomeWithNameCompletionHandler {
        @Generated
        void call_addHomeWithNameCompletionHandler(@Nullable HMHome home, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeHomeCompletionHandler {
        @Generated
        void call_removeHomeCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updatePrimaryHomeCompletionHandler {
        @Generated
        void call_updatePrimaryHomeCompletionHandler(@Nullable NSError error);
    }

    /**
     * The current authorization status of the application.
     * 
     * The authorization is managed by the system, there is no need to explicitly request authorization.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("authorizationStatus")
    @NUInt
    public native long authorizationStatus();
}
