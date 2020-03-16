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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSHashTable<_ObjectType> extends NSObject implements NSCopying, NSSecureCoding, NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSHashTable(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSHashTable<?> alloc();

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
    @Selector("hashTableWithOptions:")
    public static native <_ObjectType> NSHashTable<_ObjectType> hashTableWithOptions(@NUInt long options);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("weakObjectsHashTable")
    public static native <_ObjectType> NSHashTable<_ObjectType> weakObjectsHashTable();

    @Generated
    @Selector("addObject:")
    public native void addObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("allObjects")
    public native NSArray<_ObjectType> allObjects();

    @Generated
    @Selector("anyObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType anyObject();

    @Generated
    @Selector("containsObject:")
    public native boolean containsObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NSHashTable<?> init();

    @Generated
    @Selector("initWithCoder:")
    public native NSHashTable<?> initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithOptions:capacity:")
    public native NSHashTable<?> initWithOptionsCapacity(@NUInt long options, @NUInt long initialCapacity);

    @Generated
    @Selector("initWithPointerFunctions:capacity:")
    public native NSHashTable<?> initWithPointerFunctionsCapacity(NSPointerFunctions functions,
            @NUInt long initialCapacity);

    @Generated
    @Selector("intersectHashTable:")
    public native void intersectHashTable(NSHashTable<_ObjectType> other);

    @Generated
    @Selector("intersectsHashTable:")
    public native boolean intersectsHashTable(NSHashTable<_ObjectType> other);

    @Generated
    @Selector("isEqualToHashTable:")
    public native boolean isEqualToHashTable(NSHashTable<_ObjectType> other);

    @Generated
    @Selector("isSubsetOfHashTable:")
    public native boolean isSubsetOfHashTable(NSHashTable<_ObjectType> other);

    @Generated
    @Selector("member:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType member(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("minusHashTable:")
    public native void minusHashTable(NSHashTable<_ObjectType> other);

    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    @Generated
    @Selector("pointerFunctions")
    public native NSPointerFunctions pointerFunctions();

    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    @Generated
    @Selector("removeObject:")
    public native void removeObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("setRepresentation")
    public native NSSet<_ObjectType> setRepresentation();

    @Generated
    @Selector("unionHashTable:")
    public native void unionHashTable(NSHashTable<_ObjectType> other);

    @Generated
    @Selector("supportsSecureCoding")
    public static native <_ObjectType> boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
