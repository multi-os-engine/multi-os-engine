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

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * Abstract configuration test.
 */
public class TestAbstractConfiguration {

    private AbstractConfiguration abstractConfiguration;

    protected void setAbstractConfiguration(AbstractConfiguration abstractConfiguration) {
        Assert.assertNotNull(abstractConfiguration);
        this.abstractConfiguration = abstractConfiguration;
    }

    protected void testProperty(String propertyName, Object currentValue, Object nextValue) {
        List<String> values = Arrays.asList(abstractConfiguration.getAllPropertyNames());
        Assert.assertTrue("Expected '" + propertyName + "' to be in " + values, values.contains(propertyName));

        Assert.assertNotNull(abstractConfiguration);
        Assert.assertNotNull(propertyName);
        Assert.assertNotNull(currentValue);
        Assert.assertNotNull(nextValue);

        Assert.assertEquals(currentValue, abstractConfiguration.getProperty(propertyName));

        abstractConfiguration.setProperty(propertyName, nextValue);
        Assert.assertEquals(nextValue, abstractConfiguration.getProperty(propertyName));
    }

    protected void testValidate(String failedProperty, String expectedMessage) {
        if (failedProperty != null) {
            List<String> values = Arrays.asList(abstractConfiguration.getAllPropertyNames());
            Assert.assertTrue("Expected '" + failedProperty + "' to be in " + values, values.contains(failedProperty));
        }

        try {
            abstractConfiguration.validate();
            Assert.assertNull(failedProperty);
        } catch (ConfigurationValidationException ex) {
            Assert.assertEquals(failedProperty, ex.getPropertyName());
            if (AbstractConfiguration.PROPERTY_VALUE_INVALID.equals(expectedMessage)) {
                Assert.assertTrue(ex.getErrorMessage().startsWith(expectedMessage + " ("));
            } else {
                Assert.assertEquals(expectedMessage, ex.getErrorMessage());
            }
        }
    }
}
