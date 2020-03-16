package apple.carplay.protocol;

import apple.carplay.CPListItem;
import apple.carplay.CPSearchTemplate;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPSearchTemplateDelegate")
public interface CPSearchTemplateDelegate {
    @Generated
    @Selector("searchTemplate:selectedResult:completionHandler:")
    void searchTemplateSelectedResultCompletionHandler(CPSearchTemplate searchTemplate, CPListItem item,
            @ObjCBlock(name = "call_searchTemplateSelectedResultCompletionHandler") Block_searchTemplateSelectedResultCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_searchTemplateSelectedResultCompletionHandler {
        @Generated
        void call_searchTemplateSelectedResultCompletionHandler();
    }

    @Generated
    @Selector("searchTemplate:updatedSearchText:completionHandler:")
    void searchTemplateUpdatedSearchTextCompletionHandler(CPSearchTemplate searchTemplate, String searchText,
            @ObjCBlock(name = "call_searchTemplateUpdatedSearchTextCompletionHandler") Block_searchTemplateUpdatedSearchTextCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_searchTemplateUpdatedSearchTextCompletionHandler {
        @Generated
        void call_searchTemplateUpdatedSearchTextCompletionHandler(NSArray<? extends CPListItem> arg0);
    }

    @Generated
    @IsOptional
    @Selector("searchTemplateSearchButtonPressed:")
    default void searchTemplateSearchButtonPressed(CPSearchTemplate searchTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }
}