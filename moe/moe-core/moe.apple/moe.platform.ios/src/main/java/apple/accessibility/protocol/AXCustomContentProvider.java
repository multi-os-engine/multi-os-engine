package apple.accessibility.protocol;

import apple.accessibility.AXCustomContent;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AXCustomContentProvider")
public interface AXCustomContentProvider {
    @Generated
    @Selector("accessibilityCustomContent")
    NSArray<? extends AXCustomContent> accessibilityCustomContent();

    @Generated
    @Selector("setAccessibilityCustomContent:")
    void setAccessibilityCustomContent(NSArray<? extends AXCustomContent> value);
}
