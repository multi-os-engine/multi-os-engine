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
import apple.mediaplayer.MPContentItem;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * MPPlayableContentDataSource is a protocol that application objects conform to
 * if they want to support external media players, such as vehicle head units.
 * Data sources are responsible for providing metadata about your media to these
 * systems in a meaningful way, so that features like user interfaces and play
 * queues can be setup automatically.
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPPlayableContentDataSource")
public interface MPPlayableContentDataSource {
    /**
     * Tells the data source to begin loading content items that are children of the
     * item specified by indexPath. This is provided so that applications can begin
     * asynchronous batched loading of content before MediaPlayer begins asking for
     * content items to display.
     * Client applications should always call the completion handler after loading
     * has finished, if this method is implemented.
     */
    @Generated
    @IsOptional
    @Selector("beginLoadingChildItemsAtIndexPath:completionHandler:")
    default void beginLoadingChildItemsAtIndexPathCompletionHandler(NSIndexPath indexPath,
            @ObjCBlock(name = "call_beginLoadingChildItemsAtIndexPathCompletionHandler") Block_beginLoadingChildItemsAtIndexPathCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells MediaPlayer whether the content provided by the data source supports
     * playback progress as a property of its metadata.
     * If this method is not implemented, MediaPlayer will assume that progress is
     * not supported for any content items.
     */
    @Generated
    @IsOptional
    @Selector("childItemsDisplayPlaybackProgressAtIndexPath:")
    default boolean childItemsDisplayPlaybackProgressAtIndexPath(NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the content item at the specified index path. If the content item is
     * mutated after returning, its updated contents will be sent to MediaPlayer.
     */
    @Generated
    @Selector("contentItemAtIndexPath:")
    MPContentItem contentItemAtIndexPath(NSIndexPath indexPath);

    /**
     * Provides a content item for the provided identifier.
     * Provide nil if there is no content item corresponding to the identifier.
     * Provide an error if there is an error that will not allow content items
     * to be retrieved.
     * Client applications should always call the completion handler after loading
     * has finished, if this method is implemented.
     */
    @Generated
    @IsOptional
    @Selector("contentItemForIdentifier:completionHandler:")
    default void contentItemForIdentifierCompletionHandler(String identifier,
            @ObjCBlock(name = "call_contentItemForIdentifierCompletionHandler") Block_contentItemForIdentifierCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the number of child nodes at the specified index path. In a virtual
     * filesystem, this would be the number of files in a specific folder. An empty
     * index path represents the root node.
     */
    @Generated
    @Selector("numberOfChildItemsAtIndexPath:")
    @NInt
    long numberOfChildItemsAtIndexPath(NSIndexPath indexPath);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginLoadingChildItemsAtIndexPathCompletionHandler {
        @Generated
        void call_beginLoadingChildItemsAtIndexPathCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_contentItemForIdentifierCompletionHandler {
        @Generated
        void call_contentItemForIdentifierCompletionHandler(MPContentItem arg0, NSError arg1);
    }
}
