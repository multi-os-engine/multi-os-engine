package apple.touchcontroller.protocol;

import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A protocol defining the controlLayout properties for a control.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TCControlLayout")
public interface TCControlLayout {
    /**
     * The anchor point of the control.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("anchor")
    @NInt
    long anchor();

    /**
     * The coordinate system for the control's anchor point.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("anchorCoordinateSystem")
    @NInt
    long anchorCoordinateSystem();

    /**
     * The offset from the anchor point.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("offset")
    @ByValue
    CGPoint offset();

    /**
     * The calculated position of the control.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("position")
    @ByValue
    CGPoint position();

    /**
     * The anchor point of the control.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAnchor:")
    void setAnchor(@NInt long value);

    /**
     * The coordinate system for the control's anchor point.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAnchorCoordinateSystem:")
    void setAnchorCoordinateSystem(@NInt long value);

    /**
     * The offset from the anchor point.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOffset:")
    void setOffset(@ByValue CGPoint value);

    /**
     * The size of the control in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSize:")
    void setSize(@ByValue CGSize value);

    /**
     * The z-index of the controlLayout, used for z-ordering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setZIndex:")
    void setZIndex(@NInt long value);

    /**
     * The size of the control in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("size")
    @ByValue
    CGSize size();

    /**
     * The z-index of the controlLayout, used for z-ordering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("zIndex")
    @NInt
    long zIndex();
}