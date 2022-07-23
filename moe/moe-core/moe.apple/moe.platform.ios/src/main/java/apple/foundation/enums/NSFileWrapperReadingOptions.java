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
public final class NSFileWrapperReadingOptions {
    /**
     * Whether the contents are read immediately, applied recursively in the case of directory file wrappers. If reading
     * with this option succeeds then subsequent invocations of -fileWrappers, -regularFileContents,
     * -symbolicLinkDestinationURL:, -serializedRepresentation, and, on Mac OS X, -[NSFileWrapper(NSExtensions) icon]
     * sent to the receiver and all its descendant file wrappers won't fail. For performance NSFileWrapper may or may
     * not immediately read the contents of some file packages immediately even when this option is chosen. For example,
     * the contents of bundles (not all file packages are bundles) are immutable to the user so on Mac OS X
     * NSFileWrapper may read the children of such a directory lazily. You can use this option to take a reasonable
     * snapshot of a file or folder for writing later. For example, a Mac OS X application like TextEdit can use this
     * option when creating new file wrappers to represent attachments that the user creates by copying and pasting or
     * dragging and dropping from the Finder to a TextEdit document. You wouldn't use this option when reading a
     * document file package because that would cause unnecessarily bad perfomance. For example, an application wouldn't
     * use this option when creating file wrappers to represent attachments as it's opening a document stored in a file
     * package.
     */
    @Generated @NUInt public static final long Immediate = 0x0000000000000001L;
    /**
     * Whether file mapping for regular file wrappers is disallowed. In Mac OS 10.6 and newer NSFileWrapper only ever
     * memory maps files on internal drives, regardless of whether this option is used. It never memory maps files on
     * external drives or network volumes. You can use this option to keep NSFileWrapper from memory mapping files at
     * all, even ones on internal drives. This is useful if you want to make sure your application doesn't hold files
     * open (mapped files are open files) and therefore prevent the user from ejecting DVDs, unmounting disk partitions,
     * or unmounting disk images.
     */
    @Generated @NUInt public static final long WithoutMapping = 0x0000000000000002L;

    @Generated
    private NSFileWrapperReadingOptions() {
    }
}
