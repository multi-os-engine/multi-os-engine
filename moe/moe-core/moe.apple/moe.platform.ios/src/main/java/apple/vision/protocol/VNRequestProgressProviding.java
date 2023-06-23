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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VNRequestProgressProviding")
public interface VNRequestProgressProviding {
    /**
     * If a request cannot determine its progress in fractions completed, this property will be set.
     * 
     * If this is set, it doesn't mean that the request will run forever just that the nature of the request is not
     * broken down into identifiable fractions on which progress can be reported in increments. The progressHandler will
     * nonetheless be called at suitable intervals.
     */
    @Generated
    @Selector("indeterminate")
    boolean indeterminate();

    /**
     * Requests that support the VNRequestProgressProviding protocol would periodically call the progressHandler to
     * report progress on longer running tasks.
     * 
     * The progessHandler is optional allowing clients of the request to report progress to the user and/or display or
     * process partial results when they become available. Note that the progressHandler can be called on a different
     * dispatch queue than what the request was initiated from.
     */
    @NotNull
    @Generated
    @Selector("progressHandler")
    @ObjCBlock(name = "call_progressHandler_ret")
    Block_progressHandler_ret progressHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_progressHandler_ret {
        @Generated
        void call_progressHandler_ret(@NotNull VNRequest request, double fractionCompleted, @Nullable NSError error);
    }

    /**
     * Requests that support the VNRequestProgressProviding protocol would periodically call the progressHandler to
     * report progress on longer running tasks.
     * 
     * The progessHandler is optional allowing clients of the request to report progress to the user and/or display or
     * process partial results when they become available. Note that the progressHandler can be called on a different
     * dispatch queue than what the request was initiated from.
     */
    @Generated
    @Selector("setProgressHandler:")
    void setProgressHandler(@NotNull @ObjCBlock(name = "call_setProgressHandler") Block_setProgressHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProgressHandler {
        @Generated
        void call_setProgressHandler(@NotNull VNRequest request, double fractionCompleted, @Nullable NSError error);
    }
}
