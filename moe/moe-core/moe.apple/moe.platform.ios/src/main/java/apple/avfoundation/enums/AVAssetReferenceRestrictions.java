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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum]			AVAssetReferenceRestrictions
 * <p>
 * These constants can be passed in to AVURLAssetReferenceRestrictionsKey to control the resolution of references to external media data.
 * <p>
 * [@constant]		AVAssetReferenceRestrictionForbidNone
 * Indicates that all types of references should be followed.
 * [@constant]		AVAssetReferenceRestrictionForbidRemoteReferenceToLocal
 * Indicates that references from a remote asset (e.g. referenced via http URL) to local media data (e.g. stored in a local file) should not be followed.
 * [@constant]		AVAssetReferenceRestrictionForbidLocalReferenceToRemote
 * Indicates that references from a local asset to remote media data should not be followed.
 * [@constant]		AVAssetReferenceRestrictionForbidCrossSiteReference
 * Indicates that references from a remote asset to remote media data stored at a different site should not be followed.
 * [@constant]		AVAssetReferenceRestrictionForbidLocalReferenceToLocal
 * Indicates that references from a local asset to local media data stored outside the asset's container file should not be followed.
 * [@constant]		AVAssetReferenceRestrictionForbidAll
 * Indicates that only references to media data stored within the asset's container file should be allowed.
 */
@Generated
public final class AVAssetReferenceRestrictions {
    @Generated
    private AVAssetReferenceRestrictions() {
    }

    @Generated @NUInt public static final long ForbidNone = 0x0000000000000000L;
    @Generated @NUInt public static final long ForbidRemoteReferenceToLocal = 0x0000000000000001L;
    @Generated @NUInt public static final long ForbidLocalReferenceToRemote = 0x0000000000000002L;
    @Generated @NUInt public static final long ForbidCrossSiteReference = 0x0000000000000004L;
    @Generated @NUInt public static final long ForbidLocalReferenceToLocal = 0x0000000000000008L;
    @Generated @NUInt public static final long ForbidAll = 0x000000000000FFFFL;
    @Generated @NUInt public static final long DefaultPolicy = 0x0000000000000002L;
}
