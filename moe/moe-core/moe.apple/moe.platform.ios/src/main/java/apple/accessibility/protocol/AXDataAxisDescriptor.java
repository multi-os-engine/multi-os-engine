package apple.accessibility.protocol;

import apple.foundation.NSAttributedString;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Describes a data axis for the chart (e.g. X, Y, etc.)
 * Each AXChart requires at least two AXDataAxis objects
 * to describe, at minimum, and X and a Y axis.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AXDataAxisDescriptor")
public interface AXDataAxisDescriptor extends NSCopying {
    /**
     * An attributed version of the title of this axis.
     * When set, this will be used instead of `title`.
     */
    @Generated
    @Selector("attributedTitle")
    NSAttributedString attributedTitle();

    /**
     * An attributed version of the title of this axis.
     * When set, this will be used instead of `title`.
     */
    @Generated
    @Selector("setAttributedTitle:")
    void setAttributedTitle(NSAttributedString value);

    /**
     * The name or title of this axis.
     */
    @Generated
    @Selector("setTitle:")
    void setTitle(String value);

    /**
     * The name or title of this axis.
     */
    @Generated
    @Selector("title")
    String title();
}
