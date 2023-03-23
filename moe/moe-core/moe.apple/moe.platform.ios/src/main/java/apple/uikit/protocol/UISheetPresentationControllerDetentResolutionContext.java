package apple.uikit.protocol;

import apple.uikit.UITraitCollection;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A context used for resolving custom UISheetPresentationControllerDetent values.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISheetPresentationControllerDetentResolutionContext")
public interface UISheetPresentationControllerDetentResolutionContext {
    /**
     * The trait collection of the sheet's containerView. Effectively the same as the window's traitCollection, and does
     * not include overrides from the sheet's overrideTraitCollection.
     */
    @Generated
    @Selector("containerTraitCollection")
    UITraitCollection containerTraitCollection();

    /**
     * The maximum value a detent can have.
     */
    @Generated
    @Selector("maximumDetentValue")
    @NFloat
    double maximumDetentValue();
}