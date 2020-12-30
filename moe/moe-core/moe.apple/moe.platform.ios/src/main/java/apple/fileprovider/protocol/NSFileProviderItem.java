package apple.fileprovider.protocol;

import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import apple.foundation.NSPersonNameComponents;
import apple.uniformtypeidentifiers.UTType;
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
    /**
     * The capabilities of the item.  This controls the list of actions that the UI
     * will allow for the item.
     */
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

    /**
     * The presence of a favorite rank indicates that a directory is a favorite.
     * Favorite ranks are 64-bit unsigned integers.  The initial value for the first
     * item is the time since the unix epoch in milliseconds, but subsequent items are
     * simply placed relative to that.  Favorite ranks are modified when the user
     * reorders favorites.
     * 
     * When favoriting folders on other platforms, set the rank to the time since the
     * unix epoch in milliseconds.  Special value @(NSFileProviderFavoriteRankUnranked)
     * may be used if no rank is available: the system will then figure out the best
     * rank and set it.  Please persist and sync the new value.
     * 
     * This property must not be shared between users, even if the item is.
     */
    @Generated
    @IsOptional
    @Selector("favoriteRank")
    default NSNumber favoriteRank() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The file or directory name, complete with its file extension.
     */
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

    /**
     * Set on a directory or a document if it should appear in the trash.
     * 
     * This flag should only be set on the top-level item: trashing a directory sets
     * this flag on the directory itself, but not on its children.
     * 
     * Trashed items should remain in the working set; however, children of trashed
     * directories should be removed from the working set.
     */
    @Generated
    @IsOptional
    @Selector("isTrashed")
    default boolean isTrashed() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The download and upload properties below determine which of the cloud badges
     * (uploading, downloading, pending) will be shown on the item.
     */
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

    /**
     * The date this item was last used.  This is neither the modification date nor
     * the last access date exposed in traditional file system APIs, and indicates a
     * very clear user intent to use the document.  For example, this is set when the
     * document is open full screen on a device.
     * 
     * This is the system's cue that the document is recent and should appear in the
     * recent list of the UIDocumentBrowserViewController.
     * 
     * This property must not be shared between users, even if the item is.
     */
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

    /**
     * ownerNameComponents should be nil when sharedByCurrentUser is equal to YES or
     * when the item is not shared.
     */
    @Generated
    @IsOptional
    @Selector("ownerNameComponents")
    default NSPersonNameComponents ownerNameComponents() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The parent identifier specifies the parent of the item in the hierarchy.
     * 
     * Set to NSFileProviderRootContainerItemIdentifier for an item at the root of the
     * user's storage.  Set to the itemIdentifier of the item's parent otherwise.
     * 
     * When enumerating the root container or a generic container, the
     * parentItemIdentifier of the enumerated items is expected to match the
     * enumerated item's identifier.  When enumerating the working set, the
     * parentItemIdentifier is expected to match the actual parent of the item in the
     * hierarchy (ie. it is not NSFileProviderWorkingSetContainerItemIdentifier).
     * 
     * The parents of trashed items and of the root item are ignored.
     */
    @Generated
    @Selector("parentItemIdentifier")
    String parentItemIdentifier();

    /**
     * An abstract data blob reprenting the tags associated with the item.  The same
     * tags that are available via -[NSURL getResourceValue:forKey:error:] with key
     * NSURLTagNamesKey on macOS, except that this data blob may transport more
     * information than just the tag names.
     * 
     * This property must not be shared between users, even if the item is.
     */
    @Generated
    @IsOptional
    @Selector("tagData")
    default NSData tagData() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Uniform type identifier (UTI) for the item.
     * 
     * An item should implement at least one of typeIdentifier and contentType. Note
     * that typeIdentifier is required on iOS 13 and earlier.
     */
    @IsOptional
    @Generated
    @Selector("typeIdentifier")
    default String typeIdentifier() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * An error that occurred while uploading to your remote server.
     * 
     * \note Typical uploading errors include:
     * - NSFileProviderErrorInsufficientQuota
     * - NSFileProviderErrorServerUnreachable
     * 
     * \seealso NSFileProviderErrorInsufficientQuota
     * \seealso NSFileProviderErrorServerUnreachable
     */
    @Generated
    @IsOptional
    @Selector("uploadingError")
    default NSError uploadingError() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Use this dictionary to add state information to the item. It is accessible to
     * FileProviderUI action predicates and user interaction predicates [1].
     * 
     * All values for this dictionary must be of type String, Number, Bool or Date.
     * 
     * [1] UserInteraction can be defined when a user level action occurs with a file.
     * 
     *  - `NSFileProviderUserInteractions` *array*
     *    - `ActivationRule ` *string*, the predicate.
     *        [@parameters] predicates
     *            - `destinationItem`: the destination item for an action (only present for Move/Import)
     *            - `destinationItemHierarchy` : represents destinationItem and all its parent chain to allow for search
     *                on first item in hierarchy that has a given value. (only present for Move/ImportHere)
     *            - `action` : the action that is being performed
     *                 'Move'       : moving items within the same provider
     *                 'Export'     : moving items out of the provider
     *                 'ImportHere' : importing item(s) into a folder/root of the provider
     *                 'Trash'      : trashing item(s)
     *                 'Delete'     : deleting item(s)
     *            - `sourceItem` : current item that the predicate is evaluating (only present for Move/Export)
     *            - `sourceItemHierarchy` : represents sourceItem and all its parent chain to allow for search
     *                on first item in hierarchy that has a given value. (only present for Move/Export)
     *            - `sourceItemsCount` :
     *                - In userInteraction, represents the count of sourceItems of an action operation
     *                - In subUserInteraction: represents the count of items that matched the previous predicate
     *    - `Alert` *dictionary*
     *        - `LocalizedTitle` *string*, title of the alert
     *        - `LocalizedSubTitle` *string*, sub title of the alert
     *            - @parameters for LocalizedTitle/LocalizedSubTitle
     *                - `matchingItemsCount`: count of source items that matched the predicate (only present if matchingItemsCount > 0)
     *                - `matchingItemsCountMinusOne`: matchingItemsCount minus one (only present if matchingItemsCount > 1)
     *                - `matchingItemsCountMinusTwo`: matchingItemsCount minus two (only present if matchingItemsCount > 2)
     *                - `firstMatchingItem`: first sourceItem that matched the predicate (only present if matchingItemsCount > 1)
     *                - `secondMatchingItem`: second sourceItem that matched the predicate (only present if matchingItemsCount > 2)
     *        - `LocalizedRecoveryOptions`
     *            - `Continue` *string*, the string for the continue button - default value if not specified
     *            - `Cancel` *string*, the string for the cancel button - default value if not specified
     *        - `RecoveryOptions` (optional)
     *            - `Continue` *bool*, the boolean for whether to have a continue button - default value is YES if not specified
     *            - `Destructive` *bool*, the boolean for whether continuing is a destructive action - default value is NO if not specified
     *    - `SubInteractions `: *dictionary* (same as `NSFileProviderUserInteractions`)
     * 
     * For each interaction, either Alert or SubInteractions must be specified. SubInteractions will be evaluated if the main ActivationRule evaluates to
     * YES for at least once. This allows you to match a general pattern via the top-level activation rule and then select a specialized error message from a list
     * of subpatterns.
     * 
     * Here is a sample extension Info.plist:
     * 
     * ```
     * <key>NSExtension</key>
     * ...
     * <key>NSFileProviderUserInteractions</key>
     * <array>
     *    <key>ActivationRule</key>
     *    <string>action == Move</string>
     *    <key>SubInteractions</key>
     *    <array>
     *        <dict>
     *            <key>ActivationRule</key>
     *            <string>sourceItem.isShared == NO AND
     *                    destinationItem.isShared == YES AND
     *                    destinationItem.isSharedByCurrentUser == YES</string>
     *            <key>SubInteractions</key>
     *            <array>
     *                <dict>
     *                    <key>ActivationRule</key>
     *                    <string>sourceItemsCount == 1</string>
     *                    <key>Alert</key>
     *                    <dict>
     *                        <key>LocalizedTitle</key>
     *                        <dict>
     *                            <key>NSStringFormat</key>
     *                            <string>Are you sure you want to move %@ into %@?</string>
     *                            <key>NSStringFormatValues</key>
     *                            <array>
     *                                <string>firstMatchingItem.filename</string>
     *                                <string>destinationItem.filename</string>
     *                            </array>
     *                        </dict>
     *                        <key>LocalizedSubTitle</key>
     *                        <dict>
     *                            <key>NSStringFormat</key>
     *                            <string>If you move it, people added to the shared folder “%@” will be able to access it</string>
     *                            <key>NSStringFormatValues</key>
     *                            <array>
     *                                <string>destinationItem.filename</string>
     *                            </array>
     *                        </dict>
     *                        <key>LocalizedRecoveryOptions</key>
     *                        <array>
     *                            <key>Continue</key><string>Save to shared folder</string>
     *                        </array>
     *                    </dict>
     *                </dict>
     *            </array>
     *        </dict>
     *        <dict>
     *            <key>ActivationRule</key>
     *            <string>sourceItem.isShared == YES AND
     *                    sourceItem.isSharedByCurrentUser == NO AND
     *                    destinationItem.isSharedByCurrentUser == YES</string>
     *            <key>SubInteractions</key>
     *            <array>
     *                <dict>
     *                    <key>ActivationRule</key>
     *                    <string>sourceItemsCount == 1</string>
     *                    <key>Alert</key>
     *                    <dict>
     *                        <key>LocalizedTitle</key>
     *                        <dict>
     *                            <key>NSStringFormat</key>
     *                            <string>This shared item can't be moved.</string>
     *                        </dict>
     *                        <key>LocalizedSubTitle</key>
     *                        <dict>
     *                            <key>NSStringFormat</key>
     *                            <string>Items shared with you can’t be moved to shared folders</string>
     *                        </dict>
     *                    </dict>
     *                    <key>RecoveryOptions</key>
     *                    <dict>
     *                        <key>Continue</key>
     *                        <false/>
     *                    </dict>
     *                </dict>
     *            </array>
     *        </dict>
     *    </array>
     * </array>
     * ```
     */
    @Generated
    @IsOptional
    @Selector("userInfo")
    default NSDictionary<?, ?> userInfo() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The versionIdentifier is used to invalidate the thumbnail in the thumbnail cache.
     * A content hash would be a reasonable choice.
     * 
     * Version identifiers are limited to 1000 bytes.
     */
    @Generated
    @IsOptional
    @Selector("versionIdentifier")
    default NSData versionIdentifier() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * ContentType (UTType) for the item.
     * 
     * An item should implement at least one of typeIdentifier and contentType. Note
     * that typeIdentifier is required on iOS 13 and earlier.
     */
    @Generated
    @IsOptional
    @Selector("contentType")
    default UTType contentType() {
        throw new java.lang.UnsupportedOperationException();
    }
}