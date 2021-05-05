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

/**
 * An application that is long running should provide a CSSearchableIndexDelegate conforming object to handle communication from the index.
 * Alternatively, an app can provide an extension whose request handler conforms to this protocol and the extension will be called if the app isn't running.
 */
@Generated
@Library("CoreSpotlight")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CSSearchableIndexDelegate")
public interface CSSearchableIndexDelegate {
    /**
     * The index requests that the delegate should reindex all of its searchable data and clear any local state that it might have persisted because the index has been lost.
     * The app or extension should call indexSearchableItems on the passed in CSSearchableIndex.
     * The app or extension must call the acknowledgement handler once any client state information has been persisted, that way, in case of a crash, the indexer can call this again.
     * If the app passes clientState information in a batch, the acknowledgement can be called right away.
     * The passed in index shouldn't be used in an extension if a custom protection class is needed.
     */
    @Generated
    @Selector("searchableIndex:reindexAllSearchableItemsWithAcknowledgementHandler:")
    void searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler(CSSearchableIndex searchableIndex,
            @ObjCBlock(name = "call_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler") Block_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler acknowledgementHandler);

    /**
     * The index requests that the delegate should reindex the searchable data with the provided identifiers.
     * The app or extension should call indexSearchableItems:completionHandler on the passed in index CSSearchableIndex to update the items' states.
     * The app or extension must call the acknowledgement handler once any client state information has been persisted, that way, in case of a crash, the indexer can call this again.
     * If the app passes clientState information in a batch, the acknowledgement can be called right away.
     * The passed in index shouldn't be used in an extension if a custom protection class is needed.
     */
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

    /**
     * When on battery power, it is possible for indexing to slowed down to prevent battery drain.
     * The developer may want to optionally implement these methods to receive notice that indexing is being throttled and react accordingly (e.g. by priortizing indexing of more important content).
     */
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

    /**
     * The developer may provided a NSData representation if type was specified in providerDataTypeIdentifiers property.
     */
    @Generated
    @IsOptional
    @Selector("dataForSearchableIndex:itemIdentifier:typeIdentifier:error:")
    default NSData dataForSearchableIndexItemIdentifierTypeIdentifierError(CSSearchableIndex searchableIndex,
            String itemIdentifier, String typeIdentifier, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The developer may provided a NSURL to file representation representation if type was specified from providerDataTypeIdentifiers or providerInPlaceFileTypeIdentifiers property.
     */
    @Generated
    @IsOptional
    @Selector("fileURLForSearchableIndex:itemIdentifier:typeIdentifier:inPlace:error:")
    default NSURL fileURLForSearchableIndexItemIdentifierTypeIdentifierInPlaceError(CSSearchableIndex searchableIndex,
            String itemIdentifier, String typeIdentifier, boolean inPlace,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        throw new java.lang.UnsupportedOperationException();
    }
}
