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
import apple.intents.protocol.INSpeakable;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INPerson extends NSObject implements NSCopying, NSSecureCoding, INSpeakable {
    static {
        NatJ.register();
    }

    @Generated
    protected INPerson(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INPerson alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INPerson allocWithZone(VoidPtr zone);

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
    public static native INPerson new_objc();

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

    /**
     * If your application has other representations for the person's handle, you can supply it for INInteraction
     * donation
     */
    @Generated
    @Selector("aliases")
    public native NSArray<? extends INPersonHandle> aliases();

    /**
     * Reference to this person, if present in the system's Contacts store
     */
    @Generated
    @Selector("contactIdentifier")
    public native String contactIdentifier();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * This property can be set to the app's identifier for this person
     * It is also used as the vocabulary identifier for this person
     */
    @Generated
    @Selector("customIdentifier")
    public native String customIdentifier();

    /**
     * This will return either the displayName if non-nil, else the formatted nameComponents, else the handle, else an
     * empty string
     */
    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * The identity of the person in the application (e.g. email address, phone number, user handle, etc.)
     * 
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use personHandle instead
     */
    @Deprecated
    @Generated
    @Selector("handle")
    public native String handle();

    @Deprecated
    @IsOptional
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * Returns an image for the person.
     */
    @Generated
    @Selector("image")
    public native INImage image();

    @Generated
    @Selector("init")
    public native INPerson init();

    @Generated
    @Selector("initWithCoder:")
    public native INPerson initWithCoder(NSCoder coder);

    /**
     * Use this convenience initializer if the person's name is unknown
     * 
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithHandle:displayName:contactIdentifier:")
    public native INPerson initWithHandleDisplayNameContactIdentifier(String handle, String displayName,
            String contactIdentifier);

    /**
     * This is the preferred convenience initializer if the app knows the name components of the person (e.g. given
     * name, family name, etc).
     * 
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithHandle:nameComponents:contactIdentifier:")
    public native INPerson initWithHandleNameComponentsContactIdentifier(String handle,
            NSPersonNameComponents nameComponents, String contactIdentifier);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithHandle:nameComponents:displayName:image:contactIdentifier:")
    public native INPerson initWithHandleNameComponentsDisplayNameImageContactIdentifier(String handle,
            NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifier(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:aliases:suggestionType:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierAliasesSuggestionType(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier, NSArray<? extends INPersonHandle> aliases,
            @NInt long suggestionType);

    /**
     * Returns the person's name components if this was initialized with them
     */
    @Generated
    @Selector("nameComponents")
    public native NSPersonNameComponents nameComponents();

    /**
     * The identity of the person in the application
     */
    @Generated
    @Selector("personHandle")
    public native INPersonHandle personHandle();

    @Generated
    @Selector("pronunciationHint")
    public native String pronunciationHint();

    /**
     * This person's relationship to the user
     * 
     * API-Since: 10.2
     */
    @Generated
    @Selector("relationship")
    public native String relationship();

    @Generated
    @Selector("spokenPhrase")
    public native String spokenPhrase();

    /**
     * What Contact property this INInteraction donation should be suggested as when this person is matched to a contact
     * in the system's Contacts store.
     */
    @Generated
    @Selector("suggestionType")
    @NInt
    public native long suggestionType();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("alternativeSpeakableMatches")
    public native NSArray<?> alternativeSpeakableMatches();

    /**
     * This property is set to YES when the user says things like "Search for messages from me", etc.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isMe")
    public native boolean isMe();

    /**
     * This property is filled in with what Siri thinks are close matches to what the user said
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("siriMatches")
    public native NSArray<? extends INPerson> siriMatches();

    @Generated
    @Selector("vocabularyIdentifier")
    public native String vocabularyIdentifier();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsMe(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier, boolean isMe);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:relationship:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierRelationship(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier, String relationship);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isContactSuggestion:suggestionType:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsContactSuggestionSuggestionType(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier, boolean isContactSuggestion, @NInt long suggestionType);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:suggestionType:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsMeSuggestionType(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier, boolean isMe, @NInt long suggestionType);

    /**
     * Indicates that the person is confirmed
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isContactSuggestion")
    public native boolean isContactSuggestion();
}
