package apple.iosurface.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class IOSurfaceLockOptions {
    @Generated
    private IOSurfaceLockOptions() {
    }

    /**
     * If you are not going to modify the data while you hold the lock, you should set this flag to avoid invalidating
     * any existing caches of the buffer contents.  This flag should be passed both to the lock and unlock functions.
     * Non-symmetrical usage of this flag will result in undefined behavior.
     */
    @Generated public static final int ReadOnly = 0x00000001;
    /**
     * If you want to detect/avoid a potentially expensive paging operation (such as readback from a GPU to system memory)
     * when you lock the buffer, you may include this flag.   If locking the buffer requires a readback, the lock will
     * fail with an error return of kIOReturnCannotLock.
     */
    @Generated public static final int AvoidSync = 0x00000002;
}