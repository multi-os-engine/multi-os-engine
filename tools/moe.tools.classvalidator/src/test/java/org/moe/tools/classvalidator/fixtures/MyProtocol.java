package org.moe.tools.classvalidator.fixtures;

import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Test fixture: an interface annotated as an Objective-C protocol.
 * Used by ProtocolCollectorTest.
 */
@ObjCProtocolName("MyProtocol")
public interface MyProtocol {
    @Selector("hello")
    void hello();
}
