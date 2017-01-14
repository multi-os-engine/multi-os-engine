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
import apple.foundation.NSURL;
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
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchShareMetadataOperation extends CKOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchShareMetadataOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchShareMetadataOperation alloc();

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

    @Generated
    @Selector("fetchShareMetadataCompletionBlock")
    @ObjCBlock(name = "call_fetchShareMetadataCompletionBlock_ret")
    public native Block_fetchShareMetadataCompletionBlock_ret fetchShareMetadataCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchShareMetadataOperation init();

    @Generated
    @Selector("initWithShareURLs:")
    public native CKFetchShareMetadataOperation initWithShareURLs(NSArray<? extends NSURL> shareURLs);

    @Generated
    @Selector("perShareMetadataBlock")
    @ObjCBlock(name = "call_perShareMetadataBlock_ret")
    public native Block_perShareMetadataBlock_ret perShareMetadataBlock();

    @Generated
    @Selector("rootRecordDesiredKeys")
    public native NSArray<String> rootRecordDesiredKeys();

    @Generated
    @Selector("setFetchShareMetadataCompletionBlock:")
    public native void setFetchShareMetadataCompletionBlock(
            @ObjCBlock(name = "call_setFetchShareMetadataCompletionBlock") Block_setFetchShareMetadataCompletionBlock value);

    @Generated
    @Selector("setPerShareMetadataBlock:")
    public native void setPerShareMetadataBlock(
            @ObjCBlock(name = "call_setPerShareMetadataBlock") Block_setPerShareMetadataBlock value);

    @Generated
    @Selector("setRootRecordDesiredKeys:")
    public native void setRootRecordDesiredKeys(NSArray<String> value);

    @Generated
    @Selector("setShareURLs:")
    public native void setShareURLs(NSArray<? extends NSURL> value);

    @Generated
    @Selector("setShouldFetchRootRecord:")
    public native void setShouldFetchRootRecord(boolean value);

    @Generated
    @Selector("shareURLs")
    public native NSArray<? extends NSURL> shareURLs();

    @Generated
    @Selector("shouldFetchRootRecord")
    public native boolean shouldFetchRootRecord();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareMetadataCompletionBlock_ret {
        @Generated
        void call_fetchShareMetadataCompletionBlock_ret(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perShareMetadataBlock_ret {
        @Generated
        void call_perShareMetadataBlock_ret(NSURL arg0, CKShareMetadata arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchShareMetadataCompletionBlock {
        @Generated
        void call_setFetchShareMetadataCompletionBlock(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerShareMetadataBlock {
        @Generated
        void call_setPerShareMetadataBlock(NSURL arg0, CKShareMetadata arg1, NSError arg2);
    }
}
