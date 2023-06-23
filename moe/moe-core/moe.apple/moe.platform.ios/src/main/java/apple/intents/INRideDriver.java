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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
public class INRideDriver extends INPerson implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INRideDriver(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRideDriver alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INRideDriver allocWithZone(VoidPtr zone);

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
    public static native INRideDriver new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native INRideDriver init();

    @Generated
    @Selector("initWithCoder:")
    public native INRideDriver initWithCoder(@NotNull NSCoder coder);

    @Deprecated
    @Generated
    @Selector("initWithHandle:displayName:contactIdentifier:")
    public native INRideDriver initWithHandleDisplayNameContactIdentifier(@NotNull String handle,
            @Nullable String displayName, @Nullable String contactIdentifier);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithHandle:displayName:image:rating:phoneNumber:")
    public native INRideDriver initWithHandleDisplayNameImageRatingPhoneNumber(@NotNull String handle,
            @Nullable String displayName, @Nullable INImage image, @Nullable String rating,
            @Nullable String phoneNumber);

    @Deprecated
    @Generated
    @Selector("initWithHandle:nameComponents:contactIdentifier:")
    public native INRideDriver initWithHandleNameComponentsContactIdentifier(@NotNull String handle,
            @NotNull NSPersonNameComponents nameComponents, @Nullable String contactIdentifier);

    @Deprecated
    @Generated
    @Selector("initWithHandle:nameComponents:displayName:image:contactIdentifier:")
    public native INRideDriver initWithHandleNameComponentsDisplayNameImageContactIdentifier(@NotNull String handle,
            @Nullable NSPersonNameComponents nameComponents, @Nullable String displayName, @Nullable INImage image,
            @Nullable String contactIdentifier);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithHandle:nameComponents:image:rating:phoneNumber:")
    public native INRideDriver initWithHandleNameComponentsImageRatingPhoneNumber(@NotNull String handle,
            @NotNull NSPersonNameComponents nameComponents, @Nullable INImage image, @Nullable String rating,
            @Nullable String phoneNumber);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:")
    public native INRideDriver initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifier(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:aliases:suggestionType:")
    public native INRideDriver initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierAliasesSuggestionType(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, @Nullable NSArray<? extends INPersonHandle> aliases,
            @NInt long suggestionType);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 10.2
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:rating:phoneNumber:")
    public native INRideDriver initWithPersonHandleNameComponentsDisplayNameImageRatingPhoneNumber(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String rating,
            @Nullable String phoneNumber);

    /**
     * API-Since: 10.2
     */
    @Generated
    @Selector("initWithPhoneNumber:nameComponents:displayName:image:rating:")
    public native INRideDriver initWithPhoneNumberNameComponentsDisplayNameImageRating(@NotNull String phoneNumber,
            @Nullable NSPersonNameComponents nameComponents, @Nullable String displayName, @Nullable INImage image,
            @Nullable String rating);

    @Nullable
    @Generated
    @Selector("phoneNumber")
    public native String phoneNumber();

    @Nullable
    @Generated
    @Selector("rating")
    public native String rating();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:")
    public native INRideDriver initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsMe(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, boolean isMe);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:relationship:")
    public native INRideDriver initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierRelationship(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, @Nullable String relationship);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isContactSuggestion:suggestionType:")
    public native INRideDriver initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsContactSuggestionSuggestionType(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, boolean isContactSuggestion, @NInt long suggestionType);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:suggestionType:")
    public native INRideDriver initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsMeSuggestionType(
            @NotNull INPersonHandle personHandle, @Nullable NSPersonNameComponents nameComponents,
            @Nullable String displayName, @Nullable INImage image, @Nullable String contactIdentifier,
            @Nullable String customIdentifier, boolean isMe, @NInt long suggestionType);
}
