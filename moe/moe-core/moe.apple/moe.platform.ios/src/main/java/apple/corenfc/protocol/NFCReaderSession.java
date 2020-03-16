package apple.corenfc.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCReaderSession")
public interface NFCReaderSession {
    @Generated
    @Selector("alertMessage")
    String alertMessage();

    @Generated
    @Selector("beginSession")
    void beginSession();

    @Generated
    @Selector("invalidateSession")
    void invalidateSession();

    @Generated
    @Selector("invalidateSessionWithErrorMessage:")
    void invalidateSessionWithErrorMessage(String errorMessage);

    @Generated
    @Selector("isReady")
    boolean isReady();

    @Generated
    @Selector("setAlertMessage:")
    void setAlertMessage(String value);
}