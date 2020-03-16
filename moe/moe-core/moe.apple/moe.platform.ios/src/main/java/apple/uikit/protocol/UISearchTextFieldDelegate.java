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
    @Generated
    @IsOptional
    @Selector("searchTextField:itemProviderForCopyingToken:")
    default NSItemProvider searchTextFieldItemProviderForCopyingToken(UISearchTextField searchTextField,
            UISearchToken token) {
        throw new java.lang.UnsupportedOperationException();
    }
}