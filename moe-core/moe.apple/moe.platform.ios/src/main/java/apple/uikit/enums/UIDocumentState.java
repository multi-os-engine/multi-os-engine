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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class UIDocumentState {
    @Generated @NUInt public static final long Normal = 0x0000000000000000L;
    /**
     * The document has either not been successfully opened, or has been since closed. Document properties may not be
     * valid.
     */
    @Generated @NUInt public static final long Closed = 0x0000000000000001L;
    /**
     * Conflicts exist for the document's fileURL. They can be accessed through +[NSFileVersion
     * unresolvedConflictVersionsOfItemAtURL:].
     */
    @Generated @NUInt public static final long InConflict = 0x0000000000000002L;
    /**
     * An error has occurred that prevents the document from saving.
     */
    @Generated @NUInt public static final long SavingError = 0x0000000000000004L;
    /**
     * Set before calling -disableEditing. The document is is busy and it is not currently safe to allow user edits.
     * -enableEditing will be called when it becomes safe to edit again.
     */
    @Generated @NUInt public static final long EditingDisabled = 0x0000000000000008L;
    /**
     * Set if the document is busy loading or saving. Progress is valid while this is set.
     */
    @Generated @NUInt public static final long ProgressAvailable = 0x0000000000000010L;

    @Generated
    private UIDocumentState() {
    }
}
