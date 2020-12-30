package apple.uikit.protocol;

import apple.foundation.NSItemProvider;
import apple.uikit.UISearchTextField;
import apple.uikit.UISearchToken;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISearchTextFieldDelegate")
public interface UISearchTextFieldDelegate extends UITextFieldDelegate {
    /**
     * Implements cut and copy of tokens.
     * 
     * To support drag and drop and the Cut and Copy commands, your delegate must implement this method and return an NSItemProvider for the requested token. The field’s textPasteDelegate is responsible for implementing pasting of tokens. Your delegate can provide a plain text representation for pasting in other contexts, but should register a custom type identifier so it can recognize and reconstruct the token when pasted into the same field.
     * 
     * This method will only be called if either of the field’s allowsCopyingTokens or allowsDeletingTokens properties is true.
     */
    @Generated
    @IsOptional
    @Selector("searchTextField:itemProviderForCopyingToken:")
    default NSItemProvider searchTextFieldItemProviderForCopyingToken(UISearchTextField searchTextField,
            UISearchToken token) {
        throw new java.lang.UnsupportedOperationException();
    }
}