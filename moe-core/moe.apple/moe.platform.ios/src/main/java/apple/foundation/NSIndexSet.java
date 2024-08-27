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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSIndexSet extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSIndexSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSIndexSet alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSIndexSet allocWithZone(VoidPtr zone);

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
    @Selector("indexSet")
    public static native NSIndexSet indexSet();

    @Generated
    @Selector("indexSetWithIndex:")
    public static native NSIndexSet indexSetWithIndex(@NUInt long value);

    @Generated
    @Selector("indexSetWithIndexesInRange:")
    public static native NSIndexSet indexSetWithIndexesInRange(@ByValue NSRange range);

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
    public static native NSIndexSet new_objc();

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
    @Selector("containsIndex:")
    public native boolean containsIndex(@NUInt long value);

    @Generated
    @Selector("containsIndexes:")
    public native boolean containsIndexes(@NotNull NSIndexSet indexSet);

    @Generated
    @Selector("containsIndexesInRange:")
    public native boolean containsIndexesInRange(@ByValue NSRange range);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("countOfIndexesInRange:")
    @NUInt
    public native long countOfIndexesInRange(@ByValue NSRange range);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateIndexesInRange:options:usingBlock:")
    public native void enumerateIndexesInRangeOptionsUsingBlock(@ByValue NSRange range, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateIndexesInRangeOptionsUsingBlock") Block_enumerateIndexesInRangeOptionsUsingBlock block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateIndexesUsingBlock:")
    public native void enumerateIndexesUsingBlock(
            @NotNull @ObjCBlock(name = "call_enumerateIndexesUsingBlock") Block_enumerateIndexesUsingBlock block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateIndexesWithOptions:usingBlock:")
    public native void enumerateIndexesWithOptionsUsingBlock(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateIndexesWithOptionsUsingBlock") Block_enumerateIndexesWithOptionsUsingBlock block);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("enumerateRangesInRange:options:usingBlock:")
    public native void enumerateRangesInRangeOptionsUsingBlock(@ByValue NSRange range, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateRangesInRangeOptionsUsingBlock") Block_enumerateRangesInRangeOptionsUsingBlock block);

    /**
     * The following three convenience methods allow you to enumerate the indexes in the receiver by ranges of
     * contiguous indexes. The performance of these methods is not guaranteed to be any better than if they were
     * implemented with enumerateIndexesInRange:options:usingBlock:. However, depending on the receiver's
     * implementation, they may perform better than that.
     * 
     * If the specified range for enumeration intersects a range of contiguous indexes in the receiver, then the block
     * will be invoked with the intersection of those two ranges.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("enumerateRangesUsingBlock:")
    public native void enumerateRangesUsingBlock(
            @NotNull @ObjCBlock(name = "call_enumerateRangesUsingBlock") Block_enumerateRangesUsingBlock block);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("enumerateRangesWithOptions:usingBlock:")
    public native void enumerateRangesWithOptionsUsingBlock(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateRangesWithOptionsUsingBlock") Block_enumerateRangesWithOptionsUsingBlock block);

    /**
     * The following six methods will return NSNotFound if there is no index in the set satisfying the query.
     */
    @Generated
    @Selector("firstIndex")
    @NUInt
    public native long firstIndex();

    /**
     * Fills up to bufferSize indexes in the specified range into the buffer and returns the number of indexes actually
     * placed in the buffer; also modifies the optional range passed in by pointer to be "positioned" after the last
     * index filled into the buffer.Example: if the index set contains the indexes 0, 2, 4, ..., 98, 100, for a buffer
     * of size 10 and the range (20, 80) the buffer would contain 20, 22, ..., 38 and the range would be modified to
     * (40, 60).
     */
    @Generated
    @Selector("getIndexes:maxCount:inIndexRange:")
    @NUInt
    public native long getIndexesMaxCountInIndexRange(@NotNull NUIntPtr indexBuffer, @NUInt long bufferSize,
            @Nullable NSRange range);

    @Generated
    @Selector("indexGreaterThanIndex:")
    @NUInt
    public native long indexGreaterThanIndex(@NUInt long value);

    @Generated
    @Selector("indexGreaterThanOrEqualToIndex:")
    @NUInt
    public native long indexGreaterThanOrEqualToIndex(@NUInt long value);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("indexInRange:options:passingTest:")
    @NUInt
    public native long indexInRangeOptionsPassingTest(@ByValue NSRange range, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexInRangeOptionsPassingTest") Block_indexInRangeOptionsPassingTest predicate);

    @Generated
    @Selector("indexLessThanIndex:")
    @NUInt
    public native long indexLessThanIndex(@NUInt long value);

    @Generated
    @Selector("indexLessThanOrEqualToIndex:")
    @NUInt
    public native long indexLessThanOrEqualToIndex(@NUInt long value);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("indexPassingTest:")
    @NUInt
    public native long indexPassingTest(
            @NotNull @ObjCBlock(name = "call_indexPassingTest") Block_indexPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("indexWithOptions:passingTest:")
    @NUInt
    public native long indexWithOptionsPassingTest(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexWithOptionsPassingTest") Block_indexWithOptionsPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("indexesInRange:options:passingTest:")
    public native NSIndexSet indexesInRangeOptionsPassingTest(@ByValue NSRange range, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexesInRangeOptionsPassingTest") Block_indexesInRangeOptionsPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("indexesPassingTest:")
    public native NSIndexSet indexesPassingTest(
            @NotNull @ObjCBlock(name = "call_indexesPassingTest") Block_indexesPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("indexesWithOptions:passingTest:")
    public native NSIndexSet indexesWithOptionsPassingTest(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexesWithOptionsPassingTest") Block_indexesWithOptionsPassingTest predicate);

    @Generated
    @Selector("init")
    public native NSIndexSet init();

    @Generated
    @Selector("initWithCoder:")
    public native NSIndexSet initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithIndex:")
    public native NSIndexSet initWithIndex(@NUInt long value);

    @Generated
    @Selector("initWithIndexSet:")
    public native NSIndexSet initWithIndexSet(@NotNull NSIndexSet indexSet);

    @Generated
    @Selector("initWithIndexesInRange:")
    public native NSIndexSet initWithIndexesInRange(@ByValue NSRange range);

    @Generated
    @Selector("intersectsIndexesInRange:")
    public native boolean intersectsIndexesInRange(@ByValue NSRange range);

    @Generated
    @Selector("isEqualToIndexSet:")
    public native boolean isEqualToIndexSet(@NotNull NSIndexSet indexSet);

    @Generated
    @Selector("lastIndex")
    @NUInt
    public native long lastIndex();

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateIndexesInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateIndexesInRangeOptionsUsingBlock(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateIndexesUsingBlock {
        @Generated
        void call_enumerateIndexesUsingBlock(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateIndexesWithOptionsUsingBlock {
        @Generated
        void call_enumerateIndexesWithOptionsUsingBlock(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateRangesInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateRangesInRangeOptionsUsingBlock(@ByValue NSRange range, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateRangesUsingBlock {
        @Generated
        void call_enumerateRangesUsingBlock(@ByValue NSRange range, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateRangesWithOptionsUsingBlock {
        @Generated
        void call_enumerateRangesWithOptionsUsingBlock(@ByValue NSRange range, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexInRangeOptionsPassingTest {
        @Generated
        boolean call_indexInRangeOptionsPassingTest(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexPassingTest {
        @Generated
        boolean call_indexPassingTest(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexWithOptionsPassingTest {
        @Generated
        boolean call_indexWithOptionsPassingTest(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesInRangeOptionsPassingTest {
        @Generated
        boolean call_indexesInRangeOptionsPassingTest(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesPassingTest {
        @Generated
        boolean call_indexesPassingTest(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesWithOptionsPassingTest {
        @Generated
        boolean call_indexesWithOptionsPassingTest(@NUInt long idx, @NotNull BoolPtr stop);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
