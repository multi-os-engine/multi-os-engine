package apple.uikit.protocol;

import apple.uikit.UITextInteraction;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextInteractionDelegate")
public interface UITextInteractionDelegate {
    @Generated
    @IsOptional
    @Selector("interactionDidEnd:")
    default void interactionDidEnd(@NotNull UITextInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("interactionShouldBegin:atPoint:")
    default boolean interactionShouldBeginAtPoint(@NotNull UITextInteraction interaction, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("interactionWillBegin:")
    default void interactionWillBegin(@NotNull UITextInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}