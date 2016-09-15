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

package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PHAssetCollectionSubtype {
    @Generated
    private PHAssetCollectionSubtype() {
    }

    @Generated @NInt public static final long AlbumRegular = 0x0000000000000002L;
    @Generated @NInt public static final long AlbumSyncedEvent = 0x0000000000000003L;
    @Generated @NInt public static final long AlbumSyncedFaces = 0x0000000000000004L;
    @Generated @NInt public static final long AlbumSyncedAlbum = 0x0000000000000005L;
    @Generated @NInt public static final long AlbumImported = 0x0000000000000006L;
    @Generated @NInt public static final long AlbumMyPhotoStream = 0x0000000000000064L;
    @Generated @NInt public static final long AlbumCloudShared = 0x0000000000000065L;
    @Generated @NInt public static final long SmartAlbumGeneric = 0x00000000000000C8L;
    @Generated @NInt public static final long SmartAlbumPanoramas = 0x00000000000000C9L;
    @Generated @NInt public static final long SmartAlbumVideos = 0x00000000000000CAL;
    @Generated @NInt public static final long SmartAlbumFavorites = 0x00000000000000CBL;
    @Generated @NInt public static final long SmartAlbumTimelapses = 0x00000000000000CCL;
    @Generated @NInt public static final long SmartAlbumAllHidden = 0x00000000000000CDL;
    @Generated @NInt public static final long SmartAlbumRecentlyAdded = 0x00000000000000CEL;
    @Generated @NInt public static final long SmartAlbumBursts = 0x00000000000000CFL;
    @Generated @NInt public static final long SmartAlbumSlomoVideos = 0x00000000000000D0L;
    @Generated @NInt public static final long SmartAlbumUserLibrary = 0x00000000000000D1L;
    @Generated @NInt public static final long Any = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
    @Generated @NInt public static final long SmartAlbumSelfPortraits = 0x00000000000000D2L;
    @Generated @NInt public static final long SmartAlbumScreenshots = 0x00000000000000D3L;
}
