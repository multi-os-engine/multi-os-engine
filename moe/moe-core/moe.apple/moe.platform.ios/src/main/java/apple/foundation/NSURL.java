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
import apple.foundation.protocol.NSSecureCoding;
import apple.quicklook.protocol.QLPreviewItem;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURL extends NSObject implements NSSecureCoding, NSCopying, QLPreviewItem {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURL(Pointer peer) {
        super(peer);
    }

    /**
     * URLByResolvingAliasFileAtURL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/URLByResolvingAliasFileAtURL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByResolvingAliasFileAtURL:options:error:")
    public static native NSURL URLByResolvingAliasFileAtURLOptionsError(NSURL url, @NUInt long options,
            Ptr<NSError> error);

    /**
     * URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public static native NSURL URLByResolvingBookmarkDataOptionsRelativeToURLBookmarkDataIsStaleError(
            NSData bookmarkData, @NUInt long options, NSURL relativeURL, BoolPtr isStale, Ptr<NSError> error);

    /**
     * URLWithString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/URLWithString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLWithString:")
    public static native NSURL URLWithString(String URLString);

    /**
     * URLWithString:relativeToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/URLWithString:relativeToURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLWithString:relativeToURL:")
    public static native NSURL URLWithStringRelativeToURL(String URLString, NSURL baseURL);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURL alloc();

    /**
     * bookmarkDataWithContentsOfURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/bookmarkDataWithContentsOfURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bookmarkDataWithContentsOfURL:error:")
    public static native NSData bookmarkDataWithContentsOfURLError(NSURL bookmarkFileURL, Ptr<NSError> error);

    /**
     * fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
    public static native NSURL fileURLWithFileSystemRepresentationIsDirectoryRelativeToURL(
            @Mapped(CStringMapper.class) String path, boolean isDir, NSURL baseURL);

    /**
     * fileURLWithPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/fileURLWithPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileURLWithPath:")
    public static native NSURL fileURLWithPath(String path);

    /**
     * fileURLWithPath:isDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/fileURLWithPath:isDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileURLWithPath:isDirectory:")
    public static native NSURL fileURLWithPathIsDirectory(String path, boolean isDir);

    /**
     * fileURLWithPathComponents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/fileURLWithPathComponents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileURLWithPathComponents:")
    public static native NSURL fileURLWithPathComponents(NSArray<String> components);

    /**
     * resourceValuesForKeys:fromBookmarkData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/resourceValuesForKeys:fromBookmarkData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resourceValuesForKeys:fromBookmarkData:")
    public static native NSDictionary<String, ?> resourceValuesForKeysFromBookmarkData(NSArray<String> keys,
            NSData bookmarkData);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * writeBookmarkData:toURL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/clm/NSURL/writeBookmarkData:toURL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeBookmarkData:toURL:options:error:")
    public static native boolean writeBookmarkDataToURLOptionsError(NSData bookmarkData, NSURL bookmarkFileURL,
            @NUInt long options, Ptr<NSError> error);

    @Generated
    @Selector("URLWithDataRepresentation:relativeToURL:")
    public static native NSURL URLWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    @Generated
    @Selector("absoluteURLWithDataRepresentation:relativeToURL:")
    public static native NSURL absoluteURLWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    @Generated
    @Selector("fileURLWithPath:isDirectory:relativeToURL:")
    public static native NSURL fileURLWithPathIsDirectoryRelativeToURL(String path, boolean isDir, NSURL baseURL);

    @Generated
    @Selector("fileURLWithPath:relativeToURL:")
    public static native NSURL fileURLWithPathRelativeToURL(String path, NSURL baseURL);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * URLByAppendingPathComponent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/URLByAppendingPathComponent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByAppendingPathComponent:")
    public native NSURL URLByAppendingPathComponent(String pathComponent);

    /**
     * URLByAppendingPathComponent:isDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/URLByAppendingPathComponent:isDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByAppendingPathComponent:isDirectory:")
    public native NSURL URLByAppendingPathComponentIsDirectory(String pathComponent, boolean isDirectory);

    /**
     * URLByAppendingPathExtension:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/URLByAppendingPathExtension:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByAppendingPathExtension:")
    public native NSURL URLByAppendingPathExtension(String pathExtension);

    /**
     * URLByDeletingLastPathComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/URLByDeletingLastPathComponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByDeletingLastPathComponent")
    public native NSURL URLByDeletingLastPathComponent();

    /**
     * URLByDeletingPathExtension</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/URLByDeletingPathExtension">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByDeletingPathExtension")
    public native NSURL URLByDeletingPathExtension();

    /**
     * URLByResolvingSymlinksInPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/URLByResolvingSymlinksInPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByResolvingSymlinksInPath")
    public native NSURL URLByResolvingSymlinksInPath();

    /**
     * URLByStandardizingPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/URLByStandardizingPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLByStandardizingPath")
    public native NSURL URLByStandardizingPath();

    /**
     * absoluteString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/absoluteString">iOS Dev Center</a>
     */
    @Generated
    @Selector("absoluteString")
    public native String absoluteString();

    /**
     * absoluteURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/absoluteURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("absoluteURL")
    public native NSURL absoluteURL();

    /**
     * baseURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/baseURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("baseURL")
    public native NSURL baseURL();

    /**
     * bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:")
    public native NSData bookmarkDataWithOptionsIncludingResourceValuesForKeysRelativeToURLError(@NUInt long options,
            NSArray<String> keys, NSURL relativeURL, Ptr<NSError> error);

    /**
     * checkPromisedItemIsReachableAndReturnError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/checkPromisedItemIsReachableAndReturnError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("checkPromisedItemIsReachableAndReturnError:")
    public native boolean checkPromisedItemIsReachableAndReturnError(Ptr<NSError> error);

    /**
     * checkResourceIsReachableAndReturnError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/checkResourceIsReachableAndReturnError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("checkResourceIsReachableAndReturnError:")
    public native boolean checkResourceIsReachableAndReturnError(Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * filePathURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/filePathURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("filePathURL")
    public native NSURL filePathURL();

    /**
     * fileReferenceURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/fileReferenceURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileReferenceURL")
    public native NSURL fileReferenceURL();

    /**
     * fileSystemRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/fileSystemRepresentation">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileSystemRepresentation")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentation();

    /**
     * fragment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/fragment">iOS Dev Center</a>
     */
    @Generated
    @Selector("fragment")
    public native String fragment();

    /**
     * getFileSystemRepresentation:maxLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/getFileSystemRepresentation:maxLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentationMaxLength(BytePtr buffer, @NUInt long maxBufferLength);

    /**
     * getPromisedItemResourceValue:forKey:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/getPromisedItemResourceValue:forKey:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getPromisedItemResourceValue:forKey:error:")
    public native boolean getPromisedItemResourceValueForKeyError(Ptr<ObjCObject> value, String key,
            Ptr<NSError> error);

    /**
     * getResourceValue:forKey:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/getResourceValue:forKey:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getResourceValue:forKey:error:")
    public native boolean getResourceValueForKeyError(Ptr<ObjCObject> value, String key, Ptr<NSError> error);

    /**
     * host</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/host">iOS Dev Center</a>
     */
    @Generated
    @Selector("host")
    public native String host();

    @Generated
    @Selector("init")
    public native NSURL init();

    /**
     * initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public native NSURL initByResolvingBookmarkDataOptionsRelativeToURLBookmarkDataIsStaleError(NSData bookmarkData,
            @NUInt long options, NSURL relativeURL, BoolPtr isStale, Ptr<NSError> error);

    /**
     * initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
    public native NSURL initFileURLWithFileSystemRepresentationIsDirectoryRelativeToURL(
            @Mapped(CStringMapper.class) String path, boolean isDir, NSURL baseURL);

    /**
     * initFileURLWithPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/initFileURLWithPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initFileURLWithPath:")
    public native NSURL initFileURLWithPath(String path);

    /**
     * initFileURLWithPath:isDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/initFileURLWithPath:isDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initFileURLWithPath:isDirectory:")
    public native NSURL initFileURLWithPathIsDirectory(String path, boolean isDir);

    @Generated
    @Selector("initWithCoder:")
    public native NSURL initWithCoder(NSCoder aDecoder);

    /**
     * initWithScheme:host:path:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/initWithScheme:host:path:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("initWithScheme:host:path:")
    public native NSURL initWithSchemeHostPath(String scheme, String host, String path);

    /**
     * initWithString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/initWithString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithString:")
    public native NSURL initWithString(String URLString);

    /**
     * initWithString:relativeToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/initWithString:relativeToURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithString:relativeToURL:")
    public native NSURL initWithStringRelativeToURL(String URLString, NSURL baseURL);

    /**
     * isFileReferenceURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/isFileReferenceURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFileReferenceURL")
    public native boolean isFileReferenceURL();

    /**
     * fileURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/fileURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFileURL")
    public native boolean isFileURL();

    /**
     * lastPathComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/lastPathComponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("lastPathComponent")
    public native String lastPathComponent();

    /**
     * parameterString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/parameterString">iOS Dev Center</a>
     */
    @Generated
    @Selector("parameterString")
    public native String parameterString();

    /**
     * password</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/password">iOS Dev Center</a>
     */
    @Generated
    @Selector("password")
    public native String password();

    /**
     * path</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/path">iOS Dev Center</a>
     */
    @Generated
    @Selector("path")
    public native String path();

    /**
     * pathComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/pathComponents">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathComponents")
    public native NSArray<String> pathComponents();

    /**
     * pathExtension</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/pathExtension">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathExtension")
    public native String pathExtension();

    /**
     * port</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/port">iOS Dev Center</a>
     */
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
     * promisedItemResourceValuesForKeys:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/promisedItemResourceValuesForKeys:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("promisedItemResourceValuesForKeys:error:")
    public native NSDictionary<String, ?> promisedItemResourceValuesForKeysError(NSArray<String> keys,
            Ptr<NSError> error);

    /**
     * query</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/query">iOS Dev Center</a>
     */
    @Generated
    @Selector("query")
    public native String query();

    /**
     * relativePath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/relativePath">iOS Dev Center</a>
     */
    @Generated
    @Selector("relativePath")
    public native String relativePath();

    /**
     * relativeString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/relativeString">iOS Dev Center</a>
     */
    @Generated
    @Selector("relativeString")
    public native String relativeString();

    /**
     * removeAllCachedResourceValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/removeAllCachedResourceValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllCachedResourceValues")
    public native void removeAllCachedResourceValues();

    /**
     * removeCachedResourceValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/removeCachedResourceValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeCachedResourceValueForKey:")
    public native void removeCachedResourceValueForKey(String key);

    /**
     * resourceSpecifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/resourceSpecifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("resourceSpecifier")
    public native String resourceSpecifier();

    /**
     * resourceValuesForKeys:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/resourceValuesForKeys:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resourceValuesForKeys:error:")
    public native NSDictionary<String, ?> resourceValuesForKeysError(NSArray<String> keys, Ptr<NSError> error);

    /**
     * scheme</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/scheme">iOS Dev Center</a>
     */
    @Generated
    @Selector("scheme")
    public native String scheme();

    /**
     * setResourceValue:forKey:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/setResourceValue:forKey:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResourceValue:forKey:error:")
    public native boolean setResourceValueForKeyError(@Mapped(ObjCObjectMapper.class) Object value, String key,
            Ptr<NSError> error);

    /**
     * setResourceValues:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/setResourceValues:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResourceValues:error:")
    public native boolean setResourceValuesError(NSDictionary<String, ?> keyedValues, Ptr<NSError> error);

    /**
     * setTemporaryResourceValue:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/setTemporaryResourceValue:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTemporaryResourceValue:forKey:")
    public native void setTemporaryResourceValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * standardizedURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/standardizedURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("standardizedURL")
    public native NSURL standardizedURL();

    /**
     * startAccessingSecurityScopedResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/startAccessingSecurityScopedResource">iOS Dev Center</a>
     */
    @Generated
    @Selector("startAccessingSecurityScopedResource")
    public native boolean startAccessingSecurityScopedResource();

    /**
     * stopAccessingSecurityScopedResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instm/NSURL/stopAccessingSecurityScopedResource">iOS Dev Center</a>
     */
    @Generated
    @Selector("stopAccessingSecurityScopedResource")
    public native void stopAccessingSecurityScopedResource();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * user</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURL_Class/index.html#//apple_ref/occ/instp/NSURL/user">iOS Dev Center</a>
     */
    @Generated
    @Selector("user")
    public native String user();

    @Generated
    @Selector("dataRepresentation")
    public native NSData dataRepresentation();

    @Generated
    @Selector("hasDirectoryPath")
    public native boolean hasDirectoryPath();

    @Generated
    @Selector("initAbsoluteURLWithDataRepresentation:relativeToURL:")
    public native NSURL initAbsoluteURLWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    @Generated
    @Selector("initFileURLWithPath:isDirectory:relativeToURL:")
    public native NSURL initFileURLWithPathIsDirectoryRelativeToURL(String path, boolean isDir, NSURL baseURL);

    @Generated
    @Selector("initFileURLWithPath:relativeToURL:")
    public native NSURL initFileURLWithPathRelativeToURL(String path, NSURL baseURL);

    @Generated
    @Selector("initWithDataRepresentation:relativeToURL:")
    public native NSURL initWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);
}
