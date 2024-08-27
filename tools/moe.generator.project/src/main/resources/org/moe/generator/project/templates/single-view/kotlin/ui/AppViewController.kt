package ${_PLACEHOLDER_PACKAGE_NAME}.ui

import apple.uikit.UIViewController
import org.moe.natj.general.Pointer
import org.moe.natj.general.ann.Owned
import org.moe.natj.general.ann.RegisterOnStartup
import org.moe.natj.objc.ObjCRuntime
import org.moe.natj.objc.ann.ObjCClassName
import org.moe.natj.objc.ann.Selector

@org.moe.natj.general.ann.Runtime(ObjCRuntime::class)
@ObjCClassName("AppViewController")
@RegisterOnStartup
class AppViewController protected constructor(peer: Pointer) : UIViewController(peer) {

    @Selector("init")
    override external fun init(): AppViewController

    companion object {

        @Owned
        @Selector("alloc")
        @JvmStatic external fun alloc(): AppViewController
    }
}
