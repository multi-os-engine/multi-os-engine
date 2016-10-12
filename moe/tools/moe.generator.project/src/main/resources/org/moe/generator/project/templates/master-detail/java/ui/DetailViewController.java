package ${_PLACEHOLDER_PACKAGE_NAME}.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.uikit.UILabel;
import apple.uikit.UIViewController;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("DetailViewController")
@RegisterOnStartup
public class DetailViewController extends UIViewController {

    @Owned
    @Selector("alloc")
    public static native DetailViewController alloc();

    @Selector("init")
    public native DetailViewController init();

    protected DetailViewController(Pointer peer) {
        super(peer);
    }

    private String detailItem;
    private UILabel detailDescriptionLabel;

    public String getDetailItem() {
        return detailItem;
    }

    public void setDetailItem(String detailItem) {
        this.detailItem = detailItem;
        configureView();
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        configureView();
    }

    private void configureView() {
        if (detailItem != null && detailDescriptionLabel != null) {
            detailDescriptionLabel.setText(detailItem);
        }
    }

    @Property
    @Selector("detailDescriptionLabel")
    public UILabel getDetailDescriptionLabel() {
        return detailDescriptionLabel;
    }

    @Selector("setDetailDescriptionLabel:")
    public void setDetailDescriptionLabel(UILabel detailDescriptionLabel) {
        this.detailDescriptionLabel = detailDescriptionLabel;
    }
}
