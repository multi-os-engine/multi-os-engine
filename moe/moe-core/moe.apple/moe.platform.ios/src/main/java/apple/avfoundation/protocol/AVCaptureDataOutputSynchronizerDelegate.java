package apple.avfoundation.protocol;

import apple.avfoundation.AVCaptureDataOutputSynchronizer;
import apple.avfoundation.AVCaptureSynchronizedDataCollection;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureDataOutputSynchronizerDelegate")
public interface AVCaptureDataOutputSynchronizerDelegate {
    @Generated
    @Selector("dataOutputSynchronizer:didOutputSynchronizedDataCollection:")
    void dataOutputSynchronizerDidOutputSynchronizedDataCollection(AVCaptureDataOutputSynchronizer synchronizer,
            AVCaptureSynchronizedDataCollection synchronizedDataCollection);
}