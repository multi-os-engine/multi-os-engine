/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.utils;

import org.moe.gradle.anns.NotNull;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    private MapUtils() {
    }

    @NotNull
    public static Map<String, Object> stringMap(@NotNull Object... values) {
        Require.nonNull(values);
        if (values.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of arguments");
        }

        final Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < values.length; i += 2) {
            map.put((String) Require.nonNull(values[i]), values[i + 1]);
        }
        return map;
    }
}
