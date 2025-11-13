package apple.gamesave.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("GameSave")
@Runtime(CRuntime.class)
public final class GameSave {
    static {
        NatJ.register();
    }

    @Generated
    private GameSave() {
    }

    /**
     * ! Project version number for GameSave.
     */
    @Generated
    @CVariable()
    public static native double GameSaveVersionNumber();

    /**
     * ! Project version string for GameSave.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr GameSaveVersionString();
}