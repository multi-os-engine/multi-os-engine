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

package apple.gameplaykit;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Models a finite state machine that has a single current state.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKStateMachine extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKStateMachine(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKStateMachine alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKStateMachine allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native GKStateMachine new_objc();

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
     * Creates a state machine with an array of possible states and an initial state.
     * 
     * @param states a list of possible states for this state machine.
     */
    @Generated
    @Selector("stateMachineWithStates:")
    public static native GKStateMachine stateMachineWithStates(@NotNull NSArray<? extends GKState> states);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns YES if the indicated class is a a valid next state or if currentState is nil
     * 
     * @param stateClass the class of the state to be tested
     */
    @Generated
    @Selector("canEnterState:")
    public native boolean canEnterState(@NotNull Class stateClass);

    /**
     * The current state that the state machine is in.
     * Prior to the first called to enterState this is equal to nil.
     */
    @Nullable
    @Generated
    @Selector("currentState")
    public native GKState currentState();

    /**
     * Calls canEnterState to check if we can enter the given state and then enters that state if so.
     * [GKState willExitWithNextState:] is called on the old current state.
     * [GKState didEnterWithPreviousState:] is called on the new state.
     * 
     * @param stateClass the class of the state to switch to
     * @return YES if state was entered. NO otherwise.
     */
    @Generated
    @Selector("enterState:")
    public native boolean enterState(@NotNull Class stateClass);

    @Generated
    @Selector("init")
    public native GKStateMachine init();

    @Generated
    @Selector("initWithStates:")
    public native GKStateMachine initWithStates(@NotNull NSArray<? extends GKState> states);

    /**
     * Gets the instance of the indicated state class from this state machine.
     * Returns nil if the state does not exist
     * 
     * @param stateClass the class of the state to be retrieved
     */
    @Nullable
    @Generated
    @Selector("stateForClass:")
    public native GKState stateForClass(@NotNull Class stateClass);

    /**
     * Updates the current state machine.
     * 
     * @param sec the time, in seconds, since the last frame
     */
    @Generated
    @Selector("updateWithDeltaTime:")
    public native void updateWithDeltaTime(double sec);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
