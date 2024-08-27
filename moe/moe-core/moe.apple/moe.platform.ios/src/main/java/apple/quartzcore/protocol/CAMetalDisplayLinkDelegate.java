package apple.quartzcore.protocol;

import apple.quartzcore.CAMetalDisplayLink;
import apple.quartzcore.CAMetalDisplayLinkUpdate;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CAMetalDisplayLinkDelegate")
public interface CAMetalDisplayLinkDelegate {
    @Generated
    @Selector("metalDisplayLink:needsUpdate:")
    void metalDisplayLinkNeedsUpdate(@NotNull CAMetalDisplayLink link, @NotNull CAMetalDisplayLinkUpdate update);
}