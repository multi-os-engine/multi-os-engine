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

package apple.uikit;

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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIMutableApplicationShortcutItem extends UIApplicationShortcutItem {
    static {
        NatJ.register();
    }

    @Generated
    protected UIMutableApplicationShortcutItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIMutableApplicationShortcutItem alloc();

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
    @Selector("icon")
    public native UIApplicationShortcutIcon icon();

    @Generated
    @Selector("init")
    public native UIMutableApplicationShortcutItem init();

    @Generated
    @Selector("initWithType:localizedTitle:")
    public native UIMutableApplicationShortcutItem initWithTypeLocalizedTitle(String type, String localizedTitle);

    @Generated
    @Selector("initWithType:localizedTitle:localizedSubtitle:icon:userInfo:")
    public native UIMutableApplicationShortcutItem initWithTypeLocalizedTitleLocalizedSubtitleIconUserInfo(String type,
            String localizedTitle, String localizedSubtitle, UIApplicationShortcutIcon icon,
            NSDictionary<String, ?> userInfo);

    @Generated
    @Selector("localizedSubtitle")
    public native String localizedSubtitle();

    /**
     * Properties controlling how the item should be displayed on the home screen.
     */
    @Generated
    @Selector("localizedTitle")
    public native String localizedTitle();

    @Generated
    @Selector("setIcon:")
    public native void setIcon(UIApplicationShortcutIcon value);

    @Generated
    @Selector("setLocalizedSubtitle:")
    public native void setLocalizedSubtitle(String value);

    /**
     * Properties controlling how the item should be displayed on the home screen.
     */
    @Generated
    @Selector("setLocalizedTitle:")
    public native void setLocalizedTitle(String value);

    /**
     * An application-specific string that identifies the type of action to perform.
     */
    @Generated
    @Selector("setType:")
    public native void setType(String value);

    /**
     * Application-specific information needed to perform the action.
     * Will throw an exception if the NSDictionary is not plist-encodable.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<String, ?> value);

    /**
     * An application-specific string that identifies the type of action to perform.
     */
    @Generated
    @Selector("type")
    public native String type();

    /**
     * Application-specific information needed to perform the action.
     * Will throw an exception if the NSDictionary is not plist-encodable.
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<String, ?> userInfo();

    /**
     * used with UISceneActivationConditions to customize what scene should be activated for a shortcut
     */
    @Generated
    @Selector("setTargetContentIdentifier:")
    public native void setTargetContentIdentifier(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * used with UISceneActivationConditions to customize what scene should be activated for a shortcut
     */
    @Generated
    @Selector("targetContentIdentifier")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object targetContentIdentifier();
}
