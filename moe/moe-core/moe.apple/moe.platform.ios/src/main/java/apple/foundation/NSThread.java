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
public class NSThread extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSThread(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSThread alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSThread allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("callStackReturnAddresses")
    public static native NSArray<? extends NSNumber> callStackReturnAddresses();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("callStackSymbols")
    public static native NSArray<String> callStackSymbols();

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
    @Selector("currentThread")
    public static native NSThread currentThread();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("detachNewThreadSelector:toTarget:withObject:")
    public static native void detachNewThreadSelectorToTargetWithObject(@NotNull SEL selector,
            @NotNull @Mapped(ObjCObjectMapper.class) Object target,
            @Nullable @Mapped(ObjCObjectMapper.class) Object argument);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("detachNewThreadWithBlock:")
    public static native void detachNewThreadWithBlock(
            @NotNull @ObjCBlock(name = "call_detachNewThreadWithBlock") Block_detachNewThreadWithBlock block);

    @Generated
    @Selector("exit")
    public static native void exit();

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

    /**
     * reports whether current thread is main
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("isMainThread")
    public static native boolean isMainThread_static();

    @Generated
    @Selector("isMultiThreaded")
    public static native boolean isMultiThreaded();

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
    @Selector("mainThread")
    public static native NSThread mainThread();

    @Generated
    @Owned
    @Selector("new")
    public static native NSThread new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setThreadPriority:")
    public static native boolean setThreadPriority_static(double p);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sleepForTimeInterval:")
    public static native void sleepForTimeInterval(double ti);

    @Generated
    @Selector("sleepUntilDate:")
    public static native void sleepUntilDate(@NotNull NSDate date);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("threadPriority")
    public static native double threadPriority_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("init")
    public native NSThread init();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithBlock:")
    public native NSThread initWithBlock(@NotNull @ObjCBlock(name = "call_initWithBlock") Block_initWithBlock block);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("initWithTarget:selector:object:")
    public native NSThread initWithTargetSelectorObject(@NotNull @Mapped(ObjCObjectMapper.class) Object target,
            @NotNull SEL selector, @Nullable @Mapped(ObjCObjectMapper.class) Object argument);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("isExecuting")
    public native boolean isExecuting();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("isFinished")
    public native boolean isFinished();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("isMainThread")
    public native boolean isMainThread();

    /**
     * thread body method
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("main")
    public native void main();

    /**
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * read-only after the thread is started
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("qualityOfService")
    @NInt
    public native long qualityOfService();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * read-only after the thread is started
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setQualityOfService:")
    public native void setQualityOfService(@NInt long value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setStackSize:")
    public native void setStackSize(@NUInt long value);

    /**
     * To be deprecated; use qualityOfService below
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setThreadPriority:")
    public native void setThreadPriority(double value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("stackSize")
    @NUInt
    public native long stackSize();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("start")
    public native void start();

    @NotNull
    @Generated
    @Selector("threadDictionary")
    public native NSMutableDictionary<?, ?> threadDictionary();

    /**
     * To be deprecated; use qualityOfService below
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("threadPriority")
    public native double threadPriority();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detachNewThreadWithBlock {
        @Generated
        void call_detachNewThreadWithBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithBlock {
        @Generated
        void call_initWithBlock();
    }
}
