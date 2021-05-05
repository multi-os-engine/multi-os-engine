package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PHPhotosError {
    @Generated
    private PHPhotosError() {
    }

    @Generated @NInt public static final long Invalid = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long UserCancelled = 0x0000000000000C00L;
    @Generated @NInt public static final long LibraryVolumeOffline = 0x0000000000000C2AL;
    @Generated @NInt public static final long RelinquishingLibraryBundleToWriter = 0x0000000000000C46L;
    @Generated @NInt public static final long SwitchingSystemPhotoLibrary = 0x0000000000000C47L;
    @Generated @NInt public static final long NetworkAccessRequired = 0x0000000000000C5CL;
}