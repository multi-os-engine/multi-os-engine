package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class UITextDropPerformer {
    @Generated
    private UITextDropPerformer() {
    }

    /**
     * The text droppable view will handle the drop.
     * This is the default behavior.
     * <p>
     * Note: `-textDroppableView:willPerformDrop:` will be called, if it is implemented,
     * but it is not required.
     */
    @Generated @NUInt public static final long View = 0x0000000000000000L;
    /**
     * The delegate will be responsible for performing the drop, and
     * the default data loading provided by the text droppable view
     * will not be invoked.
     * <p>
     * The delegate must implement `-textDroppableView:willPerformDrop:`,
     * with custom code to start loading data. If it does not, then the text
     * droppable view will handle the drop, as if `UITextDropPerformerView`
     * was specified.
     */
    @Generated @NUInt public static final long Delegate = 0x0000000000000001L;
}
