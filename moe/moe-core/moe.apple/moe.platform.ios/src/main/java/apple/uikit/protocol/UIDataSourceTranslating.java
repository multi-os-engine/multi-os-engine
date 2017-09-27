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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDataSourceTranslating")
public interface UIDataSourceTranslating {
    @Generated
    @Selector("dataSourceIndexPathForPresentationIndexPath:")
    NSIndexPath dataSourceIndexPathForPresentationIndexPath(NSIndexPath presentationIndexPath);

    @Generated
    @Selector("dataSourceSectionIndexForPresentationSectionIndex:")
    @NInt
    long dataSourceSectionIndexForPresentationSectionIndex(@NInt long presentationSectionIndex);

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

    @Generated
    @Selector("presentationIndexPathForDataSourceIndexPath:")
    NSIndexPath presentationIndexPathForDataSourceIndexPath(NSIndexPath dataSourceIndexPath);

    @Generated
    @Selector("presentationSectionIndexForDataSourceSectionIndex:")
    @NInt
    long presentationSectionIndexForDataSourceSectionIndex(@NInt long dataSourceSectionIndex);
}