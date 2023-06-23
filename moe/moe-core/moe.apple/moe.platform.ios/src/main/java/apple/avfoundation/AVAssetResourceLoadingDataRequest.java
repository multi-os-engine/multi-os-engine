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

package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetResourceLoadingDataRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetResourceLoadingDataRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetResourceLoadingDataRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetResourceLoadingDataRequest allocWithZone(VoidPtr zone);

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
    public static native AVAssetResourceLoadingDataRequest new_objc();

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
     * [@property] currentOffset
     * 
     * The position within the resource of the next byte within the resource following the bytes that have already been
     * provided via prior invocations of -respondWithData.
     */
    @Generated
    @Selector("currentOffset")
    public native long currentOffset();

    @Generated
    @Selector("init")
    public native AVAssetResourceLoadingDataRequest init();

    /**
     * [@property] requestedLength
     * 
     * The length of the data requested.
     * 
     * Note that requestsAllDataToEndOfResource will be set to YES when the entire remaining length of the resource is
     * being requested from requestedOffset to the end of the resource. This can occur even when the content length has
     * not yet been reported by you via a prior finished loading request.
     * When requestsAllDataToEndOfResource has a value of YES, you should disregard the value of requestedLength and
     * incrementally provide as much data starting from the requestedOffset as the resource contains, until you have
     * provided all of the available data successfully and invoked -finishLoading, until you have encountered a failure
     * and invoked -finishLoadingWithError:, or until you have received -resourceLoader:didCancelLoadingRequest: for the
     * AVAssetResourceLoadingRequest from which the AVAssetResourceLoadingDataRequest was obtained.
     * When requestsAllDataToEndOfResource is YES and the content length has not yet been provided by you via a prior
     * finished loading request, the value of requestedLength is set to NSIntegerMax. Starting in OS X 10.11 and iOS
     * 9.0, in 32-bit applications requestedLength is also set to NSIntegerMax when all of the remaining resource data
     * is being requested and the known length of the remaining data exceeds NSIntegerMax.
     */
    @Generated
    @Selector("requestedLength")
    @NInt
    public native long requestedLength();

    /**
     * [@property] requestedOffset
     * 
     * The position within the resource of the first byte requested.
     */
    @Generated
    @Selector("requestedOffset")
    public native long requestedOffset();

    /**
     * [@property] requestsAllDataToEndOfResource
     * 
     * Specifies that the entire remaining length of the resource from requestedOffset to the end of the resource is
     * being requested.
     * 
     * When requestsAllDataToEndOfResource has a value of YES, you should disregard the value of requestedLength and
     * incrementally provide as much data starting from the requestedOffset as the resource contains, until you have
     * provided all of the available data successfully and invoked -finishLoading, until you have encountered a failure
     * and invoked -finishLoadingWithError:, or until you have received -resourceLoader:didCancelLoadingRequest: for the
     * AVAssetResourceLoadingRequest from which the AVAssetResourceLoadingDataRequest was obtained.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("requestsAllDataToEndOfResource")
    public native boolean requestsAllDataToEndOfResource();

    /**
     * respondWithData:
     * 
     * Provides data to the receiver.
     * 
     * May be invoked multiple times on the same instance of AVAssetResourceLoadingDataRequest to provide the full range
     * of requested data incrementally. Upon each invocation, the value of currentOffset will be updated to accord with
     * the amount of data provided.
     * The instance of NSData that you provide may be retained for use in parsing or other processing for an indefinite
     * period of time after this method returns. For this reason, if you are providing an instance of NSMutableData, you
     * should avoid mutating it further after sharing its contents. If you are managing your own memory pool for I/O and
     * resource loading, consider using -[NSData initWithBytesNoCopy:length:deallocator:] in order to receive
     * notification of the earliest opportunity for safe recycling of the underlying memory.
     * 
     * @param data
     *             An instance of NSData containing some or all of the requested bytes.
     */
    @Generated
    @Selector("respondWithData:")
    public native void respondWithData(@NotNull NSData data);
}
