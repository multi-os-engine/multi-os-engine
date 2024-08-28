package org.moe.natjgen.test.protocols;

import org.moe.natjgen.test.AbstractNatJGenTest;

public abstract class AbstractProtocolTest extends AbstractNatJGenTest {

    @Override
    protected void setUp() throws Exception {
        String simpleName = this.getClass().getSimpleName();
        setUpClass(null, "protocol/" + simpleName + ".java", simpleName);
    }
}
