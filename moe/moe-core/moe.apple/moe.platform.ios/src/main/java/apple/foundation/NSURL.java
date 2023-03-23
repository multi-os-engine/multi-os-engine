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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSSecureCoding;
import apple.quicklook.protocol.QLPreviewItem;
import apple.uniformtypeidentifiers.UTType;
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
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURL extends NSObject implements NSSecureCoding, NSCopying, NSItemProviderReading, NSItemProviderWriting,
        QLPreviewItem {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURL(Pointer peer) {
        super(peer);
    }

    /**
     * Creates and initializes a NSURL that refers to the location specified by resolving the alias file at url. If the
     * url argument does not refer to an alias file as defined by the NSURLIsAliasFileKey property, the NSURL returned
     * is the same as url argument. This method fails and returns nil if the url argument is unreachable, or if the
     * original file or directory could not be located or is not reachable, or if the original file or directory is on a
     * volume that could not be located or mounted. If this method fails, the optional error is populated. The
     * NSURLBookmarkResolutionWithSecurityScope option is not supported by this method.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("URLByResolvingAliasFileAtURL:options:error:")
    public static native NSURL URLByResolvingAliasFileAtURLOptionsError(NSURL url, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Creates and Initializes an NSURL that refers to a location specified by resolving bookmark data. If this method
     * returns nil, the optional error is populated.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public static native NSURL URLByResolvingBookmarkDataOptionsRelativeToURLBookmarkDataIsStaleError(
            NSData bookmarkData, @NUInt long options, NSURL relativeURL, BoolPtr isStale,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Initializes and returns a newly created NSURL using the contents of the given data, relative to a base URL. If
     * the data representation is not a legal URL string as ASCII bytes, the URL object may not behave as expected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("URLWithDataRepresentation:relativeToURL:")
    public static native NSURL URLWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    @Generated
    @Selector("URLWithString:")
    public static native NSURL URLWithString(String URLString);

    @Generated
    @Selector("URLWithString:relativeToURL:")
    public static native NSURL URLWithStringRelativeToURL(String URLString, NSURL baseURL);

    /**
     * Initializes and returns a newly created absolute NSURL using the contents of the given data, relative to a base
     * URL. If the data representation is not a legal URL string as ASCII bytes, the URL object may not behave as
     * expected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("absoluteURLWithDataRepresentation:relativeToURL:")
    public static native NSURL absoluteURLWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURL alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURL allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Initializes and returns bookmark data derived from an alias file pointed to by a specified URL. If
     * bookmarkFileURL refers to an alias file created prior to OS X v10.6 that contains Alias Manager information but
     * no bookmark data, this method synthesizes bookmark data for the file. If this method returns nil, the optional
     * error is populated.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("bookmarkDataWithContentsOfURL:error:")
    public static native NSData bookmarkDataWithContentsOfURLError(NSURL bookmarkFileURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Initializes and returns a newly created URL referencing the local file or directory at the file system
     * representation of the path. File system representation is a null-terminated C string with canonical UTF-8
     * encoding.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
    public static native NSURL fileURLWithFileSystemRepresentationIsDirectoryRelativeToURL(
            @Mapped(CStringMapper.class) String path, boolean isDir, NSURL baseURL);

    /**
     * Better to use fileURLWithPath:isDirectory: if you know if the path is a directory vs non-directory, as it saves
     * an i/o.
     */
    @Generated
    @Selector("fileURLWithPath:")
    public static native NSURL fileURLWithPath(String path);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("fileURLWithPath:isDirectory:")
    public static native NSURL fileURLWithPathIsDirectory(String path, boolean isDir);

    /**
     * Initializes and returns a newly created file NSURL referencing the local file or directory at path, relative to a
     * base URL.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("fileURLWithPath:isDirectory:relativeToURL:")
    public static native NSURL fileURLWithPathIsDirectoryRelativeToURL(String path, boolean isDir, NSURL baseURL);

    /**
     * Better to use fileURLWithPath:isDirectory:relativeToURL: if you know if the path is a directory vs non-directory,
     * as it saves an I/O.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("fileURLWithPath:relativeToURL:")
    public static native NSURL fileURLWithPathRelativeToURL(String path, NSURL baseURL);

    /**
     * The following methods work on the path portion of a URL in the same manner that the NSPathUtilities methods on
     * NSString do.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("fileURLWithPathComponents:")
    public static native NSURL fileURLWithPathComponents(NSArray<String> components);

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
    public static native NSURL new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the resource values for properties identified by a specified array of keys contained in specified
     * bookmark data. If the result dictionary does not contain a resource value for one or more of the requested
     * resource keys, it means those resource properties are not available in the bookmark data.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("resourceValuesForKeys:fromBookmarkData:")
    public static native NSDictionary<String, ?> resourceValuesForKeysFromBookmarkData(NSArray<String> keys,
            NSData bookmarkData);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Creates an alias file on disk at a specified location with specified bookmark data. bookmarkData must have been
     * created with the NSURLBookmarkCreationSuitableForBookmarkFile option. bookmarkFileURL must either refer to an
     * existing file (which will be overwritten), or to location in an existing directory. If this method returns NO,
     * the optional error is populated.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("writeBookmarkData:toURL:options:error:")
    public static native boolean writeBookmarkDataToURLOptionsError(NSData bookmarkData, NSURL bookmarkFileURL,
            @NUInt long options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("URLByAppendingPathComponent:")
    public native NSURL URLByAppendingPathComponent(String pathComponent);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("URLByAppendingPathComponent:isDirectory:")
    public native NSURL URLByAppendingPathComponentIsDirectory(String pathComponent, boolean isDirectory);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("URLByAppendingPathExtension:")
    public native NSURL URLByAppendingPathExtension(String pathExtension);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("URLByDeletingLastPathComponent")
    public native NSURL URLByDeletingLastPathComponent();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("URLByDeletingPathExtension")
    public native NSURL URLByDeletingPathExtension();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("URLByResolvingSymlinksInPath")
    public native NSURL URLByResolvingSymlinksInPath();

    /**
     * The following methods work only on `file:` scheme URLs; for non-`file:` scheme URLs, these methods return the URL
     * unchanged.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("URLByStandardizingPath")
    public native NSURL URLByStandardizingPath();

    @Generated
    @Selector("absoluteString")
    public native String absoluteString();

    /**
     * if the receiver is itself absolute, this will return self.
     */
    @Generated
    @Selector("absoluteURL")
    public native NSURL absoluteURL();

    /**
     * may be nil.
     */
    @Generated
    @Selector("baseURL")
    public native NSURL baseURL();

    /**
     * Returns bookmark data for the URL, created with specified options and resource values. If this method returns
     * nil, the optional error is populated.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:")
    public native NSData bookmarkDataWithOptionsIncludingResourceValuesForKeysRelativeToURLError(@NUInt long options,
            NSArray<String> keys, NSURL relativeURL, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("checkPromisedItemIsReachableAndReturnError:")
    public native boolean checkPromisedItemIsReachableAndReturnError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns whether the URL's resource exists and is reachable. This method synchronously checks if the resource's
     * backing store is reachable. Checking reachability is appropriate when making decisions that do not require other
     * immediate operations on the resource, e.g. periodic maintenance of UI state that depends on the existence of a
     * specific document. When performing operations such as opening a file or copying resource properties, it is more
     * efficient to simply try the operation and handle failures. If this method returns NO, the optional error is
     * populated. This method is currently applicable only to URLs for file system resources. For other URL types, NO is
     * returned. Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("checkResourceIsReachableAndReturnError:")
    public native boolean checkResourceIsReachableAndReturnError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Returns the data representation of the URL's relativeString. If the URL was initialized with
     * -initWithData:relativeToURL:, the data representation returned are the same bytes as those used at
     * initialization; otherwise, the data representation returned are the bytes of the relativeString encoded with
     * NSUTF8StringEncoding.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("dataRepresentation")
    public native NSData dataRepresentation();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Returns a file path URL that refers to the same resource as a specified URL. File path URLs use a file system
     * style path. An error will occur if the url parameter is not a file URL. A file reference URL's resource must
     * exist and be reachable to be converted to a file path URL. Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("filePathURL")
    public native NSURL filePathURL();

    /**
     * Returns a file reference URL that refers to the same resource as a specified file URL. File reference URLs use a
     * URL path syntax that identifies a file system object by reference, not by path. This form of file URL remains
     * valid when the file system path of the URL’s underlying resource changes. An error will occur if the url
     * parameter is not a file URL. File reference URLs cannot be created to file system objects which do not exist or
     * are not reachable. In some areas of the file system hierarchy, file reference URLs cannot be generated to the
     * leaf node of the URL path. A file reference URL's path should never be persistently stored because is not valid
     * across system restarts, and across remounts of volumes -- if you want to create a persistent reference to a file
     * system object, use a bookmark (see -bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:).
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("fileReferenceURL")
    public native NSURL fileReferenceURL();

    /**
     * Returns the URL's path in file system representation. File system representation is a null-terminated C string
     * with canonical UTF-8 encoding. The returned C string will be automatically freed just as a returned object would
     * be released; your code should copy the representation or use getFileSystemRepresentation:maxLength: if it needs
     * to store the representation outside of the autorelease context in which the representation is created.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("fileSystemRepresentation")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentation();

    @Generated
    @Selector("fragment")
    public native String fragment();

    /**
     * Returns the URL's path in file system representation. File system representation is a null-terminated C string
     * with canonical UTF-8 encoding.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentationMaxLength(BytePtr buffer, @NUInt long maxBufferLength);

    /**
     * Get resource values from URLs of 'promised' items. A promised item is not guaranteed to have its contents in the
     * file system until you use NSFileCoordinator to perform a coordinated read on its URL, which causes the contents
     * to be downloaded or otherwise generated. Promised item URLs are returned by various APIs, including currently:
     * - NSMetadataQueryUbiquitousDataScope
     * - NSMetadataQueryUbiquitousDocumentsScope
     * - An NSFilePresenter presenting the contents of the directory located by -URLForUbiquitousContainerIdentifier: or
     * a subdirectory thereof
     * 
     * The following methods behave identically to their similarly named methods above (-getResourceValue:forKey:error:,
     * etc.), except that they allow you to get resource values and check for presence regardless of whether the
     * promised item's contents currently exist at the URL. You must use these APIs instead of the normal NSURL resource
     * value APIs if and only if any of the following are true:
     * - You are using a URL that you know came directly from one of the above APIs
     * - You are inside the accessor block of a coordinated read or write that used
     * NSFileCoordinatorReadingImmediatelyAvailableMetadataOnly, NSFileCoordinatorWritingForDeleting,
     * NSFileCoordinatorWritingForMoving, or NSFileCoordinatorWritingContentIndependentMetadataOnly
     * 
     * Most of the NSURL resource value keys will work with these APIs. However, there are some that are tied to the
     * item's contents that will not work, such as NSURLContentAccessDateKey or NSURLGenerationIdentifierKey. If one of
     * these keys is used, the method will return YES, but the value for the key will be nil.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("getPromisedItemResourceValue:forKey:error:")
    public native boolean getPromisedItemResourceValueForKeyError(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> value, String key,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns the resource value identified by a given resource key. This method first checks if the URL object already
     * caches the resource value. If so, it returns the cached resource value to the caller. If not, then this method
     * synchronously obtains the resource value from the backing store, adds the resource value to the URL object's
     * cache, and returns the resource value to the caller. The type of the resource value varies by resource property
     * (see resource key definitions). If this method returns YES and value is populated with nil, it means the resource
     * property is not available for the specified resource and no errors occurred when determining the resource
     * property was not available. If this method returns NO, the optional error is populated. This method is currently
     * applicable only to URLs for file system resources. Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("getResourceValue:forKey:error:")
    public native boolean getResourceValueForKeyError(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> value,
            String key, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Determines if a given URL string's path represents a directory (i.e. the path component in the URL string ends
     * with a '/' character). This does not check the resource the URL refers to.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("hasDirectoryPath")
    public native boolean hasDirectoryPath();

    /**
     * If the URL conforms to rfc 1808 (the most common form of URL), the following accessors will return the various
     * components; otherwise they return nil. The litmus test for conformance is as recommended in RFC 1808 - whether
     * the first two characters of resourceSpecifier is @"//". In all cases, they return the component's value after
     * resolving the receiver against its base URL.
     */
    @Generated
    @Selector("host")
    public native String host();

    @Generated
    @Selector("init")
    public native NSURL init();

    /**
     * Initializes a newly created absolute NSURL using the contents of the given data, relative to a base URL. If the
     * data representation is not a legal URL string as ASCII bytes, the URL object may not behave as expected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("initAbsoluteURLWithDataRepresentation:relativeToURL:")
    public native NSURL initAbsoluteURLWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    /**
     * Initializes a newly created NSURL that refers to a location specified by resolving bookmark data. If this method
     * returns nil, the optional error is populated.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public native NSURL initByResolvingBookmarkDataOptionsRelativeToURLBookmarkDataIsStaleError(NSData bookmarkData,
            @NUInt long options, NSURL relativeURL, BoolPtr isStale,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Initializes a newly created URL referencing the local file or directory at the file system representation of the
     * path. File system representation is a null-terminated C string with canonical UTF-8 encoding.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
    public native NSURL initFileURLWithFileSystemRepresentationIsDirectoryRelativeToURL(
            @Mapped(CStringMapper.class) String path, boolean isDir, NSURL baseURL);

    /**
     * Better to use initFileURLWithPath:isDirectory: if you know if the path is a directory vs non-directory, as it
     * saves an i/o.
     */
    @Generated
    @Selector("initFileURLWithPath:")
    public native NSURL initFileURLWithPath(String path);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("initFileURLWithPath:isDirectory:")
    public native NSURL initFileURLWithPathIsDirectory(String path, boolean isDir);

    /**
     * Initializes a newly created file NSURL referencing the local file or directory at path, relative to a base URL.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("initFileURLWithPath:isDirectory:relativeToURL:")
    public native NSURL initFileURLWithPathIsDirectoryRelativeToURL(String path, boolean isDir, NSURL baseURL);

    /**
     * Better to use initFileURLWithPath:isDirectory:relativeToURL: if you know if the path is a directory vs
     * non-directory, as it saves an I/O.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("initFileURLWithPath:relativeToURL:")
    public native NSURL initFileURLWithPathRelativeToURL(String path, NSURL baseURL);

    @Generated
    @Selector("initWithCoder:")
    public native NSURL initWithCoder(NSCoder coder);

    /**
     * Initializes a newly created NSURL using the contents of the given data, relative to a base URL. If the data
     * representation is not a legal URL string as ASCII bytes, the URL object may not behave as expected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("initWithDataRepresentation:relativeToURL:")
    public native NSURL initWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    /**
     * this call percent-encodes both the host and path, so this cannot be used to set a username/password or port in
     * the hostname part or with a IPv6 '[...]' type address. NSURLComponents handles IPv6 addresses correctly.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use NSURLComponents instead, which lets you create a valid URL with any valid combination of
     * URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents
     * with either percent-encoded or un-percent-encoded strings.
     */
    @Generated
    @Deprecated
    @Selector("initWithScheme:host:path:")
    public native NSURL initWithSchemeHostPath(String scheme, String host, String path);

    /**
     * These methods expect their string arguments to contain any percent escape codes that are necessary. It is an
     * error for URLString to be nil.
     */
    @Generated
    @Selector("initWithString:")
    public native NSURL initWithString(String URLString);

    @Generated
    @Selector("initWithString:relativeToURL:")
    public native NSURL initWithStringRelativeToURL(String URLString, NSURL baseURL);

    /**
     * Returns whether the URL is a file reference URL. Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("isFileReferenceURL")
    public native boolean isFileReferenceURL();

    /**
     * Whether the scheme is file:; if [myURL isFileURL] is YES, then [myURL path] is suitable for input into
     * NSFileManager or NSPathUtilities.
     */
    @Generated
    @Selector("isFileURL")
    public native boolean isFileURL();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("lastPathComponent")
    public native String lastPathComponent();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: The parameterString method is deprecated. Post deprecation for applications linked with or
     * after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil,
     * and the path method will return the complete path including the semicolon separator and params component if the
     * URL string contains them.
     */
    @Deprecated
    @Generated
    @Selector("parameterString")
    public native String parameterString();

    @Generated
    @Selector("password")
    public native String password();

    @Generated
    @Selector("path")
    public native String path();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("pathComponents")
    public native NSArray<String> pathComponents();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("pathExtension")
    public native String pathExtension();

    @Generated
    @Selector("port")
    public native NSNumber port();

    @Generated
    @IsOptional
    @Selector("previewItemTitle")
    public native String previewItemTitle();

    @Generated
    @Selector("previewItemURL")
    public native NSURL previewItemURL();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("promisedItemResourceValuesForKeys:error:")
    public native NSDictionary<String, ?> promisedItemResourceValuesForKeysError(NSArray<String> keys,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("query")
    public native String query();

    /**
     * The same as path if baseURL is nil
     */
    @Generated
    @Selector("relativePath")
    public native String relativePath();

    /**
     * The relative portion of a URL. If baseURL is nil, or if the receiver is itself absolute, this is the same as
     * absoluteString
     */
    @Generated
    @Selector("relativeString")
    public native String relativeString();

    /**
     * Removes all cached resource values and all temporary resource values from the URL object. This method is
     * currently applicable only to URLs for file system resources.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("removeAllCachedResourceValues")
    public native void removeAllCachedResourceValues();

    /**
     * Removes the cached resource value identified by a given resource value key from the URL object. Removing a cached
     * resource value may remove other cached resource values because some resource values are cached as a set of
     * values, and because some resource values depend on other resource values (temporary resource values have no
     * dependencies). This method is currently applicable only to URLs for file system resources.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("removeCachedResourceValueForKey:")
    public native void removeCachedResourceValueForKey(String key);

    @Generated
    @Selector("resourceSpecifier")
    public native String resourceSpecifier();

    /**
     * Returns the resource values identified by specified array of resource keys. This method first checks if the URL
     * object already caches the resource values. If so, it returns the cached resource values to the caller. If not,
     * then this method synchronously obtains the resource values from the backing store, adds the resource values to
     * the URL object's cache, and returns the resource values to the caller. The type of the resource values vary by
     * property (see resource key definitions). If the result dictionary does not contain a resource value for one or
     * more of the requested resource keys, it means those resource properties are not available for the specified
     * resource and no errors occurred when determining those resource properties were not available. If this method
     * returns NULL, the optional error is populated. This method is currently applicable only to URLs for file system
     * resources. Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("resourceValuesForKeys:error:")
    public native NSDictionary<String, ?> resourceValuesForKeysError(NSArray<String> keys,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Any URL is composed of these two basic pieces. The full URL would be the concatenation of [myURL scheme], ':',
     * [myURL resourceSpecifier]
     */
    @Generated
    @Selector("scheme")
    public native String scheme();

    /**
     * Sets the resource value identified by a given resource key. This method writes the new resource value out to the
     * backing store. Attempts to set a read-only resource property or to set a resource property not supported by the
     * resource are ignored and are not considered errors. If this method returns NO, the optional error is populated.
     * This method is currently applicable only to URLs for file system resources. Symbol is present in iOS 4, but
     * performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setResourceValue:forKey:error:")
    public native boolean setResourceValueForKeyError(@Mapped(ObjCObjectMapper.class) Object value, String key,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Sets any number of resource values of a URL's resource. This method writes the new resource values out to the
     * backing store. Attempts to set read-only resource properties or to set resource properties not supported by the
     * resource are ignored and are not considered errors. If an error occurs after some resource properties have been
     * successfully changed, the userInfo dictionary in the returned error contains an array of resource keys that were
     * not set with the key kCFURLKeysOfUnsetValuesKey. The order in which the resource values are set is not defined.
     * If you need to guarantee the order resource values are set, you should make multiple requests to this method or
     * to -setResourceValue:forKey:error: to guarantee the order. If this method returns NO, the optional error is
     * populated. This method is currently applicable only to URLs for file system resources. Symbol is present in iOS
     * 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setResourceValues:error:")
    public native boolean setResourceValuesError(NSDictionary<String, ?> keyedValues,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * NS_SWIFT_SENDABLE
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setTemporaryResourceValue:forKey:")
    public native void setTemporaryResourceValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("standardizedURL")
    public native NSURL standardizedURL();

    /**
     * Given a NSURL created by resolving a bookmark data created with security scope, make the resource referenced by
     * the url accessible to the process. When access to this resource is no longer needed the client must call
     * stopAccessingSecurityScopedResource. Each call to startAccessingSecurityScopedResource must be balanced with a
     * call to stopAccessingSecurityScopedResource (Note: this is not reference counted).
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("startAccessingSecurityScopedResource")
    public native boolean startAccessingSecurityScopedResource();

    /**
     * Revokes the access granted to the url by a prior successful call to startAccessingSecurityScopedResource.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("stopAccessingSecurityScopedResource")
    public native void stopAccessingSecurityScopedResource();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("user")
    public native String user();

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native NSURL objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSURL _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * \brief Generate a path component based on a partial filename and a file
     * type, then append it to a copy of the receiver.
     * 
     * \param partialName The partial filename that should be expanded upon,
     * e.g. \c "readme".
     * \param contentType The type the resulting file should conform to, e.g.
     * \c UTTypePlainText.
     * 
     * \result A complete URL. Using the argument examples above, this method would
     * return a URL with a last path component of \c "readme.txt".
     * 
     * Use this method when you have partial input from a user or other source and
     * need to produce a complete filename suitable for that input. For example, if
     * you are downloading a file from the Internet and know its MIME type, you can
     * use this method to ensure the correct filename extension is applied to the
     * URL where you save the file.
     * 
     * If \a partialName already has a path extension, and that path extension is
     * valid for file system objects of type \a contentType, no additional
     * extension is appended to the path component before constructing the URL. For
     * example, if the inputs are \c "puppy.jpg" and \c UTTypeImage respectively,
     * then the resulting URL will have a last path component of \c "puppy.jpg" .
     * On the other hand, if the inputs are \c "puppy.jpg" and \c UTTypePlainText
     * respectively, the resulting URL will have a last path component of
     * \c "puppy.jpg.txt" . If you want to ensure any existing path extension is
     * replaced, you can use the \c URLByDeletingPathExtension property first.
     * 
     * If the path component could not be appended, this method returns a copy of
     * \c self .
     * 
     * \note The resulting URL has a directory path if \c contentType conforms to
     * \c UTTypeDirectory .
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("URLByAppendingPathComponent:conformingToType:")
    public native NSURL URLByAppendingPathComponentConformingToType(String partialName, UTType contentType);

    /**
     * \brief Generate a path component based on the last path component of the
     * receiver and a file type, then append it to a copy of the receiver.
     * 
     * \param contentType The type the resulting file should conform to, e.g.
     * \c UTTypePlainText.
     * 
     * \result A complete URL. Using the argument example above and assuming
     * the receiver equals \c "file:///readme" , this method would return
     * \c "file:///readme.txt".
     * 
     * Use this method when you have partial input from a user or other source and
     * need to produce a complete filename suitable for that input. For example, if
     * you are downloading a file from the Internet and know its MIME type, you can
     * use this method to ensure the correct filename extension is applied to the
     * URL where you save the file.
     * 
     * If the receiver already has a path extension, and that path extension is
     * valid for file system objects of type \a contentType, no additional
     * extension is appended to the path component before constructing the URL.
     * For example, if the receiver's last path component equals \c "puppy.jpg" and
     * \a contentType equals \c UTTypeImage , then the resulting URL will have a
     * last path component of \c "puppy.jpg" . On the other hand, if the inputs are
     * \c "puppy.jpg" and \c UTTypePlainText respectively, the resulting URL will
     * have a last path component of \c "puppy.jpg.txt" . If you want to ensure any
     * existing path extension is replaced, you can use the
     * \c URLByDeletingPathExtension property first.
     * 
     * If the extension could not be appended, this method returns a copy of
     * \c self .
     * 
     * \note The resulting URL has a directory path if \c contentType conforms to
     * \c UTTypeDirectory .
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("URLByAppendingPathExtensionForType:")
    public native NSURL URLByAppendingPathExtensionForType(UTType contentType);
}
