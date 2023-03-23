package apple.coremotion.protocol;

import apple.coremotion.CMHeadphoneMotionManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * CMHeadphoneMotionManagerDelegate
 * 
 * Discussion:
 * Delegate for CMHeadphoneMotionManager.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CMHeadphoneMotionManagerDelegate")
public interface CMHeadphoneMotionManagerDelegate {
    /**
     * headphoneMotionManagerDidConnect:
     * 
     * Discussion:
     * Invoked when a headphone is connected. Execution of the delegate callback occurs on the operation queue used to
     * deliver the device motion updates. The main thread is used if the queue was not specified.
     */
    @Generated
    @IsOptional
    @Selector("headphoneMotionManagerDidConnect:")
    default void headphoneMotionManagerDidConnect(CMHeadphoneMotionManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * headphoneMotionManagerDidDisconnect:
     * 
     * Discussion:
     * Invoked when a headphone is disconnected. Execution of the delegate callback occurs on the operation queue used
     * to
     * deliver the device motion updates. The main thread is used if the queue was not specified.
     */
    @Generated
    @IsOptional
    @Selector("headphoneMotionManagerDidDisconnect:")
    default void headphoneMotionManagerDidDisconnect(CMHeadphoneMotionManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }
}
