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
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMigrationManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMigrationManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMigrationManager alloc();

    /**
     * associateSourceInstance:withDestinationInstance:forEntityMapping:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/associateSourceInstance:withDestinationInstance:forEntityMapping:">iOS Dev Center</a>
     */
    @Generated
    @Selector("associateSourceInstance:withDestinationInstance:forEntityMapping:")
    public native void associateSourceInstanceWithDestinationInstanceForEntityMapping(NSManagedObject sourceInstance,
            NSManagedObject destinationInstance, NSEntityMapping entityMapping);

    /**
     * cancelMigrationWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/cancelMigrationWithError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelMigrationWithError:")
    public native void cancelMigrationWithError(NSError error);

    /**
     * currentEntityMapping</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/currentEntityMapping">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentEntityMapping")
    public native NSEntityMapping currentEntityMapping();

    /**
     * destinationContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/destinationContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("destinationContext")
    public native NSManagedObjectContext destinationContext();

    /**
     * destinationEntityForEntityMapping:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/destinationEntityForEntityMapping:">iOS Dev Center</a>
     */
    @Generated
    @Selector("destinationEntityForEntityMapping:")
    public native NSEntityDescription destinationEntityForEntityMapping(NSEntityMapping mEntity);

    /**
     * destinationInstancesForEntityMappingNamed:sourceInstances:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/destinationInstancesForEntityMappingNamed:sourceInstances:">iOS Dev Center</a>
     */
    @Generated
    @Selector("destinationInstancesForEntityMappingNamed:sourceInstances:")
    public native NSArray<? extends NSManagedObject> destinationInstancesForEntityMappingNamedSourceInstances(
            String mappingName, NSArray<? extends NSManagedObject> sourceInstances);

    /**
     * destinationModel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/destinationModel">iOS Dev Center</a>
     */
    @Generated
    @Selector("destinationModel")
    public native NSManagedObjectModel destinationModel();

    @Generated
    @Selector("init")
    public native NSMigrationManager init();

    /**
     * initWithSourceModel:destinationModel:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/initWithSourceModel:destinationModel:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSourceModel:destinationModel:")
    public native NSMigrationManager initWithSourceModelDestinationModel(NSManagedObjectModel sourceModel,
            NSManagedObjectModel destinationModel);

    /**
     * mappingModel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/mappingModel">iOS Dev Center</a>
     */
    @Generated
    @Selector("mappingModel")
    public native NSMappingModel mappingModel();

    /**
     * migrateStoreFromURL:type:options:withMappingModel:toDestinationURL:destinationType:destinationOptions:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/migrateStoreFromURL:type:options:withMappingModel:toDestinationURL:destinationType:destinationOptions:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("migrateStoreFromURL:type:options:withMappingModel:toDestinationURL:destinationType:destinationOptions:error:")
    public native boolean migrateStoreFromURLTypeOptionsWithMappingModelToDestinationURLDestinationTypeDestinationOptionsError(
            NSURL sourceURL, String sStoreType, NSDictionary<?, ?> sOptions, NSMappingModel mappings, NSURL dURL,
            String dStoreType, NSDictionary<?, ?> dOptions, Ptr<NSError> error);

    /**
     * migrationProgress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/migrationProgress">iOS Dev Center</a>
     */
    @Generated
    @Selector("migrationProgress")
    public native float migrationProgress();

    /**
     * reset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/reset">iOS Dev Center</a>
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * userInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/userInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    /**
     * usesStoreSpecificMigrationManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/usesStoreSpecificMigrationManager">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesStoreSpecificMigrationManager:")
    public native void setUsesStoreSpecificMigrationManager(boolean value);

    /**
     * sourceContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/sourceContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourceContext")
    public native NSManagedObjectContext sourceContext();

    /**
     * sourceEntityForEntityMapping:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/sourceEntityForEntityMapping:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourceEntityForEntityMapping:")
    public native NSEntityDescription sourceEntityForEntityMapping(NSEntityMapping mEntity);

    /**
     * sourceInstancesForEntityMappingNamed:destinationInstances:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instm/NSMigrationManager/sourceInstancesForEntityMappingNamed:destinationInstances:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourceInstancesForEntityMappingNamed:destinationInstances:")
    public native NSArray<? extends NSManagedObject> sourceInstancesForEntityMappingNamedDestinationInstances(
            String mappingName, NSArray<? extends NSManagedObject> destinationInstances);

    /**
     * sourceModel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/sourceModel">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourceModel")
    public native NSManagedObjectModel sourceModel();

    /**
     * userInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/userInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * usesStoreSpecificMigrationManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMigrationManager_class/index.html#//apple_ref/occ/instp/NSMigrationManager/usesStoreSpecificMigrationManager">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesStoreSpecificMigrationManager")
    public native boolean usesStoreSpecificMigrationManager();

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
    public static native long version();
}
