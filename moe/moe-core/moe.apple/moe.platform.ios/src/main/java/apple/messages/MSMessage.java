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

package apple.messages;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUUID;
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

/**
 * MSMessage
 * <p>
 * The MSMessage encapsulates the data to be transferred to remote devices.
 */
@Generated
@Library("Messages")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MSMessage extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MSMessage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MSMessage alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]   URL
     * <p>
     * A HTTP(S) or data URL used to encode data to be transferred in message.
     * <p>
     * This URL should encode any data that is to be delivered to the extension running
     * on the recipient's device(s). When no app exists on the receiving device that
     * can consume the message, if this URL is a HTTP(S) url, it will be loaded in a web browser.
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * [@property]   accessibilityLabel
     * <p>
     * A localized string describing the message.
     * <p>
     * This string should provide a succinct description of the message. This
     * will be used by the Accessibility Speech feature when speaking the message for users
     * with disabilities.
     */
    @Generated
    @Selector("accessibilityLabel")
    public native String accessibilityLabel();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property]   error
     * <p>
     * An error object that indicates why a message failed to send.
     * <p>
     * This value is nil if the message is has not yet been sent, is still
     * sending or has been sent successfully.
     */
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * init
     * <p>
     * Initializes a new message that is not part of a session.
     */
    @Generated
    @Selector("init")
    public native MSMessage init();

    @Generated
    @Selector("initWithCoder:")
    public native MSMessage initWithCoder(NSCoder coder);

    /**
     * initWithSession:
     * <p>
     * Initializes a message with a session.
     * <p>
     * A message initialized with a session will be updated
     * and moved to the bottom of the conversation transcript when another message created
     * with the same session is sent.
     *
     * @param session The session that new message will join.
     * @see insertMessage:completionHandler:
     */
    @Generated
    @Selector("initWithSession:")
    public native MSMessage initWithSession(MSSession session);

    /**
     * [@property]   layout
     * <p>
     * A subclass of MSMessageLayout.
     * <p>
     * The MSMessageLayout subclass will be used to construct UI
     * representing the message in the conversation transcript.
     */
    @Generated
    @Selector("layout")
    public native MSMessageLayout layout();

    /**
     * [@property]   senderParticipantIdentifier
     * <p>
     * A NSUUID instance that identifies the participant that sent the message.
     * <p>
     * This NSUUID identifies the message's sender. This value is scoped to
     * the current device and will be different on all devices that participate in the
     * conversation.
     */
    @Generated
    @Selector("senderParticipantIdentifier")
    public native NSUUID senderParticipantIdentifier();

    /**
     * [@property]   session
     * <p>
     * An MSSession that identifies the session that message belongs to.
     */
    @Generated
    @Selector("session")
    public native MSSession session();

    /**
     * [@property]   accessibilityLabel
     * <p>
     * A localized string describing the message.
     * <p>
     * This string should provide a succinct description of the message. This
     * will be used by the Accessibility Speech feature when speaking the message for users
     * with disabilities.
     */
    @Generated
    @Selector("setAccessibilityLabel:")
    public native void setAccessibilityLabel(String value);

    /**
     * [@property]   error
     * <p>
     * An error object that indicates why a message failed to send.
     * <p>
     * This value is nil if the message is has not yet been sent, is still
     * sending or has been sent successfully.
     */
    @Generated
    @Selector("setError:")
    public native void setError(NSError value);

    /**
     * [@property]   layout
     * <p>
     * A subclass of MSMessageLayout.
     * <p>
     * The MSMessageLayout subclass will be used to construct UI
     * representing the message in the conversation transcript.
     */
    @Generated
    @Selector("setLayout:")
    public native void setLayout(MSMessageLayout value);

    /**
     * [@property]   shouldExpire
     * <p>
     * A Boolean value that indicates whether the messages should expire after being read.
     * <p>
     * YES if the message should expire after it is read. Expired messages will
     * be deleted a short time after being read by the receiver. The user may opt to keep the message.
     * This property defaults to NO.
     */
    @Generated
    @Selector("setShouldExpire:")
    public native void setShouldExpire(boolean value);

    /**
     * [@property]   summaryText
     * <p>
     * A localized string describing the message.
     * <p>
     * This string should provide a succinct description of the message. This
     * will be used to provide a summary of the message in the UI.
     */
    @Generated
    @Selector("setSummaryText:")
    public native void setSummaryText(String value);

    /**
     * [@property]   URL
     * <p>
     * A HTTP(S) or data URL used to encode data to be transferred in message.
     * <p>
     * This URL should encode any data that is to be delivered to the extension running
     * on the recipient's device(s). When no app exists on the receiving device that
     * can consume the message, if this URL is a HTTP(S) url, it will be loaded in a web browser.
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    /**
     * [@property]   shouldExpire
     * <p>
     * A Boolean value that indicates whether the messages should expire after being read.
     * <p>
     * YES if the message should expire after it is read. Expired messages will
     * be deleted a short time after being read by the receiver. The user may opt to keep the message.
     * This property defaults to NO.
     */
    @Generated
    @Selector("shouldExpire")
    public native boolean shouldExpire();

    /**
     * [@property]   summaryText
     * <p>
     * A localized string describing the message.
     * <p>
     * This string should provide a succinct description of the message. This
     * will be used to provide a summary of the message in the UI.
     */
    @Generated
    @Selector("summaryText")
    public native String summaryText();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property]   pending
     * <p>
     * A BOOL representing whether the message is a pending message or is a message that has been sent/received.
     * <p>
     * This value starts as `YES` when creating an `MSMessage` for sending. After calling `-[MSConversation insertMessage:completionHandler:]`, `isPending` still returns `YES` until `-[MSMessagesAppViewController didStartSendingMessage:conversation]` is called. This property is useful for knowing if the `selectedMessage` of `-[MSMessagesAppViewController activeConversation]` represents an unsent message.
     */
    @Generated
    @Selector("isPending")
    public native boolean isPending();
}
