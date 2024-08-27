package apple.accessibility.protocol;

import apple.accessibility.AXChartDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * Chart or graph container elements may adopt this protocol to enable Audio Graph support.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AXChart")
public interface AXChart {
    @Nullable
    @Generated
    @Selector("accessibilityChartDescriptor")
    AXChartDescriptor accessibilityChartDescriptor();

    @Generated
    @Selector("setAccessibilityChartDescriptor:")
    void setAccessibilityChartDescriptor(@Nullable AXChartDescriptor value);
}
