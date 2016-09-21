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

@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPPlayableContentDataSource")
public interface MPPlayableContentDataSource {
    @Generated
    @IsOptional
    @Selector("beginLoadingChildItemsAtIndexPath:completionHandler:")
    default void beginLoadingChildItemsAtIndexPathCompletionHandler(NSIndexPath indexPath,
            @ObjCBlock(name = "call_beginLoadingChildItemsAtIndexPathCompletionHandler") Block_beginLoadingChildItemsAtIndexPathCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("childItemsDisplayPlaybackProgressAtIndexPath:")
    default boolean childItemsDisplayPlaybackProgressAtIndexPath(NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("contentItemAtIndexPath:")
    MPContentItem contentItemAtIndexPath(NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("contentItemForIdentifier:completionHandler:")
    default void contentItemForIdentifierCompletionHandler(String identifier,
            @ObjCBlock(name = "call_contentItemForIdentifierCompletionHandler") Block_contentItemForIdentifierCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

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
