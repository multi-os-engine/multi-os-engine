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

package org.moe.natjgen;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

    /**
     * Logger for this class
     */
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
     * IApplicationContext)
     */
    public Object start(IApplicationContext context) throws Exception {
        LOG.debug("Hello NatJGen!");
        final Map<?, ?> args = context.getArguments();
        final String[] appArgs = (String[])args.get("application.args");
        for (final String arg : appArgs) {
            LOG.debug(arg);
        }
        return IApplication.EXIT_OK;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.equinox.app.IApplication#stop()
     */
    public void stop() {
        // nothing to do
    }
}
