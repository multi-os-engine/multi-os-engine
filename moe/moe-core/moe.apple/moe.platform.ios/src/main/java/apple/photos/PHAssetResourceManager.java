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

package apple.photos;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * API-Since: 9.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHAssetResourceManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHAssetResourceManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHAssetResourceManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHAssetResourceManager allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("defaultManager")
    public static native PHAssetResourceManager defaultManager();

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
    public static native PHAssetResourceManager new_objc();

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
     * API-Since: 9.0
     */
    @Generated
    @Selector("cancelDataRequest:")
    public native void cancelDataRequest(int requestID);

    @Generated
    @Selector("init")
    public native PHAssetResourceManager init();

    /**
     * Handlers are called on an arbitrary serial queue. The lifetime of the data is not guaranteed beyond that of the
     * handler.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("requestDataForAssetResource:options:dataReceivedHandler:completionHandler:")
    public native int requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler(PHAssetResource resource,
            PHAssetResourceRequestOptions options,
            @ObjCBlock(name = "call_requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler_2") Block_requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler_2 handler,
            @ObjCBlock(name = "call_requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler_3") Block_requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler_3 completionHandler);

    /**
     * Handlers are called on an arbitrary serial queue.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("writeDataForAssetResource:toFile:options:completionHandler:")
    public native void writeDataForAssetResourceToFileOptionsCompletionHandler(PHAssetResource resource, NSURL fileURL,
            PHAssetResourceRequestOptions options,
            @ObjCBlock(name = "call_writeDataForAssetResourceToFileOptionsCompletionHandler") Block_writeDataForAssetResourceToFileOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler_2 {
        @Generated
        void call_requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler_2(NSData data);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler_3 {
        @Generated
        void call_requestDataForAssetResourceOptionsDataReceivedHandlerCompletionHandler_3(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeDataForAssetResourceToFileOptionsCompletionHandler {
        @Generated
        void call_writeDataForAssetResourceToFileOptionsCompletionHandler(NSError error);
    }
}
