package org.moe.tools.classvalidator.fixtures;

/**
 * Test fixture: an interface that is NOT an Objective-C protocol
 * (no @ObjCProtocolName). Used by ProtocolCollectorTest as a negative case.
 */
public interface PlainInterface {
    void plain();
}
