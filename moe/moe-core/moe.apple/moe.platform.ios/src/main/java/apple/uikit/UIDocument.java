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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSFileVersion;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUndoManager;
import apple.foundation.NSUserActivity;
import apple.foundation.protocol.NSFilePresenter;
import apple.foundation.protocol.NSProgressReporting;
import apple.uikit.protocol.UIUserActivityRestoring;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocument extends NSObject implements NSFilePresenter, NSProgressReporting, UIUserActivityRestoring {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocument(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocument alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIDocument allocWithZone(VoidPtr zone);

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
    public static native UIDocument new_objc();

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
    @IsOptional
    @Selector("accommodatePresentedItemDeletionWithCompletionHandler:")
    public native void accommodatePresentedItemDeletionWithCompletionHandler(
            @ObjCBlock(name = "call_accommodatePresentedItemDeletionWithCompletionHandler") NSFilePresenter.Block_accommodatePresentedItemDeletionWithCompletionHandler completionHandler);

    @Generated
    @IsOptional
    @Selector("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    public native void accommodatePresentedSubitemDeletionAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_accommodatePresentedSubitemDeletionAtURLCompletionHandler") NSFilePresenter.Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler completionHandler);

    /**
     * Clients should not need to call this method directly. It exists as an override point for subclasses that want to do special things with autosaving.
     * The default implementation of this method invokes [self hasUnsavedChanges] and, if that returns YES, invokes [self saveToURL:[self fileURL] forSaveOperation:UIDocumentSaveForOverwriting completionHandler:completionHandler].
     */
    @Generated
    @Selector("autosaveWithCompletionHandler:")
    public native void autosaveWithCompletionHandler(
            @ObjCBlock(name = "call_autosaveWithCompletionHandler") Block_autosaveWithCompletionHandler completionHandler);

    /**
     * Change count tokens can be used to encapsulate the record of document changes being made in a particular save.
     * Subclasses that don't register changes via -updateChangeCount: or by using the undoManager should implement these methods to determine if the model has new unsaved changes at the end of a save.
     * -changeCountTokenForSaveOperation: is called at the beginning of a save operation and the token returned is passed to -updateChangeCountWithToken:forSaveOperation: at the conclusion of a save.
     * The default implementation of updateChangeCountWithToken:forSaveOperation: calls [self updateChangeCount:UIDocumentChangeCleared] if no changes are made during the save.
     */
    @Generated
    @Selector("changeCountTokenForSaveOperation:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object changeCountTokenForSaveOperation(@NInt long saveOperation);

    /**
     * Close the document. The default implementation calls [self autosaveWithCompletionHandler:completionHandler] which will save if [self hasUnsavedChanges] returns YES.
     */
    @Generated
    @Selector("closeWithCompletionHandler:")
    public native void closeWithCompletionHandler(
            @ObjCBlock(name = "call_closeWithCompletionHandler") Block_closeWithCompletionHandler completionHandler);

    /**
     * Typical subclasses will implement this method and return an NSFileWrapper or NSData encapsulating a snapshot of their data to be written to disk during saving.
     * Subclasses that return something other than a valid NSFileWrapper or NSData instance, or don't override this method must override one of the writing methods in the Advanced Saving section to write data to disk.
     */
    @Generated
    @Selector("contentsForType:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contentsForTypeError(String typeName,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Subclasses should override these methods so that they do not allow the user to edit the document between calls to -disableEditing and -enableEditing.
     * UIKit will call -disableEditing when it is unsafe to make changes to the document, such as during a close or revert, and call -enableEditing when it is safe again.
     * The default implementation of these methods do nothing.
     */
    @Generated
    @Selector("disableEditing")
    public native void disableEditing();

    @Generated
    @Selector("documentState")
    @NUInt
    public native long documentState();

    @Generated
    @Selector("enableEditing")
    public native void enableEditing();

    /**
     * Called by -saveToURL: before executing asynchronous writing to get a dictionary of attributes understood by NSFileManager for writing to the file.
     * The attributes are passed to -writeContents:andAttributes:safelyToURL:forSaveOperation:error: for writing to the file
     */
    @Generated
    @Selector("fileAttributesToWriteToURL:forSaveOperation:error:")
    public native NSDictionary<?, ?> fileAttributesToWriteToURLForSaveOperationError(NSURL url,
            @NInt long saveOperation, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * The last known modification date of the document's on-disk representation. Updated by openWithCompletionHandler:, revertToContentsOfURL:, and saveToURL: and will return nil if none of these has completed successfully at least once.
     */
    @Generated
    @Selector("fileModificationDate")
    public native NSDate fileModificationDate();

    /**
     * For a specified type, and a particular kind of save operation, return a file name extension that can be appended to a base file name.
     */
    @Generated
    @Selector("fileNameExtensionForType:saveOperation:")
    public native String fileNameExtensionForTypeSaveOperation(String typeName, @NInt long saveOperation);

    /**
     * The file's UTI. Derived from the fileURL by default.
     */
    @Generated
    @Selector("fileType")
    public native String fileType();

    /**
     * UIKit may call these methods on background threads, so subclasses that override them must have thread safe implementations.
     * These values will be set by UIKit before the completion handlers to the opening, reverting, and saving methods are called.
     * Clients that wish to access these properties outside of an open, save, or revert completion handler and wait for any pending file operations should wrap the accesses in -performAsynchronousFileAccessUsingBlock:
     */
    @Generated
    @Selector("fileURL")
    public native NSURL fileURL();

    /**
     * Called when handling of an error (including any user interaction) is complete.
     * Subclasses only need to call this method if they override -handleError:userInteractionPermitted: and do not call super.
     * If overridden, subclasses must call super
     */
    @Generated
    @Selector("finishedHandlingError:recovered:")
    public native void finishedHandlingErrorRecovered(NSError error, boolean recovered);

    /**
     * Called by the default implementations of -openWithCompletionHandler: and -saveToURL:forSaveOperation:completionHandler:.
     * Subclasses should call -handleError:userInteractionPermitted: with any errors that arise from direct calls to the advanced reading and writing methods that return NSErrors by indirection.
     * Notes for overriding:
     * 1. Subclasses that do not call super are responsible for calling -finishedHandlingError: when done with the error (i.e. when the app will not require any additional user feedback from the error).
     * 2. Subclasses that do not call super are also responsible for implementing -userInteractionNoLongerPermittedForError: to wrap up error handling immediately when required.
     * 3. If the userInteractionPermitted flag is NO, you should immediately handle the error and call [self finishedHandlingError:] within the context of -handleError:userInteractionPermitted:
     */
    @Generated
    @Selector("handleError:userInteractionPermitted:")
    public native void handleErrorUserInteractionPermitted(NSError error, boolean userInteractionPermitted);

    /**
     * Subclasses should generally not need to override this. Instead they should use the undoManager or call -updateChangeCount: every time they get a change and UIKit will calculate -hasUnsavedChanges automatically.
     * The default implementation of -autosaveWithCompletionHandler: initiates a save if [self hasUnsavedChanges] is YES.
     */
    @Generated
    @Selector("hasUnsavedChanges")
    public native boolean hasUnsavedChanges();

    @Generated
    @Selector("init")
    public native UIDocument init();

    /**
     * The designated initializer. Passing an empty URL will cause this method to throw an NSInvalidArgumentException.
     */
    @Generated
    @Selector("initWithFileURL:")
    public native UIDocument initWithFileURL(NSURL url);

    /**
     * Typical subclasses will implement this method to do reading. UIKit will pass NSData typed contents for flat files and NSFileWrapper typed contents for file packages.
     * typeName is the UTI of the loaded file.
     */
    @Generated
    @Selector("loadFromContents:ofType:error:")
    public native boolean loadFromContentsOfTypeError(@Mapped(ObjCObjectMapper.class) Object contents, String typeName,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * The default implementation derives the name from the URL. Subclasses may override to provide a custom name for presentation to the user, such as in error strings.
     */
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * Subclassing this method without calling super should be avoided. Subclassers who don't call super must use NSFileCoordinator for coordinated reading themselves.
     * Open the document located by the fileURL.  This will call readFromURL:error: on a background queue and then invoke the completionHandler on the current dispatch queue when openWithCompletionHandler: is invoked.
     */
    @Generated
    @Selector("openWithCompletionHandler:")
    public native void openWithCompletionHandler(
            @ObjCBlock(name = "call_openWithCompletionHandler") Block_openWithCompletionHandler completionHandler);

    /**
     * The default implementations of saveToURL: and openWithCompletionHandler: both use this to serialize file access. Direct calls to reading and writing methods should use this method to serialize file access on a background queue.
     */
    @Generated
    @Selector("performAsynchronousFileAccessUsingBlock:")
    public native void performAsynchronousFileAccessUsingBlock(
            @ObjCBlock(name = "call_performAsynchronousFileAccessUsingBlock") Block_performAsynchronousFileAccessUsingBlock block);

    @Generated
    @IsOptional
    @Selector("presentedItemDidChange")
    public native void presentedItemDidChange();

    @Generated
    @IsOptional
    @Selector("presentedItemDidGainVersion:")
    public native void presentedItemDidGainVersion(NSFileVersion version);

    @Generated
    @IsOptional
    @Selector("presentedItemDidLoseVersion:")
    public native void presentedItemDidLoseVersion(NSFileVersion version);

    @Generated
    @IsOptional
    @Selector("presentedItemDidMoveToURL:")
    public native void presentedItemDidMoveToURL(NSURL newURL);

    @Generated
    @IsOptional
    @Selector("presentedItemDidResolveConflictVersion:")
    public native void presentedItemDidResolveConflictVersion(NSFileVersion version);

    @Generated
    @Selector("presentedItemOperationQueue")
    public native NSOperationQueue presentedItemOperationQueue();

    @Generated
    @Selector("presentedItemURL")
    public native NSURL presentedItemURL();

    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didGainVersion:")
    public native void presentedSubitemAtURLDidGainVersion(NSURL url, NSFileVersion version);

    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didLoseVersion:")
    public native void presentedSubitemAtURLDidLoseVersion(NSURL url, NSFileVersion version);

    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didMoveToURL:")
    public native void presentedSubitemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL);

    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didResolveConflictVersion:")
    public native void presentedSubitemAtURLDidResolveConflictVersion(NSURL url, NSFileVersion version);

    @Generated
    @IsOptional
    @Selector("presentedSubitemDidAppearAtURL:")
    public native void presentedSubitemDidAppearAtURL(NSURL url);

    @Generated
    @IsOptional
    @Selector("presentedSubitemDidChangeAtURL:")
    public native void presentedSubitemDidChangeAtURL(NSURL url);

    @Generated
    @Selector("progress")
    public native NSProgress progress();

    /**
     * Direct calls to this method should not be necessary for typical subclasses where the entire file is read during opening.
     * If direct calls are used, the client must use NSFileCoordinator API to ensure coordinated reads and performAsynchronousFileAccessUsingBlock: to serialize with any active writes.
     * Default implementation calls [self loadFromContents:ofType:error:] on the queue that called openWithCompletionHandler:, or the main queue if called directly, with NSData or NSFileWrapper contents.
     */
    @Generated
    @Selector("readFromURL:error:")
    public native boolean readFromURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("restoreUserActivityState:")
    public native void restoreUserActivityState(NSUserActivity userActivity);

    /**
     * Discard all unsaved document modifications and replace the document's contents by reading a file or file package located by a URL.
     * Default implementation calls [self disableEditing] in the beginning and [self enableEditing] on completion to indicate that the document should not accept changes from the user while this is happening.
     * The default implementation also calls [self openWithCompletionHandler:] after updating the fileURL.
     * Subclasses that override this method must call super or use NSFileCoordinator directly to initiate a coordinated read.
     */
    @Generated
    @Selector("revertToContentsOfURL:completionHandler:")
    public native void revertToContentsOfURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_revertToContentsOfURLCompletionHandler") Block_revertToContentsOfURLCompletionHandler completionHandler);

    @Generated
    @IsOptional
    @Selector("savePresentedItemChangesWithCompletionHandler:")
    public native void savePresentedItemChangesWithCompletionHandler(
            @ObjCBlock(name = "call_savePresentedItemChangesWithCompletionHandler") NSFilePresenter.Block_savePresentedItemChangesWithCompletionHandler completionHandler);

    /**
     * Subclassing this method without calling super should be avoided. Subclassers  who don't call super must use NSFileCoordinator for coordinated writing themselves.
     * The default implementation of this method invokes [self contentsOfType:error:] synchronously on the calling queue, and then invokes [self writeContents:andAttributes:safelyToURL:ForSaveOperation:completionHandler:] on a background queue.
     * The completion handler is executed on the calling queue.
     */
    @Generated
    @Selector("saveToURL:forSaveOperation:completionHandler:")
    public native void saveToURLForSaveOperationCompletionHandler(NSURL url, @NInt long saveOperation,
            @ObjCBlock(name = "call_saveToURLForSaveOperationCompletionHandler") Block_saveToURLForSaveOperationCompletionHandler completionHandler);

    /**
     * The default implementation returns the current file type. saveToURL: will save to an extension based on this type so subclasses can override this to allow moving the document to a new type.
     */
    @Generated
    @Selector("savingFileType")
    public native String savingFileType();

    /**
     * The last known modification date of the document's on-disk representation. Updated by openWithCompletionHandler:, revertToContentsOfURL:, and saveToURL: and will return nil if none of these has completed successfully at least once.
     */
    @Generated
    @Selector("setFileModificationDate:")
    public native void setFileModificationDate(NSDate value);

    /**
     * The document's undo manager. Setting the undo manager also registers the document as an observer of various NSUndoManager notifications so that -updateChangeCount: is invoked as undoable changes are made to the document.
     * Asking for the undo manager creates a default one if one is not already set.
     * Typically, when a subclass sets the undoManager, it does not need to override -hasUnsavedChanges or call updateChangeCount: manually.
     */
    @Generated
    @Selector("setUndoManager:")
    public native void setUndoManager(NSUndoManager value);

    @Generated
    @Selector("setUserActivity:")
    public native void setUserActivity(NSUserActivity value);

    /**
     * The document's undo manager. Setting the undo manager also registers the document as an observer of various NSUndoManager notifications so that -updateChangeCount: is invoked as undoable changes are made to the document.
     * Asking for the undo manager creates a default one if one is not already set.
     * Typically, when a subclass sets the undoManager, it does not need to override -hasUnsavedChanges or call updateChangeCount: manually.
     */
    @Generated
    @Selector("undoManager")
    public native NSUndoManager undoManager();

    /**
     * Record the fact that a change affecting the value returned by -hasUnsavedChanges has occurred. Subclasses should not need to call this if they set the undoManager.
     */
    @Generated
    @Selector("updateChangeCount:")
    public native void updateChangeCount(@NInt long change);

    @Generated
    @Selector("updateChangeCountWithToken:forSaveOperation:")
    public native void updateChangeCountWithTokenForSaveOperation(
            @Mapped(ObjCObjectMapper.class) Object changeCountToken, @NInt long saveOperation);

    @Generated
    @Selector("updateUserActivityState:")
    public native void updateUserActivityState(NSUserActivity userActivity);

    @Generated
    @Selector("userActivity")
    public native NSUserActivity userActivity();

    /**
     * UIKit calls this method when it is no longer safe to proceed without immediately handling the error, such as when the app is being suspended.
     * Subclasses must immediately wrap up error handling (including dismissing any interactive UI) and call [self finishedHandlingError:] before returning.
     * It is only necessary to override this method if you override -handleError:userInteractionPermitted: without calling super
     */
    @Generated
    @Selector("userInteractionNoLongerPermittedForError:")
    public native void userInteractionNoLongerPermittedForError(NSError error);

    /**
     * This method is responsible for doing document writing in a way that minimizes the danger of leaving the disk to which writing is being done in an inconsistent state in the event of an application crash, system crash, hardware failure, power outage, etc.
     * Because it does several different things, and because the things are likely to change in future releases of iOS, it's probably not a good idea to override this method without invoking super.
     */
    @Generated
    @Selector("writeContents:andAttributes:safelyToURL:forSaveOperation:error:")
    public native boolean writeContentsAndAttributesSafelyToURLForSaveOperationError(
            @Mapped(ObjCObjectMapper.class) Object contents, NSDictionary<?, ?> additionalFileAttributes, NSURL url,
            @NInt long saveOperation, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Called by -writeContents:andAttributes:safelyToURL:forSaveOperation:error: to write the data to disk. Override point for subclasses that need access to the on-disk representation of the document while saving.
     */
    @Generated
    @Selector("writeContents:toURL:forSaveOperation:originalContentsURL:error:")
    public native boolean writeContentsToURLForSaveOperationOriginalContentsURLError(
            @Mapped(ObjCObjectMapper.class) Object contents, NSURL url, @NInt long saveOperation,
            NSURL originalContentsURL, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_autosaveWithCompletionHandler {
        @Generated
        void call_autosaveWithCompletionHandler(boolean success);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_closeWithCompletionHandler {
        @Generated
        void call_closeWithCompletionHandler(boolean success);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openWithCompletionHandler {
        @Generated
        void call_openWithCompletionHandler(boolean success);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performAsynchronousFileAccessUsingBlock {
        @Generated
        void call_performAsynchronousFileAccessUsingBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_revertToContentsOfURLCompletionHandler {
        @Generated
        void call_revertToContentsOfURLCompletionHandler(boolean success);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveToURLForSaveOperationCompletionHandler {
        @Generated
        void call_saveToURLForSaveOperationCompletionHandler(boolean success);
    }

    @Generated
    @IsOptional
    @Selector("observedPresentedItemUbiquityAttributes")
    public native NSSet<String> observedPresentedItemUbiquityAttributes();

    @Generated
    @IsOptional
    @Selector("presentedItemDidChangeUbiquityAttributes:")
    public native void presentedItemDidChangeUbiquityAttributes(NSSet<String> attributes);

    @Generated
    @IsOptional
    @Selector("relinquishPresentedItemToReader:")
    public native void relinquishPresentedItemToReader(
            @ObjCBlock(name = "call_relinquishPresentedItemToReader") NSFilePresenter.Block_relinquishPresentedItemToReader reader);

    @Generated
    @IsOptional
    @Selector("relinquishPresentedItemToWriter:")
    public native void relinquishPresentedItemToWriter(
            @ObjCBlock(name = "call_relinquishPresentedItemToWriter") NSFilePresenter.Block_relinquishPresentedItemToWriter writer);
}
