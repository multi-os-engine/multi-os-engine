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

package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] NEFilterManager
 * <p>
 * The NEFilterManager class declares the programmatic interface for an object that manages content filtering
 * configurations.
 * <p>
 * NEFilterManager declares methods and properties for configuring and controlling a filter.
 * <p>
 * Instances of this class are thread safe.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEFilterManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEFilterManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEFilterManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEFilterManager allocWithZone(VoidPtr zone);

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
    public static native NEFilterManager new_objc();

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
     * sharedManager
     *
     * @return The singleton NEFilterManager object for the calling process.
     */
    @Generated
    @Selector("sharedManager")
    public static native NEFilterManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native NEFilterManager init();

    /**
     * [@property] enabled
     * <p>
     * Toggles the enabled status of the filter. On iOS, setting this property will disable filter configurations of
     * other apps, and this property will be set to NO when other filter configurations are enabled.
     * On macOS, up to 4 filter configurations of the same grade can be enabled simultaneously.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * [@property] enabled
     * <p>
     * Toggles the enabled status of the filter. On iOS, setting this property will disable filter configurations of
     * other apps, and this property will be set to NO when other filter configurations are enabled.
     * On macOS, up to 4 filter configurations of the same grade can be enabled simultaneously.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * loadFromPreferencesWithCompletionHandler:
     * <p>
     * This function loads the current filter configuration from the caller's filter preferences.
     *
     * @param completionHandler A block that will be called when the load operation is completed. The NSError passed to
     *                          this block will be nil if the load operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_loadFromPreferencesWithCompletionHandler") Block_loadFromPreferencesWithCompletionHandler completionHandler);

    /**
     * [@property] localizedDescription
     * <p>
     * A string containing a description of the filter.
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * [@property] providerConfiguration
     * <p>
     * An NEFilterProviderConfiguration object containing the provider-specific portion of the filter configuration.
     */
    @Generated
    @Selector("providerConfiguration")
    public native NEFilterProviderConfiguration providerConfiguration();

    /**
     * removeFromPreferencesWithCompletionHandler:
     * <p>
     * This function removes the filter configuration from the caller's filter preferences. If the filter is enabled,
     * the filter becomes disabled.
     *
     * @param completionHandler A block that will be called when the remove operation is completed. The NSError passed
     *                          to this block will be nil if the remove operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_removeFromPreferencesWithCompletionHandler") Block_removeFromPreferencesWithCompletionHandler completionHandler);

    /**
     * saveToPreferencesWithCompletionHandler:
     * <p>
     * This function saves the filter configuration in the caller's filter preferences. If the filter is enabled, it
     * will become active.
     *
     * @param completionHandler A block that will be called when the save operation is completed. The NSError passed to
     *                          this block will be nil if the save operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_saveToPreferencesWithCompletionHandler") Block_saveToPreferencesWithCompletionHandler completionHandler);

    /**
     * [@property] localizedDescription
     * <p>
     * A string containing a description of the filter.
     */
    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    /**
     * [@property] providerConfiguration
     * <p>
     * An NEFilterProviderConfiguration object containing the provider-specific portion of the filter configuration.
     */
    @Generated
    @Selector("setProviderConfiguration:")
    public native void setProviderConfiguration(NEFilterProviderConfiguration value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadFromPreferencesWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeFromPreferencesWithCompletionHandler {
        @Generated
        void call_removeFromPreferencesWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveToPreferencesWithCompletionHandler {
        @Generated
        void call_saveToPreferencesWithCompletionHandler(NSError error);
    }
}
