package apple.uikit.protocol;

import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;

/**
 * A hover effect that can be applied to a `UIView` via a `UIHoverStyle`.
 * You don't conform to this protocol directly. Instead, you use a built-in
 * `UIHoverEffect` like `UIHoverAutomaticEffect`.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIHoverEffect")
public interface UIHoverEffect extends NSCopying {
}