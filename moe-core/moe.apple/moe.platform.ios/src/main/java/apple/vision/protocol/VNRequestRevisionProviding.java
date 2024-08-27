package apple.vision.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 12.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VNRequestRevisionProviding")
public interface VNRequestRevisionProviding {
    /**
     * The revision of the VNRequest subclass that was used to generate the object that implements this protocol.
     */
    @Generated
    @Selector("requestRevision")
    @NUInt
    long requestRevision();
}