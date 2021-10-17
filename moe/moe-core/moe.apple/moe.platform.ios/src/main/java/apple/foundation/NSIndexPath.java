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
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSIndexPath extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSIndexPath(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSIndexPath alloc();

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
    @Selector("indexPathForItem:inSection:")
    public static native NSIndexPath indexPathForItemInSection(@NInt long item, @NInt long section);

    @Generated
    @Selector("indexPathForRow:inSection:")
    public static native NSIndexPath indexPathForRowInSection(@NInt long row, @NInt long section);

    @Generated
    @Selector("indexPathWithIndex:")
    public static native NSIndexPath indexPathWithIndex(@NUInt long index);

    @Generated
    @Selector("indexPathWithIndexes:length:")
    public static native NSIndexPath indexPathWithIndexesLength(ConstNUIntPtr indexes, @NUInt long length);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * sorting an array of indexPaths using this comparison results in an array representing nodes in depth-first traversal order
     */
    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(NSIndexPath otherObject);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * use -getIndexes:range: instead
     */
    @Generated
    @Selector("getIndexes:")
    public native void getIndexes(NUIntPtr indexes);

    /**
     * Copies the indexes stored in this index path from the positions specified by positionRange into indexes.
     * <p>
     * It is the developer’s responsibility to allocate the memory for the C array.
     *
     * @param indexes       Buffer of at least as many NSUIntegers as specified by the length of positionRange. On return, this memory will hold the index path's indexes.
     * @param positionRange A range of valid positions within this index path.  If the location plus the length of positionRange is greater than the length of this index path, this method raises an NSRangeException.
     */
    @Generated
    @Selector("getIndexes:range:")
    public native void getIndexesRange(NUIntPtr indexes, @ByValue NSRange positionRange);

    @Generated
    @Selector("indexAtPosition:")
    @NUInt
    public native long indexAtPosition(@NUInt long position);

    @Generated
    @Selector("indexPathByAddingIndex:")
    public native NSIndexPath indexPathByAddingIndex(@NUInt long index);

    @Generated
    @Selector("indexPathByRemovingLastIndex")
    public native NSIndexPath indexPathByRemovingLastIndex();

    @Generated
    @Selector("init")
    public native NSIndexPath init();

    @Generated
    @Selector("initWithCoder:")
    public native NSIndexPath initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithIndex:")
    public native NSIndexPath initWithIndex(@NUInt long index);

    @Generated
    @Selector("initWithIndexes:length:")
    public native NSIndexPath initWithIndexesLength(ConstNUIntPtr indexes, @NUInt long length);

    /**
     * Returns the index at position 1 if it exists, otherwise returns NSNotFound.
     */
    @Generated
    @Selector("item")
    @NInt
    public native long item();

    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    /**
     * Returns the index at position 1.
     */
    @Generated
    @Selector("row")
    @NInt
    public native long row();

    /**
     * Returns the index at position 0.
     */
    @Generated
    @Selector("section")
    @NInt
    public native long section();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
