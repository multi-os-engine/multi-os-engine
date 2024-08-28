package apple.spritekit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Generated
@Library("SpriteKit")
@Runtime(CRuntime.class)
public final class SpriteKit {
    static {
        NatJ.register();
    }

    @Generated
    private SpriteKit() {
    }

    @Generated public static final double PHYSICSKIT_MINUS_GL_IMPORTS = 1.0;
    @Generated public static final double SK_VERSION = 5.0000006E7;
    @Generated public static final double SKVIEW_AVAILABLE = 1.0;
}