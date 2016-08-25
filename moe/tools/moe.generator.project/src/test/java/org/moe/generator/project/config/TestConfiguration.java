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

package org.moe.generator.project.config;

import org.moe.common.configuration.AbstractConfiguration;
import org.moe.common.configuration.TestAbstractConfiguration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Configuration tests.
 */
public class TestConfiguration extends TestAbstractConfiguration {

    private Configuration configuration;

    @Before
    public void setup() {
        configuration = new Configuration("1.0.0");
        setAbstractConfiguration(configuration);
    }

    @Test
    public void testTargetPlatformProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertNull(configuration.getTargetPlatform());

        configuration.setTargetPlatform(null);
        Assert.assertNull(configuration.getTargetPlatform());

        String temp = "temp";
        configuration.setTargetPlatform(temp);
        Assert.assertEquals(temp, configuration.getTargetPlatform());

        testProperty(Configuration.TARGET_PLATFORM_PROPERTY_NAME, temp, "temp2");
    }

    @Test
    public void testProjectRootProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertNull(configuration.getProjectRoot());

        configuration.setProjectRoot(null);
        Assert.assertNull(configuration.getProjectRoot());

        File temp = new File("temp");
        configuration.setProjectRoot(temp);
        Assert.assertEquals(temp, configuration.getProjectRoot());

        testProperty(Configuration.PROJECT_ROOT_PROPERTY_NAME, temp, new File("temp2"));
    }

    @Test
    public void testProjectNameProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertNull(configuration.getProjectName());

        configuration.setProjectName(null);
        Assert.assertNull(configuration.getProjectName());

        String temp = "temp";
        configuration.setProjectName(temp);
        Assert.assertEquals(temp, configuration.getProjectName());

        testProperty(Configuration.PROJECT_NAME_PROPERTY_NAME, temp, "temp2");
    }

    @Test
    public void testOrganizationNameProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertNull(configuration.getOrganizationName());

        configuration.setOrganizationName(null);
        Assert.assertNull(configuration.getOrganizationName());

        String temp = "temp";
        configuration.setOrganizationName(temp);
        Assert.assertEquals(temp, configuration.getOrganizationName());

        testProperty(Configuration.ORGANIZATION_NAME_PROPERTY_NAME, temp, "temp2");
    }

    @Test
    public void testBundleIDProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertNull(configuration.getBundleID());

        configuration.setBundleID(null);
        Assert.assertNull(configuration.getBundleID());

        String temp = "temp";
        configuration.setBundleID(temp);
        Assert.assertEquals(temp, configuration.getBundleID());

        testProperty(Configuration.BUNDLE_ID_PROPERTY_NAME, temp, "temp2");
    }

    @Test
    public void testSdkVersionProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertNull(configuration.getSdkVersion());

        configuration.setSdkVersion(null);
        Assert.assertNull(configuration.getSdkVersion());

        String temp = "temp";
        configuration.setSdkVersion(temp);
        Assert.assertEquals(temp, configuration.getSdkVersion());

        testProperty(Configuration.SDK_VERSION_PROPERTY_NAME, temp, "temp2");
    }

    @Test
    public void testGradleVersionProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertNull(configuration.getGradleVersion());

        configuration.setGradleVersion(null);
        Assert.assertNull(configuration.getGradleVersion());

        String temp = "temp";
        configuration.setGradleVersion(temp);
        Assert.assertEquals(temp, configuration.getGradleVersion());

        testProperty(Configuration.GRADLE_VERSION_PROPERTY_NAME, temp, "temp2");
    }

    @Test
    public void testUseEclipseProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertFalse(configuration.getUseEclipse());

        configuration.setUseEclipse(true);
        Assert.assertTrue(configuration.getUseEclipse());

        configuration.setUseEclipse(false);
        Assert.assertFalse(configuration.getUseEclipse());

        Boolean temp = Boolean.TRUE;
        configuration.setUseEclipse(temp);
        Assert.assertEquals(temp, configuration.getUseEclipse());

        testProperty(Configuration.USE_ECLIPSE_PROPERTY_NAME, temp, Boolean.FALSE);
    }

    @Test
    public void testUseScalaProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertFalse(configuration.getUseScala());

        configuration.setUseScala(true);
        Assert.assertTrue(configuration.getUseScala());

        configuration.setUseScala(false);
        Assert.assertFalse(configuration.getUseScala());

        Boolean temp = Boolean.TRUE;
        configuration.setUseScala(temp);
        Assert.assertEquals(temp, configuration.getUseScala());

        testProperty(Configuration.USE_SCALA_PROPERTY_NAME, temp, Boolean.FALSE);
    }

    @Test
    public void testSkipGradleWrapperProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertFalse(configuration.getSkipGradleWrapper());

        configuration.setSkipGradleWrapper(true);
        Assert.assertTrue(configuration.getSkipGradleWrapper());

        configuration.setSkipGradleWrapper(false);
        Assert.assertFalse(configuration.getSkipGradleWrapper());

        Boolean temp = Boolean.TRUE;
        configuration.setSkipGradleWrapper(temp);
        Assert.assertEquals(temp, configuration.getSkipGradleWrapper());

        testProperty(Configuration.SKIP_GRADLE_WRAPPER_PROPERTY_NAME, temp, Boolean.FALSE);
    }

    @Test
    public void testProductNameProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertNull(configuration.getProductName());

        configuration.setProductName(null);
        Assert.assertNull(configuration.getProductName());

        String temp = "temp";
        configuration.setProductName(temp);
        Assert.assertEquals(temp, configuration.getProductName());

        testProperty(Configuration.PRODUCT_NAME_PROPERTY_NAME, temp, "temp2");
    }

    @Test
    public void testUseIdeaProperty() {
        Assert.assertNotNull(configuration);
        Assert.assertFalse(configuration.getUseIdea());

        configuration.setUseIdea(true);
        Assert.assertTrue(configuration.getUseIdea());

        configuration.setUseIdea(false);
        Assert.assertFalse(configuration.getUseIdea());

        Boolean temp = Boolean.TRUE;
        configuration.setUseIdea(temp);
        Assert.assertEquals(temp, configuration.getUseIdea());

        testProperty(Configuration.USE_IDEA_PROPERTY_NAME, temp, Boolean.FALSE);
    }

    @Test
    public void testValidation() {
        configuration.setTargetPlatform(null);
        testValidate(Configuration.TARGET_PLATFORM_PROPERTY_NAME, AbstractConfiguration.PROPERTY_NOT_DEFINED_ERROR);
        configuration.setTargetPlatform("");
        testValidate(Configuration.TARGET_PLATFORM_PROPERTY_NAME, AbstractConfiguration.PROPERTY_IS_EMPTY_ERROR);
        configuration.setTargetPlatform("INVALID");
        testValidate(Configuration.TARGET_PLATFORM_PROPERTY_NAME, AbstractConfiguration.PROPERTY_VALUE_INVALID);
        configuration.setTargetPlatform(Configuration.TARGET_PLATFORM_IOS_UNIVERSAL);

        configuration.setProjectRoot(null);
        testValidate(Configuration.PROJECT_ROOT_PROPERTY_NAME, AbstractConfiguration.PROPERTY_NOT_DEFINED_ERROR);
        configuration.setProjectRoot(new File("VALID"));

        configuration.setProjectName(null);
        testValidate(Configuration.PROJECT_NAME_PROPERTY_NAME, AbstractConfiguration.PROPERTY_NOT_DEFINED_ERROR);
        configuration.setProjectName("");
        testValidate(Configuration.PROJECT_NAME_PROPERTY_NAME, AbstractConfiguration.PROPERTY_IS_EMPTY_ERROR);
        configuration.setProjectName("VALID");

        configuration.setOrganizationName(null);
        testValidate(Configuration.ORGANIZATION_NAME_PROPERTY_NAME, AbstractConfiguration.PROPERTY_NOT_DEFINED_ERROR);
        configuration.setOrganizationName("VALID");

//        configuration.setBundleID(null);
//        testValidate(Configuration.BUNDLE_ID_PROPERTY_NAME, AbstractConfiguration.PROPERTY_NOT_DEFINED_ERROR);
//        configuration.setBundleID("");
//        testValidate(Configuration.BUNDLE_ID_PROPERTY_NAME, AbstractConfiguration.PROPERTY_IS_EMPTY_ERROR);
        configuration.setBundleID("VALID");

//        configuration.setSdkVersion(null);
//        testValidate(Configuration.SDK_VERSION_PROPERTY_NAME, AbstractConfiguration.PROPERTY_NOT_DEFINED_ERROR);
//        configuration.setSdkVersion("");
//        testValidate(Configuration.SDK_VERSION_PROPERTY_NAME, AbstractConfiguration.PROPERTY_IS_EMPTY_ERROR);
        configuration.setSdkVersion("VALID");

        configuration.setGradleVersion(null);
        testValidate(Configuration.GRADLE_VERSION_PROPERTY_NAME, AbstractConfiguration.PROPERTY_NOT_DEFINED_ERROR);
        configuration.setGradleVersion("");
        testValidate(Configuration.GRADLE_VERSION_PROPERTY_NAME, AbstractConfiguration.PROPERTY_IS_EMPTY_ERROR);
        configuration.setGradleVersion("VALID");

        configuration.setProductName("");
        testValidate(Configuration.PRODUCT_NAME_PROPERTY_NAME, AbstractConfiguration.PROPERTY_IS_EMPTY_ERROR);
        configuration.setProductName("VALID");

        testValidate(null, null);
    }
}
