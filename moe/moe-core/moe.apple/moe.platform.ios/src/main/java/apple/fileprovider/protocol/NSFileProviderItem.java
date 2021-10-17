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
     * <p>
     * Capabilities on an item only apply to the item itself. They are not inherited by the children of directories.
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

    /**
     * An error that occurred while downloading from your remote server.
     */
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
     * <p>
     * When favoriting folders on other platforms, set the rank to the time since the
     * unix epoch in milliseconds.  Special value @(NSFileProviderFavoriteRankUnranked)
     * may be used if no rank is available: the system will then figure out the best
     * rank and set it.  Please persist and sync the new value.
     * <p>
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
     * <p>
     * The filename property must not be an empty string, including when the item identifier is
     * NSFileProviderRootContainerItemIdentifier. The filename for NSFileProviderRootContainerItemIdentifier
     * may be displayed in the user interface. Therefore it should be a user-friendly string.
     */
    @Generated
    @Selector("filename")
    String filename();

    /**
     * When using NSFileProviderExtension, downloaded and downloading are used to inform the cloud badge
     * which will be shown on the item.
     * <p>
     * When using NSFileProviderReplicatedExtension, downloaded and downloading are ignored, as they can be
     * inferred from the result of calls to fetchContentsForItemWithIdentifier.
     */
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
     * <p>
     * This flag should only be set on the top-level item: trashing a directory sets
     * this flag on the directory itself, but not on its children.
     * <p>
     * Trashed items should remain in the working set; however, children of trashed
     * directories should be removed from the working set.
     * <p>
     * Additionally, when an item is trashed, the `parentItemIdentifier` refers to the location the item was before being
     * trashed. As such, when the user decides to restore the item from trash, `parentItemIdentifier` will be used for
     * the default restore location.
     */
    @Generated
    @IsOptional
    @Selector("isTrashed")
    default boolean isTrashed() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Uploaded and uploading are used to inform the cloud badge which will be shown on the item.
     * <p>
     * When using NSFileProviderReplicatedExtension, uploaded is used to inform whether the item may be
     * evicted from the local disk. If you choose to finish uploading items after calling the completion handler
     * of creteItem/modifyItem, you must set the uploaded flag to false, in order for the item to be excluded from
     * eviction.
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

    /**
     * The identifier of the item.
     * <p>
     * The itemIdentifier should not contain sensitive information, as it may be recorded in system logs and
     * diagnostic files.
     */
    @Generated
    @Selector("itemIdentifier")
    String itemIdentifier();

    /**
     * The date this item was last used.  This is neither the modification date nor
     * the last access date exposed in traditional file system APIs, and indicates a
     * very clear user intent to use the document.  For example, this is set when the
     * document is open full screen on a device.
     * <p>
     * This is the system's cue that the document is recent and should appear in the
     * recent list of the UIDocumentBrowserViewController.
     * <p>
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
     * <p>
     * Set to NSFileProviderRootContainerItemIdentifier for an item at the root of the
     * user's storage.  Set to the itemIdentifier of the item's parent otherwise.
     * <p>
     * When enumerating the root container or a generic container, the
     * parentItemIdentifier of the enumerated items is expected to match the
     * enumerated item's identifier.  When enumerating the working set, the
     * parentItemIdentifier is expected to match the actual parent of the item in the
     * hierarchy (ie. it is not NSFileProviderWorkingSetContainerItemIdentifier).
     * <p>
     * The parents of trashed items and of the root item are ignored.
     */
    @Generated
    @Selector("parentItemIdentifier")
    String parentItemIdentifier();

    /**
     * An abstract data blob representing the tags associated with the item.  The same
     * tags that are available via -[NSURL getResourceValue:forKey:error:] with key
     * NSURLTagNamesKey on macOS, except that this data blob may transport more
     * information than just the tag names.
     * <p>
     * This property must not be shared between users, even if the item is.
     * <p>
     * Starting in macOS 12 and iOS 15, the system suppports the value of the
     * `com.apple.metadata:_kMDItemUserTags` xattr as a valid `tagData` blob input.
     */
    @Generated
    @IsOptional
    @Selector("tagData")
    default NSData tagData() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Uniform type identifier (UTI) for the item.
     * <p>
     * This property is deprecated in favor of the "contentType" property.
     * <p>
     * On macOS, typeIdentifier is not available. Items must implement contentType
     * on macOS.
     * <p>
     * On iOS, items must implement either contentType or typeIdentifier. Note
     * that contentType is not available on iOS 13 and earlier, so typeIdentifier
     * is required in order to target iOS 13 and earlier.
     */
    @IsOptional
    @Generated
    @Selector("typeIdentifier")
    default String typeIdentifier() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * An error that occurred while uploading to your remote server.
     * <p>
     * \note Typical uploading errors include:
     * - NSFileProviderErrorInsufficientQuota
     * - NSFileProviderErrorServerUnreachable
     * <p>
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
     * Use this dictionary to add state information to the item. Entries are accessible to
     * FileProviderUI and non-UI action predicates and user interaction predicates [1] via the
     * `userInfo` context key.
     * <p>
     * Additionally, any entry of this dictionary with a key ending in `.inherited`
     * will be accessible to predicates for descendants of this item via the context key `inheritedUserInfo`.
     * <p>
     * Items can redefine inherited values for their descendants by specifying the same key used in an ancestor's `userInfo`.
     * Thus, `inheritedUserInfo` for a given item is a dictionary of `*.inherited` keys from all if its ancestors, with each value
     * taken from the nearest ancestor that has the entry defined.
     * <p>
     * In this example directory structure:
     * root
     * |_ parent
     * |_ child
     * |_ grandchild
     * <p>
     * with the following userInfo values set:
     * parent.userInfo = { "a.inherited": YES, "b.inherited": YES }
     * child.userInfo = { "a.inherited": NO, "c.inherited": NO }
     * grandchild.userInfo = { }
     * <p>
     * the following inheritedUserInfo values will be provided:
     * parent.inheritedUserInfo = { }
     * child.inheritedUserInfo = { "a.inherited": YES, "b.inherited": YES }
     * grandchild.inheritedUserInfo = { "a.inherited": NO, "b.inherited": YES, "c.inherited": NO }
     * <p>
     * The context key `resolvedUserInfo` is also available. For each item, the resolvedUserInfo is it's
     * inheritedUserInfo, combined with the keys suffixed with .inherited from it's userInfo.
     * Continuing the previous example:
     * parent.resolvedUserInfo = { "a.inherited": YES, "b.inherited": YES }
     * child.resolvedUserInfo = { "a.inherited": NO, "b.inherited": YES, "c.inherited": NO }
     * grandchild.resolvedUserInfo = { "a.inherited": NO, "b.inherited": YES, "c.inherited": NO }
     * <p>
     * All values for this dictionary must be of type String, Number, Bool or Date.
     * <p>
     * [1] UserInteraction can be defined when a user level action occurs with a file.
     * <p>
     * - `NSFileProviderUserInteractions` *array*
     * - `ActivationRule ` *string*, the predicate.
     * [@parameters] predicates
     * - `destinationItem`: the destination item for an action. Present for Move/MoveIn/Copy/CopyIn/Create
     * - `action` : the action that is being performed
     * 'Move'       : moving item(s) within the same provider
     * 'MoveOut'    : moving item(s) out of the provider
     * 'MoveIn'     : importing item(s) into a folder/root of the provider
     * 'Copy'       : copying item(s) within the same provider
     * 'CopyOut'    : copying item(s) out of the provider
     * 'CopyIn'     : copying item(s) into a folder/root of the provider
     * 'Trash'      : trashing item(s)
     * 'Create'      : creating an item (available in macOS 12.0 and later)
     * The Create action will be evaluated when the user creates a new file
     * or folder in a system Open/Save panel.
     * The sourceItem is the file/folder being created. The only field that is
     * populated for this item is the filename. The type of file/folder, size, etc,
     * are unknown at Create evaluation time.
     * The destinationItem is the directory which the file/folder is being created
     * within.
     * 'Delete'     : deleting item(s)
     * If the provider wishes to take full responsibility for showing warnings on Delete,
     * the provider can set NSExtensionFileProviderAllowsSystemDeleteAlerts=0 in the provider's Info.plist.
     * This will ensure that the system does not display it's warnings when the user is deleting a file.
     * 'ExcludeFromSync' : deleting items(s) because the user chose to exclude those from sync (available in macOS 12.0 and later)
     * 'Rename'  : renaming item(s) (available in macOS 11.3 and later)
     * - `sourceItem` : current item that the predicate is evaluating. Present for Move/MoveOut/Copy/CopyOut/Create/Trash/Delete/ExcludeFromSync/Rename
     * - `sourceItemsCount` :
     * - In userInteraction, represents the count of sourceItems of an action operation
     * - In subUserInteraction: represents the count of items that matched the previous predicate
     * - `domainUserInfo`: The latest dictionary returned from -[NSFileProviderDomainState userInfo]
     * - `Alert` *dictionary*
     * - `LocalizedTitle` *string*, title of the alert
     * - `LocalizedSubTitle` *string*, sub title of the alert
     * - @parameters for LocalizedTitle/LocalizedSubTitle
     * - `matchingItemsCount`: count of source items that matched the predicate (only present if matchingItemsCount > 0)
     * - `matchingItemsCountMinusOne`: matchingItemsCount minus one (only present if matchingItemsCount > 1)
     * - `matchingItemsCountMinusTwo`: matchingItemsCount minus two (only present if matchingItemsCount > 2)
     * - `firstMatchingItem`: first sourceItem that matched the predicate (only present if matchingItemsCount > 1)
     * - `secondMatchingItem`: second sourceItem that matched the predicate (only present if matchingItemsCount > 2)
     * - `LocalizedRecoveryOptions`
     * - `Continue` *string*, the string for the continue button - default value if not specified
     * - `Cancel` *string*, the string for the cancel button - default value if not specified
     * - `RecoveryOptions` (optional)
     * - `Continue` *bool*, the boolean for whether to have a continue button - default value is YES if not specified
     * - `Destructive` *bool*, the boolean for whether continuing is a destructive action - default value is NO if not specified
     * - `HelpURL` *string*: If present, a help button will be displayed on the Alert that is shown. If the user
     * clicks the help button, this help URL will be opened. This URL is not restricted to Web URLs. For instance, the extension could configure
     * the HelpURL to launch it's application with a custom URL scheme. (available in macOS 12.0 and later)
     * - `SubInteractions `: *dictionary* (same as `NSFileProviderUserInteractions`)
     * - `SupressionIdentifier` *string*: If present, when this predicate matches, the alert will display an option to
     * suppress future alerts from UserInteractions with the same
     * SuppressionIdentifier (including the current UserInteraction). This also
     * requires implementing the `NSFileProviderUserInteractionSuppressing`
     * protocol on the principal class of the FileProvider extension (available in
     * macOS 12.0 and later).
     * <p>
     * For each interaction, either Alert or SubInteractions must be specified. SubInteractions will be evaluated if the main ActivationRule evaluates to
     * YES for at least once. This allows you to match a general pattern via the top-level activation rule and then select a specialized error message from a list
     * of subpatterns.
     * <p>
     * At most one UserInteraction alert will be shown for each FileProvider domain involved in the user's Action. For
     * instance, if provider A defines a UserInteraction for MoveOut actions, and provider B defines a UserInteraction
     * for MoveIn operations. When the user moves a file from A to B, and the predicate for both UserInteraction
     * matches, then both of the UserInteraction alerts will be shown to the user. However, as soon as the user
     * denies any of the alerts, the remainder will not be shown, and the action will be denied.
     * <p>
     * Here is a sample extension Info.plist:
     * <p>
     * ```
     * <key>NSExtension</key>
     * ...
     * <key>NSFileProviderUserInteractions</key>
     * <array>
     * <key>ActivationRule</key>
     * <string>action == "Move"</string>
     * <key>SubInteractions</key>
     * <array>
     * <dict>
     * <key>ActivationRule</key>
     * <string>sourceItem.isShared == NO AND
     * destinationItem.isShared == YES AND
     * destinationItem.isSharedByCurrentUser == YES</string>
     * <key>SubInteractions</key>
     * <array>
     * <dict>
     * <key>ActivationRule</key>
     * <string>sourceItemsCount == 1</string>
     * <key>Alert</key>
     * <dict>
     * <key>LocalizedTitle</key>
     * <dict>
     * <key>NSStringFormat</key>
     * <string>Are you sure you want to move %@ into %@?</string>
     * <key>NSStringFormatValues</key>
     * <array>
     * <string>firstMatchingItem.filename</string>
     * <string>destinationItem.filename</string>
     * </array>
     * </dict>
     * <key>LocalizedSubTitle</key>
     * <dict>
     * <key>NSStringFormat</key>
     * <string>If you move it, people added to the shared folder “%@” will be able to access it</string>
     * <key>NSStringFormatValues</key>
     * <array>
     * <string>destinationItem.filename</string>
     * </array>
     * </dict>
     * <key>LocalizedRecoveryOptions</key>
     * <array>
     * <key>Continue</key><string>Save to shared folder</string>
     * </array>
     * </dict>
     * </dict>
     * </array>
     * </dict>
     * <dict>
     * <key>ActivationRule</key>
     * <string>sourceItem.isShared == YES AND
     * sourceItem.isSharedByCurrentUser == NO AND
     * destinationItem.isSharedByCurrentUser == YES</string>
     * <key>SubInteractions</key>
     * <array>
     * <dict>
     * <key>ActivationRule</key>
     * <string>sourceItemsCount == 1</string>
     * <key>Alert</key>
     * <dict>
     * <key>LocalizedTitle</key>
     * <dict>
     * <key>NSStringFormat</key>
     * <string>This shared item can't be moved.</string>
     * </dict>
     * <key>LocalizedSubTitle</key>
     * <dict>
     * <key>NSStringFormat</key>
     * <string>Items shared with you can’t be moved to shared folders</string>
     * </dict>
     * </dict>
     * <key>RecoveryOptions</key>
     * <dict>
     * <key>Continue</key>
     * <false/>
     * </dict>
     * </dict>
     * </array>
     * </dict>
     * </array>
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
     * <p>
     * Version identifiers are limited to 1000 bytes.
     * <p>
     * This property is deprecated in favor of the "itemVersion" property.
     */
    @Generated
    @IsOptional
    @Selector("versionIdentifier")
    default NSData versionIdentifier() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * ContentType (UTType) for the item.
     * <p>
     * On macOS, items must implement contentType.
     * <p>
     * On iOS, items must implement either contentType or typeIdentifier. Note
     * that contentType is not available on iOS 13 and earlier, so typeIdentifier
     * is required in order to target iOS 13 and earlier.
     * <p>
     * When using NSFileProviderReplicatedExtension, providers must be prepared
     * to handle the following contentType in the appropriate manner
     * when they are passed in itemTemplates contentType to createItem/modifyItem calls:
     * * UTType.symbolicLink
     * * UTType.folder
     * * UTType.package
     * * UTType.aliasFile
     * <p>
     * Changing the contentType for a given item that would result in a transition to/from a folder
     * or to/from a symlink is not supported.
     */
    @Generated
    @IsOptional
    @Selector("contentType")
    default UTType contentType() {
        throw new java.lang.UnsupportedOperationException();
    }
}
