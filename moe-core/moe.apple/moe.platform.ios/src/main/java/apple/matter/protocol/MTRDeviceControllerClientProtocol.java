package apple.matter.protocol;

import apple.foundation.NSError;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Protocol that the XPC client local object must support
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRDeviceControllerClientProtocol")
public interface MTRDeviceControllerClientProtocol {
    /**
     * Handles a report received by a device controller
     */
    @Generated
    @Selector("handleReportWithController:nodeId:values:error:")
    void handleReportWithControllerNodeIdValuesError(@Mapped(ObjCObjectMapper.class) @Nullable Object controller,
            long nodeId, @Mapped(ObjCObjectMapper.class) @Nullable Object values, @Nullable NSError error);
}