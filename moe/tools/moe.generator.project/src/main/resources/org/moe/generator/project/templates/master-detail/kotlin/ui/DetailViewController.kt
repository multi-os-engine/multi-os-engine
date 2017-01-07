package ${_PLACEHOLDER_PACKAGE_NAME}.ui

import apple.uikit.UILabel
import apple.uikit.UIViewController
import org.moe.natj.general.Pointer
import org.moe.natj.general.ann.Owned
import org.moe.natj.general.ann.RegisterOnStartup
import org.moe.natj.objc.ObjCRuntime
import org.moe.natj.objc.ann.IBOutlet
import org.moe.natj.objc.ann.ObjCClassName
import org.moe.natj.objc.ann.Property
import org.moe.natj.objc.ann.Selector

@org.moe.natj.general.ann.Runtime(ObjCRuntime::class)
@ObjCClassName("DetailViewController")
@RegisterOnStartup
class DetailViewController protected constructor(peer: Pointer) : UIViewController(peer) {

    @Selector("init")
    override external fun init(): DetailViewController

    var detailItem: String? = null
        set(detailItem) {
            field = detailItem
            configureView()
        }

    override fun viewDidLoad() {
        super.viewDidLoad()
        configureView()
    }

    private fun configureView() {
        if (this.detailItem != null && detailDescriptionLabel() != null) {
            detailDescriptionLabel()!!.setText(this.detailItem)
        }
    }

    @Property
    @IBOutlet
    @Selector("detailDescriptionLabel")
    external fun detailDescriptionLabel(): UILabel?

    @Selector("setDetailDescriptionLabel:")
    external fun setDetailDescriptionLabel(detailDescriptionLabel: UILabel?)

    companion object {

        @Owned
        @Selector("alloc")
        @JvmStatic external fun alloc(): DetailViewController
    }
}
