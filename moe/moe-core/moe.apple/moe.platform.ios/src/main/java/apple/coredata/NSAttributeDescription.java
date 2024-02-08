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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Attributes represent individual values like strings, numbers, dates, etc.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAttributeDescription extends NSPropertyDescription {
    static {
        NatJ.register();
    }

    @Generated
    protected NSAttributeDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSAttributeDescription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSAttributeDescription allocWithZone(VoidPtr zone);

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
    public static native NSAttributeDescription new_objc();

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
     * API-Since: 5.0
     */
    @Generated
    @Selector("allowsExternalBinaryDataStorage")
    public native boolean allowsExternalBinaryDataStorage();

    /**
     * NSUndefinedAttributeType is valid for transient properties - Core Data will still track the property as an id
     * value and register undo/redo actions, etc. NSUndefinedAttributeType is illegal for non-transient properties.
     */
    @Generated
    @Selector("attributeType")
    @NUInt
    public native long attributeType();

    @Nullable
    @Generated
    @Selector("attributeValueClassName")
    public native String attributeValueClassName();

    /**
     * value is retained and not copied
     */
    @Nullable
    @Generated
    @Selector("defaultValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object defaultValue();

    @Generated
    @Selector("init")
    public native NSAttributeDescription init();

    @Generated
    @Selector("initWithCoder:")
    public native NSAttributeDescription initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setAllowsExternalBinaryDataStorage:")
    public native void setAllowsExternalBinaryDataStorage(boolean value);

    /**
     * NSUndefinedAttributeType is valid for transient properties - Core Data will still track the property as an id
     * value and register undo/redo actions, etc. NSUndefinedAttributeType is illegal for non-transient properties.
     */
    @Generated
    @Selector("setAttributeType:")
    public native void setAttributeType(@NUInt long value);

    @Generated
    @Selector("setAttributeValueClassName:")
    public native void setAttributeValueClassName(@Nullable String value);

    /**
     * value is retained and not copied
     */
    @Generated
    @Selector("setDefaultValue:")
    public native void setDefaultValue(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * The name of the transformer used to convert a NSTransformedAttributeType. The transformer must output NSData from
     * transformValue and allow reverse transformation. If this value is not set, or set to nil, Core Data will default
     * to using a transformer which uses NSCoding to archive/unarchive the attribute value.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setValueTransformerName:")
    public native void setValueTransformerName(@Nullable String value);

    /**
     * The name of the transformer used to convert a NSTransformedAttributeType. The transformer must output NSData from
     * transformValue and allow reverse transformation. If this value is not set, or set to nil, Core Data will default
     * to using a transformer which uses NSCoding to archive/unarchive the attribute value.
     * 
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("valueTransformerName")
    public native String valueTransformerName();

    /**
     * Returns the version hash for the attribute. This value includes the versionHash information from the
     * NSPropertyDescription superclass, and the attribute type.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("versionHash")
    public native NSData versionHash();

    /**
     * Indicates if the value of the attribute should be captured on delete when Persistent History is enabled
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("preservesValueInHistoryOnDeletion")
    public native boolean preservesValueInHistoryOnDeletion();

    /**
     * Indicates if the value of the attribute should be captured on delete when Persistent History is enabled
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPreservesValueInHistoryOnDeletion:")
    public native void setPreservesValueInHistoryOnDeletion(boolean value);

    /**
     * This property can be set to enable encryption-at-rest on data stored in CloudKit servers.
     * 
     * There are several restrictions on how clients can use this property:
     * 1. Attributes to be encrypted must be new additions to the CloudKit schema. Attributes that already exist in the
     * production schema cannot be changed to support encryption.
     * 2. Attributes cannot (ever) change their encryption state in the CloudKit schema. Once something is encrypted (or
     * not) it will forever be so.
     * 
     * Note: This property does not affect the data in the persistent store. Local file encryption should continue to be
     * managed by using NSFileProtection and other standard platform security mechanisms.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowsCloudEncryption")
    public native boolean allowsCloudEncryption();

    /**
     * This property can be set to enable encryption-at-rest on data stored in CloudKit servers.
     * 
     * There are several restrictions on how clients can use this property:
     * 1. Attributes to be encrypted must be new additions to the CloudKit schema. Attributes that already exist in the
     * production schema cannot be changed to support encryption.
     * 2. Attributes cannot (ever) change their encryption state in the CloudKit schema. Once something is encrypted (or
     * not) it will forever be so.
     * 
     * Note: This property does not affect the data in the persistent store. Local file encryption should continue to be
     * managed by using NSFileProtection and other standard platform security mechanisms.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowsCloudEncryption:")
    public native void setAllowsCloudEncryption(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
