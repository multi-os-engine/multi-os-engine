package apple.foundation.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

/**
 * This protocol allows a class to be constructed from a variety of binary representations.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSItemProviderReading")
public interface NSItemProviderReading {
    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    NSItemProviderReading _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    NSArray<String> _readableTypeIdentifiersForItemProvider();
}
