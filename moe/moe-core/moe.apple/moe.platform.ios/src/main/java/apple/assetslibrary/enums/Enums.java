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

package apple.assetslibrary.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
    /**
     * The Library group that includes all assets.
     */
    @Generated public static final int ALAssetsGroupLibrary = 0x00000001;
    /**
     * All the albums synced from iTunes or created on the device.
     */
    @Generated public static final int ALAssetsGroupAlbum = 0x00000002;
    /**
     * All the events synced from iTunes.
     */
    @Generated public static final int ALAssetsGroupEvent = 0x00000004;
    /**
     * All the faces albums synced from iTunes.
     */
    @Generated public static final int ALAssetsGroupFaces = 0x00000008;
    /**
     * The Saved Photos album.
     */
    @Generated public static final int ALAssetsGroupSavedPhotos = 0x00000010;
    /**
     * The PhotoStream album.
     */
    @Generated public static final int ALAssetsGroupPhotoStream = 0x00000020;
    /**
     * The same as ORing together all the available group types,
     */
    @Generated public static final int ALAssetsGroupAll = 0xFFFFFFFF;
    /**
     * Error (reason unknown)
     */
    @Generated public static final int ALAssetsLibraryUnknownError = 0xFFFFFFFF;
    /**
     * Write error (write failed)
     */
    @Generated public static final int ALAssetsLibraryWriteFailedError = 0xFFFFF31C;
    /**
     * Write error (writing is busy, try again)
     */
    @Generated public static final int ALAssetsLibraryWriteBusyError = 0xFFFFF31B;
    /**
     * Write error (invalid data)
     */
    @Generated public static final int ALAssetsLibraryWriteInvalidDataError = 0xFFFFF31A;
    /**
     * Write error (incompatible data)
     */
    @Generated public static final int ALAssetsLibraryWriteIncompatibleDataError = 0xFFFFF319;
    /**
     * Write error (data has invalid encoding)
     */
    @Generated public static final int ALAssetsLibraryWriteDataEncodingError = 0xFFFFF318;
    /**
     * Write error (out of disk space)
     */
    @Generated public static final int ALAssetsLibraryWriteDiskSpaceError = 0xFFFFF317;
    /**
     * Data unavailable (data currently unavailable)
     */
    @Generated public static final int ALAssetsLibraryDataUnavailableError = 0xFFFFF312;
    /**
     * Access error (user denied access request)
     */
    @Generated public static final int ALAssetsLibraryAccessUserDeniedError = 0xFFFFF311;
    /**
     * Access error (access globally denied)
     */
    @Generated public static final int ALAssetsLibraryAccessGloballyDeniedError = 0xFFFFF310;

    @Generated
    private Enums() {
    }
}
