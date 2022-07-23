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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
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
 * Properties describe values within a managed object. There are different types of properties, each of them represented
 * by a subclass which encapsulates the specific property behavior.
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPropertyDescription extends NSObject implements NSCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPropertyDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPropertyDescription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPropertyDescription allocWithZone(VoidPtr zone);

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
    public static native NSPropertyDescription new_objc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("entity")
    public native NSEntityDescription entity();

    @Generated
    @Selector("init")
    public native NSPropertyDescription init();

    @Generated
    @Selector("initWithCoder:")
    public native NSPropertyDescription initWithCoder(NSCoder coder);

    /**
     * Returns a boolean value indicating if the property is important for searching. NSPersistentStores can optionally
     * utilize this information upon store creation for operations like defining indexes.
     */
    @Generated
    @Selector("isIndexed")
    public native boolean isIndexed();

    /**
     * Returns a boolean value indicating if the property is important for searching. NSPersistentStores can optionally
     * utilize this information upon store creation for operations like defining indexes.
     */
    @Generated
    @Selector("setIndexed:")
    public native void setIndexed(boolean value);

    /**
     * Returns a boolean value indicating if the property should be indexed by Spotlight.
     */
    @Generated
    @Selector("isIndexedBySpotlight")
    public native boolean isIndexedBySpotlight();

    /**
     * Returns a boolean value indicating if the property should be indexed by Spotlight.
     */
    @Generated
    @Selector("setIndexedBySpotlight:")
    public native void setIndexedBySpotlight(boolean value);

    /**
     * The optional flag specifies whether a property's value can be nil or not (before an object can be persisted).
     */
    @Generated
    @Selector("isOptional")
    public native boolean isOptional();

    /**
     * The optional flag specifies whether a property's value can be nil or not (before an object can be persisted).
     */
    @Generated
    @Selector("setOptional:")
    public native void setOptional(boolean value);

    /**
     * Returns a boolean value indicating if the property data should be written out to the external record file.
     */
    @Generated
    @Selector("isStoredInExternalRecord")
    public native boolean isStoredInExternalRecord();

    /**
     * Returns a boolean value indicating if the property data should be written out to the external record file.
     */
    @Generated
    @Selector("setStoredInExternalRecord:")
    public native void setStoredInExternalRecord(boolean value);

    /**
     * The transient flag specifies whether a property's value is persisted or ignored when an object is persisted -
     * transient properties are still managed for undo/redo, validation, etc.
     */
    @Generated
    @Selector("isTransient")
    public native boolean isTransient();

    /**
     * The transient flag specifies whether a property's value is persisted or ignored when an object is persisted -
     * transient properties are still managed for undo/redo, validation, etc.
     */
    @Generated
    @Selector("setTransient:")
    public native void setTransient(boolean value);

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("renamingIdentifier")
    public native String renamingIdentifier();

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setRenamingIdentifier:")
    public native void setRenamingIdentifier(String value);

    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    @Generated
    @Selector("setValidationPredicates:withValidationWarnings:")
    public native void setValidationPredicatesWithValidationWarnings(
            NSArray<? extends NSPredicate> validationPredicates, NSArray<String> validationWarnings);

    /**
     * Returns/sets the version hash modifier for the property. This value is included in the version hash for the
     * property, allowing developers to mark/denote a property as being a different "version" than another, even if all
     * of the values which affects persistence are equal. (Such a difference is important in cases where the design of a
     * property is unchanged, but the format or content of data has changed.)
     */
    @Generated
    @Selector("setVersionHashModifier:")
    public native void setVersionHashModifier(String value);

    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * Instead of individual methods to set/get parameters like length, min and max values, formats, etc., there is a
     * list of predicates evaluated against the managed objects and corresponding error messages (which can be
     * localized).
     */
    @Generated
    @Selector("validationPredicates")
    public native NSArray<? extends NSPredicate> validationPredicates();

    @Generated
    @Selector("validationWarnings")
    public native NSArray<?> validationWarnings();

    /**
     * Returns the version hash for the property. The version hash is used to uniquely identify a property based on its
     * configuration. The version hash uses only values which affect the persistence of data and the user-defined
     * versionHashModifier value. (The values which affect persistence are the name of the property, the flags for
     * isOptional, isTransient, and isReadOnly). This value is stored as part of the version information in the metadata
     * for stores, as well as a definition of a property involved in an NSPropertyMapping.
     */
    @Generated
    @Selector("versionHash")
    public native NSData versionHash();

    /**
     * Returns/sets the version hash modifier for the property. This value is included in the version hash for the
     * property, allowing developers to mark/denote a property as being a different "version" than another, even if all
     * of the values which affects persistence are equal. (Such a difference is important in cases where the design of a
     * property is unchanged, but the format or content of data has changed.)
     */
    @Generated
    @Selector("versionHashModifier")
    public native String versionHashModifier();
}
