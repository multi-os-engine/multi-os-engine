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
public class NSURLCache extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLCache(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLCache alloc();

    @Generated
    @Selector("setSharedURLCache:")
    public static native void setSharedURLCache(NSURLCache cache);

    @Generated
    @Selector("sharedURLCache")
    public static native NSURLCache sharedURLCache();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("cachedResponseForRequest:")
    public native NSCachedURLResponse cachedResponseForRequest(NSURLRequest request);

    @Generated
    @Selector("currentDiskUsage")
    @NUInt
    public native long currentDiskUsage();

    @Generated
    @Selector("currentMemoryUsage")
    @NUInt
    public native long currentMemoryUsage();

    @Generated
    @Selector("diskCapacity")
    @NUInt
    public native long diskCapacity();

    @Generated
    @Selector("getCachedResponseForDataTask:completionHandler:")
    public native void getCachedResponseForDataTaskCompletionHandler(NSURLSessionDataTask dataTask,
            @ObjCBlock(name = "call_getCachedResponseForDataTaskCompletionHandler") Block_getCachedResponseForDataTaskCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native NSURLCache init();

    @Generated
    @Selector("initWithMemoryCapacity:diskCapacity:diskPath:")
    public native NSURLCache initWithMemoryCapacityDiskCapacityDiskPath(@NUInt long memoryCapacity,
            @NUInt long diskCapacity, String path);

    @Generated
    @Selector("memoryCapacity")
    @NUInt
    public native long memoryCapacity();

    @Generated
    @Selector("removeAllCachedResponses")
    public native void removeAllCachedResponses();

    @Generated
    @Selector("removeCachedResponseForDataTask:")
    public native void removeCachedResponseForDataTask(NSURLSessionDataTask dataTask);

    @Generated
    @Selector("removeCachedResponseForRequest:")
    public native void removeCachedResponseForRequest(NSURLRequest request);

    @Generated
    @Selector("removeCachedResponsesSinceDate:")
    public native void removeCachedResponsesSinceDate(NSDate date);

    @Generated
    @Selector("setDiskCapacity:")
    public native void setDiskCapacity(@NUInt long value);

    @Generated
    @Selector("setMemoryCapacity:")
    public native void setMemoryCapacity(@NUInt long value);

    @Generated
    @Selector("storeCachedResponse:forDataTask:")
    public native void storeCachedResponseForDataTask(NSCachedURLResponse cachedResponse,
            NSURLSessionDataTask dataTask);

    @Generated
    @Selector("storeCachedResponse:forRequest:")
    public native void storeCachedResponseForRequest(NSCachedURLResponse cachedResponse, NSURLRequest request);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCachedResponseForDataTaskCompletionHandler {
        @Generated
        void call_getCachedResponseForDataTaskCompletionHandler(NSCachedURLResponse arg0);
    }
}
