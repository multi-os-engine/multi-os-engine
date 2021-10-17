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
import apple.foundation.NSExpression;
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
import org.moe.natj.general.ann.ReferenceInfo;
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

/**
 * Entities describe the "types" of objects available.
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSEntityDescription alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSEntityDescription allocWithZone(VoidPtr zone);

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
    @Selector("entityForName:inManagedObjectContext:")
    public static native NSEntityDescription entityForNameInManagedObjectContext(String entityName,
            NSManagedObjectContext context);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("insertNewObjectForEntityForName:inManagedObjectContext:")
    public static native NSManagedObject insertNewObjectForEntityForNameInManagedObjectContext(String entityName,
            NSManagedObjectContext context);

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
    public static native NSEntityDescription new_objc();

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
     * convenience methods to get the most common (and most relevant) types of properties for an entity
     */
    @Generated
    @Selector("attributesByName")
    public native NSDictionary<String, ? extends NSAttributeDescription> attributesByName();

    /**
     * Getter returns an array of arrays of NSPropertyDescription objects describing the components of the indexes.
     * Setter takes an array of arrays of NSPropertyDescription objects and/or strings that are the names of properties of the entity on which the index is created. The special strings @"self" and @"entity" can be used to indicate that an index should contain a reference to the object's primary or entity key.
     * This value does not form part of the entity's version hash, and may be ignored by stores which do not natively support compound indexes.
     */
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
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NSEntityDescription init();

    @Generated
    @Selector("initWithCoder:")
    public native NSEntityDescription initWithCoder(NSCoder coder);

    @Generated
    @Selector("isAbstract")
    public native boolean isAbstract();

    @Generated
    @Selector("setAbstract:")
    public native void setAbstract(boolean value);

    /**
     * Returns a boolean indicating if the receiver is a subentity of the specified entity.  (This method is the Core Data entity inheritance equivalent of -isKindOfClass:)
     */
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

    /**
     * Getter returns an array of arrays of NSPropertyDescription objects describing the components of the indexes.
     * Setter takes an array of arrays of NSPropertyDescription objects and/or strings that are the names of properties of the entity on which the index is created. The special strings @"self" and @"entity" can be used to indicate that an index should contain a reference to the object's primary or entity key.
     * This value does not form part of the entity's version hash, and may be ignored by stores which do not natively support compound indexes.
     */
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

    /**
     * Returns/sets uniqueness constraints for the entity. A uniqueness constraint is a set of one or more attributes whose value must be unique over the set of instances of that entity.
     * <p>
     * Sets an array of arrays, each of which contains one or more NSAttributeDescription or NSString instances (strings must be the names of attributes on the entity) on which the constraint is registered.
     * Returns an array of arrays, each of which contains instances of NSString which identify the attributes on the entity that comprise the constraint.
     * This value forms part of the entity's version hash. Stores which do not support uniqueness constraints should refuse to initialize when given a model containing such constraints.
     * Discussion: uniqueness constraint violations can be computationally expensive to handle. It is highly suggested that there be only one uniqueness constraint per entity hierarchy,
     * although subentites may extend a sueprentity's constraint.
     */
    @Generated
    @Selector("setUniquenessConstraints:")
    public native void setUniquenessConstraints(NSArray<? extends NSArray<?>> value);

    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    /**
     * Returns/sets the version hash modifier for the entity.  This value is included in the version hash for the entity, allowing developers to mark/denote an entity as being a different "version" than another, even if all of the values which affect persistence are equal.  (Such a difference is important in cases where the structure of an entity is unchanged, but the format or content of data has changed.)
     */
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

    /**
     * Returns/sets uniqueness constraints for the entity. A uniqueness constraint is a set of one or more attributes whose value must be unique over the set of instances of that entity.
     * <p>
     * Sets an array of arrays, each of which contains one or more NSAttributeDescription or NSString instances (strings must be the names of attributes on the entity) on which the constraint is registered.
     * Returns an array of arrays, each of which contains instances of NSString which identify the attributes on the entity that comprise the constraint.
     * This value forms part of the entity's version hash. Stores which do not support uniqueness constraints should refuse to initialize when given a model containing such constraints.
     * Discussion: uniqueness constraint violations can be computationally expensive to handle. It is highly suggested that there be only one uniqueness constraint per entity hierarchy,
     * although subentites may extend a sueprentity's constraint.
     */
    @Generated
    @Selector("uniquenessConstraints")
    public native NSArray<? extends NSArray<?>> uniquenessConstraints();

    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * Returns the version hash for the entity.  The version hash is used to uniquely identify an entity based on the collection and configuration of properties for the entity.  The version hash uses only values which affect the persistence of data and the user-defined versionHashModifier value.  (The values which affect persistence are the name of the entity, the version hash of the superentity (if present), if the entity is abstract, and all of the version hashes for the properties.)  This value is stored as part of the version information in the metadata for stores which use this entity, as well as a definition of an entity involved in an NSEntityMapping.
     */
    @Generated
    @Selector("versionHash")
    public native NSData versionHash();

    /**
     * Returns/sets the version hash modifier for the entity.  This value is included in the version hash for the entity, allowing developers to mark/denote an entity as being a different "version" than another, even if all of the values which affect persistence are equal.  (Such a difference is important in cases where the structure of an entity is unchanged, but the format or content of data has changed.)
     */
    @Generated
    @Selector("versionHashModifier")
    public native String versionHashModifier();

    /**
     * Expression used to compute the CoreSpotlight display name for instance of this entity.
     */
    @Generated
    @Selector("coreSpotlightDisplayNameExpression")
    public native NSExpression coreSpotlightDisplayNameExpression();

    /**
     * Returns/sets the set of indexes for the entity. Returns/takes an array of NSFetchIndexDescription instances. This value does not form part of the entity's version hash, and may be ignored by stores which do not natively support indexing.
     * IMPORTANT: Indexes should be the last things set in a model. Changing an entity hierarchy in any way that could affect the validity of indexes (adding or removing super/subentities, adding or removing properties anywhere in the hierarchy) will cause all exisiting indexes for entities in that hierarchy to be dropped.
     */
    @Generated
    @Selector("indexes")
    public native NSArray<? extends NSFetchIndexDescription> indexes();

    /**
     * Expression used to compute the CoreSpotlight display name for instance of this entity.
     */
    @Generated
    @Selector("setCoreSpotlightDisplayNameExpression:")
    public native void setCoreSpotlightDisplayNameExpression(NSExpression value);

    /**
     * Returns/sets the set of indexes for the entity. Returns/takes an array of NSFetchIndexDescription instances. This value does not form part of the entity's version hash, and may be ignored by stores which do not natively support indexing.
     * IMPORTANT: Indexes should be the last things set in a model. Changing an entity hierarchy in any way that could affect the validity of indexes (adding or removing super/subentities, adding or removing properties anywhere in the hierarchy) will cause all exisiting indexes for entities in that hierarchy to be dropped.
     */
    @Generated
    @Selector("setIndexes:")
    public native void setIndexes(NSArray<? extends NSFetchIndexDescription> value);
}
