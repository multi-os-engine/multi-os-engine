package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CMTagCollection Errors
 * 
 * The OSStatus errors returned from the CMTagCollection routines.
 * [@constant] kCMTagCollectionError_ParamErr Returned when caller passes incorrect input or output parameters.
 * [@constant] kCMTagCollectionError_AllocationFailed Returned if a necessary allocation failed.
 * [@constant] kCMTagCollectionError_InternalError Returned if some kind of internal implementation error occurred.
 * [@constant] kCMTagCollectionError_InvalidTag Returned if the tag is kCMTagInvalid.
 * [@constant] kCMTagCollectionError_InvalidTagCollectionDictionary Returned if the CFDictionary being deserialized is
 * not valid to create a CMTagCollection.
 * [@constant] kCMTagCollectionError_InvalidTagCollectionData Returned if structure of the CFData being deserialized is
 * not valid to create a CMTagCollection.
 * [@constant] kCMTagCollectionError_TagNotFound Returned if a search for a CMTag in the collection failed, including if
 * the collection is empty.
 * [@constant] kCMTagCollectionError_InvalidTagCollectionDataVersion Returned if the CFData deserialized to create a
 * CMTagCollection has an unknown version.
 * [@constant] kCMTagCollectionError_ExhaustedBufferSize Returned if the buffer size to retrieve CMTags is smaller than
 * necessary.
 * [@constant] kCMTagCollectionError_NotYetImplemented Returned if the function is not yet implemented.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMTagCollectionError {
    @Generated
    private CMTagCollectionError() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final int ParamErr = 0xFFFFC284;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int AllocationFailed = 0xFFFFC283;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int InternalError = 0xFFFFC282;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int InvalidTag = 0xFFFFC281;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int InvalidTagCollectionDictionary = 0xFFFFC280;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int InvalidTagCollectionData = 0xFFFFC27F;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int TagNotFound = 0xFFFFC27E;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int InvalidTagCollectionDataVersion = 0xFFFFC27D;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int ExhaustedBufferSize = 0xFFFFC27C;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int NotYetImplemented = 0xFFFFC27B;
}