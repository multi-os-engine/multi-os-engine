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
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NSPointerArray.h
 * 
 * A PointerArray acts like a traditional array that slides elements on insertion or deletion.
 * Unlike traditional arrays, it holds NULLs, which can be inserted or extracted (and contribute to count).
 * Also unlike traditional arrays, the 'count' of the array may be set directly.
 * Using NSPointerFunctionsWeakMemory object references will turn to NULL on last release.
 * 
 * The copying and archiving protocols are applicable only when NSPointerArray is configured for Object uses.
 * The fast enumeration protocol (supporting the for..in statement) will yield NULLs if present. It is defined for all
 * types of pointers although the language syntax doesn't directly support this.
 * 
 * API-Since: 6.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPointerArray extends NSObject implements NSFastEnumeration, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPointerArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPointerArray alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPointerArray allocWithZone(VoidPtr zone);

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
    public static native NSPointerArray new_objc();

    @NotNull
    @Generated
    @Selector("pointerArrayWithOptions:")
    public static native NSPointerArray pointerArrayWithOptions(@NUInt long options);

    @NotNull
    @Generated
    @Selector("pointerArrayWithPointerFunctions:")
    public static native NSPointerArray pointerArrayWithPointerFunctions(@NotNull NSPointerFunctions functions);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("strongObjectsPointerArray")
    public static native NSPointerArray strongObjectsPointerArray();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("weakObjectsPointerArray")
    public static native NSPointerArray weakObjectsPointerArray();

    /**
     * add pointer at index 'count'
     */
    @Generated
    @Selector("addPointer:")
    public native void addPointer(@Nullable VoidPtr pointer);

    @NotNull
    @Generated
    @Selector("allObjects")
    public native NSArray<?> allObjects();

    /**
     * eliminate NULLs
     */
    @Generated
    @Selector("compact")
    public native void compact();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Getter: the number of elements in the array, including NULLs
     * Setter: sets desired number of elements, adding NULLs or removing items as necessary.
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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native NSPointerArray init();

    @Generated
    @Selector("initWithCoder:")
    public native NSPointerArray initWithCoder(@NotNull NSCoder coder);

    /**
     * construction
     */
    @Generated
    @Selector("initWithOptions:")
    public native NSPointerArray initWithOptions(@NUInt long options);

    @Generated
    @Selector("initWithPointerFunctions:")
    public native NSPointerArray initWithPointerFunctions(@NotNull NSPointerFunctions functions);

    /**
     * everything at & above index, including holes, slide higher
     */
    @Generated
    @Selector("insertPointer:atIndex:")
    public native void insertPointerAtIndex(@Nullable VoidPtr item, @NUInt long index);

    @Nullable
    @Generated
    @Selector("pointerAtIndex:")
    public native VoidPtr pointerAtIndex(@NUInt long index);

    /**
     * return an NSPointerFunctions object reflecting the functions in use. This is a new autoreleased object that can
     * be subsequently modified and/or used directly in the creation of other pointer "collections".
     */
    @NotNull
    @Generated
    @Selector("pointerFunctions")
    public native NSPointerFunctions pointerFunctions();

    /**
     * everything above index, including holes, slide lower
     */
    @Generated
    @Selector("removePointerAtIndex:")
    public native void removePointerAtIndex(@NUInt long index);

    /**
     * O(1); NULL item is okay; index must be < count
     */
    @Generated
    @Selector("replacePointerAtIndex:withPointer:")
    public native void replacePointerAtIndexWithPointer(@NUInt long index, @Nullable VoidPtr item);

    /**
     * Getter: the number of elements in the array, including NULLs
     * Setter: sets desired number of elements, adding NULLs or removing items as necessary.
     */
    @Generated
    @Selector("setCount:")
    public native void setCount(@NUInt long value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
