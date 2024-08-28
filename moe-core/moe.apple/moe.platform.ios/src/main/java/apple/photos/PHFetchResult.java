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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSFastEnumeration;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Accessing fetched results (fetches objects from the backing store in chunks on demand rather than all at once)
 * Fetched objects will be kept in a cache and purged under memory pressure
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHFetchResult<_ObjectType> extends NSObject implements NSCopying, NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected PHFetchResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHFetchResult<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHFetchResult<?> allocWithZone(VoidPtr zone);

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
    public static native PHFetchResult<?> new_objc();

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
     * API-Since: 8.0
     */
    @Generated
    @Selector("containsObject:")
    public native boolean containsObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(@NotNull VoidPtr state,
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("countOfAssetsWithMediaType:")
    @NUInt
    public native long countOfAssetsWithMediaType(@NInt long mediaType);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexesOptionsUsingBlock(@NotNull NSIndexSet s, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateObjectsAtIndexesOptionsUsingBlock") Block_enumerateObjectsAtIndexesOptionsUsingBlock block);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @NotNull @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptionsUsingBlock(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("firstObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType firstObject();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("indexOfObject:")
    @NUInt
    public native long indexOfObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("indexOfObject:inRange:")
    @NUInt
    public native long indexOfObjectInRange(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    @Generated
    @Selector("init")
    public native PHFetchResult<?> init();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("lastObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType lastObject();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("objectAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectAtIndex(@NUInt long index);

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("objectAtIndexedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectAtIndexedSubscript(@NUInt long idx);

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("objectsAtIndexes:")
    public native NSArray<_ObjectType> objectsAtIndexes(@NotNull NSIndexSet indexes);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsAtIndexesOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsAtIndexesOptionsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsUsingBlock {
        @Generated
        void call_enumerateObjectsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object obj, @NUInt long idx,
                @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsWithOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsWithOptionsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
