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

package apple.cloudkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CloudKit")
@Runtime(CRuntime.class)
public final class CloudKit {
    static {
        NatJ.register();
    }

    @Generated
    private CloudKit() {
    }

    /**
     * Stand-in for the current user's ID; most often used in RecordZoneID->ownerName
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKCurrentUserDefaultName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKOwnerDefaultName();

    /**
     * This local notification is posted when there has been any change to the logged in iCloud account.
     * <p>
     * On receipt, an updated account status should be obtained by calling @c accountStatusWithCompletionHandler:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKAccountChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKErrorDomain();

    /**
     * When a CKErrorPartialFailure happens this key will be set in the error's userInfo dictionary.
     * <p>
     * The value of this key will be a dictionary, and the values will be errors for individual items with the keys
     * being the item IDs that failed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKPartialErrorsByItemIDKey();

    /**
     * If the server rejects a record save because it has been modified since the last time it was read, a @c
     * CKErrorServerRecordChanged error will be returned and it will contain versions of the record in its userInfo
     * dictionary. Apply your custom conflict resolution logic to the server record under @c CKServerRecordKey and
     * attempt a save of that record.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordChangedErrorAncestorRecordKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordChangedErrorServerRecordKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordChangedErrorClientRecordKey();

    /**
     * On some errors, the userInfo dictionary may contain a NSNumber instance that specifies the period of time in
     * seconds after which the client may retry the request. For example, this key will be on @c
     * CKErrorServiceUnavailable, @c CKErrorRequestRateLimited, and other errors for which the recommended resolution is
     * to retry after a delay.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKErrorRetryAfterKey();

    /**
     * Use this constant for the recordType parameter when fetching User Records.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordTypeUserRecord();

    /**
     * Use these keys in queries to match on the record's parent or share reference
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordParentKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordShareKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordZoneDefaultName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordTypeShare();

    /**
     * Value is a string. Example for a recipe sharing app: "Pot Roast"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKShareTitleKey();

    /**
     * Value is a data blob suitable to pass into @code -[NSImage imageWithData:] or -[UIImage imageWithData:] @endcode
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKShareThumbnailImageDataKey();

    /**
     * Value is a string representing a UTI. Example for a recipe sharing app: "com.mycompany.recipe"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKShareTypeKey();

    /**
     * Query operations have a dynamically defined maximum number of results. If the results of a query exceed this max,
     * your completion block will invoked with a cursor.
     * Issue a new query with that cursor to fetch the next batch of results.
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long CKQueryOperationMaximumResults();

    /**
     * On error CKErrorZoneNotFound, the userInfo dictionary may contain a NSNumber instance that specifies a boolean
     * value representing if the error is caused by the user having reset all encrypted data for their account
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKErrorUserDidResetEncryptedDataKey();

    /**
     * A zone-wide CKShare always uses the record name @c CKRecordNameZoneWideShare.
     * You can use this to fetch the @c CKShare record for the zone with a @c CKFetchRecordsOperation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CKRecordNameZoneWideShare();
}
