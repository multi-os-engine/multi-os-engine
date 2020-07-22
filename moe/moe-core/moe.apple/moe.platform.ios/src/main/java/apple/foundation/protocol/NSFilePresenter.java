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

package apple.foundation.protocol;

import apple.foundation.NSError;
import apple.foundation.NSFileVersion;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFilePresenter")
public interface NSFilePresenter {
    @Generated
    @IsOptional
    @Selector("accommodatePresentedItemDeletionWithCompletionHandler:")
    default void accommodatePresentedItemDeletionWithCompletionHandler(
            @ObjCBlock(name = "call_accommodatePresentedItemDeletionWithCompletionHandler") Block_accommodatePresentedItemDeletionWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    default void accommodatePresentedSubitemDeletionAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_accommodatePresentedSubitemDeletionAtURLCompletionHandler") Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedItemDidChange")
    default void presentedItemDidChange() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedItemDidGainVersion:")
    default void presentedItemDidGainVersion(NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedItemDidLoseVersion:")
    default void presentedItemDidLoseVersion(NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedItemDidMoveToURL:")
    default void presentedItemDidMoveToURL(NSURL newURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedItemDidResolveConflictVersion:")
    default void presentedItemDidResolveConflictVersion(NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("presentedItemOperationQueue")
    NSOperationQueue presentedItemOperationQueue();

    @Generated
    @Selector("presentedItemURL")
    NSURL presentedItemURL();

    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didGainVersion:")
    default void presentedSubitemAtURLDidGainVersion(NSURL url, NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didLoseVersion:")
    default void presentedSubitemAtURLDidLoseVersion(NSURL url, NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didMoveToURL:")
    default void presentedSubitemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didResolveConflictVersion:")
    default void presentedSubitemAtURLDidResolveConflictVersion(NSURL url, NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedSubitemDidAppearAtURL:")
    default void presentedSubitemDidAppearAtURL(NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedSubitemDidChangeAtURL:")
    default void presentedSubitemDidChangeAtURL(NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("savePresentedItemChangesWithCompletionHandler:")
    default void savePresentedItemChangesWithCompletionHandler(
            @ObjCBlock(name = "call_savePresentedItemChangesWithCompletionHandler") Block_savePresentedItemChangesWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accommodatePresentedItemDeletionWithCompletionHandler {
        @Generated
        void call_accommodatePresentedItemDeletionWithCompletionHandler(NSError errorOrNil);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler {
        @Generated
        void call_accommodatePresentedSubitemDeletionAtURLCompletionHandler(NSError errorOrNil);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_savePresentedItemChangesWithCompletionHandler {
        @Generated
        void call_savePresentedItemChangesWithCompletionHandler(NSError errorOrNil);
    }

    @Generated
    @IsOptional
    @Selector("observedPresentedItemUbiquityAttributes")
    default NSSet<String> observedPresentedItemUbiquityAttributes() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentedItemDidChangeUbiquityAttributes:")
    default void presentedItemDidChangeUbiquityAttributes(NSSet<String> attributes) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("relinquishPresentedItemToReader:")
    default void relinquishPresentedItemToReader(
            @ObjCBlock(name = "call_relinquishPresentedItemToReader") Block_relinquishPresentedItemToReader reader) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_relinquishPresentedItemToReader {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_relinquishPresentedItemToReader {
            @Generated
            void call_Block_relinquishPresentedItemToReader();
        }

        @Generated
        void call_relinquishPresentedItemToReader(
                @ObjCBlock(name = "call_Block_relinquishPresentedItemToReader") Block_Block_relinquishPresentedItemToReader reacquirer);
    }

    @Generated
    @IsOptional
    @Selector("relinquishPresentedItemToWriter:")
    default void relinquishPresentedItemToWriter(
            @ObjCBlock(name = "call_relinquishPresentedItemToWriter") Block_relinquishPresentedItemToWriter writer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_relinquishPresentedItemToWriter {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_relinquishPresentedItemToWriter {
            @Generated
            void call_Block_relinquishPresentedItemToWriter();
        }

        @Generated
        void call_relinquishPresentedItemToWriter(
                @ObjCBlock(name = "call_Block_relinquishPresentedItemToWriter") Block_Block_relinquishPresentedItemToWriter reacquirer);
    }
}
