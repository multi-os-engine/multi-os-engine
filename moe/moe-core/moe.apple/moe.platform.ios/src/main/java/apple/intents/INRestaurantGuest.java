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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPersonNameComponents;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
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
public class INRestaurantGuest extends INPerson {
    static {
        NatJ.register();
    }

    @Generated
    protected INRestaurantGuest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRestaurantGuest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INRestaurantGuest allocWithZone(VoidPtr zone);

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
    public static native INRestaurantGuest new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("emailAddress")
    public native String emailAddress();

    @Generated
    @Selector("init")
    public native INRestaurantGuest init();

    @Generated
    @Selector("initWithCoder:")
    public native INRestaurantGuest initWithCoder(@NotNull NSCoder coder);

    @Deprecated
    @Generated
    @Selector("initWithHandle:displayName:contactIdentifier:")
    public native INRestaurantGuest initWithHandleDisplayNameContactIdentifier(@NotNull String handle,
            @Nullable String displayName, @Nullable String contactIdentifier);

    @Deprecated
    @Generated
    @Selector("initWithHandle:nameComponents:contactIdentifier:")
    public native INRestaurantGuest initWithHandleNameComponentsContactIdentifier(@NotNull String handle,
            @NotNull NSPersonNameComponents nameComponents, @Nullable String contactIdentifier);

    @Deprecated
    @Generated
    @Selector("initWithHandle:nameComponents:displayName:image:contactIdentifier:")
    public native INRestaurantGuest initWithHandleNameComponentsDisplayNameImageContactIdentifier(
            @NotNull String handle, @Nullable NSPersonNameComponents nameComponents, @Nullable String displayName,
            @Nullable INImage image, @Nullable String contactIdentifier);

    @Generated
    @Selector("initWithNameComponents:phoneNumber:emailAddress:")
    public native INRestaurantGuest initWithNameComponentsPhoneNumberEmailAddress(
            @Nullable NSPersonNameComponents nameComponents, @Nullable String phoneNumber,
            @Nullable String emailAddress);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:")
    public native INRestaurantGuest initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifier(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:aliases:suggestionType:")
    public native INRestaurantGuest initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierAliasesSuggestionType(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, @Nullable NSArray<? extends INPersonHandle> aliases,
            @NInt long suggestionType);

    @Nullable
    @Generated
    @Selector("phoneNumber")
    public native String phoneNumber();

    @Generated
    @Selector("setEmailAddress:")
    public native void setEmailAddress(@Nullable String value);

    @Generated
    @Selector("setPhoneNumber:")
    public native void setPhoneNumber(@Nullable String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:")
    public native INRestaurantGuest initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsMe(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, boolean isMe);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:relationship:")
    public native INRestaurantGuest initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierRelationship(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, @Nullable String relationship);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isContactSuggestion:suggestionType:")
    public native INRestaurantGuest initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsContactSuggestionSuggestionType(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, boolean isContactSuggestion, @NInt long suggestionType);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:suggestionType:")
    public native INRestaurantGuest initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsMeSuggestionType(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, boolean isMe, @NInt long suggestionType);
}
