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

/**
 * Represents a single state in a state machine.
 * By default, states allow transitions freely to and from the states in the machine.
 * <p>
 * If a more restricted set of valid transitions are needed in the state machine, you may override isValidNextState: where applicable.
 *
 * @see GKStateMachine
 * @see isValidNextState:
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKState extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKState alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKState allocWithZone(VoidPtr zone);

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
    public static native GKState new_objc();

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
     * Creates a new state to be used in a state machine.
     *
     * @see GKStateMachine
     */
    @Generated
    @Selector("state")
    public static native GKState state();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Called by GKStateMachine when this state is entered.
     *
     * @param previousState the state that was exited to enter this state.  This is nil if this is the state machine's first entered state.
     * @see stateMachineWithStates:initialStateClass:
     */
    @Generated
    @Selector("didEnterWithPreviousState:")
    public native void didEnterWithPreviousState(GKState previousState);

    @Generated
    @Selector("init")
    public native GKState init();

    /**
     * Returns YES if the given class is a valid next state to enter.
     * <p>
     * By default GKState will return YES for any class that is subclass of GKState.
     * Override this in a subclass to enforce limited edge traversals in the state machine.
     *
     * @param stateClass the class to be checked
     * @return YES if the class is kind of GKState and the state transition is valid, else NO.
     * @see GKStateMachine.canEnterState:
     * @see GKStateMachine.enterState:
     */
    @Generated
    @Selector("isValidNextState:")
    public native boolean isValidNextState(Class stateClass);

    /**
     * The state machine that this state is associated with.
     * This is nil if this state hasn't been added to a state machine yet.
     */
    @Generated
    @Selector("stateMachine")
    public native GKStateMachine stateMachine();

    /**
     * Called by GKStateMachine when it is updated
     *
     * @param seconds the time in seconds since the last update
     */
    @Generated
    @Selector("updateWithDeltaTime:")
    public native void updateWithDeltaTime(double seconds);

    /**
     * Called by GKStateMachine when this state is exited
     *
     * @param nextState the state that is being entered next
     */
    @Generated
    @Selector("willExitWithNextState:")
    public native void willExitWithNextState(GKState nextState);
}
