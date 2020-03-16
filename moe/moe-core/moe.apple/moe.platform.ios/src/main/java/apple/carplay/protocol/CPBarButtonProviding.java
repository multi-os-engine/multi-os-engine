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

    @Generated
    @Selector("leadingNavigationBarButtons")
    NSArray<? extends CPBarButton> leadingNavigationBarButtons();

    @Generated
    @Selector("setBackButton:")
    void setBackButton(CPBarButton value);

    @Generated
    @Selector("setLeadingNavigationBarButtons:")
    void setLeadingNavigationBarButtons(NSArray<? extends CPBarButton> value);

    @Generated
    @Selector("setTrailingNavigationBarButtons:")
    void setTrailingNavigationBarButtons(NSArray<? extends CPBarButton> value);

    @Generated
    @Selector("trailingNavigationBarButtons")
    NSArray<? extends CPBarButton> trailingNavigationBarButtons();
}