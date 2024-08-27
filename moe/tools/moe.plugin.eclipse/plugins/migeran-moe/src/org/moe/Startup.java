/*
 * Copyright (C) 2016 Migeran
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe;

import org.apache.log4j.Logger;
import org.eclipse.ui.IStartup;
import org.moe.utils.ApplicationInfo;
import org.moe.utils.logger.LoggerFactory;

public class Startup implements IStartup {
	
	private static final Logger LOG = LoggerFactory.getLogger(Startup.class);

	@Override
	public void earlyStartup() {
		LOG.info("Plugin started " + ApplicationInfo.getInstance().getBuild().asString()
                + " (" + ApplicationInfo.getInstance().getVersionName()
                + " " + ApplicationInfo.getInstance().getFullVersion() + ")");
	}

}
