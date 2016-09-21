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

    @Generated
    @Selector("URLByResolvingAliasFileAtURL:options:error:")
    public static native NSURL URLByResolvingAliasFileAtURLOptionsError(NSURL url, @NUInt long options,
            Ptr<NSError> error);

    @Generated
    @Selector("URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public static native NSURL URLByResolvingBookmarkDataOptionsRelativeToURLBookmarkDataIsStaleError(
            NSData bookmarkData, @NUInt long options, NSURL relativeURL, BoolPtr isStale, Ptr<NSError> error);

    @Generated
    @Selector("URLWithDataRepresentation:relativeToURL:")
    public static native NSURL URLWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    @Generated
    @Selector("URLWithString:")
    public static native NSURL URLWithString(String URLString);

    @Generated
    @Selector("URLWithString:relativeToURL:")
    public static native NSURL URLWithStringRelativeToURL(String URLString, NSURL baseURL);

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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bookmarkDataWithContentsOfURL:error:")
    public static native NSData bookmarkDataWithContentsOfURLError(NSURL bookmarkFileURL, Ptr<NSError> error);

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
    @Selector("fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
    public static native NSURL fileURLWithFileSystemRepresentationIsDirectoryRelativeToURL(
            @Mapped(CStringMapper.class) String path, boolean isDir, NSURL baseURL);

    @Generated
    @Selector("fileURLWithPath:")
    public static native NSURL fileURLWithPath(String path);

    @Generated
    @Selector("fileURLWithPath:isDirectory:")
    public static native NSURL fileURLWithPathIsDirectory(String path, boolean isDir);

    @Generated
    @Selector("fileURLWithPath:isDirectory:relativeToURL:")
    public static native NSURL fileURLWithPathIsDirectoryRelativeToURL(String path, boolean isDir, NSURL baseURL);

    @Generated
    @Selector("fileURLWithPath:relativeToURL:")
    public static native NSURL fileURLWithPathRelativeToURL(String path, NSURL baseURL);

    @Generated
    @Selector("fileURLWithPathComponents:")
    public static native NSURL fileURLWithPathComponents(NSArray<String> components);

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

    @Generated
    @Selector("writeBookmarkData:toURL:options:error:")
    public static native boolean writeBookmarkDataToURLOptionsError(NSData bookmarkData, NSURL bookmarkFileURL,
            @NUInt long options, Ptr<NSError> error);

    @Generated
    @Selector("URLByAppendingPathComponent:")
    public native NSURL URLByAppendingPathComponent(String pathComponent);

    @Generated
    @Selector("URLByAppendingPathComponent:isDirectory:")
    public native NSURL URLByAppendingPathComponentIsDirectory(String pathComponent, boolean isDirectory);

    @Generated
    @Selector("URLByAppendingPathExtension:")
    public native NSURL URLByAppendingPathExtension(String pathExtension);

    @Generated
    @Selector("URLByDeletingLastPathComponent")
    public native NSURL URLByDeletingLastPathComponent();

    @Generated
    @Selector("URLByDeletingPathExtension")
    public native NSURL URLByDeletingPathExtension();

    @Generated
    @Selector("URLByResolvingSymlinksInPath")
    public native NSURL URLByResolvingSymlinksInPath();

    @Generated
    @Selector("URLByStandardizingPath")
    public native NSURL URLByStandardizingPath();

    @Generated
    @Selector("absoluteString")
    public native String absoluteString();

    @Generated
    @Selector("absoluteURL")
    public native NSURL absoluteURL();

    @Generated
    @Selector("baseURL")
    public native NSURL baseURL();

    @Generated
    @Selector("bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:")
    public native NSData bookmarkDataWithOptionsIncludingResourceValuesForKeysRelativeToURLError(@NUInt long options,
            NSArray<String> keys, NSURL relativeURL, Ptr<NSError> error);

    @Generated
    @Selector("checkPromisedItemIsReachableAndReturnError:")
    public native boolean checkPromisedItemIsReachableAndReturnError(Ptr<NSError> error);

    @Generated
    @Selector("checkResourceIsReachableAndReturnError:")
    public native boolean checkResourceIsReachableAndReturnError(Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("dataRepresentation")
    public native NSData dataRepresentation();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("filePathURL")
    public native NSURL filePathURL();

    @Generated
    @Selector("fileReferenceURL")
    public native NSURL fileReferenceURL();

    @Generated
    @Selector("fileSystemRepresentation")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentation();

    @Generated
    @Selector("fragment")
    public native String fragment();

    @Generated
    @Selector("getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentationMaxLength(BytePtr buffer, @NUInt long maxBufferLength);

    @Generated
    @Selector("getPromisedItemResourceValue:forKey:error:")
    public native boolean getPromisedItemResourceValueForKeyError(Ptr<ObjCObject> value, String key,
            Ptr<NSError> error);

    @Generated
    @Selector("getResourceValue:forKey:error:")
    public native boolean getResourceValueForKeyError(Ptr<ObjCObject> value, String key, Ptr<NSError> error);

    @Generated
    @Selector("hasDirectoryPath")
    public native boolean hasDirectoryPath();

    @Generated
    @Selector("host")
    public native String host();

    @Generated
    @Selector("init")
    public native NSURL init();

    @Generated
    @Selector("initAbsoluteURLWithDataRepresentation:relativeToURL:")
    public native NSURL initAbsoluteURLWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    @Generated
    @Selector("initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public native NSURL initByResolvingBookmarkDataOptionsRelativeToURLBookmarkDataIsStaleError(NSData bookmarkData,
            @NUInt long options, NSURL relativeURL, BoolPtr isStale, Ptr<NSError> error);

    @Generated
    @Selector("initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
    public native NSURL initFileURLWithFileSystemRepresentationIsDirectoryRelativeToURL(
            @Mapped(CStringMapper.class) String path, boolean isDir, NSURL baseURL);

    @Generated
    @Selector("initFileURLWithPath:")
    public native NSURL initFileURLWithPath(String path);

    @Generated
    @Selector("initFileURLWithPath:isDirectory:")
    public native NSURL initFileURLWithPathIsDirectory(String path, boolean isDir);

    @Generated
    @Selector("initFileURLWithPath:isDirectory:relativeToURL:")
    public native NSURL initFileURLWithPathIsDirectoryRelativeToURL(String path, boolean isDir, NSURL baseURL);

    @Generated
    @Selector("initFileURLWithPath:relativeToURL:")
    public native NSURL initFileURLWithPathRelativeToURL(String path, NSURL baseURL);

    @Generated
    @Selector("initWithCoder:")
    public native NSURL initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithDataRepresentation:relativeToURL:")
    public native NSURL initWithDataRepresentationRelativeToURL(NSData data, NSURL baseURL);

    @Generated
    @Deprecated
    @Selector("initWithScheme:host:path:")
    public native NSURL initWithSchemeHostPath(String scheme, String host, String path);

    @Generated
    @Selector("initWithString:")
    public native NSURL initWithString(String URLString);

    @Generated
    @Selector("initWithString:relativeToURL:")
    public native NSURL initWithStringRelativeToURL(String URLString, NSURL baseURL);

    @Generated
    @Selector("isFileReferenceURL")
    public native boolean isFileReferenceURL();

    @Generated
    @Selector("isFileURL")
    public native boolean isFileURL();

    @Generated
    @Selector("lastPathComponent")
    public native String lastPathComponent();

    @Generated
    @Selector("parameterString")
    public native String parameterString();

    @Generated
    @Selector("password")
    public native String password();

    @Generated
    @Selector("path")
    public native String path();

    @Generated
    @Selector("pathComponents")
    public native NSArray<String> pathComponents();

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

    @Generated
    @Selector("promisedItemResourceValuesForKeys:error:")
    public native NSDictionary<String, ?> promisedItemResourceValuesForKeysError(NSArray<String> keys,
            Ptr<NSError> error);

    @Generated
    @Selector("query")
    public native String query();

    @Generated
    @Selector("relativePath")
    public native String relativePath();

    @Generated
    @Selector("relativeString")
    public native String relativeString();

    @Generated
    @Selector("removeAllCachedResourceValues")
    public native void removeAllCachedResourceValues();

    @Generated
    @Selector("removeCachedResourceValueForKey:")
    public native void removeCachedResourceValueForKey(String key);

    @Generated
    @Selector("resourceSpecifier")
    public native String resourceSpecifier();

    @Generated
    @Selector("resourceValuesForKeys:error:")
    public native NSDictionary<String, ?> resourceValuesForKeysError(NSArray<String> keys, Ptr<NSError> error);

    @Generated
    @Selector("scheme")
    public native String scheme();

    @Generated
    @Selector("setResourceValue:forKey:error:")
    public native boolean setResourceValueForKeyError(@Mapped(ObjCObjectMapper.class) Object value, String key,
            Ptr<NSError> error);

    @Generated
    @Selector("setResourceValues:error:")
    public native boolean setResourceValuesError(NSDictionary<String, ?> keyedValues, Ptr<NSError> error);

    @Generated
    @Selector("setTemporaryResourceValue:forKey:")
    public native void setTemporaryResourceValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("standardizedURL")
    public native NSURL standardizedURL();

    @Generated
    @Selector("startAccessingSecurityScopedResource")
    public native boolean startAccessingSecurityScopedResource();

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
}
