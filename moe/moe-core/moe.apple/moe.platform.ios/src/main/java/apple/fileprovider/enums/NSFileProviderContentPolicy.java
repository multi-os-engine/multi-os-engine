package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSFileProviderContentPolicy {
    @Generated
    private NSFileProviderContentPolicy() {
    }

    /**
     * Inherit the content policy of the parent folder.
     * 
     * This is the default policy on every item other than the root.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Inherited = 0x0000000000000000L;
    /**
     * Download this item lazily (i.e when it is read.)
     * Evict the file upon remote content update.
     * Also allow eviction on low disk pressure and other triggers.
     * 
     * This is the default policy on the root on iOS.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long DownloadLazilyAndEvictOnRemoteUpdate = 0x0000000000000002L;
}