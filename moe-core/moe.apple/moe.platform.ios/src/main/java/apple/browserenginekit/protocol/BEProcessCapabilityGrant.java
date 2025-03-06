package apple.browserenginekit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * An object that represents a granted capability.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BEProcessCapabilityGrant")
public interface BEProcessCapabilityGrant {
    /**
     * Invalidates the grant, removing the capability from the process it was granted to.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("invalidate")
    boolean invalidate();

    /**
     * `YES` if the process has been granted the capability and the grant is still valid.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("isValid")
    boolean isValid();
}