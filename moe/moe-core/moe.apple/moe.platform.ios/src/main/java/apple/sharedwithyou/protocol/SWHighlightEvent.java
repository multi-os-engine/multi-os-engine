package apple.sharedwithyou.protocol;

import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] SWHighlightEvent
 * 
 * A protocol defining an activity that can be posted in response to a user action on some content.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SharedWithYou")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SWHighlightEvent")
public interface SWHighlightEvent extends NSSecureCoding, NSCopying {
    @Generated
    @Selector("highlightURL")
    NSURL highlightURL();
}