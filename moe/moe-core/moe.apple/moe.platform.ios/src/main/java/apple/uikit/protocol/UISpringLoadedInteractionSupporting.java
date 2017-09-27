package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISpringLoadedInteractionSupporting")
public interface UISpringLoadedInteractionSupporting {
    @Generated
    @Selector("isSpringLoaded")
    boolean isSpringLoaded();

    @Generated
    @Selector("setSpringLoaded:")
    void setSpringLoaded(boolean value);
}