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
 * Provides the basic unit of external data that the Core Data stack interacts with.
 * 
 * API-Since: 5.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSIncrementalStoreNode extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSIncrementalStoreNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSIncrementalStoreNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSIncrementalStoreNode allocWithZone(VoidPtr zone);

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
    public static native NSIncrementalStoreNode new_objc();

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
    @Selector("init")
    public native NSIncrementalStoreNode init();

    /**
     * Returns an object initialized with the following values
     * objectID -> The NSManagedObjectID corresponding to the object whose values are cached
     * 
     * values -> A dictionary containing the values persisted in an external store with keys corresponding to the names
     * of the NSPropertyDescriptions
     * in the NSEntityDescription described by the NSManagedObjectID. Unknown or unmodeled keys will be stripped out.
     * 
     * For attributes: an immutable value (NSNumber, NSString, NSData etc). Missing attribute keys will assume a nil
     * value.
     * 
     * For to-one relationships: the NSManagedObjectID of the related object or NSNull for nil relationship values. A
     * missing key will be resolved lazily through calling
     * -newValueForRelationship:forObjectWithID:withContext:error: on the NSPersistentStore. Lazy resolution for to-ones
     * is discouraged.
     * 
     * For to-many relationships: an NSArray or NSSet containing the NSManagedObjectIDs of the related objects. Empty
     * to-many relationships must
     * be represented by an empty non-nil collection. A missing key will be resolved lazily through calling. Lazy
     * resolution for to-manys is encouraged.
     * -newValueForRelationship:forObjectWithID:withContext:error: on the NSPersistentStore
     * 
     * version -> The revision number of this state; used for conflict detection and merging
     */
    @Generated
    @Selector("initWithObjectID:withValues:version:")
    public native NSIncrementalStoreNode initWithObjectIDWithValuesVersion(NSManagedObjectID objectID,
            NSDictionary<String, ?> values, long version);

    /**
     * Return the object ID that identifies the data stored by this node
     */
    @Generated
    @Selector("objectID")
    public native NSManagedObjectID objectID();

    /**
     * Update the values and version to reflect new data being saved to or loaded from the external store.
     * The values dictionary is in the same format as the initializer
     */
    @Generated
    @Selector("updateWithValues:version:")
    public native void updateWithValuesVersion(NSDictionary<String, ?> values, long version);

    /**
     * May return NSNull for to-one relationships. If a relationship is nil, clients should invoke
     * -newValueForRelationship:forObjectWithID:withContext:error: on the NSPersistentStore
     */
    @Generated
    @Selector("valueForPropertyDescription:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForPropertyDescription(NSPropertyDescription prop);

    /**
     * Return the version of data in this node.
     */
    @Generated
    @Selector("version")
    public native long version();
}
