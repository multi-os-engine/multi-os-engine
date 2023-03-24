package apple.uikit.protocol;

import apple.uikit.UIDragInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

/**
 * Defines a text draggable control.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDraggable")
public interface UITextDraggable extends UITextInput {
    /**
     * Returns whether this control currently has at least one active drag session.
     */
    @Generated
    @Selector("isTextDragActive")
    boolean isTextDragActive();

    @Generated
    @Selector("setTextDragDelegate:")
    void setTextDragDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITextDragDelegate value);

    @Generated
    @Selector("setTextDragOptions:")
    void setTextDragOptions(@NInt long value);

    @Nullable
    @Generated
    @Selector("textDragDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    UITextDragDelegate textDragDelegate();

    /**
     * The text drag interaction that UIKit installs on the text control.
     * Use this to explicitly disable drag interactions on system text controls,
     * if desired.
     */
    @Nullable
    @Generated
    @Selector("textDragInteraction")
    UIDragInteraction textDragInteraction();

    @Generated
    @Selector("textDragOptions")
    @NInt
    long textDragOptions();
}