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

/**
 * AUParameterNode
 * <p>
 * A node in an audio unit's tree of parameters.
 * <p>
 * Nodes are instances of either AUParameterGroup or AUParameter.
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
     * [@property]	displayName
     * <p>
     * A localized name to display for the parameter.
     */
    @Generated
    @Selector("displayName")
    public native String displayName();

    /**
     * displayNameWithLength:
     * <p>
     * A version of displayName possibly abbreviated to the given desired length, in characters.
     * <p>
     * The default implementation simply returns displayName.
     */
    @Generated
    @Selector("displayNameWithLength:")
    public native String displayNameWithLength(@NInt long maximumLength);

    /**
     * [@property]	identifier
     * <p>
     * A non-localized, permanent name for a parameter or group.
     * <p>
     * The identifier must be unique for all child nodes under any given parent. From release to
     * release, an audio unit must not change its parameters' identifiers; this will invalidate any
     * hosts' documents that refer to the parameters.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * Called to obtain an abbreviated version of a parameter or group name.
     */
    @Generated
    @Selector("implementorDisplayNameWithLengthCallback")
    @ObjCBlock(name = "call_implementorDisplayNameWithLengthCallback_ret")
    public native Block_implementorDisplayNameWithLengthCallback_ret implementorDisplayNameWithLengthCallback();

    /**
     * Called to provide string representations of parameter values.
     * If value is nil, the callback uses the current value of the parameter.
     */
    @Generated
    @Selector("implementorStringFromValueCallback")
    @ObjCBlock(name = "call_implementorStringFromValueCallback_ret")
    public native Block_implementorStringFromValueCallback_ret implementorStringFromValueCallback();

    /**
     * Called to convert string to numeric representations of parameter values.
     */
    @Generated
    @Selector("implementorValueFromStringCallback")
    @ObjCBlock(name = "call_implementorValueFromStringCallback_ret")
    public native Block_implementorValueFromStringCallback_ret implementorValueFromStringCallback();

    /**
     * Called when a parameter changes value.
     * <p>
     * This block, used only in an audio unit implementation, receives all externally-generated
     * changes to parameter values. It should store the new value in its audio signal processing
     * state (assuming that that state is separate from the AUParameter object).
     */
    @Generated
    @Selector("implementorValueObserver")
    @ObjCBlock(name = "call_implementorValueObserver_ret")
    public native Block_implementorValueObserver_ret implementorValueObserver();

    /**
     * Called when a value of a parameter in the tree is known to have a stale value
     * needing to be refreshed.
     * <p>
     * The audio unit should return the current value for this parameter; the AUParameterNode will
     * store the value.
     */
    @Generated
    @Selector("implementorValueProvider")
    @ObjCBlock(name = "call_implementorValueProvider_ret")
    public native Block_implementorValueProvider_ret implementorValueProvider();

    @Generated
    @Selector("init")
    public native AUParameterNode init();

    /**
     * [@property]	keyPath
     * <p>
     * Generated by concatenating the identifiers of a node's parents with its own.
     * <p>
     * Unless an audio unit specifically documents that its parameter addresses are stable and
     * persistent, hosts, when recording parameter values, should bind to the keyPath.
     * <p>
     * The individual node identifiers in a key path are separated by periods. (".")
     * <p>
     * Passing a node's keyPath to -[tree valueForKeyPath:] should return the same node.
     */
    @Generated
    @Selector("keyPath")
    public native String keyPath();

    /**
     * removeParameterObserver:
     * <p>
     * Remove an observer created with tokenByAddingParameterObserver,
     * tokenByAddingParameterRecordingObserver, or tokenByAddingParameterAutomationObserver.
     * <p>
     * This call will remove the callback corresponding to the supplied token. Note that this
     * will block until any callbacks currently in flight have completed.
     */
    @Generated
    @Selector("removeParameterObserver:")
    public native void removeParameterObserver(VoidPtr token);

    /**
     * Called to obtain an abbreviated version of a parameter or group name.
     */
    @Generated
    @Selector("setImplementorDisplayNameWithLengthCallback:")
    public native void setImplementorDisplayNameWithLengthCallback(
            @ObjCBlock(name = "call_setImplementorDisplayNameWithLengthCallback") Block_setImplementorDisplayNameWithLengthCallback value);

    /**
     * Called to provide string representations of parameter values.
     * If value is nil, the callback uses the current value of the parameter.
     */
    @Generated
    @Selector("setImplementorStringFromValueCallback:")
    public native void setImplementorStringFromValueCallback(
            @ObjCBlock(name = "call_setImplementorStringFromValueCallback") Block_setImplementorStringFromValueCallback value);

    /**
     * Called to convert string to numeric representations of parameter values.
     */
    @Generated
    @Selector("setImplementorValueFromStringCallback:")
    public native void setImplementorValueFromStringCallback(
            @ObjCBlock(name = "call_setImplementorValueFromStringCallback") Block_setImplementorValueFromStringCallback value);

    /**
     * Called when a parameter changes value.
     * <p>
     * This block, used only in an audio unit implementation, receives all externally-generated
     * changes to parameter values. It should store the new value in its audio signal processing
     * state (assuming that that state is separate from the AUParameter object).
     */
    @Generated
    @Selector("setImplementorValueObserver:")
    public native void setImplementorValueObserver(
            @ObjCBlock(name = "call_setImplementorValueObserver") Block_setImplementorValueObserver value);

    /**
     * Called when a value of a parameter in the tree is known to have a stale value
     * needing to be refreshed.
     * <p>
     * The audio unit should return the current value for this parameter; the AUParameterNode will
     * store the value.
     */
    @Generated
    @Selector("setImplementorValueProvider:")
    public native void setImplementorValueProvider(
            @ObjCBlock(name = "call_setImplementorValueProvider") Block_setImplementorValueProvider value);

    /**
     * tokenByAddingParameterAutomationObserver:
     * <p>
     * Add a recording observer for a parameter or all parameters in a group/tree.
     * <p>
     * An audio unit host can use an AUParameterAutomationObserver or AUParameterRecordingObserver
     * to capture a series of changes to a parameter value, including the timing of the events, as
     * generated by a UI gesture in a view, for example.
     * <p>
     * Unlike AUParameterObserver, these callbacks are not throttled.
     * <p>
     * This block is called in an arbitrary thread context. It is responsible for thread-safety.
     * It must not make any calls to add or remove other observers, including itself;
     * this will deadlock.
     * <p>
     * An audio unit's engine should interact with the parameter object via
     * implementorValueObserver and implementorValueProvider.
     *
     * @param observer A block to call to record the changing of a parameter value.
     * @return A token which can be passed to removeParameterObserver: or to -[AUParameter
     * setValue:originator:]
     */
    @Generated
    @Selector("tokenByAddingParameterAutomationObserver:")
    public native VoidPtr tokenByAddingParameterAutomationObserver(
            @ObjCBlock(name = "call_tokenByAddingParameterAutomationObserver") Block_tokenByAddingParameterAutomationObserver observer);

    /**
     * tokenByAddingParameterObserver:
     * <p>
     * Add an observer for a parameter or all parameters in a group/tree.
     * <p>
     * An audio unit view can use an AUParameterObserver to be notified of changes
     * to a single parameter, or to all parameters in a group/tree.
     * <p>
     * These callbacks are throttled so as to limit the rate of redundant notifications
     * in the case of frequent changes to a single parameter.
     * <p>
     * This block is called in an arbitrary thread context. It is responsible for thread-safety.
     * It must not make any calls to add or remove other observers, including itself;
     * this will deadlock.
     * <p>
     * An audio unit's implementation should interact with the parameter object via
     * implementorValueObserver and implementorValueProvider.
     * <p>
     * Parameter observers are bound to a specific parameter instance. If this parameter is
     * destroyed, e.g. if the parameter tree is re-constructed, the previously set parameter
     * observers will no longer be valid. Clients can observe changes to the parameter tree
     * via KVO. See the discussion of -[AUAudioUnit parameterTree].
     *
     * @param observer A block to call after the value of a parameter has changed.
     * @return A token which can be passed to removeParameterObserver: or to -[AUParameter setValue:originator:]
     */
    @Generated
    @Selector("tokenByAddingParameterObserver:")
    public native VoidPtr tokenByAddingParameterObserver(
            @ObjCBlock(name = "call_tokenByAddingParameterObserver") Block_tokenByAddingParameterObserver observer);

    /**
     * tokenByAddingParameterRecordingObserver:
     * <p>
     * Add a recording observer for a parameter or all parameters in a group/tree.
     * <p>
     * This is a variant of tokenByAddingParameterAutomationObserver where the callback receives
     * AURecordedParameterEvents instead of AUParameterAutomationEvents.
     * <p>
     * This will be deprecated in favor of tokenByAddingParameterAutomationObserver in a future
     * release.
     */
    @Generated
    @Selector("tokenByAddingParameterRecordingObserver:")
    public native VoidPtr tokenByAddingParameterRecordingObserver(
            @ObjCBlock(name = "call_tokenByAddingParameterRecordingObserver") Block_tokenByAddingParameterRecordingObserver observer);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorDisplayNameWithLengthCallback_ret {
        @Generated
        String call_implementorDisplayNameWithLengthCallback_ret(AUParameterNode node, @NInt long desiredLength);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorStringFromValueCallback_ret {
        @Generated
        String call_implementorStringFromValueCallback_ret(AUParameter param, ConstFloatPtr value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorValueFromStringCallback_ret {
        @Generated
        float call_implementorValueFromStringCallback_ret(AUParameter param, String string);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorValueObserver_ret {
        @Generated
        void call_implementorValueObserver_ret(AUParameter param, float value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_implementorValueProvider_ret {
        @Generated
        float call_implementorValueProvider_ret(AUParameter param);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorDisplayNameWithLengthCallback {
        @Generated
        String call_setImplementorDisplayNameWithLengthCallback(AUParameterNode node, @NInt long desiredLength);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorStringFromValueCallback {
        @Generated
        String call_setImplementorStringFromValueCallback(AUParameter param, ConstFloatPtr value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorValueFromStringCallback {
        @Generated
        float call_setImplementorValueFromStringCallback(AUParameter param, String string);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorValueObserver {
        @Generated
        void call_setImplementorValueObserver(AUParameter param, float value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImplementorValueProvider {
        @Generated
        float call_setImplementorValueProvider(AUParameter param);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_tokenByAddingParameterAutomationObserver {
        @Generated
        void call_tokenByAddingParameterAutomationObserver(@NInt long numberEvents,
                @UncertainArgument("Options: reference, array Fallback: reference") AUParameterAutomationEvent events);
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
        void call_tokenByAddingParameterRecordingObserver(@NInt long numberEvents, AURecordedParameterEvent events);
    }
}
