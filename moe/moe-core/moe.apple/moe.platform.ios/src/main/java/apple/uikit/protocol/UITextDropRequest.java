package apple.uikit.protocol;

import apple.uikit.UITextDropProposal;
import apple.uikit.UITextPosition;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDropRequest")
public interface UITextDropRequest {
    /**
     * The text position that the drag is over.
     */
    @Generated
    @Selector("dropPosition")
    UITextPosition dropPosition();

    /**
     * The current drop session. Use this to get the location of the
     * session in the view, for example.
     */
    @Generated
    @Selector("dropSession")
    @MappedReturn(ObjCObjectMapper.class)
    UIDropSession dropSession();

    /**
     * Returns whether the drop is a local drop
     * (that is, the drag and drop are in the same text control).
     */
    @Generated
    @Selector("isSameView")
    boolean isSameView();

    /**
     * The suggested proposal by the text control.
     */
    @Generated
    @Selector("suggestedProposal")
    UITextDropProposal suggestedProposal();
}