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

package apple.gamecontroller;

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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Every controller element knows which collection it belongs to and whether its input value is analog or digital.
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCControllerElement extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GCControllerElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCControllerElement alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCControllerElement allocWithZone(VoidPtr zone);

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
    public static native GCControllerElement new_objc();

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
     * Each element can be part of a wider collection of inputs that map to a single logical element. A directional pad
     * (dpad)
     * is a logical collection of two axis inputs and thus each axis belongs to the same collection element - the dpad.
     */
    @Generated
    @Selector("collection")
    public native GCControllerElement collection();

    @Generated
    @Selector("init")
    public native GCControllerElement init();

    /**
     * Check if the element can support more than just digital values, such as decimal ranges between 0 and 1.
     * Defaults to YES for most elements.
     */
    @Generated
    @Selector("isAnalog")
    public native boolean isAnalog();

    /**
     * A set of aliases that can be used to access this element with keyed subscript notation.
     */
    @Generated
    @Selector("aliases")
    public native NSSet<String> aliases();

    /**
     * Check if the element is bound to a system gesture.
     * Defaults to NO for most elements.
     *
     * @see preferredSystemGestureState
     * @see GCSystemGestureState
     */
    @Generated
    @Selector("isBoundToSystemGesture")
    public native boolean isBoundToSystemGesture();

    /**
     * The element's localized name, taking input remapping into account.
     * <p>
     * [@note] In almost all instances, you should use this over unmappedLocalizedName in your UI.
     */
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * The preferred system gesture state for this element.
     * Defaults to GCSystemGestureStateEnabled for most elements
     * <p>
     * [@note] This is merely the preferred system gesture state - it is not guaranteed to be respected by the system.
     * [@note] It is highly recommended to leave this set to the default value, however there may be situations (for
     * example, game
     * streaming apps) where it is preferrable to disable system gestures.
     *
     * @see boundToSystemGesture
     */
    @Generated
    @Selector("preferredSystemGestureState")
    @NInt
    public native long preferredSystemGestureState();

    /**
     * The element's localized name, taking input remapping into account.
     * <p>
     * [@note] In almost all instances, you should use this over unmappedLocalizedName in your UI.
     */
    @Generated
    @Selector("setLocalizedName:")
    public native void setLocalizedName(String value);

    /**
     * The preferred system gesture state for this element.
     * Defaults to GCSystemGestureStateEnabled for most elements
     * <p>
     * [@note] This is merely the preferred system gesture state - it is not guaranteed to be respected by the system.
     * [@note] It is highly recommended to leave this set to the default value, however there may be situations (for
     * example, game
     * streaming apps) where it is preferrable to disable system gestures.
     *
     * @see boundToSystemGesture
     */
    @Generated
    @Selector("setPreferredSystemGestureState:")
    public native void setPreferredSystemGestureState(@NInt long value);

    /**
     * The element's SF Symbols name, taking input remapping into account.
     * <p>
     * [@note] In almost all instances, you should use this over unmappedSfSymbolsName in your UI.
     */
    @Generated
    @Selector("setSfSymbolsName:")
    public native void setSfSymbolsName(String value);

    /**
     * The element's localized name, not taking any input remapping into account.
     * <p>
     * [@note] Use this in your games own remapping UI, or when you need to prompt a user that a given button has no
     * mapping (localizedName is nil).
     */
    @Generated
    @Selector("setUnmappedLocalizedName:")
    public native void setUnmappedLocalizedName(String value);

    /**
     * The element's SF Symbols name, not taking any input remapping into account.
     * <p>
     * [@note] Use this in your games own remapping UI, or when you need to prompt a user that a given button has no
     * mapping (sfSymbolsName is nil).
     */
    @Generated
    @Selector("setUnmappedSfSymbolsName:")
    public native void setUnmappedSfSymbolsName(String value);

    /**
     * The element's SF Symbols name, taking input remapping into account.
     * <p>
     * [@note] In almost all instances, you should use this over unmappedSfSymbolsName in your UI.
     */
    @Generated
    @Selector("sfSymbolsName")
    public native String sfSymbolsName();

    /**
     * The element's localized name, not taking any input remapping into account.
     * <p>
     * [@note] Use this in your games own remapping UI, or when you need to prompt a user that a given button has no
     * mapping (localizedName is nil).
     */
    @Generated
    @Selector("unmappedLocalizedName")
    public native String unmappedLocalizedName();

    /**
     * The element's SF Symbols name, not taking any input remapping into account.
     * <p>
     * [@note] Use this in your games own remapping UI, or when you need to prompt a user that a given button has no
     * mapping (sfSymbolsName is nil).
     */
    @Generated
    @Selector("unmappedSfSymbolsName")
    public native String unmappedSfSymbolsName();
}
