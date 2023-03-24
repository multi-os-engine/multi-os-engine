package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

/**
 * Protocol adopted by classes that can provide activity items configurations
 * 
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIActivityItemsConfigurationProviding")
public interface UIActivityItemsConfigurationProviding {
    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("activityItemsConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    UIActivityItemsConfigurationReading activityItemsConfiguration();
}
