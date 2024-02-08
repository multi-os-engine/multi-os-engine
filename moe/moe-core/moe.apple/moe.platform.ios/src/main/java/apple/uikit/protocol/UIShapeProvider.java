package apple.uikit.protocol;

import apple.uikit.UIResolvedShape;
import apple.uikit.UIShapeResolutionContext;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A type that can provide a custom `UIShape`, resolved dynamically based on
 * context.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIShapeProvider")
public interface UIShapeProvider {
    /**
     * Resolves this shape in the provided `context`.
     */
    @Generated
    @Selector("resolvedShapeInContext:")
    @NotNull
    UIResolvedShape resolvedShapeInContext(@NotNull UIShapeResolutionContext context);
}