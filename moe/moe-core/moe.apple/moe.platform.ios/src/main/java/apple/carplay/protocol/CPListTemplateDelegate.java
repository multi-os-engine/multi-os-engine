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