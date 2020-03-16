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

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPSessionConfigurationDelegate")
public interface CPSessionConfigurationDelegate {
    @Generated
    @IsOptional
    @Selector("sessionConfiguration:contentStyleChanged:")
    default void sessionConfigurationContentStyleChanged(CPSessionConfiguration sessionConfiguration,
            @NUInt long contentStyle) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sessionConfiguration:limitedUserInterfacesChanged:")
    default void sessionConfigurationLimitedUserInterfacesChanged(CPSessionConfiguration sessionConfiguration,
            @NUInt long limitedUserInterfaces) {
        throw new java.lang.UnsupportedOperationException();
    }
}