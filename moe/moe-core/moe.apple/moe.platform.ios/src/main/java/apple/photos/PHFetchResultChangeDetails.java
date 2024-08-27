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
import apple.foundation.NSIndexSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHFetchResultChangeDetails<_ObjectType> extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHFetchResultChangeDetails(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHFetchResultChangeDetails<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHFetchResultChangeDetails<?> allocWithZone(VoidPtr zone);

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

    /**
     * Provides a "diff" between 2 PHFetchResult objects.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("changeDetailsFromFetchResult:toFetchResult:changedObjects:")
    public static native <_ObjectType> PHFetchResultChangeDetails<?> changeDetailsFromFetchResultToFetchResultChangedObjects(
            @NotNull PHFetchResult<? extends PHObject> fromResult, @NotNull PHFetchResult<? extends PHObject> toResult,
            @NotNull NSArray<? extends PHObject> changedObjects);

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
    public static native PHFetchResultChangeDetails<?> new_objc();

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
     * The indexes of the updated items, relative to the 'after' state of the fetch result
     * returns nil if hasIncrementalChanges is NO
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("changedIndexes")
    public native NSIndexSet changedIndexes();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("changedObjects")
    public native NSArray<? extends PHObject> changedObjects();

    /**
     * Enumerates the indexes of the moved items, relative to the 'before' state of the fetch result after applying the
     * removedIndexes and insertedIndexes
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("enumerateMovesWithBlock:")
    public native void enumerateMovesWithBlock(
            @NotNull @ObjCBlock(name = "call_enumerateMovesWithBlock") Block_enumerateMovesWithBlock handler);

    /**
     * fetch result with the state of the fetched objects after this change
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchResultAfterChanges")
    public native PHFetchResult<? extends PHObject> fetchResultAfterChanges();

    /**
     * fetch result with the state of the fetched objects before this change (returns the fetch result passed in to
     * changeDetailsForFetchResult:)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchResultBeforeChanges")
    public native PHFetchResult<? extends PHObject> fetchResultBeforeChanges();

    /**
     * YES if the changes to this fetch result are described by the removed/inserted/changed details.
     * NO indicates that the scope of changes were too large and UI clients should do a full reload, incremental changes
     * could not be provided
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("hasIncrementalChanges")
    public native boolean hasIncrementalChanges();

    /**
     * YES if there are moved items
     * returns NO if hasIncrementalChanges is NO
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("hasMoves")
    public native boolean hasMoves();

    @Generated
    @Selector("init")
    public native PHFetchResultChangeDetails<?> init();

    /**
     * The indexes of the inserted items, relative to the 'before' state of the fetch result after applying the
     * removedIndexes
     * returns nil if hasIncrementalChanges is NO
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("insertedIndexes")
    public native NSIndexSet insertedIndexes();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("insertedObjects")
    public native NSArray<? extends PHObject> insertedObjects();

    /**
     * The indexes of the removed items, relative to the 'before' state of the fetch result
     * returns nil if hasIncrementalChanges is NO
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("removedIndexes")
    public native NSIndexSet removedIndexes();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("removedObjects")
    public native NSArray<? extends PHObject> removedObjects();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateMovesWithBlock {
        @Generated
        void call_enumerateMovesWithBlock(@NUInt long fromIndex, @NUInt long toIndex);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
