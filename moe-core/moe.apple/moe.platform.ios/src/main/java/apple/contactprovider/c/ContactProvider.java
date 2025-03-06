package apple.contactprovider.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("ContactProvider")
@Runtime(CRuntime.class)
public final class ContactProvider {
    static {
        NatJ.register();
    }

    @Generated
    private ContactProvider() {
    }

    /**
     * ! Project version number for ContactProvider.
     */
    @Generated
    @CVariable()
    public static native double ContactProviderVersionNumber();

    /**
     * ! Project version string for ContactProvider.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr ContactProviderVersionString();
}