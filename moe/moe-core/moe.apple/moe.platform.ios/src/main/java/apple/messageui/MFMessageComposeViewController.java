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

package apple.messageui;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.messages.MSMessage;
import apple.messageui.protocol.MFMessageComposeViewControllerDelegate;
import apple.uikit.UINavigationController;
import apple.uikit.UIViewController;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSItemProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MFMessageComposeViewController
 * 
 * The MFMessageComposeViewController class provides an interface for editing and sending a message.
 * 
 * The MFMessageComposeViewController class manages all user interaction. The client needs to set
 * the recipient or recipients. The client may also set the body of the message. After setup, the
 * client needs to only display the view.
 * <p>The provided delegate will be informed of the user's composition completion and how they chose
 * to complete the operation.</p>
 * <p>Prior to use, clients should verify the user has set up the device for sending messages via
 * <tt>+[MFMessageComposeViewController canSendText]</tt>.</p>
 * 
 * API-Since: 4.0
 */
@Generated
@Library("MessageUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MFMessageComposeViewController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected MFMessageComposeViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MFMessageComposeViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MFMessageComposeViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * canSendAttachments
     * 
     * Returns <tt>YES</tt><tt>if the user has set up the device for including attachments in messages.</tt>.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("canSendAttachments")
    public static native boolean canSendAttachments();

    /**
     * canSendSubject
     * 
     * Returns <tt>YES</tt><tt>if the user has set up the device for including subjects in messages.</tt>.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("canSendSubject")
    public static native boolean canSendSubject();

    /**
     * canSendText
     * 
     * Returns <tt>YES</tt> if the user has set up the device for sending text only messages.
     * 
     * If the return value is YES, the client can set the recipients and body of the message.
     * If the return value is NO, the client may notify the user of the failure, or the
     * client may open an SMS URL via <tt>-[UIApplication openURL:]</tt>.
     */
    @Generated
    @Selector("canSendText")
    public static native boolean canSendText();

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

    /**
     * isSupportedAttachmentUTI:
     * 
     * Returns <tt>YES</tt>if the attachment at the specified URL could be accepted by the current composition.
     * 
     * If the return value is YES, the UTI is acceptable for attachment to a message, a return value of NO
     * indicates that the given UTI is unsupported.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isSupportedAttachmentUTI:")
    public static native boolean isSupportedAttachmentUTI(@NotNull String uti);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MFMessageComposeViewController new_objc();

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
     * addAttachmentData:typeIdentifier:filename:
     * 
     * Returns <tt>YES</tt>if the attachment was added to the composition successfully.
     * 
     * If the return value is YES, the attachment was added to the composition. If the return value is NO,
     * the attachment was not added to the composition. The data and typeIdentifer must be non-nil. typeIdentifier
     * should be a valid Uniform Type Identifier.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("addAttachmentData:typeIdentifier:filename:")
    public native boolean addAttachmentDataTypeIdentifierFilename(@NotNull NSData attachmentData, @NotNull String uti,
            @NotNull String filename);

    /**
     * addAttachmentURL:withAlternateFilename:
     * 
     * Returns <tt>YES</tt>if the attachment at the specified URL was added to the composition successfully.
     * 
     * If the return value is YES, the attachment was added to the composition. If the return value is NO,
     * the attachment was not added to the composition. All attachment URLs must be file urls. The file
     * URL must not be NIL. The alternate filename will be display to the user in leiu of the attachments URL.
     * The alternate filename may be NIL.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("addAttachmentURL:withAlternateFilename:")
    public native boolean addAttachmentURLWithAlternateFilename(@NotNull NSURL attachmentURL,
            @Nullable String alternateFilename);

    /**
     * [@property] attachments
     * 
     * This property returns an NSArray of NSDictionaries describing the properties of the current attachments.
     * 
     * This property returns an NSArray of NSDictionaries describing the properties of the current attachments.
     * See MFMessageComposeViewControllerAttachmentURL, MFMessageComposeViewControllerAttachmentAlternateFilename.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("attachments")
    public native NSArray<? extends NSDictionary<?, ?>> attachments();

    /**
     * [@property] body
     * 
     * This property sets the initial value of the body of the message to the specified content.
     * 
     * This property will set the initial value of the body of the message. This should be called prior
     * to display.
     * <p>After the view has been presented to the user, this property will no longer change the value.</p>
     */
    @Nullable
    @Generated
    @Selector("body")
    public native String body();

    /**
     * disableUserAttachments;
     * 
     * Calling this method will disable the camera/attachment button in the view controller. After the controller has
     * been presented,
     * this call will have no effect. The camera / attachment button is visible by default.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("disableUserAttachments")
    public native void disableUserAttachments();

    @Generated
    @Selector("init")
    public native MFMessageComposeViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native MFMessageComposeViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native MFMessageComposeViewController initWithNavigationBarClassToolbarClass(
            @Nullable Class navigationBarClass, @Nullable Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native MFMessageComposeViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native MFMessageComposeViewController initWithRootViewController(
            @NotNull UIViewController rootViewController);

    /**
     * [@property] message
     * 
     * This property sets the initial interactive message.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("message")
    public native MSMessage message();

    /**
     * [@property] messageComposeDelegate
     * 
     * This property is the delegate for the MFMessageComposeViewController method callbacks.
     */
    @Nullable
    @Generated
    @Selector("messageComposeDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MFMessageComposeViewControllerDelegate messageComposeDelegate();

    /**
     * [@property] recipients
     * 
     * This property sets the initial value of the To field for the message to the specified addresses.
     * 
     * This property will set the initial value of the To field for the message from an NSArray of
     * NSString instances specifying the message addresses of recipients. This should be called prior
     * to display.
     * <p>After the view has been presented to the user, this property will no longer change the value.</p>
     */
    @Nullable
    @Generated
    @Selector("recipients")
    public native NSArray<String> recipients();

    /**
     * [@property] body
     * 
     * This property sets the initial value of the body of the message to the specified content.
     * 
     * This property will set the initial value of the body of the message. This should be called prior
     * to display.
     * <p>After the view has been presented to the user, this property will no longer change the value.</p>
     */
    @Generated
    @Selector("setBody:")
    public native void setBody(@Nullable String value);

    /**
     * [@property] message
     * 
     * This property sets the initial interactive message.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setMessage:")
    public native void setMessage(@Nullable MSMessage value);

    /**
     * [@property] messageComposeDelegate
     * 
     * This property is the delegate for the MFMessageComposeViewController method callbacks.
     */
    @Generated
    @Selector("setMessageComposeDelegate:")
    public native void setMessageComposeDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) MFMessageComposeViewControllerDelegate value);

    /**
     * [@property] messageComposeDelegate
     * 
     * This property is the delegate for the MFMessageComposeViewController method callbacks.
     */
    @Generated
    public void setMessageComposeDelegate(
            @Nullable @Mapped(ObjCObjectMapper.class) MFMessageComposeViewControllerDelegate value) {
        Object __old = messageComposeDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setMessageComposeDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] recipients
     * 
     * This property sets the initial value of the To field for the message to the specified addresses.
     * 
     * This property will set the initial value of the To field for the message from an NSArray of
     * NSString instances specifying the message addresses of recipients. This should be called prior
     * to display.
     * <p>After the view has been presented to the user, this property will no longer change the value.</p>
     */
    @Generated
    @Selector("setRecipients:")
    public native void setRecipients(@Nullable NSArray<String> value);

    /**
     * [@property] subject
     * 
     * This property sets the initial value of the subject of the message to the specified content.
     * 
     * This property will set the initial value of the subject of the message. This should be called prior
     * to display.
     * <p>After the view has been presented to the user, this property will no longer change the value.</p>
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setSubject:")
    public native void setSubject(@Nullable String value);

    /**
     * [@property] subject
     * 
     * This property sets the initial value of the subject of the message to the specified content.
     * 
     * This property will set the initial value of the subject of the message. This should be called prior
     * to display.
     * <p>After the view has been presented to the user, this property will no longer change the value.</p>
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("subject")
    public native String subject();

    /**
     * insertCollaborationItemProvider:
     * 
     * Returns <tt>YES</tt> if the item provider was added to the composition successfully.
     * 
     * If the return value is YES, the itemProvider was added to the composition. If the return value is NO,
     * the itemProvider was not added to the composition. The itemProvider must be non-nil.
     * 
     * API-Since: 16.0
     * 
     * @param itemProvider created from ShareSheet
     */
    @Generated
    @Selector("insertCollaborationItemProvider:")
    public native boolean insertCollaborationItemProvider(@NotNull NSItemProvider itemProvider);
}
