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
    @Owned
    @Selector("alloc")
    public static native CKFetchNotificationChangesOperation alloc();

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

    @Generated
    @Selector("init")
    public native CKFetchNotificationChangesOperation init();

    @Generated
    @Selector("initWithPreviousServerChangeToken:")
    public native CKFetchNotificationChangesOperation initWithPreviousServerChangeToken(
            CKServerChangeToken previousServerChangeToken);

    @Generated
    @Selector("moreComing")
    public native boolean moreComing();

    @Generated
    @Selector("previousServerChangeToken")
    public native CKServerChangeToken previousServerChangeToken();

    @Generated
    @Selector("resultsLimit")
    @NUInt
    public native long resultsLimit();

    @Generated
    @Selector("setFetchNotificationChangesCompletionBlock:")
    public native void setFetchNotificationChangesCompletionBlock(
            @ObjCBlock(name = "call_setFetchNotificationChangesCompletionBlock") Block_setFetchNotificationChangesCompletionBlock value);

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

    @Generated
    @Selector("fetchNotificationChangesCompletionBlock")
    @ObjCBlock(name = "call_fetchNotificationChangesCompletionBlock_ret")
    public native Block_fetchNotificationChangesCompletionBlock_ret fetchNotificationChangesCompletionBlock();

    @Generated
    @Selector("notificationChangedBlock")
    @ObjCBlock(name = "call_notificationChangedBlock_ret")
    public native Block_notificationChangedBlock_ret notificationChangedBlock();

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
}
