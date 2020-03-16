package apple.arkit.protocol;

import apple.arkit.ARAnchor;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARAnchorCopying")
public interface ARAnchorCopying extends NSCopying {
    @Generated
    @Selector("initWithAnchor:")
    @MappedReturn(ObjCObjectMapper.class)
    Object initWithAnchor(ARAnchor anchor);
}