package apple.carplay.protocol;

import apple.carplay.CPBarButton;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPBarButtonProviding")
public interface CPBarButtonProviding {
    @Generated
    @Selector("backButton")
    CPBarButton backButton();

    /**
     * An array of bar buttons to be displayed on the leading side of the navigation bar.
     * <p>
     * [@note] The navigation bar may display a maximum of 2 buttons in the leading space.
     * Setting more than 2 buttons to this property will only display the first 2 buttons.
     */
    @Generated
    @Selector("leadingNavigationBarButtons")
    NSArray<? extends CPBarButton> leadingNavigationBarButtons();

    @Generated
    @Selector("setBackButton:")
    void setBackButton(CPBarButton value);

    /**
     * An array of bar buttons to be displayed on the leading side of the navigation bar.
     * <p>
     * [@note] The navigation bar may display a maximum of 2 buttons in the leading space.
     * Setting more than 2 buttons to this property will only display the first 2 buttons.
     */
    @Generated
    @Selector("setLeadingNavigationBarButtons:")
    void setLeadingNavigationBarButtons(NSArray<? extends CPBarButton> value);

    /**
     * An array of bar buttons to be displayed on the trailing side of the navigation bar.
     * <p>
     * [@note] The navigation bar may display a maximum of 2 buttons in the trailing space.
     * Setting more than 2 buttons to this property will only display the first 2 buttons.
     */
    @Generated
    @Selector("setTrailingNavigationBarButtons:")
    void setTrailingNavigationBarButtons(NSArray<? extends CPBarButton> value);

    /**
     * An array of bar buttons to be displayed on the trailing side of the navigation bar.
     * <p>
     * [@note] The navigation bar may display a maximum of 2 buttons in the trailing space.
     * Setting more than 2 buttons to this property will only display the first 2 buttons.
     */
    @Generated
    @Selector("trailingNavigationBarButtons")
    NSArray<? extends CPBarButton> trailingNavigationBarButtons();
}
