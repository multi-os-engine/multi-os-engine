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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSFileManagerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFileManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Returns the default singleton instance.
     */
    @Generated
    @Selector("defaultManager")
    public static native NSFileManager defaultManager();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSFileManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * -URLForDirectory:inDomain:appropriateForURL:create:error: is a URL-based replacement for FSFindFolder(). It
     * allows for the specification and (optional) creation of a specific directory for a particular purpose (e.g. the
     * replacement of a particular item on disk, or a particular Library directory.
     * <p>
     * You may pass only one of the values from the NSSearchPathDomainMask enumeration, and you may not pass
     * NSAllDomainsMask.
     */
    @Generated
    @Selector("URLForDirectory:inDomain:appropriateForURL:create:error:")
    public native NSURL URLForDirectoryInDomainAppropriateForURLCreateError(@NUInt long directory, @NUInt long domain,
            NSURL url, boolean shouldCreate, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns a URL that can be shared with other users to allow them download a copy of the specified ubiquitous item.
     * Also returns the date after which the item will no longer be accessible at the returned URL. The URL must be
     * prefixed with a URL from -URLForUbiquityContainerIdentifier:.
     */
    @Generated
    @Selector("URLForPublishingUbiquitousItemAtURL:expirationDate:error:")
    public native NSURL URLForPublishingUbiquitousItemAtURLExpirationDateError(NSURL url,
            @ReferenceInfo(type = NSDate.class) Ptr<NSDate> outDate,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns a file URL for the root of the ubiquity container directory corresponding to the supplied container ID.
     * Returns nil if the mobile container does not exist or could not be determined.
     */
    @Generated
    @Selector("URLForUbiquityContainerIdentifier:")
    public native NSURL URLForUbiquityContainerIdentifier(String containerIdentifier);

    /**
     * -URLsForDirectory:inDomains: is analogous to NSSearchPathForDirectoriesInDomains(), but returns an array of NSURL
     * instances for use with URL-taking APIs. This API is suitable when you need to search for a file or files which
     * may live in one of a variety of locations in the domains specified.
     */
    @Generated
    @Selector("URLsForDirectory:inDomains:")
    public native NSArray<? extends NSURL> URLsForDirectoryInDomains(@NUInt long directory, @NUInt long domainMask);

    /**
     * attributesOfFileSystemForPath:error: returns an NSDictionary of key/value pairs containing the attributes of the
     * filesystem containing the provided path. If this method returns 'nil', an NSError will be returned by reference
     * in the 'error' parameter. This method does not traverse a terminal symlink.
     * <p>
     * This method replaces fileSystemAttributesAtPath:.
     */
    @Generated
    @Selector("attributesOfFileSystemForPath:error:")
    public native NSDictionary<String, ?> attributesOfFileSystemForPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * attributesOfItemAtPath:error: returns an NSDictionary of key/value pairs containing the attributes of the item
     * (file, directory, symlink, etc.) at the path in question. If this method returns 'nil', an NSError will be
     * returned by reference in the 'error' parameter. This method does not traverse a terminal symlink.
     * <p>
     * This method replaces fileAttributesAtPath:traverseLink:.
     */
    @Generated
    @Selector("attributesOfItemAtPath:error:")
    public native NSDictionary<String, ?> attributesOfItemAtPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("changeCurrentDirectoryPath:")
    public native boolean changeCurrentDirectoryPath(String path);

    @Generated
    @Deprecated
    @Selector("changeFileAttributes:atPath:")
    public native boolean changeFileAttributesAtPath(NSDictionary<?, ?> attributes, String path);

    /**
     * componentsToDisplayForPath: returns an NSArray of display names for the path provided. Localization will occur as
     * in displayNameAtPath: above. This array cannot and should not be reassembled into an usable filesystem path for
     * any kind of access.
     */
    @Generated
    @Selector("componentsToDisplayForPath:")
    public native NSArray<String> componentsToDisplayForPath(String path);

    /**
     * Available for OS X in 10.8.3.
     */
    @Generated
    @Selector("containerURLForSecurityApplicationGroupIdentifier:")
    public native NSURL containerURLForSecurityApplicationGroupIdentifier(String groupIdentifier);

    /**
     * These methods are provided here for compatibility. The corresponding methods on NSData which return NSErrors
     * should be regarded as the primary method of creating a file from an NSData or retrieving the contents of a file
     * as an NSData.
     */
    @Generated
    @Selector("contentsAtPath:")
    public native NSData contentsAtPath(String path);

    /**
     * -contentsEqualAtPath:andPath: does not take into account data stored in the resource fork or filesystem extended
     * attributes.
     */
    @Generated
    @Selector("contentsEqualAtPath:andPath:")
    public native boolean contentsEqualAtPathAndPath(String path1, String path2);

    /**
     * contentsOfDirectoryAtPath:error: returns an NSArray of NSStrings representing the filenames of the items in the
     * directory. If this method returns 'nil', an NSError will be returned by reference in the 'error' parameter. If
     * the directory contains no items, this method will return the empty array.
     * <p>
     * This method replaces directoryContentsAtPath:
     */
    @Generated
    @Selector("contentsOfDirectoryAtPath:error:")
    public native NSArray<String> contentsOfDirectoryAtPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * -contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error: returns an NSArray of NSURLs identifying the
     * the directory entries. If this method returns nil, an NSError will be returned by reference in the 'error'
     * parameter. If the directory contains no entries, this method will return the empty array. When an array is
     * specified for the 'keys' parameter, the specified property values will be pre-fetched and cached with each
     * enumerated URL.
     * <p>
     * This method always does a shallow enumeration of the specified directory (i.e. it always acts as if
     * NSDirectoryEnumerationSkipsSubdirectoryDescendants has been specified). If you need to perform a deep
     * enumeration, use -[NSFileManager enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:].
     * <p>
     * If you wish to only receive the URLs and no other attributes, then pass '0' for 'options' and an empty NSArray
     * ('[NSArray array]') for 'keys'. If you wish to have the property caches of the vended URLs pre-populated with a
     * default set of attributes, then pass '0' for 'options' and 'nil' for 'keys'.
     */
    @Generated
    @Selector("contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:")
    public native NSArray<? extends NSURL> contentsOfDirectoryAtURLIncludingPropertiesForKeysOptionsError(NSURL url,
            NSArray<String> keys, @NUInt long mask, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These methods replace their non-error returning counterparts below. See the NSFileManagerDelegate protocol below
     * for methods that are dispatched to the NSFileManager instance's delegate.
     */
    @Generated
    @Selector("copyItemAtPath:toPath:error:")
    public native boolean copyItemAtPathToPathError(String srcPath, String dstPath,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These methods are URL-taking equivalents of the four methods above. Their delegate methods are defined in the
     * NSFileManagerDelegate protocol below.
     */
    @Generated
    @Selector("copyItemAtURL:toURL:error:")
    public native boolean copyItemAtURLToURLError(NSURL srcURL, NSURL dstURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("createDirectoryAtPath:attributes:")
    public native boolean createDirectoryAtPathAttributes(String path, NSDictionary<?, ?> attributes);

    /**
     * createDirectoryAtPath:withIntermediateDirectories:attributes:error: creates a directory at the specified path. If
     * you pass 'NO' for createIntermediates, the directory must not exist at the time this call is made. Passing 'YES'
     * for 'createIntermediates' will create any necessary intermediate directories. This method returns YES if all
     * directories specified in 'path' were created and attributes were set. Directories are created with attributes
     * specified by the dictionary passed to 'attributes'. If no dictionary is supplied, directories are created
     * according to the umask of the process. This method returns NO if a failure occurs at any stage of the operation.
     * If an error parameter was provided, a presentable NSError will be returned by reference.
     * <p>
     * This method replaces createDirectoryAtPath:attributes:
     */
    @Generated
    @Selector("createDirectoryAtPath:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtPathWithIntermediateDirectoriesAttributesError(String path,
            boolean createIntermediates, NSDictionary<String, ?> attributes,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * createDirectoryAtURL:withIntermediateDirectories:attributes:error: creates a directory at the specified URL. If
     * you pass 'NO' for withIntermediateDirectories, the directory must not exist at the time this call is made.
     * Passing 'YES' for withIntermediateDirectories will create any necessary intermediate directories. This method
     * returns YES if all directories specified in 'url' were created and attributes were set. Directories are created
     * with attributes specified by the dictionary passed to 'attributes'. If no dictionary is supplied, directories are
     * created according to the umask of the process. This method returns NO if a failure occurs at any stage of the
     * operation. If an error parameter was provided, a presentable NSError will be returned by reference.
     */
    @Generated
    @Selector("createDirectoryAtURL:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtURLWithIntermediateDirectoriesAttributesError(NSURL url,
            boolean createIntermediates, NSDictionary<String, ?> attributes,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("createFileAtPath:contents:attributes:")
    public native boolean createFileAtPathContentsAttributes(String path, NSData data, NSDictionary<String, ?> attr);

    @Generated
    @Deprecated
    @Selector("createSymbolicLinkAtPath:pathContent:")
    public native boolean createSymbolicLinkAtPathPathContent(String path, String otherpath);

    /**
     * createSymbolicLinkAtPath:withDestination:error: returns YES if the symbolic link that point at 'destPath' was
     * able to be created at the location specified by 'path'. If this method returns NO, the link was unable to be
     * created and an NSError will be returned by reference in the 'error' parameter. This method does not traverse a
     * terminal symlink.
     * <p>
     * This method replaces createSymbolicLinkAtPath:pathContent:
     */
    @Generated
    @Selector("createSymbolicLinkAtPath:withDestinationPath:error:")
    public native boolean createSymbolicLinkAtPathWithDestinationPathError(String path, String destPath,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * createSymbolicLinkAtURL:withDestinationURL:error: returns YES if the symbolic link that point at 'destURL' was
     * able to be created at the location specified by 'url'. 'destURL' is always resolved against its base URL, if it
     * has one. If 'destURL' has no base URL and it's 'relativePath' is indeed a relative path, then a relative symlink
     * will be created. If this method returns NO, the link was unable to be created and an NSError will be returned by
     * reference in the 'error' parameter. This method does not traverse a terminal symlink.
     */
    @Generated
    @Selector("createSymbolicLinkAtURL:withDestinationURL:error:")
    public native boolean createSymbolicLinkAtURLWithDestinationURLError(NSURL url, NSURL destURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Process working directory management. Despite the fact that these are instance methods on NSFileManager, these
     * methods report and change (respectively) the working directory for the entire process. Developers are cautioned
     * that doing so is fraught with peril.
     */
    @Generated
    @Selector("currentDirectoryPath")
    public native String currentDirectoryPath();

    /**
     * Instances of NSFileManager may now have delegates. Each instance has one delegate, and the delegate is not
     * retained. In versions of Mac OS X prior to 10.5, the behavior of calling [[NSFileManager alloc] init] was
     * undefined. In Mac OS X 10.5 "Leopard" and later, calling [[NSFileManager alloc] init] returns a new instance of
     * an NSFileManager.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileManagerDelegate delegate();

    /**
     * destinationOfSymbolicLinkAtPath:error: returns an NSString containing the path of the item pointed at by the
     * symlink specified by 'path'. If this method returns 'nil', an NSError will be returned by reference in the
     * 'error' parameter.
     * <p>
     * This method replaces pathContentOfSymbolicLinkAtPath:
     */
    @Generated
    @Selector("destinationOfSymbolicLinkAtPath:error:")
    public native String destinationOfSymbolicLinkAtPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("directoryContentsAtPath:")
    public native NSArray<?> directoryContentsAtPath(String path);

    /**
     * displayNameAtPath: returns an NSString suitable for presentation to the user. For directories which have
     * localization information, this will return the appropriate localized string. This string is not suitable for
     * passing to anything that must interact with the filesystem.
     */
    @Generated
    @Selector("displayNameAtPath:")
    public native String displayNameAtPath(String path);

    /**
     * enumeratorAtPath: returns an NSDirectoryEnumerator rooted at the provided path. If the enumerator cannot be
     * created, this returns NULL. Because NSDirectoryEnumerator is a subclass of NSEnumerator, the returned object can
     * be used in the for...in construct.
     */
    @Generated
    @Selector("enumeratorAtPath:")
    public native NSDirectoryEnumerator<String> enumeratorAtPath(String path);

    /**
     * enumeratorAtURL:includingPropertiesForKeys:options:errorHandler: returns an NSDirectoryEnumerator rooted at the
     * provided directory URL. The NSDirectoryEnumerator returns NSURLs from the -nextObject method. The optional
     * 'includingPropertiesForKeys' parameter indicates which resource properties should be pre-fetched and cached with
     * each enumerated URL. The optional 'errorHandler' block argument is invoked when an error occurs. Parameters to
     * the block are the URL on which an error occurred and the error. When the error handler returns YES, enumeration
     * continues if possible. Enumeration stops immediately when the error handler returns NO.
     * <p>
     * If you wish to only receive the URLs and no other attributes, then pass '0' for 'options' and an empty NSArray
     * ('[NSArray array]') for 'keys'. If you wish to have the property caches of the vended URLs pre-populated with a
     * default set of attributes, then pass '0' for 'options' and 'nil' for 'keys'.
     */
    @Generated
    @Selector("enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:")
    public native NSDirectoryEnumerator<NSURL> enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(NSURL url,
            NSArray<String> keys, @NUInt long mask,
            @ObjCBlock(name = "call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler") Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler handler);

    /**
     * Removes the local instance of the ubiquitous item at the given URL. Returns YES if removal was successful, NO
     * otherwise.
     */
    @Generated
    @Selector("evictUbiquitousItemAtURL:error:")
    public native boolean evictUbiquitousItemAtURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The following methods are deprecated on Mac OS X 10.5. Their URL-based and/or error-returning replacements are
     * listed above.
     */
    @Generated
    @Deprecated
    @Selector("fileAttributesAtPath:traverseLink:")
    public native NSDictionary<?, ?> fileAttributesAtPathTraverseLink(String path, boolean yorn);

    /**
     * The following methods are of limited utility. Attempting to predicate behavior based on the current state of the
     * filesystem or a particular file on the filesystem is encouraging odd behavior in the face of filesystem race
     * conditions. It's far better to attempt an operation (like loading a file or creating a directory) and handle the
     * error gracefully than it is to try to figure out ahead of time whether the operation will succeed.
     */
    @Generated
    @Selector("fileExistsAtPath:")
    public native boolean fileExistsAtPath(String path);

    @Generated
    @Selector("fileExistsAtPath:isDirectory:")
    public native boolean fileExistsAtPathIsDirectory(String path, BoolPtr isDirectory);

    @Generated
    @Deprecated
    @Selector("fileSystemAttributesAtPath:")
    public native NSDictionary<?, ?> fileSystemAttributesAtPath(String path);

    /**
     * fileSystemRepresentationWithPath: returns an array of characters suitable for passing to lower-level POSIX style
     * APIs. The string is provided in the representation most appropriate for the filesystem in question.
     */
    @Generated
    @Selector("fileSystemRepresentationWithPath:")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentationWithPath(String path);

    /**
     * Similar to -[NSFileManager getRelationship:ofDirectoryAtURL:toItemAtURL:error:], except that the directory is
     * instead defined by an NSSearchPathDirectory and NSSearchPathDomainMask. Pass 0 for domainMask to instruct the
     * method to automatically choose the domain appropriate for 'url'. For example, to discover if a file is contained
     * by a Trash directory, call [fileManager getRelationship:&result ofDirectory:NSTrashDirectory inDomain:0
     * toItemAtURL:url error:&error].
     */
    @Generated
    @Selector("getRelationship:ofDirectory:inDomain:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryInDomainToItemAtURLError(NIntPtr outRelationship,
            @NUInt long directory, @NUInt long domainMask, NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Sets 'outRelationship' to NSURLRelationshipContains if the directory at 'directoryURL' directly or indirectly
     * contains the item at 'otherURL', meaning 'directoryURL' is found while enumerating parent URLs starting from
     * 'otherURL'. Sets 'outRelationship' to NSURLRelationshipSame if 'directoryURL' and 'otherURL' locate the same
     * item, meaning they have the same NSURLFileResourceIdentifierKey value. If 'directoryURL' is not a directory, or
     * does not contain 'otherURL' and they do not locate the same file, then sets 'outRelationship' to
     * NSURLRelationshipOther. If an error occurs, returns NO and sets 'error'.
     */
    @Generated
    @Selector("getRelationship:ofDirectoryAtURL:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryAtURLToItemAtURLError(NIntPtr outRelationship, NSURL directoryURL,
            NSURL otherURL, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSFileManager init();

    @Generated
    @Selector("isDeletableFileAtPath:")
    public native boolean isDeletableFileAtPath(String path);

    @Generated
    @Selector("isExecutableFileAtPath:")
    public native boolean isExecutableFileAtPath(String path);

    @Generated
    @Selector("isReadableFileAtPath:")
    public native boolean isReadableFileAtPath(String path);

    /**
     * Returns YES if the item for the specified URL is ubiquitous, NO otherwise.
     */
    @Generated
    @Selector("isUbiquitousItemAtURL:")
    public native boolean isUbiquitousItemAtURL(NSURL url);

    @Generated
    @Selector("isWritableFileAtPath:")
    public native boolean isWritableFileAtPath(String path);

    @Generated
    @Selector("linkItemAtPath:toPath:error:")
    public native boolean linkItemAtPathToPathError(String srcPath, String dstPath,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("linkItemAtURL:toURL:error:")
    public native boolean linkItemAtURLToURLError(NSURL srcURL, NSURL dstURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * -mountedVolumeURLsIncludingResourceValuesForKeys:options: returns an NSArray of NSURLs locating the mounted
     * volumes available on the computer. The property keys that can be requested are available in <Foundation/NSURL.h>.
     */
    @Generated
    @Selector("mountedVolumeURLsIncludingResourceValuesForKeys:options:")
    public native NSArray<? extends NSURL> mountedVolumeURLsIncludingResourceValuesForKeysOptions(
            NSArray<String> propertyKeys, @NUInt long options);

    @Generated
    @Selector("moveItemAtPath:toPath:error:")
    public native boolean moveItemAtPathToPathError(String srcPath, String dstPath,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("moveItemAtURL:toURL:error:")
    public native boolean moveItemAtURLToURLError(NSURL srcURL, NSURL dstURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("pathContentOfSymbolicLinkAtPath:")
    public native String pathContentOfSymbolicLinkAtPath(String path);

    @Generated
    @Selector("removeItemAtPath:error:")
    public native boolean removeItemAtPathError(String path, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("removeItemAtURL:error:")
    public native boolean removeItemAtURLError(NSURL URL, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * -replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error: is for developers who wish to
     * perform a safe-save without using the full NSDocument machinery that is available in the AppKit.
     * <p>
     * The `originalItemURL` is the item being replaced.
     * `newItemURL` is the item which will replace the original item. This item should be placed in a temporary
     * directory as provided by the OS, or in a uniquely named directory placed in the same directory as the original
     * item if the temporary directory is not available.
     * If `backupItemName` is provided, that name will be used to create a backup of the original item. The backup is
     * placed in the same directory as the original item. If an error occurs during the creation of the backup item, the
     * operation will fail. If there is already an item with the same name as the backup item, that item will be
     * removed. The backup item will be removed in the event of success unless the
     * `NSFileManagerItemReplacementWithoutDeletingBackupItem` option is provided in `options`.
     * For `options`, pass `0` to get the default behavior, which uses only the metadata from the new item while
     * adjusting some properties using values from the original item. Pass
     * `NSFileManagerItemReplacementUsingNewMetadataOnly` in order to use all possible metadata from the new item.
     */
    @Generated
    @Selector("replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:")
    public native boolean replaceItemAtURLWithItemAtURLBackupItemNameOptionsResultingItemURLError(NSURL originalItemURL,
            NSURL newItemURL, String backupItemName, @NUInt long options,
            @ReferenceInfo(type = NSURL.class) Ptr<NSURL> resultingURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * setAttributes:ofItemAtPath:error: returns YES when the attributes specified in the 'attributes' dictionary are
     * set successfully on the item specified by 'path'. If this method returns NO, a presentable NSError will be
     * provided by-reference in the 'error' parameter. If no error is required, you may pass 'nil' for the error.
     * <p>
     * This method replaces changeFileAttributes:atPath:.
     */
    @Generated
    @Selector("setAttributes:ofItemAtPath:error:")
    public native boolean setAttributesOfItemAtPathError(NSDictionary<String, ?> attributes, String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Instances of NSFileManager may now have delegates. Each instance has one delegate, and the delegate is not
     * retained. In versions of Mac OS X prior to 10.5, the behavior of calling [[NSFileManager alloc] init] was
     * undefined. In Mac OS X 10.5 "Leopard" and later, calling [[NSFileManager alloc] init] returns a new instance of
     * an NSFileManager.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSFileManagerDelegate value);

    /**
     * Instances of NSFileManager may now have delegates. Each instance has one delegate, and the delegate is not
     * retained. In versions of Mac OS X prior to 10.5, the behavior of calling [[NSFileManager alloc] init] was
     * undefined. In Mac OS X 10.5 "Leopard" and later, calling [[NSFileManager alloc] init] returns a new instance of
     * an NSFileManager.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSFileManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Changes whether the item for the specified URL is ubiquitous and moves the item to the destination URL. When
     * making an item ubiquitous, the destination URL must be prefixed with a URL from
     * -URLForUbiquityContainerIdentifier:. Returns YES if the change is successful, NO otherwise.
     */
    @Generated
    @Selector("setUbiquitous:itemAtURL:destinationURL:error:")
    public native boolean setUbiquitousItemAtURLDestinationURLError(boolean flag, NSURL url, NSURL destinationURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Start downloading a local instance of the specified ubiquitous item, if necessary. Returns YES if the download
     * started successfully or wasn't necessary, NO otherwise.
     */
    @Generated
    @Selector("startDownloadingUbiquitousItemAtURL:error:")
    public native boolean startDownloadingUbiquitousItemAtURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * stringWithFileSystemRepresentation:length: returns an NSString created from an array of bytes that are in the
     * filesystem representation.
     */
    @Generated
    @Selector("stringWithFileSystemRepresentation:length:")
    public native String stringWithFileSystemRepresentationLength(ConstBytePtr str, @NUInt long len);

    /**
     * subpathsAtPath: returns an NSArray of all contents and subpaths recursively from the provided path. This may be
     * very expensive to compute for deep filesystem hierarchies, and should probably be avoided.
     */
    @Generated
    @Selector("subpathsAtPath:")
    public native NSArray<String> subpathsAtPath(String path);

    /**
     * subpathsOfDirectoryAtPath:error: returns an NSArray of NSStrings representing the filenames of the items in the
     * specified directory and all its subdirectories recursively. If this method returns 'nil', an NSError will be
     * returned by reference in the 'error' parameter. If the directory contains no items, this method will return the
     * empty array.
     * <p>
     * This method replaces subpathsAtPath:
     */
    @Generated
    @Selector("subpathsOfDirectoryAtPath:error:")
    public native NSArray<String> subpathsOfDirectoryAtPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("temporaryDirectory")
    public native NSURL temporaryDirectory();

    /**
     * Returns an opaque token that represents the current ubiquity identity. This object can be copied, encoded, or
     * compared with isEqual:. When ubiquity containers are unavailable because the user has disabled them, or when the
     * user is simply not logged in, this method will return nil. The NSUbiquityIdentityDidChangeNotification
     * notification is posted after this value changes.
     * <p>
     * If you don't need the container URL and just want to check if ubiquity containers are available you should use
     * this method instead of checking -URLForUbiquityContainerIdentifier:.
     */
    @Generated
    @Selector("ubiquityIdentityToken")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object ubiquityIdentityToken();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler {
        @Generated
        boolean call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(NSURL url, NSError error);
    }

    /**
     * Asynchronously returns a dictionary of zero or more NSFileProviderService instances, which enable your
     * application to instruct the file's provider to take various actions on or with regards to the given URL. To do
     * this, first identify an NSFileProviderService object whose name matches the service you wish to use. Then get an
     * NSXPCConnection from it and set up its NSXPCInterface with the protocol that matches the service's name. You'll
     * need to refer to external documentation or an SDK supplied by the provider to get this information. Once an
     * NSXPCConnection is obtained, you must finish configuring it and send it -resume. Failure to do so will result in
     * leaking system resources.
     */
    @Generated
    @Selector("getFileProviderServicesForItemAtURL:completionHandler:")
    public native void getFileProviderServicesForItemAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_getFileProviderServicesForItemAtURLCompletionHandler") Block_getFileProviderServicesForItemAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getFileProviderServicesForItemAtURLCompletionHandler {
        @Generated
        void call_getFileProviderServicesForItemAtURLCompletionHandler(
                NSDictionary<String, ? extends NSFileProviderService> services, NSError error);
    }

    /**
     * trashItemAtURL:resultingItemURL:error: returns YES if the item at 'url' was successfully moved to a Trash. Since
     * the operation may require renaming the file to avoid collisions, it also returns by reference the resulting URL
     * that the item was moved to. If this method returns NO, the item was not moved and an NSError will be returned by
     * reference in the 'error' parameter.
     * <p>
     * To easily discover if an item is in the Trash, you may use [fileManager getRelationship:&result
     * ofDirectory:NSTrashDirectory inDomain:0 toItemAtURL:url error:&error] && result == NSURLRelationshipContains.
     */
    @Generated
    @Selector("trashItemAtURL:resultingItemURL:error:")
    public native boolean trashItemAtURLResultingItemURLError(NSURL url,
            @ReferenceInfo(type = NSURL.class) Ptr<NSURL> outResultingURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
