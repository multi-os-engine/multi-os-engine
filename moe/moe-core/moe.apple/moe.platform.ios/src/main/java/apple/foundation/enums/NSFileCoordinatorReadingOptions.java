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
public final class NSFileCoordinatorReadingOptions {
    /**
     * Whether reading does _not_ trigger sending of -savePresentedItemChangesWithCompletionHandler: to certain NSFilePresenters in the system and waiting for those NSFilePresenters to respond. The default behavior during coordinated reading is to send -savePresentedItemChangesWithCompletionHandler: to NSFilePresenters.
     */
    @Generated @NUInt public static final long WithoutChanges = 0x0000000000000001L;
    /**
     * Whether reading of an item that might be a symbolic link file causes the resolution of the link if it is. This affects the URL passed to the block passed to an invocation of one of the -coordinateReadingItemAtURL:... methods. This is not a valid option to use with -prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:.
     */
    @Generated @NUInt public static final long ResolvesSymbolicLink = 0x0000000000000002L;
    /**
     * Whether the reading to be done will only attempt to get an item's metadata that is immediately available (name, modification date, tags, and other attributes), and not its contents. For ubiquitous items, specifying this option will cause coordinated reads to be granted immediately (barring other coordinated readers or writers or file presenters on the same system on the same system preventing this) instead of waiting for any downloading of contents or additional metadata like conflicting versions or thumbnails. Attempting to read the item's contents during such a coordinated read may give you unexpected results or fail.
     */
    @Generated @NUInt public static final long ImmediatelyAvailableMetadataOnly = 0x0000000000000004L;
    /**
     * Whether reading of an item is being done for the purpose of uploading. When using this option, NSFileCoordinator will create a temporary snapshot of the item being read and will relinquish its claim on the file once that snapshot is made to avoid blocking other coordinated writes during a potentially long upload. If the item at the URL being read is a directory (such as a document package), then the snapshot will be a new file that contains the zipped contents of that directory, and the URL passed to the accessor block will locate that file.
     * 
     * When using this option, you may upload the document outside of the accessor block. However, you should open a file descriptor to the file or relocate the file within the accessor block before you do so, because NSFileCoordinator will unlink the file after the block returns, rendering it inaccessible via the URL.
     */
    @Generated @NUInt public static final long ForUploading = 0x0000000000000008L;

    @Generated
    private NSFileCoordinatorReadingOptions() {
    }
}
