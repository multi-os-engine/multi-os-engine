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
 * CKFetchWebAuthTokenOperation
 * 
 * This operation will fetch a web auth token given an API token obtained from the CloudKit Dashboard for your container
 * 
 * API-Since: 9.2
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchWebAuthTokenOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchWebAuthTokenOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchWebAuthTokenOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKFetchWebAuthTokenOperation allocWithZone(VoidPtr zone);

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
    public static native CKFetchWebAuthTokenOperation new_objc();

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
     * APIToken is expected to be set before you begin this operation.
     */
    @Generated
    @Selector("APIToken")
    public native String APIToken();

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("fetchWebAuthTokenCompletionBlock")
    @ObjCBlock(name = "call_fetchWebAuthTokenCompletionBlock_ret")
    public native Block_fetchWebAuthTokenCompletionBlock_ret fetchWebAuthTokenCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchWebAuthTokenOperation init();

    @Generated
    @Selector("initWithAPIToken:")
    public native CKFetchWebAuthTokenOperation initWithAPIToken(String APIToken);

    /**
     * APIToken is expected to be set before you begin this operation.
     */
    @Generated
    @Selector("setAPIToken:")
    public native void setAPIToken(String value);

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setFetchWebAuthTokenCompletionBlock:")
    public native void setFetchWebAuthTokenCompletionBlock(
            @ObjCBlock(name = "call_setFetchWebAuthTokenCompletionBlock") Block_setFetchWebAuthTokenCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchWebAuthTokenCompletionBlock_ret {
        @Generated
        void call_fetchWebAuthTokenCompletionBlock_ret(String arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchWebAuthTokenCompletionBlock {
        @Generated
        void call_setFetchWebAuthTokenCompletionBlock(String arg0, NSError arg1);
    }
}
