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
    /**
     * The user has selected an item in the search result list.
     * 
     * @param searchTemplate The search template in use by the user
     * @param item The item selected by the user
     * @param completionHandler You must call the completionHandler when you have handled the row selection in the search result
     */
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

    /**
     * The user has entered characters in the search text field.
     * 
     * @param searchTemplate The search template in use by the user
     * @param searchText The search text entered by the user
     * @param completionHandler You must call the completionHandler with updated search results
     */
    @Generated
    @Selector("searchTemplate:updatedSearchText:completionHandler:")
    void searchTemplateUpdatedSearchTextCompletionHandler(CPSearchTemplate searchTemplate, String searchText,
            @ObjCBlock(name = "call_searchTemplateUpdatedSearchTextCompletionHandler") Block_searchTemplateUpdatedSearchTextCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_searchTemplateUpdatedSearchTextCompletionHandler {
        @Generated
        void call_searchTemplateUpdatedSearchTextCompletionHandler(NSArray<? extends CPListItem> searchResults);
    }

    /**
     * The user has selected the keyboard's search button. Generally, you should push a @c CPListTemplate containing the current search results.
     * 
     * @param searchTemplate The search template in use by the user
     */
    @Generated
    @IsOptional
    @Selector("searchTemplateSearchButtonPressed:")
    default void searchTemplateSearchButtonPressed(CPSearchTemplate searchTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }
}