package apple.uikit.protocol;

import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UITraitCollection;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIConfigurationState")
public interface UIConfigurationState extends NSCopying, NSSecureCoding {
    /**
     * Returns the custom state for the specified key.
     */
    @Nullable
    @Generated
    @Selector("customStateForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    Object customStateForKey(@NotNull String key);

    /**
     * Returns a new instance with the specified trait collection.
     */
    @NotNull
    @Generated
    @Selector("initWithTraitCollection:")
    UIConfigurationState initWithTraitCollection(@NotNull UITraitCollection traitCollection);

    @Nullable
    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    Object objectForKeyedSubscript(@NotNull String key);

    /**
     * Sets the custom state for the specified key.
     */
    @Generated
    @Selector("setCustomState:forKey:")
    void setCustomStateForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object customState, @NotNull String key);

    @Generated
    @Selector("setObject:forKeyedSubscript:")
    void setObjectForKeyedSubscript(@Nullable @Mapped(ObjCObjectMapper.class) Object obj, @NotNull String key);

    @Generated
    @Selector("setTraitCollection:")
    void setTraitCollection(@NotNull UITraitCollection value);

    @NotNull
    @Generated
    @Selector("traitCollection")
    UITraitCollection traitCollection();
}