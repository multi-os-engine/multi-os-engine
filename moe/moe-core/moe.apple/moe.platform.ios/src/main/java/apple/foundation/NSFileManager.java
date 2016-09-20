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
    @Owned
    @Selector("alloc")
    public static native NSFileManager alloc();

    /**
     * defaultManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/clm/NSFileManager/defaultManager">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultManager")
    public static native NSFileManager defaultManager();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * URLForDirectory:inDomain:appropriateForURL:create:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/URLForDirectory:inDomain:appropriateForURL:create:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForDirectory:inDomain:appropriateForURL:create:error:")
    public native NSURL URLForDirectoryInDomainAppropriateForURLCreateError(@NUInt long directory, @NUInt long domain,
            NSURL url, boolean shouldCreate, Ptr<NSError> error);

    /**
     * URLForPublishingUbiquitousItemAtURL:expirationDate:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/URLForPublishingUbiquitousItemAtURL:expirationDate:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForPublishingUbiquitousItemAtURL:expirationDate:error:")
    public native NSURL URLForPublishingUbiquitousItemAtURLExpirationDateError(NSURL url, Ptr<NSDate> outDate,
            Ptr<NSError> error);

    /**
     * URLForUbiquityContainerIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/URLForUbiquityContainerIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForUbiquityContainerIdentifier:")
    public native NSURL URLForUbiquityContainerIdentifier(String containerIdentifier);

    /**
     * URLsForDirectory:inDomains:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/URLsForDirectory:inDomains:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLsForDirectory:inDomains:")
    public native NSArray<? extends NSURL> URLsForDirectoryInDomains(@NUInt long directory, @NUInt long domainMask);

    /**
     * attributesOfFileSystemForPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/attributesOfFileSystemForPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributesOfFileSystemForPath:error:")
    public native NSDictionary<String, ?> attributesOfFileSystemForPathError(String path, Ptr<NSError> error);

    /**
     * attributesOfItemAtPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/attributesOfItemAtPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributesOfItemAtPath:error:")
    public native NSDictionary<String, ?> attributesOfItemAtPathError(String path, Ptr<NSError> error);

    /**
     * changeCurrentDirectoryPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/changeCurrentDirectoryPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeCurrentDirectoryPath:")
    public native boolean changeCurrentDirectoryPath(String path);

    /**
     * changeFileAttributes:atPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/changeFileAttributes:atPath:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("changeFileAttributes:atPath:")
    public native boolean changeFileAttributesAtPath(NSDictionary<?, ?> attributes, String path);

    /**
     * componentsToDisplayForPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/componentsToDisplayForPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentsToDisplayForPath:")
    public native NSArray<String> componentsToDisplayForPath(String path);

    /**
     * containerURLForSecurityApplicationGroupIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/containerURLForSecurityApplicationGroupIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containerURLForSecurityApplicationGroupIdentifier:")
    public native NSURL containerURLForSecurityApplicationGroupIdentifier(String groupIdentifier);

    /**
     * contentsAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/contentsAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentsAtPath:")
    public native NSData contentsAtPath(String path);

    /**
     * contentsEqualAtPath:andPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/contentsEqualAtPath:andPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentsEqualAtPath:andPath:")
    public native boolean contentsEqualAtPathAndPath(String path1, String path2);

    /**
     * contentsOfDirectoryAtPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/contentsOfDirectoryAtPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentsOfDirectoryAtPath:error:")
    public native NSArray<String> contentsOfDirectoryAtPathError(String path, Ptr<NSError> error);

    /**
     * contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:")
    public native NSArray<? extends NSURL> contentsOfDirectoryAtURLIncludingPropertiesForKeysOptionsError(NSURL url,
            NSArray<String> keys, @NUInt long mask, Ptr<NSError> error);

    /**
     * copyItemAtPath:toPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/copyItemAtPath:toPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("copyItemAtPath:toPath:error:")
    public native boolean copyItemAtPathToPathError(String srcPath, String dstPath, Ptr<NSError> error);

    /**
     * copyItemAtURL:toURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/copyItemAtURL:toURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("copyItemAtURL:toURL:error:")
    public native boolean copyItemAtURLToURLError(NSURL srcURL, NSURL dstURL, Ptr<NSError> error);

    /**
     * createDirectoryAtPath:attributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/createDirectoryAtPath:attributes:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("createDirectoryAtPath:attributes:")
    public native boolean createDirectoryAtPathAttributes(String path, NSDictionary<?, ?> attributes);

    /**
     * createDirectoryAtPath:withIntermediateDirectories:attributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/createDirectoryAtPath:withIntermediateDirectories:attributes:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("createDirectoryAtPath:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtPathWithIntermediateDirectoriesAttributesError(String path,
            boolean createIntermediates, NSDictionary<String, ?> attributes, Ptr<NSError> error);

    /**
     * createDirectoryAtURL:withIntermediateDirectories:attributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/createDirectoryAtURL:withIntermediateDirectories:attributes:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("createDirectoryAtURL:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtURLWithIntermediateDirectoriesAttributesError(NSURL url,
            boolean createIntermediates, NSDictionary<String, ?> attributes, Ptr<NSError> error);

    /**
     * createFileAtPath:contents:attributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/createFileAtPath:contents:attributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("createFileAtPath:contents:attributes:")
    public native boolean createFileAtPathContentsAttributes(String path, NSData data, NSDictionary<String, ?> attr);

    /**
     * createSymbolicLinkAtPath:pathContent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/createSymbolicLinkAtPath:pathContent:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("createSymbolicLinkAtPath:pathContent:")
    public native boolean createSymbolicLinkAtPathPathContent(String path, String otherpath);

    /**
     * createSymbolicLinkAtPath:withDestinationPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/createSymbolicLinkAtPath:withDestinationPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("createSymbolicLinkAtPath:withDestinationPath:error:")
    public native boolean createSymbolicLinkAtPathWithDestinationPathError(String path, String destPath,
            Ptr<NSError> error);

    /**
     * createSymbolicLinkAtURL:withDestinationURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/createSymbolicLinkAtURL:withDestinationURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("createSymbolicLinkAtURL:withDestinationURL:error:")
    public native boolean createSymbolicLinkAtURLWithDestinationURLError(NSURL url, NSURL destURL, Ptr<NSError> error);

    /**
     * currentDirectoryPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instp/NSFileManager/currentDirectoryPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentDirectoryPath")
    public native String currentDirectoryPath();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instp/NSFileManager/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileManagerDelegate delegate();

    /**
     * destinationOfSymbolicLinkAtPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/destinationOfSymbolicLinkAtPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("destinationOfSymbolicLinkAtPath:error:")
    public native String destinationOfSymbolicLinkAtPathError(String path, Ptr<NSError> error);

    /**
     * directoryContentsAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/directoryContentsAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("directoryContentsAtPath:")
    public native NSArray<?> directoryContentsAtPath(String path);

    /**
     * displayNameAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/displayNameAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("displayNameAtPath:")
    public native String displayNameAtPath(String path);

    /**
     * enumeratorAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/enumeratorAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumeratorAtPath:")
    public native NSDirectoryEnumerator<String> enumeratorAtPath(String path);

    /**
     * enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:")
    public native NSDirectoryEnumerator<NSURL> enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(NSURL url,
            NSArray<String> keys, @NUInt long mask,
            @ObjCBlock(name = "call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler") Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler handler);

    /**
     * evictUbiquitousItemAtURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/evictUbiquitousItemAtURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("evictUbiquitousItemAtURL:error:")
    public native boolean evictUbiquitousItemAtURLError(NSURL url, Ptr<NSError> error);

    /**
     * fileAttributesAtPath:traverseLink:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/fileAttributesAtPath:traverseLink:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("fileAttributesAtPath:traverseLink:")
    public native NSDictionary<?, ?> fileAttributesAtPathTraverseLink(String path, boolean yorn);

    /**
     * fileExistsAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/fileExistsAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileExistsAtPath:")
    public native boolean fileExistsAtPath(String path);

    /**
     * fileExistsAtPath:isDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/fileExistsAtPath:isDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileExistsAtPath:isDirectory:")
    public native boolean fileExistsAtPathIsDirectory(String path, BoolPtr isDirectory);

    /**
     * fileSystemAttributesAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/fileSystemAttributesAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("fileSystemAttributesAtPath:")
    public native NSDictionary<?, ?> fileSystemAttributesAtPath(String path);

    /**
     * fileSystemRepresentationWithPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/fileSystemRepresentationWithPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileSystemRepresentationWithPath:")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentationWithPath(String path);

    /**
     * getRelationship:ofDirectory:inDomain:toItemAtURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/getRelationship:ofDirectory:inDomain:toItemAtURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getRelationship:ofDirectory:inDomain:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryInDomainToItemAtURLError(NIntPtr outRelationship,
            @NUInt long directory, @NUInt long domainMask, NSURL url, Ptr<NSError> error);

    /**
     * getRelationship:ofDirectoryAtURL:toItemAtURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/getRelationship:ofDirectoryAtURL:toItemAtURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getRelationship:ofDirectoryAtURL:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryAtURLToItemAtURLError(NIntPtr outRelationship, NSURL directoryURL,
            NSURL otherURL, Ptr<NSError> error);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSFileManager init();

    /**
     * isDeletableFileAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/isDeletableFileAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDeletableFileAtPath:")
    public native boolean isDeletableFileAtPath(String path);

    /**
     * isExecutableFileAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/isExecutableFileAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isExecutableFileAtPath:")
    public native boolean isExecutableFileAtPath(String path);

    /**
     * isReadableFileAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/isReadableFileAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isReadableFileAtPath:")
    public native boolean isReadableFileAtPath(String path);

    /**
     * isUbiquitousItemAtURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/isUbiquitousItemAtURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isUbiquitousItemAtURL:")
    public native boolean isUbiquitousItemAtURL(NSURL url);

    /**
     * isWritableFileAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/isWritableFileAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isWritableFileAtPath:")
    public native boolean isWritableFileAtPath(String path);

    /**
     * linkItemAtPath:toPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/linkItemAtPath:toPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("linkItemAtPath:toPath:error:")
    public native boolean linkItemAtPathToPathError(String srcPath, String dstPath, Ptr<NSError> error);

    /**
     * linkItemAtURL:toURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/linkItemAtURL:toURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("linkItemAtURL:toURL:error:")
    public native boolean linkItemAtURLToURLError(NSURL srcURL, NSURL dstURL, Ptr<NSError> error);

    /**
     * mountedVolumeURLsIncludingResourceValuesForKeys:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/mountedVolumeURLsIncludingResourceValuesForKeys:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mountedVolumeURLsIncludingResourceValuesForKeys:options:")
    public native NSArray<? extends NSURL> mountedVolumeURLsIncludingResourceValuesForKeysOptions(
            NSArray<String> propertyKeys, @NUInt long options);

    /**
     * moveItemAtPath:toPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/moveItemAtPath:toPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveItemAtPath:toPath:error:")
    public native boolean moveItemAtPathToPathError(String srcPath, String dstPath, Ptr<NSError> error);

    /**
     * moveItemAtURL:toURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/moveItemAtURL:toURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveItemAtURL:toURL:error:")
    public native boolean moveItemAtURLToURLError(NSURL srcURL, NSURL dstURL, Ptr<NSError> error);

    /**
     * pathContentOfSymbolicLinkAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/pathContentOfSymbolicLinkAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("pathContentOfSymbolicLinkAtPath:")
    public native String pathContentOfSymbolicLinkAtPath(String path);

    /**
     * removeItemAtPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/removeItemAtPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeItemAtPath:error:")
    public native boolean removeItemAtPathError(String path, Ptr<NSError> error);

    /**
     * removeItemAtURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/removeItemAtURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeItemAtURL:error:")
    public native boolean removeItemAtURLError(NSURL URL, Ptr<NSError> error);

    /**
     * replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:")
    public native boolean replaceItemAtURLWithItemAtURLBackupItemNameOptionsResultingItemURLError(NSURL originalItemURL,
            NSURL newItemURL, String backupItemName, @NUInt long options, Ptr<NSURL> resultingURL, Ptr<NSError> error);

    /**
     * setAttributes:ofItemAtPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/setAttributes:ofItemAtPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttributes:ofItemAtPath:error:")
    public native boolean setAttributesOfItemAtPathError(NSDictionary<String, ?> attributes, String path,
            Ptr<NSError> error);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instp/NSFileManager/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSFileManagerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instp/NSFileManager/delegate">iOS Dev Center</a>
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
     * setUbiquitous:itemAtURL:destinationURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/setUbiquitous:itemAtURL:destinationURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUbiquitous:itemAtURL:destinationURL:error:")
    public native boolean setUbiquitousItemAtURLDestinationURLError(boolean flag, NSURL url, NSURL destinationURL,
            Ptr<NSError> error);

    /**
     * startDownloadingUbiquitousItemAtURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/startDownloadingUbiquitousItemAtURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("startDownloadingUbiquitousItemAtURL:error:")
    public native boolean startDownloadingUbiquitousItemAtURLError(NSURL url, Ptr<NSError> error);

    /**
     * stringWithFileSystemRepresentation:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/stringWithFileSystemRepresentation:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringWithFileSystemRepresentation:length:")
    public native String stringWithFileSystemRepresentationLength(ConstBytePtr str, @NUInt long len);

    /**
     * subpathsAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/subpathsAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("subpathsAtPath:")
    public native NSArray<String> subpathsAtPath(String path);

    /**
     * subpathsOfDirectoryAtPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSFileManager/subpathsOfDirectoryAtPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("subpathsOfDirectoryAtPath:error:")
    public native NSArray<String> subpathsOfDirectoryAtPathError(String path, Ptr<NSError> error);

    /**
     * ubiquityIdentityToken</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instp/NSFileManager/ubiquityIdentityToken">iOS Dev Center</a>
     */
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
}
