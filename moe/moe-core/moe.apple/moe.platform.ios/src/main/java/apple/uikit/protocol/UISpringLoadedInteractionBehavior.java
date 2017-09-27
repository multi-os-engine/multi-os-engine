package apple.uikit.protocol;

import apple.uikit.UISpringLoadedInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISpringLoadedInteractionBehavior")
public interface UISpringLoadedInteractionBehavior {
    @Generated
    @IsOptional
    @Selector("interactionDidFinish:")
    default void interactionDidFinish(UISpringLoadedInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("shouldAllowInteraction:withContext:")
    boolean shouldAllowInteractionWithContext(UISpringLoadedInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object context);
}