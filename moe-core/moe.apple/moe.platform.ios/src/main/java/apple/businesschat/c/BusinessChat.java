package apple.businesschat.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("BusinessChat")
@Runtime(CRuntime.class)
public final class BusinessChat {
    static {
        NatJ.register();
    }

    @Generated
    private BusinessChat() {
    }

    /**
     * Intent is used to help the support agent or business system identify the product, service, account, or other
     * context when the customer tapped the button to send the message.
     * 
     * API-Since: 11.3
     * Deprecated-Since: 16.1
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String BCParameterNameIntent();

    /**
     * Group is used to help the business or customer service platform route the message to the appropriate support
     * agent group.
     * 
     * API-Since: 11.3
     * Deprecated-Since: 16.1
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String BCParameterNameGroup();

    /**
     * Body is used to help the customer by providing a pre-configured contextual message that the customer can tap to
     * send to smooth the transition into Business Chat.
     * 
     * API-Since: 11.3
     * Deprecated-Since: 16.1
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String BCParameterNameBody();
}