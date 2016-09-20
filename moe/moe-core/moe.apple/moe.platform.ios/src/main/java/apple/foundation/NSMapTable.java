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
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMapTable<_KeyType, _ObjectType> extends NSObject implements NSCopying, NSCoding, NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMapTable(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMapTable<?, ?> alloc();

    /**
     * mapTableWithKeyOptions:valueOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/clm/NSMapTable/mapTableWithKeyOptions:valueOptions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mapTableWithKeyOptions:valueOptions:")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> mapTableWithKeyOptionsValueOptions(
            @NUInt long keyOptions, @NUInt long valueOptions);

    /**
     * strongToStrongObjectsMapTable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/clm/NSMapTable/strongToStrongObjectsMapTable">iOS Dev Center</a>
     */
    @Generated
    @Selector("strongToStrongObjectsMapTable")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> strongToStrongObjectsMapTable();

    /**
     * strongToWeakObjectsMapTable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/clm/NSMapTable/strongToWeakObjectsMapTable">iOS Dev Center</a>
     */
    @Generated
    @Selector("strongToWeakObjectsMapTable")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> strongToWeakObjectsMapTable();

    /**
     * weakToStrongObjectsMapTable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/clm/NSMapTable/weakToStrongObjectsMapTable">iOS Dev Center</a>
     */
    @Generated
    @Selector("weakToStrongObjectsMapTable")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> weakToStrongObjectsMapTable();

    /**
     * weakToWeakObjectsMapTable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/clm/NSMapTable/weakToWeakObjectsMapTable">iOS Dev Center</a>
     */
    @Generated
    @Selector("weakToWeakObjectsMapTable")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> weakToWeakObjectsMapTable();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * count</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instp/NSMapTable/count">iOS Dev Center</a>
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
     * dictionaryRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/dictionaryRepresentation">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<_KeyType, _ObjectType> dictionaryRepresentation();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native NSMapTable<?, ?> init();

    @Generated
    @Selector("initWithCoder:")
    public native NSMapTable<?, ?> initWithCoder(NSCoder aDecoder);

    /**
     * initWithKeyOptions:valueOptions:capacity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/initWithKeyOptions:valueOptions:capacity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithKeyOptions:valueOptions:capacity:")
    public native NSMapTable<?, ?> initWithKeyOptionsValueOptionsCapacity(@NUInt long keyOptions,
            @NUInt long valueOptions, @NUInt long initialCapacity);

    /**
     * initWithKeyPointerFunctions:valuePointerFunctions:capacity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/initWithKeyPointerFunctions:valuePointerFunctions:capacity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithKeyPointerFunctions:valuePointerFunctions:capacity:")
    public native NSMapTable<?, ?> initWithKeyPointerFunctionsValuePointerFunctionsCapacity(
            NSPointerFunctions keyFunctions, NSPointerFunctions valueFunctions, @NUInt long initialCapacity);

    /**
     * keyEnumerator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/keyEnumerator">iOS Dev Center</a>
     */
    @Generated
    @Selector("keyEnumerator")
    public native NSEnumerator<_KeyType> keyEnumerator();

    /**
     * keyPointerFunctions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instp/NSMapTable/keyPointerFunctions">iOS Dev Center</a>
     */
    @Generated
    @Selector("keyPointerFunctions")
    public native NSPointerFunctions keyPointerFunctions();

    /**
     * objectEnumerator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/objectEnumerator">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    /**
     * objectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/objectForKey:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("objectForKey:")
    public native _ObjectType objectForKey(@Mapped(ObjCObjectMapper.class) _KeyType aKey);

    /**
     * removeAllObjects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/removeAllObjects">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    /**
     * removeObjectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/removeObjectForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObjectForKey:")
    public native void removeObjectForKey(@Mapped(ObjCObjectMapper.class) _KeyType aKey);

    /**
     * setObject:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instm/NSMapTable/setObject:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @Mapped(ObjCObjectMapper.class) _KeyType aKey);

    /**
     * valuePointerFunctions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMapTable_class/index.html#//apple_ref/occ/instp/NSMapTable/valuePointerFunctions">iOS Dev Center</a>
     */
    @Generated
    @Selector("valuePointerFunctions")
    public native NSPointerFunctions valuePointerFunctions();
}
