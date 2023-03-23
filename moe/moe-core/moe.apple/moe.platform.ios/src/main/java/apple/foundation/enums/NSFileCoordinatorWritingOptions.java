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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSFileCoordinatorWritingOptions {
    /**
     * Whether the writing to be done is actually the deletion of the item. This affects how the writing waits for
     * previously scheduled coordinated reading and writing, how the writing causes subsequently scheduled reading and
     * writing to wait, and what NSFilePresenter messaging is done. See the comments in the Single File Coordination
     * section below. This option is how you trigger sending of -accommodatePresentedItemDeletionWithCompletionHandler:
     * or -accommodatePresentedSubitemDeletionAtURL:completionHandler: messages to NSFilePresenters.
     * 
     * For example, Finder uses this when it's emptying the trash to give NSFilePresenters a chance to close documents
     * before their files disappear, or would disappear if the files weren't still open.
     */
    @Generated @NUInt public static final long ForDeleting = 0x0000000000000001L;
    /**
     * Whether the writing to be done is actually the moving or renaming of the item. This affects how the writing waits
     * for previously scheduled coordinated reading and writing, how the writing causes subsequently scheduled reading
     * and writing to wait, and what NSFilePresenter messaging is done. See the comments in the Single File Coordination
     * section below. This option has no effect when what's being moved is a plain file so you can use it in code that
     * moves file system items without checking whether the items are files or directories. Any such check would invite
     * a race condition anyway.
     * 
     * For example, Finder uses this when it's moving items that the user has dragged and dropped so as not to yank
     * files contained by moved folders out from underneath applications that are reading or writing those files.
     */
    @Generated @NUInt public static final long ForMoving = 0x0000000000000002L;
    /**
     * Whether coordinated writing triggers sending of -savePresentedItemChangesWithCompletionHandler: to certain
     * NSFilePresenters in the system and waiting for those NSFilePresenters to respond.
     */
    @Generated @NUInt public static final long ForMerging = 0x0000000000000004L;
    /**
     * Whether the writing to be done is actually the replacement of the item with a different item. It causes the same
     * behavior as NSFileCoordinatorWritingForDeleting except that when the item being written to is renamed or moved
     * while the writer is being made to wait the item is considered to have been a different item, so the writer is not
     * passed an updated URL to reflect the renaming or moving. Use this when the moving or creation of an item will
     * replace any item that gets in its way. To avoid a race condition use it regardless of whether there is actually
     * an item in the way before the writing begins. Don't use this when simply updating the contents of a file, even if
     * the way you do that is writing the contents to another file and renaming it into place. This is not a valid
     * option to use with -prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:.
     * 
     * For example, NSDocument uses this for NSSaveAsOperation and NSSaveToOperation to announce that it is possibly
     * overwriting an item with a brand new file or file package. This gives any NSFilePresenter of the overwritten
     * item, including perhaps a different instance of NSDocument, perhaps in the same application, a chance to close
     * itself before the item is overwritten.
     * 
     * For another example, the most accurate and safe way to coordinate a move is to invoke
     * -coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor: using the
     * NSFileCoordinatorWritingForMoving option with the source URL and NSFileCoordinatorWritingForReplacing with the
     * destination URL.
     */
    @Generated @NUInt public static final long ForReplacing = 0x0000000000000008L;
    /**
     * Whether the writing to be done will change the item's metadata only and not its contents. If the item being
     * written to is ubiquitous, then changes to the item's contents during this coordinated write may not be preserved
     * or fail. When using this option, changing metadata that is related to the item's contents is not supported for
     * ubiquitous items and such changes may not be preserved. For example, changing the value of NSURLTagNamesKey is
     * supported, but changing the value of NSURLContentModificationDateKey is not.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long ContentIndependentMetadataOnly = 0x0000000000000010L;

    @Generated
    private NSFileCoordinatorWritingOptions() {
    }
}
