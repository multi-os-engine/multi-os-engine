package apple.uikit.protocol;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITabBarControllerSidebarAnimating")
public interface UITabBarControllerSidebarAnimating {
    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("addAnimations:")
    void addAnimations(@ObjCBlock(name = "call_addAnimations") @NotNull Block_addAnimations animations);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAnimations {
        @Generated
        void call_addAnimations();
    }

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("addCompletion:")
    void addCompletion(@ObjCBlock(name = "call_addCompletion") @NotNull Block_addCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCompletion {
        @Generated
        void call_addCompletion();
    }
}