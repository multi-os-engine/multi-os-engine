package apple.carplay.protocol;

import apple.carplay.CPListItem;
import apple.carplay.CPListTemplate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPListTemplateDelegate")
public interface CPListTemplateDelegate {
    /**
     * The user has selected an item in the list template.
     * 
     * Your app has an opportunity to perform any necessary operations to prepare for completing
     * this item selection. The list template will display a spinner after a short delay.
     * 
     * You must call the completion block after your app has finished loading and updated its UI.
     * 
     * @param listTemplate The list template containing this item
     * @param item The item selected by the user
     * @param completionHandler A completion block you must call after you have updated your UI.
     */
    @Generated
    @Selector("listTemplate:didSelectListItem:completionHandler:")
    void listTemplateDidSelectListItemCompletionHandler(CPListTemplate listTemplate, CPListItem item,
            @ObjCBlock(name = "call_listTemplateDidSelectListItemCompletionHandler") Block_listTemplateDidSelectListItemCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_listTemplateDidSelectListItemCompletionHandler {
        @Generated
        void call_listTemplateDidSelectListItemCompletionHandler();
    }
}