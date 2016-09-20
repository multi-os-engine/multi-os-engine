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
    @Owned
    @Selector("alloc")
    public static native PHFetchResult<?> alloc();

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

    /**
     * containsObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/containsObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsObject:")
    public native boolean containsObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * count</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instp/PHFetchResult/count">iOS Dev Center</a>
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state, Ptr<ObjCObject> buffer, @NUInt long len);

    /**
     * countOfAssetsWithMediaType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/countOfAssetsWithMediaType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("countOfAssetsWithMediaType:")
    @NUInt
    public native long countOfAssetsWithMediaType(@NInt long mediaType);

    /**
     * enumerateObjectsAtIndexes:options:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/enumerateObjectsAtIndexes:options:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexesOptionsUsingBlock(NSIndexSet s, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateObjectsAtIndexesOptionsUsingBlock") Block_enumerateObjectsAtIndexesOptionsUsingBlock block);

    /**
     * enumerateObjectsUsingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/enumerateObjectsUsingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    /**
     * enumerateObjectsWithOptions:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/enumerateObjectsWithOptions:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

    /**
     * firstObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instp/PHFetchResult/firstObject">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("firstObject")
    public native _ObjectType firstObject();

    /**
     * indexOfObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/indexOfObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObject:")
    @NUInt
    public native long indexOfObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * indexOfObject:inRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/indexOfObject:inRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObject:inRange:")
    @NUInt
    public native long indexOfObjectInRange(@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    @Generated
    @Selector("init")
    public native PHFetchResult<?> init();

    /**
     * lastObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instp/PHFetchResult/lastObject">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("lastObject")
    public native _ObjectType lastObject();

    /**
     * objectAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/objectAtIndex:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("objectAtIndex:")
    public native _ObjectType objectAtIndex(@NUInt long index);

    /**
     * objectAtIndexedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/objectAtIndexedSubscript:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native _ObjectType objectAtIndexedSubscript(@NUInt long idx);

    /**
     * objectsAtIndexes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResult_Class/index.html#//apple_ref/occ/instm/PHFetchResult/objectsAtIndexes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectsAtIndexes:")
    public native NSArray<_ObjectType> objectsAtIndexes(NSIndexSet indexes);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsAtIndexesOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsAtIndexesOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsUsingBlock {
        @Generated
        void call_enumerateObjectsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsWithOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsWithOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }
}
