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
import apple.cloudkit.protocol.CKRecordValue;
import apple.foundation.c.Foundation;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSFastEnumeration;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstPtr;
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

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSArray<_ObjectType> extends NSObject
        implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, CKRecordValue, List<_ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSArray<?> alloc();

    /**
     * array</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/clm/NSArray/array">iOS Dev Center</a>
     */
    @Generated
    @Selector("array")
    public static native <_ObjectType> NSArray<?> array();

    /**
     * arrayWithArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/clm/NSArray/arrayWithArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayWithArray:")
    public static native <_ObjectType> NSArray<?> arrayWithArray(NSArray<_ObjectType> array);

    /**
     * arrayWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/clm/NSArray/arrayWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayWithContentsOfFile:")
    public static native <_ObjectType> NSArray<_ObjectType> arrayWithContentsOfFile(String path);

    /**
     * arrayWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/clm/NSArray/arrayWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayWithContentsOfURL:")
    public static native <_ObjectType> NSArray<_ObjectType> arrayWithContentsOfURL(NSURL url);

    /**
     * arrayWithObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/clm/NSArray/arrayWithObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayWithObject:")
    public static native <_ObjectType> NSArray<?> arrayWithObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * arrayWithObjects:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/clm/NSArray/arrayWithObjects:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("arrayWithObjects:")
    public static native <_ObjectType> NSArray<?> arrayWithObjects(@Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    /**
     * arrayWithObjects:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/clm/NSArray/arrayWithObjects:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayWithObjects:count:")
    public static native <_ObjectType> NSArray<?> arrayWithObjectsCount(ConstPtr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("supportsSecureCoding")
    public static native <_ObjectType> boolean supportsSecureCoding();

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
     * addObserver:forKeyPath:options:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/addObserver:forKeyPath:options:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(NSObject observer, String keyPath, @NUInt long options,
            VoidPtr context);

    /**
     * addObserver:toObjectsAtIndexes:forKeyPath:options:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/addObserver:toObjectsAtIndexes:forKeyPath:options:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObserver:toObjectsAtIndexes:forKeyPath:options:context:")
    public native void addObserverToObjectsAtIndexesForKeyPathOptionsContext(NSObject observer, NSIndexSet indexes,
            String keyPath, @NUInt long options, VoidPtr context);

    /**
     * arrayByAddingObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/arrayByAddingObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayByAddingObject:")
    public native NSArray<_ObjectType> arrayByAddingObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * arrayByAddingObjectsFromArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/arrayByAddingObjectsFromArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayByAddingObjectsFromArray:")
    public native NSArray<_ObjectType> arrayByAddingObjectsFromArray(NSArray<_ObjectType> otherArray);

    /**
     * componentsJoinedByString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/componentsJoinedByString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentsJoinedByString:")
    public native String componentsJoinedByString(String separator);

    /**
     * containsObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/containsObject:">iOS Dev Center</a>
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
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instp/NSArray/count">iOS Dev Center</a>
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
     * description</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instp/NSArray/description">iOS Dev Center</a>
     */
    @Generated
    @Selector("description")
    public native String description();

    /**
     * descriptionWithLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/descriptionWithLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Mapped(ObjCObjectMapper.class) Object locale);

    /**
     * descriptionWithLocale:indent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/descriptionWithLocale:indent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptionWithLocale:indent:")
    public native String descriptionWithLocaleIndent(@Mapped(ObjCObjectMapper.class) Object locale, @NUInt long level);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateObjectsAtIndexes:options:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/enumerateObjectsAtIndexes:options:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexesOptionsUsingBlock(NSIndexSet s, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateObjectsAtIndexesOptionsUsingBlock") Block_enumerateObjectsAtIndexesOptionsUsingBlock block);

    /**
     * enumerateObjectsUsingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/enumerateObjectsUsingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    /**
     * enumerateObjectsWithOptions:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/enumerateObjectsWithOptions:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

    /**
     * filteredArrayUsingPredicate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/filteredArrayUsingPredicate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("filteredArrayUsingPredicate:")
    public native NSArray<_ObjectType> filteredArrayUsingPredicate(NSPredicate predicate);

    /**
     * firstObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instp/NSArray/firstObject">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("firstObject")
    public native _ObjectType firstObject();

    /**
     * firstObjectCommonWithArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/firstObjectCommonWithArray:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("firstObjectCommonWithArray:")
    public native _ObjectType firstObjectCommonWithArray(NSArray<_ObjectType> otherArray);

    /**
     * getObjects:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/getObjects:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getObjects:")
    public native void getObjects(Ptr<ObjCObject> objects);

    /**
     * getObjects:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/getObjects:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getObjects:range:")
    public native void getObjectsRange(Ptr<ObjCObject> objects, @ByValue NSRange range);

    /**
     * indexOfObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexOfObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObject:")
    @NUInt
    public native long indexOfObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * indexOfObject:inRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexOfObject:inRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObject:inRange:")
    @NUInt
    public native long indexOfObjectInRange(@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    /**
     * indexOfObject:inSortedRange:options:usingComparator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexOfObject:inSortedRange:options:usingComparator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObject:inSortedRange:options:usingComparator:")
    @NUInt
    public native long indexOfObjectInSortedRangeOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) _ObjectType obj,
            @ByValue NSRange r, @NUInt long opts,
            @ObjCBlock(name = "call_indexOfObjectInSortedRangeOptionsUsingComparator") Block_indexOfObjectInSortedRangeOptionsUsingComparator cmp);

    /**
     * indexOfObjectAtIndexes:options:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexOfObjectAtIndexes:options:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObjectAtIndexes:options:passingTest:")
    @NUInt
    public native long indexOfObjectAtIndexesOptionsPassingTest(NSIndexSet s, @NUInt long opts,
            @ObjCBlock(name = "call_indexOfObjectAtIndexesOptionsPassingTest") Block_indexOfObjectAtIndexesOptionsPassingTest predicate);

    /**
     * indexOfObjectIdenticalTo:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexOfObjectIdenticalTo:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObjectIdenticalTo:")
    @NUInt
    public native long indexOfObjectIdenticalTo(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * indexOfObjectIdenticalTo:inRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexOfObjectIdenticalTo:inRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObjectIdenticalTo:inRange:")
    @NUInt
    public native long indexOfObjectIdenticalToInRange(@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    /**
     * indexOfObjectPassingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexOfObjectPassingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObjectPassingTest:")
    @NUInt
    public native long indexOfObjectPassingTest(
            @ObjCBlock(name = "call_indexOfObjectPassingTest") Block_indexOfObjectPassingTest predicate);

    /**
     * indexOfObjectWithOptions:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexOfObjectWithOptions:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfObjectWithOptions:passingTest:")
    @NUInt
    public native long indexOfObjectWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_indexOfObjectWithOptionsPassingTest") Block_indexOfObjectWithOptionsPassingTest predicate);

    /**
     * indexesOfObjectsAtIndexes:options:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexesOfObjectsAtIndexes:options:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexesOfObjectsAtIndexes:options:passingTest:")
    public native NSIndexSet indexesOfObjectsAtIndexesOptionsPassingTest(NSIndexSet s, @NUInt long opts,
            @ObjCBlock(name = "call_indexesOfObjectsAtIndexesOptionsPassingTest") Block_indexesOfObjectsAtIndexesOptionsPassingTest predicate);

    /**
     * indexesOfObjectsPassingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexesOfObjectsPassingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexesOfObjectsPassingTest:")
    public native NSIndexSet indexesOfObjectsPassingTest(
            @ObjCBlock(name = "call_indexesOfObjectsPassingTest") Block_indexesOfObjectsPassingTest predicate);

    /**
     * indexesOfObjectsWithOptions:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/indexesOfObjectsWithOptions:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexesOfObjectsWithOptions:passingTest:")
    public native NSIndexSet indexesOfObjectsWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_indexesOfObjectsWithOptionsPassingTest") Block_indexesOfObjectsWithOptionsPassingTest predicate);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSArray<?> init();

    /**
     * initWithArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/initWithArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithArray:")
    public native NSArray<?> initWithArray(NSArray<_ObjectType> array);

    /**
     * initWithArray:copyItems:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/initWithArray:copyItems:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithArray:copyItems:")
    public native NSArray<?> initWithArrayCopyItems(NSArray<_ObjectType> array, boolean flag);

    @Generated
    @Selector("initWithCoder:")
    public native NSArray<?> initWithCoder(NSCoder aDecoder);

    /**
     * initWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/initWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSArray<_ObjectType> initWithContentsOfFile(String path);

    /**
     * initWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/initWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSArray<_ObjectType> initWithContentsOfURL(NSURL url);

    /**
     * initWithObjects:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/initWithObjects:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSArray<?> initWithObjects(@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    /**
     * initWithObjects:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/initWithObjects:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithObjects:count:")
    public native NSArray<?> initWithObjectsCount(ConstPtr<_ObjectType> objects, @NUInt long cnt);

    /**
     * isEqualToArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/isEqualToArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToArray:")
    public native boolean isEqualToArray(NSArray<_ObjectType> otherArray);

    /**
     * lastObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instp/NSArray/lastObject">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("lastObject")
    public native _ObjectType lastObject();

    /**
     * makeObjectsPerformSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/makeObjectsPerformSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("makeObjectsPerformSelector:")
    public native void makeObjectsPerformSelector(SEL aSelector);

    /**
     * makeObjectsPerformSelector:withObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/makeObjectsPerformSelector:withObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("makeObjectsPerformSelector:withObject:")
    public native void makeObjectsPerformSelectorWithObject(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object argument);

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * objectAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/objectAtIndex:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("objectAtIndex:")
    public native _ObjectType objectAtIndex(@NUInt long index);

    /**
     * objectAtIndexedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/objectAtIndexedSubscript:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native _ObjectType objectAtIndexedSubscript(@NUInt long idx);

    /**
     * objectEnumerator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/objectEnumerator">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    /**
     * objectsAtIndexes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/objectsAtIndexes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectsAtIndexes:")
    public native NSArray<_ObjectType> objectsAtIndexes(NSIndexSet indexes);

    /**
     * pathsMatchingExtensions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/pathsMatchingExtensions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathsMatchingExtensions:")
    public native NSArray<String> pathsMatchingExtensions(NSArray<String> filterTypes);

    /**
     * removeObserver:forKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/removeObserver:forKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserver:forKeyPath:")
    public native void removeObserverForKeyPath(NSObject observer, String keyPath);

    /**
     * removeObserver:forKeyPath:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/removeObserver:forKeyPath:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserver:forKeyPath:context:")
    public native void removeObserverForKeyPathContext(NSObject observer, String keyPath, VoidPtr context);

    /**
     * removeObserver:fromObjectsAtIndexes:forKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/removeObserver:fromObjectsAtIndexes:forKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserver:fromObjectsAtIndexes:forKeyPath:")
    public native void removeObserverFromObjectsAtIndexesForKeyPath(NSObject observer, NSIndexSet indexes,
            String keyPath);

    /**
     * removeObserver:fromObjectsAtIndexes:forKeyPath:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/removeObserver:fromObjectsAtIndexes:forKeyPath:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserver:fromObjectsAtIndexes:forKeyPath:context:")
    public native void removeObserverFromObjectsAtIndexesForKeyPathContext(NSObject observer, NSIndexSet indexes,
            String keyPath, VoidPtr context);

    /**
     * reverseObjectEnumerator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/reverseObjectEnumerator">iOS Dev Center</a>
     */
    @Generated
    @Selector("reverseObjectEnumerator")
    public native NSEnumerator<_ObjectType> reverseObjectEnumerator();

    /**
     * setValue:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/setValue:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * sortedArrayHint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instp/NSArray/sortedArrayHint">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedArrayHint")
    public native NSData sortedArrayHint();

    /**
     * sortedArrayUsingComparator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/sortedArrayUsingComparator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedArrayUsingComparator:")
    public native NSArray<_ObjectType> sortedArrayUsingComparator(
            @ObjCBlock(name = "call_sortedArrayUsingComparator") Block_sortedArrayUsingComparator cmptr);

    /**
     * sortedArrayUsingDescriptors:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/sortedArrayUsingDescriptors:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedArrayUsingDescriptors:")
    public native NSArray<_ObjectType> sortedArrayUsingDescriptors(NSArray<? extends NSSortDescriptor> sortDescriptors);

    /**
     * sortedArrayUsingFunction:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/sortedArrayUsingFunction:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedArrayUsingFunction:context:")
    public native NSArray<_ObjectType> sortedArrayUsingFunctionContext(
            @FunctionPtr(name = "call_sortedArrayUsingFunctionContext") Function_sortedArrayUsingFunctionContext comparator,
            VoidPtr context);

    /**
     * sortedArrayUsingFunction:context:hint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/sortedArrayUsingFunction:context:hint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedArrayUsingFunction:context:hint:")
    public native NSArray<_ObjectType> sortedArrayUsingFunctionContextHint(
            @FunctionPtr(name = "call_sortedArrayUsingFunctionContextHint") Function_sortedArrayUsingFunctionContextHint comparator,
            VoidPtr context, NSData hint);

    /**
     * sortedArrayUsingSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/sortedArrayUsingSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedArrayUsingSelector:")
    public native NSArray<_ObjectType> sortedArrayUsingSelector(SEL comparator);

    /**
     * sortedArrayWithOptions:usingComparator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/sortedArrayWithOptions:usingComparator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedArrayWithOptions:usingComparator:")
    public native NSArray<_ObjectType> sortedArrayWithOptionsUsingComparator(@NUInt long opts,
            @ObjCBlock(name = "call_sortedArrayWithOptionsUsingComparator") Block_sortedArrayWithOptionsUsingComparator cmptr);

    /**
     * subarrayWithRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/subarrayWithRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("subarrayWithRange:")
    public native NSArray<_ObjectType> subarrayWithRange(@ByValue NSRange range);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * valueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/valueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(String key);

    /**
     * writeToFile:atomically:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/writeToFile:atomically:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    /**
     * writeToURL:atomically:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSArray_Class/index.html#//apple_ref/occ/instm/NSArray/writeToURL:atomically:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(NSURL url, boolean atomically);

    @Override
    public boolean add(_ObjectType e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, _ObjectType element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends _ObjectType> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends _ObjectType> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean contains(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        return containsObject((_ObjectType)o);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean containsAll(Collection<?> c) {
        if (c == null) {
            throw new NullPointerException();
        }
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (o == null) {
                throw new NullPointerException();
            }
            if (!containsObject((_ObjectType)o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public _ObjectType get(int index) {
        if (index < 0 || index >= count()) {
            throw new IndexOutOfBoundsException();
        }
        return objectAtIndex(index);
    }

    @SuppressWarnings("unchecked")
    @Override
    public int indexOf(Object o) {
        long idx = indexOfObject((_ObjectType)o);
        return idx == Foundation.NSNotFound ? -1 : (int)idx;
    }

    @Override
    public boolean isEmpty() {
        return count() == 0;
    }

    @Override
    public Iterator<_ObjectType> iterator() {
        return new NSArrayIterator<_ObjectType>(this);
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        for (int idx = ((int)count()) - 1; idx >= 0; --idx) {
            if (o.equals(objectAtIndex(idx))) {
                return idx;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<_ObjectType> listIterator() {
        return new NSArrayListIterator<_ObjectType>(this, 0);
    }

    @Override
    public ListIterator<_ObjectType> listIterator(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        return new NSArrayListIterator<_ObjectType>(this, index);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public _ObjectType remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public _ObjectType set(int index, _ObjectType element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return (int)count();
    }

    @Override
    public List<_ObjectType> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size()) {
            throw new IndexOutOfBoundsException();
        }
        return subarrayWithRange(new NSRange(fromIndex, toIndex - fromIndex));
    }

    @Override
    public Object[] toArray() {
        Object[] a = new Object[(int)count()];
        for (int idx = 0; idx < (int)count(); ++idx) {
            a[idx] = objectAtIndex(idx);
        }
        return a;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object[] toArray(Object[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
        final int count = (int)count();
        if (a.length < count) {
            return toArray();
        } else {
            for (int idx = 0; idx < count; ++idx) {
                a[idx] = objectAtIndex(idx);
            }
            if (a.length > count) {
                a[count] = null;
            }
            return a;
        }
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        for (Object e : this) {
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof List)) return false;

        ListIterator<_ObjectType> e1 = listIterator();
        ListIterator<?> e2 = ((List<?>)o).listIterator();
        while (e1.hasNext() && e2.hasNext()) {
            _ObjectType o1 = e1.next();
            Object o2 = e2.next();
            if (!(o1 == null ? o2 == null : o1.equals(o2))) return false;
        }
        return !(e1.hasNext() || e2.hasNext());
    }

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

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectInSortedRangeOptionsUsingComparator {
        @Generated
        @NInt
        long call_indexOfObjectInSortedRangeOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectAtIndexesOptionsPassingTest {
        @Generated
        boolean call_indexOfObjectAtIndexesOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectPassingTest {
        @Generated
        boolean call_indexOfObjectPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectWithOptionsPassingTest {
        @Generated
        boolean call_indexOfObjectWithOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsAtIndexesOptionsPassingTest {
        @Generated
        boolean call_indexesOfObjectsAtIndexesOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsPassingTest {
        @Generated
        boolean call_indexesOfObjectsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsWithOptionsPassingTest {
        @Generated
        boolean call_indexesOfObjectsWithOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortedArrayUsingComparator {
        @Generated
        @NInt
        long call_sortedArrayUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_sortedArrayUsingFunctionContext {
        @Generated
        @NInt
        long call_sortedArrayUsingFunctionContext(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, VoidPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_sortedArrayUsingFunctionContextHint {
        @Generated
        @NInt
        long call_sortedArrayUsingFunctionContextHint(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, VoidPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortedArrayWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortedArrayWithOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    private final static class NSArrayIterator<_ObjectType> implements Iterator<_ObjectType> {

        private final long count;
        private final NSArray<_ObjectType> array;
        private long cursor = 0;

        public NSArrayIterator(NSArray<_ObjectType> array) {
            this.array = array;
            this.count = array.count();
        }

        @Override
        public boolean hasNext() {
            return cursor < count;
        }

        @Override
        public _ObjectType next() {
            if (cursor >= count) {
                throw new NoSuchElementException();
            }
            return array.objectAtIndex(cursor++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    private final static class NSArrayListIterator<_ObjectType> implements ListIterator<_ObjectType> {

        private final long count;
        private final NSArray<_ObjectType> array;
        private long cursor;

        public NSArrayListIterator(NSArray<_ObjectType> array, int idx) {
            cursor = idx;
            this.array = array;
            this.count = array.count();
        }

        @Override
        public void add(_ObjectType e) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean hasNext() {
            return cursor < count;
        }

        @Override
        public boolean hasPrevious() {
            return cursor - 1 >= 0;
        }

        @Override
        public _ObjectType next() {
            if (cursor >= count) {
                throw new NoSuchElementException();
            }
            return array.objectAtIndex(cursor++);
        }

        @Override
        public int nextIndex() {
            return (int)cursor;
        }

        @Override
        public _ObjectType previous() {
            if (cursor <= 0) {
                throw new NoSuchElementException();
            }
            return array.objectAtIndex(--cursor);
        }

        @Override
        public int previousIndex() {
            return (int)cursor - 1;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(_ObjectType e) {
            throw new UnsupportedOperationException();
        }

    }
}
