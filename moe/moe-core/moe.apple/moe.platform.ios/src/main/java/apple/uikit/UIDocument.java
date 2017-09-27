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
public class UIDocument extends NSObject implements NSFilePresenter, NSProgressReporting {
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
    @IsOptional
    @Selector("accommodatePresentedItemDeletionWithCompletionHandler:")
    public native void accommodatePresentedItemDeletionWithCompletionHandler(
            @ObjCBlock(name = "call_accommodatePresentedItemDeletionWithCompletionHandler") NSFilePresenter.Block_accommodatePresentedItemDeletionWithCompletionHandler completionHandler);

    @Generated
    @IsOptional
    @Selector("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    public native void accommodatePresentedSubitemDeletionAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_accommodatePresentedSubitemDeletionAtURLCompletionHandler") NSFilePresenter.Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler completionHandler);

    @Generated
    @Selector("autosaveWithCompletionHandler:")
    public native void autosaveWithCompletionHandler(
            @ObjCBlock(name = "call_autosaveWithCompletionHandler") Block_autosaveWithCompletionHandler completionHandler);

    @Generated
    @Selector("changeCountTokenForSaveOperation:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object changeCountTokenForSaveOperation(@NInt long saveOperation);

    @Generated
    @Selector("closeWithCompletionHandler:")
    public native void closeWithCompletionHandler(
            @ObjCBlock(name = "call_closeWithCompletionHandler") Block_closeWithCompletionHandler completionHandler);

    @Generated
    @Selector("contentsForType:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contentsForTypeError(String typeName,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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

    @Generated
    @Selector("fileAttributesToWriteToURL:forSaveOperation:error:")
    public native NSDictionary<?, ?> fileAttributesToWriteToURLForSaveOperationError(NSURL url,
            @NInt long saveOperation, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("fileModificationDate")
    public native NSDate fileModificationDate();

    @Generated
    @Selector("fileNameExtensionForType:saveOperation:")
    public native String fileNameExtensionForTypeSaveOperation(String typeName, @NInt long saveOperation);

    @Generated
    @Selector("fileType")
    public native String fileType();

    @Generated
    @Selector("fileURL")
    public native NSURL fileURL();

    @Generated
    @Selector("finishedHandlingError:recovered:")
    public native void finishedHandlingErrorRecovered(NSError error, boolean recovered);

    @Generated
    @Selector("handleError:userInteractionPermitted:")
    public native void handleErrorUserInteractionPermitted(NSError error, boolean userInteractionPermitted);

    @Generated
    @Selector("hasUnsavedChanges")
    public native boolean hasUnsavedChanges();

    @Generated
    @Selector("init")
    public native UIDocument init();

    @Generated
    @Selector("initWithFileURL:")
    public native UIDocument initWithFileURL(NSURL url);

    @Generated
    @Selector("loadFromContents:ofType:error:")
    public native boolean loadFromContentsOfTypeError(@Mapped(ObjCObjectMapper.class) Object contents, String typeName,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("localizedName")
    public native String localizedName();

    @Generated
    @Selector("openWithCompletionHandler:")
    public native void openWithCompletionHandler(
            @ObjCBlock(name = "call_openWithCompletionHandler") Block_openWithCompletionHandler completionHandler);

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

    @Generated
    @Selector("readFromURL:error:")
    public native boolean readFromURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("restoreUserActivityState:")
    public native void restoreUserActivityState(NSUserActivity userActivity);

    @Generated
    @Selector("revertToContentsOfURL:completionHandler:")
    public native void revertToContentsOfURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_revertToContentsOfURLCompletionHandler") Block_revertToContentsOfURLCompletionHandler completionHandler);

    @Generated
    @IsOptional
    @Selector("savePresentedItemChangesWithCompletionHandler:")
    public native void savePresentedItemChangesWithCompletionHandler(
            @ObjCBlock(name = "call_savePresentedItemChangesWithCompletionHandler") NSFilePresenter.Block_savePresentedItemChangesWithCompletionHandler completionHandler);

    @Generated
    @Selector("saveToURL:forSaveOperation:completionHandler:")
    public native void saveToURLForSaveOperationCompletionHandler(NSURL url, @NInt long saveOperation,
            @ObjCBlock(name = "call_saveToURLForSaveOperationCompletionHandler") Block_saveToURLForSaveOperationCompletionHandler completionHandler);

    @Generated
    @Selector("savingFileType")
    public native String savingFileType();

    @Generated
    @Selector("setFileModificationDate:")
    public native void setFileModificationDate(NSDate value);

    @Generated
    @Selector("setUndoManager:")
    public native void setUndoManager(NSUndoManager value);

    @Generated
    @Selector("setUserActivity:")
    public native void setUserActivity(NSUserActivity value);

    @Generated
    @Selector("undoManager")
    public native NSUndoManager undoManager();

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

    @Generated
    @Selector("userInteractionNoLongerPermittedForError:")
    public native void userInteractionNoLongerPermittedForError(NSError error);

    @Generated
    @Selector("writeContents:andAttributes:safelyToURL:forSaveOperation:error:")
    public native boolean writeContentsAndAttributesSafelyToURLForSaveOperationError(
            @Mapped(ObjCObjectMapper.class) Object contents, NSDictionary<?, ?> additionalFileAttributes, NSURL url,
            @NInt long saveOperation, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("writeContents:toURL:forSaveOperation:originalContentsURL:error:")
    public native boolean writeContentsToURLForSaveOperationOriginalContentsURLError(
            @Mapped(ObjCObjectMapper.class) Object contents, NSURL url, @NInt long saveOperation,
            NSURL originalContentsURL, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_autosaveWithCompletionHandler {
        @Generated
        void call_autosaveWithCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_closeWithCompletionHandler {
        @Generated
        void call_closeWithCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openWithCompletionHandler {
        @Generated
        void call_openWithCompletionHandler(boolean arg0);
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
        void call_revertToContentsOfURLCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveToURLForSaveOperationCompletionHandler {
        @Generated
        void call_saveToURLForSaveOperationCompletionHandler(boolean arg0);
    }

    @Generated
    @IsOptional
    @Selector("observedPresentedItemUbiquityAttributes")
    public native NSSet<String> observedPresentedItemUbiquityAttributes();

    @Generated
    @IsOptional
    @Selector("presentedItemDidChangeUbiquityAttributes:")
    public native void presentedItemDidChangeUbiquityAttributes(NSSet<String> attributes);
}
