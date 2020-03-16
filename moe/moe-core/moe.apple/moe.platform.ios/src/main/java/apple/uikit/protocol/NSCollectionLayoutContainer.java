package apple.uikit.protocol;

import apple.coregraphics.struct.CGSize;
import apple.uikit.struct.NSDirectionalEdgeInsets;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSCollectionLayoutContainer")
public interface NSCollectionLayoutContainer {
    @Generated
    @Selector("contentInsets")
    @ByValue
    NSDirectionalEdgeInsets contentInsets();

    @Generated
    @Selector("contentSize")
    @ByValue
    CGSize contentSize();

    @Generated
    @Selector("effectiveContentInsets")
    @ByValue
    NSDirectionalEdgeInsets effectiveContentInsets();

    @Generated
    @Selector("effectiveContentSize")
    @ByValue
    CGSize effectiveContentSize();
}