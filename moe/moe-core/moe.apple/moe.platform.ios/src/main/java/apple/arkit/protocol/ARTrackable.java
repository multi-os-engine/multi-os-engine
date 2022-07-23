package apple.arkit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A real world object or location in the scene that is being tracked.
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARTrackable")
public interface ARTrackable {
    /**
     * Tracking state of the anchor
     * <p>
     * The isTracked value is used to determine the anchor transform’s validity. When the object being tracked is no
     * longer detected in the
     * camera image, its anchor will return NO for isTracked.
     */
    @Generated
    @Selector("isTracked")
    boolean isTracked();
}
