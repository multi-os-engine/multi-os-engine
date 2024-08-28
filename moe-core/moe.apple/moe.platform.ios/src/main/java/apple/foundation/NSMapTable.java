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
 * API-Since: 6.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMapTable<_KeyType, _ObjectType> extends NSObject implements NSCopying, NSSecureCoding,
        NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMapTable(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMapTable<?, ?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMapTable<?, ?> allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("mapTableWithKeyOptions:valueOptions:")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> mapTableWithKeyOptionsValueOptions(
            @NUInt long keyOptions, @NUInt long valueOptions);

    @Generated
    @Owned
    @Selector("new")
    public static native NSMapTable<?, ?> new_objc();

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
    @Selector("strongToStrongObjectsMapTable")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> strongToStrongObjectsMapTable();

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("strongToWeakObjectsMapTable")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> strongToWeakObjectsMapTable();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * entries are not necessarily purged right away when the weak key is reclaimed
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("weakToStrongObjectsMapTable")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> weakToStrongObjectsMapTable();

    /**
     * entries are not necessarily purged right away when the weak key or object is reclaimed
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("weakToWeakObjectsMapTable")
    public static native <_KeyType, _ObjectType> NSMapTable<_KeyType, _ObjectType> weakToWeakObjectsMapTable();

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

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(@NotNull VoidPtr state,
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    /**
     * create a dictionary of contents
     */
    @NotNull
    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<_KeyType, _ObjectType> dictionaryRepresentation();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native NSMapTable<?, ?> init();

    @Generated
    @Selector("initWithCoder:")
    public native NSMapTable<?, ?> initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithKeyOptions:valueOptions:capacity:")
    public native NSMapTable<?, ?> initWithKeyOptionsValueOptionsCapacity(@NUInt long keyOptions,
            @NUInt long valueOptions, @NUInt long initialCapacity);

    @Generated
    @Selector("initWithKeyPointerFunctions:valuePointerFunctions:capacity:")
    public native NSMapTable<?, ?> initWithKeyPointerFunctionsValuePointerFunctionsCapacity(
            @NotNull NSPointerFunctions keyFunctions, @NotNull NSPointerFunctions valueFunctions,
            @NUInt long initialCapacity);

    @NotNull
    @Generated
    @Selector("keyEnumerator")
    public native NSEnumerator<_KeyType> keyEnumerator();

    /**
     * return an NSPointerFunctions object reflecting the functions in use. This is a new autoreleased object that can
     * be subsequently modified and/or used directly in the creation of other pointer "collections".
     */
    @NotNull
    @Generated
    @Selector("keyPointerFunctions")
    public native NSPointerFunctions keyPointerFunctions();

    @Nullable
    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    @Nullable
    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectForKey(@Nullable @Mapped(ObjCObjectMapper.class) _KeyType aKey);

    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    @Generated
    @Selector("removeObjectForKey:")
    public native void removeObjectForKey(@Nullable @Mapped(ObjCObjectMapper.class) _KeyType aKey);

    /**
     * add/replace value (CFDictionarySetValue, NSMapInsert)
     */
    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Nullable @Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @Nullable @Mapped(ObjCObjectMapper.class) _KeyType aKey);

    @NotNull
    @Generated
    @Selector("valuePointerFunctions")
    public native NSPointerFunctions valuePointerFunctions();

    @Generated
    @Selector("supportsSecureCoding")
    public static native <_KeyType, _ObjectType> boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
