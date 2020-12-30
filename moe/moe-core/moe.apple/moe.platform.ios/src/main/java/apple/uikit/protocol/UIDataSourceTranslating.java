package apple.uikit.protocol;

import apple.foundation.NSIndexPath;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * For advanced clients with data model centric layouts (i.e. the layout refers to the data source
 * to gather information in order to create UICollectionViewLayoutAttributes) this protocol allows
 * translation between the data source index path into the presentation index path (i.e. layout) state.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDataSourceTranslating")
public interface UIDataSourceTranslating {
    /**
     * Translate (if needed) a Presentation index path to the Data Source index path.
     * If the item was inserted at the index path, this will return nil.
     * If no effective change took place, will return passed value.
     */
    @Generated
    @Selector("dataSourceIndexPathForPresentationIndexPath:")
    NSIndexPath dataSourceIndexPathForPresentationIndexPath(NSIndexPath presentationIndexPath);

    /**
     * Translate (if needed) a Presentation section index to its Data Source section index value.
     * If section was inserted and not known the Data Source, this will return NSNotFound.
     * If no effective change took place, will return passed value.
     */
    @Generated
    @Selector("dataSourceSectionIndexForPresentationSectionIndex:")
    @NInt
    long dataSourceSectionIndexForPresentationSectionIndex(@NInt long presentationSectionIndex);

    /**
     * Arguments passed to actions performed inside the scope of this block will be interpreted as values in the presentation state,
     * and the values returned from these actions will also be in the presentation state.
     */
    @Generated
    @Selector("performUsingPresentationValues:")
    void performUsingPresentationValues(
            @ObjCBlock(name = "call_performUsingPresentationValues") Block_performUsingPresentationValues actionsToTranslate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performUsingPresentationValues {
        @Generated
        void call_performUsingPresentationValues();
    }

    /**
     * Translate (if needed) a Data Source index path to the Presentation index path.
     * If the item was deleted at the index path, this will return nil.
     * If no effective change took place, will return passed value.
     */
    @Generated
    @Selector("presentationIndexPathForDataSourceIndexPath:")
    NSIndexPath presentationIndexPathForDataSourceIndexPath(NSIndexPath dataSourceIndexPath);

    /**
     * Translate (if needed) a Data Source section index to its Presentation section index value.
     * If section was deleted during a transaction, this will return NSNotFound.
     * If no effective change took place, will return passed value.
     */
    @Generated
    @Selector("presentationSectionIndexForDataSourceSectionIndex:")
    @NInt
    long presentationSectionIndexForDataSourceSectionIndex(@NInt long dataSourceSectionIndex);
}