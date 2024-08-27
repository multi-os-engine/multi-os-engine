package ${_PLACEHOLDER_PACKAGE_NAME};

import apple.NSObject;
import apple.foundation.NSDictionary;
import apple.uikit.UIApplication;
import apple.uikit.UINavigationController;
import apple.uikit.UISplitViewController;
import apple.uikit.UIViewController;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;
import apple.uikit.protocol.UISplitViewControllerDelegate;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.Selector;

import ${_PLACEHOLDER_PACKAGE_NAME}.ui.DetailViewController;

@RegisterOnStartup
public class Main extends NSObject implements UIApplicationDelegate, UISplitViewControllerDelegate {

    public static void main(String[] args) {
        UIKit.UIApplicationMain(0, null, null, Main.class.getName());
    }

    @Selector("alloc")
    public static native Main alloc();

    protected Main(Pointer peer) {
        super(peer);
    }

    private UIWindow window;

    @Override
    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application, NSDictionary launchOptions) {
        UISplitViewController splitViewController = (UISplitViewController)this.window.rootViewController();
        UINavigationController navigationController = (UINavigationController) splitViewController.viewControllers().lastObject();
        navigationController.topViewController().navigationItem().setLeftBarButtonItem(splitViewController.displayModeButtonItem());
        splitViewController.setDelegate(this);
        return true;
    }

    @Override
    public void setWindow(UIWindow value) {
        window = value;
    }

    @Override
    public UIWindow window() {
        return window;
    }

    @Override
    public boolean splitViewControllerCollapseSecondaryViewControllerOntoPrimaryViewController(UISplitViewController splitViewController, UIViewController secondaryViewController, UIViewController primaryViewController) {
        if (secondaryViewController instanceof UINavigationController &&
                ((UINavigationController)secondaryViewController).topViewController() instanceof DetailViewController &&
                ((DetailViewController)((UINavigationController)secondaryViewController).topViewController()).getDetailItem() == null) {
            // Return YES to indicate that we have handled the collapse by doing nothing; the secondary controller will be discarded.
            return true;
        } else {
            return false;
        }
    }
}
