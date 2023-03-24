package apple.imagecapturecore.protocol;

import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.imagecapturecore.ICCameraDevice;
import apple.imagecapturecore.ICCameraItem;
import apple.imagecapturecore.ICDevice;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * -------------------------------------------------------------------------------------------------------
 * ICCameraDeviceDelegate
 * [@protocol] ICCameraDeviceDelegate <ICDeviceDelegate>
 * 
 * A delegate of ICCameraDevice must conform to ICCameraDeviceDelegate protocol.
 * 
 * The ICCameraDeviceDelegate protocol inherits from the ICDeviceDelegate protocol.
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ICCameraDeviceDelegate")
public interface ICCameraDeviceDelegate extends ICDeviceDelegate {
    /**
     * cameraDevice:didAddItem:
     */
    @Generated
    @IsOptional
    @Selector("cameraDevice:didAddItem:")
    default void cameraDeviceDidAddItem(@NotNull ICCameraDevice camera, @NotNull ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * cameraDevice:didAddItems:
     * 
     * This message is sent when objects are added to the device.
     * 
     * The objects in items are instances ICCameraFile class.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraDevice:didAddItems:")
    void cameraDeviceDidAddItems(@NotNull ICCameraDevice camera, @NotNull NSArray<? extends ICCameraItem> items);

    /**
     * cameraDevice:didCompleteDeleteFilesWithError:
     * 
     * This message is sent after the camera device completes a delete operation initiated by sending a
     * 'requestDeleteFiles:' message to that device.
     * [@discusson] This message is sent after the camera device completes a delete operation initiated by sending a
     * 'requestDeleteFiles:' message to that device.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("cameraDevice:didCompleteDeleteFilesWithError:")
    default void cameraDeviceDidCompleteDeleteFilesWithError(@NotNull ICCameraDevice camera, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * cameraDevice:didReceiveMetadata:forItem:error:
     * 
     * This message is sent when the metadata requested for an item on a device is available.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraDevice:didReceiveMetadata:forItem:error:")
    void cameraDeviceDidReceiveMetadataForItemError(@NotNull ICCameraDevice camera,
            @Nullable NSDictionary<?, ?> metadata, @NotNull ICCameraItem item, @Nullable NSError error);

    /**
     * cameraDevice:didReceiveMetadataForItem:
     */
    @Generated
    @IsOptional
    @Selector("cameraDevice:didReceiveMetadataForItem:")
    default void cameraDeviceDidReceiveMetadataForItem(@NotNull ICCameraDevice camera, @NotNull ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * cameraDevice:didReceivePTPEvent:
     * 
     * This message is sent to the delegate to convey a PTP event.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraDevice:didReceivePTPEvent:")
    void cameraDeviceDidReceivePTPEvent(@NotNull ICCameraDevice camera, @NotNull NSData eventData);

    /**
     * cameraDevice:didReceiveThumbnail:forItem:error:
     * 
     * This message is sent when the thumbnail requested for an item on a device is available.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraDevice:didReceiveThumbnail:forItem:error:")
    void cameraDeviceDidReceiveThumbnailForItemError(@NotNull ICCameraDevice camera, @Nullable CGImageRef thumbnail,
            @NotNull ICCameraItem item, @Nullable NSError error);

    /**
     * cameraDevice:didReceiveThumbnailForItem:
     */
    @Generated
    @IsOptional
    @Selector("cameraDevice:didReceiveThumbnailForItem:")
    default void cameraDeviceDidReceiveThumbnailForItem(@NotNull ICCameraDevice camera, @NotNull ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * cameraDevice:didRemoveItem:
     */
    @Generated
    @IsOptional
    @Selector("cameraDevice:didRemoveItem:")
    default void cameraDeviceDidRemoveItem(@NotNull ICCameraDevice camera, @NotNull ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * cameraDevice:didRemoveItems:
     * 
     * This message is sent when objects are removed from the device.
     * 
     * The objects in items are instances ICCameraFile class.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraDevice:didRemoveItems:")
    void cameraDeviceDidRemoveItems(@NotNull ICCameraDevice camera, @NotNull NSArray<? extends ICCameraItem> items);

    /**
     * cameraDevice:didRenameItems:
     * 
     * This message is sent when an object or objects are renamed on the device.
     * 
     * The objects may be instances of ICCameraFolder or ICCameraFile class.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraDevice:didRenameItems:")
    void cameraDeviceDidRenameItems(@NotNull ICCameraDevice camera, @NotNull NSArray<? extends ICCameraItem> items);

    /**
     * This message is sent when the camera device is about to execute queued requests for the metadata of a specific
     * item.
     * If the request is no longer wanted, eg: the item is no longer displayed on the screen, the client can return NO
     * and abort sending
     * a request down to the camera device, speeding up the execution queue.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("cameraDevice:shouldGetMetadataOfItem:")
    default boolean cameraDeviceShouldGetMetadataOfItem(@NotNull ICCameraDevice cameraDevice,
            @NotNull ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * cameraDevice:shouldGetThumbnailOfItem:
     * 
     * This message is sent when the camera device is about to execute queued requests for the thumbnail of a specific
     * item.
     * If the request is no longer wanted, eg: the item is no longer displayed on the screen, the client can return NO
     * and abort sending
     * a request down to the camera device, speeding up the exection queue.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("cameraDevice:shouldGetThumbnailOfItem:")
    default boolean cameraDeviceShouldGetThumbnailOfItem(@NotNull ICCameraDevice cameraDevice,
            @NotNull ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * cameraDeviceDidChangeCapability:
     * 
     * This message is sent when a capability of a device changes.
     * 
     * Detailed capabilitiy descriptions are provided at the top of this header file.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraDeviceDidChangeCapability:")
    void cameraDeviceDidChangeCapability(@NotNull ICCameraDevice camera);

    /**
     * deviceDidEnableAccessRestriction:
     * 
     * This message is sent when an Apple device has been locked, and media is unavailable until the restriction
     * has been removed.
     */
    @Generated
    @Selector("cameraDeviceDidEnableAccessRestriction:")
    void cameraDeviceDidEnableAccessRestriction(@NotNull ICDevice device);

    /**
     * deviceDidRemoveAccessRestriction:
     * 
     * This message is sent when an Apple device has been unlocked, paired to the host, and media is available.
     */
    @Generated
    @Selector("cameraDeviceDidRemoveAccessRestriction:")
    void cameraDeviceDidRemoveAccessRestriction(@NotNull ICDevice device);

    /**
     * deviceDidBecomeReadyWithCompleteContentCatalog:
     * 
     * This message is sent when the camera device is done enumerating its content and is ready to receive requests.
     * 
     * A session must be opened on the device in order to enumerate its content and make it ready to receive requests.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("deviceDidBecomeReadyWithCompleteContentCatalog:")
    void deviceDidBecomeReadyWithCompleteContentCatalog(@NotNull ICCameraDevice device);
}
