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
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetCollectionType and PHAssetCollectionSubtype in the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsGroupLibrary = 0x00000001;
    /**
     * All the albums synced from iTunes or created on the device.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetCollectionType and PHAssetCollectionSubtype in the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsGroupAlbum = 0x00000002;
    /**
     * All the events synced from iTunes.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetCollectionType and PHAssetCollectionSubtype in the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsGroupEvent = 0x00000004;
    /**
     * All the faces albums synced from iTunes.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetCollectionType and PHAssetCollectionSubtype in the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsGroupFaces = 0x00000008;
    /**
     * The Saved Photos album.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetCollectionType and PHAssetCollectionSubtype in the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsGroupSavedPhotos = 0x00000010;
    /**
     * The PhotoStream album.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetCollectionType and PHAssetCollectionSubtype in the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsGroupPhotoStream = 0x00000020;
    /**
     * The same as ORing together all the available group types,
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetCollectionType and PHAssetCollectionSubtype in the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsGroupAll = 0xFFFFFFFF;
    /**
     * Error (reason unknown)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryUnknownError = 0xFFFFFFFF;
    /**
     * Write error (write failed)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryWriteFailedError = 0xFFFFF31C;
    /**
     * Write error (writing is busy, try again)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryWriteBusyError = 0xFFFFF31B;
    /**
     * Write error (invalid data)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryWriteInvalidDataError = 0xFFFFF31A;
    /**
     * Write error (incompatible data)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryWriteIncompatibleDataError = 0xFFFFF319;
    /**
     * Write error (data has invalid encoding)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryWriteDataEncodingError = 0xFFFFF318;
    /**
     * Write error (out of disk space)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryWriteDiskSpaceError = 0xFFFFF317;
    /**
     * Data unavailable (data currently unavailable)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryDataUnavailableError = 0xFFFFF312;
    /**
     * Access error (user denied access request)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryAccessUserDeniedError = 0xFFFFF311;
    /**
     * Access error (access globally denied)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated @Generated public static final int ALAssetsLibraryAccessGloballyDeniedError = 0xFFFFF310;

    @Generated
    private Enums() {
    }
}
