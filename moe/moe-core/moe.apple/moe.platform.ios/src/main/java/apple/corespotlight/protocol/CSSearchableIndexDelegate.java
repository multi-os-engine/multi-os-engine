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

package apple.corespotlight.protocol;

import apple.corespotlight.CSSearchableIndex;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreSpotlight")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CSSearchableIndexDelegate")
public interface CSSearchableIndexDelegate {
    @Generated
    @Selector("searchableIndex:reindexAllSearchableItemsWithAcknowledgementHandler:")
    void searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler(CSSearchableIndex searchableIndex,
            @ObjCBlock(name = "call_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler") Block_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler acknowledgementHandler);

    @Generated
    @Selector("searchableIndex:reindexSearchableItemsWithIdentifiers:acknowledgementHandler:")
    void searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler(CSSearchableIndex searchableIndex,
            NSArray<String> identifiers,
            @ObjCBlock(name = "call_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler") Block_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler acknowledgementHandler);

    @Generated
    @IsOptional
    @Selector("searchableIndexDidFinishThrottle:")
    default void searchableIndexDidFinishThrottle(CSSearchableIndex searchableIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("searchableIndexDidThrottle:")
    default void searchableIndexDidThrottle(CSSearchableIndex searchableIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler {
        @Generated
        void call_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler {
        @Generated
        void call_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler();
    }

    @Generated
    @IsOptional
    @Selector("dataForSearchableIndex:itemIdentifier:typeIdentifier:error:")
    default NSData dataForSearchableIndexItemIdentifierTypeIdentifierError(CSSearchableIndex searchableIndex,
            String itemIdentifier, String typeIdentifier, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("fileURLForSearchableIndex:itemIdentifier:typeIdentifier:inPlace:error:")
    default NSURL fileURLForSearchableIndexItemIdentifierTypeIdentifierInPlaceError(CSSearchableIndex searchableIndex,
            String itemIdentifier, String typeIdentifier, boolean inPlace,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        throw new java.lang.UnsupportedOperationException();
    }
}
