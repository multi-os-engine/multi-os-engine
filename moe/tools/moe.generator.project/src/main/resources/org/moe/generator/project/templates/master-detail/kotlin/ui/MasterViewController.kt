package ${_PLACEHOLDER_PACKAGE_NAME}.ui

import apple.foundation.NSArray
import apple.foundation.NSIndexPath
import apple.uikit.*
import apple.uikit.enums.UIBarButtonSystemItem
import apple.uikit.enums.UITableViewCellEditingStyle
import apple.uikit.enums.UITableViewRowAnimation
import org.moe.natj.general.Pointer
import org.moe.natj.general.ann.Mapped
import org.moe.natj.general.ann.NInt
import org.moe.natj.general.ann.Owned
import org.moe.natj.general.ann.RegisterOnStartup
import org.moe.natj.objc.ObjCRuntime
import org.moe.natj.objc.SEL
import org.moe.natj.objc.ann.ObjCClassName
import org.moe.natj.objc.ann.Selector
import org.moe.natj.objc.map.ObjCObjectMapper
import java.util.*
import ${_PLACEHOLDER_PACKAGE_NAME}.ui.DetailViewController

@org.moe.natj.general.ann.Runtime(ObjCRuntime::class)
@ObjCClassName("MasterViewController")
@RegisterOnStartup
class MasterViewController protected constructor(peer: Pointer) : UITableViewController(peer) {

    @Selector("init")
    override external fun init(): MasterViewController

    private var detailViewController: DetailViewController? = null

    private val objects = ArrayList<String>()

    override fun viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        navigationItem().setLeftBarButtonItem(editButtonItem())

        val addButton = UIBarButtonItem.alloc()
                .initWithBarButtonSystemItemTargetAction(UIBarButtonSystemItem.Add, this, SEL("insertNewObject:"))
        navigationItem().setRightBarButtonItem(addButton)
        detailViewController = (splitViewController().viewControllers().lastObject() as UINavigationController).topViewController() as DetailViewController
    }

    override fun viewWillAppear(animated: Boolean) {
        setClearsSelectionOnViewWillAppear(splitViewController().isCollapsed)
        super.viewWillAppear(animated)
    }

    @Selector("insertNewObject:")
    fun insertNewObject(sender: Any) {
        objects.add(0, Date().toString())
        val indexPath = NSIndexPath.indexPathForRowInSection(0, 0)
        tableView().insertRowsAtIndexPathsWithRowAnimation(NSArray.arrayWithObject(indexPath) as NSArray<out NSIndexPath>, UITableViewRowAnimation.Automatic)
    }

    override fun prepareForSegueSender(segue: UIStoryboardSegue, @Mapped(ObjCObjectMapper::class)
    sender: Any) {
        if (segue.identifier() == "showDetail") {
            val indexPath = tableView().indexPathForSelectedRow()
            val `object` = objects[indexPath.row().toInt()]
            val controller = (segue.destinationViewController() as UINavigationController).topViewController() as DetailViewController
            controller.detailItem = `object`
            controller.navigationItem().setLeftBarButtonItem(splitViewController()
                    .displayModeButtonItem())
            controller.navigationItem().setLeftItemsSupplementBackButton(true)
        }
    }

    override fun numberOfSectionsInTableView(uiTableView: UITableView?): Long {
        return 1
    }

    override fun tableViewNumberOfRowsInSection(uiTableView: UITableView, @NInt l: Long): Long {
        return objects.size.toLong()
    }

    override fun tableViewCellForRowAtIndexPath(tableView: UITableView, indexPath: NSIndexPath): UITableViewCell {
        val cell = tableView.dequeueReusableCellWithIdentifierForIndexPath("Cell", indexPath)

        val `object` = objects[indexPath.row().toInt()]
        cell.textLabel().setText(`object`)
        return cell
    }

    override fun tableViewCanEditRowAtIndexPath(uiTableView: UITableView?, nsIndexPath: NSIndexPath?): Boolean {
        return true
    }

    override fun tableViewCommitEditingStyleForRowAtIndexPath(tableView: UITableView?, @NInt editingStyle: Long, indexPath: NSIndexPath?) {
        if (editingStyle == UITableViewCellEditingStyle.Delete) {
            objects.removeAt(indexPath!!.row().toInt())
            tableView!!.deleteRowsAtIndexPathsWithRowAnimation(NSArray.arrayWithObject(indexPath) as NSArray<out NSIndexPath>, UITableViewRowAnimation.Fade)
        }
    }

    companion object {

        @Owned
        @Selector("alloc")
        @JvmStatic external fun alloc(): MasterViewController
    }
}
