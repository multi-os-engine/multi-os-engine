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
    /**
     * captureOutputSynchronizer:didOutputSynchronizedData:
     * 
     *    Called when an AVCaptureDataOutputSynchronizer instance outputs synchronized data from one or more data outputs.
     * 
     *    The synchronized data collection only contains synchronized data for capture outputs with synchronized data ready.
     * 
     * @param synchronizer
     *    The AVCaptureDataOutputSynchronizer instance delivering synchronized data.
     * @param synchronizedDataCollection
     *    A collection of synchronized data objects indexed by data output.
     */
    @Generated
    @Selector("dataOutputSynchronizer:didOutputSynchronizedDataCollection:")
    void dataOutputSynchronizerDidOutputSynchronizedDataCollection(AVCaptureDataOutputSynchronizer synchronizer,
            AVCaptureSynchronizedDataCollection synchronizedDataCollection);
}