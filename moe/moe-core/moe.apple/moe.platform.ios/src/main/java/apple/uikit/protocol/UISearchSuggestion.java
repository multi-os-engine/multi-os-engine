package apple.uikit.protocol;

import apple.foundation.NSAttributedString;
import apple.uikit.UIImage;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISearchSuggestion")
public interface UISearchSuggestion {
    /**
     * Icon that represents this search suggestion item
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("iconImage")
    default UIImage iconImage() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If non-null, will be displayed as the search string instead of localizedSuggestion
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("localizedAttributedSuggestion")
    NSAttributedString localizedAttributedSuggestion();

    /**
     * The localized description used as accessibility string
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("localizedDescription")
    default String localizedDescription() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The localized suggestion that will be displayed as the search string
     */
    @Nullable
    @Generated
    @Selector("localizedSuggestion")
    String localizedSuggestion();

    /**
     * User information
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("representedObject")
    @MappedReturn(ObjCObjectMapper.class)
    Object representedObject();

    /**
     * User information
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setRepresentedObject:")
    void setRepresentedObject(@Nullable @Mapped(ObjCObjectMapper.class) Object value);
}