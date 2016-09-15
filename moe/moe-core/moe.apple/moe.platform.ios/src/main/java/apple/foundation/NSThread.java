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
    @Owned
    @Selector("alloc")
    public static native NSThread alloc();

    /**
     * callStackReturnAddresses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/callStackReturnAddresses">iOS Dev Center</a>
     */
    @Generated
    @Selector("callStackReturnAddresses")
    public static native NSArray<? extends NSNumber> callStackReturnAddresses();

    /**
     * callStackSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/callStackSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("callStackSymbols")
    public static native NSArray<String> callStackSymbols();

    /**
     * cancel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instm/NSThread/cancel">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * currentThread</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/currentThread">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentThread")
    public static native NSThread currentThread();

    /**
     * detachNewThreadSelector:toTarget:withObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/detachNewThreadSelector:toTarget:withObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("detachNewThreadSelector:toTarget:withObject:")
    public static native void detachNewThreadSelectorToTargetWithObject(SEL selector,
            @Mapped(ObjCObjectMapper.class) Object target, @Mapped(ObjCObjectMapper.class) Object argument);

    /**
     * exit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/exit">iOS Dev Center</a>
     */
    @Generated
    @Selector("exit")
    public static native void exit();

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instm/NSThread/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSThread init();

    /**
     * initWithTarget:selector:object:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instm/NSThread/initWithTarget:selector:object:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTarget:selector:object:")
    public native NSThread initWithTargetSelectorObject(@Mapped(ObjCObjectMapper.class) Object target, SEL selector,
            @Mapped(ObjCObjectMapper.class) Object argument);

    /**
     * cancelled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/cancelled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

    /**
     * executing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/executing">iOS Dev Center</a>
     */
    @Generated
    @Selector("isExecuting")
    public native boolean isExecuting();

    /**
     * finished</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/finished">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFinished")
    public native boolean isFinished();

    /**
     * isMainThread</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/isMainThread">iOS Dev Center</a>
     */
    @Generated
    @Selector("isMainThread")
    public native boolean isMainThread();

    /**
     * isMainThread</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/isMainThread">iOS Dev Center</a>
     */
    @Generated
    @Selector("isMainThread")
    public static native boolean isMainThread_static();

    /**
     * isMultiThreaded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/isMultiThreaded">iOS Dev Center</a>
     */
    @Generated
    @Selector("isMultiThreaded")
    public static native boolean isMultiThreaded();

    /**
     * main</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instm/NSThread/main">iOS Dev Center</a>
     */
    @Generated
    @Selector("main")
    public native void main();

    /**
     * mainThread</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/mainThread">iOS Dev Center</a>
     */
    @Generated
    @Selector("mainThread")
    public static native NSThread mainThread();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("qualityOfService")
    @NInt
    public native long qualityOfService();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setQualityOfService:")
    public native void setQualityOfService(@NInt long value);

    /**
     * stackSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/stackSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStackSize:")
    public native void setStackSize(@NUInt long value);

    /**
     * setThreadPriority:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/setThreadPriority:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setThreadPriority:")
    public static native boolean setThreadPriority_static(double p);

    /**
     * threadPriority</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/threadPriority">iOS Dev Center</a>
     */
    @Generated
    @Selector("setThreadPriority:")
    public native void setThreadPriority(double value);

    /**
     * sleepForTimeInterval:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/sleepForTimeInterval:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sleepForTimeInterval:")
    public static native void sleepForTimeInterval(double ti);

    /**
     * sleepUntilDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/sleepUntilDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sleepUntilDate:")
    public static native void sleepUntilDate(NSDate date);

    /**
     * stackSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/stackSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("stackSize")
    @NUInt
    public native long stackSize();

    /**
     * start</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instm/NSThread/start">iOS Dev Center</a>
     */
    @Generated
    @Selector("start")
    public native void start();

    /**
     * threadDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/threadDictionary">iOS Dev Center</a>
     */
    @Generated
    @Selector("threadDictionary")
    public native NSMutableDictionary<?, ?> threadDictionary();

    /**
     * threadPriority</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/clm/NSThread/threadPriority">iOS Dev Center</a>
     */
    @Generated
    @Selector("threadPriority")
    public static native double threadPriority_static();

    /**
     * threadPriority</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSThread_Class/index.html#//apple_ref/occ/instp/NSThread/threadPriority">iOS Dev Center</a>
     */
    @Generated
    @Selector("threadPriority")
    public native double threadPriority();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
}
