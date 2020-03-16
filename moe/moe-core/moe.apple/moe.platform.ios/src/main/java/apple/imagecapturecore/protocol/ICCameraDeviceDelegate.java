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

@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ICCameraDeviceDelegate")
public interface ICCameraDeviceDelegate extends ICDeviceDelegate {
    @Generated
    @IsOptional
    @Selector("cameraDevice:didAddItem:")
    default void cameraDeviceDidAddItem(ICCameraDevice camera, ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("cameraDevice:didAddItems:")
    void cameraDeviceDidAddItems(ICCameraDevice camera, NSArray<? extends ICCameraItem> items);

    @Generated
    @IsOptional
    @Selector("cameraDevice:didCompleteDeleteFilesWithError:")
    default void cameraDeviceDidCompleteDeleteFilesWithError(ICCameraDevice camera, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("cameraDevice:didReceiveMetadata:forItem:error:")
    void cameraDeviceDidReceiveMetadataForItemError(ICCameraDevice camera, NSDictionary<?, ?> metadata,
            ICCameraItem item, NSError error);

    @Generated
    @IsOptional
    @Selector("cameraDevice:didReceiveMetadataForItem:")
    default void cameraDeviceDidReceiveMetadataForItem(ICCameraDevice camera, ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("cameraDevice:didReceivePTPEvent:")
    void cameraDeviceDidReceivePTPEvent(ICCameraDevice camera, NSData eventData);

    @Generated
    @Selector("cameraDevice:didReceiveThumbnail:forItem:error:")
    void cameraDeviceDidReceiveThumbnailForItemError(ICCameraDevice camera, CGImageRef thumbnail, ICCameraItem item,
            NSError error);

    @Generated
    @IsOptional
    @Selector("cameraDevice:didReceiveThumbnailForItem:")
    default void cameraDeviceDidReceiveThumbnailForItem(ICCameraDevice camera, ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("cameraDevice:didRemoveItem:")
    default void cameraDeviceDidRemoveItem(ICCameraDevice camera, ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("cameraDevice:didRemoveItems:")
    void cameraDeviceDidRemoveItems(ICCameraDevice camera, NSArray<? extends ICCameraItem> items);

    @Generated
    @Selector("cameraDevice:didRenameItems:")
    void cameraDeviceDidRenameItems(ICCameraDevice camera, NSArray<? extends ICCameraItem> items);

    @Generated
    @IsOptional
    @Selector("cameraDevice:shouldGetMetadataOfItem:")
    default boolean cameraDeviceShouldGetMetadataOfItem(ICCameraDevice cameraDevice, ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("cameraDevice:shouldGetThumbnailOfItem:")
    default boolean cameraDeviceShouldGetThumbnailOfItem(ICCameraDevice cameraDevice, ICCameraItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("cameraDeviceDidChangeCapability:")
    void cameraDeviceDidChangeCapability(ICCameraDevice camera);

    @Generated
    @Selector("cameraDeviceDidEnableAccessRestriction:")
    void cameraDeviceDidEnableAccessRestriction(ICDevice device);

    @Generated
    @Selector("cameraDeviceDidRemoveAccessRestriction:")
    void cameraDeviceDidRemoveAccessRestriction(ICDevice device);

    @Generated
    @Selector("deviceDidBecomeReadyWithCompleteContentCatalog:")
    void deviceDidBecomeReadyWithCompleteContentCatalog(ICCameraDevice device);
}