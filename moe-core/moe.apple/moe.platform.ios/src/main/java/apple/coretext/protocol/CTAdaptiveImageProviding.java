package apple.coretext.protocol;

import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import apple.coregraphics.opaque.CGImageRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreText")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CTAdaptiveImageProviding")
public interface CTAdaptiveImageProviding {
    /**
     * The callee is to return an image for use at a particular point size and scale factor, as well as its offset and
     * size (in points), which define the placement of the returned image relative to a rect with the proposed size.
     */
    @Generated
    @Selector("imageForProposedSize:scaleFactor:imageOffset:imageSize:")
    @Nullable
    CGImageRef imageForProposedSizeScaleFactorImageOffsetImageSize(@ByValue CGSize proposedSize,
            @NFloat double scaleFactor,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CGPoint outImageOffset,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CGSize outImageSize);
}