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

package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMTrigger extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMTrigger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMTrigger alloc();

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
    public static native void load_objc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();

    /**
     * actionSets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTrigger_Class/index.html#//apple_ref/occ/instp/HMTrigger/actionSets">iOS Dev Center</a>
     */
    @Generated
    @Selector("actionSets")
    public native NSArray<? extends HMActionSet> actionSets();

    /**
     * addActionSet:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTrigger_Class/index.html#//apple_ref/occ/instm/HMTrigger/addActionSet:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addActionSet:completionHandler:")
    public native void addActionSetCompletionHandler(HMActionSet actionSet,
            @ObjCBlock(name = "call_addActionSetCompletionHandler") Block_addActionSetCompletionHandler completion);

    /**
     * enable:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTrigger_Class/index.html#//apple_ref/occ/instm/HMTrigger/enable:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enable:completionHandler:")
    public native void enableCompletionHandler(boolean enable,
            @ObjCBlock(name = "call_enableCompletionHandler") Block_enableCompletionHandler completion);

    @Generated
    @Selector("init")
    public native HMTrigger init();

    /**
     * enabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTrigger_Class/index.html#//apple_ref/occ/instp/HMTrigger/enabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * lastFireDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTrigger_Class/index.html#//apple_ref/occ/instp/HMTrigger/lastFireDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("lastFireDate")
    public native NSDate lastFireDate();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTrigger_Class/index.html#//apple_ref/occ/instp/HMTrigger/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * removeActionSet:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTrigger_Class/index.html#//apple_ref/occ/instm/HMTrigger/removeActionSet:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeActionSet:completionHandler:")
    public native void removeActionSetCompletionHandler(HMActionSet actionSet,
            @ObjCBlock(name = "call_removeActionSetCompletionHandler") Block_removeActionSetCompletionHandler completion);

    /**
     * updateName:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTrigger_Class/index.html#//apple_ref/occ/instm/HMTrigger/updateName:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateName:completionHandler:")
    public native void updateNameCompletionHandler(String name,
            @ObjCBlock(name = "call_updateNameCompletionHandler") Block_updateNameCompletionHandler completion);

    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addActionSetCompletionHandler {
        @Generated
        void call_addActionSetCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableCompletionHandler {
        @Generated
        void call_enableCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeActionSetCompletionHandler {
        @Generated
        void call_removeActionSetCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNameCompletionHandler {
        @Generated
        void call_updateNameCompletionHandler(NSError arg0);
    }
}
