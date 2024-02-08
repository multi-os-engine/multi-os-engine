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
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.messages.protocol.MSMessagesAppTranscriptPresentation;
import apple.uikit.UIViewController;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Messages")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MSMessagesAppViewController extends UIViewController implements MSMessagesAppTranscriptPresentation {
    static {
        NatJ.register();
    }

    @Generated
    protected MSMessagesAppViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MSMessagesAppViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MSMessagesAppViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native MSMessagesAppViewController new_objc();

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
     * [@property] activeConversation
     * 
     * Current active conversation.
     */
    @Nullable
    @Generated
    @Selector("activeConversation")
    public native MSConversation activeConversation();

    /**
     * didBecomeActiveWithConversation:
     * 
     * Called when the extension has become active.
     * 
     * @param conversation The current conversation.
     */
    @Generated
    @Selector("didBecomeActiveWithConversation:")
    public native void didBecomeActiveWithConversation(@NotNull MSConversation conversation);

    /**
     * didCancelSendingMessage:conversation:
     * 
     * Informs the extension that the user has removed the message from the input field.
     * 
     * This method will not be called when the `presentationStyle` is MSMessagesAppPresentationStyleTranscript or the
     * `presentationContext` is `MSMessagesAppPresentationContextMedia`.
     * 
     * @param message      The message sent.
     * @param conversation The conversation.
     * 
     *                     API-Since: 10.0
     */
    @Generated
    @Selector("didCancelSendingMessage:conversation:")
    public native void didCancelSendingMessageConversation(@NotNull MSMessage message,
            @NotNull MSConversation conversation);

    /**
     * didReceiveMessage:conversation:
     * 
     * Informs the extension that a new message has arrived.
     * 
     * This method will not be called when the `presentationStyle` is `MSMessagesAppPresentationStyleTranscript` or the
     * `presentationContext` is `MSMessagesAppPresentationContextMedia`.
     * 
     * @param message      The message received.
     * @param conversation The conversation.
     * 
     *                     API-Since: 10.0
     */
    @Generated
    @Selector("didReceiveMessage:conversation:")
    public native void didReceiveMessageConversation(@NotNull MSMessage message, @NotNull MSConversation conversation);

    /**
     * didResignActiveWithConversation:
     * 
     * Called when the extension has resigned active.
     * 
     * @param conversation The current conversation.
     */
    @Generated
    @Selector("didResignActiveWithConversation:")
    public native void didResignActiveWithConversation(@NotNull MSConversation conversation);

    /**
     * didSelectMessage:conversation:
     * 
     * Informs the extension that a new message has been selected in the conversation.
     * 
     * This method will not be called when the `presentationStyle` is `MSMessagesAppPresentationStyleTranscript` or the
     * `presentationContext` is `MSMessagesAppPresentationContextMedia`.
     * 
     * @param message      The message selected.
     * @param conversation The conversation.
     * 
     *                     API-Since: 10.0
     */
    @Generated
    @Selector("didSelectMessage:conversation:")
    public native void didSelectMessageConversation(@NotNull MSMessage message, @NotNull MSConversation conversation);

    /**
     * didStartSendingMessage:conversation:
     * 
     * Informs the extension that the message send has been triggered.
     * 
     * This is called when a user interaction with Messages start the message send process. It does not guarantee the
     * message will be successfully sent or delivered. This method will not be called when the `presentationStyle` is
     * `MSMessagesAppPresentationStyleTranscript` or the `presentationContext` is
     * `MSMessagesAppPresentationContextMedia`.
     * 
     * @param message      The message being sent.
     * @param conversation The conversation the message belongs to.
     * 
     *                     API-Since: 10.0
     */
    @Generated
    @Selector("didStartSendingMessage:conversation:")
    public native void didStartSendingMessageConversation(@NotNull MSMessage message,
            @NotNull MSConversation conversation);

    /**
     * didTransitionToPresentationStyle:
     * 
     * Called when the extension finished transitioning to a presentation style.
     * 
     * This method will not be called when the `presentationStyle` is `MSMessagesAppPresentationStyleTranscript`.
     * 
     * @param presentationStyle The new presentation style.
     * 
     *                          API-Since: 10.0
     */
    @Generated
    @Selector("didTransitionToPresentationStyle:")
    public native void didTransitionToPresentationStyle(@NUInt long presentationStyle);

    /**
     * dismiss
     * 
     * Tells Messages to dismiss the extension and present the keyboard.
     * 
     * Calling this method does nothing when the `presentationStyle` is `MSMessagesAppPresentationStyleTranscript`.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("dismiss")
    public native void dismiss();

    @Generated
    @Selector("init")
    public native MSMessagesAppViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native MSMessagesAppViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native MSMessagesAppViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * [@property] presentationStyle
     * 
     * Get the presentation extension's current presentation style.
     */
    @Generated
    @Selector("presentationStyle")
    @NUInt
    public native long presentationStyle();

    /**
     * requestPresentationStyle:
     * 
     * Requests that Messages transition the extension to the specified presentation style.
     * 
     * When the current `presentationStyle` is `MSMessagesAppPresentationStyleTranscript`, a new instance of
     * `MSMessagesAppViewController` will be instantiated with the requested presentation style if needed.
     * 
     * @param presentationStyle The presentation style to transition to. `MSMessagesAppPresentationStyleTranscript` is
     *                          not a valid presentation style to request.
     */
    @Generated
    @Selector("requestPresentationStyle:")
    public native void requestPresentationStyle(@NUInt long presentationStyle);

    /**
     * willBecomeActiveWithConversation:
     * 
     * Called when the extension is about to become active.
     * 
     * @param conversation The current conversation.
     */
    @Generated
    @Selector("willBecomeActiveWithConversation:")
    public native void willBecomeActiveWithConversation(@NotNull MSConversation conversation);

    /**
     * willResignActiveWithConversation:
     * 
     * Called when the extension will resign active.
     * 
     * @param conversation The current conversation.
     */
    @Generated
    @Selector("willResignActiveWithConversation:")
    public native void willResignActiveWithConversation(@NotNull MSConversation conversation);

    /**
     * willSelectMessage:conversation:
     * 
     * Informs the extension that a new message will be selected in the conversation.
     * 
     * This method will not be called when the `presentationStyle` is `MSMessagesAppPresentationStyleTranscript` or the
     * `presentationContext` is `MSMessagesAppPresentationContextMedia`.
     * 
     * @param message      The message selected.
     * @param conversation The conversation.
     * 
     *                     API-Since: 10.0
     */
    @Generated
    @Selector("willSelectMessage:conversation:")
    public native void willSelectMessageConversation(@NotNull MSMessage message, @NotNull MSConversation conversation);

    /**
     * willTransitionToPresentationStyle:
     * 
     * Called when the extension is about to transition to a new presentation style.
     * 
     * This method will not be called when the `presentationStyle` is `MSMessagesAppPresentationStyleTranscript`.
     * 
     * @param presentationStyle The new presentation style.
     * 
     *                          API-Since: 10.0
     */
    @Generated
    @Selector("willTransitionToPresentationStyle:")
    public native void willTransitionToPresentationStyle(@NUInt long presentationStyle);

    @Generated
    @Selector("contentSizeThatFits:")
    @ByValue
    public native CGSize contentSizeThatFits(@ByValue CGSize size);

    /**
     * [@property] presentationContext
     * 
     * The context for which the extension was launched
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("presentationContext")
    @NUInt
    public native long presentationContext();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
