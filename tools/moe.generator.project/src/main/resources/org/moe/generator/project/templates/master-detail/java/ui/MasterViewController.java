package ${_PLACEHOLDER_PACKAGE_NAME}.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import java.util.ArrayList;
import java.util.Date;

import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.uikit.UIBarButtonItem;
import apple.uikit.UINavigationController;
import apple.uikit.UIStoryboardSegue;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewController;
import apple.uikit.enums.UIBarButtonSystemItem;
import apple.uikit.enums.UITableViewCellEditingStyle;
import apple.uikit.enums.UITableViewRowAnimation;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("MasterViewController")
@RegisterOnStartup
public class MasterViewController extends UITableViewController {

    @Owned
    @Selector("alloc")
    public static native MasterViewController alloc();

    @Selector("init")
    public native MasterViewController init();

    protected MasterViewController(Pointer peer) {
        super(peer);
    }

    private DetailViewController detailViewController;

    private ArrayList<String> objects = new ArrayList<>();

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        // Do any additional setup after loading the view, typically from a nib.
        navigationItem().setLeftBarButtonItem(editButtonItem());

        UIBarButtonItem addButton = UIBarButtonItem.alloc()
                .initWithBarButtonSystemItemTargetAction(UIBarButtonSystemItem.Add, this, new SEL
                        ("insertNewObject:"));
        navigationItem().setRightBarButtonItem(addButton);
        detailViewController = (DetailViewController) ((UINavigationController)
                splitViewController().viewControllers().lastObject()).topViewController();
    }

    @Override
    public void viewWillAppear(boolean animated) {
        setClearsSelectionOnViewWillAppear(splitViewController().isCollapsed());
        super.viewWillAppear(animated);
    }

    @Selector("insertNewObject:")
    public void insertNewObject(Object sender) {
        objects.add(0, new Date().toString());
        NSIndexPath indexPath = NSIndexPath.indexPathForRowInSection(0, 0);
        tableView().insertRowsAtIndexPathsWithRowAnimation((NSArray<? extends NSIndexPath>)
                NSArray.arrayWithObject(indexPath), UITableViewRowAnimation.Automatic);
    }

    @Override
    public void prepareForSegueSender(UIStoryboardSegue segue, @Mapped(ObjCObjectMapper.class)
            Object sender) {
        if (segue.identifier().equals("showDetail")) {
            NSIndexPath indexPath = tableView().indexPathForSelectedRow();
            final String object = objects.get((int) indexPath.row());
            final DetailViewController controller = (DetailViewController) (
                    (UINavigationController) segue.destinationViewController()).topViewController();
            controller.setDetailItem(object);
            controller.navigationItem().setLeftBarButtonItem(splitViewController()
                    .displayModeButtonItem());
            controller.navigationItem().setLeftItemsSupplementBackButton(true);
        }
    }

    @Override
    public long numberOfSectionsInTableView(UITableView uiTableView) {
        return 1;
    }

    @Override
    public long tableViewNumberOfRowsInSection(UITableView uiTableView, @NInt long l) {
        return objects.size();
    }

    @Override
    public UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath
            indexPath) {
        final UITableViewCell cell = tableView.dequeueReusableCellWithIdentifierForIndexPath
                ("Cell", indexPath);

        final String object = objects.get((int) indexPath.row());
        cell.textLabel().setText(object);
        return cell;
    }

    @Override
    public boolean tableViewCanEditRowAtIndexPath(UITableView uiTableView, NSIndexPath
            nsIndexPath) {
        return true;
    }

    @Override
    public void tableViewCommitEditingStyleForRowAtIndexPath(UITableView tableView, @NInt long
            editingStyle, NSIndexPath indexPath) {
        if (editingStyle == UITableViewCellEditingStyle.Delete) {
            objects.remove((int) indexPath.row());
            tableView.deleteRowsAtIndexPathsWithRowAnimation((NSArray<? extends NSIndexPath>)
                    NSArray.arrayWithObject(indexPath), UITableViewRowAnimation.Fade);
        }
    }
}
