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

package org.moe.common.ios;

import org.moe.common.developer.ProvisioningProfile;
import junit.framework.TestCase;

import java.util.List;

public class ProvisioningProfileTest extends TestCase {

    protected boolean m_bIsMac;

    public ProvisioningProfileTest() {
        m_bIsMac = System.getProperty("os.name").toLowerCase().contains("mac");
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testGetProfiles() throws Exception {
        if (m_bIsMac) {
            List<ProvisioningProfile> profiles = ProvisioningProfile.getProfiles();

            assertFalse(profiles.isEmpty());

            for (ProvisioningProfile profile : profiles) {
                assertNotNull(profile.name());
                assertFalse(profile.name().isEmpty());

                assertNotNull(profile.file());
                assertTrue(profile.file().exists());
            }
        }
    }
}
