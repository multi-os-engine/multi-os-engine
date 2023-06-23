package apple.uikit.protocol;

import apple.uikit.UIDropInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

/**
 * Defines a text droppable control.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDroppable")
public interface UITextDroppable extends UITextInput, UITextPasteConfigurationSupporting {
    /**
     * Returns whether this control currently has at least one active drag session.
     */
    @Generated
    @Selector("isTextDropActive")
    boolean isTextDropActive();

    @Generated
    @Selector("setTextDropDelegate:")
    void setTextDropDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITextDropDelegate value);

    @Nullable
    @Generated
    @Selector("textDropDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    UITextDropDelegate textDropDelegate();

    /**
     * The text drop interaction that UIKit installs on the text control.
     * Use this to explicitly disable drop interactions on system text controls,
     * if desired.
     */
    @Nullable
    @Generated
    @Selector("textDropInteraction")
    UIDropInteraction textDropInteraction();
}