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

package apple.foundation;

import apple.NSObject;
import apple.corefoundation.opaque.CFRunLoopRef;
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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRunLoop extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSRunLoop(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSRunLoop alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSRunLoop allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("currentRunLoop")
    public static native NSRunLoop currentRunLoop();

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

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("mainRunLoop")
    public static native NSRunLoop mainRunLoop();

    @Generated
    @Owned
    @Selector("new")
    public static native NSRunLoop new_objc();

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
    @Selector("acceptInputForMode:beforeDate:")
    public native void acceptInputForModeBeforeDate(@NotNull String mode, @NotNull NSDate limitDate);

    @Generated
    @Selector("addPort:forMode:")
    public native void addPortForMode(@NotNull NSPort aPort, @NotNull String mode);

    @Generated
    @Selector("addTimer:forMode:")
    public native void addTimerForMode(@NotNull NSTimer timer, @NotNull String mode);

    @Generated
    @Selector("cancelPerformSelector:target:argument:")
    public native void cancelPerformSelectorTargetArgument(@NotNull SEL aSelector,
            @NotNull @Mapped(ObjCObjectMapper.class) Object target,
            @Nullable @Mapped(ObjCObjectMapper.class) Object arg);

    @Generated
    @Selector("cancelPerformSelectorsWithTarget:")
    public native void cancelPerformSelectorsWithTarget(@NotNull @Mapped(ObjCObjectMapper.class) Object target);

    @Nullable
    @Generated
    @Selector("currentMode")
    public native String currentMode();

    @NotNull
    @Generated
    @Selector("getCFRunLoop")
    public native CFRunLoopRef getCFRunLoop();

    @Generated
    @Selector("init")
    public native NSRunLoop init();

    @Nullable
    @Generated
    @Selector("limitDateForMode:")
    public native NSDate limitDateForMode(@NotNull String mode);

    /**
     * Schedules the execution of a block on the target run loop.
     * - parameter: block The block to execute
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("performBlock:")
    public native void performBlock(@NotNull @ObjCBlock(name = "call_performBlock") Block_performBlock block);

    /**
     * Schedules the execution of a block on the target run loop in given modes.
     * - parameter: modes An array of input modes for which the block may be executed.
     * - parameter: block The block to execute
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("performInModes:block:")
    public native void performInModesBlock(@NotNull NSArray<String> modes,
            @NotNull @ObjCBlock(name = "call_performInModesBlock") Block_performInModesBlock block);

    @Generated
    @Selector("performSelector:target:argument:order:modes:")
    public native void performSelectorTargetArgumentOrderModes(@NotNull SEL aSelector,
            @NotNull @Mapped(ObjCObjectMapper.class) Object target,
            @Nullable @Mapped(ObjCObjectMapper.class) Object arg, @NUInt long order, @NotNull NSArray<String> modes);

    @Generated
    @Selector("removePort:forMode:")
    public native void removePortForMode(@NotNull NSPort aPort, @NotNull String mode);

    @Generated
    @Selector("run")
    public native void run();

    @Generated
    @Selector("runMode:beforeDate:")
    public native boolean runModeBeforeDate(@NotNull String mode, @NotNull NSDate limitDate);

    @Generated
    @Selector("runUntilDate:")
    public native void runUntilDate(@NotNull NSDate limitDate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBlock {
        @Generated
        void call_performBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performInModesBlock {
        @Generated
        void call_performInModesBlock();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
