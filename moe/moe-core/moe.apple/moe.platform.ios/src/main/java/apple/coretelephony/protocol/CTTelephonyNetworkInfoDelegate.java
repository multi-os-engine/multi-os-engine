package apple.coretelephony.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreTelephony")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CTTelephonyNetworkInfoDelegate")
public interface CTTelephonyNetworkInfoDelegate {
    @Generated
    @IsOptional
    @Selector("dataServiceIdentifierDidChange:")
    default void dataServiceIdentifierDidChange(String identifier) {
        throw new java.lang.UnsupportedOperationException();
    }
}