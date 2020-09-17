package apple.gamecontroller.protocol;

import apple.NSObject;
import apple.gamecontroller.GCPhysicalInputProfile;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCDevice")
public interface GCDevice {
    @Generated
    @Selector("handlerQueue")
    NSObject handlerQueue();

    @Generated
    @Selector("physicalInputProfile")
    GCPhysicalInputProfile physicalInputProfile();

    @Generated
    @Selector("productCategory")
    String productCategory();

    @Generated
    @Selector("setHandlerQueue:")
    void setHandlerQueue(NSObject value);

    @Generated
    @Selector("vendorName")
    String vendorName();
}