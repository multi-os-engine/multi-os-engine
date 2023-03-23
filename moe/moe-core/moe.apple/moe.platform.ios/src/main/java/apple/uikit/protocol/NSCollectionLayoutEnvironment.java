package apple.uikit.protocol;

import apple.uikit.UITraitCollection;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSCollectionLayoutEnvironment")
public interface NSCollectionLayoutEnvironment {
    @Generated
    @Selector("container")
    @MappedReturn(ObjCObjectMapper.class)
    NSCollectionLayoutContainer container();

    @Generated
    @Selector("traitCollection")
    UITraitCollection traitCollection();
}