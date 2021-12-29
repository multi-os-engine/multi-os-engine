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

/**
 * NSUserDefaults is a hierarchical persistent interprocess (optionally distributed) key-value store, optimized for storing user settings.
 * <p>
 * Hierarchical: NSUserDefaults has a list of places to look for data called the "search list". A search list is referred to by an arbitrary string called the "suite identifier" or "domain identifier". When queried, NSUserDefaults checks each entry of its search list until it finds one that contains the key in question, or has searched the whole list. The list is (note: "current host + current user" preferences are unimplemented on iOS, watchOS, and tvOS, and "any user" preferences are not generally useful for applications on those operating systems):
 * - Managed ("forced") preferences, set by a configuration profile or via mcx from a network administrator
 * - Commandline arguments
 * - Preferences for the current domain, in the cloud
 * - Preferences for the current domain, the current user, in the current host
 * - Preferences for the current domain, the current user, in any host
 * - Preferences added via -addSuiteNamed:
 * - Preferences global to all apps for the current user, in the current host
 * - Preferences global to all apps for the current user, in any host
 * - Preferences for the current domain, for all users, in the current host
 * - Preferences global to all apps for all users, in the current host
 * - Preferences registered with -registerDefaults:
 * <p>
 * Persistent: Preferences stored in NSUserDefaults persist across reboots and relaunches of apps unless otherwise specified.
 * <p>
 * Interprocess: Preferences may be accessible to and modified from multiple processes simultaneously (for example between an application and an extension).
 * <p>
 * Optionally distributed (Currently only supported in Shared iPad for Students mode):  Data stored in user defaults can be made "ubiqitous", i.e. synchronized between devices via the cloud.  Ubiquitous user defaults are automatically propagated to all devices logged into the same iCloud account. When reading defaults (via -*ForKey: methods on NSUserDefaults), ubiquitous defaults are searched before local defaults. All operations on ubiquitous defaults are asynchronous, so registered defaults may be returned in place of ubiquitous defaults if downloading from iCloud hasn't finished. Ubiquitous defaults are specified in the Defaults Configuration File for an application.
 * <p>
 * Key-Value Store: NSUserDefaults stores Property List objects (NSString, NSData, NSNumber, NSDate, NSArray, and NSDictionary) identified by NSString keys, similar to an NSMutableDictionary.
 * <p>
 * Optimized for storing user settings: NSUserDefaults is intended for relatively small amounts of data, queried very frequently, and modified occasionally. Using it in other ways may be slow or use more memory than solutions more suited to those uses.
 * <p>
 * The 'App' CFPreferences functions in CoreFoundation act on the same search lists that NSUserDefaults does.
 * <p>
 * NSUserDefaults can be observed using Key-Value Observing for any key stored in it. Using NSKeyValueObservingOptionPrior to observe changes from other processes or devices will behave as though NSKeyValueObservingOptionPrior was not specified.
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUserDefaults alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSUserDefaults allocWithZone(VoidPtr zone);

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
    public static native NSUserDefaults new_objc();

    /**
     * +resetStandardUserDefaults releases the standardUserDefaults and sets it to nil. A new standardUserDefaults will be created the next time it's accessed. The only visible effect this has is that all KVO observers of the previous standardUserDefaults will no longer be observing it.
     */
    @Generated
    @Selector("resetStandardUserDefaults")
    public static native void resetStandardUserDefaults();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * +standardUserDefaults returns a global instance of NSUserDefaults configured to search the current application's search list.
     */
    @Generated
    @Selector("standardUserDefaults")
    public static native NSUserDefaults standardUserDefaults();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * -URLForKey: is equivalent to -objectForKey: except that it converts the returned value to an NSURL. If the value is an NSString path, then it will construct a file URL to that path. If the value is an archived URL from -setURL:forKey: it will be unarchived. If the value is absent or can't be converted to an NSURL, nil will be returned.
     */
    @Generated
    @Selector("URLForKey:")
    public native NSURL URLForKey(String defaultName);

    /**
     * -addSuiteNamed: adds the full search list for 'suiteName' as a sub-search-list of the receiver's. The additional search lists are searched after the current domain, but before global defaults. Passing NSGlobalDomain or the current application's bundle identifier is unsupported.
     */
    @Generated
    @Selector("addSuiteNamed:")
    public native void addSuiteNamed(String suiteName);

    /**
     * -arrayForKey: is equivalent to -objectForKey:, except that it will return nil if the value is not an NSArray.
     */
    @Generated
    @Selector("arrayForKey:")
    public native NSArray<?> arrayForKey(String defaultName);

    /**
     * -boolForKey: is equivalent to -objectForKey:, except that it converts the returned value to a BOOL. If the value is an NSNumber, NO will be returned if the value is 0, YES otherwise. If the value is an NSString, values of "YES" or "1" will return YES, and values of "NO", "0", or any other string will return NO. If the value is absent or can't be converted to a BOOL, NO will be returned.
     */
    @Generated
    @Selector("boolForKey:")
    public native boolean boolForKey(String defaultName);

    /**
     * -dataForKey: is equivalent to -objectForKey:, except that it will return nil if the value is not an NSData.
     */
    @Generated
    @Selector("dataForKey:")
    public native NSData dataForKey(String defaultName);

    /**
     * -dictionaryForKey: is equivalent to -objectForKey:, except that it will return nil if the value is not an NSDictionary.
     */
    @Generated
    @Selector("dictionaryForKey:")
    public native NSDictionary<String, ?> dictionaryForKey(String defaultName);

    /**
     * -dictionaryRepresentation returns a composite snapshot of the values in the receiver's search list, such that [[receiver dictionaryRepresentation] objectForKey:x] will return the same thing as [receiver objectForKey:x].
     */
    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<String, ?> dictionaryRepresentation();

    /**
     * -doubleForKey: is similar to -integerForKey:, except that it returns a double, and boolean values will not be converted.
     */
    @Generated
    @Selector("doubleForKey:")
    public native double doubleForKey(String defaultName);

    /**
     * -floatForKey: is similar to -integerForKey:, except that it returns a float, and boolean values will not be converted.
     */
    @Generated
    @Selector("floatForKey:")
    public native float floatForKey(String defaultName);

    /**
     * -init is equivalent to -initWithSuiteName:nil
     */
    @Generated
    @Selector("init")
    public native NSUserDefaults init();

    /**
     * -initWithSuiteName: initializes an instance of NSUserDefaults that searches the shared preferences search list for the domain 'suitename'. For example, using the identifier of an application group will cause the receiver to search the preferences for that group. Passing the current application's bundle identifier, NSGlobalDomain, or the corresponding CFPreferences constants is an error. Passing nil will search the default search list.
     */
    @Generated
    @Selector("initWithSuiteName:")
    public native NSUserDefaults initWithSuiteName(String suitename);

    /**
     * -initWithUser: is equivalent to -init
     */
    @Generated
    @Deprecated
    @Selector("initWithUser:")
    public native NSUserDefaults initWithUser(String username);

    /**
     * -integerForKey: is equivalent to -objectForKey:, except that it converts the returned value to an NSInteger. If the value is an NSNumber, the result of -integerValue will be returned. If the value is an NSString, it will be converted to NSInteger if possible. If the value is a boolean, it will be converted to either 1 for YES or 0 for NO. If the value is absent or can't be converted to an integer, 0 will be returned.
     */
    @Generated
    @Selector("integerForKey:")
    @NInt
    public native long integerForKey(String defaultName);

    /**
     * -objectForKey: will search the receiver's search list for a default with the key 'defaultName' and return it. If another process has changed defaults in the search list, NSUserDefaults will automatically update to the latest values. If the key in question has been marked as ubiquitous via a Defaults Configuration File, the latest value may not be immediately available, and the registered value will be returned instead.
     */
    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(String defaultName);

    /**
     * -objectIsForcedForKey: returns YES if the value for 'key' is provided by managed preferences (a configuration profile or mcx)
     */
    @Generated
    @Selector("objectIsForcedForKey:")
    public native boolean objectIsForcedForKey(String key);

    /**
     * -objectIsForcedForKey:inDomain: returns YES if the value for 'key' is provided by managed preferences (a configuration profile or mcx) for the search list named by 'domain'
     */
    @Generated
    @Selector("objectIsForcedForKey:inDomain:")
    public native boolean objectIsForcedForKeyInDomain(String key, String domain);

    /**
     * -persistentDomainForName: returns a dictionary representation of the search list entry specified by 'domainName', the current user, and any host.
     */
    @Generated
    @Selector("persistentDomainForName:")
    public native NSDictionary<String, ?> persistentDomainForName(String domainName);

    /**
     * -persistentDomainNames returns an incomplete list of domains that have preferences stored in them.
     */
    @Generated
    @Deprecated
    @Selector("persistentDomainNames")
    public native NSArray<?> persistentDomainNames();

    /**
     * -registerDefaults: adds the registrationDictionary to the last item in every search list. This means that after NSUserDefaults has looked for a value in every other valid location, it will look in registered defaults, making them useful as a "fallback" value. Registered defaults are never stored between runs of an application, and are visible only to the application that registers them.
     * <p>
     * Default values from Defaults Configuration Files will automatically be registered.
     */
    @Generated
    @Selector("registerDefaults:")
    public native void registerDefaults(NSDictionary<String, ?> registrationDictionary);

    /**
     * -removeObjectForKey: is equivalent to -[... setObject:nil forKey:defaultName]
     */
    @Generated
    @Selector("removeObjectForKey:")
    public native void removeObjectForKey(String defaultName);

    /**
     * -removePersistentDomainForName: removes all values from the search list entry specified by 'domainName', the current user, and any host. The change is persistent.
     */
    @Generated
    @Selector("removePersistentDomainForName:")
    public native void removePersistentDomainForName(String domainName);

    /**
     * -removeSuiteNamed: removes a sub-searchlist added via -addSuiteNamed:.
     */
    @Generated
    @Selector("removeSuiteNamed:")
    public native void removeSuiteNamed(String suiteName);

    @Generated
    @Selector("removeVolatileDomainForName:")
    public native void removeVolatileDomainForName(String domainName);

    /**
     * -setBool:forKey: is equivalent to -setObject:forKey: except that the value is converted from a BOOL to an NSNumber.
     */
    @Generated
    @Selector("setBool:forKey:")
    public native void setBoolForKey(boolean value, String defaultName);

    /**
     * -setDouble:forKey: is equivalent to -setObject:forKey: except that the value is converted from a double to an NSNumber.
     */
    @Generated
    @Selector("setDouble:forKey:")
    public native void setDoubleForKey(double value, String defaultName);

    /**
     * -setFloat:forKey: is equivalent to -setObject:forKey: except that the value is converted from a float to an NSNumber.
     */
    @Generated
    @Selector("setFloat:forKey:")
    public native void setFloatForKey(float value, String defaultName);

    /**
     * -setInteger:forKey: is equivalent to -setObject:forKey: except that the value is converted from an NSInteger to an NSNumber.
     */
    @Generated
    @Selector("setInteger:forKey:")
    public native void setIntegerForKey(@NInt long value, String defaultName);

    /**
     * -setObject:forKey: immediately stores a value (or removes the value if nil is passed as the value) for the provided key in the search list entry for the receiver's suite name in the current user and any host, then asynchronously stores the value persistently, where it is made available to other processes.
     */
    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Mapped(ObjCObjectMapper.class) Object value, String defaultName);

    /**
     * -setPersistentDomain:forName: replaces all values in the search list entry specified by 'domainName', the current user, and any host, with the values in 'domain'. The change will be persisted.
     */
    @Generated
    @Selector("setPersistentDomain:forName:")
    public native void setPersistentDomainForName(NSDictionary<String, ?> domain, String domainName);

    /**
     * -setURL:forKey is equivalent to -setObject:forKey: except that the value is archived to an NSData. Use -URLForKey: to retrieve values set this way.
     */
    @Generated
    @Selector("setURL:forKey:")
    public native void setURLForKey(NSURL url, String defaultName);

    @Generated
    @Selector("setVolatileDomain:forName:")
    public native void setVolatileDomainForName(NSDictionary<String, ?> domain, String domainName);

    /**
     * -stringForKey: is equivalent to -objectForKey:, except that it will return nil if the value is not an NSArray<NSString *>. Note that unlike -stringForKey:, NSNumbers are not converted to NSStrings.
     */
    @Generated
    @Selector("stringArrayForKey:")
    public native NSArray<String> stringArrayForKey(String defaultName);

    /**
     * -stringForKey: is equivalent to -objectForKey:, except that it will convert NSNumber values to their NSString representation. If a non-string non-number value is found, nil will be returned.
     */
    @Generated
    @Selector("stringForKey:")
    public native String stringForKey(String defaultName);

    /**
     * -synchronize is deprecated and will be marked with the API_DEPRECATED macro in a future release.
     * <p>
     * -synchronize blocks the calling thread until all in-progress set operations have completed. This is no longer necessary. Replacements for previous uses of -synchronize depend on what the intent of calling synchronize was. If you synchronized...
     * - ...before reading in order to fetch updated values: remove the synchronize call
     * - ...after writing in order to notify another program to read: the other program can use KVO to observe the default without needing to notify
     * - ...before exiting in a non-app (command line tool, agent, or daemon) process: call CFPreferencesAppSynchronize(kCFPreferencesCurrentApplication)
     * - ...for any other reason: remove the synchronize call
     */
    @Generated
    @Selector("synchronize")
    public native boolean synchronize();

    @Generated
    @Selector("volatileDomainForName:")
    public native NSDictionary<String, ?> volatileDomainForName(String domainName);

    /**
     * Volatile domains are not added to any search list, are not persisted, and are not visible to other applications. Using them is not recommended.
     */
    @Generated
    @Selector("volatileDomainNames")
    public native NSArray<String> volatileDomainNames();
}
