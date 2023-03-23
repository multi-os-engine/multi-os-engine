package apple.sharedwithyou.protocol;

import apple.sharedwithyou.SWCollaborationView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.0
 */
@Generated
@Library("SharedWithYou")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SWCollaborationViewDelegate")
public interface SWCollaborationViewDelegate {
    @Generated
    @IsOptional
    @Selector("collaborationViewDidDismissPopover:")
    default void collaborationViewDidDismissPopover(SWCollaborationView collaborationView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collaborationViewShouldPresentPopover:")
    default boolean collaborationViewShouldPresentPopover(SWCollaborationView collaborationView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collaborationViewWillPresentPopover:")
    default void collaborationViewWillPresentPopover(SWCollaborationView collaborationView) {
        throw new java.lang.UnsupportedOperationException();
    }
}