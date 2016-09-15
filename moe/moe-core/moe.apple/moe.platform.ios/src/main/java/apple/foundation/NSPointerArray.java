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
public class NSPointerArray extends NSObject implements NSFastEnumeration, NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPointerArray(Pointer peer) {
        super(peer);
    }

    /**
     * addPointer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instm/NSPointerArray/addPointer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addPointer:")
    public native void addPointer(VoidPtr pointer);

    /**
     * allObjects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instp/NSPointerArray/allObjects">iOS Dev Center</a>
     */
    @Generated
    @Selector("allObjects")
    public native NSArray<?> allObjects();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPointerArray alloc();

    /**
     * compact</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instm/NSPointerArray/compact">iOS Dev Center</a>
     */
    @Generated
    @Selector("compact")
    public native void compact();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * count</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instp/NSPointerArray/count">iOS Dev Center</a>
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state, Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native NSPointerArray init();

    @Generated
    @Selector("initWithCoder:")
    public native NSPointerArray initWithCoder(NSCoder aDecoder);

    /**
     * initWithOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instm/NSPointerArray/initWithOptions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithOptions:")
    public native NSPointerArray initWithOptions(@NUInt long options);

    /**
     * initWithPointerFunctions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instm/NSPointerArray/initWithPointerFunctions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithPointerFunctions:")
    public native NSPointerArray initWithPointerFunctions(NSPointerFunctions functions);

    /**
     * insertPointer:atIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instm/NSPointerArray/insertPointer:atIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertPointer:atIndex:")
    public native void insertPointerAtIndex(VoidPtr item, @NUInt long index);

    /**
     * pointerArrayWithOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/clm/NSPointerArray/pointerArrayWithOptions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pointerArrayWithOptions:")
    public static native NSPointerArray pointerArrayWithOptions(@NUInt long options);

    /**
     * pointerArrayWithPointerFunctions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/clm/NSPointerArray/pointerArrayWithPointerFunctions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pointerArrayWithPointerFunctions:")
    public static native NSPointerArray pointerArrayWithPointerFunctions(NSPointerFunctions functions);

    /**
     * pointerAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instm/NSPointerArray/pointerAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pointerAtIndex:")
    public native VoidPtr pointerAtIndex(@NUInt long index);

    /**
     * pointerFunctions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instp/NSPointerArray/pointerFunctions">iOS Dev Center</a>
     */
    @Generated
    @Selector("pointerFunctions")
    public native NSPointerFunctions pointerFunctions();

    /**
     * removePointerAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instm/NSPointerArray/removePointerAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removePointerAtIndex:")
    public native void removePointerAtIndex(@NUInt long index);

    /**
     * replacePointerAtIndex:withPointer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instm/NSPointerArray/replacePointerAtIndex:withPointer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replacePointerAtIndex:withPointer:")
    public native void replacePointerAtIndexWithPointer(@NUInt long index, VoidPtr item);

    /**
     * count</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/instp/NSPointerArray/count">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCount:")
    public native void setCount(@NUInt long value);

    /**
     * strongObjectsPointerArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/clm/NSPointerArray/strongObjectsPointerArray">iOS Dev Center</a>
     */
    @Generated
    @Selector("strongObjectsPointerArray")
    public static native NSPointerArray strongObjectsPointerArray();

    /**
     * weakObjectsPointerArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerArray_Class/index.html#//apple_ref/occ/clm/NSPointerArray/weakObjectsPointerArray">iOS Dev Center</a>
     */
    @Generated
    @Selector("weakObjectsPointerArray")
    public static native NSPointerArray weakObjectsPointerArray();

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
}
