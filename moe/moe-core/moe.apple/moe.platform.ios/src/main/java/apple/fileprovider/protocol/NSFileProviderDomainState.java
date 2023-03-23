package apple.fileprovider.protocol;

import apple.fileprovider.NSFileProviderDomainVersion;
import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderDomainState")
public interface NSFileProviderDomainState {
    /**
     * Version of the domain.
     * 
     * The domain version is an opaque value assigned by the provider. It is read by the system in the
     * completion handler for createItemBasedOnTemplate, modifyItem, deleteItem and itemForIdentifier, as
     * well as in the finish calls when enumerating the working set. The read is guaranteed to happen
     * on the same dispatch queue the completion handler was called on.
     * 
     * When the system discovers a change on disk, it associates that change to the currently known
     * domain version. When that change get communicated to the extension, that version is included in
     * the NSFileProviderRequest object passed by the system to the extension. As a consequence, the
     * provider can use the domain version to identify the state of the system when a change was made on disk.
     * 
     * The provider is responsible for defining when the domain version changes. When that value is
     * updated, the provider must notify the system by signaling the working set.
     * 
     * The system ignore any domain version that is smaller than the previously known version.
     */
    @Generated
    @Selector("domainVersion")
    NSFileProviderDomainVersion domainVersion();

    /**
     * Global state of the domain.
     * 
     * Use this dictionary to add state information to the domain. It is accessible to predicates for
     * User Interactions, FileProvider Actions, and FileProviderUI Actions, via the top-level `domainUserInfo` context
     * key.
     * 
     * This dictionary must only contain key and value classes in the following list:
     * NSString, NSNumber, NSDate, and NSPersonNameComponents.
     * 
     * The system expects the domainVersion to be updated when the value of the userInfo property
     * changes.
     */
    @Generated
    @Selector("userInfo")
    NSDictionary<?, ?> userInfo();
}