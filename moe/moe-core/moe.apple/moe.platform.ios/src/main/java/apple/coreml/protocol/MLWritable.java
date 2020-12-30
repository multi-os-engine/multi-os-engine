package apple.coreml.protocol;

import apple.foundation.NSError;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MLWritable")
public interface MLWritable {
    /**
     * Writes the model to disk and returns YES if the write is successful.
     */
    @Generated
    @Selector("writeToURL:error:")
    boolean writeToURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}