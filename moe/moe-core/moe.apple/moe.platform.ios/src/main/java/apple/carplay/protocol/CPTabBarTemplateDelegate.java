package apple.carplay.protocol;

import apple.carplay.CPTabBarTemplate;
import apple.carplay.CPTemplate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 14.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPTabBarTemplateDelegate")
public interface CPTabBarTemplateDelegate {
    /**
     * The user has selected one of the tabs in the tab bar template, bringing the selected template to the foreground.
     */
    @Generated
    @Selector("tabBarTemplate:didSelectTemplate:")
    void tabBarTemplateDidSelectTemplate(@NotNull CPTabBarTemplate tabBarTemplate,
            @NotNull CPTemplate selectedTemplate);
}