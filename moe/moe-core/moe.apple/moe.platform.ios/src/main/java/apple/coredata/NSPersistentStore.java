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
public class NSPersistentStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentStore(Pointer peer) {
        super(peer);
    }

    /**
     * URL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/URL">iOS Dev Center</a>
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentStore alloc();

    /**
     * configurationName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/configurationName">iOS Dev Center</a>
     */
    @Generated
    @Selector("configurationName")
    public native String configurationName();

    /**
     * didAddToPersistentStoreCoordinator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instm/NSPersistentStore/didAddToPersistentStoreCoordinator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("didAddToPersistentStoreCoordinator:")
    public native void didAddToPersistentStoreCoordinator(NSPersistentStoreCoordinator coordinator);

    /**
     * identifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/identifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native NSPersistentStore init();

    /**
     * initWithPersistentStoreCoordinator:configurationName:URL:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instm/NSPersistentStore/initWithPersistentStoreCoordinator:configurationName:URL:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithPersistentStoreCoordinator:configurationName:URL:options:")
    public native NSPersistentStore initWithPersistentStoreCoordinatorConfigurationNameURLOptions(
            NSPersistentStoreCoordinator root, String name, NSURL url, NSDictionary<?, ?> options);

    /**
     * readOnly</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/readOnly">iOS Dev Center</a>
     */
    @Generated
    @Selector("isReadOnly")
    public native boolean isReadOnly();

    /**
     * loadMetadata:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instm/NSPersistentStore/loadMetadata:">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadMetadata:")
    public native boolean loadMetadata(Ptr<NSError> error);

    /**
     * metadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/metadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    /**
     * metadataForPersistentStoreWithURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/clm/NSPersistentStore/metadataForPersistentStoreWithURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataForPersistentStoreWithURL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreWithURLError(NSURL url, Ptr<NSError> error);

    /**
     * migrationManagerClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/clm/NSPersistentStore/migrationManagerClass">iOS Dev Center</a>
     */
    @Generated
    @Selector("migrationManagerClass")
    public static native Class migrationManagerClass();

    /**
     * options</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/options">iOS Dev Center</a>
     */
    @Generated
    @Selector("options")
    public native NSDictionary<?, ?> options();

    /**
     * persistentStoreCoordinator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/persistentStoreCoordinator">iOS Dev Center</a>
     */
    @Generated
    @Selector("persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator persistentStoreCoordinator();

    /**
     * identifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/identifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    /**
     * metadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/metadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSDictionary<String, ?> value);

    /**
     * setMetadata:forPersistentStoreWithURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/clm/NSPersistentStore/setMetadata:forPersistentStoreWithURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMetadata:forPersistentStoreWithURL:error:")
    public static native boolean setMetadataForPersistentStoreWithURLError(NSDictionary<String, ?> metadata, NSURL url,
            Ptr<NSError> error);

    /**
     * readOnly</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/readOnly">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReadOnly:")
    public native void setReadOnly(boolean value);

    /**
     * URL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/URL">iOS Dev Center</a>
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    /**
     * type</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instp/NSPersistentStore/type">iOS Dev Center</a>
     */
    @Generated
    @Selector("type")
    public native String type();

    /**
     * willRemoveFromPersistentStoreCoordinator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSPersistentStore_Class/index.html#//apple_ref/occ/instm/NSPersistentStore/willRemoveFromPersistentStoreCoordinator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("willRemoveFromPersistentStoreCoordinator:")
    public native void willRemoveFromPersistentStoreCoordinator(NSPersistentStoreCoordinator coordinator);

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
}
