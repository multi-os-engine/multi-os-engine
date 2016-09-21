/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.mediaplayer.protocol;

import apple.foundation.NSError;
import apple.foundation.NSIndexPath;
import apple.mediaplayer.MPPlayableContentManager;
import apple.mediaplayer.MPPlayableContentManagerContext;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPPlayableContentDelegate")
public interface MPPlayableContentDelegate {
    @Generated
    @IsOptional
    @Selector("playableContentManager:initiatePlaybackOfContentItemAtIndexPath:completionHandler:")
    default void playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler(
            MPPlayableContentManager contentManager, NSIndexPath indexPath,
            @ObjCBlock(name = "call_playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler") Block_playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playableContentManager:didUpdateContext:")
    default void playableContentManagerDidUpdateContext(MPPlayableContentManager contentManager,
            MPPlayableContentManagerContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playableContentManager:initializePlaybackQueueWithCompletionHandler:")
    default void playableContentManagerInitializePlaybackQueueWithCompletionHandler(
            MPPlayableContentManager contentManager,
            @ObjCBlock(name = "call_playableContentManagerInitializePlaybackQueueWithCompletionHandler") Block_playableContentManagerInitializePlaybackQueueWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler {
        @Generated
        void call_playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playableContentManagerInitializePlaybackQueueWithCompletionHandler {
        @Generated
        void call_playableContentManagerInitializePlaybackQueueWithCompletionHandler(NSError arg0);
    }
}
