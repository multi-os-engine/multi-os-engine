package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISpringLoadedInteractionSupporting")
public interface UISpringLoadedInteractionSupporting {
    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("isSpringLoaded")
    boolean isSpringLoaded();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSpringLoaded:")
    void setSpringLoaded(boolean value);
}