package apple.uikit.protocol;

import apple.uikit.UISearchToken;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISearchTextFieldPasteItem")
public interface UISearchTextFieldPasteItem extends UITextPasteItem {
    @Generated
    @Selector("setSearchTokenResult:")
    void setSearchTokenResult(UISearchToken token);
}