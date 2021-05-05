package apple.uikit.protocol;

import apple.coregraphics.struct.CGSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIItemProviderPresentationSizeProviding")
public interface UIItemProviderPresentationSizeProviding {
    /**
     * Implement this on an object which conforms to the NSItemProviderWriting protocol.
     * When the object is registered to NSItemProvider, this property will be used to automatically set
     * the `preferredPresentationSize` property on NSItemProvider.
     * Return CGSizeZero to indicate that this information is not available.
     */
    @Generated
    @Selector("preferredPresentationSizeForItemProvider")
    @ByValue
    CGSize preferredPresentationSizeForItemProvider();
}