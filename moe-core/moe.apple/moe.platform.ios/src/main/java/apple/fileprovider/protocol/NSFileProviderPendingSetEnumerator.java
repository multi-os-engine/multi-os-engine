package apple.fileprovider.protocol;

import apple.fileprovider.NSFileProviderDomainVersion;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderPendingSetEnumerator")
public interface NSFileProviderPendingSetEnumerator extends NSFileProviderEnumerator {
    /**
     * The version of the domain when the pending set was last refreshed by the system.
     * 
     * This property is updated when the enumeration methods are called on the pending set enumerator. The value
     * is initially nil.
     */
    @Nullable
    @Generated
    @Selector("domainVersion")
    NSFileProviderDomainVersion domainVersion();

    /**
     * This property is set to YES when the enumeration of the pending set was capped at or below its maximum size.
     * Under normal conditions, the count of items pending sync will get lower as sync progresses, and this variable
     * will eventually be set to NO when the pending set again includes all items pending sync.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isMaximumSizeReached")
    boolean isMaximumSizeReached();

    /**
     * The amount of time in seconds at which the pending set is refreshed on modifications.
     */
    @Generated
    @Selector("refreshInterval")
    double refreshInterval();
}