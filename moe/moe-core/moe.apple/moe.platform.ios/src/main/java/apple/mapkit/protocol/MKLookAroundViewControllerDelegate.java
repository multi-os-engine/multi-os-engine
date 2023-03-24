package apple.mapkit.protocol;

import apple.mapkit.MKLookAroundViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 16.0
 */
@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MKLookAroundViewControllerDelegate")
public interface MKLookAroundViewControllerDelegate {
    @Generated
    @IsOptional
    @Selector("lookAroundViewControllerDidDismissFullScreen:")
    default void lookAroundViewControllerDidDismissFullScreen(@NotNull MKLookAroundViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("lookAroundViewControllerDidPresentFullScreen:")
    default void lookAroundViewControllerDidPresentFullScreen(@NotNull MKLookAroundViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("lookAroundViewControllerDidUpdateScene:")
    default void lookAroundViewControllerDidUpdateScene(@NotNull MKLookAroundViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("lookAroundViewControllerWillDismissFullScreen:")
    default void lookAroundViewControllerWillDismissFullScreen(@NotNull MKLookAroundViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("lookAroundViewControllerWillPresentFullScreen:")
    default void lookAroundViewControllerWillPresentFullScreen(@NotNull MKLookAroundViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("lookAroundViewControllerWillUpdateScene:")
    default void lookAroundViewControllerWillUpdateScene(@NotNull MKLookAroundViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}