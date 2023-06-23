package apple.carplay.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@c] CPListSelectable describes list items that accept a list item handler, called when
 * the user selects this list item.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPSelectableListItem")
public interface CPSelectableListItem extends CPListTemplateItem {
    /**
     * An optional action block, fired when the user selects this item in a list template.
     * 
     * You must call the completion block after processing the user's selection.
     */
    @Nullable
    @Generated
    @Selector("handler")
    @ObjCBlock(name = "call_handler_ret")
    Block_handler_ret handler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handler_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_handler_ret {
            @Generated
            void call_Block_handler_ret();
        }

        @Generated
        void call_handler_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @ObjCBlock(name = "call_Block_handler_ret") Block_Block_handler_ret arg1);
    }

    /**
     * An optional action block, fired when the user selects this item in a list template.
     * 
     * You must call the completion block after processing the user's selection.
     */
    @Generated
    @Selector("setHandler:")
    void setHandler(@Nullable @ObjCBlock(name = "call_setHandler") Block_setHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_setHandler {
            @Generated
            void call_Block_setHandler();
        }

        @Generated
        void call_setHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @ObjCBlock(name = "call_Block_setHandler") Block_Block_setHandler arg1);
    }
}
