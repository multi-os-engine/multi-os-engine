package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UILayoutGuideAspectFitting")
public interface UILayoutGuideAspectFitting {
    /**
     * Update the aspect ratio (width / height) for the given content
     * Defaults to 1.0. Must be > 0.0 and values may be clamped within a reasonable range of approximately 1:100 to
     * 100:1.
     */
    @Generated
    @Selector("aspectRatio")
    @NFloat
    double aspectRatio();

    /**
     * Update the aspect ratio (width / height) for the given content
     * Defaults to 1.0. Must be > 0.0 and values may be clamped within a reasonable range of approximately 1:100 to
     * 100:1.
     */
    @Generated
    @Selector("setAspectRatio:")
    void setAspectRatio(@NFloat double value);
}