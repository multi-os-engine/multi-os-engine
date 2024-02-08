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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entities describe the "types" of objects available.
 * 
 * API-Since: 3.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSEntityDescription allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("entityForName:inManagedObjectContext:")
    public static native NSEntityDescription entityForNameInManagedObjectContext(@NotNull String entityName,
            @NotNull NSManagedObjectContext context);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @NotNull
    @Generated
    @Selector("insertNewObjectForEntityForName:inManagedObjectContext:")
    public static native NSManagedObject insertNewObjectForEntityForNameInManagedObjectContext(
            @NotNull String entityName, @NotNull NSManagedObjectContext context);

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
    @NotNull
    @Generated
    @Selector("attributesByName")
    public native NSDictionary<String, ? extends NSAttributeDescription> attributesByName();

    /**
     * Getter returns an array of arrays of NSPropertyDescription objects describing the components of the indexes.
     * Setter takes an array of arrays of NSPropertyDescription objects and/or strings that are the names of properties
     * of the entity on which the index is created. The special strings @"self" and @"entity" can be used to indicate
     * that an index should contain a reference to the object's primary or entity key.
     * This value does not form part of the entity's version hash, and may be ignored by stores which do not natively
     * support compound indexes.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use NSEntityDescription.indexes instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("compoundIndexes")
    public native NSArray<? extends NSArray<?>> compoundIndexes();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native NSEntityDescription init();

    @Generated
    @Selector("initWithCoder:")
    public native NSEntityDescription initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("isAbstract")
    public native boolean isAbstract();

    @Generated
    @Selector("setAbstract:")
    public native void setAbstract(boolean value);

    /**
     * Returns a boolean indicating if the receiver is a subentity of the specified entity. (This method is the Core
     * Data entity inheritance equivalent of -isKindOfClass:)
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isKindOfEntity:")
    public native boolean isKindOfEntity(@NotNull NSEntityDescription entity);

    @Generated
    @Selector("managedObjectClassName")
    public native String managedObjectClassName();

    @NotNull
    @Generated
    @Selector("managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();

    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    @NotNull
    @Generated
    @Selector("properties")
    public native NSArray<? extends NSPropertyDescription> properties();

    @NotNull
    @Generated
    @Selector("propertiesByName")
    public native NSDictionary<String, ? extends NSPropertyDescription> propertiesByName();

    @NotNull
    @Generated
    @Selector("relationshipsByName")
    public native NSDictionary<String, ? extends NSRelationshipDescription> relationshipsByName();

    @NotNull
    @Generated
    @Selector("relationshipsWithDestinationEntity:")
    public native NSArray<? extends NSRelationshipDescription> relationshipsWithDestinationEntity(
            @NotNull NSEntityDescription entity);

    /**
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("renamingIdentifier")
    public native String renamingIdentifier();

    /**
     * Getter returns an array of arrays of NSPropertyDescription objects describing the components of the indexes.
     * Setter takes an array of arrays of NSPropertyDescription objects and/or strings that are the names of properties
     * of the entity on which the index is created. The special strings @"self" and @"entity" can be used to indicate
     * that an index should contain a reference to the object's primary or entity key.
     * This value does not form part of the entity's version hash, and may be ignored by stores which do not natively
     * support compound indexes.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use NSEntityDescription.indexes instead
     */
    @Deprecated
    @Generated
    @Selector("setCompoundIndexes:")
    public native void setCompoundIndexes(@NotNull NSArray<? extends NSArray<?>> value);

    @Generated
    @Selector("setManagedObjectClassName:")
    public native void setManagedObjectClassName(String value);

    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    @Generated
    @Selector("setProperties:")
    public native void setProperties(@NotNull NSArray<? extends NSPropertyDescription> value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setRenamingIdentifier:")
    public native void setRenamingIdentifier(@Nullable String value);

    @Generated
    @Selector("setSubentities:")
    public native void setSubentities(@NotNull NSArray<? extends NSEntityDescription> value);

    /**
     * Returns/sets uniqueness constraints for the entity. A uniqueness constraint is a set of one or more attributes
     * whose value must be unique over the set of instances of that entity.
     * 
     * Sets an array of arrays, each of which contains one or more NSAttributeDescription or NSString instances (strings
     * must be the names of attributes on the entity) on which the constraint is registered.
     * Returns an array of arrays, each of which contains instances of NSString which identify the attributes on the
     * entity that comprise the constraint.
     * This value forms part of the entity's version hash. Stores which do not support uniqueness constraints should
     * refuse to initialize when given a model containing such constraints.
     * Discussion: uniqueness constraint violations can be computationally expensive to handle. It is highly suggested
     * that there be only one uniqueness constraint per entity hierarchy,
     * although subentites may extend a sueprentity's constraint.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setUniquenessConstraints:")
    public native void setUniquenessConstraints(@NotNull NSArray<? extends NSArray<?>> value);

    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Nullable NSDictionary<?, ?> value);

    /**
     * Returns/sets the version hash modifier for the entity. This value is included in the version hash for the entity,
     * allowing developers to mark/denote an entity as being a different "version" than another, even if all of the
     * values which affect persistence are equal. (Such a difference is important in cases where the structure of an
     * entity is unchanged, but the format or content of data has changed.)
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setVersionHashModifier:")
    public native void setVersionHashModifier(@Nullable String value);

    @NotNull
    @Generated
    @Selector("subentities")
    public native NSArray<? extends NSEntityDescription> subentities();

    @NotNull
    @Generated
    @Selector("subentitiesByName")
    public native NSDictionary<String, ? extends NSEntityDescription> subentitiesByName();

    @Nullable
    @Generated
    @Selector("superentity")
    public native NSEntityDescription superentity();

    /**
     * Returns/sets uniqueness constraints for the entity. A uniqueness constraint is a set of one or more attributes
     * whose value must be unique over the set of instances of that entity.
     * 
     * Sets an array of arrays, each of which contains one or more NSAttributeDescription or NSString instances (strings
     * must be the names of attributes on the entity) on which the constraint is registered.
     * Returns an array of arrays, each of which contains instances of NSString which identify the attributes on the
     * entity that comprise the constraint.
     * This value forms part of the entity's version hash. Stores which do not support uniqueness constraints should
     * refuse to initialize when given a model containing such constraints.
     * Discussion: uniqueness constraint violations can be computationally expensive to handle. It is highly suggested
     * that there be only one uniqueness constraint per entity hierarchy,
     * although subentites may extend a sueprentity's constraint.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("uniquenessConstraints")
    public native NSArray<? extends NSArray<?>> uniquenessConstraints();

    @Nullable
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * Returns the version hash for the entity. The version hash is used to uniquely identify an entity based on the
     * collection and configuration of properties for the entity. The version hash uses only values which affect the
     * persistence of data and the user-defined versionHashModifier value. (The values which affect persistence are the
     * name of the entity, the version hash of the superentity (if present), if the entity is abstract, and all of the
     * version hashes for the properties.) This value is stored as part of the version information in the metadata for
     * stores which use this entity, as well as a definition of an entity involved in an NSEntityMapping.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("versionHash")
    public native NSData versionHash();

    /**
     * Returns/sets the version hash modifier for the entity. This value is included in the version hash for the entity,
     * allowing developers to mark/denote an entity as being a different "version" than another, even if all of the
     * values which affect persistence are equal. (Such a difference is important in cases where the structure of an
     * entity is unchanged, but the format or content of data has changed.)
     * 
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("versionHashModifier")
    public native String versionHashModifier();

    /**
     * Expression used to compute the CoreSpotlight display name for instance of this entity.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("coreSpotlightDisplayNameExpression")
    public native NSExpression coreSpotlightDisplayNameExpression();

    /**
     * Returns/sets the set of indexes for the entity. Returns/takes an array of NSFetchIndexDescription instances. This
     * value does not form part of the entity's version hash, and may be ignored by stores which do not natively support
     * indexing.
     * IMPORTANT: Indexes should be the last things set in a model. Changing an entity hierarchy in any way that could
     * affect the validity of indexes (adding or removing super/subentities, adding or removing properties anywhere in
     * the hierarchy) will cause all exisiting indexes for entities in that hierarchy to be dropped.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("indexes")
    public native NSArray<? extends NSFetchIndexDescription> indexes();

    /**
     * Expression used to compute the CoreSpotlight display name for instance of this entity.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setCoreSpotlightDisplayNameExpression:")
    public native void setCoreSpotlightDisplayNameExpression(@NotNull NSExpression value);

    /**
     * Returns/sets the set of indexes for the entity. Returns/takes an array of NSFetchIndexDescription instances. This
     * value does not form part of the entity's version hash, and may be ignored by stores which do not natively support
     * indexing.
     * IMPORTANT: Indexes should be the last things set in a model. Changing an entity hierarchy in any way that could
     * affect the validity of indexes (adding or removing super/subentities, adding or removing properties anywhere in
     * the hierarchy) will cause all exisiting indexes for entities in that hierarchy to be dropped.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setIndexes:")
    public native void setIndexes(@NotNull NSArray<? extends NSFetchIndexDescription> value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
