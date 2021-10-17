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
import apple.foundation.NSPredicate;
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

/**
 * Used to request that Core Data do a batch update of data in a persistent store without
 * loading any data into memory. May not be supported by all store types.
 * WARNING:
 * It is up to the developer creating the request to ensure that changes made by the request to
 * the underlying store do not violate any validation rules specified in the model.
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBatchUpdateRequest extends NSPersistentStoreRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected NSBatchUpdateRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSBatchUpdateRequest alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSBatchUpdateRequest allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("batchUpdateRequestWithEntityName:")
    public static native NSBatchUpdateRequest batchUpdateRequestWithEntityName(String entityName);

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
    public static native NSBatchUpdateRequest new_objc();

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
    @Selector("entity")
    public native NSEntityDescription entity();

    @Generated
    @Selector("entityName")
    public native String entityName();

    /**
     * Should the update include subentities? Defaults to YES.
     */
    @Generated
    @Selector("includesSubentities")
    public native boolean includesSubentities();

    @Generated
    @Selector("init")
    public native NSBatchUpdateRequest init();

    @Generated
    @Selector("initWithEntity:")
    public native NSBatchUpdateRequest initWithEntity(NSEntityDescription entity);

    @Generated
    @Selector("initWithEntityName:")
    public native NSBatchUpdateRequest initWithEntityName(String entityName);

    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * Dictionary of NSPropertyDescription|property name string -> constantValue/NSExpression pairs describing the desired updates.
     * The expressions can be any NSExpression that evaluates to a scalar value.
     */
    @Generated
    @Selector("propertiesToUpdate")
    public native NSDictionary<?, ?> propertiesToUpdate();

    /**
     * The type of result that should be returned from this request. Defaults to NSStatusOnlyResultType
     */
    @Generated
    @Selector("resultType")
    @NUInt
    public native long resultType();

    /**
     * Should the update include subentities? Defaults to YES.
     */
    @Generated
    @Selector("setIncludesSubentities:")
    public native void setIncludesSubentities(boolean value);

    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(NSPredicate value);

    /**
     * Dictionary of NSPropertyDescription|property name string -> constantValue/NSExpression pairs describing the desired updates.
     * The expressions can be any NSExpression that evaluates to a scalar value.
     */
    @Generated
    @Selector("setPropertiesToUpdate:")
    public native void setPropertiesToUpdate(NSDictionary<?, ?> value);

    /**
     * The type of result that should be returned from this request. Defaults to NSStatusOnlyResultType
     */
    @Generated
    @Selector("setResultType:")
    public native void setResultType(@NUInt long value);
}
