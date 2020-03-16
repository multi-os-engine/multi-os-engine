package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.uikit.UIAction;
import apple.uikit.UICommand;
import apple.uikit.UIMenu;
import apple.uikit.UIMenuElement;
import apple.uikit.UIMenuSystem;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIMenuBuilder")
public interface UIMenuBuilder {
    @Generated
    @Selector("actionForIdentifier:")
    UIAction actionForIdentifier(String identifier);

    @Generated
    @Selector("commandForAction:propertyList:")
    UICommand commandForActionPropertyList(SEL action, @Mapped(ObjCObjectMapper.class) Object propertyList);

    @Generated
    @Selector("insertChildMenu:atEndOfMenuForIdentifier:")
    void insertChildMenuAtEndOfMenuForIdentifier(UIMenu childMenu, String parentIdentifier);

    @Generated
    @Selector("insertChildMenu:atStartOfMenuForIdentifier:")
    void insertChildMenuAtStartOfMenuForIdentifier(UIMenu childMenu, String parentIdentifier);

    @Generated
    @Selector("insertSiblingMenu:afterMenuForIdentifier:")
    void insertSiblingMenuAfterMenuForIdentifier(UIMenu siblingMenu, String siblingIdentifier);

    @Generated
    @Selector("insertSiblingMenu:beforeMenuForIdentifier:")
    void insertSiblingMenuBeforeMenuForIdentifier(UIMenu siblingMenu, String siblingIdentifier);

    @Generated
    @Selector("menuForIdentifier:")
    UIMenu menuForIdentifier(String identifier);

    @Generated
    @Selector("removeMenuForIdentifier:")
    void removeMenuForIdentifier(String removedIdentifier);

    @Generated
    @Selector("replaceChildrenOfMenuForIdentifier:fromChildrenBlock:")
    void replaceChildrenOfMenuForIdentifierFromChildrenBlock(String parentIdentifier,
            @ObjCBlock(name = "call_replaceChildrenOfMenuForIdentifierFromChildrenBlock") Block_replaceChildrenOfMenuForIdentifierFromChildrenBlock childrenBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_replaceChildrenOfMenuForIdentifierFromChildrenBlock {
        @Generated
        NSArray<? extends UIMenuElement> call_replaceChildrenOfMenuForIdentifierFromChildrenBlock(
                NSArray<? extends UIMenuElement> arg0);
    }

    @Generated
    @Selector("replaceMenuForIdentifier:withMenu:")
    void replaceMenuForIdentifierWithMenu(String replacedIdentifier, UIMenu replacementMenu);

    @Generated
    @Selector("system")
    UIMenuSystem system();
}