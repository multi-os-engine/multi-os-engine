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

import apple.foundation.NSArray;
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

/**
 * The MPPlayableContentDelegate is a protocol that allows for external media
 * players to send playback commands to an application. For instance,
 * the user could browse the application's media content (provided by the
 * MPPlayableContentDataSource) and selects a content item to play. If the media
 * player decides that it wants to play the item, it will ask the application's
 * content delegate to initiate playback.
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPPlayableContentDelegate")
public interface MPPlayableContentDelegate {
    /**
     * This method is called when the content server notifies the manager that the current context has changed.
     */
    @Generated
    @IsOptional
    @Selector("playableContentManager:didUpdateContext:")
    default void playableContentManagerDidUpdateContext(MPPlayableContentManager contentManager,
            MPPlayableContentManagerContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is called when a media player interface wants the now playing
     * app to setup a playback queue for later playback. The application should
     * load content into its play queue but not start playback until a Play command is
     * received or if the playable content manager requests to play something else.
     * The app should call the provided completion handler once it is ready to play
     * something.
     */
    @Generated
    @IsOptional
    @Selector("playableContentManager:initializePlaybackQueueWithCompletionHandler:")
    default void playableContentManagerInitializePlaybackQueueWithCompletionHandler(
            MPPlayableContentManager contentManager,
            @ObjCBlock(name = "call_playableContentManagerInitializePlaybackQueueWithCompletionHandler") Block_playableContentManagerInitializePlaybackQueueWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is called when a media player interface wants the now playing
     * app to setup a playback queue for later playback. The application should
     * load content into its play queue based on the provided content items and
     * prepare it for playback, but not start playback until a Play command is
     * received or if the playable content manager requests to play something else.
     * A nil contentItems array means that the app should prepare its queue with
     * anything it deems appropriate.
     * The app should call the provided completion handler once it is ready to play
     * something.
     */
    @Generated
    @IsOptional
    @Selector("playableContentManager:initializePlaybackQueueWithContentItems:completionHandler:")
    default void playableContentManagerInitializePlaybackQueueWithContentItemsCompletionHandler(
            MPPlayableContentManager contentManager, NSArray<?> contentItems,
            @ObjCBlock(name = "call_playableContentManagerInitializePlaybackQueueWithContentItemsCompletionHandler") Block_playableContentManagerInitializePlaybackQueueWithContentItemsCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is called when a media player interface wants to play a requested
     * content item. The application should call the completion handler with an
     * appropriate error if there was an error beginning playback for the item.
     */
    @Generated
    @IsOptional
    @Selector("playableContentManager:initiatePlaybackOfContentItemAtIndexPath:completionHandler:")
    default void playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler(
            MPPlayableContentManager contentManager, NSIndexPath indexPath,
            @ObjCBlock(name = "call_playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler") Block_playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playableContentManagerInitializePlaybackQueueWithCompletionHandler {
        @Generated
        void call_playableContentManagerInitializePlaybackQueueWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playableContentManagerInitializePlaybackQueueWithContentItemsCompletionHandler {
        @Generated
        void call_playableContentManagerInitializePlaybackQueueWithContentItemsCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler {
        @Generated
        void call_playableContentManagerInitiatePlaybackOfContentItemAtIndexPathCompletionHandler(NSError arg0);
    }
}
