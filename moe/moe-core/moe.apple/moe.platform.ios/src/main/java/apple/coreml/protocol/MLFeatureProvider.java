package apple.coreml.protocol;

import apple.coreml.MLFeatureValue;
import apple.foundation.NSSet;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol for accessing a feature value for a feature name
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MLFeatureProvider")
public interface MLFeatureProvider {
    @Generated
    @Selector("featureNames")
    NSSet<String> featureNames();

    /**
     * Returns nil if the provided featureName is not in the set of featureNames
     */
    @Generated
    @Selector("featureValueForName:")
    MLFeatureValue featureValueForName(String featureName);
}