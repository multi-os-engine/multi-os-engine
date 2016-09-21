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

package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSEntityDescription extends NSObject implements NSCoding, NSCopying, NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSEntityDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSEntityDescription alloc();

    @Generated
    @Selector("entityForName:inManagedObjectContext:")
    public static native NSEntityDescription entityForNameInManagedObjectContext(String entityName,
            NSManagedObjectContext context);

    @Generated
    @Selector("insertNewObjectForEntityForName:inManagedObjectContext:")
    public static native NSManagedObject insertNewObjectForEntityForNameInManagedObjectContext(String entityName,
            NSManagedObjectContext context);

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("attributesByName")
    public native NSDictionary<String, ? extends NSAttributeDescription> attributesByName();

    @Generated
    @Selector("compoundIndexes")
    public native NSArray<? extends NSArray<?>> compoundIndexes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state, Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native NSEntityDescription init();

    @Generated
    @Selector("initWithCoder:")
    public native NSEntityDescription initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isAbstract")
    public native boolean isAbstract();

    @Generated
    @Selector("setAbstract:")
    public native void setAbstract(boolean value);

    @Generated
    @Selector("isKindOfEntity:")
    public native boolean isKindOfEntity(NSEntityDescription entity);

    @Generated
    @Selector("managedObjectClassName")
    public native String managedObjectClassName();

    @Generated
    @Selector("managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("properties")
    public native NSArray<? extends NSPropertyDescription> properties();

    @Generated
    @Selector("propertiesByName")
    public native NSDictionary<String, ? extends NSPropertyDescription> propertiesByName();

    @Generated
    @Selector("relationshipsByName")
    public native NSDictionary<String, ? extends NSRelationshipDescription> relationshipsByName();

    @Generated
    @Selector("relationshipsWithDestinationEntity:")
    public native NSArray<? extends NSRelationshipDescription> relationshipsWithDestinationEntity(
            NSEntityDescription entity);

    @Generated
    @Selector("renamingIdentifier")
    public native String renamingIdentifier();

    @Generated
    @Selector("setCompoundIndexes:")
    public native void setCompoundIndexes(NSArray<? extends NSArray<?>> value);

    @Generated
    @Selector("setManagedObjectClassName:")
    public native void setManagedObjectClassName(String value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setProperties:")
    public native void setProperties(NSArray<? extends NSPropertyDescription> value);

    @Generated
    @Selector("setRenamingIdentifier:")
    public native void setRenamingIdentifier(String value);

    @Generated
    @Selector("setSubentities:")
    public native void setSubentities(NSArray<? extends NSEntityDescription> value);

    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    @Generated
    @Selector("setVersionHashModifier:")
    public native void setVersionHashModifier(String value);

    @Generated
    @Selector("subentities")
    public native NSArray<? extends NSEntityDescription> subentities();

    @Generated
    @Selector("subentitiesByName")
    public native NSDictionary<String, ? extends NSEntityDescription> subentitiesByName();

    @Generated
    @Selector("superentity")
    public native NSEntityDescription superentity();

    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    @Generated
    @Selector("versionHash")
    public native NSData versionHash();

    @Generated
    @Selector("versionHashModifier")
    public native String versionHashModifier();

    @Generated
    @Selector("setUniquenessConstraints:")
    public native void setUniquenessConstraints(NSArray<? extends NSArray<?>> value);

    @Generated
    @Selector("uniquenessConstraints")
    public native NSArray<? extends NSArray<?>> uniquenessConstraints();
}
