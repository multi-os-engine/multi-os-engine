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

package org.moe.idea.utils;

import com.intellij.openapi.util.JDOMExternalizerUtil;
import org.jdom.Element;

public class JDOMHelper {

    public static String readString(Element element, String key, String value) {
        String val = JDOMExternalizerUtil.readField(element, key);

        if(val == null || val.isEmpty()) {
            return value;
        }

        return val;
    }

    public static boolean readBoolean(Element element, String key, boolean value) {
        String val = JDOMExternalizerUtil.readField(element, key);

        if(val == null || val.isEmpty()) {
            return value;
        }

        return Boolean.parseBoolean(val);
    }

    public static int readInteger(Element element, String key, int value) {
        String val = JDOMExternalizerUtil.readField(element, key);

        if(val == null || val.isEmpty()) {
            return value;
        }

        int result;

        try {
            result = Integer.parseInt(val);
        }
        catch (NumberFormatException e) {
            return value;
        }

        return result;
    }
}
