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
import apple.foundation.protocol.NSCoding;
import org.moe.natj.c.ann.FunctionPtr;
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

/**
 * Instances of NSFileVersion for the same version of the same file are equal, and instances of NSFileVersion for
 * different versions of the same file are not equal, but the equality of NSFileVersions for different files is
 * undefined. Repeated invocations of the methods that return NSFileVersions do not necessarily return the exact same
 * instance of NSFileVersion.
 * 
 * API-Since: 5.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileVersion extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileVersion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileVersion alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFileVersion allocWithZone(VoidPtr zone);

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

    /**
     * Return an NSFileVersion that represents the contents of the file located by a URL, or nil if there is no such
     * file.
     */
    @Nullable
    @Generated
    @Selector("currentVersionOfItemAtURL:")
    public static native NSFileVersion currentVersionOfItemAtURL(@NotNull NSURL url);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Asynchronously return an array of NSFileVersions associated with the file located by the given URL, or nil if
     * there is no such file or another error occurs. Versions returned by this method do not initially have their
     * contents stored locally on the device, so a download may be required before you are able to access them. File
     * attributes are accessible via -[NSURL getPromisedItemResourceValue:forKey:error:]. You can request a download by
     * performing a coordinated read with NSFileCoordinator on the URL property of the resulting NSFileVersions.
     * 
     * When a version is successfully downloaded, its contents are cached locally, and the version will no longer be
     * returned by this method. The version will be returned by +[NSFileVersion otherVersionsOfItemAtURL:] instead, but
     * will retain the same persistentIdentifier value. If the local version is later discarded, future invocations of
     * this method may resume returning the version.
     * 
     * If you need to get all versions for a document, both local and non-local, you should use an NSFilePresenter that
     * implements -presentedItemDidGainVersion: and -presentedItemDidLoseVersion: and invoke +[NSFileCoordinator
     * addFilePresenter:], +[NSFileVersion otherVersionsOfItemAtURL:], and this method within a single coordinated read.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("getNonlocalVersionsOfItemAtURL:completionHandler:")
    public static native void getNonlocalVersionsOfItemAtURLCompletionHandler(@NotNull NSURL url,
            @NotNull @ObjCBlock(name = "call_getNonlocalVersionsOfItemAtURLCompletionHandler") Block_getNonlocalVersionsOfItemAtURLCompletionHandler completionHandler);

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
    public static native NSFileVersion new_objc();

    /**
     * Return an array of NSFileVersions associated with the file located by a URL, or nil if there is no such file. The
     * array never contains an NSFileVersion equal to what +currentVersionOfItemAtURL: would return.
     */
    @Nullable
    @Generated
    @Selector("otherVersionsOfItemAtURL:")
    public static native NSArray<? extends NSFileVersion> otherVersionsOfItemAtURL(@NotNull NSURL url);

    /**
     * Delete all of the versions associated with the file located by a URL, except for the current one, and return YES
     * if successful. If not successful, return NO after setting *outError to an NSError that encapsulates why not.
     * 
     * When removing versions of a file you should do it as part of a coordinated write to the file. The advice about
     * this for +addVersionOfItemAtURL:withContentsOfURL:options:error: applies here too.
     */
    @Generated
    @Selector("removeOtherVersionsOfItemAtURL:error:")
    public static native boolean removeOtherVersionsOfItemAtURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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

    /**
     * Return an array of NSFileVersions that represent unresolved conflicts for the file located by a URL, or nil if
     * there is no such file.
     */
    @Nullable
    @Generated
    @Selector("unresolvedConflictVersionsOfItemAtURL:")
    public static native NSArray<? extends NSFileVersion> unresolvedConflictVersionsOfItemAtURL(@NotNull NSURL url);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * For a file located by a URL, return the NSFileVersion identified by a persistent identifier of the sort returned
     * by -persistentIdentifier, or nil if the version no longer exists.
     */
    @Nullable
    @Generated
    @Selector("versionOfItemAtURL:forPersistentIdentifier:")
    public static native NSFileVersion versionOfItemAtURLForPersistentIdentifier(@NotNull NSURL url,
            @NotNull @Mapped(ObjCObjectMapper.class) Object persistentIdentifier);

    /**
     * The location of the receiver's storage, or possibly nil if the receiver's storage has been deleted. The storage
     * is read-only. The URL will have an arcane path. You must not derive user-presentable text from it.
     */
    @NotNull
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * Whether the version has local contents. Versions that are returned by
     * +getNonlocalVersionsOfItemAtURL:completionHandler: do not initially have local contents. You can only access
     * their contents, either directly via the URL or by invoking -replaceItemAtURL:options:error:, from within a
     * coordinated read on the NSFileVersion's URL.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("hasLocalContents")
    public native boolean hasLocalContents();

    /**
     * Whether the version has a thumbnail image available. Thumbnails for versions from
     * +getNonlocalVersionsOfItemAtURL:completionHandler: may not immediately be available. As soon as it becomes
     * available, this property will change from NO to YES. You can use KVO to be notified of this change. If a
     * thumbnail is available, you can access it using NSURLThumbnailKey or NSURLThumbnailDictionaryKey.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("hasThumbnail")
    public native boolean hasThumbnail();

    @Generated
    @Selector("init")
    public native NSFileVersion init();

    /**
     * Whether the version was created as a result of the discovery of a conflict between two writers of the versioned
     * file.
     */
    @Generated
    @Selector("isConflict")
    public native boolean isConflict();

    /**
     * If the version is a conflict version, whether the conflict has been resolved. If the version is not a conflict
     * version, simply YES.
     * 
     * The operating system's reaction to your setting this to YES is complicated and subject to change in future
     * releases. One result however is that the version won't appear in arrays returned by
     * +unresolvedConflictVersionsOfItemAtURL: anymore, unless setting fails.
     * 
     * Once you have indicated that a conflict has been resolved you cannot make it unresolved again. Setting this to NO
     * causes an exception to be thrown.
     */
    @Generated
    @Selector("isResolved")
    public native boolean isResolved();

    /**
     * If the version is a conflict version, whether the conflict has been resolved. If the version is not a conflict
     * version, simply YES.
     * 
     * The operating system's reaction to your setting this to YES is complicated and subject to change in future
     * releases. One result however is that the version won't appear in arrays returned by
     * +unresolvedConflictVersionsOfItemAtURL: anymore, unless setting fails.
     * 
     * Once you have indicated that a conflict has been resolved you cannot make it unresolved again. Setting this to NO
     * causes an exception to be thrown.
     */
    @Generated
    @Selector("setResolved:")
    public native void setResolved(boolean value);

    /**
     * The user-presentable name of the version, or possibly nil if the receiver's storage has been deleted. This will
     * be different from the user-presentable name of the versioned file if, for example, the file has been renamed
     * since the version was added.
     */
    @Nullable
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * The user-presentable name of the computer on which the version was saved, or possibly nil if the receiver's
     * storage has been deleted, or nil if no computer name was recorded. The computer name is guaranteed to have been
     * recorded only if the version is a conflict version. This will be different from that computer's current name if
     * the computer's name has been changed since the version was retrieved from that computer.
     */
    @Nullable
    @Generated
    @Selector("localizedNameOfSavingComputer")
    public native String localizedNameOfSavingComputer();

    /**
     * The modification date of the version, or possibly nil if the receiver's storage has been deleted.
     */
    @Nullable
    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    /**
     * An object that can be encoded and, after subsequent decoding, passed to
     * -versionOfItemAtURL:forPersistentIdentifier: to create a new instance of NSFileVersion that is equal to the
     * receiver.
     */
    @NotNull
    @Generated
    @Selector("persistentIdentifier")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSCoding persistentIdentifier();

    /**
     * Delete the receiver's storage, and return YES if successful. If not successful, return NO after setting *outError
     * to an NSError that encapsulates why not. Subsequent invocations of +versionsOfItemAtURL: won't include an
     * NSFileVersion for a successfully removed version.
     * 
     * You cannot use this method to delete the versioned file itself. This method always throws an exception when sent
     * to the result of invoking +currentVersionOfItemAtURL:. Use -[NSFileManager removeItemAtURL:error:] for that
     * instead.
     * 
     * When removing versions of a file you should do it as part of a coordinated write to the file. The advice about
     * this for +addVersionOfItemAtURL:withContentsOfURL:options:error: applies here too.
     */
    @Generated
    @Selector("removeAndReturnError:")
    public native boolean removeAndReturnError(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * If the passed-in URL locates a file, replace the file with a file whose contents are taken from the version but
     * whose display name is taken from the file. If the passed-in URL does not locate a file then simply write one. If
     * successful, return a URL that locates the resulting file; it may be different from the passed-in URL. The one
     * exception to taking the display name from an existing file is if the version is of a different type than the
     * overwritten file. In that case the file name extension will be taken from the version. (When file name extensions
     * are being hidden in a user-friendly way this is not actually an exception.) If not successful, return NO after
     * setting *outError to an NSError that encapsulates why not.
     * 
     * When you use NSFileVersionReplacingByMoving you remove a version of the file, and should do it as part of a
     * coordinated write to the file. The advice about this for +addVersionOfItemAtURL:withContentsOfURL:options:error:
     * applies here too. When you use it to promote a version to a separate file you actually write to two files, and
     * should do it as part of a coordinated write to two files, using -[NSFileCoordinator
     * coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:], most likely using
     * NSFileCoordinatorWritingForReplacing for the file you're promoting the version to.
     */
    @Nullable
    @Generated
    @Selector("replaceItemAtURL:options:error:")
    public native NSURL replaceItemAtURLOptionsError(@NotNull NSURL url, @NUInt long options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNonlocalVersionsOfItemAtURLCompletionHandler {
        @Generated
        void call_getNonlocalVersionsOfItemAtURLCompletionHandler(
                @Nullable NSArray<? extends NSFileVersion> nonlocalFileVersions, @Nullable NSError error);
    }

    /**
     * The name components of the user who created this version of the file. Is nil if the file is not shared or if the
     * current user is the originator.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("originatorNameComponents")
    public native NSPersonNameComponents originatorNameComponents();
}
