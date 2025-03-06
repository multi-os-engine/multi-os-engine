package apple.localauthentication.protocol;

import apple.localauthentication.LAEnvironment;
import apple.localauthentication.LAEnvironmentState;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.0
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("LAEnvironmentObserver")
public interface LAEnvironmentObserver {
    /**
     * Called when there has been a change in the environment.
     * 
     * Invoked on a queue private to LocalAuthentication framework. At the moment of invocation of this method,
     * [@c] LAEnvironment.state already contains the new updated state.
     * 
     * @param oldState The old environment state (before update)
     * 
     *                 API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("environment:stateDidChangeFromOldState:")
    default void environmentStateDidChangeFromOldState(@NotNull LAEnvironment environment,
            @NotNull LAEnvironmentState oldState) {
        throw new java.lang.UnsupportedOperationException();
    }
}