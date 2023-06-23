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

package apple.intents;

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
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INMessageAttributeResolutionResult extends INIntentResolutionResult {
    static {
        NatJ.register();
    }

    @Generated
    protected INMessageAttributeResolutionResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INMessageAttributeResolutionResult alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INMessageAttributeResolutionResult allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("confirmationRequiredWithValueToConfirm:")
    public static native INMessageAttributeResolutionResult confirmationRequiredWithValueToConfirm(
            @NInt long valueToConfirm);

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

    @NotNull
    @Generated
    @Selector("needsValue")
    public static native INMessageAttributeResolutionResult needsValue();

    @Generated
    @Owned
    @Selector("new")
    public static native INMessageAttributeResolutionResult new_objc();

    @NotNull
    @Generated
    @Selector("notRequired")
    public static native INMessageAttributeResolutionResult notRequired();

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
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("successWithResolvedValue:")
    public static native INMessageAttributeResolutionResult successWithResolvedValue(@NInt long resolvedValue);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("unsupported")
    public static native INMessageAttributeResolutionResult unsupported();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native INMessageAttributeResolutionResult init();

    /**
     * This resolution result is to ask Siri to confirm if this is the value with which the user wants to continue.
     */
    @NotNull
    @Generated
    @Selector("confirmationRequiredWithMessageAttributeToConfirm:")
    public static native INMessageAttributeResolutionResult confirmationRequiredWithMessageAttributeToConfirm(
            @NInt long messageAttributeToConfirm);

    /**
     * This resolution result is for when the app extension wants to tell Siri to proceed, with a given
     * INMessageAttribute. The resolvedValue can be different than the original INMessageAttribute. This allows app
     * extensions to apply business logic constraints.
     * Use +notRequired to continue with a 'nil' value.
     */
    @NotNull
    @Generated
    @Selector("successWithResolvedMessageAttribute:")
    public static native INMessageAttributeResolutionResult successWithResolvedMessageAttribute(
            @NInt long resolvedMessageAttribute);

    @NotNull
    @Generated
    @Selector("confirmationRequiredWithItemToConfirm:forReason:")
    public static native INMessageAttributeResolutionResult confirmationRequiredWithItemToConfirmForReason(
            @NotNull @Mapped(ObjCObjectMapper.class) Object itemToConfirm, @NInt long reason);

    @NotNull
    @Generated
    @Selector("unsupportedWithReason:")
    public static native INMessageAttributeResolutionResult unsupportedWithReason(@NInt long reason);
}
