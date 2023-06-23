package apple.photos.protocol;

import apple.photos.PHPhotoLibrary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PHPhotoLibraryAvailabilityObserver")
public interface PHPhotoLibraryAvailabilityObserver {
    /**
     * This notification is posted on a private queue.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("photoLibraryDidBecomeUnavailable:")
    void photoLibraryDidBecomeUnavailable(@NotNull PHPhotoLibrary photoLibrary);
}