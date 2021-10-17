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
public final class PHCollectionListSubtype {
    /**
     * PHCollectionListTypeMomentList subtypes
     */
    @Generated @NInt public static final long MomentListCluster = 0x0000000000000001L;
    /**
     * PHCollectionListTypeMomentList subtypes
     */
    @Generated @NInt public static final long MomentListYear = 0x0000000000000002L;
    /**
     * PHCollectionListTypeFolder subtypes
     */
    @Generated @NInt public static final long RegularFolder = 0x0000000000000064L;
    /**
     * PHCollectionListTypeSmartFolder subtypes
     */
    @Generated @NInt public static final long SmartFolderEvents = 0x00000000000000C8L;
    /**
     * PHCollectionListTypeSmartFolder subtypes
     */
    @Generated @NInt public static final long SmartFolderFaces = 0x00000000000000C9L;
    /**
     * Used for fetching if you don't care about the exact subtype
     */
    @Generated @NInt public static final long Any = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;

    @Generated
    private PHCollectionListSubtype() {
    }
}
