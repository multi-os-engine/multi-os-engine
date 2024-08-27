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

package apple.audiotoolbox;

import apple.NSObject;
import apple.audiotoolbox.struct.AUParameterAutomationEvent;
import apple.audiotoolbox.struct.AURecordedParameterEvent;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AUParameterNode
 * 
 * A node in an audio unit's tree of parameters.
 * 
 * Nodes are instances of either AUParameterGroup or AUParameter.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AudioToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUParameterNode extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AUParameterNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUParameterNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AUParameterNode allocWithZone(VoidPtr zone);

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
    public static native AUParameterNode new_objc();

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
     * [@property] displayName
     * 
     * A localized name to display for the parameter.
     */
    @NotNull
    @Generated
    @Selector("displayName")
    public native String displayName();

    /**
     * displayNameWithLength:
     * 
     * A version of displayName possibly abbreviated to the given desired length, in characters.
     * 
     * The default implementation simply returns displayName.
     */
    @NotNull
    @Generated
    @Selector("displayNameWithLength:")
    public native String displayNameWithLength(@NInt long maximumLength);

    /**
     * [@property] identifier
     * 
     * A non-localized, permanent name for a parameter or group.
     * 
     * The identifier must be unique for all child nodes under any given parent. From release to
     * release, an audio unit must not change its parameters' identifiers; this will invalidate any
     * hosts' documents that refer to the parameters.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * Called to obtain an abbreviated version of a parameter or group name.
     */
    @NotNull
    @Generated
    @Selector("implementorDisplayNameWithLengthCallback")
    @ObjCBlock(name = "call_implementorDisplayNameWithLengthCallback_ret")
    public native Block_implementorDisplayNameWithLengthCallback_ret implementorDisplayNameWithLengthCallback();

    /**
     * Called to provide string representations of parameter values.
     * If value is nil, the callback uses the current value of the parameter.
     */
    @NotNull
    @Generated
    @Selector("implementorStringFromValueCallback")
    @ObjCBlock(name = "call_implementorStringFromValueCallback_ret")
    public native Block_implementorStringFromValueCallback_ret implementorStringFromValueCallback();

    /**
     * Called to convert string to numeric representations of parameter values.
     */
    @NotNull
    @Generated
    @Selector("implementorValueFromStringCallback")
    @ObjCBlock(name = "call_implementorValueFromStringCallback_ret")
    public native Block_implementorValueFromStringCallback_ret implementorValueFromStringCallback();

    /**
     * Called when a parameter changes value.
     * 
     * This block, used only in an audio unit implementation, receives all externally-generated
     * changes to parameter values. It should store the new value in its audio signal processing
     * state (assuming that that state is separate from the AUParameter object).
     */
    @NotNull
    @Generated
    @Selector("implementorValueObserver")
    @ObjCBlock(name = "call_implementorValueObserver_ret")
    public native Block_implementorValueObserver_ret implementorValueObserver();

    /**
     * Called when a value of a parameter in the tree is known to have a stale value
     * needing to be refreshed.
     * 
     * The audio unit should return the current value for this parameter; the AUParameterNode will
     * store the value.
     */
    @NotNull
    @Generated
    @Selector("implementorValueProvider")
    @ObjCBlock(name = "call_implementorValueProvider_ret")
    public native Block_implementorValueProvider_ret implementorValueProvider();

    @Generated
    @Selector("init")
    public native AUParameterNode init();

    /**
     * [@property] keyPath
     * 
     * Generated by concatenating the identifiers of a node's parents with its own.
     * 
     * Unless an audio unit specifically documents that its parameter addresses are stable and
     * persistent, hosts, when recording parameter values, should bind to the keyPath.
     * 
     * The individual node identifiers in a key path are separated by periods. (".")
     * 
     * Passing a node's keyPath to -[tree valueForKeyPath:] should return the same node.
     */
    @NotNull
    @Generated
    @Selector("keyPath")
    public native String keyPath();

    /**
     * removeParameterObserver:
     * 
     * Remove an observer created with tokenByAddingParameterObserver,
     * tokenByAddingParameterRecordingObserver, or tokenByAddingParameterAutomationObserver.
     * 
     * This call will remove the callback corresponding to the supplied token. Note that this
     * will block until any callbacks currently in flight have completed.
     */
    @Generated
    @Selector("removeParameterObserver:")
    public native void removeParameterObserver(@NotNull VoidPtr token);

    /**
     * Called to obtain an abbreviated version of a parameter or group name.
     */
    @Generated
    @Selector("setImplementorDisplayNameWithLengthCallback:")
    public native void setImplementorDisplayNameWithLengthCallback(
            @NotNull @ObjCBlock(name = "call_setImplementorDisplayNameWithLengthCallback") Block_setImplementorDisplayNameWithLengthCallback value);

    /**
     * Called to provide string representations of parameter values.
     * If value is nil, the callback uses the current value of the parameter.
     */
    @Generated
    @Selector("setImplementorStringFromValueCallback:")
    public native void setImplementorStringFromValueCallback(
            @NotNull @ObjCBlock(name = "call_setImplementorStringFromValueCallback") Block_setImplementorStringFromValueCallback value);

    /**
     * Called to convert string to numeric representations of parameter values.
     */
    @Generated
    @Selector("setImplementorValueFromStringCallback:")
    public native void setImplementorValueFromStringCallback(
            @NotNull @ObjCBlock(name = "call_setImplementorValueFromStringCallback") Block_setImplementorValueFromStringCallback value);

    /**
     * Called when a parameter changes value.
     * 
     * This block, used only in an audio unit implementation, receives all externally-generated
     * changes to parameter values. It should store the new value in its audio signal processing
     * state (assuming that that state is separate from the AUParameter object).
     */
    @Generated
    @Selector("setImplementorValueObserver:")
    public native void setImplementorValueObserver(
            @NotNull @ObjCBlock(name = "call_setImplementorValueObserver") Block_setImplementorValueObserver value);

    /**
     * Called when a value of a parameter in the tree is known to have a stale value
     * needing to be refreshed.
     * 
     * The audio unit should return the current value for this parameter; the AUParameterNode will
     * store the value.
     */
    @Generated
    @Selector("setImplementorValueProvider:")
    public native void setImplementorValueProvider(
            @NotNull @ObjCBlock(name = "call_setImplementorValueProvider") Block_setImplementorValueProvider value);

    /**
     * tokenByAddingParameterAutomationObserver:
     * 
     * Add a recording observer for a parameter or all parameters in a group/tree.
     * 
     * An audio unit host can use an AUParameterAutomationObserver or AUParameterRecordingObserver
     * to capture a series of changes to a parameter value, including the timing of the events, as
     * generated by a UI gesture in a view, for example.
     * 
     * Unlike AUParameterObserver, these callbacks are not throttled.
     * 
     * This block is called in an arbitrary thread context. It is responsible for thread-safety.
     * It must not make any calls to add or remove other observers, including itself;
     * this will deadlock.
     * 
     * An audio unit's engine should interact with the parameter object via
     * implementorValueObserver and implementorValueProvider.
     * 
     * @param observer
     *                 A block to call to record the changing of a parameter value.
     * @return
     *         A token which can be passed to removeParameterObserver: or to -[AUParameter
     *         setValue:originator:]
     * 
     *         API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("tokenByAddingParameterAutomationObserver:")
    public native VoidPtr tokenByAddingParameterAutomationObserver(
            @NotNull @ObjCBlock(name = "call_tokenByAddingParameterAutomationObserver") Block_tokenByAddingParameterAutomationObserver observer);

    /**
     * tokenByAddingParameterObserver:
     * 
     * Add an observer for a parameter or all parameters in a group/tree.
     * 
     * An audio unit view can use an AUParameterObserver to be notified of changes
     * to a single parameter, or to all parameters in a group/tree.
     * 
     * These callbacks are throttled so as to limit the rate of redundant notifications
     * in the case of frequent changes to a single parameter.
     * 
     * This block is called in an arbitrary thread context. It is responsible for thread-safety.
     * It must not make any calls to add or remove other observers, including itself;
     * this will deadlock.
     * 
     * An audio unit's implementation should interact with the parameter object via
     * implementorValueObserver and implementorValueProvider.
     * 
     * Parameter observers are bound to a specific parameter instance. If this parameter is
     * destroyed, e.g. if the parameter tree is re-constructed, the previously set parameter
     * observers will no longer be valid. Clients can observe changes to the parameter tree
     * via KVO. See the discussion of -[AUAudioUnit parameterTree].
     * 
     * @param observer
     *                 A block to call after the value of a parameter has changed.
     * @return
     *         A token which can be passed to removeParameterObserver: or to -[AUParameter setValue:originator:]
     */
    @NotNull
    @Generated
    @Selector("tokenByAddingParameterObserver:")
    public native VoidPtr tokenByAddingParameterObserver(
            @NotNull @ObjCBlock(name = "call_tokenByAddingParameterObserver") Block_tokenByAddingParameterObserver observer);

    /**
     * tokenByAddingParameterRecordingObserver:
     * 
     * Add a recording observer for a parameter or all parameters in a group/tree.
     * 
     * This is a variant of tokenByAddingParameterAutomationObserver where the callback receives
     * AURecordedParameterEvents instead of AUParameterAutomationEvents.
     * 
     * This will be deprecated in favor of tokenByAddingParameterAutomationObserver in a future
     * release.
     */
    @NotNull
    @Generated
    @Selector("tokenByAddingParameterRecordingObserver:")
    public native VoidPtr tokenByAddingParameterRecordingObserver(
            @NotNull @ObjCBlock(name = "call_tokenByAddingParameterRecordingObserver") Block_tokenByAddingParameterRecordingObserver observer);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorDisplayNameWithLengthCallback_ret {
        @NotNull
        @Generated
        String call_implementorDisplayNameWithLengthCallback_ret(@NotNull AUParameterNode node,
                @NInt long desiredLength);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorStringFromValueCallback_ret {
        @NotNull
        @Generated
        String call_implementorStringFromValueCallback_ret(@NotNull AUParameter param, @Nullable ConstFloatPtr value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorValueFromStringCallback_ret {
        @Generated
        float call_implementorValueFromStringCallback_ret(@NotNull AUParameter param, @NotNull String string);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorValueObserver_ret {
        @Generated
        void call_implementorValueObserver_ret(@NotNull AUParameter param, float value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorValueProvider_ret {
        @Generated
        float call_implementorValueProvider_ret(@NotNull AUParameter param);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorDisplayNameWithLengthCallback {
        @NotNull
        @Generated
        String call_setImplementorDisplayNameWithLengthCallback(@NotNull AUParameterNode node,
                @NInt long desiredLength);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorStringFromValueCallback {
        @NotNull
        @Generated
        String call_setImplementorStringFromValueCallback(@NotNull AUParameter param, @Nullable ConstFloatPtr value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorValueFromStringCallback {
        @Generated
        float call_setImplementorValueFromStringCallback(@NotNull AUParameter param, @NotNull String string);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorValueObserver {
        @Generated
        void call_setImplementorValueObserver(@NotNull AUParameter param, float value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorValueProvider {
        @Generated
        float call_setImplementorValueProvider(@NotNull AUParameter param);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_tokenByAddingParameterAutomationObserver {
        @Generated
        void call_tokenByAddingParameterAutomationObserver(@NInt long numberEvents,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AUParameterAutomationEvent events);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_tokenByAddingParameterObserver {
        @Generated
        void call_tokenByAddingParameterObserver(long address, float value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_tokenByAddingParameterRecordingObserver {
        @Generated
        void call_tokenByAddingParameterRecordingObserver(@NInt long numberEvents,
                @NotNull AURecordedParameterEvent events);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
