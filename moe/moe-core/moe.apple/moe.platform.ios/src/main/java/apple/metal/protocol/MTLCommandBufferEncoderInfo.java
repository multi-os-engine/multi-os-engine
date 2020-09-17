package apple.metal.protocol;

import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandBufferEncoderInfo")
public interface MTLCommandBufferEncoderInfo {
    @Generated
    @Selector("debugSignposts")
    NSArray<String> debugSignposts();

    @Generated
    @Selector("errorState")
    @NInt
    long errorState();

    @Generated
    @Selector("label")
    String label();
}