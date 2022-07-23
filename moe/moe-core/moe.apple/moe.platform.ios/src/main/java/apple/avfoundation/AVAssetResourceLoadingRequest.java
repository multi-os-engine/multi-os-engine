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
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetResourceLoadingRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetResourceLoadingRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetResourceLoadingRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetResourceLoadingRequest allocWithZone(VoidPtr zone);

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
    public static native AVAssetResourceLoadingRequest new_objc();

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
     * [@property] contentInformationRequest
     * <p>
     * An instance of AVAssetResourceLoadingContentInformationRequest that you should populate with information about
     * the resource. The value of this property will be nil if no such information is being requested.
     */
    @Generated
    @Selector("contentInformationRequest")
    public native AVAssetResourceLoadingContentInformationRequest contentInformationRequest();

    /**
     * [@property] dataRequest
     * <p>
     * An instance of AVAssetResourceLoadingDataRequest that indicates the range of resource data that's being
     * requested. The value of this property will be nil if no data is being requested.
     */
    @Generated
    @Selector("dataRequest")
    public native AVAssetResourceLoadingDataRequest dataRequest();

    /**
     * finishLoading
     * <p>
     * Causes the receiver to treat the processing of the request as complete.
     * <p>
     * If a dataRequest is present and the resource does not contain the full extent of the data that has been requested
     * according to the values of the requestedOffset and requestedLength properties of the dataRequest, or if
     * requestsAllDataToEndOfResource has a value of YES, you may invoke -finishLoading after you have provided as much
     * of the requested data as the resource contains.
     */
    @Generated
    @Selector("finishLoading")
    public native void finishLoading();

    /**
     * finishLoadingWithError:
     * <p>
     * Causes the receiver to treat the request as having failed.
     *
     * @param error An instance of NSError indicating the reason for failure.
     */
    @Generated
    @Selector("finishLoadingWithError:")
    public native void finishLoadingWithError(NSError error);

    /**
     * finishLoadingWithResponse:data:redirect:
     * <p>
     * Causes the receiver to finish loading a resource that a delegate has previously assumed responsibility for
     * loading by returning YES as the result of -resourceLoader:shouldWaitForLoadingOfRequestedResource:.
     * <p>
     * This method is deprecated. Use the following methods instead.
     * -[AVAssetResourceLoadingRequest setResponse:] to set the response property,
     * -[AVAssetResourceLoadingRequest setRedirect:] to set the redirect property,
     * -[AVAssetResourceLoadingDataRequest respondWithData:] to provide data, and
     * -[AVAssetResourceLoadingRequest finishLoading] to indicate that loading is finished.
     *
     * @param response The NSURLResponse for the NSURLRequest of the receiver. Should be nil if no response is required.
     * @param data     An instance of NSData containing the data of the resource. Should be nil if no such data is
     *                 available.
     * @param redirect An instance of NSURLRequest indicating a redirect of the loading request. Should be nil if no
     *                 redirect is needed.
     */
    @Generated
    @Deprecated
    @Selector("finishLoadingWithResponse:data:redirect:")
    public native void finishLoadingWithResponseDataRedirect(NSURLResponse response, NSData data,
            NSURLRequest redirect);

    @Generated
    @Selector("init")
    public native AVAssetResourceLoadingRequest init();

    /**
     * [@property] cancelled
     * <p>
     * Indicates whether the request has been cancelled.
     * <p>
     * The value of this property becomes YES when the resource loader cancels the loading of a request, just prior to
     * sending the message -resourceLoader:didCancelLoadingRequest: to its delegate.
     */
    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

    /**
     * [@property] finished
     * <p>
     * Indicates whether loading of the resource has been finished.
     * <p>
     * The value of this property becomes YES only in response to an invocation of either -finishLoading or
     * -finishLoadingWithError:.
     */
    @Generated
    @Selector("isFinished")
    public native boolean isFinished();

    /**
     * persistentContentKeyFromKeyVendorResponse:options:error:
     * <p>
     * Obtains a persistable content key from a context.
     * <p>
     * The data returned from this method may be used to immediately satisfy an AVAssetResourceLoadingDataRequest, as
     * well as any subsequent requests for the same key url. The value of
     * AVAssetResourceLoadingContentInformationRequest.contentType must be set to
     * AVStreamingKeyDeliveryPersistentContentKeyType when responding with data created with this method.
     *
     * @param keyVendorResponse The response returned from the key vendor as a result of a request generated from
     *                          streamingContentKeyRequestDataForApp:contentIdentifier:options:error:.
     * @param options           Additional information necessary to obtain the persistable content key, or nil if none.
     * @param outError          If obtaining the persistable content key fails, will be set to an instance of NSError
     *                          describing the failure.
     * @return The persistable content key data that may be stored offline to answer future loading requests of the same
     *         content key.
     */
    @Generated
    @Selector("persistentContentKeyFromKeyVendorResponse:options:error:")
    public native NSData persistentContentKeyFromKeyVendorResponseOptionsError(NSData keyVendorResponse,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] redirect
     * <p>
     * Set the value of this property to an instance of NSURLRequest indicating a redirection of the loading request to
     * another URL. If no redirection is needed, leave the value of this property set to nil.
     * <p>
     * AVAssetResourceLoader supports redirects to HTTP URLs only. Redirects to other URLs will result in a loading
     * failure.
     */
    @Generated
    @Selector("redirect")
    public native NSURLRequest redirect();

    /**
     * [@property] request
     * <p>
     * An NSURLRequest for the requested resource.
     */
    @Generated
    @Selector("request")
    public native NSURLRequest request();

    /**
     * [@property] response
     * <p>
     * Set the value of this property to an instance of NSURLResponse indicating a response to the loading request. If
     * no response is needed, leave the value of this property set to nil.
     */
    @Generated
    @Selector("response")
    public native NSURLResponse response();

    /**
     * [@property] redirect
     * <p>
     * Set the value of this property to an instance of NSURLRequest indicating a redirection of the loading request to
     * another URL. If no redirection is needed, leave the value of this property set to nil.
     * <p>
     * AVAssetResourceLoader supports redirects to HTTP URLs only. Redirects to other URLs will result in a loading
     * failure.
     */
    @Generated
    @Selector("setRedirect:")
    public native void setRedirect(NSURLRequest value);

    /**
     * [@property] response
     * <p>
     * Set the value of this property to an instance of NSURLResponse indicating a response to the loading request. If
     * no response is needed, leave the value of this property set to nil.
     */
    @Generated
    @Selector("setResponse:")
    public native void setResponse(NSURLResponse value);

    /**
     * streamingContentKeyRequestDataForApp:contentIdentifier:options:error:
     * <p>
     * Obtains a streaming content key request for a specific combination of application and content.
     *
     * @param appIdentifier     An opaque identifier for the application. The value of this identifier depends on the
     *                          particular system used to provide the decryption key.
     * @param contentIdentifier An opaque identifier for the content. The value of this identifier depends on the
     *                          particular system used to provide the decryption key.
     * @param options           Additional information necessary to obtain the key, or nil if none.
     * @param outError          If obtaining the streaming content key request fails, will be set to an instance of
     *                          NSError describing the failure.
     * @return The key request data that must be transmitted to the key vendor to obtain the content key.
     */
    @Generated
    @Selector("streamingContentKeyRequestDataForApp:contentIdentifier:options:error:")
    public native NSData streamingContentKeyRequestDataForAppContentIdentifierOptionsError(NSData appIdentifier,
            NSData contentIdentifier, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] requestor
     * <p>
     * The AVAssetResourceLoadingRequestor that made this request
     */
    @Generated
    @Selector("requestor")
    public native AVAssetResourceLoadingRequestor requestor();
}
