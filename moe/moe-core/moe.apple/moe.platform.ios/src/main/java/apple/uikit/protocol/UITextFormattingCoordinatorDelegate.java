package apple.uikit.protocol;

import apple.foundation.NSDictionary;
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
@ObjCProtocolName("UITextFormattingCoordinatorDelegate")
public interface UITextFormattingCoordinatorDelegate {
    @Generated
    @Selector("updateTextAttributesWithConversionHandler:")
    void updateTextAttributesWithConversionHandler(
            @ObjCBlock(name = "call_updateTextAttributesWithConversionHandler") Block_updateTextAttributesWithConversionHandler conversionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateTextAttributesWithConversionHandler {
        @Generated
        NSDictionary<String, ?> call_updateTextAttributesWithConversionHandler(NSDictionary<String, ?> arg0);
    }
}