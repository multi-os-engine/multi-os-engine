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
    @Owned
    @Selector("alloc")
    public static native NSEntityMapping alloc();

    /**
     * attributeMappings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/attributeMappings">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributeMappings")
    public native NSArray<? extends NSPropertyMapping> attributeMappings();

    /**
     * destinationEntityName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/destinationEntityName">iOS Dev Center</a>
     */
    @Generated
    @Selector("destinationEntityName")
    public native String destinationEntityName();

    /**
     * destinationEntityVersionHash</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/destinationEntityVersionHash">iOS Dev Center</a>
     */
    @Generated
    @Selector("destinationEntityVersionHash")
    public native NSData destinationEntityVersionHash();

    /**
     * entityMigrationPolicyClassName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/entityMigrationPolicyClassName">iOS Dev Center</a>
     */
    @Generated
    @Selector("entityMigrationPolicyClassName")
    public native String entityMigrationPolicyClassName();

    @Generated
    @Selector("init")
    public native NSEntityMapping init();

    /**
     * mappingType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/mappingType">iOS Dev Center</a>
     */
    @Generated
    @Selector("mappingType")
    @NUInt
    public native long mappingType();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * relationshipMappings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/relationshipMappings">iOS Dev Center</a>
     */
    @Generated
    @Selector("relationshipMappings")
    public native NSArray<? extends NSPropertyMapping> relationshipMappings();

    /**
     * attributeMappings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/attributeMappings">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttributeMappings:")
    public native void setAttributeMappings(NSArray<? extends NSPropertyMapping> value);

    /**
     * destinationEntityName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/destinationEntityName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDestinationEntityName:")
    public native void setDestinationEntityName(String value);

    /**
     * destinationEntityVersionHash</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/destinationEntityVersionHash">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDestinationEntityVersionHash:")
    public native void setDestinationEntityVersionHash(NSData value);

    /**
     * entityMigrationPolicyClassName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/entityMigrationPolicyClassName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEntityMigrationPolicyClassName:")
    public native void setEntityMigrationPolicyClassName(String value);

    /**
     * mappingType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/mappingType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMappingType:")
    public native void setMappingType(@NUInt long value);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * relationshipMappings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/relationshipMappings">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRelationshipMappings:")
    public native void setRelationshipMappings(NSArray<? extends NSPropertyMapping> value);

    /**
     * sourceEntityName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/sourceEntityName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSourceEntityName:")
    public native void setSourceEntityName(String value);

    /**
     * sourceEntityVersionHash</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/sourceEntityVersionHash">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSourceEntityVersionHash:")
    public native void setSourceEntityVersionHash(NSData value);

    /**
     * sourceExpression</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/sourceExpression">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSourceExpression:")
    public native void setSourceExpression(NSExpression value);

    /**
     * userInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/userInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    /**
     * sourceEntityName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/sourceEntityName">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourceEntityName")
    public native String sourceEntityName();

    /**
     * sourceEntityVersionHash</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/sourceEntityVersionHash">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourceEntityVersionHash")
    public native NSData sourceEntityVersionHash();

    /**
     * sourceExpression</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/sourceExpression">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourceExpression")
    public native NSExpression sourceExpression();

    /**
     * userInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSEntityMapping_class/index.html#//apple_ref/occ/instp/NSEntityMapping/userInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

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
}
