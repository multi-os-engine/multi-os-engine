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
import apple.usernotifications.protocol.UNNotificationContentProviding;
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
public class INSendMessageIntent extends INIntent implements UNNotificationContentProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected INSendMessageIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INSendMessageIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INSendMessageIntent allocWithZone(VoidPtr zone);

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
    public static native INSendMessageIntent new_objc();

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
     * Body text of the message.
     */
    @Nullable
    @Generated
    @Selector("content")
    public native String content();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use speakableGroupNames instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("groupName")
    public native String groupName();

    @Generated
    @Selector("init")
    public native INSendMessageIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INSendMessageIntent initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithRecipients:content:groupName:serviceName:sender:")
    public native INSendMessageIntent initWithRecipientsContentGroupNameServiceNameSender(
            @Nullable NSArray<? extends INPerson> recipients, @Nullable String content, @Nullable String groupName,
            @Nullable String serviceName, @Nullable INPerson sender);

    /**
     * Contacts to whom the message should be sent.
     */
    @Nullable
    @Generated
    @Selector("recipients")
    public native NSArray<? extends INPerson> recipients();

    /**
     * The person, or account, sending the message.
     */
    @Nullable
    @Generated
    @Selector("sender")
    public native INPerson sender();

    /**
     * Specified service for the message.
     */
    @Nullable
    @Generated
    @Selector("serviceName")
    public native String serviceName();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("conversationIdentifier")
    public native String conversationIdentifier();

    /**
     * API-Since: 11.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use the designated initializer with outgoingMessageType instead
     */
    @Deprecated
    @Generated
    @Selector("initWithRecipients:content:speakableGroupName:conversationIdentifier:serviceName:sender:")
    public native INSendMessageIntent initWithRecipientsContentSpeakableGroupNameConversationIdentifierServiceNameSender(
            @Nullable NSArray<? extends INPerson> recipients, @Nullable String content,
            @Nullable INSpeakableString speakableGroupName, @Nullable String conversationIdentifier,
            @Nullable String serviceName, @Nullable INPerson sender);

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("speakableGroupName")
    public native INSpeakableString speakableGroupName();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("attachments")
    public native NSArray<? extends INSendMessageAttachment> attachments();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use the designated initializer with attachments instead instead
     */
    @Deprecated
    @Generated
    @Selector("initWithRecipients:outgoingMessageType:content:speakableGroupName:conversationIdentifier:serviceName:sender:")
    public native INSendMessageIntent initWithRecipientsOutgoingMessageTypeContentSpeakableGroupNameConversationIdentifierServiceNameSender(
            @Nullable NSArray<? extends INPerson> recipients, @NInt long outgoingMessageType, @Nullable String content,
            @Nullable INSpeakableString speakableGroupName, @Nullable String conversationIdentifier,
            @Nullable String serviceName, @Nullable INPerson sender);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithRecipients:outgoingMessageType:content:speakableGroupName:conversationIdentifier:serviceName:sender:attachments:")
    public native INSendMessageIntent initWithRecipientsOutgoingMessageTypeContentSpeakableGroupNameConversationIdentifierServiceNameSenderAttachments(
            @Nullable NSArray<? extends INPerson> recipients, @NInt long outgoingMessageType, @Nullable String content,
            @Nullable INSpeakableString speakableGroupName, @Nullable String conversationIdentifier,
            @Nullable String serviceName, @Nullable INPerson sender,
            @Nullable NSArray<? extends INSendMessageAttachment> attachments);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("outgoingMessageType")
    @NInt
    public native long outgoingMessageType();
}
