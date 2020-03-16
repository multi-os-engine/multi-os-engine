package apple.photos.protocol;

import apple.photos.PHPhotoLibrary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PHPhotoLibraryAvailabilityObserver")
public interface PHPhotoLibraryAvailabilityObserver {
    @Generated
    @Selector("photoLibraryDidBecomeUnavailable:")
    void photoLibraryDidBecomeUnavailable(PHPhotoLibrary photoLibrary);
}