package apple.classkit.protocol;

import apple.classkit.CLSContext;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ClassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CLSDataStoreDelegate")
public interface CLSDataStoreDelegate {
    /**
     * Implement to return a new context with the supplied identifier as a child of the parent context.
     * <p>
     * This method is invoked for missing contexts in: @code -[CLSDataStore
     * contextsMatchingIdentifierPath:completion:] @endcode and @code -[CLSContext
     * descendantMatchingIdentifierPath:completion:] @endcode
     * It will be called successively for each identifier in the path that is not found. This helps centralize context
     * creation in one place.
     * [@note] New contexts returned in this method are automatically saved.
     *
     * @param identifier           Identifier for the new context.
     * @param parentContext        Parent of the new context.
     * @param parentIdentifierPath Ordered list of identifiers leading to the parent context.
     * @return The new context for the supplied identifier. The new context is automatically saved.
     */
    @Generated
    @Selector("createContextForIdentifier:parentContext:parentIdentifierPath:")
    CLSContext createContextForIdentifierParentContextParentIdentifierPath(String identifier, CLSContext parentContext,
            NSArray<String> parentIdentifierPath);
}
