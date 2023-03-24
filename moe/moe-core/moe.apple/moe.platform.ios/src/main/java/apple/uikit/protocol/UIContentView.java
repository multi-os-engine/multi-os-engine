package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.ann.IsOptional;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIContentView")
public interface UIContentView {
    /**
     * Returns the current configuration of the view. Setting this property applies the new configuration to the view.
     */
    @NotNull
    @Generated
    @Selector("configuration")
    @MappedReturn(ObjCObjectMapper.class)
    UIContentConfiguration configuration();

    /**
     * Returns the current configuration of the view. Setting this property applies the new configuration to the view.
     */
    @Generated
    @Selector("setConfiguration:")
    void setConfiguration(@NotNull @Mapped(ObjCObjectMapper.class) UIContentConfiguration value);

    /**
     * Whether this view is compatible with the provided configuration, meaning the view supports
     * it being set to the `configuration` property and is capable of updating itself for the
     * configuration. If not implemented, the view is assumed to be compatible with configuration
     * classes that match the class of the view's existing configuration.
     * 
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("supportsConfiguration:")
    default boolean supportsConfiguration(
            @NotNull @Mapped(ObjCObjectMapper.class) UIContentConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }
}