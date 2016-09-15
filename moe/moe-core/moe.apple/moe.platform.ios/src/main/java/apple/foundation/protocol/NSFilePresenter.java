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
    /**
     * accommodatePresentedItemDeletionWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/accommodatePresentedItemDeletionWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accommodatePresentedItemDeletionWithCompletionHandler:")
    default void accommodatePresentedItemDeletionWithCompletionHandler(
            @ObjCBlock(name = "call_accommodatePresentedItemDeletionWithCompletionHandler") Block_accommodatePresentedItemDeletionWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accommodatePresentedItemDeletionWithCompletionHandler {
        @Generated
        void call_accommodatePresentedItemDeletionWithCompletionHandler(NSError arg0);
    }

    /**
     * accommodatePresentedSubitemDeletionAtURL:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/accommodatePresentedSubitemDeletionAtURL:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    default void accommodatePresentedSubitemDeletionAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_accommodatePresentedSubitemDeletionAtURLCompletionHandler") Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler {
        @Generated
        void call_accommodatePresentedSubitemDeletionAtURLCompletionHandler(NSError arg0);
    }

    /**
     * presentedItemDidChange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedItemDidChange">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedItemDidChange")
    default void presentedItemDidChange() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedItemDidGainVersion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedItemDidGainVersion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedItemDidGainVersion:")
    default void presentedItemDidGainVersion(NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedItemDidLoseVersion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedItemDidLoseVersion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedItemDidLoseVersion:")
    default void presentedItemDidLoseVersion(NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedItemDidMoveToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedItemDidMoveToURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedItemDidMoveToURL:")
    default void presentedItemDidMoveToURL(NSURL newURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedItemDidResolveConflictVersion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedItemDidResolveConflictVersion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedItemDidResolveConflictVersion:")
    default void presentedItemDidResolveConflictVersion(NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedItemOperationQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfp/NSFilePresenter/presentedItemOperationQueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentedItemOperationQueue")
    NSOperationQueue presentedItemOperationQueue();

    /**
     * presentedItemURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfp/NSFilePresenter/presentedItemURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentedItemURL")
    NSURL presentedItemURL();

    /**
     * presentedSubitemAtURL:didGainVersion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedSubitemAtURL:didGainVersion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didGainVersion:")
    default void presentedSubitemAtURLDidGainVersion(NSURL url, NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedSubitemAtURL:didLoseVersion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedSubitemAtURL:didLoseVersion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didLoseVersion:")
    default void presentedSubitemAtURLDidLoseVersion(NSURL url, NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedSubitemAtURL:didMoveToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedSubitemAtURL:didMoveToURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didMoveToURL:")
    default void presentedSubitemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedSubitemAtURL:didResolveConflictVersion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedSubitemAtURL:didResolveConflictVersion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedSubitemAtURL:didResolveConflictVersion:")
    default void presentedSubitemAtURLDidResolveConflictVersion(NSURL url, NSFileVersion version) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedSubitemDidAppearAtURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedSubitemDidAppearAtURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedSubitemDidAppearAtURL:")
    default void presentedSubitemDidAppearAtURL(NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentedSubitemDidChangeAtURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/presentedSubitemDidChangeAtURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentedSubitemDidChangeAtURL:")
    default void presentedSubitemDidChangeAtURL(NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * savePresentedItemChangesWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFilePresenter_protocol/index.html#//apple_ref/occ/intfm/NSFilePresenter/savePresentedItemChangesWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("savePresentedItemChangesWithCompletionHandler:")
    default void savePresentedItemChangesWithCompletionHandler(
            @ObjCBlock(name = "call_savePresentedItemChangesWithCompletionHandler") Block_savePresentedItemChangesWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_savePresentedItemChangesWithCompletionHandler {
        @Generated
        void call_savePresentedItemChangesWithCompletionHandler(NSError arg0);
    }
}
