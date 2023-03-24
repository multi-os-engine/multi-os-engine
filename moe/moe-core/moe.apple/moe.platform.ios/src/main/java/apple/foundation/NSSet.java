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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Immutable Set ***************
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSet<_ObjectType> extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding,
        NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSSet<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSSet<?> allocWithZone(VoidPtr zone);

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
    public static native NSSet<?> new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("set")
    public static native <_ObjectType> NSSet<?> set();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWithArray:")
    public static native <_ObjectType> NSSet<?> setWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("setWithObject:")
    public static native <_ObjectType> NSSet<?> setWithObject(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("setWithObjects:")
    public static native <_ObjectType> NSSet<?> setWithObjects(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("setWithObjects:count:")
    public static native <_ObjectType> NSSet<?> setWithObjectsCount(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("setWithSet:")
    public static native <_ObjectType> NSSet<?> setWithSet(@NotNull NSSet<_ObjectType> set);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native <_ObjectType> boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * NSSets are not observable, so these methods raise exceptions when invoked on NSSets. Instead of observing a set,
     * observe the unordered to-many relationship for which the set is the collection of related objects.
     */
    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(@NotNull NSObject observer, @NotNull String keyPath,
            @NUInt long options, @Nullable VoidPtr context);

    @NotNull
    @Generated
    @Selector("allObjects")
    public native NSArray<_ObjectType> allObjects();

    @Nullable
    @Generated
    @Selector("anyObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType anyObject();

    @Generated
    @Selector("containsObject:")
    public native boolean containsObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

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

    @NotNull
    @Generated
    @Selector("description")
    public native String description();

    @NotNull
    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Nullable @Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @NotNull @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptionsUsingBlock(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

    /**
     * evaluate a predicate against a set of objects and return a filtered set
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("filteredSetUsingPredicate:")
    public native NSSet<_ObjectType> filteredSetUsingPredicate(@NotNull NSPredicate predicate);

    @Generated
    @Selector("init")
    public native NSSet<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSSet<?> initWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithCoder:")
    public native NSSet<?> initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSSet<?> initWithObjects(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSSet<?> initWithObjectsCount(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("initWithSet:")
    public native NSSet<?> initWithSet(@NotNull NSSet<_ObjectType> set);

    @Generated
    @Selector("initWithSet:copyItems:")
    public native NSSet<?> initWithSetCopyItems(@NotNull NSSet<_ObjectType> set, boolean flag);

    @Generated
    @Selector("intersectsSet:")
    public native boolean intersectsSet(@NotNull NSSet<_ObjectType> otherSet);

    @Generated
    @Selector("isEqualToSet:")
    public native boolean isEqualToSet(@NotNull NSSet<_ObjectType> otherSet);

    @Generated
    @Selector("isSubsetOfSet:")
    public native boolean isSubsetOfSet(@NotNull NSSet<_ObjectType> otherSet);

    @Generated
    @Selector("makeObjectsPerformSelector:")
    public native void makeObjectsPerformSelector(@NotNull SEL aSelector);

    @Generated
    @Selector("makeObjectsPerformSelector:withObject:")
    public native void makeObjectsPerformSelectorWithObject(@NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object argument);

    @Nullable
    @Generated
    @Selector("member:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType member(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @NotNull
    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("objectsPassingTest:")
    public native NSSet<_ObjectType> objectsPassingTest(
            @NotNull @ObjCBlock(name = "call_objectsPassingTest") Block_objectsPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("objectsWithOptions:passingTest:")
    public native NSSet<_ObjectType> objectsWithOptionsPassingTest(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_objectsWithOptionsPassingTest") Block_objectsWithOptionsPassingTest predicate);

    @Generated
    @Selector("removeObserver:forKeyPath:")
    public native void removeObserverForKeyPath(@NotNull NSObject observer, @NotNull String keyPath);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("removeObserver:forKeyPath:context:")
    public native void removeObserverForKeyPathContext(@NotNull NSObject observer, @NotNull String keyPath,
            @Nullable VoidPtr context);

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("setByAddingObject:")
    public native NSSet<_ObjectType> setByAddingObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("setByAddingObjectsFromArray:")
    public native NSSet<_ObjectType> setByAddingObjectsFromArray(@NotNull NSArray<_ObjectType> other);

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("setByAddingObjectsFromSet:")
    public native NSSet<_ObjectType> setByAddingObjectsFromSet(@NotNull NSSet<_ObjectType> other);

    /**
     * Invoke -setValue:forKey: on each of the receiver's members.
     */
    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object value, @NotNull String key);

    /**
     * returns a new array by sorting the objects of the receiver
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("sortedArrayUsingDescriptors:")
    public native NSArray<_ObjectType> sortedArrayUsingDescriptors(
            @NotNull NSArray<? extends NSSortDescriptor> sortDescriptors);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Return a set containing the results of invoking -valueForKey: on each of the receiver's members. The returned set
     * might not have the same number of members as the receiver. The returned set will not contain any elements
     * corresponding to instances of -valueForKey: returning nil (in contrast with -[NSArray(NSKeyValueCoding)
     * valueForKey:], which may put NSNulls in the arrays it returns).
     */
    @NotNull
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(@NotNull String key);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsUsingBlock {
        @Generated
        void call_enumerateObjectsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsWithOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsWithOptionsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_objectsPassingTest {
        @Generated
        boolean call_objectsPassingTest(@NotNull @Mapped(ObjCObjectMapper.class) Object obj, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_objectsWithOptionsPassingTest {
        @Generated
        boolean call_objectsWithOptionsPassingTest(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NotNull BoolPtr stop);
    }
}
