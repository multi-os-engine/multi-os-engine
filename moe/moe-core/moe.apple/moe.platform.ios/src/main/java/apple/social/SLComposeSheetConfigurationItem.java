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

package apple.social;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * Represents a user-configurable option for the compose session.
 * For allowing the user to choose which account to post from, what privacy settings to use, etc.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Social")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SLComposeSheetConfigurationItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SLComposeSheetConfigurationItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SLComposeSheetConfigurationItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SLComposeSheetConfigurationItem allocWithZone(VoidPtr zone);

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
    public static native SLComposeSheetConfigurationItem new_objc();

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
     * Designated initializer
     */
    @Generated
    @Selector("init")
    public native SLComposeSheetConfigurationItem init();

    /**
     * Called on the main queue when the configuration item is tapped.
     * Your block should not keep a strong reference to either the configuration item, or the
     * SLComposeServiceViewController, otherwise you'll end up with a retain cycle.
     */
    @Generated
    @Selector("setTapHandler:")
    public native void setTapHandler(@ObjCBlock(name = "call_setTapHandler") Block_setTapHandler value);

    /**
     * The displayed name of the option.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * The current value/setting of the option.
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(String value);

    /**
     * Default is NO. set to YES to show a progress indicator. Can be used with a value too.
     */
    @Generated
    @Selector("setValuePending:")
    public native void setValuePending(boolean value);

    /**
     * Called on the main queue when the configuration item is tapped.
     * Your block should not keep a strong reference to either the configuration item, or the
     * SLComposeServiceViewController, otherwise you'll end up with a retain cycle.
     */
    @Generated
    @Selector("tapHandler")
    @ObjCBlock(name = "call_tapHandler_ret")
    public native Block_tapHandler_ret tapHandler();

    /**
     * The displayed name of the option.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * The current value/setting of the option.
     */
    @Generated
    @Selector("value")
    public native String value();

    /**
     * Default is NO. set to YES to show a progress indicator. Can be used with a value too.
     */
    @Generated
    @Selector("valuePending")
    public native boolean valuePending();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTapHandler {
        @Generated
        void call_setTapHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_tapHandler_ret {
        @Generated
        void call_tapHandler_ret();
    }
}
