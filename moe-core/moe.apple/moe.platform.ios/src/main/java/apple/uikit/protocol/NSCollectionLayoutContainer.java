package apple.uikit.protocol;

import apple.uikit.struct.NSDirectionalEdgeInsets;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSCollectionLayoutContainer")
public interface NSCollectionLayoutContainer {
    /**
     * values < 1.0 are interpreted as fractional values (e.g. leading:0.15 == 15% width)
     */
    @Generated
    @Selector("contentInsets")
    @ByValue
    NSDirectionalEdgeInsets contentInsets();

    /**
     * resolved size of container (before any insets are applied)
     */
    @Generated
    @Selector("contentSize")
    @ByValue
    CGSize contentSize();

    /**
     * resolved value after resolving any unit values
     */
    @Generated
    @Selector("effectiveContentInsets")
    @ByValue
    NSDirectionalEdgeInsets effectiveContentInsets();

    /**
     * after insets are applied
     */
    @Generated
    @Selector("effectiveContentSize")
    @ByValue
    CGSize effectiveContentSize();
}