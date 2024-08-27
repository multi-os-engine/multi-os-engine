package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Background
 * 
 * When fonts created with `+[UIFont preferredFontForTextStyle:]` are used, UILabel, UITextField, and nonscrollable
 * UITextView will increase the height calculated in `-sizeThatFits:` and `-intrinsicContentSize` in the presence
 * of tall scripts.
 * 
 * Even with this increase, there will be some extreme ascenders and descenders that extend beyond this height.
 * 
 * Furthermore, this increase only occurs for the text-style fonts, so for non-text-style fonts such cases will be
 * markedly more common.
 * 
 * API-Since: 17.0
 */
@Generated
public final class UILetterformAwareSizingRule {
    @Generated
    private UILetterformAwareSizingRule() {
    }

    /**
     * `UILetterformAwareSizingRuleTypographic`: `-sizeThatFits:` and `-intrinsicContentSize` results will work well for
     * typographic alignment of edges and centers of the view frames, but extreme ascenders or descenders in tall
     * scripts may not be accounted for
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Typographic = 0x0000000000000000L;
    /**
     * `UILetterformAwareSizingRuleOversize`: `-sizeThatFits:` and `-intrinsicContentSize` results will account for
     * extreme ascenders or descenders in tall scripts, but in such cases might not work well for typographic alignment
     * of top and bottom edges and vertical centers of the view frames
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Oversize = 0x0000000000000001L;
}