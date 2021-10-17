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

package apple.videosubscriberaccount;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.videosubscriberaccount.protocol.VSAccountManagerDelegate;
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

/**
 * A VSAccountManager instance coordinates access to a subscriber's account.
 */
@Generated
@Library("VideoSubscriberAccount")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VSAccountManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VSAccountManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VSAccountManager alloc();

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
     * Determine the state of the application's access to the user's subscription information.
     *
     * @param options           The only currently supported option key is VSCheckAccessOptionPrompt.
     * @param completionHandler A block to be called when the request finishes.  It will always be called exactly once.  It may be called before the method call returns.  It may be called on any queue.
     * @param accessStatus      The current state the application's access to the user's subscription information.
     * @param error             If the user did not grant access to the app, this will contain an error describing the result of the operation.
     */
    @Generated
    @Selector("checkAccessStatusWithOptions:completionHandler:")
    public native void checkAccessStatusWithOptionsCompletionHandler(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_checkAccessStatusWithOptionsCompletionHandler") Block_checkAccessStatusWithOptionsCompletionHandler completionHandler);

    /**
     * An object that can help the account manager by presenting and dismissing view controllers when needed, and deciding whether to allow authentication with the selected provider.
     * Some requests may fail if a delegate is not provided.  For example, an account metadata request may require a delegate if it allows interruption.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native VSAccountManagerDelegate delegate();

    /**
     * Begins requesting information about the subscriber's account.
     * [@returns] A result object that may be used to cancel the in-flight request.  Cancellation is advisory, and does not guarantee that the request will finish immediately.
     *
     * @param request           This identifies what specific information the app wants to know.
     * @param completionHandler A block to be called when the request finishes.  It will always be called exactly once.  It may be called before the method call returns.  It may be called on any queue.
     * @param metadata          If the request finished successfully, this will contain information about the subscriber's account.
     * @param error             If the request did not finish successfully, this will contain an error describing the result of the operation.
     */
    @Generated
    @Selector("enqueueAccountMetadataRequest:completionHandler:")
    public native VSAccountManagerResult enqueueAccountMetadataRequestCompletionHandler(
            VSAccountMetadataRequest request,
            @ObjCBlock(name = "call_enqueueAccountMetadataRequestCompletionHandler") Block_enqueueAccountMetadataRequestCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native VSAccountManager init();

    /**
     * An object that can help the account manager by presenting and dismissing view controllers when needed, and deciding whether to allow authentication with the selected provider.
     * Some requests may fail if a delegate is not provided.  For example, an account metadata request may require a delegate if it allows interruption.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) VSAccountManagerDelegate value);

    /**
     * An object that can help the account manager by presenting and dismissing view controllers when needed, and deciding whether to allow authentication with the selected provider.
     * Some requests may fail if a delegate is not provided.  For example, an account metadata request may require a delegate if it allows interruption.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) VSAccountManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkAccessStatusWithOptionsCompletionHandler {
        @Generated
        void call_checkAccessStatusWithOptionsCompletionHandler(@NInt long accessStatus, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enqueueAccountMetadataRequestCompletionHandler {
        @Generated
        void call_enqueueAccountMetadataRequestCompletionHandler(VSAccountMetadata metadata, NSError error);
    }
}
