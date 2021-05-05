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

/**
 * An anchor object that can be copied from values of an existing anchor.
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARAnchorCopying")
public interface ARAnchorCopying extends NSCopying {
    /**
     * Initializes a new anchor object copying values from an existing anchor.
     * 
     * This initializer will be called any time copy is called on anchor of this class.
     * This method must be implemented for any ARAnchor subclasses that adds properties.
     * 
     * @param anchor The anchor from which to copy values.
     */
    @Generated
    @Selector("initWithAnchor:")
    @MappedReturn(ObjCObjectMapper.class)
    Object initWithAnchor(ARAnchor anchor);
}