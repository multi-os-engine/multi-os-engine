package apple.arkit.protocol;

import apple.arkit.ARSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A data source for an ARSession
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARSessionProviding")
public interface ARSessionProviding {
    /**
     * To ensure session changes are detected, Swift classes should mark this property as `@objc` and `dynamic`
     */
    @Generated
    @Selector("session")
    ARSession session();
}