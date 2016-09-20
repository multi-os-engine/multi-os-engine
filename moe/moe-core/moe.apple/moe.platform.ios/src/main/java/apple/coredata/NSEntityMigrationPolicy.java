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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
public class NSEntityMigrationPolicy extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSEntityMigrationPolicy(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSEntityMigrationPolicy alloc();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * beginEntityMapping:manager:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMigrationPolicy_class/index.html#//apple_ref/occ/instm/NSEntityMigrationPolicy/beginEntityMapping:manager:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginEntityMapping:manager:error:")
    public native boolean beginEntityMappingManagerError(NSEntityMapping mapping, NSMigrationManager manager,
            Ptr<NSError> error);

    /**
     * createDestinationInstancesForSourceInstance:entityMapping:manager:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMigrationPolicy_class/index.html#//apple_ref/occ/instm/NSEntityMigrationPolicy/createDestinationInstancesForSourceInstance:entityMapping:manager:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("createDestinationInstancesForSourceInstance:entityMapping:manager:error:")
    public native boolean createDestinationInstancesForSourceInstanceEntityMappingManagerError(
            NSManagedObject sInstance, NSEntityMapping mapping, NSMigrationManager manager, Ptr<NSError> error);

    /**
     * createRelationshipsForDestinationInstance:entityMapping:manager:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMigrationPolicy_class/index.html#//apple_ref/occ/instm/NSEntityMigrationPolicy/createRelationshipsForDestinationInstance:entityMapping:manager:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("createRelationshipsForDestinationInstance:entityMapping:manager:error:")
    public native boolean createRelationshipsForDestinationInstanceEntityMappingManagerError(NSManagedObject dInstance,
            NSEntityMapping mapping, NSMigrationManager manager, Ptr<NSError> error);

    /**
     * endEntityMapping:manager:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMigrationPolicy_class/index.html#//apple_ref/occ/instm/NSEntityMigrationPolicy/endEntityMapping:manager:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("endEntityMapping:manager:error:")
    public native boolean endEntityMappingManagerError(NSEntityMapping mapping, NSMigrationManager manager,
            Ptr<NSError> error);

    /**
     * endInstanceCreationForEntityMapping:manager:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMigrationPolicy_class/index.html#//apple_ref/occ/instm/NSEntityMigrationPolicy/endInstanceCreationForEntityMapping:manager:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("endInstanceCreationForEntityMapping:manager:error:")
    public native boolean endInstanceCreationForEntityMappingManagerError(NSEntityMapping mapping,
            NSMigrationManager manager, Ptr<NSError> error);

    /**
     * endRelationshipCreationForEntityMapping:manager:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMigrationPolicy_class/index.html#//apple_ref/occ/instm/NSEntityMigrationPolicy/endRelationshipCreationForEntityMapping:manager:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("endRelationshipCreationForEntityMapping:manager:error:")
    public native boolean endRelationshipCreationForEntityMappingManagerError(NSEntityMapping mapping,
            NSMigrationManager manager, Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSEntityMigrationPolicy init();

    /**
     * performCustomValidationForEntityMapping:manager:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMigrationPolicy_class/index.html#//apple_ref/occ/instm/NSEntityMigrationPolicy/performCustomValidationForEntityMapping:manager:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performCustomValidationForEntityMapping:manager:error:")
    public native boolean performCustomValidationForEntityMappingManagerError(NSEntityMapping mapping,
            NSMigrationManager manager, Ptr<NSError> error);
}
