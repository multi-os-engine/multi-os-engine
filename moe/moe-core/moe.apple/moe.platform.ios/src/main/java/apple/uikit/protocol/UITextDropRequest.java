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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDropRequest")
public interface UITextDropRequest {
    @Generated
    @Selector("dropPosition")
    UITextPosition dropPosition();

    @Generated
    @Selector("dropSession")
    @MappedReturn(ObjCObjectMapper.class)
    UIDropSession dropSession();

    @Generated
    @Selector("isSameView")
    boolean isSameView();

    @Generated
    @Selector("suggestedProposal")
    UITextDropProposal suggestedProposal();
}