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
import apple.foundation.NSDictionary;
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

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchRecordZonesOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchRecordZonesOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchRecordZonesOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKFetchRecordZonesOperation allocWithZone(VoidPtr zone);

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
    @Selector("fetchAllRecordZonesOperation")
    public static native CKFetchRecordZonesOperation fetchAllRecordZonesOperation();

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
    public static native CKFetchRecordZonesOperation new_objc();

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
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of zoneIDs to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] recordZonesByZoneID and any @c CKPartialErrorsByItemIDKey errors are repeats of the data sent back in previous @c perRecordZoneCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("fetchRecordZonesCompletionBlock")
    @ObjCBlock(name = "call_fetchRecordZonesCompletionBlock_ret")
    public native Block_fetchRecordZonesCompletionBlock_ret fetchRecordZonesCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchRecordZonesOperation init();

    @Generated
    @Selector("initWithRecordZoneIDs:")
    public native CKFetchRecordZonesOperation initWithRecordZoneIDs(NSArray<? extends CKRecordZoneID> zoneIDs);

    @Generated
    @Selector("recordZoneIDs")
    public native NSArray<? extends CKRecordZoneID> recordZoneIDs();

    /**
     * This block is called when the operation completes.
     * <p>
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of zoneIDs to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] recordZonesByZoneID and any @c CKPartialErrorsByItemIDKey errors are repeats of the data sent back in previous @c perRecordZoneCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("setFetchRecordZonesCompletionBlock:")
    public native void setFetchRecordZonesCompletionBlock(
            @ObjCBlock(name = "call_setFetchRecordZonesCompletionBlock") Block_setFetchRecordZonesCompletionBlock value);

    @Generated
    @Selector("setRecordZoneIDs:")
    public native void setRecordZoneIDs(NSArray<? extends CKRecordZoneID> value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRecordZonesCompletionBlock_ret {
        @Generated
        void call_fetchRecordZonesCompletionBlock_ret(
                NSDictionary<? extends CKRecordZoneID, ? extends CKRecordZone> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchRecordZonesCompletionBlock {
        @Generated
        void call_setFetchRecordZonesCompletionBlock(
                NSDictionary<? extends CKRecordZoneID, ? extends CKRecordZone> arg0, NSError arg1);
    }

    /**
     * Called on success or failure for each record zone.
     * <p>
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("perRecordZoneCompletionBlock")
    @ObjCBlock(name = "call_perRecordZoneCompletionBlock_ret")
    public native Block_perRecordZoneCompletionBlock_ret perRecordZoneCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordZoneCompletionBlock_ret {
        @Generated
        void call_perRecordZoneCompletionBlock_ret(CKRecordZoneID arg0, CKRecordZone arg1, NSError arg2);
    }

    /**
     * Called on success or failure for each record zone.
     * <p>
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setPerRecordZoneCompletionBlock:")
    public native void setPerRecordZoneCompletionBlock(
            @ObjCBlock(name = "call_setPerRecordZoneCompletionBlock") Block_setPerRecordZoneCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordZoneCompletionBlock {
        @Generated
        void call_setPerRecordZoneCompletionBlock(CKRecordZoneID arg0, CKRecordZone arg1, NSError arg2);
    }
}
