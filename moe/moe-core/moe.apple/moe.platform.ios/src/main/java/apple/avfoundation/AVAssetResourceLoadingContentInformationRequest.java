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
import apple.foundation.NSDate;
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
public class AVAssetResourceLoadingContentInformationRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetResourceLoadingContentInformationRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetResourceLoadingContentInformationRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetResourceLoadingContentInformationRequest allocWithZone(VoidPtr zone);

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
    public static native AVAssetResourceLoadingContentInformationRequest new_objc();

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
     * [@property] contentLength
     * 
     * Indicates the length of the requested resource, in bytes.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if its contentInformationRequest is not nil, you
     * should set the value of this property to the number of bytes contained by the requested resource.
     */
    @Generated
    @Selector("contentLength")
    public native long contentLength();

    /**
     * [@property] contentType
     * 
     * A UTI that indicates the type of data contained by the requested resource.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if its contentInformationRequest is not nil, you
     * should set the value of this property to a UTI indicating the type of data contained by the requested resource.
     */
    @Nullable
    @Generated
    @Selector("contentType")
    public native String contentType();

    @Generated
    @Selector("init")
    public native AVAssetResourceLoadingContentInformationRequest init();

    /**
     * [@property] byteRangeAccessSupported
     * 
     * Indicates whether random access to arbitrary ranges of bytes of the resource is supported. Such support also
     * allows portions of the resource to be requested more than once.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if its contentInformationRequest is not nil, you
     * should set the value of this property to YES if you support random access to arbitrary ranges of bytes of the
     * resource. If you do not set this property to YES for resources that must be loaded incrementally, loading of the
     * resource may fail. Such resources include anything that contains media data.
     */
    @Generated
    @Selector("isByteRangeAccessSupported")
    public native boolean isByteRangeAccessSupported();

    /**
     * [@property] byteRangeAccessSupported
     * 
     * Indicates whether random access to arbitrary ranges of bytes of the resource is supported. Such support also
     * allows portions of the resource to be requested more than once.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if its contentInformationRequest is not nil, you
     * should set the value of this property to YES if you support random access to arbitrary ranges of bytes of the
     * resource. If you do not set this property to YES for resources that must be loaded incrementally, loading of the
     * resource may fail. Such resources include anything that contains media data.
     */
    @Generated
    @Selector("setByteRangeAccessSupported:")
    public native void setByteRangeAccessSupported(boolean value);

    /**
     * [@property] renewalDate
     * 
     * For resources that expire, the date at which a new AVAssetResourceLoadingRequest will be issued for a renewal of
     * this resource, if the media system still requires it.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if the resource is prone to expiry you should set the
     * value of this property to the date at which a renewal should be triggered. This value should be set sufficiently
     * early enough to allow an AVAssetResourceRenewalRequest, delivered to your delegate via
     * -resourceLoader:shouldWaitForRenewalOfRequestedResource:, to finish before the actual expiry time. Otherwise
     * media playback may fail.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("renewalDate")
    public native NSDate renewalDate();

    /**
     * [@property] contentLength
     * 
     * Indicates the length of the requested resource, in bytes.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if its contentInformationRequest is not nil, you
     * should set the value of this property to the number of bytes contained by the requested resource.
     */
    @Generated
    @Selector("setContentLength:")
    public native void setContentLength(long value);

    /**
     * [@property] contentType
     * 
     * A UTI that indicates the type of data contained by the requested resource.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if its contentInformationRequest is not nil, you
     * should set the value of this property to a UTI indicating the type of data contained by the requested resource.
     */
    @Generated
    @Selector("setContentType:")
    public native void setContentType(@Nullable String value);

    /**
     * [@property] renewalDate
     * 
     * For resources that expire, the date at which a new AVAssetResourceLoadingRequest will be issued for a renewal of
     * this resource, if the media system still requires it.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if the resource is prone to expiry you should set the
     * value of this property to the date at which a renewal should be triggered. This value should be set sufficiently
     * early enough to allow an AVAssetResourceRenewalRequest, delivered to your delegate via
     * -resourceLoader:shouldWaitForRenewalOfRequestedResource:, to finish before the actual expiry time. Otherwise
     * media playback may fail.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setRenewalDate:")
    public native void setRenewalDate(@Nullable NSDate value);

    /**
     * [@property] allowedContentTypes
     * 
     * An array showing the types of data which will be accepted as a valid response for the requested resource.
     * 
     * If allowedContentTypes is nonnil and the contentType property is not in allowedContentTypes, an exception will be
     * raised.
     * 
     * API-Since: 11.2
     */
    @Nullable
    @Generated
    @Selector("allowedContentTypes")
    public native NSArray<String> allowedContentTypes();

    /**
     * [@property] entireLengthAvailableOnDemand
     * 
     * Indicates whether asset data loading can expect data to be produced immediately.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if its contentInformationRequest is not nil, you may
     * set this property to YES to indicate that all asset data can be produced immediately, e.g., because the data is
     * fully cached, or because the custom URL scheme ultimately refers to files on local storage. This allows
     * significant data flow optimizations. For backward compatibility, this property defaults to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isEntireLengthAvailableOnDemand")
    public native boolean isEntireLengthAvailableOnDemand();

    /**
     * [@property] entireLengthAvailableOnDemand
     * 
     * Indicates whether asset data loading can expect data to be produced immediately.
     * 
     * Before you finish loading an AVAssetResourceLoadingRequest, if its contentInformationRequest is not nil, you may
     * set this property to YES to indicate that all asset data can be produced immediately, e.g., because the data is
     * fully cached, or because the custom URL scheme ultimately refers to files on local storage. This allows
     * significant data flow optimizations. For backward compatibility, this property defaults to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setEntireLengthAvailableOnDemand:")
    public native void setEntireLengthAvailableOnDemand(boolean value);
}
