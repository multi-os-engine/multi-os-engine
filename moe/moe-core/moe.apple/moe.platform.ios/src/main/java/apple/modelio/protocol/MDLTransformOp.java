package apple.modelio.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 11.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLTransformOp")
public interface MDLTransformOp {
    @Generated
    @Selector("IsInverseOp")
    boolean IsInverseOp();

    @Generated
    @Selector("name")
    String name();
}