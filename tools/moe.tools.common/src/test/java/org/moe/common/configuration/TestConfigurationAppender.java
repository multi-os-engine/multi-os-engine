/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.common.configuration;

import org.moe.common.Port;
import org.moe.common.ProxyPort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class TestConfigurationAppender extends AbstractConfigurationAppender {

    private final Configuration config;

    public TestConfigurationAppender() {
        this(new Configuration());
    }

    private TestConfigurationAppender(Configuration configuration) {
        super(configuration);
        this.config = configuration;
    }

    private static class Configuration extends AbstractConfiguration {
        @Override
        public void validate() throws ConfigurationValidationException {

        }

        public static final String STRING_PROPERTY_NAME = "test-string";
        public static final String FILE_PROPERTY_NAME = "test-file";
        public static final String BOOLEAN_PROPERTY_NAME = "test-bool";
        public static final String BYTE_PROPERTY_NAME = "test-byte";
        public static final String SHORT_PROPERTY_NAME = "test-short";
        public static final String INT_PROPERTY_NAME = "test-int";
        public static final String LONG_PROPERTY_NAME = "test-long";
        public static final String FLOAT_PROPERTY_NAME = "test-float";
        public static final String DOUBLE_PROPERTY_NAME = "test-double";
        public static final String PROXYPORT_PROPERTY_NAME = "test-proxyport";
        public static final String PORT_PROPERTY_NAME = "test-port";
        public static final String OTHER_PROPERTY_NAME = "test-other";

        private String test_string;
        private File test_file;
        private boolean test_bool;
        private byte test_byte;
        private short test_short;
        private int test_int;
        private long test_long;
        private float test_float;
        private double test_double;
        private ProxyPort test_proxyport;
        private Port test_port;
        private Object test_other;

        @Override
        public Object getProperty(String key) {
            if (STRING_PROPERTY_NAME.equals(key)) {
                return test_string;
            } else if (FILE_PROPERTY_NAME.equals(key)) {
                return test_file;
            } else if (BOOLEAN_PROPERTY_NAME.equals(key)) {
                return test_bool;
            } else if (BYTE_PROPERTY_NAME.equals(key)) {
                return test_byte;
            } else if (SHORT_PROPERTY_NAME.equals(key)) {
                return test_short;
            } else if (INT_PROPERTY_NAME.equals(key)) {
                return test_int;
            } else if (LONG_PROPERTY_NAME.equals(key)) {
                return test_long;
            } else if (FLOAT_PROPERTY_NAME.equals(key)) {
                return test_float;
            } else if (DOUBLE_PROPERTY_NAME.equals(key)) {
                return test_double;
            } else if (PROXYPORT_PROPERTY_NAME.equals(key)) {
                return test_proxyport;
            } else if (PORT_PROPERTY_NAME.equals(key)) {
                return test_port;
            } else if (OTHER_PROPERTY_NAME.equals(key)) {
                return test_other;
            } else {
                return super.getProperty(key);
            }
        }

        @Override
        public void setProperty(String key, Object value) {
            if (STRING_PROPERTY_NAME.equals(key)) {
                test_string = (String) value;
            } else if (FILE_PROPERTY_NAME.equals(key)) {
                test_file = (File) value;
            } else if (BOOLEAN_PROPERTY_NAME.equals(key)) {
                test_bool = (Boolean) value;
            } else if (BYTE_PROPERTY_NAME.equals(key)) {
                test_byte = (Byte) value;
            } else if (SHORT_PROPERTY_NAME.equals(key)) {
                test_short = (Short) value;
            } else if (INT_PROPERTY_NAME.equals(key)) {
                test_int = (Integer) value;
            } else if (LONG_PROPERTY_NAME.equals(key)) {
                test_long = (Long) value;
            } else if (FLOAT_PROPERTY_NAME.equals(key)) {
                test_float = (Float) value;
            } else if (DOUBLE_PROPERTY_NAME.equals(key)) {
                test_double = (Double) value;
            } else if (PROXYPORT_PROPERTY_NAME.equals(key)) {
                test_proxyport = (ProxyPort) value;
            } else if (PORT_PROPERTY_NAME.equals(key)) {
                test_port = (Port) value;
            } else if (OTHER_PROPERTY_NAME.equals(key)) {
                test_other = value;
            } else {
                super.setProperty(key, value);
            }
        }

        @Override
        public Class<?> getPropertyClass(String key) {
            if (STRING_PROPERTY_NAME.equals(key)) {
                return String.class;
            } else if (FILE_PROPERTY_NAME.equals(key)) {
                return File.class;
            } else if (BOOLEAN_PROPERTY_NAME.equals(key)) {
                return Boolean.class;
            } else if (BYTE_PROPERTY_NAME.equals(key)) {
                return Byte.class;
            } else if (SHORT_PROPERTY_NAME.equals(key)) {
                return Short.class;
            } else if (INT_PROPERTY_NAME.equals(key)) {
                return Integer.class;
            } else if (LONG_PROPERTY_NAME.equals(key)) {
                return Long.class;
            } else if (FLOAT_PROPERTY_NAME.equals(key)) {
                return Float.class;
            } else if (DOUBLE_PROPERTY_NAME.equals(key)) {
                return Double.class;
            } else if (PROXYPORT_PROPERTY_NAME.equals(key)) {
                return ProxyPort.class;
            } else if (PORT_PROPERTY_NAME.equals(key)) {
                return Port.class;
            } else if (OTHER_PROPERTY_NAME.equals(key)) {
                return Object.class;
            } else {
                return super.getPropertyClass(key);
            }
        }

        @Override
        public String[] getAllPropertyNames() {
            return new String[]{STRING_PROPERTY_NAME, FILE_PROPERTY_NAME, BOOLEAN_PROPERTY_NAME,
                    BYTE_PROPERTY_NAME, SHORT_PROPERTY_NAME, INT_PROPERTY_NAME,
                    LONG_PROPERTY_NAME, FLOAT_PROPERTY_NAME, DOUBLE_PROPERTY_NAME,
                    PROXYPORT_PROPERTY_NAME, PORT_PROPERTY_NAME, OTHER_PROPERTY_NAME};
        }
    }

    @Override
    protected void setup() {
        addOptionWithArg("--string", Configuration.STRING_PROPERTY_NAME);
        addHelp(Configuration.STRING_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--file", Configuration.FILE_PROPERTY_NAME);
        addHelp(Configuration.FILE_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--bool", Configuration.BOOLEAN_PROPERTY_NAME);
        addHelp(Configuration.BOOLEAN_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--byte", Configuration.BYTE_PROPERTY_NAME);
        addHelp(Configuration.BYTE_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--short", Configuration.SHORT_PROPERTY_NAME);
        addHelp(Configuration.SHORT_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--int", Configuration.INT_PROPERTY_NAME);
        addHelp(Configuration.INT_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--long", Configuration.LONG_PROPERTY_NAME);
        addHelp(Configuration.LONG_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--float", Configuration.FLOAT_PROPERTY_NAME);
        addHelp(Configuration.FLOAT_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--double", Configuration.DOUBLE_PROPERTY_NAME);
        addHelp(Configuration.DOUBLE_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--proxy-port", Configuration.PROXYPORT_PROPERTY_NAME);
        addHelp(Configuration.PROXYPORT_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--port", Configuration.PORT_PROPERTY_NAME);
        addHelp(Configuration.PORT_PROPERTY_NAME, null, "test description");

        addOptionWithArg("--other", Configuration.OTHER_PROPERTY_NAME);
        addHelp(Configuration.OTHER_PROPERTY_NAME, null, "test description");
    }

    @Before
    public void setUp() {
        set("--string=teststring", "--file=/file", "--bool=true", "--byte=12", "--short=31000",
                "--int=98555", "--long=99999999999999", "--float=3.14", "--double=6.75",
                "--proxy-port=100:200", "--port=5555", "--other=100");
    }

    @Test
    public void testStringConvert() {
        Assert.assertEquals("teststring", config.getProperty(Configuration.STRING_PROPERTY_NAME));
    }

    @Test
    public void testFileConvert() {
        Assert.assertEquals(new File("/file"), config.getProperty(Configuration.FILE_PROPERTY_NAME));
    }

    @Test
    public void testBooleanConvert() {
        Assert.assertEquals(Boolean.TRUE, config.getProperty(Configuration.BOOLEAN_PROPERTY_NAME));
    }

    @Test
    public void testByteConvert() {
        Assert.assertEquals((byte) 12, config.getProperty(Configuration.BYTE_PROPERTY_NAME));
    }

    @Test
    public void testShortConvert() {
        Assert.assertEquals((short) 31000, config.getProperty(Configuration.SHORT_PROPERTY_NAME));
    }

    @Test
    public void testIntegerConvert() {
        Assert.assertEquals(98555, config.getProperty(Configuration.INT_PROPERTY_NAME));
    }

    @Test
    public void testLongConvert() {
        Assert.assertEquals(99999999999999L, config.getProperty(Configuration.LONG_PROPERTY_NAME));
    }

    @Test
    public void testFloatConvert() {
        Assert.assertEquals(3.14f, config.getProperty(Configuration.FLOAT_PROPERTY_NAME));
    }

    @Test
    public void testDoubleConvert() {
        Assert.assertEquals(6.75, config.getProperty(Configuration.DOUBLE_PROPERTY_NAME));
    }

    @Test
    public void testProxyPortConvert() {
        Assert.assertEquals(new ProxyPort((short) 100, (short) 200), config.getProperty(Configuration.PROXYPORT_PROPERTY_NAME));
    }

    @Test
    public void testPortConvert() {
        Assert.assertEquals(new Port((short) 5555), config.getProperty(Configuration.PORT_PROPERTY_NAME));
    }

    @Test
    public void testOtherConvert() {
        Assert.assertEquals("100", config.getProperty(Configuration.OTHER_PROPERTY_NAME));
    }
}
