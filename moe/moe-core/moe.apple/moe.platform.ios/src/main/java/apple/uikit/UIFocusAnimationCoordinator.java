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
 * UIFocusAnimationCoordinator is used to coordinate disparate animations that are related to a focus update.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFocusAnimationCoordinator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFocusAnimationCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFocusAnimationCoordinator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIFocusAnimationCoordinator allocWithZone(VoidPtr zone);

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
    public static native UIFocusAnimationCoordinator new_objc();

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
     * Specifies focus-related animations that should be coordinated with the animations of the focusing or un-focusing view.
     * <p>
     * Any animations specified will be run in the same animation context as the main animation. The completion block is invoked after the main animation completes.
     * (Note that this may not be after all the coordinated animations specified by the call complete if the duration is not inherited.)
     * <p>
     * It is perfectly legitimate to only specify a completion block.
     */
    @Generated
    @Selector("addCoordinatedAnimations:completion:")
    public native void addCoordinatedAnimationsCompletion(
            @ObjCBlock(name = "call_addCoordinatedAnimationsCompletion_0") Block_addCoordinatedAnimationsCompletion_0 animations,
            @ObjCBlock(name = "call_addCoordinatedAnimationsCompletion_1") Block_addCoordinatedAnimationsCompletion_1 completion);

    @Generated
    @Selector("init")
    public native UIFocusAnimationCoordinator init();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCoordinatedAnimationsCompletion_0 {
        @Generated
        void call_addCoordinatedAnimationsCompletion_0();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCoordinatedAnimationsCompletion_1 {
        @Generated
        void call_addCoordinatedAnimationsCompletion_1();
    }

    /**
     * Specifies focus-related animations that should be coordinated with the animations of the focusing item.
     * <p>
     * Any animations specified will be run in the same animation context as the main animation. The completion block is invoked after the UIKit-defined animations complete.
     * <p>
     * It is perfectly legitimate to only specify a completion block.
     * <p>
     * A context object is provided in the animation block with details of the UIKit-defined animations being run for the focusing item.
     */
    @Generated
    @Selector("addCoordinatedFocusingAnimations:completion:")
    public native void addCoordinatedFocusingAnimationsCompletion(
            @ObjCBlock(name = "call_addCoordinatedFocusingAnimationsCompletion_0") Block_addCoordinatedFocusingAnimationsCompletion_0 animations,
            @ObjCBlock(name = "call_addCoordinatedFocusingAnimationsCompletion_1") Block_addCoordinatedFocusingAnimationsCompletion_1 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCoordinatedFocusingAnimationsCompletion_0 {
        @Generated
        void call_addCoordinatedFocusingAnimationsCompletion_0(@Mapped(ObjCObjectMapper.class) Object animationContext);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCoordinatedFocusingAnimationsCompletion_1 {
        @Generated
        void call_addCoordinatedFocusingAnimationsCompletion_1();
    }

    /**
     * Specifies focus-related animations that should be coordinated with the animations of the un-focusing item.
     * <p>
     * Any animations specified will be run in the same animation context as the main animation. The completion block is invoked after the UIKit-defined animations complete.
     * <p>
     * It is perfectly legitimate to only specify a completion block.
     * <p>
     * A context object is provided in the animation block with details of the UIKit-defined animations being run for the un-focusing item.
     */
    @Generated
    @Selector("addCoordinatedUnfocusingAnimations:completion:")
    public native void addCoordinatedUnfocusingAnimationsCompletion(
            @ObjCBlock(name = "call_addCoordinatedUnfocusingAnimationsCompletion_0") Block_addCoordinatedUnfocusingAnimationsCompletion_0 animations,
            @ObjCBlock(name = "call_addCoordinatedUnfocusingAnimationsCompletion_1") Block_addCoordinatedUnfocusingAnimationsCompletion_1 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCoordinatedUnfocusingAnimationsCompletion_0 {
        @Generated
        void call_addCoordinatedUnfocusingAnimationsCompletion_0(
                @Mapped(ObjCObjectMapper.class) Object animationContext);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCoordinatedUnfocusingAnimationsCompletion_1 {
        @Generated
        void call_addCoordinatedUnfocusingAnimationsCompletion_1();
    }
}
