package apple.matter.protocol;

import apple.foundation.NSData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * This protocol is used by the Matter framework to read and write storage.
 * 
 * The Matter framework may call storage methods from arbitrary threads, but
 * will not call storage methods concurrently.
 * 
 * Implementations of the storage methods must not call into any Matter
 * framework APIs.
 * 
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRStorage")
public interface MTRStorage {
    /**
     * Delete the key and corresponding data. Returns YES if the key was present,
     * NO if the key was not present.
     */
    @Generated
    @Selector("removeStorageDataForKey:")
    boolean removeStorageDataForKey(@NotNull String key);

    /**
     * Set the data for the viven key to the given value. Returns YES if the key
     * was set successfully, NO otherwise.
     */
    @Generated
    @Selector("setStorageData:forKey:")
    boolean setStorageDataForKey(@NotNull NSData value, @NotNull String key);

    /**
     * Get the data for the given key. Returns nil if there is no data for the
     * key.
     */
    @Generated
    @Selector("storageDataForKey:")
    @Nullable
    NSData storageDataForKey(@NotNull String key);
}