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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.messageui.protocol.MFMailComposeViewControllerDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MFMailComposeViewController
 * 
 * The MFMailComposeViewController class provides an interface for editing and sending email.
 * 
 * The MFMailComposeViewController class manages all user interaction. The client needs to set the recipient or
 * recipients. The client may also set the subject and the body of the message. Attachments may be added, if
 * so desired. After setup, the client needs to only display the view.<p>The provided delegate will be informed
 * of the user's composition completion and how they chose to complete the operation.</p>Prior to use, clients
 * should verify the user has set up the device for sending email via <tt>+[MFMailComposeViewController
 * canSendMail]</tt>.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("MessageUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MFMailComposeViewController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected MFMailComposeViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MFMailComposeViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MFMailComposeViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * canSendMail
     * 
     * Returns <tt>YES</tt> if the user has set up the device for sending email.
     * 
     * The client may continue to set the recipients and content if the return value was <tt>YES</tt>. If <tt>NO</tt>
     * was the result, the client has a couple options. It may choose to simply notify the user of the inability to
     * send mail, or it may issue a "mailto" URL via <tt>-[UIApplication openURL:]</tt>.
     */
    @Generated
    @Selector("canSendMail")
    public static native boolean canSendMail();

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
    public static native MFMailComposeViewController new_objc();

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
     * addAttachmentData:mimeType:fileName:
     * 
     * This method adds the specified attachment to the email message.
     * 
     * This method adds the specified attachment to the email message. This should be called prior to display.
     * Attachments will be appended to the end of the message.
     * 
     * @param attachment NSData containing the contents of the attachment. Must not be <tt>nil</tt>.
     * @param mimeType   NSString specifying the MIME type for the attachment, as specified by the IANA
     *                   (http://www.iana.org/assignments/media-types/). Must not be <tt>nil</tt>.
     * @param filename   NSString specifying the intended filename for the attachment. This is displayed below
     *                   the attachment's icon if the attachment is not decoded when displayed. Must not be
     *                   <tt>nil</tt>.
     */
    @Generated
    @Selector("addAttachmentData:mimeType:fileName:")
    public native void addAttachmentDataMimeTypeFileName(@NotNull NSData attachment, @NotNull String mimeType,
            @NotNull String filename);

    @Generated
    @Selector("init")
    public native MFMailComposeViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native MFMailComposeViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native MFMailComposeViewController initWithNavigationBarClassToolbarClass(@Nullable Class navigationBarClass,
            @Nullable Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native MFMailComposeViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native MFMailComposeViewController initWithRootViewController(@NotNull UIViewController rootViewController);

    /**
     * [@property] mailComposeDelegate
     * 
     * This property is the delegate for the MFMailComposeViewControllerDelegate method callbacks.
     */
    @Nullable
    @Generated
    @Selector("mailComposeDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MFMailComposeViewControllerDelegate mailComposeDelegate();

    /**
     * setBccRecipients:
     * 
     * This method sets the BCC header for the email message to the specified email addresses.
     * 
     * This method will set the BCC header for the email message. This should be called prior to display.
     * <p>Recipient addresses should be specified as per RFC5322.</p>
     * <p>After the view has been presented to the user, this method will no longer change the value.</p>
     * 
     * @param bccRecipients A NSArray of NSString instances specifying the email addresses of recipients.
     */
    @Generated
    @Selector("setBccRecipients:")
    public native void setBccRecipients(@Nullable NSArray<String> bccRecipients);

    /**
     * setCcRecipients:
     * 
     * This method sets the CC header for the email message to the specified email addresses.
     * 
     * This method will set the CC header for the email message. This should be called prior to display.
     * <p>Recipient addresses should be specified as per RFC5322.</p>
     * <p>After the view has been presented to the user, this method will no longer change the value.</p>
     * 
     * @param ccRecipients A NSArray of NSString instances specifying the email addresses of recipients.
     */
    @Generated
    @Selector("setCcRecipients:")
    public native void setCcRecipients(@Nullable NSArray<String> ccRecipients);

    /**
     * [@property] mailComposeDelegate
     * 
     * This property is the delegate for the MFMailComposeViewControllerDelegate method callbacks.
     */
    @Generated
    @Selector("setMailComposeDelegate:")
    public native void setMailComposeDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) MFMailComposeViewControllerDelegate value);

    /**
     * [@property] mailComposeDelegate
     * 
     * This property is the delegate for the MFMailComposeViewControllerDelegate method callbacks.
     */
    @Generated
    public void setMailComposeDelegate(
            @Nullable @Mapped(ObjCObjectMapper.class) MFMailComposeViewControllerDelegate value) {
        Object __old = mailComposeDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setMailComposeDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * setMessageBody:isHTML:
     * 
     * This method sets the body of the email message to the specified content.
     * 
     * This method will set the body of the email message. This should be called prior to display.
     * The user's signature, if specified, will be added after the body content.
     * 
     * @param body   A NSString containing the body contents of the email message.
     * @param isHTML A boolean value indicating if the body argument is to be interpreted as HTML content.
     */
    @Generated
    @Selector("setMessageBody:isHTML:")
    public native void setMessageBodyIsHTML(@NotNull String body, boolean isHTML);

    /**
     * setSubject:
     * 
     * This method sets the Subject header for the email message.
     * 
     * This method will set the Subject header for the email message. This should be called prior to display.
     * Newlines are removed from the parameter.
     * <p>After the view has been presented to the user, this method will no longer change the value.</p>
     * 
     * @param subject A NSString specifying the message's Subject header.
     */
    @Generated
    @Selector("setSubject:")
    public native void setSubject(@NotNull String subject);

    /**
     * setToRecipients:
     * 
     * This method sets the To header for the email message to the specified email addresses.
     * 
     * This method will set the To header for the email message. This should be called prior to display.
     * <p>Recipient addresses should be specified as per RFC5322.</p>
     * <p>After the view has been presented to the user, this method will no longer change the value.</p>
     * 
     * @param toRecipients A NSArray of NSString instances specifying the email addresses of recipients.
     */
    @Generated
    @Selector("setToRecipients:")
    public native void setToRecipients(@Nullable NSArray<String> toRecipients);

    /**
     * setPreferredSendingEmailAddress:
     * 
     * This method sets the preferred sending account of the email message.
     * 
     * This method will set the sending account of the message to the specified email address if the user has an account
     * with such an address set up. If there is no account with such an address, the default account will be used
     * instead.
     * The sending email address should be specified as per RFC5322.
     * After the view has been presented to the user, this method will no longer change the value.
     * 
     * @param emailAddress A NSString specifying the preferred email address used to send this message.
     * 
     *                     API-Since: 11.0
     */
    @Generated
    @Selector("setPreferredSendingEmailAddress:")
    public native void setPreferredSendingEmailAddress(@NotNull String emailAddress);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
