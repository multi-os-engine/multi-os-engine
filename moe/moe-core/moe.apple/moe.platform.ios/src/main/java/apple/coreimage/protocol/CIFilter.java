package apple.coreimage.protocol;

import apple.coreimage.CIImage;
import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CIFilter")
public interface CIFilter {
    /**
     * CIFilter subclasses can implement 'customAttributes' to return a dictionary
     * containing key/value pairs describing the filter. (see description of keys below)
     */
    @Generated
    @IsOptional
    @Selector("customAttributes")
    @ProtocolClassMethod("customAttributes")
    default NSDictionary<String, ?> _customAttributes() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("outputImage")
    CIImage outputImage();
}