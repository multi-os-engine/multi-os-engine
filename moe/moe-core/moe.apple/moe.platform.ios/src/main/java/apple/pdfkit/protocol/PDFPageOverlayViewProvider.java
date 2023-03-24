package apple.pdfkit.protocol;

import apple.pdfkit.PDFPage;
import apple.pdfkit.PDFView;
import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PDFPageOverlayViewProvider")
public interface PDFPageOverlayViewProvider {
    /**
     * Asks the provider for a view to be displayed on top of the specified page.
     */
    @Nullable
    @Generated
    @Selector("pdfView:overlayViewForPage:")
    UIView pdfViewOverlayViewForPage(@NotNull PDFView view, @NotNull PDFPage page);

    /**
     * Tells the provider that a view returned from `overlayViewForPage` has been added
     * to the view hierarchy and constraints have been set up. At this point, gesture failure
     * handlers may be set up with those of `pdfView`.
     */
    @Generated
    @IsOptional
    @Selector("pdfView:willDisplayOverlayView:forPage:")
    default void pdfViewWillDisplayOverlayViewForPage(@NotNull PDFView pdfView, @NotNull UIView overlayView,
            @NotNull PDFPage page) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the provider that a view returned from `overlayViewForPage` will be removed.
     * This can be used to restore whatever was done in `overlayView:wasAddedForPage`.
     */
    @Generated
    @IsOptional
    @Selector("pdfView:willEndDisplayingOverlayView:forPage:")
    default void pdfViewWillEndDisplayingOverlayViewForPage(@NotNull PDFView pdfView, @NotNull UIView overlayView,
            @NotNull PDFPage page) {
        throw new java.lang.UnsupportedOperationException();
    }
}