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

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPSelectableListItem")
public interface CPSelectableListItem extends CPListTemplateItem {
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
        void call_handler_ret(@Mapped(ObjCObjectMapper.class) Object arg0,
                @ObjCBlock(name = "call_Block_handler_ret") Block_Block_handler_ret arg1);
    }

    @Generated
    @Selector("setHandler:")
    void setHandler(@ObjCBlock(name = "call_setHandler") Block_setHandler value);

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
        void call_setHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                @ObjCBlock(name = "call_Block_setHandler") Block_Block_setHandler arg1);
    }
}