package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSTextLocation represents an abstract location inside document contents. A concrete class conforming to the protocol
 * should be associated with a particular document backing store type. The interpretation of a location in enumeration
 * operations is depending on the logical direction. When enumerating forward, it should start with the item containing
 * the location. The enumeration should start with an item preceding the location for reverse operations.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextLocation")
public interface NSTextLocation {
    /**
     * Compares and returns the logical ordering to location
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("compare:")
    @NInt
    long compare(@Mapped(ObjCObjectMapper.class) NSTextLocation location);
}
