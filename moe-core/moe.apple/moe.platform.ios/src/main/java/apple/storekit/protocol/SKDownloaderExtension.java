package apple.storekit.protocol;

import apple.backgroundassets.protocol.BAManagedDownloaderExtension;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;

/**
 * An application extension that uses the system implementation to schedule Apple-hosted asset-pack downloads
 * automatically.
 * 
 * You can optionally implement the inherited `BAManagedDownloaderExtension` requirements, but don’t implement any of
 * the inherited `BADownloaderExtension` requirements. For more information, see
 * <doc://com.apple.documentation/documentation/backgroundassets>.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKDownloaderExtension")
public interface SKDownloaderExtension extends BAManagedDownloaderExtension {
}