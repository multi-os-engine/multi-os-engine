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

package apple.foundation;

import apple.NSObject;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableOrderedSet<_ObjectType> extends NSOrderedSet<_ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableOrderedSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableOrderedSet<?> alloc();

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
    @Selector("orderedSet")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSet();

    @Generated
    @Selector("orderedSetWithArray:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithArray(NSArray<_ObjectType> array);

    @Generated
    @Selector("orderedSetWithArray:range:copyItems:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithArrayRangeCopyItems(
            NSArray<_ObjectType> array, @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("orderedSetWithCapacity:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("orderedSetWithObject:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithObject(
            @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("orderedSetWithObjects:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithObjects(
            @Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("orderedSetWithObjects:count:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithObjectsCount(
            @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("orderedSetWithOrderedSet:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithOrderedSet(NSOrderedSet<_ObjectType> set);

    @Generated
    @Selector("orderedSetWithOrderedSet:range:copyItems:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithOrderedSetRangeCopyItems(
            NSOrderedSet<_ObjectType> set, @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("orderedSetWithSet:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithSet(NSSet<_ObjectType> set);

    @Generated
    @Selector("orderedSetWithSet:copyItems:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithSetCopyItems(NSSet<_ObjectType> set,
            boolean flag);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addObject:")
    public native void addObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("addObjects:count:")
    public native void addObjectsCount(@ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects,
            @NUInt long count);

    @Generated
    @Selector("addObjectsFromArray:")
    public native void addObjectsFromArray(NSArray<_ObjectType> array);

    @Generated
    @Selector("exchangeObjectAtIndex:withObjectAtIndex:")
    public native void exchangeObjectAtIndexWithObjectAtIndex(@NUInt long idx1, @NUInt long idx2);

    @Generated
    @Selector("filterUsingPredicate:")
    public native void filterUsingPredicate(NSPredicate p);

    @Generated
    @Selector("init")
    public native NSMutableOrderedSet<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSMutableOrderedSet<?> initWithArray(NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithArray:copyItems:")
    public native NSMutableOrderedSet<?> initWithArrayCopyItems(NSArray<_ObjectType> set, boolean flag);

    @Generated
    @Selector("initWithArray:range:copyItems:")
    public native NSMutableOrderedSet<?> initWithArrayRangeCopyItems(NSArray<_ObjectType> set, @ByValue NSRange range,
            boolean flag);

    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableOrderedSet<?> initWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableOrderedSet<?> initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithObject:")
    public native NSMutableOrderedSet<?> initWithObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSMutableOrderedSet<?> initWithObjects(@Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSMutableOrderedSet<?> initWithObjectsCount(
            @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("initWithOrderedSet:")
    public native NSMutableOrderedSet<?> initWithOrderedSet(NSOrderedSet<_ObjectType> set);

    @Generated
    @Selector("initWithOrderedSet:copyItems:")
    public native NSMutableOrderedSet<?> initWithOrderedSetCopyItems(NSOrderedSet<_ObjectType> set, boolean flag);

    @Generated
    @Selector("initWithOrderedSet:range:copyItems:")
    public native NSMutableOrderedSet<?> initWithOrderedSetRangeCopyItems(NSOrderedSet<_ObjectType> set,
            @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("initWithSet:")
    public native NSMutableOrderedSet<?> initWithSet(NSSet<_ObjectType> set);

    @Generated
    @Selector("initWithSet:copyItems:")
    public native NSMutableOrderedSet<?> initWithSetCopyItems(NSSet<_ObjectType> set, boolean flag);

    @Generated
    @Selector("insertObject:atIndex:")
    public native void insertObjectAtIndex(@Mapped(ObjCObjectMapper.class) _ObjectType object, @NUInt long idx);

    @Generated
    @Selector("insertObjects:atIndexes:")
    public native void insertObjectsAtIndexes(NSArray<_ObjectType> objects, NSIndexSet indexes);

    @Generated
    @Selector("intersectOrderedSet:")
    public native void intersectOrderedSet(NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("intersectSet:")
    public native void intersectSet(NSSet<_ObjectType> other);

    @Generated
    @Selector("minusOrderedSet:")
    public native void minusOrderedSet(NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("minusSet:")
    public native void minusSet(NSSet<_ObjectType> other);

    @Generated
    @Selector("moveObjectsAtIndexes:toIndex:")
    public native void moveObjectsAtIndexesToIndex(NSIndexSet indexes, @NUInt long idx);

    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    @Generated
    @Selector("removeObject:")
    public native void removeObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("removeObjectAtIndex:")
    public native void removeObjectAtIndex(@NUInt long idx);

    @Generated
    @Selector("removeObjectsAtIndexes:")
    public native void removeObjectsAtIndexes(NSIndexSet indexes);

    @Generated
    @Selector("removeObjectsInArray:")
    public native void removeObjectsInArray(NSArray<_ObjectType> array);

    @Generated
    @Selector("removeObjectsInRange:")
    public native void removeObjectsInRange(@ByValue NSRange range);

    @Generated
    @Selector("replaceObjectAtIndex:withObject:")
    public native void replaceObjectAtIndexWithObject(@NUInt long idx,
            @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("replaceObjectsAtIndexes:withObjects:")
    public native void replaceObjectsAtIndexesWithObjects(NSIndexSet indexes, NSArray<_ObjectType> objects);

    @Generated
    @Selector("replaceObjectsInRange:withObjects:count:")
    public native void replaceObjectsInRangeWithObjectsCount(@ByValue NSRange range,
            @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long count);

    @Generated
    @Selector("setObject:atIndex:")
    public native void setObjectAtIndex(@Mapped(ObjCObjectMapper.class) _ObjectType obj, @NUInt long idx);

    @Generated
    @Selector("setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(@Mapped(ObjCObjectMapper.class) _ObjectType obj, @NUInt long idx);

    @Generated
    @Selector("sortRange:options:usingComparator:")
    public native void sortRangeOptionsUsingComparator(@ByValue NSRange range, @NUInt long opts,
            @ObjCBlock(name = "call_sortRangeOptionsUsingComparator") Block_sortRangeOptionsUsingComparator cmptr);

    @Generated
    @Selector("sortUsingComparator:")
    public native void sortUsingComparator(
            @ObjCBlock(name = "call_sortUsingComparator") Block_sortUsingComparator cmptr);

    @Generated
    @Selector("sortUsingDescriptors:")
    public native void sortUsingDescriptors(NSArray<? extends NSSortDescriptor> sortDescriptors);

    @Generated
    @Selector("sortWithOptions:usingComparator:")
    public native void sortWithOptionsUsingComparator(@NUInt long opts,
            @ObjCBlock(name = "call_sortWithOptionsUsingComparator") Block_sortWithOptionsUsingComparator cmptr);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("unionOrderedSet:")
    public native void unionOrderedSet(NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("unionSet:")
    public native void unionSet(NSSet<_ObjectType> other);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortRangeOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortRangeOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) Object obj1,
                @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortUsingComparator {
        @Generated
        @NInt
        long call_sortUsingComparator(@Mapped(ObjCObjectMapper.class) Object obj1,
                @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortWithOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) Object obj1,
                @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Generated
    @Selector("applyDifference:")
    public native void applyDifference(NSOrderedCollectionDifference<_ObjectType> difference);
}
