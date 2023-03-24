package apple.uikit.protocol;

import apple.uikit.UISearchToken;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * A protocol that refines UITextPasteItem to support pasting of tokens.
 * 
 * Paste items vended by UISearchTextField conform to this protocol.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISearchTextFieldPasteItem")
public interface UISearchTextFieldPasteItem extends UITextPasteItem {
    /**
     * Transforms this paste item into a token at the end of the search text field’s token array.
     */
    @Generated
    @Selector("setSearchTokenResult:")
    void setSearchTokenResult(@NotNull UISearchToken token);
}
