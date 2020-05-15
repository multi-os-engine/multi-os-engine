package apple.uikit.protocol;

import apple.uikit.UISpringLoadedInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISpringLoadedInteractionEffect")
public interface UISpringLoadedInteractionEffect {
    @Generated
    @Selector("interaction:didChangeWithContext:")
    void interactionDidChangeWithContext(UISpringLoadedInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context);
}