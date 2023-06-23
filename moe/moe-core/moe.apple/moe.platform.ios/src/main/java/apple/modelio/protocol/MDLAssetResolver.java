package apple.modelio.protocol;

import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 11.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLAssetResolver")
public interface MDLAssetResolver {
    @Generated
    @Selector("canResolveAssetNamed:")
    boolean canResolveAssetNamed(@NotNull String name);

    @NotNull
    @Generated
    @Selector("resolveAssetNamed:")
    NSURL resolveAssetNamed(@NotNull String name);
}