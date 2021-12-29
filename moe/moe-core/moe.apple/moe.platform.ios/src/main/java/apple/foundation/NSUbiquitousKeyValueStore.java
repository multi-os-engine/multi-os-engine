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

package apple.foundation;

import apple.NSObject;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUbiquitousKeyValueStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUbiquitousKeyValueStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUbiquitousKeyValueStore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSUbiquitousKeyValueStore allocWithZone(VoidPtr zone);

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
    @Selector("defaultStore")
    public static native NSUbiquitousKeyValueStore defaultStore();

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
    public static native NSUbiquitousKeyValueStore new_objc();

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
    @Selector("arrayForKey:")
    public native NSArray<?> arrayForKey(String aKey);

    @Generated
    @Selector("boolForKey:")
    public native boolean boolForKey(String aKey);

    @Generated
    @Selector("dataForKey:")
    public native NSData dataForKey(String aKey);

    @Generated
    @Selector("dictionaryForKey:")
    public native NSDictionary<String, ?> dictionaryForKey(String aKey);

    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<String, ?> dictionaryRepresentation();

    @Generated
    @Selector("doubleForKey:")
    public native double doubleForKey(String aKey);

    @Generated
    @Selector("init")
    public native NSUbiquitousKeyValueStore init();

    @Generated
    @Selector("longLongForKey:")
    public native long longLongForKey(String aKey);

    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(String aKey);

    @Generated
    @Selector("removeObjectForKey:")
    public native void removeObjectForKey(String aKey);

    @Generated
    @Selector("setArray:forKey:")
    public native void setArrayForKey(NSArray<?> anArray, String aKey);

    @Generated
    @Selector("setBool:forKey:")
    public native void setBoolForKey(boolean value, String aKey);

    @Generated
    @Selector("setData:forKey:")
    public native void setDataForKey(NSData aData, String aKey);

    @Generated
    @Selector("setDictionary:forKey:")
    public native void setDictionaryForKey(NSDictionary<String, ?> aDictionary, String aKey);

    @Generated
    @Selector("setDouble:forKey:")
    public native void setDoubleForKey(double value, String aKey);

    @Generated
    @Selector("setLongLong:forKey:")
    public native void setLongLongForKey(long value, String aKey);

    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Mapped(ObjCObjectMapper.class) Object anObject, String aKey);

    @Generated
    @Selector("setString:forKey:")
    public native void setStringForKey(String aString, String aKey);

    @Generated
    @Selector("stringForKey:")
    public native String stringForKey(String aKey);

    @Generated
    @Selector("synchronize")
    public native boolean synchronize();
}
