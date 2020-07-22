package apple.vision.protocol;

import apple.foundation.NSError;
import apple.vision.VNRequest;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VNRequestProgressProviding")
public interface VNRequestProgressProviding {
    @Generated
    @Selector("indeterminate")
    boolean indeterminate();

    @Generated
    @Selector("progressHandler")
    @ObjCBlock(name = "call_progressHandler_ret")
    Block_progressHandler_ret progressHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_progressHandler_ret {
        @Generated
        void call_progressHandler_ret(VNRequest request, double fractionCompleted, NSError error);
    }

    @Generated
    @Selector("setProgressHandler:")
    void setProgressHandler(@ObjCBlock(name = "call_setProgressHandler") Block_setProgressHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProgressHandler {
        @Generated
        void call_setProgressHandler(VNRequest request, double fractionCompleted, NSError error);
    }
}