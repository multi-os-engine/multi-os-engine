package apple.mediaplayer.protocol;

import apple.mediaplayer.MPMusicPlayerQueueDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSystemMusicPlayerController")
public interface MPSystemMusicPlayerController {
    @Generated
    @Selector("openToPlayQueueDescriptor:")
    void openToPlayQueueDescriptor(MPMusicPlayerQueueDescriptor queueDescriptor);
}