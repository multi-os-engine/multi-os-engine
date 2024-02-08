package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UILetterformAwareAdjusting")
public interface UILetterformAwareAdjusting {
    /**
     * `sizingRule` defaults to `UILetterformAwareSizingRuleTypographic` and determines what rule is used during the
     * calculation of `-sizeThatFits:` and `-intrinsicContentSize`
     */
    @Generated
    @Selector("setSizingRule:")
    void setSizingRule(@NInt long value);

    /**
     * `sizingRule` defaults to `UILetterformAwareSizingRuleTypographic` and determines what rule is used during the
     * calculation of `-sizeThatFits:` and `-intrinsicContentSize`
     */
    @Generated
    @Selector("sizingRule")
    @NInt
    long sizingRule();
}