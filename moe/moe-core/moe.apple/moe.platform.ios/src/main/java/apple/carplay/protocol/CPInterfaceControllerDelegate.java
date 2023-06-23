package apple.carplay.protocol;

import apple.carplay.CPTemplate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * CPInterfaceControllerDelegate allows your app to observe template visibility lifecycles for
 * the templates presented by your app.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPInterfaceControllerDelegate")
public interface CPInterfaceControllerDelegate {
    @Generated
    @IsOptional
    @Selector("templateDidAppear:animated:")
    default void templateDidAppearAnimated(@NotNull CPTemplate aTemplate, boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("templateDidDisappear:animated:")
    default void templateDidDisappearAnimated(@NotNull CPTemplate aTemplate, boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("templateWillAppear:animated:")
    default void templateWillAppearAnimated(@NotNull CPTemplate aTemplate, boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("templateWillDisappear:animated:")
    default void templateWillDisappearAnimated(@NotNull CPTemplate aTemplate, boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }
}