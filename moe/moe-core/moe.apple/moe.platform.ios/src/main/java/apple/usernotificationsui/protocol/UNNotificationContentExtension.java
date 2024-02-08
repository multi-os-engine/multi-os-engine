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

package apple.usernotificationsui.protocol;

import apple.uikit.UIColor;
import apple.usernotifications.UNNotification;
import apple.usernotifications.UNNotificationResponse;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;

/**
 * An object that presents a custom interface for a delivered local or remote
 * notification.
 * 
 * The `UNNotificationContentExtension` protocol provides the entry point for
 * a notification content app extension, which displays a custom interface for
 * your app’s notifications. You adopt this protocol in the custom
 * <doc://com.apple.documentation/documentation/uikit/uiviewcontroller>
 * subclass that you use to present your interface. You create this type of
 * extension to improve the way your notifications are presented, possibly by
 * adding custom colors and branding, or by incorporating media and other
 * dynamic content into your notification interface.
 * 
 * To define a notification content app extension, add a notification content
 * extension target to the Xcode project containing your app. The default Xcode
 * template contains a source file and storyboard for your view controller. The
 * `Info.plist` file of the extension comes mostly configured. Specifically,
 * the `NSExtensionPointIdentifier` key is set to the value
 * `com.apple.usernotifications.content-extension`, and the
 * `NSExtensionMainStoryboard` key is set to the name of the project’s
 * storyboard file. However, the `NSExtensionAttribute` key contains a
 * dictionary of additional keys and values, which are listed in the following table.
 * 
 * | Key | Value |
 * | --- | ----- |
 * | `UNNotificationExtensionCategory` (Required) | A string or an array of strings. Each string contains the identifier
 * of a category declared by the app using the
 * <doc://com.apple.documentation/documentation/usernotifications/unnotificationcategory> class. |
 * | `UNNotificationExtensionInitialContentSizeRatio` (Required) | A floating-point number that represents the initial
 * size of your view controller’s view expressed as a ratio of its height to its width. The system uses this value to
 * set the initial size of the view controller while your extension is loading. For example, a value of 0.5 results in a
 * view controller whose height is half its width. You can change the size of your view controller after your extension
 * loads. |
 * | `UNNotificationExtensionDefaultContentHidden` | A Boolean. When set to
 * <doc://com.apple.documentation/documentation/objectivec/yes>, the system displays only your custom view controller in
 * the notification interface. When set to <doc://com.apple.documentation/documentation/objectivec/no>, the system
 * displays the default notification content in addition to your view controller’s content. Custom action buttons and
 * the Dismiss button are always displayed, regardless of this setting. If you don't specify this key, the default value
 * is set to <doc://com.apple.documentation/documentation/objectivec/no>. |
 * | `UNNotificationExtensionOverridesDefaultTitle` | A Boolean. When set to
 * <doc://com.apple.documentation/documentation/objectivec/yes>, the system uses the
 * <doc://com.apple.documentation/documentation/uikit/uiviewcontroller/1621364-title> property of your view controller
 * as the title of the notification. When set to <doc://com.apple.documentation/documentation/objectivec/no>, the system
 * sets the notification's title to the name of your app. If you don't specify this key, the default value is set to
 * <doc://com.apple.documentation/documentation/objectivec/no>. |
 * 
 * If the notification category includes custom actions, the system
 * automatically adds action buttons to your notification interface; don't
 * create those buttons yourself. If your view controller implements the
 * optional
 * ``UNNotificationContentExtension/didReceiveNotificationResponse:completionHandler:``
 * method, the system calls that method to respond to any selected actions. If
 * your view controller doesn't implement that method, the system delivers the
 * selected action to your app for handling.
 * 
 * The system prevents the delivery of touch events to your view controller
 * while it is onscreen. Do not install gesture recognizers or rely on touch
 * events in your interface.
 * 
 * For information about how to implement your notification content app
 * extension, see <doc:customizing-the-appearance-of-notifications>.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("UserNotificationsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UNNotificationContentExtension")
public interface UNNotificationContentExtension {
    /**
     * Delivers a new notification to your notification content app extension.
     * 
     * In your implementation of this method, use the contents of `notification` to
     * configure your view controller. This method may be called multiple times
     * while your view controller is visible. Specifically, it is called again when
     * a new notification arrives whose
     * <doc://com.apple.documentation/documentation/usernotifications/unnotificationcontent/1649860-threadidentifier>
     * value matches the thread identifier of the notification already being
     * displayed. The method is called on the main thread of your notification
     * content app extension.
     * 
     * If you want to accommodate new content in your interface, you can change the
     * height of your view controller's view. Change only the height; width values
     * are ignored. You can then add subviews to fill the additional space with
     * your content.
     * 
     * - Parameters:
     * - notification: The notification that arrived.
     */
    @Generated
    @Selector("didReceiveNotification:")
    void didReceiveNotification(@NotNull UNNotification notification);

    /**
     * Handles a notification action selected by the user.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > optional func didReceive(_ response: UNNotificationResponse) async ->
     * UNNotificationContentExtensionResponseOption
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * Implement this method when you want your view controller to handle actions
     * selected by the user. Use your implementation to perform the associated task
     * and then execute the `completion` block. If you implement this method, you
     * must handle all actions defined in all categories managed by your
     * Notification Content app extension. If you don't implement this method, the
     * system notifies your app when the user selects an action.
     * 
     * - Parameters:
     * - response: The response object that identifies the user-selected action.
     * Use this object to get information about the notification and the user’s
     * response.
     * - completion: The block to execute when you are finished performing the
     * action. You must call this block at some point during your implementation.
     * The block has no return value and takes the following parameter:
     * - term `dismiss`: The response you want to take for the notification. For a list of
     * possible options, see
     * ``UserNotificationsUI/UNNotificationContentExtensionResponseOption``.
     */
    @Generated
    @IsOptional
    @Selector("didReceiveNotificationResponse:completionHandler:")
    default void didReceiveNotificationResponseCompletionHandler(@NotNull UNNotificationResponse response,
            @NotNull @ObjCBlock(name = "call_didReceiveNotificationResponseCompletionHandler") Block_didReceiveNotificationResponseCompletionHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells you to pause playback of your media content.
     * 
     * Don't call this method yourself. If you implement the
     * ``UNNotificationContentExtension/mediaPlayPauseButtonFrame`` property in
     * your view controller, the system calls this method when the user wants to
     * stop playback of your media. Use your implementation of this method to pause
     * playback at the current location.
     */
    @Generated
    @IsOptional
    @Selector("mediaPause")
    default void mediaPause() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells you to begin playback of your media content.
     * 
     * Don't call this method yourself. If you implement the
     * ``UNNotificationContentExtension/mediaPlayPauseButtonFrame`` property in
     * your view controller, the system calls this method when the user wants to
     * begin playback of your media. Use your implementation of this method to
     * initiate playback.
     */
    @Generated
    @IsOptional
    @Selector("mediaPlay")
    default void mediaPlay() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The frame rectangle to use for displaying a media playback button.
     * 
     * If you support the playback of media directly from your notification
     * interface, implement this property and use it to return a nonempty rectangle
     * specified in the coordinate system of your view controller’s view. The
     * system draws a button in the provided rectangle that lets the user play and
     * pause your media content. The system handles the drawing of the button for
     * you and calls the ``UNNotificationContentExtension/mediaPlay`` and
     * ``UNNotificationContentExtension/mediaPause`` methods in response to user
     * interactions. You can place this button anywhere in your view controller’s
     * view.
     * 
     * If you don't implement this property, the system doesn't draw a media
     * playback button.
     */
    @Generated
    @IsOptional
    @Selector("mediaPlayPauseButtonFrame")
    @ByValue
    default CGRect mediaPlayPauseButtonFrame() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The tint color for the media playback button.
     * 
     * If you implement the
     * ``UNNotificationContentExtension/mediaPlayPauseButtonFrame`` property, you
     * can also implement this property and use it to specify the tint color to
     * apply to the button. If you don't implement this property, the system uses a
     * default color for the tint color.
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("mediaPlayPauseButtonTintColor")
    default UIColor mediaPlayPauseButtonTintColor() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The type of media button type to display.
     * 
     * Implement this property when you want the system to display a media playback
     * button in your notification interface. Return an appropriate constant
     * indicating the type of button you want. If you don't implement this
     * property, the system behaves as if you set the value to
     * ``UNNotificationContentExtensionMediaPlayPauseButtonType/UNNotificationContentExtensionMediaPlayPauseButtonTypeNone``.
     */
    @Generated
    @IsOptional
    @Selector("mediaPlayPauseButtonType")
    @NUInt
    default long mediaPlayPauseButtonType() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_didReceiveNotificationResponseCompletionHandler {
        @Generated
        void call_didReceiveNotificationResponseCompletionHandler(@NUInt long option);
    }
}
