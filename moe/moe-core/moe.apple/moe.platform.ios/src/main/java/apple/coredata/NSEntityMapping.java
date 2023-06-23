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
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSExpression;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSEntityMapping extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSEntityMapping(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSEntityMapping alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSEntityMapping allocWithZone(VoidPtr zone);

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
    public static native NSEntityMapping new_objc();

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
     * Returns/sets the array of attribute mappings for the entity mapping. The order of mappings in this collection
     * dictates the order in which the mappings will be processed during a migration.
     */
    @Nullable
    @Generated
    @Selector("attributeMappings")
    public native NSArray<? extends NSPropertyMapping> attributeMappings();

    /**
     * Returns/sets the destination entity name for the mapping. (Mappings are not directly bound to
     * NSEntityDescriptions; developers can use the destinationEntityForEntityMapping: API on the NSMigrationManager to
     * retrieve the entity description for this name.)
     */
    @Nullable
    @Generated
    @Selector("destinationEntityName")
    public native String destinationEntityName();

    /**
     * Returns/sets the version hash for the destination entity for the mapping. VersionHashes are calculated by the
     * Core Data framework (see NSEntityDescrition's versionHash method). The destinationEntityVersionHash must equal
     * the version hash of the destination entity represented by the mapping.
     */
    @Nullable
    @Generated
    @Selector("destinationEntityVersionHash")
    public native NSData destinationEntityVersionHash();

    /**
     * Returns/sets the class name of the migration policy for the class. If not specified, the default migration class
     * name is NSEntityMigrationPolicy, though developers can specify a subclass for specific behavior.
     */
    @Nullable
    @Generated
    @Selector("entityMigrationPolicyClassName")
    public native String entityMigrationPolicyClassName();

    @Generated
    @Selector("init")
    public native NSEntityMapping init();

    /**
     * Returns/sets the mapping type. (If a custom entity mapping type is utilized, the developer must specify a
     * migrationPolicyClassName as well.)
     */
    @Generated
    @Selector("mappingType")
    @NUInt
    public native long mappingType();

    /**
     * Returns/sets the name of the mapping. The name is used only as a means of distinguishing mappings in a model. If
     * not specified, defaults to the string composed by the source entity name followed by the destination entity name
     * (ex. SourceName->DestinationName)
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * Returns/sets the array of relationship mappings for the entity mapping. The order of mappings in this collection
     * dictates the order in which the mappings will be processed during a migration.
     */
    @Nullable
    @Generated
    @Selector("relationshipMappings")
    public native NSArray<? extends NSPropertyMapping> relationshipMappings();

    /**
     * Returns/sets the array of attribute mappings for the entity mapping. The order of mappings in this collection
     * dictates the order in which the mappings will be processed during a migration.
     */
    @Generated
    @Selector("setAttributeMappings:")
    public native void setAttributeMappings(@Nullable NSArray<? extends NSPropertyMapping> value);

    /**
     * Returns/sets the destination entity name for the mapping. (Mappings are not directly bound to
     * NSEntityDescriptions; developers can use the destinationEntityForEntityMapping: API on the NSMigrationManager to
     * retrieve the entity description for this name.)
     */
    @Generated
    @Selector("setDestinationEntityName:")
    public native void setDestinationEntityName(@Nullable String value);

    /**
     * Returns/sets the version hash for the destination entity for the mapping. VersionHashes are calculated by the
     * Core Data framework (see NSEntityDescrition's versionHash method). The destinationEntityVersionHash must equal
     * the version hash of the destination entity represented by the mapping.
     */
    @Generated
    @Selector("setDestinationEntityVersionHash:")
    public native void setDestinationEntityVersionHash(@Nullable NSData value);

    /**
     * Returns/sets the class name of the migration policy for the class. If not specified, the default migration class
     * name is NSEntityMigrationPolicy, though developers can specify a subclass for specific behavior.
     */
    @Generated
    @Selector("setEntityMigrationPolicyClassName:")
    public native void setEntityMigrationPolicyClassName(@Nullable String value);

    /**
     * Returns/sets the mapping type. (If a custom entity mapping type is utilized, the developer must specify a
     * migrationPolicyClassName as well.)
     */
    @Generated
    @Selector("setMappingType:")
    public native void setMappingType(@NUInt long value);

    /**
     * Returns/sets the name of the mapping. The name is used only as a means of distinguishing mappings in a model. If
     * not specified, defaults to the string composed by the source entity name followed by the destination entity name
     * (ex. SourceName->DestinationName)
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * Returns/sets the array of relationship mappings for the entity mapping. The order of mappings in this collection
     * dictates the order in which the mappings will be processed during a migration.
     */
    @Generated
    @Selector("setRelationshipMappings:")
    public native void setRelationshipMappings(@Nullable NSArray<? extends NSPropertyMapping> value);

    /**
     * Returns/sets the source entity name for the mapping. (Mappings are not directly bound to NSEntityDescriptions;
     * developers can use the sourceEntityForEntityMapping: API on the NSMigrationManager to retrieve the entity
     * description for this name.)
     */
    @Generated
    @Selector("setSourceEntityName:")
    public native void setSourceEntityName(@Nullable String value);

    /**
     * Returns/sets the version hash for the source entity for the mapping. VersionHashes are calculated by the Core
     * Data framework (see NSEntityDescrition's versionHash method). The sourceEntityVersionHash must equal the version
     * hash of the source entity represented by the mapping.
     */
    @Generated
    @Selector("setSourceEntityVersionHash:")
    public native void setSourceEntityVersionHash(@Nullable NSData value);

    /**
     * Returns/sets the source expression for the mapping. The source expression is used to obtain the collection of
     * managed object instances to process through the mapping. The expression can be a fetch request expression, or any
     * other expression which evaluates to a collection.
     */
    @Generated
    @Selector("setSourceExpression:")
    public native void setSourceExpression(@Nullable NSExpression value);

    /**
     * Returns/sets the user info dictionary for the mapping
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Nullable NSDictionary<?, ?> value);

    /**
     * Returns/sets the source entity name for the mapping. (Mappings are not directly bound to NSEntityDescriptions;
     * developers can use the sourceEntityForEntityMapping: API on the NSMigrationManager to retrieve the entity
     * description for this name.)
     */
    @Nullable
    @Generated
    @Selector("sourceEntityName")
    public native String sourceEntityName();

    /**
     * Returns/sets the version hash for the source entity for the mapping. VersionHashes are calculated by the Core
     * Data framework (see NSEntityDescrition's versionHash method). The sourceEntityVersionHash must equal the version
     * hash of the source entity represented by the mapping.
     */
    @Nullable
    @Generated
    @Selector("sourceEntityVersionHash")
    public native NSData sourceEntityVersionHash();

    /**
     * Returns/sets the source expression for the mapping. The source expression is used to obtain the collection of
     * managed object instances to process through the mapping. The expression can be a fetch request expression, or any
     * other expression which evaluates to a collection.
     */
    @Nullable
    @Generated
    @Selector("sourceExpression")
    public native NSExpression sourceExpression();

    /**
     * Returns/sets the user info dictionary for the mapping
     */
    @Nullable
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();
}
