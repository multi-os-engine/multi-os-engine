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
import org.moe.natj.general.ann.MappedReturn;
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
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("displayNameWithLength:")
    public native String displayNameWithLength(@NInt long maximumLength);

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("implementorDisplayNameWithLengthCallback")
    @ObjCBlock(name = "call_implementorDisplayNameWithLengthCallback_ret")
    public native Block_implementorDisplayNameWithLengthCallback_ret implementorDisplayNameWithLengthCallback();

    @Generated
    @Selector("implementorStringFromValueCallback")
    @ObjCBlock(name = "call_implementorStringFromValueCallback_ret")
    public native Block_implementorStringFromValueCallback_ret implementorStringFromValueCallback();

    @Generated
    @Selector("implementorValueFromStringCallback")
    @ObjCBlock(name = "call_implementorValueFromStringCallback_ret")
    public native Block_implementorValueFromStringCallback_ret implementorValueFromStringCallback();

    @Generated
    @Selector("implementorValueObserver")
    @ObjCBlock(name = "call_implementorValueObserver_ret")
    public native Block_implementorValueObserver_ret implementorValueObserver();

    @Generated
    @Selector("implementorValueProvider")
    @ObjCBlock(name = "call_implementorValueProvider_ret")
    public native Block_implementorValueProvider_ret implementorValueProvider();

    @Generated
    @Selector("init")
    public native AUParameterNode init();

    @Generated
    @Selector("keyPath")
    public native String keyPath();

    @Generated
    @Selector("removeParameterObserver:")
    public native void removeParameterObserver(VoidPtr token);

    @Generated
    @Selector("setImplementorDisplayNameWithLengthCallback:")
    public native void setImplementorDisplayNameWithLengthCallback(
            @ObjCBlock(name = "call_setImplementorDisplayNameWithLengthCallback") Block_setImplementorDisplayNameWithLengthCallback value);

    @Generated
    @Selector("setImplementorStringFromValueCallback:")
    public native void setImplementorStringFromValueCallback(
            @ObjCBlock(name = "call_setImplementorStringFromValueCallback") Block_setImplementorStringFromValueCallback value);

    @Generated
    @Selector("setImplementorValueFromStringCallback:")
    public native void setImplementorValueFromStringCallback(
            @ObjCBlock(name = "call_setImplementorValueFromStringCallback") Block_setImplementorValueFromStringCallback value);

    @Generated
    @Selector("setImplementorValueObserver:")
    public native void setImplementorValueObserver(
            @ObjCBlock(name = "call_setImplementorValueObserver") Block_setImplementorValueObserver value);

    @Generated
    @Selector("setImplementorValueProvider:")
    public native void setImplementorValueProvider(
            @ObjCBlock(name = "call_setImplementorValueProvider") Block_setImplementorValueProvider value);

    @Generated
    @Selector("tokenByAddingParameterAutomationObserver:")
    public native VoidPtr tokenByAddingParameterAutomationObserver(
            @ObjCBlock(name = "call_tokenByAddingParameterAutomationObserver") Block_tokenByAddingParameterAutomationObserver observer);

    @Generated
    @Selector("tokenByAddingParameterObserver:")
    public native VoidPtr tokenByAddingParameterObserver(
            @ObjCBlock(name = "call_tokenByAddingParameterObserver") Block_tokenByAddingParameterObserver observer);

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
