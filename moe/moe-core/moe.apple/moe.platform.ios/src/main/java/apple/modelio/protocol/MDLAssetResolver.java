package apple.modelio.protocol;

import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLAssetResolver")
public interface MDLAssetResolver {
    @Generated
    @Selector("canResolveAssetNamed:")
    boolean canResolveAssetNamed(String name);

    @Generated
    @Selector("resolveAssetNamed:")
    NSURL resolveAssetNamed(String name);
}