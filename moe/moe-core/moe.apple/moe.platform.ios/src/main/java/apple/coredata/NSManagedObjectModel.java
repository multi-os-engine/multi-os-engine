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
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * Models describe object graphs to be managed. Models (and their entities/properties/fetch request templates) are
 * editable until they are used by a persistent store coordinator, allowing developers to create/modify them
 * dynamically. However, once a model is being used, it MUST NOT be changed. When the persistent store coordinator first
 * fetches data using a model, it will become uneditable. Any attempt to mutate a model or any of its subobjects after
 * that point will cause an exception to be thrown. If you need to modify a model that is in use, create a copy, modify
 * the copy, and then discard the objects with the old model.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSManagedObjectModel extends NSObject implements NSCoding, NSCopying, NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSManagedObjectModel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSManagedObjectModel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSManagedObjectModel allocWithZone(VoidPtr zone);

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

    /**
     * looks up all models in the specified bundles and merges them; if nil is specified as argument, uses the main
     * bundle
     */
    @Nullable
    @Generated
    @Selector("mergedModelFromBundles:")
    public static native NSManagedObjectModel mergedModelFromBundles(@Nullable NSArray<? extends NSBundle> bundles);

    /**
     * Returns the managed object model used to create the store for the specified metadata. This method is a companion
     * to the mergedModelFromBundles: method; in this case, the framework uses the version information stored in the
     * metadata for a store to locate the models/entities used to create the store in the available bundles, and return
     * the model. If the model for the store cannot be found, this method will return nil.
     * 
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("mergedModelFromBundles:forStoreMetadata:")
    public static native NSManagedObjectModel mergedModelFromBundlesForStoreMetadata(
            @Nullable NSArray<? extends NSBundle> bundles, @NotNull NSDictionary<String, ?> metadata);

    /**
     * combines multiple models (typically from different frameworks) into one
     */
    @Nullable
    @Generated
    @Selector("modelByMergingModels:")
    public static native NSManagedObjectModel modelByMergingModels(
            @Nullable NSArray<? extends NSManagedObjectModel> models);

    /**
     * Returns a merged model from the specified array for the version information in the provided metadata. (This is
     * the companion method to mergedModelFromBundles:forStoreMetadata:) If a model cannot be created to match the
     * version information in the specified metadata, this method will return nil.
     * 
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("modelByMergingModels:forStoreMetadata:")
    public static native NSManagedObjectModel modelByMergingModelsForStoreMetadata(
            @NotNull NSArray<? extends NSManagedObjectModel> models, @NotNull NSDictionary<String, ?> metadata);

    @Generated
    @Owned
    @Selector("new")
    public static native NSManagedObjectModel new_objc();

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
     * returns all available configuration names
     */
    @NotNull
    @Generated
    @Selector("configurations")
    public native NSArray<String> configurations();

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

    @NotNull
    @Generated
    @Selector("entities")
    public native NSArray<? extends NSEntityDescription> entities();

    @NotNull
    @Generated
    @Selector("entitiesByName")
    public native NSDictionary<String, ? extends NSEntityDescription> entitiesByName();

    @Nullable
    @Generated
    @Selector("entitiesForConfiguration:")
    public native NSArray<? extends NSEntityDescription> entitiesForConfiguration(@Nullable String configuration);

    /**
     * Returns a dictionary of the version hashes for the entities in the model, keyed by entity name. (The dictionary
     * of version hash information is used by Core Data to determine schema compatibility.)
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("entityVersionHashesByName")
    public native NSDictionary<String, ? extends NSData> entityVersionHashesByName();

    /**
     * returns a copy of the fetch request template with the variable bindings substituted - this is the usual way to
     * bind an "abstractly" defined fetch request template to a concrete fetch
     */
    @Nullable
    @Generated
    @Selector("fetchRequestFromTemplateWithName:substitutionVariables:")
    public native NSFetchRequest<?> fetchRequestFromTemplateWithNameSubstitutionVariables(@NotNull String name,
            @NotNull NSDictionary<String, ?> variables);

    @Nullable
    @Generated
    @Selector("fetchRequestTemplateForName:")
    public native NSFetchRequest<?> fetchRequestTemplateForName(@NotNull String name);

    /**
     * Returns the dictionary of fetch request templates, keyed by name, for the model. If the template contains a
     * predicate with substitution variables, you should instead use
     * fetchRequestFromTemplateWithName:substitutionVariables: to create a new fetch request.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("fetchRequestTemplatesByName")
    public native NSDictionary<String, ? extends NSFetchRequest<?>> fetchRequestTemplatesByName();

    @Generated
    @Selector("init")
    public native NSManagedObjectModel init();

    @Generated
    @Selector("initWithCoder:")
    public native NSManagedObjectModel initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSManagedObjectModel initWithContentsOfURL(@NotNull NSURL url);

    /**
     * Compares the version information in the store metadata with the entity version of a given configuration. Returns
     * NO if there are differences between the version information. (For information on specific differences, developers
     * should utilize the entityVersionHashesByName method, and perform a comparison.)
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isConfiguration:compatibleWithStoreMetadata:")
    public native boolean isConfigurationCompatibleWithStoreMetadata(@Nullable String configuration,
            @NotNull NSDictionary<String, ?> metadata);

    /**
     * NSDictionary containing localized string values for entities, properties, and error strings related to this
     * model. The key and value pattern follows:
     * key = "Entity/NonLocalizedEntityName"
     * value = "LocalizedEntityName"
     * 
     * // for properties of the same non-localized name in differenct entities, which should have different localized
     * names
     * key = "Property/NonLocalizedPropertyName/Entity/EntityName"
     * value = "LocalizedPropertyName"
     * 
     * key = "Property/NonLocalizedPropertyName"
     * value = "LocalizedPropertyName"
     * 
     * key = "ErrorString/NonLocalizedErrorString"
     * value = "LocalizedErrorString"
     */
    @Nullable
    @Generated
    @Selector("localizationDictionary")
    public native NSDictionary<String, String> localizationDictionary();

    @Generated
    @Selector("setEntities:")
    public native void setEntities(@NotNull NSArray<? extends NSEntityDescription> value);

    @Generated
    @Selector("setEntities:forConfiguration:")
    public native void setEntitiesForConfiguration(@NotNull NSArray<? extends NSEntityDescription> entities,
            @NotNull String configuration);

    /**
     * fetch request templates allow to pre-define queries and their parameters in the model (with the tool) - typically
     * they contain variables that need to be substituted at runtime.
     */
    @Generated
    @Selector("setFetchRequestTemplate:forName:")
    public native void setFetchRequestTemplateForName(@Nullable NSFetchRequest<?> fetchRequestTemplate,
            @NotNull String name);

    /**
     * NSDictionary containing localized string values for entities, properties, and error strings related to this
     * model. The key and value pattern follows:
     * key = "Entity/NonLocalizedEntityName"
     * value = "LocalizedEntityName"
     * 
     * // for properties of the same non-localized name in differenct entities, which should have different localized
     * names
     * key = "Property/NonLocalizedPropertyName/Entity/EntityName"
     * value = "LocalizedPropertyName"
     * 
     * key = "Property/NonLocalizedPropertyName"
     * value = "LocalizedPropertyName"
     * 
     * key = "ErrorString/NonLocalizedErrorString"
     * value = "LocalizedErrorString"
     */
    @Generated
    @Selector("setLocalizationDictionary:")
    public native void setLocalizationDictionary(@Nullable NSDictionary<String, String> value);

    /**
     * Returns the collection of developer-defined version identifiers for the model. For models created in Xcode, this
     * value is set by the developer in the model inspector. Merged models return the combined collection of
     * identifiers. This value is meant to be used as a debugging hint to help developers determine the models that were
     * combined to create a merged model. The framework does not give models a default identifier, nor does it depend
     * this value at runtime.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setVersionIdentifiers:")
    public native void setVersionIdentifiers(@NotNull NSSet<?> value);

    /**
     * Returns the collection of developer-defined version identifiers for the model. For models created in Xcode, this
     * value is set by the developer in the model inspector. Merged models return the combined collection of
     * identifiers. This value is meant to be used as a debugging hint to help developers determine the models that were
     * combined to create a merged model. The framework does not give models a default identifier, nor does it depend
     * this value at runtime.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("versionIdentifiers")
    public native NSSet<?> versionIdentifiers();
}
