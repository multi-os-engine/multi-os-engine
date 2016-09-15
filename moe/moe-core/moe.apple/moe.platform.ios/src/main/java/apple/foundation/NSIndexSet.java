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
    @Owned
    @Selector("alloc")
    public static native NSIndexSet alloc();

    /**
     * containsIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/containsIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsIndex:")
    public native boolean containsIndex(@NUInt long value);

    /**
     * containsIndexes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/containsIndexes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsIndexes:")
    public native boolean containsIndexes(NSIndexSet indexSet);

    /**
     * containsIndexesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/containsIndexesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsIndexesInRange:")
    public native boolean containsIndexesInRange(@ByValue NSRange range);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * count</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instp/NSIndexSet/count">iOS Dev Center</a>
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    /**
     * countOfIndexesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/countOfIndexesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("countOfIndexesInRange:")
    @NUInt
    public native long countOfIndexesInRange(@ByValue NSRange range);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateIndexesInRange:options:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/enumerateIndexesInRange:options:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateIndexesInRange:options:usingBlock:")
    public native void enumerateIndexesInRangeOptionsUsingBlock(@ByValue NSRange range, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateIndexesInRangeOptionsUsingBlock") Block_enumerateIndexesInRangeOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateIndexesInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateIndexesInRangeOptionsUsingBlock(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * enumerateIndexesUsingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/enumerateIndexesUsingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateIndexesUsingBlock:")
    public native void enumerateIndexesUsingBlock(
            @ObjCBlock(name = "call_enumerateIndexesUsingBlock") Block_enumerateIndexesUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateIndexesUsingBlock {
        @Generated
        void call_enumerateIndexesUsingBlock(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * enumerateIndexesWithOptions:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/enumerateIndexesWithOptions:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateIndexesWithOptions:usingBlock:")
    public native void enumerateIndexesWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateIndexesWithOptionsUsingBlock") Block_enumerateIndexesWithOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateIndexesWithOptionsUsingBlock {
        @Generated
        void call_enumerateIndexesWithOptionsUsingBlock(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * enumerateRangesInRange:options:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/enumerateRangesInRange:options:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateRangesInRange:options:usingBlock:")
    public native void enumerateRangesInRangeOptionsUsingBlock(@ByValue NSRange range, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateRangesInRangeOptionsUsingBlock") Block_enumerateRangesInRangeOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateRangesInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateRangesInRangeOptionsUsingBlock(@ByValue NSRange arg0, BoolPtr arg1);
    }

    /**
     * enumerateRangesUsingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/enumerateRangesUsingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateRangesUsingBlock:")
    public native void enumerateRangesUsingBlock(
            @ObjCBlock(name = "call_enumerateRangesUsingBlock") Block_enumerateRangesUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateRangesUsingBlock {
        @Generated
        void call_enumerateRangesUsingBlock(@ByValue NSRange arg0, BoolPtr arg1);
    }

    /**
     * enumerateRangesWithOptions:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/enumerateRangesWithOptions:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateRangesWithOptions:usingBlock:")
    public native void enumerateRangesWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateRangesWithOptionsUsingBlock") Block_enumerateRangesWithOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateRangesWithOptionsUsingBlock {
        @Generated
        void call_enumerateRangesWithOptionsUsingBlock(@ByValue NSRange arg0, BoolPtr arg1);
    }

    /**
     * firstIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instp/NSIndexSet/firstIndex">iOS Dev Center</a>
     */
    @Generated
    @Selector("firstIndex")
    @NUInt
    public native long firstIndex();

    /**
     * getIndexes:maxCount:inIndexRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/getIndexes:maxCount:inIndexRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getIndexes:maxCount:inIndexRange:")
    @NUInt
    public native long getIndexesMaxCountInIndexRange(NUIntPtr indexBuffer, @NUInt long bufferSize, NSRange range);

    /**
     * indexGreaterThanIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexGreaterThanIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexGreaterThanIndex:")
    @NUInt
    public native long indexGreaterThanIndex(@NUInt long value);

    /**
     * indexGreaterThanOrEqualToIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexGreaterThanOrEqualToIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexGreaterThanOrEqualToIndex:")
    @NUInt
    public native long indexGreaterThanOrEqualToIndex(@NUInt long value);

    /**
     * indexInRange:options:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexInRange:options:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexInRange:options:passingTest:")
    @NUInt
    public native long indexInRangeOptionsPassingTest(@ByValue NSRange range, @NUInt long opts,
            @ObjCBlock(name = "call_indexInRangeOptionsPassingTest") Block_indexInRangeOptionsPassingTest predicate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexInRangeOptionsPassingTest {
        @Generated
        boolean call_indexInRangeOptionsPassingTest(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * indexLessThanIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexLessThanIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexLessThanIndex:")
    @NUInt
    public native long indexLessThanIndex(@NUInt long value);

    /**
     * indexLessThanOrEqualToIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexLessThanOrEqualToIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexLessThanOrEqualToIndex:")
    @NUInt
    public native long indexLessThanOrEqualToIndex(@NUInt long value);

    /**
     * indexPassingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexPassingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPassingTest:")
    @NUInt
    public native long indexPassingTest(@ObjCBlock(name = "call_indexPassingTest") Block_indexPassingTest predicate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexPassingTest {
        @Generated
        boolean call_indexPassingTest(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * indexSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/clm/NSIndexSet/indexSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexSet")
    public static native NSIndexSet indexSet();

    /**
     * indexSetWithIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/clm/NSIndexSet/indexSetWithIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexSetWithIndex:")
    public static native NSIndexSet indexSetWithIndex(@NUInt long value);

    /**
     * indexSetWithIndexesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/clm/NSIndexSet/indexSetWithIndexesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexSetWithIndexesInRange:")
    public static native NSIndexSet indexSetWithIndexesInRange(@ByValue NSRange range);

    /**
     * indexWithOptions:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexWithOptions:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexWithOptions:passingTest:")
    @NUInt
    public native long indexWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_indexWithOptionsPassingTest") Block_indexWithOptionsPassingTest predicate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexWithOptionsPassingTest {
        @Generated
        boolean call_indexWithOptionsPassingTest(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * indexesInRange:options:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexesInRange:options:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexesInRange:options:passingTest:")
    public native NSIndexSet indexesInRangeOptionsPassingTest(@ByValue NSRange range, @NUInt long opts,
            @ObjCBlock(name = "call_indexesInRangeOptionsPassingTest") Block_indexesInRangeOptionsPassingTest predicate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesInRangeOptionsPassingTest {
        @Generated
        boolean call_indexesInRangeOptionsPassingTest(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * indexesPassingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexesPassingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexesPassingTest:")
    public native NSIndexSet indexesPassingTest(
            @ObjCBlock(name = "call_indexesPassingTest") Block_indexesPassingTest predicate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesPassingTest {
        @Generated
        boolean call_indexesPassingTest(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * indexesWithOptions:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/indexesWithOptions:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexesWithOptions:passingTest:")
    public native NSIndexSet indexesWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_indexesWithOptionsPassingTest") Block_indexesWithOptionsPassingTest predicate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesWithOptionsPassingTest {
        @Generated
        boolean call_indexesWithOptionsPassingTest(@NUInt long arg0, BoolPtr arg1);
    }

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSIndexSet init();

    @Generated
    @Selector("initWithCoder:")
    public native NSIndexSet initWithCoder(NSCoder aDecoder);

    /**
     * initWithIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/initWithIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithIndex:")
    public native NSIndexSet initWithIndex(@NUInt long value);

    /**
     * initWithIndexSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/initWithIndexSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithIndexSet:")
    public native NSIndexSet initWithIndexSet(NSIndexSet indexSet);

    /**
     * initWithIndexesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/initWithIndexesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithIndexesInRange:")
    public native NSIndexSet initWithIndexesInRange(@ByValue NSRange range);

    /**
     * intersectsIndexesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/intersectsIndexesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("intersectsIndexesInRange:")
    public native boolean intersectsIndexesInRange(@ByValue NSRange range);

    /**
     * isEqualToIndexSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instm/NSIndexSet/isEqualToIndexSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToIndexSet:")
    public native boolean isEqualToIndexSet(NSIndexSet indexSet);

    /**
     * lastIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSIndexSet_Class/index.html#//apple_ref/occ/instp/NSIndexSet/lastIndex">iOS Dev Center</a>
     */
    @Generated
    @Selector("lastIndex")
    @NUInt
    public native long lastIndex();

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

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
    public static native void load_objc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();
}
