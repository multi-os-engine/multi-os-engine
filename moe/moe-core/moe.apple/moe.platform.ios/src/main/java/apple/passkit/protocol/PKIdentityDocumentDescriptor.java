package apple.passkit.protocol;

import apple.foundation.NSArray;
import apple.passkit.PKIdentityElement;
import apple.passkit.PKIdentityIntentToStore;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * "Descriptor" objects describe types of documents that can be requested. Different document
 * types may have different sets of supported elements, functionality, or response formats.
 * Clients should not define their own implementations of this protocol or subclass existing implementations.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKIdentityDocumentDescriptor")
public interface PKIdentityDocumentDescriptor {
    /**
     * Adds the set of elements and associates them with the intent to store. This method can be
     * called multple times with the same intent to store to append additional elements. If the same
     * element is specified multiple times with different intents to store, the most recent one wins.
     */
    @Generated
    @Selector("addElements:withIntentToStore:")
    void addElementsWithIntentToStore(NSArray<? extends PKIdentityElement> elements,
            PKIdentityIntentToStore intentToStore);

    /**
     * Set of elements that will be requested from the document.
     */
    @Generated
    @Selector("elements")
    NSArray<? extends PKIdentityElement> elements();

    /**
     * Intent to store for the given element, or nil if the element has not been added to this descriptor.
     */
    @Generated
    @Selector("intentToStoreForElement:")
    PKIdentityIntentToStore intentToStoreForElement(PKIdentityElement element);
}