package apple.scenekit.protocol;

import apple.scenekit.SCNAvoidOccluderConstraint;
import apple.scenekit.SCNNode;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 11.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNAvoidOccluderConstraintDelegate")
public interface SCNAvoidOccluderConstraintDelegate {
    @Generated
    @IsOptional
    @Selector("avoidOccluderConstraint:didAvoidOccluder:forNode:")
    default void avoidOccluderConstraintDidAvoidOccluderForNode(@NotNull SCNAvoidOccluderConstraint constraint,
            @NotNull SCNNode occluder, @NotNull SCNNode node) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("avoidOccluderConstraint:shouldAvoidOccluder:forNode:")
    default boolean avoidOccluderConstraintShouldAvoidOccluderForNode(@NotNull SCNAvoidOccluderConstraint constraint,
            @NotNull SCNNode occluder, @NotNull SCNNode node) {
        throw new java.lang.UnsupportedOperationException();
    }
}