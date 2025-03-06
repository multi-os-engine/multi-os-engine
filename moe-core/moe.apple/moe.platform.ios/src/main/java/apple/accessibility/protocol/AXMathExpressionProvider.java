package apple.accessibility.protocol;

import apple.accessibility.AXMathExpression;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AXMathExpressionProvider")
public interface AXMathExpressionProvider {
    /**
     * Implement this method on an accessibility object for it to return a formatted math expression to be output.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityMathExpression")
    @Nullable
    AXMathExpression accessibilityMathExpression();
}