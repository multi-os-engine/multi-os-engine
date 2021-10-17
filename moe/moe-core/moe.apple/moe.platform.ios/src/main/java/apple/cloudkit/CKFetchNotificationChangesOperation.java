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

package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * CKFetchNotificationChangesOperation
 * <p>
 * An operation that fetches all notification changes.
 * <p>
 * If a change token from a previous @c CKFetchNotificationChangesOperation is passed in, only the notifications that have changed since that token will be fetched.
 * If this is your first fetch, pass nil for the change token.
 * Change tokens are opaque tokens and clients should not infer any behavior based on their content.
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchNotificationChangesOperation extends CKOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchNotificationChangesOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchNotificationChangesOperation alloc();

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
     * This block is called when the operation completes.
     * <p>
     * Clients are responsible for saving the change token at the end of the operation and passing it in to the next call to @c CKFetchNotificationChangesOperation.
     * Note that a fetch can fail partway. If that happens, an updated change token may be returned in the completion block so that already fetched notifications don't need to be re-downloaded on a subsequent operation.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c previousServerChangeToken value was too old and the client should toss its local cache and re-fetch notification changes starting with a nil @c previousServerChangeToken.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("fetchNotificationChangesCompletionBlock")
    @ObjCBlock(name = "call_fetchNotificationChangesCompletionBlock_ret")
    public native Block_fetchNotificationChangesCompletionBlock_ret fetchNotificationChangesCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchNotificationChangesOperation init();

    @Generated
    @Selector("initWithPreviousServerChangeToken:")
    public native CKFetchNotificationChangesOperation initWithPreviousServerChangeToken(
            CKServerChangeToken previousServerChangeToken);

    /**
     * If true, then the server wasn't able to return all the changes in this response.
     * <p>
     * Will be set before @c fetchNotificationChangesCompletionBlock is called.
     * Another @c CKFetchNotificationChangesOperation operation should be run with the updated @c serverChangeToken token from this operation.
     */
    @Generated
    @Selector("moreComing")
    public native boolean moreComing();

    /**
     * Called once for each updated notification fetch from the server
     * <p>
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("notificationChangedBlock")
    @ObjCBlock(name = "call_notificationChangedBlock_ret")
    public native Block_notificationChangedBlock_ret notificationChangedBlock();

    @Generated
    @Selector("previousServerChangeToken")
    public native CKServerChangeToken previousServerChangeToken();

    @Generated
    @Selector("resultsLimit")
    @NUInt
    public native long resultsLimit();

    /**
     * This block is called when the operation completes.
     * <p>
     * Clients are responsible for saving the change token at the end of the operation and passing it in to the next call to @c CKFetchNotificationChangesOperation.
     * Note that a fetch can fail partway. If that happens, an updated change token may be returned in the completion block so that already fetched notifications don't need to be re-downloaded on a subsequent operation.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c previousServerChangeToken value was too old and the client should toss its local cache and re-fetch notification changes starting with a nil @c previousServerChangeToken.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setFetchNotificationChangesCompletionBlock:")
    public native void setFetchNotificationChangesCompletionBlock(
            @ObjCBlock(name = "call_setFetchNotificationChangesCompletionBlock") Block_setFetchNotificationChangesCompletionBlock value);

    /**
     * Called once for each updated notification fetch from the server
     * <p>
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setNotificationChangedBlock:")
    public native void setNotificationChangedBlock(
            @ObjCBlock(name = "call_setNotificationChangedBlock") Block_setNotificationChangedBlock value);

    @Generated
    @Selector("setPreviousServerChangeToken:")
    public native void setPreviousServerChangeToken(CKServerChangeToken value);

    @Generated
    @Selector("setResultsLimit:")
    public native void setResultsLimit(@NUInt long value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchNotificationChangesCompletionBlock_ret {
        @Generated
        void call_fetchNotificationChangesCompletionBlock_ret(CKServerChangeToken arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notificationChangedBlock_ret {
        @Generated
        void call_notificationChangedBlock_ret(CKNotification arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchNotificationChangesCompletionBlock {
        @Generated
        void call_setFetchNotificationChangesCompletionBlock(CKServerChangeToken arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setNotificationChangedBlock {
        @Generated
        void call_setNotificationChangedBlock(CKNotification arg0);
    }
}
