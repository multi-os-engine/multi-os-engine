package ${_PLACEHOLDER_PACKAGE_NAME}

import apple.NSObject
import apple.foundation.NSDictionary
import apple.uikit.*
import apple.uikit.c.UIKit
import apple.uikit.protocol.UIApplicationDelegate
import apple.uikit.protocol.UISplitViewControllerDelegate
import org.moe.natj.general.Pointer
import org.moe.natj.general.ann.RegisterOnStartup
import org.moe.natj.objc.ann.Selector
import ${_PLACEHOLDER_PACKAGE_NAME}.ui.DetailViewController

@RegisterOnStartup
class Main protected constructor(peer: Pointer) : NSObject(peer), UIApplicationDelegate, UISplitViewControllerDelegate {

    private var window: UIWindow? = null

    override fun applicationDidFinishLaunchingWithOptions(application: UIApplication?, launchOptions: NSDictionary<*, *>?): Boolean {
        val splitViewController = this.window!!.rootViewController() as UISplitViewController
        val navigationController = splitViewController.viewControllers().lastObject() as UINavigationController
        navigationController.topViewController().navigationItem().setLeftBarButtonItem(splitViewController.displayModeButtonItem())
        splitViewController.setDelegate(this)
        return true
    }

    override fun setWindow(value: UIWindow?) {
        window = value
    }

    override fun window(): UIWindow? {
        return window
    }

    override fun splitViewControllerCollapseSecondaryViewControllerOntoPrimaryViewController(splitViewController: UISplitViewController?, secondaryViewController: UIViewController?, primaryViewController: UIViewController?): Boolean {
        if (secondaryViewController is UINavigationController &&
                secondaryViewController.topViewController() is DetailViewController &&
                (secondaryViewController.topViewController() as DetailViewController).detailItem == null) {
            // Return YES to indicate that we have handled the collapse by doing nothing; the secondary controller will be discarded.
            return true
        } else {
            return false
        }
    }

    companion object {

        @JvmStatic fun main(args: Array<String>) {
            UIKit.UIApplicationMain(0, null, null, Main::class.java.getName())
        }

        @Selector("alloc")
        @JvmStatic external fun alloc(): Main
    }
}
