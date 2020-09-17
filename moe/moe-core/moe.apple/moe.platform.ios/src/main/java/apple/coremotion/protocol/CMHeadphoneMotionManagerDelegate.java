package apple.coremotion.protocol;

import apple.coremotion.CMHeadphoneMotionManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CMHeadphoneMotionManagerDelegate")
public interface CMHeadphoneMotionManagerDelegate {
    @Generated
    @IsOptional
    @Selector("headphoneMotionManagerDidConnect:")
    default void headphoneMotionManagerDidConnect(CMHeadphoneMotionManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("headphoneMotionManagerDidDisconnect:")
    default void headphoneMotionManagerDidDisconnect(CMHeadphoneMotionManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }
}