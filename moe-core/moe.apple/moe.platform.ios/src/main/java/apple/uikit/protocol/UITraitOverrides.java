package apple.uikit.protocol;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.Class;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITraitOverrides")
public interface UITraitOverrides extends UIMutableTraits {
    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("containsTrait:")
    boolean containsTrait(@NotNull Class trait);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("removeTrait:")
    void removeTrait(@NotNull Class trait);
}