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

package org.moe.common.utils;

import org.slf4j.Logger;

import java.io.Closeable;
import java.io.IOException;

/**
 * Utility class for Closeable objects.
 */
public class CloseableUtil {
    private CloseableUtil() {
    }

    /**
     * Try to close a Closeable object.
     *
     * @param closeable      closeable object
     * @param logger         logger to log to
     * @param failureMessage failure message
     */
    public static void tryClose(Closeable closeable, Logger logger, String failureMessage) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (logger == null) {
                    System.err.println(failureMessage);
                } else {
                    logger.error(failureMessage);
                    logger.debug(failureMessage, e);
                }
            }
        }
    }
}
