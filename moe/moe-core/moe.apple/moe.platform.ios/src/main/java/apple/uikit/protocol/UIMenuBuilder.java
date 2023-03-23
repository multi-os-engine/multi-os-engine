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

/**
 * Encapsulates access and mutation for a menu hierarchy.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIMenuBuilder")
public interface UIMenuBuilder {
    /**
     * Fetch the identified action.
     * 
     * @param identifier The identifier of the action to fetch.
     * @return The action with the given identifier, or `nil` if no such action.
     */
    @Generated
    @Selector("actionForIdentifier:")
    UIAction actionForIdentifier(String identifier);

    /**
     * Fetch the identified command.
     * 
     * @param action       The action of the command to fetch.
     * @param propertyList Property list object to distinguish commands, if needed.
     * @return The command with the given action and property list, or `nil` if no such command.
     */
    @Generated
    @Selector("commandForAction:propertyList:")
    UICommand commandForActionPropertyList(SEL action, @Mapped(ObjCObjectMapper.class) Object propertyList);

    /**
     * Insert a child menu at the end of an identified parent menu.
     * 
     * @param childGroup       The child menu to insert.
     * @param parentIdentifier The identifier of the parent menu to insert at the end of.
     */
    @Generated
    @Selector("insertChildMenu:atEndOfMenuForIdentifier:")
    void insertChildMenuAtEndOfMenuForIdentifier(UIMenu childMenu, String parentIdentifier);

    /**
     * Insert a child menu at the start of an identified parent menu.
     * 
     * @param childGroup       The child menu to insert.
     * @param parentIdentifier The identifier of the parent menu to insert at the start of.
     */
    @Generated
    @Selector("insertChildMenu:atStartOfMenuForIdentifier:")
    void insertChildMenuAtStartOfMenuForIdentifier(UIMenu childMenu, String parentIdentifier);

    /**
     * Insert a sibling menu after an identified sibling menu.
     * 
     * @param siblingGroup      The sibling menu to insert.
     * @param siblingIdentifier The identifier of the sibling menu to insert after.
     */
    @Generated
    @Selector("insertSiblingMenu:afterMenuForIdentifier:")
    void insertSiblingMenuAfterMenuForIdentifier(UIMenu siblingMenu, String siblingIdentifier);

    /**
     * Insert a sibling menu before an identified sibling menu.
     * 
     * @param siblingGroup      The sibling menu to insert.
     * @param siblingIdentifier The identifier of the sibling menu to insert before.
     */
    @Generated
    @Selector("insertSiblingMenu:beforeMenuForIdentifier:")
    void insertSiblingMenuBeforeMenuForIdentifier(UIMenu siblingMenu, String siblingIdentifier);

    /**
     * Fetch the identified menu.
     * 
     * @param identifier The identifier of the menu to fetch.
     * @return The menu with the given identifier, or `nil` if no such menu.
     */
    @Generated
    @Selector("menuForIdentifier:")
    UIMenu menuForIdentifier(String identifier);

    /**
     * Remove an identified menu.
     * 
     * @param removedIdentifier The menu to remove.
     */
    @Generated
    @Selector("removeMenuForIdentifier:")
    void removeMenuForIdentifier(String removedIdentifier);

    /**
     * Replace the children of an identified parent menu.
     * 
     * @param parentIdentifier The identifier of the parent menu.
     * @param childrenBlock    A block that returns the new children, given the old children.
     */
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

    /**
     * Replace an identified menu with a menu.
     * 
     * @param replacedIdentifier The identifier of the menu to be replaced.
     * @param replacementGroup   The replacement menu.
     */
    @Generated
    @Selector("replaceMenuForIdentifier:withMenu:")
    void replaceMenuForIdentifierWithMenu(String replacedIdentifier, UIMenu replacementMenu);

    /**
     * Which system we are building for.
     */
    @Generated
    @Selector("system")
    UIMenuSystem system();
}
