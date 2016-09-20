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
import apple.foundation.protocol.NSFastEnumeration;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSet<_ObjectType> extends NSObject
        implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSSet<?> alloc();

    /**
     * set</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/clm/NSSet/set">iOS Dev Center</a>
     */
    @Generated
    @Selector("set")
    public static native <_ObjectType> NSSet<?> set();

    /**
     * setWithArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/clm/NSSet/setWithArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWithArray:")
    public static native <_ObjectType> NSSet<?> setWithArray(NSArray<_ObjectType> array);

    /**
     * setWithObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/clm/NSSet/setWithObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWithObject:")
    public static native <_ObjectType> NSSet<?> setWithObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    /**
     * setWithObjects:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/clm/NSSet/setWithObjects:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("setWithObjects:")
    public static native <_ObjectType> NSSet<?> setWithObjects(@Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    /**
     * setWithObjects:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/clm/NSSet/setWithObjects:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWithObjects:count:")
    public static native <_ObjectType> NSSet<?> setWithObjectsCount(ConstPtr<_ObjectType> objects, @NUInt long cnt);

    /**
     * setWithSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/clm/NSSet/setWithSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWithSet:")
    public static native <_ObjectType> NSSet<?> setWithSet(NSSet<_ObjectType> set);

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addObserver:forKeyPath:options:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/addObserver:forKeyPath:options:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(NSObject observer, String keyPath, @NUInt long options,
            VoidPtr context);

    /**
     * allObjects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instp/NSSet/allObjects">iOS Dev Center</a>
     */
    @Generated
    @Selector("allObjects")
    public native NSArray<_ObjectType> allObjects();

    /**
     * anyObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/anyObject">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("anyObject")
    public native _ObjectType anyObject();

    /**
     * containsObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/containsObject:">iOS Dev Center</a>
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
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instp/NSSet/count">iOS Dev Center</a>
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
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instp/NSSet/description">iOS Dev Center</a>
     */
    @Generated
    @Selector("description")
    public native String description();

    /**
     * descriptionWithLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/descriptionWithLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateObjectsUsingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/enumerateObjectsUsingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    /**
     * enumerateObjectsWithOptions:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/enumerateObjectsWithOptions:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

    /**
     * filteredSetUsingPredicate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/filteredSetUsingPredicate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("filteredSetUsingPredicate:")
    public native NSSet<_ObjectType> filteredSetUsingPredicate(NSPredicate predicate);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSSet<?> init();

    /**
     * initWithArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/initWithArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithArray:")
    public native NSSet<?> initWithArray(NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithCoder:")
    public native NSSet<?> initWithCoder(NSCoder aDecoder);

    /**
     * initWithObjects:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/initWithObjects:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSSet<?> initWithObjects(@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    /**
     * initWithObjects:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/initWithObjects:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithObjects:count:")
    public native NSSet<?> initWithObjectsCount(ConstPtr<_ObjectType> objects, @NUInt long cnt);

    /**
     * initWithSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/initWithSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSet:")
    public native NSSet<?> initWithSet(NSSet<_ObjectType> set);

    /**
     * initWithSet:copyItems:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/initWithSet:copyItems:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSet:copyItems:")
    public native NSSet<?> initWithSetCopyItems(NSSet<_ObjectType> set, boolean flag);

    /**
     * intersectsSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/intersectsSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("intersectsSet:")
    public native boolean intersectsSet(NSSet<_ObjectType> otherSet);

    /**
     * isEqualToSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/isEqualToSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToSet:")
    public native boolean isEqualToSet(NSSet<_ObjectType> otherSet);

    /**
     * isSubsetOfSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/isSubsetOfSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSubsetOfSet:")
    public native boolean isSubsetOfSet(NSSet<_ObjectType> otherSet);

    /**
     * makeObjectsPerformSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/makeObjectsPerformSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("makeObjectsPerformSelector:")
    public native void makeObjectsPerformSelector(SEL aSelector);

    /**
     * makeObjectsPerformSelector:withObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/makeObjectsPerformSelector:withObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("makeObjectsPerformSelector:withObject:")
    public native void makeObjectsPerformSelectorWithObject(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object argument);

    /**
     * member:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/member:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("member:")
    public native _ObjectType member(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * objectEnumerator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/objectEnumerator">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    /**
     * objectsPassingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/objectsPassingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectsPassingTest:")
    public native NSSet<_ObjectType> objectsPassingTest(
            @ObjCBlock(name = "call_objectsPassingTest") Block_objectsPassingTest predicate);

    /**
     * objectsWithOptions:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/objectsWithOptions:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectsWithOptions:passingTest:")
    public native NSSet<_ObjectType> objectsWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_objectsWithOptionsPassingTest") Block_objectsWithOptionsPassingTest predicate);

    /**
     * removeObserver:forKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/removeObserver:forKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserver:forKeyPath:")
    public native void removeObserverForKeyPath(NSObject observer, String keyPath);

    /**
     * removeObserver:forKeyPath:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/removeObserver:forKeyPath:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserver:forKeyPath:context:")
    public native void removeObserverForKeyPathContext(NSObject observer, String keyPath, VoidPtr context);

    /**
     * setByAddingObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/setByAddingObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setByAddingObject:")
    public native NSSet<_ObjectType> setByAddingObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * setByAddingObjectsFromArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/setByAddingObjectsFromArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setByAddingObjectsFromArray:")
    public native NSSet<_ObjectType> setByAddingObjectsFromArray(NSArray<_ObjectType> other);

    /**
     * setByAddingObjectsFromSet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/setByAddingObjectsFromSet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setByAddingObjectsFromSet:")
    public native NSSet<_ObjectType> setByAddingObjectsFromSet(NSSet<_ObjectType> other);

    /**
     * setValue:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/setValue:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * sortedArrayUsingDescriptors:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/sortedArrayUsingDescriptors:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedArrayUsingDescriptors:")
    public native NSArray<_ObjectType> sortedArrayUsingDescriptors(NSArray<? extends NSSortDescriptor> sortDescriptors);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * valueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSet_Class/index.html#//apple_ref/occ/instm/NSSet/valueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(String key);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsUsingBlock {
        @Generated
        void call_enumerateObjectsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsWithOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsWithOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_objectsPassingTest {
        @Generated
        boolean call_objectsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_objectsWithOptionsPassingTest {
        @Generated
        boolean call_objectsWithOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0, BoolPtr arg1);
    }
}
