package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPointerInteractionAnimating")
public interface UIPointerInteractionAnimating {
    @Generated
    @Selector("addAnimations:")
    void addAnimations(@ObjCBlock(name = "call_addAnimations") Block_addAnimations animations);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAnimations {
        @Generated
        void call_addAnimations();
    }

    @Generated
    @Selector("addCompletion:")
    void addCompletion(@ObjCBlock(name = "call_addCompletion") Block_addCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCompletion {
        @Generated
        void call_addCompletion(boolean arg0);
    }
}