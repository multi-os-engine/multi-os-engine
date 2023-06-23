package apple.uikit.protocol;

import apple.foundation.NSAttributedString;
import apple.foundation.NSDictionary;
import apple.foundation.NSItemProvider;
import apple.uikit.NSTextAttachment;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextPasteItem")
public interface UITextPasteItem {
    /**
     * These will be the default attributes that will
     * be applied to plain strings when they are provided.
     * You can use these to make your own attributed string if you want.
     */
    @NotNull
    @Generated
    @Selector("defaultAttributes")
    NSDictionary<String, ?> defaultAttributes();

    /**
     * This is the NSItemProvider for the item being pasted or dropped.
     * You should set a result for this item using one of the methods below.
     */
    @NotNull
    @Generated
    @Selector("itemProvider")
    NSItemProvider itemProvider();

    /**
     * This is nil for normal pastes, but might be filled with the
     * UIDragItem's localObject for pastes from drops.
     */
    @Nullable
    @Generated
    @Selector("localObject")
    @MappedReturn(ObjCObjectMapper.class)
    Object localObject();

    /**
     * provide an attachment result from this NSItemProvider's data
     */
    @Generated
    @Selector("setAttachmentResult:")
    void setAttachmentResult(@NotNull NSTextAttachment textAttachment);

    /**
     * provide an attributed representation result from this NSItemProvider's data
     */
    @Generated
    @Selector("setAttributedStringResult:")
    void setAttributedStringResult(@NotNull NSAttributedString string);

    /**
     * Use this to indicate that want the default transformation to happen.
     * If the item data for the item provider is not supported, this action
     * will be the same as `setNoResult`.
     * You can use this as a fallback for any items you are not handling yourself.
     */
    @Generated
    @Selector("setDefaultResult")
    void setDefaultResult();

    /**
     * Use this to indicate that you don't want the data of this NSItemProvider
     * included in the resulting string.
     */
    @Generated
    @Selector("setNoResult")
    void setNoResult();

    /**
     * provide a plain string representation result from this NSItemProvider's data
     */
    @Generated
    @Selector("setStringResult:")
    void setStringResult(@NotNull String string);
}