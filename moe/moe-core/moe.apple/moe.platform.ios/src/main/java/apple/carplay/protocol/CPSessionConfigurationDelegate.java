package apple.carplay.protocol;

import apple.carplay.CPSessionConfiguration;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPSessionConfigurationDelegate")
public interface CPSessionConfigurationDelegate {
    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("sessionConfiguration:contentStyleChanged:")
    default void sessionConfigurationContentStyleChanged(CPSessionConfiguration sessionConfiguration,
            @NUInt long contentStyle) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This delegate is called whenever the types of limited user interfaces have changed.
     */
    @Generated
    @IsOptional
    @Selector("sessionConfiguration:limitedUserInterfacesChanged:")
    default void sessionConfigurationLimitedUserInterfacesChanged(CPSessionConfiguration sessionConfiguration,
            @NUInt long limitedUserInterfaces) {
        throw new java.lang.UnsupportedOperationException();
    }
}