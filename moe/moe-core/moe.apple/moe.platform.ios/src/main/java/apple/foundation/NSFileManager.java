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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Returns the default singleton instance.
     */
    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

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
     * 
     * You may pass only one of the values from the NSSearchPathDomainMask enumeration, and you may not pass
     * NSAllDomainsMask.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("URLForDirectory:inDomain:appropriateForURL:create:error:")
    public native NSURL URLForDirectoryInDomainAppropriateForURLCreateError(@NUInt long directory, @NUInt long domain,
            @Nullable NSURL url, boolean shouldCreate,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns a URL that can be shared with other users to allow them download a copy of the specified ubiquitous item.
     * Also returns the date after which the item will no longer be accessible at the returned URL. The URL must be
     * prefixed with a URL from -URLForUbiquityContainerIdentifier:.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("URLForPublishingUbiquitousItemAtURL:expirationDate:error:")
    public native NSURL URLForPublishingUbiquitousItemAtURLExpirationDateError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSDate.class) Ptr<NSDate> outDate,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns a file URL for the root of the ubiquity container directory corresponding to the supplied container ID.
     * Returns nil if the mobile container does not exist or could not be determined.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("URLForUbiquityContainerIdentifier:")
    public native NSURL URLForUbiquityContainerIdentifier(@Nullable String containerIdentifier);

    /**
     * -URLsForDirectory:inDomains: is analogous to NSSearchPathForDirectoriesInDomains(), but returns an array of NSURL
     * instances for use with URL-taking APIs. This API is suitable when you need to search for a file or files which
     * may live in one of a variety of locations in the domains specified.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("URLsForDirectory:inDomains:")
    public native NSArray<? extends NSURL> URLsForDirectoryInDomains(@NUInt long directory, @NUInt long domainMask);

    /**
     * attributesOfFileSystemForPath:error: returns an NSDictionary of key/value pairs containing the attributes of the
     * filesystem containing the provided path. If this method returns 'nil', an NSError will be returned by reference
     * in the 'error' parameter. This method does not traverse a terminal symlink.
     * 
     * This method replaces fileSystemAttributesAtPath:.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("attributesOfFileSystemForPath:error:")
    public native NSDictionary<String, ?> attributesOfFileSystemForPathError(@NotNull String path,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * attributesOfItemAtPath:error: returns an NSDictionary of key/value pairs containing the attributes of the item
     * (file, directory, symlink, etc.) at the path in question. If this method returns 'nil', an NSError will be
     * returned by reference in the 'error' parameter. This method does not traverse a terminal symlink.
     * 
     * This method replaces fileAttributesAtPath:traverseLink:.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("attributesOfItemAtPath:error:")
    public native NSDictionary<String, ?> attributesOfItemAtPathError(@NotNull String path,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("changeCurrentDirectoryPath:")
    public native boolean changeCurrentDirectoryPath(@NotNull String path);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -setAttributes:ofItemAtPath:error: instead
     */
    @Generated
    @Deprecated
    @Selector("changeFileAttributes:atPath:")
    public native boolean changeFileAttributesAtPath(@NotNull NSDictionary<?, ?> attributes, @NotNull String path);

    /**
     * componentsToDisplayForPath: returns an NSArray of display names for the path provided. Localization will occur as
     * in displayNameAtPath: above. This array cannot and should not be reassembled into an usable filesystem path for
     * any kind of access.
     */
    @Nullable
    @Generated
    @Selector("componentsToDisplayForPath:")
    public native NSArray<String> componentsToDisplayForPath(@NotNull String path);

    /**
     * Available for OS X in 10.8.3.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("containerURLForSecurityApplicationGroupIdentifier:")
    public native NSURL containerURLForSecurityApplicationGroupIdentifier(@NotNull String groupIdentifier);

    /**
     * These methods are provided here for compatibility. The corresponding methods on NSData which return NSErrors
     * should be regarded as the primary method of creating a file from an NSData or retrieving the contents of a file
     * as an NSData.
     */
    @Nullable
    @Generated
    @Selector("contentsAtPath:")
    public native NSData contentsAtPath(@NotNull String path);

    /**
     * -contentsEqualAtPath:andPath: does not take into account data stored in the resource fork or filesystem extended
     * attributes.
     */
    @Generated
    @Selector("contentsEqualAtPath:andPath:")
    public native boolean contentsEqualAtPathAndPath(@NotNull String path1, @NotNull String path2);

    /**
     * contentsOfDirectoryAtPath:error: returns an NSArray of NSStrings representing the filenames of the items in the
     * directory. If this method returns 'nil', an NSError will be returned by reference in the 'error' parameter. If
     * the directory contains no items, this method will return the empty array.
     * 
     * This method replaces directoryContentsAtPath:
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("contentsOfDirectoryAtPath:error:")
    public native NSArray<String> contentsOfDirectoryAtPathError(@NotNull String path,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * -contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error: returns an NSArray of NSURLs identifying the
     * the directory entries. If this method returns nil, an NSError will be returned by reference in the 'error'
     * parameter. If the directory contains no entries, this method will return the empty array. When an array is
     * specified for the 'keys' parameter, the specified property values will be pre-fetched and cached with each
     * enumerated URL.
     * 
     * This method always does a shallow enumeration of the specified directory (i.e. it always acts as if
     * NSDirectoryEnumerationSkipsSubdirectoryDescendants has been specified). If you need to perform a deep
     * enumeration, use -[NSFileManager enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:].
     * 
     * If you wish to only receive the URLs and no other attributes, then pass '0' for 'options' and an empty NSArray
     * ('[NSArray array]') for 'keys'. If you wish to have the property caches of the vended URLs pre-populated with a
     * default set of attributes, then pass '0' for 'options' and 'nil' for 'keys'.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:")
    public native NSArray<? extends NSURL> contentsOfDirectoryAtURLIncludingPropertiesForKeysOptionsError(
            @NotNull NSURL url, @Nullable NSArray<String> keys, @NUInt long mask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These methods replace their non-error returning counterparts below. See the NSFileManagerDelegate protocol below
     * for methods that are dispatched to the NSFileManager instance's delegate.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("copyItemAtPath:toPath:error:")
    public native boolean copyItemAtPathToPathError(@NotNull String srcPath, @NotNull String dstPath,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These methods are URL-taking equivalents of the four methods above. Their delegate methods are defined in the
     * NSFileManagerDelegate protocol below.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("copyItemAtURL:toURL:error:")
    public native boolean copyItemAtURLToURLError(@NotNull NSURL srcURL, @NotNull NSURL dstURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -createDirectoryAtPath:withIntermediateDirectories:attributes:error: instead
     */
    @Generated
    @Deprecated
    @Selector("createDirectoryAtPath:attributes:")
    public native boolean createDirectoryAtPathAttributes(@NotNull String path, @NotNull NSDictionary<?, ?> attributes);

    /**
     * createDirectoryAtPath:withIntermediateDirectories:attributes:error: creates a directory at the specified path. If
     * you pass 'NO' for createIntermediates, the directory must not exist at the time this call is made. Passing 'YES'
     * for 'createIntermediates' will create any necessary intermediate directories. This method returns YES if all
     * directories specified in 'path' were created and attributes were set. Directories are created with attributes
     * specified by the dictionary passed to 'attributes'. If no dictionary is supplied, directories are created
     * according to the umask of the process. This method returns NO if a failure occurs at any stage of the operation.
     * If an error parameter was provided, a presentable NSError will be returned by reference.
     * 
     * This method replaces createDirectoryAtPath:attributes:
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("createDirectoryAtPath:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtPathWithIntermediateDirectoriesAttributesError(@NotNull String path,
            boolean createIntermediates, @Nullable NSDictionary<String, ?> attributes,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * createDirectoryAtURL:withIntermediateDirectories:attributes:error: creates a directory at the specified URL. If
     * you pass 'NO' for withIntermediateDirectories, the directory must not exist at the time this call is made.
     * Passing 'YES' for withIntermediateDirectories will create any necessary intermediate directories. This method
     * returns YES if all directories specified in 'url' were created and attributes were set. Directories are created
     * with attributes specified by the dictionary passed to 'attributes'. If no dictionary is supplied, directories are
     * created according to the umask of the process. This method returns NO if a failure occurs at any stage of the
     * operation. If an error parameter was provided, a presentable NSError will be returned by reference.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("createDirectoryAtURL:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtURLWithIntermediateDirectoriesAttributesError(@NotNull NSURL url,
            boolean createIntermediates, @Nullable NSDictionary<String, ?> attributes,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("createFileAtPath:contents:attributes:")
    public native boolean createFileAtPathContentsAttributes(@NotNull String path, @Nullable NSData data,
            @Nullable NSDictionary<String, ?> attr);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -createSymbolicLinkAtPath:error: instead
     */
    @Generated
    @Deprecated
    @Selector("createSymbolicLinkAtPath:pathContent:")
    public native boolean createSymbolicLinkAtPathPathContent(@NotNull String path, @NotNull String otherpath);

    /**
     * createSymbolicLinkAtPath:withDestination:error: returns YES if the symbolic link that point at 'destPath' was
     * able to be created at the location specified by 'path'. If this method returns NO, the link was unable to be
     * created and an NSError will be returned by reference in the 'error' parameter. This method does not traverse a
     * terminal symlink.
     * 
     * This method replaces createSymbolicLinkAtPath:pathContent:
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("createSymbolicLinkAtPath:withDestinationPath:error:")
    public native boolean createSymbolicLinkAtPathWithDestinationPathError(@NotNull String path,
            @NotNull String destPath, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * createSymbolicLinkAtURL:withDestinationURL:error: returns YES if the symbolic link that point at 'destURL' was
     * able to be created at the location specified by 'url'. 'destURL' is always resolved against its base URL, if it
     * has one. If 'destURL' has no base URL and it's 'relativePath' is indeed a relative path, then a relative symlink
     * will be created. If this method returns NO, the link was unable to be created and an NSError will be returned by
     * reference in the 'error' parameter. This method does not traverse a terminal symlink.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("createSymbolicLinkAtURL:withDestinationURL:error:")
    public native boolean createSymbolicLinkAtURLWithDestinationURLError(@NotNull NSURL url, @NotNull NSURL destURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Process working directory management. Despite the fact that these are instance methods on NSFileManager, these
     * methods report and change (respectively) the working directory for the entire process. Developers are cautioned
     * that doing so is fraught with peril.
     */
    @NotNull
    @Generated
    @Selector("currentDirectoryPath")
    public native String currentDirectoryPath();

    /**
     * Instances of NSFileManager may now have delegates. Each instance has one delegate, and the delegate is not
     * retained. In versions of Mac OS X prior to 10.5, the behavior of calling [[NSFileManager alloc] init] was
     * undefined. In Mac OS X 10.5 "Leopard" and later, calling [[NSFileManager alloc] init] returns a new instance of
     * an NSFileManager.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileManagerDelegate delegate();

    /**
     * destinationOfSymbolicLinkAtPath:error: returns an NSString containing the path of the item pointed at by the
     * symlink specified by 'path'. If this method returns 'nil', an NSError will be returned by reference in the
     * 'error' parameter.
     * 
     * This method replaces pathContentOfSymbolicLinkAtPath:
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("destinationOfSymbolicLinkAtPath:error:")
    public native String destinationOfSymbolicLinkAtPathError(@NotNull String path,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -contentsOfDirectoryAtPath:error: instead
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("directoryContentsAtPath:")
    public native NSArray<?> directoryContentsAtPath(@NotNull String path);

    /**
     * displayNameAtPath: returns an NSString suitable for presentation to the user. For directories which have
     * localization information, this will return the appropriate localized string. This string is not suitable for
     * passing to anything that must interact with the filesystem.
     */
    @NotNull
    @Generated
    @Selector("displayNameAtPath:")
    public native String displayNameAtPath(@NotNull String path);

    /**
     * enumeratorAtPath: returns an NSDirectoryEnumerator rooted at the provided path. If the enumerator cannot be
     * created, this returns NULL. Because NSDirectoryEnumerator is a subclass of NSEnumerator, the returned object can
     * be used in the for...in construct.
     */
    @Nullable
    @Generated
    @Selector("enumeratorAtPath:")
    public native NSDirectoryEnumerator<String> enumeratorAtPath(@NotNull String path);

    /**
     * enumeratorAtURL:includingPropertiesForKeys:options:errorHandler: returns an NSDirectoryEnumerator rooted at the
     * provided directory URL. The NSDirectoryEnumerator returns NSURLs from the -nextObject method. The optional
     * 'includingPropertiesForKeys' parameter indicates which resource properties should be pre-fetched and cached with
     * each enumerated URL. The optional 'errorHandler' block argument is invoked when an error occurs. Parameters to
     * the block are the URL on which an error occurred and the error. When the error handler returns YES, enumeration
     * continues if possible. Enumeration stops immediately when the error handler returns NO.
     * 
     * If you wish to only receive the URLs and no other attributes, then pass '0' for 'options' and an empty NSArray
     * ('[NSArray array]') for 'keys'. If you wish to have the property caches of the vended URLs pre-populated with a
     * default set of attributes, then pass '0' for 'options' and 'nil' for 'keys'.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:")
    public native NSDirectoryEnumerator<NSURL> enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(
            @NotNull NSURL url, @Nullable NSArray<String> keys, @NUInt long mask,
            @Nullable @ObjCBlock(name = "call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler") Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler handler);

    /**
     * Removes the local instance of the ubiquitous item at the given URL. Returns YES if removal was successful, NO
     * otherwise.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("evictUbiquitousItemAtURL:error:")
    public native boolean evictUbiquitousItemAtURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The following methods are deprecated on Mac OS X 10.5. Their URL-based and/or error-returning replacements are
     * listed above.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -attributesOfItemAtPath:error: instead
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("fileAttributesAtPath:traverseLink:")
    public native NSDictionary<?, ?> fileAttributesAtPathTraverseLink(@NotNull String path, boolean yorn);

    /**
     * The following methods are of limited utility. Attempting to predicate behavior based on the current state of the
     * filesystem or a particular file on the filesystem is encouraging odd behavior in the face of filesystem race
     * conditions. It's far better to attempt an operation (like loading a file or creating a directory) and handle the
     * error gracefully than it is to try to figure out ahead of time whether the operation will succeed.
     */
    @Generated
    @Selector("fileExistsAtPath:")
    public native boolean fileExistsAtPath(@NotNull String path);

    @Generated
    @Selector("fileExistsAtPath:isDirectory:")
    public native boolean fileExistsAtPathIsDirectory(@NotNull String path, @Nullable BoolPtr isDirectory);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -attributesOfFileSystemForPath:error: instead
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("fileSystemAttributesAtPath:")
    public native NSDictionary<?, ?> fileSystemAttributesAtPath(@NotNull String path);

    /**
     * fileSystemRepresentationWithPath: returns an array of characters suitable for passing to lower-level POSIX style
     * APIs. The string is provided in the representation most appropriate for the filesystem in question.
     */
    @NotNull
    @Generated
    @Selector("fileSystemRepresentationWithPath:")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentationWithPath(@NotNull String path);

    /**
     * Similar to -[NSFileManager getRelationship:ofDirectoryAtURL:toItemAtURL:error:], except that the directory is
     * instead defined by an NSSearchPathDirectory and NSSearchPathDomainMask. Pass 0 for domainMask to instruct the
     * method to automatically choose the domain appropriate for 'url'. For example, to discover if a file is contained
     * by a Trash directory, call [fileManager getRelationship:&result ofDirectory:NSTrashDirectory inDomain:0
     * toItemAtURL:url error:&error].
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("getRelationship:ofDirectory:inDomain:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryInDomainToItemAtURLError(@NotNull NIntPtr outRelationship,
            @NUInt long directory, @NUInt long domainMask, @NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Sets 'outRelationship' to NSURLRelationshipContains if the directory at 'directoryURL' directly or indirectly
     * contains the item at 'otherURL', meaning 'directoryURL' is found while enumerating parent URLs starting from
     * 'otherURL'. Sets 'outRelationship' to NSURLRelationshipSame if 'directoryURL' and 'otherURL' locate the same
     * item, meaning they have the same NSURLFileResourceIdentifierKey value. If 'directoryURL' is not a directory, or
     * does not contain 'otherURL' and they do not locate the same file, then sets 'outRelationship' to
     * NSURLRelationshipOther. If an error occurs, returns NO and sets 'error'.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("getRelationship:ofDirectoryAtURL:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryAtURLToItemAtURLError(@NotNull NIntPtr outRelationship,
            @NotNull NSURL directoryURL, @NotNull NSURL otherURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSFileManager init();

    @Generated
    @Selector("isDeletableFileAtPath:")
    public native boolean isDeletableFileAtPath(@NotNull String path);

    @Generated
    @Selector("isExecutableFileAtPath:")
    public native boolean isExecutableFileAtPath(@NotNull String path);

    @Generated
    @Selector("isReadableFileAtPath:")
    public native boolean isReadableFileAtPath(@NotNull String path);

    /**
     * Returns YES if the item for the specified URL is ubiquitous, NO otherwise.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("isUbiquitousItemAtURL:")
    public native boolean isUbiquitousItemAtURL(@NotNull NSURL url);

    @Generated
    @Selector("isWritableFileAtPath:")
    public native boolean isWritableFileAtPath(@NotNull String path);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("linkItemAtPath:toPath:error:")
    public native boolean linkItemAtPathToPathError(@NotNull String srcPath, @NotNull String dstPath,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("linkItemAtURL:toURL:error:")
    public native boolean linkItemAtURLToURLError(@NotNull NSURL srcURL, @NotNull NSURL dstURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * -mountedVolumeURLsIncludingResourceValuesForKeys:options: returns an NSArray of NSURLs locating the mounted
     * volumes available on the computer. The property keys that can be requested are available in <Foundation/NSURL.h>.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("mountedVolumeURLsIncludingResourceValuesForKeys:options:")
    public native NSArray<? extends NSURL> mountedVolumeURLsIncludingResourceValuesForKeysOptions(
            @Nullable NSArray<String> propertyKeys, @NUInt long options);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("moveItemAtPath:toPath:error:")
    public native boolean moveItemAtPathToPathError(@NotNull String srcPath, @NotNull String dstPath,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("moveItemAtURL:toURL:error:")
    public native boolean moveItemAtURLToURLError(@NotNull NSURL srcURL, @NotNull NSURL dstURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -destinationOfSymbolicLinkAtPath:error:
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("pathContentOfSymbolicLinkAtPath:")
    public native String pathContentOfSymbolicLinkAtPath(@NotNull String path);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("removeItemAtPath:error:")
    public native boolean removeItemAtPathError(@NotNull String path,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("removeItemAtURL:error:")
    public native boolean removeItemAtURLError(@NotNull NSURL URL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * -replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error: is for developers who wish to
     * perform a safe-save without using the full NSDocument machinery that is available in the AppKit.
     * 
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
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:")
    public native boolean replaceItemAtURLWithItemAtURLBackupItemNameOptionsResultingItemURLError(
            @NotNull NSURL originalItemURL, @NotNull NSURL newItemURL, @Nullable String backupItemName,
            @NUInt long options, @Nullable @ReferenceInfo(type = NSURL.class) Ptr<NSURL> resultingURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * setAttributes:ofItemAtPath:error: returns YES when the attributes specified in the 'attributes' dictionary are
     * set successfully on the item specified by 'path'. If this method returns NO, a presentable NSError will be
     * provided by-reference in the 'error' parameter. If no error is required, you may pass 'nil' for the error.
     * 
     * This method replaces changeFileAttributes:atPath:.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("setAttributes:ofItemAtPath:error:")
    public native boolean setAttributesOfItemAtPathError(@NotNull NSDictionary<String, ?> attributes,
            @NotNull String path, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Instances of NSFileManager may now have delegates. Each instance has one delegate, and the delegate is not
     * retained. In versions of Mac OS X prior to 10.5, the behavior of calling [[NSFileManager alloc] init] was
     * undefined. In Mac OS X 10.5 "Leopard" and later, calling [[NSFileManager alloc] init] returns a new instance of
     * an NSFileManager.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSFileManagerDelegate value);

    /**
     * Instances of NSFileManager may now have delegates. Each instance has one delegate, and the delegate is not
     * retained. In versions of Mac OS X prior to 10.5, the behavior of calling [[NSFileManager alloc] init] was
     * undefined. In Mac OS X 10.5 "Leopard" and later, calling [[NSFileManager alloc] init] returns a new instance of
     * an NSFileManager.
     * 
     * API-Since: 2.0
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSFileManagerDelegate value) {
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
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setUbiquitous:itemAtURL:destinationURL:error:")
    public native boolean setUbiquitousItemAtURLDestinationURLError(boolean flag, @NotNull NSURL url,
            @NotNull NSURL destinationURL, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Start downloading a local instance of the specified ubiquitous item, if necessary. Returns YES if the download
     * started successfully or wasn't necessary, NO otherwise.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("startDownloadingUbiquitousItemAtURL:error:")
    public native boolean startDownloadingUbiquitousItemAtURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * stringWithFileSystemRepresentation:length: returns an NSString created from an array of bytes that are in the
     * filesystem representation.
     */
    @NotNull
    @Generated
    @Selector("stringWithFileSystemRepresentation:length:")
    public native String stringWithFileSystemRepresentationLength(@NotNull ConstBytePtr str, @NUInt long len);

    /**
     * subpathsAtPath: returns an NSArray of all contents and subpaths recursively from the provided path. This may be
     * very expensive to compute for deep filesystem hierarchies, and should probably be avoided.
     */
    @Nullable
    @Generated
    @Selector("subpathsAtPath:")
    public native NSArray<String> subpathsAtPath(@NotNull String path);

    /**
     * subpathsOfDirectoryAtPath:error: returns an NSArray of NSStrings representing the filenames of the items in the
     * specified directory and all its subdirectories recursively. If this method returns 'nil', an NSError will be
     * returned by reference in the 'error' parameter. If the directory contains no items, this method will return the
     * empty array.
     * 
     * This method replaces subpathsAtPath:
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("subpathsOfDirectoryAtPath:error:")
    public native NSArray<String> subpathsOfDirectoryAtPathError(@NotNull String path,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("temporaryDirectory")
    public native NSURL temporaryDirectory();

    /**
     * Returns an opaque token that represents the current ubiquity identity. This object can be copied, encoded, or
     * compared with isEqual:. When ubiquity containers are unavailable because the user has disabled them, or when the
     * user is simply not logged in, this method will return nil. The NSUbiquityIdentityDidChangeNotification
     * notification is posted after this value changes.
     * 
     * If you don't need the container URL and just want to check if ubiquity containers are available you should use
     * this method instead of checking -URLForUbiquityContainerIdentifier:.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("ubiquityIdentityToken")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object ubiquityIdentityToken();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler {
        @Generated
        boolean call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(@NotNull NSURL url,
                @NotNull NSError error);
    }

    /**
     * Asynchronously returns a dictionary of zero or more NSFileProviderService instances, which enable your
     * application to instruct the file's provider to take various actions on or with regards to the given URL. To do
     * this, first identify an NSFileProviderService object whose name matches the service you wish to use. Then get an
     * NSXPCConnection from it and set up its NSXPCInterface with the protocol that matches the service's name. You'll
     * need to refer to external documentation or an SDK supplied by the provider to get this information. Once an
     * NSXPCConnection is obtained, you must finish configuring it and send it -resume. Failure to do so will result in
     * leaking system resources.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("getFileProviderServicesForItemAtURL:completionHandler:")
    public native void getFileProviderServicesForItemAtURLCompletionHandler(@NotNull NSURL url,
            @NotNull @ObjCBlock(name = "call_getFileProviderServicesForItemAtURLCompletionHandler") Block_getFileProviderServicesForItemAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getFileProviderServicesForItemAtURLCompletionHandler {
        @Generated
        void call_getFileProviderServicesForItemAtURLCompletionHandler(
                @Nullable NSDictionary<String, ? extends NSFileProviderService> services, @Nullable NSError error);
    }

    /**
     * trashItemAtURL:resultingItemURL:error: returns YES if the item at 'url' was successfully moved to a Trash. Since
     * the operation may require renaming the file to avoid collisions, it also returns by reference the resulting URL
     * that the item was moved to. If this method returns NO, the item was not moved and an NSError will be returned by
     * reference in the 'error' parameter.
     * 
     * To easily discover if an item is in the Trash, you may use [fileManager getRelationship:&result
     * ofDirectory:NSTrashDirectory inDomain:0 toItemAtURL:url error:&error] && result == NSURLRelationshipContains.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("trashItemAtURL:resultingItemURL:error:")
    public native boolean trashItemAtURLResultingItemURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSURL.class) Ptr<NSURL> outResultingURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
