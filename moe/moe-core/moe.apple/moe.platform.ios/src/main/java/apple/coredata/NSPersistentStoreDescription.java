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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An instance of NSPersistentStoreDescription encapsulates all information needed to describe a persistent store.
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersistentStoreDescription extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentStoreDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentStoreDescription alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSPersistentStoreDescription allocWithZone(VoidPtr zone);

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
    public static native NSPersistentStoreDescription new_objc();

    @Generated
    @Selector("persistentStoreDescriptionWithURL:")
    public static native NSPersistentStoreDescription persistentStoreDescriptionWithURL(NSURL URL);

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
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("configuration")
    public native String configuration();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native NSPersistentStoreDescription init();

    /**
     * Returns a store description instance with default values for the store located at `URL` that can be used immediately with `addPersistentStoreWithDescription:completionHandler:`.
     */
    @Generated
    @Selector("initWithURL:")
    public native NSPersistentStoreDescription initWithURL(NSURL url);

    /**
     * Store options
     */
    @Generated
    @Selector("isReadOnly")
    public native boolean isReadOnly();

    /**
     * Store options
     */
    @Generated
    @Selector("setReadOnly:")
    public native void setReadOnly(boolean value);

    @Generated
    @Selector("options")
    public native NSDictionary<String, ? extends NSObject> options();

    @Generated
    @Selector("setConfiguration:")
    public native void setConfiguration(String value);

    @Generated
    @Selector("setOption:forKey:")
    public native void setOptionForKey(NSObject option, String key);

    /**
     * addPersistentStore-time behaviours
     */
    @Generated
    @Selector("setShouldAddStoreAsynchronously:")
    public native void setShouldAddStoreAsynchronously(boolean value);

    @Generated
    @Selector("setShouldInferMappingModelAutomatically:")
    public native void setShouldInferMappingModelAutomatically(boolean value);

    @Generated
    @Selector("setShouldMigrateStoreAutomatically:")
    public native void setShouldMigrateStoreAutomatically(boolean value);

    @Generated
    @Selector("setTimeout:")
    public native void setTimeout(double value);

    @Generated
    @Selector("setType:")
    public native void setType(String value);

    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    @Generated
    @Selector("setValue:forPragmaNamed:")
    public native void setValueForPragmaNamed(NSObject value, String name);

    /**
     * addPersistentStore-time behaviours
     */
    @Generated
    @Selector("shouldAddStoreAsynchronously")
    public native boolean shouldAddStoreAsynchronously();

    @Generated
    @Selector("shouldInferMappingModelAutomatically")
    public native boolean shouldInferMappingModelAutomatically();

    @Generated
    @Selector("shouldMigrateStoreAutomatically")
    public native boolean shouldMigrateStoreAutomatically();

    @Generated
    @Selector("sqlitePragmas")
    public native NSDictionary<String, ? extends NSObject> sqlitePragmas();

    @Generated
    @Selector("timeout")
    public native double timeout();

    @Generated
    @Selector("type")
    public native String type();

    /**
     * Use this property to apply customized instances of NSPersistentCloudKitContainerOptions to
     * a store description you wish to use with CloudKit.
     */
    @Generated
    @Selector("cloudKitContainerOptions")
    public native NSPersistentCloudKitContainerOptions cloudKitContainerOptions();

    /**
     * Use this property to apply customized instances of NSPersistentCloudKitContainerOptions to
     * a store description you wish to use with CloudKit.
     */
    @Generated
    @Selector("setCloudKitContainerOptions:")
    public native void setCloudKitContainerOptions(NSPersistentCloudKitContainerOptions value);
}
