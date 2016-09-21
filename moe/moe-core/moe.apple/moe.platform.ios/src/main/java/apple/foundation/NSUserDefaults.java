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
public class NSUserDefaults extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUserDefaults(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUserDefaults alloc();

    @Generated
    @Selector("resetStandardUserDefaults")
    public static native void resetStandardUserDefaults();

    @Generated
    @Selector("standardUserDefaults")
    public static native NSUserDefaults standardUserDefaults();

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

    @Generated
    @Selector("URLForKey:")
    public native NSURL URLForKey(String defaultName);

    @Generated
    @Selector("addSuiteNamed:")
    public native void addSuiteNamed(String suiteName);

    @Generated
    @Selector("arrayForKey:")
    public native NSArray<?> arrayForKey(String defaultName);

    @Generated
    @Selector("boolForKey:")
    public native boolean boolForKey(String defaultName);

    @Generated
    @Selector("dataForKey:")
    public native NSData dataForKey(String defaultName);

    @Generated
    @Selector("dictionaryForKey:")
    public native NSDictionary<String, ?> dictionaryForKey(String defaultName);

    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<String, ?> dictionaryRepresentation();

    @Generated
    @Selector("doubleForKey:")
    public native double doubleForKey(String defaultName);

    @Generated
    @Selector("floatForKey:")
    public native float floatForKey(String defaultName);

    @Generated
    @Selector("init")
    public native NSUserDefaults init();

    @Generated
    @Selector("initWithSuiteName:")
    public native NSUserDefaults initWithSuiteName(String suitename);

    @Generated
    @Deprecated
    @Selector("initWithUser:")
    public native NSUserDefaults initWithUser(String username);

    @Generated
    @Selector("integerForKey:")
    @NInt
    public native long integerForKey(String defaultName);

    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(String defaultName);

    @Generated
    @Selector("objectIsForcedForKey:")
    public native boolean objectIsForcedForKey(String key);

    @Generated
    @Selector("objectIsForcedForKey:inDomain:")
    public native boolean objectIsForcedForKeyInDomain(String key, String domain);

    @Generated
    @Selector("persistentDomainForName:")
    public native NSDictionary<String, ?> persistentDomainForName(String domainName);

    @Generated
    @Deprecated
    @Selector("persistentDomainNames")
    public native NSArray<?> persistentDomainNames();

    @Generated
    @Selector("registerDefaults:")
    public native void registerDefaults(NSDictionary<String, ?> registrationDictionary);

    @Generated
    @Selector("removeObjectForKey:")
    public native void removeObjectForKey(String defaultName);

    @Generated
    @Selector("removePersistentDomainForName:")
    public native void removePersistentDomainForName(String domainName);

    @Generated
    @Selector("removeSuiteNamed:")
    public native void removeSuiteNamed(String suiteName);

    @Generated
    @Selector("removeVolatileDomainForName:")
    public native void removeVolatileDomainForName(String domainName);

    @Generated
    @Selector("setBool:forKey:")
    public native void setBoolForKey(boolean value, String defaultName);

    @Generated
    @Selector("setDouble:forKey:")
    public native void setDoubleForKey(double value, String defaultName);

    @Generated
    @Selector("setFloat:forKey:")
    public native void setFloatForKey(float value, String defaultName);

    @Generated
    @Selector("setInteger:forKey:")
    public native void setIntegerForKey(@NInt long value, String defaultName);

    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Mapped(ObjCObjectMapper.class) Object value, String defaultName);

    @Generated
    @Selector("setPersistentDomain:forName:")
    public native void setPersistentDomainForName(NSDictionary<String, ?> domain, String domainName);

    @Generated
    @Selector("setURL:forKey:")
    public native void setURLForKey(NSURL url, String defaultName);

    @Generated
    @Selector("setVolatileDomain:forName:")
    public native void setVolatileDomainForName(NSDictionary<String, ?> domain, String domainName);

    @Generated
    @Selector("stringArrayForKey:")
    public native NSArray<String> stringArrayForKey(String defaultName);

    @Generated
    @Selector("stringForKey:")
    public native String stringForKey(String defaultName);

    @Generated
    @Selector("synchronize")
    public native boolean synchronize();

    @Generated
    @Selector("volatileDomainForName:")
    public native NSDictionary<String, ?> volatileDomainForName(String domainName);

    @Generated
    @Selector("volatileDomainNames")
    public native NSArray<String> volatileDomainNames();
}
