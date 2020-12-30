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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIConfigurationState")
public interface UIConfigurationState extends NSCopying, NSSecureCoding {
    /**
     * Returns the custom state for the specified key.
     */
    @Generated
    @Selector("customStateForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    Object customStateForKey(String key);

    /**
     * Returns a new instance with the specified trait collection.
     */
    @Generated
    @Selector("initWithTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    Object initWithTraitCollection(UITraitCollection traitCollection);

    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    Object objectForKeyedSubscript(String key);

    /**
     * Sets the custom state for the specified key.
     */
    @Generated
    @Selector("setCustomState:forKey:")
    void setCustomStateForKey(@Mapped(ObjCObjectMapper.class) Object customState, String key);

    @Generated
    @Selector("setObject:forKeyedSubscript:")
    void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) Object obj, String key);

    @Generated
    @Selector("setTraitCollection:")
    void setTraitCollection(UITraitCollection value);

    @Generated
    @Selector("traitCollection")
    UITraitCollection traitCollection();
}