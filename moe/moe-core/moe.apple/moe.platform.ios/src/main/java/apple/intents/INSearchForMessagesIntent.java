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
public class INSearchForMessagesIntent extends INIntent {
    static {
        NatJ.register();
    }

    @Generated
    protected INSearchForMessagesIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INSearchForMessagesIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INSearchForMessagesIntent allocWithZone(VoidPtr zone);

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
    public static native INSearchForMessagesIntent new_objc();

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
     * Attributes of the message to be found.
     */
    @Generated
    @Selector("attributes")
    @NUInt
    public native long attributes();

    /**
     * Time range in which to search for the message.
     */
    @Nullable
    @Generated
    @Selector("dateTimeRange")
    public native INDateComponentsRange dateTimeRange();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use speakableGroupNames instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("groupNames")
    public native NSArray<String> groupNames();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use speakableGroupNamesOperator instead
     */
    @Deprecated
    @Generated
    @Selector("groupNamesOperator")
    @NInt
    public native long groupNamesOperator();

    /**
     * If available, the identifier of a particular message to be found.
     */
    @Nullable
    @Generated
    @Selector("identifiers")
    public native NSArray<String> identifiers();

    /**
     * Describes how to combine the contents of the identifier array.
     */
    @Generated
    @Selector("identifiersOperator")
    @NInt
    public native long identifiersOperator();

    @Generated
    @Selector("init")
    public native INSearchForMessagesIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INSearchForMessagesIntent initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:groupNames:")
    public native INSearchForMessagesIntent initWithRecipientsSendersSearchTermsAttributesDateTimeRangeIdentifiersNotificationIdentifiersGroupNames(
            @Nullable NSArray<? extends INPerson> recipients, @Nullable NSArray<? extends INPerson> senders,
            @Nullable NSArray<String> searchTerms, @NUInt long attributes,
            @Nullable INDateComponentsRange dateTimeRange, @Nullable NSArray<String> identifiers,
            @Nullable NSArray<String> notificationIdentifiers, @Nullable NSArray<String> groupNames);

    @Nullable
    @Generated
    @Selector("notificationIdentifiers")
    public native NSArray<String> notificationIdentifiers();

    /**
     * Describes how to combine the contents of the notificationIdentifier array.
     */
    @Generated
    @Selector("notificationIdentifiersOperator")
    @NInt
    public native long notificationIdentifiersOperator();

    /**
     * Contact that received the messages to be found.
     */
    @Nullable
    @Generated
    @Selector("recipients")
    public native NSArray<? extends INPerson> recipients();

    /**
     * Describes how to combine the contents of the recipient array.
     */
    @Generated
    @Selector("recipientsOperator")
    @NInt
    public native long recipientsOperator();

    @Nullable
    @Generated
    @Selector("searchTerms")
    public native NSArray<String> searchTerms();

    /**
     * Describes how to combine the contents of the searchTerm array.
     */
    @Generated
    @Selector("searchTermsOperator")
    @NInt
    public native long searchTermsOperator();

    /**
     * Sender of the messages to be found.
     */
    @Nullable
    @Generated
    @Selector("senders")
    public native NSArray<? extends INPerson> senders();

    /**
     * Describes how to combine the contents of the sender array.
     */
    @Generated
    @Selector("sendersOperator")
    @NInt
    public native long sendersOperator();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 11.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:speakableGroupNames:")
    public native INSearchForMessagesIntent initWithRecipientsSendersSearchTermsAttributesDateTimeRangeIdentifiersNotificationIdentifiersSpeakableGroupNames(
            @Nullable NSArray<? extends INPerson> recipients, @Nullable NSArray<? extends INPerson> senders,
            @Nullable NSArray<String> searchTerms, @NUInt long attributes,
            @Nullable INDateComponentsRange dateTimeRange, @Nullable NSArray<String> identifiers,
            @Nullable NSArray<String> notificationIdentifiers,
            @Nullable NSArray<? extends INSpeakableString> speakableGroupNames);

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("speakableGroupNames")
    public native NSArray<? extends INSpeakableString> speakableGroupNames();

    /**
     * Describes how to combine the contents of the speakableGroupName array.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("speakableGroupNamesOperator")
    @NInt
    public native long speakableGroupNamesOperator();

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("conversationIdentifiers")
    public native NSArray<String> conversationIdentifiers();

    /**
     * Describes how to combine the contents of the conversationIdentifier array.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("conversationIdentifiersOperator")
    @NInt
    public native long conversationIdentifiersOperator();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:speakableGroupNames:conversationIdentifiers:")
    public native INSearchForMessagesIntent initWithRecipientsSendersSearchTermsAttributesDateTimeRangeIdentifiersNotificationIdentifiersSpeakableGroupNamesConversationIdentifiers(
            @Nullable NSArray<? extends INPerson> recipients, @Nullable NSArray<? extends INPerson> senders,
            @Nullable NSArray<String> searchTerms, @NUInt long attributes,
            @Nullable INDateComponentsRange dateTimeRange, @Nullable NSArray<String> identifiers,
            @Nullable NSArray<String> notificationIdentifiers,
            @Nullable NSArray<? extends INSpeakableString> speakableGroupNames,
            @Nullable NSArray<String> conversationIdentifiers);
}
