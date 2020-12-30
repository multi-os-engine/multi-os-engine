package apple.coreaudiotypes.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Generated
@Library("CoreAudioTypes")
@Runtime(CRuntime.class)
public final class CoreAudioTypes {
    static {
        NatJ.register();
    }

    @Generated
    private CoreAudioTypes() {
    }

    @Generated
    @Inline
    @CFunction
    public static native int AudioChannelLayoutTag_GetNumberOfChannels(int inLayoutTag);

    /**
     * @constant       kAudioStreamAnyRate
     *                     The format can use any sample rate. Note that this constant can only appear
     *                     in listings of supported formats. It will never appear in a current format.
     */
    @Generated public static final double kAudioStreamAnyRate = 0.0;
}