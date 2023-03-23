package apple.uikit.protocol;

import apple.uikit.UIImage;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIMenuLeaf")
public interface UIMenuLeaf {
    /**
     * The element's attributes.
     */
    @Generated
    @Selector("attributes")
    @NUInt
    long attributes();

    /**
     * Elaborated title used in keyboard shortcut overlay.
     */
    @Generated
    @Selector("discoverabilityTitle")
    String discoverabilityTitle();

    /**
     * Image that can appear next to this element.
     */
    @Generated
    @Selector("image")
    UIImage image();

    /**
     * Performs the element’s primary action (i.e. it's handler or selector).
     */
    @Generated
    @Selector("performWithSender:target:")
    void performWithSenderTarget(@Mapped(ObjCObjectMapper.class) Object sender,
            @Mapped(ObjCObjectMapper.class) Object target);

    /**
     * Source item for subsequent presentations. For example, an element displayed in a menu attached to a
     * [@c] UIButton may return the button so that a popover may be presented from it when the element is tapped.
     * If available, this property is only populated during the execution of the element's action (i.e. its handler or
     * selector).
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("presentationSourceItem")
    @MappedReturn(ObjCObjectMapper.class)
    UIPopoverPresentationControllerSourceItem presentationSourceItem();

    /**
     * The object on behalf of which the element's primary action is being performed.
     * This property is only populated during the execution of the element's
     * primary action (i.e. its handler or selector) if available.
     */
    @Generated
    @Selector("sender")
    @MappedReturn(ObjCObjectMapper.class)
    Object sender();

    /**
     * The element's attributes.
     */
    @Generated
    @Selector("setAttributes:")
    void setAttributes(@NUInt long value);

    /**
     * Elaborated title used in keyboard shortcut overlay.
     */
    @Generated
    @Selector("setDiscoverabilityTitle:")
    void setDiscoverabilityTitle(String value);

    /**
     * Image that can appear next to this element.
     */
    @Generated
    @Selector("setImage:")
    void setImage(UIImage value);

    /**
     * The element's selection state.
     */
    @Generated
    @Selector("setState:")
    void setState(@NInt long value);

    /**
     * Short display title.
     */
    @Generated
    @Selector("setTitle:")
    void setTitle(String value);

    /**
     * The element's selection state.
     */
    @Generated
    @Selector("state")
    @NInt
    long state();

    /**
     * Short display title.
     */
    @Generated
    @Selector("title")
    String title();
}