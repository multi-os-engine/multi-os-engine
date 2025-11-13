package apple.avfoundation.protocol;

import apple.avfoundation.AVCaptureTimecodeGenerator;
import apple.avfoundation.AVCaptureTimecodeSource;
import apple.avfoundation.struct.AVCaptureTimecode;
import apple.foundation.NSArray;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A protocol for receiving real-time timecode updates and error notifications from a timecode generator.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureTimecodeGeneratorDelegate")
public interface AVCaptureTimecodeGeneratorDelegate {
    /**
     * Notifies the delegate when new, unaligned timecodes are parsed from the specified source.
     * 
     * - Parameter generator: The timecode generator providing the update.
     * - Parameter timecode: The updated timecode data.
     * - Parameter source: The source from which the timecode was received.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("timecodeGenerator:didReceiveUpdate:fromSource:")
    void timecodeGeneratorDidReceiveUpdateFromSource(@NotNull AVCaptureTimecodeGenerator generator,
            @ByValue AVCaptureTimecode timecode, @NotNull AVCaptureTimecodeSource source);

    /**
     * Notifies the delegate when the list of available timecode synchronization sources is updated.
     * 
     * - Parameter generator: The ``AVCaptureTimecodeGenerator`` instance providing the source list update.
     * - Parameter availableSources: An array of ``AVCaptureTimecodeSource`` objects representing the available timecode
     * synchronization sources.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("timecodeGenerator:didUpdateAvailableSources:")
    void timecodeGeneratorDidUpdateAvailableSources(@NotNull AVCaptureTimecodeGenerator generator,
            @NotNull NSArray<? extends AVCaptureTimecodeSource> availableSources);

    /**
     * Notifies the delegate when the synchronization status of a timecode source changes.
     * 
     * - Parameter generator: The ``AVCaptureTimecodeGenerator`` instance providing the status update.
     * - Parameter synchronizationStatus: The updated synchronization state.
     * - Parameter source: The internal or external source to which the generator synchronizes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("timecodeGenerator:transitionedToSynchronizationStatus:forSource:")
    void timecodeGeneratorTransitionedToSynchronizationStatusForSource(@NotNull AVCaptureTimecodeGenerator generator,
            @NInt long synchronizationStatus, @NotNull AVCaptureTimecodeSource source);
}