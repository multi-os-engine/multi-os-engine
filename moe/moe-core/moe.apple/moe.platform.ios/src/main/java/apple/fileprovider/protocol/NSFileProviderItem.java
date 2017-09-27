package apple.fileprovider.protocol;

import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import apple.foundation.NSPersonNameComponents;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderItem")
public interface NSFileProviderItem {
    @Generated
    @IsOptional
    @Selector("capabilities")
    @NUInt
    default long capabilities() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("childItemCount")
    default NSNumber childItemCount() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contentModificationDate")
    default NSDate contentModificationDate() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("creationDate")
    default NSDate creationDate() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentSize")
    default NSNumber documentSize() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("downloadingError")
    default NSError downloadingError() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("favoriteRank")
    default NSNumber favoriteRank() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("filename")
    String filename();

    @Generated
    @IsOptional
    @Selector("isDownloaded")
    default boolean isDownloaded() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("isDownloading")
    default boolean isDownloading() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("isMostRecentVersionDownloaded")
    default boolean isMostRecentVersionDownloaded() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("isShared")
    default boolean isShared() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("isSharedByCurrentUser")
    default boolean isSharedByCurrentUser() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("isTrashed")
    default boolean isTrashed() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("isUploaded")
    default boolean isUploaded() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("isUploading")
    default boolean isUploading() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("itemIdentifier")
    String itemIdentifier();

    @Generated
    @IsOptional
    @Selector("lastUsedDate")
    default NSDate lastUsedDate() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mostRecentEditorNameComponents")
    default NSPersonNameComponents mostRecentEditorNameComponents() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("ownerNameComponents")
    default NSPersonNameComponents ownerNameComponents() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("parentItemIdentifier")
    String parentItemIdentifier();

    @Generated
    @IsOptional
    @Selector("tagData")
    default NSData tagData() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("typeIdentifier")
    String typeIdentifier();

    @Generated
    @IsOptional
    @Selector("uploadingError")
    default NSError uploadingError() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("userInfo")
    default NSDictionary<?, ?> userInfo() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("versionIdentifier")
    default NSData versionIdentifier() {
        throw new java.lang.UnsupportedOperationException();
    }
}