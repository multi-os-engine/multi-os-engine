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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("URLForDirectory:inDomain:appropriateForURL:create:error:")
    public native NSURL URLForDirectoryInDomainAppropriateForURLCreateError(@NUInt long directory, @NUInt long domain,
            NSURL url, boolean shouldCreate, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("URLForPublishingUbiquitousItemAtURL:expirationDate:error:")
    public native NSURL URLForPublishingUbiquitousItemAtURLExpirationDateError(NSURL url,
            @ReferenceInfo(type = NSDate.class) Ptr<NSDate> outDate,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("URLForUbiquityContainerIdentifier:")
    public native NSURL URLForUbiquityContainerIdentifier(String containerIdentifier);

    @Generated
    @Selector("URLsForDirectory:inDomains:")
    public native NSArray<? extends NSURL> URLsForDirectoryInDomains(@NUInt long directory, @NUInt long domainMask);

    @Generated
    @Selector("attributesOfFileSystemForPath:error:")
    public native NSDictionary<String, ?> attributesOfFileSystemForPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("componentsToDisplayForPath:")
    public native NSArray<String> componentsToDisplayForPath(String path);

    @Generated
    @Selector("containerURLForSecurityApplicationGroupIdentifier:")
    public native NSURL containerURLForSecurityApplicationGroupIdentifier(String groupIdentifier);

    @Generated
    @Selector("contentsAtPath:")
    public native NSData contentsAtPath(String path);

    @Generated
    @Selector("contentsEqualAtPath:andPath:")
    public native boolean contentsEqualAtPathAndPath(String path1, String path2);

    @Generated
    @Selector("contentsOfDirectoryAtPath:error:")
    public native NSArray<String> contentsOfDirectoryAtPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:")
    public native NSArray<? extends NSURL> contentsOfDirectoryAtURLIncludingPropertiesForKeysOptionsError(NSURL url,
            NSArray<String> keys, @NUInt long mask, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("copyItemAtPath:toPath:error:")
    public native boolean copyItemAtPathToPathError(String srcPath, String dstPath,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("copyItemAtURL:toURL:error:")
    public native boolean copyItemAtURLToURLError(NSURL srcURL, NSURL dstURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("createDirectoryAtPath:attributes:")
    public native boolean createDirectoryAtPathAttributes(String path, NSDictionary<?, ?> attributes);

    @Generated
    @Selector("createDirectoryAtPath:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtPathWithIntermediateDirectoriesAttributesError(String path,
            boolean createIntermediates, NSDictionary<String, ?> attributes,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("createSymbolicLinkAtPath:withDestinationPath:error:")
    public native boolean createSymbolicLinkAtPathWithDestinationPathError(String path, String destPath,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("createSymbolicLinkAtURL:withDestinationURL:error:")
    public native boolean createSymbolicLinkAtURLWithDestinationURLError(NSURL url, NSURL destURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("currentDirectoryPath")
    public native String currentDirectoryPath();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileManagerDelegate delegate();

    @Generated
    @Selector("destinationOfSymbolicLinkAtPath:error:")
    public native String destinationOfSymbolicLinkAtPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("directoryContentsAtPath:")
    public native NSArray<?> directoryContentsAtPath(String path);

    @Generated
    @Selector("displayNameAtPath:")
    public native String displayNameAtPath(String path);

    @Generated
    @Selector("enumeratorAtPath:")
    public native NSDirectoryEnumerator<String> enumeratorAtPath(String path);

    @Generated
    @Selector("enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:")
    public native NSDirectoryEnumerator<NSURL> enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(NSURL url,
            NSArray<String> keys, @NUInt long mask,
            @ObjCBlock(name = "call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler") Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler handler);

    @Generated
    @Selector("evictUbiquitousItemAtURL:error:")
    public native boolean evictUbiquitousItemAtURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("fileAttributesAtPath:traverseLink:")
    public native NSDictionary<?, ?> fileAttributesAtPathTraverseLink(String path, boolean yorn);

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

    @Generated
    @Selector("fileSystemRepresentationWithPath:")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentationWithPath(String path);

    @Generated
    @Selector("getRelationship:ofDirectory:inDomain:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryInDomainToItemAtURLError(NIntPtr outRelationship,
            @NUInt long directory, @NUInt long domainMask, NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:")
    public native boolean replaceItemAtURLWithItemAtURLBackupItemNameOptionsResultingItemURLError(NSURL originalItemURL,
            NSURL newItemURL, String backupItemName, @NUInt long options,
            @ReferenceInfo(type = NSURL.class) Ptr<NSURL> resultingURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setAttributes:ofItemAtPath:error:")
    public native boolean setAttributesOfItemAtPathError(NSDictionary<String, ?> attributes, String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSFileManagerDelegate value);

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

    @Generated
    @Selector("setUbiquitous:itemAtURL:destinationURL:error:")
    public native boolean setUbiquitousItemAtURLDestinationURLError(boolean flag, NSURL url, NSURL destinationURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("startDownloadingUbiquitousItemAtURL:error:")
    public native boolean startDownloadingUbiquitousItemAtURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithFileSystemRepresentation:length:")
    public native String stringWithFileSystemRepresentationLength(ConstBytePtr str, @NUInt long len);

    @Generated
    @Selector("subpathsAtPath:")
    public native NSArray<String> subpathsAtPath(String path);

    @Generated
    @Selector("subpathsOfDirectoryAtPath:error:")
    public native NSArray<String> subpathsOfDirectoryAtPathError(String path,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("temporaryDirectory")
    public native NSURL temporaryDirectory();

    @Generated
    @Selector("ubiquityIdentityToken")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object ubiquityIdentityToken();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler {
        @Generated
        boolean call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(NSURL arg0, NSError arg1);
    }

    @Generated
    @Selector("getFileProviderServicesForItemAtURL:completionHandler:")
    public native void getFileProviderServicesForItemAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_getFileProviderServicesForItemAtURLCompletionHandler") Block_getFileProviderServicesForItemAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getFileProviderServicesForItemAtURLCompletionHandler {
        @Generated
        void call_getFileProviderServicesForItemAtURLCompletionHandler(
                NSDictionary<String, ? extends NSFileProviderService> arg0, NSError arg1);
    }

    @Generated
    @Selector("trashItemAtURL:resultingItemURL:error:")
    public native boolean trashItemAtURLResultingItemURLError(NSURL url,
            @ReferenceInfo(type = NSURL.class) Ptr<NSURL> outResultingURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
