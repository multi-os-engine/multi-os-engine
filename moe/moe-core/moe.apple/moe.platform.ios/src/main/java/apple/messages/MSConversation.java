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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUUID;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Messages")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MSConversation extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MSConversation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MSConversation alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MSConversation allocWithZone(VoidPtr zone);

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
    public static native MSConversation new_objc();

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
    @Selector("init")
    public native MSConversation init();

    /**
     * insertAttachment:withAlternateFilename:completionHandler:
     * <p>
     * The NSURL instance provided in the URL parameter is inserted into the Messages.app
     * input field. This must be a file URL.
     * <p>
     * Calling this method when the presentation context is `MSMessagesAppPresentationContextMedia` will result in the completion handler getting called with an error object whose error code is `MSMessageErrorCodeAPIUnavailableInPresentationContext` if the attachment type is not an image type supported by `MSSticker`.
     *
     * @param URL               The URL to the media file to be inserted.
     * @param filename          If you supply a string here, the message UI uses it for the attachment. Use an alternate filename to better describe the attachment or to make the name more readable.
     * @param completionHandler A completion handler called when the insert is complete.
     */
    @Generated
    @Selector("insertAttachment:withAlternateFilename:completionHandler:")
    public native void insertAttachmentWithAlternateFilenameCompletionHandler(NSURL URL, String filename,
            @ObjCBlock(name = "call_insertAttachmentWithAlternateFilenameCompletionHandler") Block_insertAttachmentWithAlternateFilenameCompletionHandler completionHandler);

    /**
     * insertMessage:completionHandler:
     * <p>
     * Stages the provided MSMessage object for sending.
     * <p>
     * This method inserts a MSMessage object into the Messages input field,
     * Subsequent calls to this method will replace any existing message on the input field.
     * If the message was successfully inserted on the input field, the completion handler
     * will be called with a nil error parameter otherwise the error parameter will be
     * populated with an NSError object describing the failure.
     * Calling this method when the presentation context is `MSMessagesAppPresentationContextMedia` will result in the completion handler getting called with an error object whose error code is `MSMessageErrorCodeAPIUnavailableInPresentationContext`.
     *
     * @param message           The MSMessage instance describing the message to be sent.
     * @param completionHandler A completion handler called when the message has been staged or if there was an error.
     */
    @Generated
    @Selector("insertMessage:completionHandler:")
    public native void insertMessageCompletionHandler(MSMessage message,
            @ObjCBlock(name = "call_insertMessageCompletionHandler") Block_insertMessageCompletionHandler completionHandler);

    /**
     * insertSticker:completionHandler:
     * <p>
     * The sticker is inserted into the Messages.app input field.
     *
     * @param sticker           The sticker to be inserted.
     * @param completionHandler A completion handler called when the insert is complete.
     */
    @Generated
    @Selector("insertSticker:completionHandler:")
    public native void insertStickerCompletionHandler(MSSticker sticker,
            @ObjCBlock(name = "call_insertStickerCompletionHandler") Block_insertStickerCompletionHandler completionHandler);

    /**
     * insertText:completionHandler:
     * <p>
     * The NSString instance provided in the text parameter is inserted into the Messages.app input field.
     * <p>
     * Calling this method when the presentation context is `MSMessagesAppPresentationContextMedia` will result in the completion handler getting called with an error object whose error code is `MSMessageErrorCodeAPIUnavailableInPresentationContext`.
     *
     * @param text              The text to be inserted.
     * @param completionHandler A completion handler called when the insert is complete.
     */
    @Generated
    @Selector("insertText:completionHandler:")
    public native void insertTextCompletionHandler(String text,
            @ObjCBlock(name = "call_insertTextCompletionHandler") Block_insertTextCompletionHandler completionHandler);

    /**
     * [@property]   localParticipantIdentifier
     * <p>
     * A NSUUID that identifies conversation participant on this device.
     * <p>
     * This NSUUID  that identifies conversation participant on this device,
     * this value will be stable while the extension is enabled. If the extension is
     * disabled and re-enabled or the containing App is removed and re-installed this
     * value will change.
     */
    @Generated
    @Selector("localParticipantIdentifier")
    public native NSUUID localParticipantIdentifier();

    /**
     * [@property]   remoteParticipantIdentifiers
     * <p>
     * A NSArray of NSUUID instances, each uniquely identifies a remote participant in the conversation.
     * <p>
     * Each NSUUID identifies the a remote participant in the conversation scoped to
     * this device. These values will be stable while the extension is enabled. If the extension
     * is disabled and re-enabled or the containing App is removed and re-installed these
     * values will change.
     */
    @Generated
    @Selector("remoteParticipantIdentifiers")
    public native NSArray<? extends NSUUID> remoteParticipantIdentifiers();

    /**
     * [@property]   selectedMessage
     * <p>
     * An MSMessage instance that may be edited and returned to Messages
     * <p>
     * If the extension has been invoked in response to the user interacting with
     * a message in the conversation transcript this property will contain the message.
     * Otherwise this property will be nil. The message object provided may be saved to the
     * file system. Later, this saved object may be loaded, modified and staged for sending.
     */
    @Generated
    @Selector("selectedMessage")
    public native MSMessage selectedMessage();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_insertAttachmentWithAlternateFilenameCompletionHandler {
        @Generated
        void call_insertAttachmentWithAlternateFilenameCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_insertMessageCompletionHandler {
        @Generated
        void call_insertMessageCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_insertStickerCompletionHandler {
        @Generated
        void call_insertStickerCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_insertTextCompletionHandler {
        @Generated
        void call_insertTextCompletionHandler(NSError error);
    }

    /**
     * sendAttachment:withAlternateFilename:completionHandler:
     * <p>
     * Start sending a file located at the provided URL. This must be a file URL.
     * <p>
     * This method begins sending the file at the provided file URL. The app must be visible and have had a recent touch interaction since either last launch or last send to succeed. If the message started sending successfully, the completion handler will be called with a nil error parameter. Otherwise the error parameter will be populated with an NSError object describing the failure.
     * Calling this method when the presentation context is `MSMessagesAppPresentationContextMedia` will result in the completion handler getting called with an error object whose error code is `MSMessageErrorCodeAPIUnavailableInPresentationContext`.
     *
     * @param URL               The URL to the media file to be inserted.
     * @param filename          If you supply a string here, the message UI uses it for the attachment. Use an alternate filename to better describe the attachment or to make the name more readable.
     * @param completionHandler A completion handler called when the insert is complete.
     */
    @Generated
    @Selector("sendAttachment:withAlternateFilename:completionHandler:")
    public native void sendAttachmentWithAlternateFilenameCompletionHandler(NSURL URL, String filename,
            @ObjCBlock(name = "call_sendAttachmentWithAlternateFilenameCompletionHandler") Block_sendAttachmentWithAlternateFilenameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendAttachmentWithAlternateFilenameCompletionHandler {
        @Generated
        void call_sendAttachmentWithAlternateFilenameCompletionHandler(NSError error);
    }

    /**
     * sendMessage:completionHandler:
     * <p>
     * Start sending a message
     * <p>
     * This method begins sending the provided MSMessage. The app must be visible and have had a recent touch interaction since either last launch or last send to succeed. If the message started sending successfully, the completion handler will be called with a nil error parameter. Otherwise the error parameter will be populated with an NSError object describing the failure.
     * Calling this method when the presentation context is `MSMessagesAppPresentationContextMedia` will result in the completion handler getting called with an error object whose error code is `MSMessageErrorCodeAPIUnavailableInPresentationContext`.
     *
     * @param message           The MSMessage instance describing the message to be sent.
     * @param completionHandler A completion handler called when the message has been staged or if there was an error.
     */
    @Generated
    @Selector("sendMessage:completionHandler:")
    public native void sendMessageCompletionHandler(MSMessage message,
            @ObjCBlock(name = "call_sendMessageCompletionHandler") Block_sendMessageCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageCompletionHandler {
        @Generated
        void call_sendMessageCompletionHandler(NSError error);
    }

    /**
     * sendSticker:completionHandler:
     * <p>
     * Start sending a sticker
     * <p>
     * Calling this method when the presentation context is `MSMessagesAppPresentationContextMedia` will result in the completion handler getting called with an error object whose error code is `MSMessageErrorCodeAPIUnavailableInPresentationContext`.
     *
     * @param sticker           The sticker to be inserted.
     * @param completionHandler A completion handler called when the insert is complete.
     */
    @Generated
    @Selector("sendSticker:completionHandler:")
    public native void sendStickerCompletionHandler(MSSticker sticker,
            @ObjCBlock(name = "call_sendStickerCompletionHandler") Block_sendStickerCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendStickerCompletionHandler {
        @Generated
        void call_sendStickerCompletionHandler(NSError error);
    }

    /**
     * sendText:completionHandler:
     * <p>
     * Start sending text
     * <p>
     * This method begins sending the provided NSString. The app must be visible and have had a recent touch interaction since either last launch or last send to succeed. If the message started sending successfully, the completion handler will be called with a nil error parameter. Otherwise the error parameter will be populated with an NSError object describing the failure.
     * Calling this method when the presentation context is `MSMessagesAppPresentationContextMedia` will result in the completion handler getting called with an error object whose error code is `MSMessageErrorCodeAPIUnavailableInPresentationContext`.
     *
     * @param text              The text to be inserted.
     * @param completionHandler A completion handler called when the insert is complete.
     */
    @Generated
    @Selector("sendText:completionHandler:")
    public native void sendTextCompletionHandler(String text,
            @ObjCBlock(name = "call_sendTextCompletionHandler") Block_sendTextCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendTextCompletionHandler {
        @Generated
        void call_sendTextCompletionHandler(NSError error);
    }
}
