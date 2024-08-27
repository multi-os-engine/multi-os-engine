package apple.uikit.protocol;

import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextFormattingCoordinatorDelegate")
public interface UITextFormattingCoordinatorDelegate {
    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("updateTextAttributesWithConversionHandler:")
    void updateTextAttributesWithConversionHandler(
            @NotNull @ObjCBlock(name = "call_updateTextAttributesWithConversionHandler") Block_updateTextAttributesWithConversionHandler conversionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateTextAttributesWithConversionHandler {
        @NotNull
        @Generated
        NSDictionary<String, ?> call_updateTextAttributesWithConversionHandler(@NotNull NSDictionary<String, ?> arg0);
    }
}