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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOperationQueue extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSOperationQueue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSOperationQueue alloc();

    /**
     * currentQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/clm/NSOperationQueue/currentQueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentQueue")
    public static native NSOperationQueue currentQueue();

    /**
     * mainQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/clm/NSOperationQueue/mainQueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("mainQueue")
    public static native NSOperationQueue mainQueue();

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

    /**
     * addOperation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instm/NSOperationQueue/addOperation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOperation:")
    public native void addOperation(NSOperation op);

    /**
     * addOperationWithBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instm/NSOperationQueue/addOperationWithBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOperationWithBlock:")
    public native void addOperationWithBlock(
            @ObjCBlock(name = "call_addOperationWithBlock") Block_addOperationWithBlock block);

    /**
     * addOperations:waitUntilFinished:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instm/NSOperationQueue/addOperations:waitUntilFinished:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOperations:waitUntilFinished:")
    public native void addOperationsWaitUntilFinished(NSArray<? extends NSOperation> ops, boolean wait_);

    /**
     * cancelAllOperations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instm/NSOperationQueue/cancelAllOperations">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelAllOperations")
    public native void cancelAllOperations();

    @Generated
    @Selector("init")
    public native NSOperationQueue init();

    /**
     * suspended</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/suspended">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSuspended")
    public native boolean isSuspended();

    /**
     * suspended</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/suspended">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSuspended:")
    public native void setSuspended(boolean value);

    /**
     * maxConcurrentOperationCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/maxConcurrentOperationCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxConcurrentOperationCount")
    @NInt
    public native long maxConcurrentOperationCount();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * operationCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/operationCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("operationCount")
    @NUInt
    public native long operationCount();

    /**
     * operations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/operations">iOS Dev Center</a>
     */
    @Generated
    @Selector("operations")
    public native NSArray<? extends NSOperation> operations();

    /**
     * qualityOfService</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/qualityOfService">iOS Dev Center</a>
     */
    @Generated
    @Selector("qualityOfService")
    @NInt
    public native long qualityOfService();

    /**
     * maxConcurrentOperationCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/maxConcurrentOperationCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaxConcurrentOperationCount:")
    public native void setMaxConcurrentOperationCount(@NInt long value);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * qualityOfService</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/qualityOfService">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQualityOfService:")
    public native void setQualityOfService(@NInt long value);

    /**
     * underlyingQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/underlyingQueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUnderlyingQueue:")
    public native void setUnderlyingQueue_unsafe(NSObject value);

    /**
     * underlyingQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/underlyingQueue">iOS Dev Center</a>
     */
    @Generated
    public void setUnderlyingQueue(NSObject value) {
        Object __old = underlyingQueue();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setUnderlyingQueue_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * underlyingQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instp/NSOperationQueue/underlyingQueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("underlyingQueue")
    public native NSObject underlyingQueue();

    /**
     * waitUntilAllOperationsAreFinished</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperationQueue_class/index.html#//apple_ref/occ/instm/NSOperationQueue/waitUntilAllOperationsAreFinished">iOS Dev Center</a>
     */
    @Generated
    @Selector("waitUntilAllOperationsAreFinished")
    public native void waitUntilAllOperationsAreFinished();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addOperationWithBlock {
        @Generated
        void call_addOperationWithBlock();
    }
}
