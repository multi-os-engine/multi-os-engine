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

import org.apache.commons.lang3.text.WordUtils;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class StringUtils {
    private StringUtils() {

    }

    @NotNull
    public static String camelcase(@NotNull String... components) {
        Require.nonNull(components);

        StringBuilder builder = new StringBuilder();
        for (String comp : components) {
            if (comp == null) {
                continue;
            }
            if (builder.length() == 0) {
                builder.append(org.apache.commons.lang3.StringUtils.uncapitalize(comp));
            } else {
                builder.append(WordUtils.capitalize(comp));
            }
        }
        return builder.toString();
    }

    @Nullable
    public static List<String> getElemsInRule(@NotNull String rule, @NotNull String prefix, @NotNull String suffix) {
        Require.nonNull(rule);
        Require.nonNull(prefix);
        Require.nonNull(suffix);

        if (!rule.startsWith(prefix) || !rule.endsWith(suffix)) {
            return null;
        }

        final String base = rule.substring(prefix.length(), rule.length() - suffix.length());
        if (base.length() == 0) {
            return Collections.emptyList();
        }

        List<String> words = new ArrayList<>();
        int start = 0;
        int stop = 1;

        while (stop < base.length()) {
            if (Character.isUpperCase(base.charAt(stop))) {
                words.add(base.substring(start, stop).toLowerCase());
                start = stop;
            }

            stop++;
            if (stop >= base.length()) {
                words.add(base.substring(start, stop).toLowerCase());
            }
        }

        return words;
    }

    @NotNull
    public static String compose(@NotNull Supplier<String> composer) {
        return Require.nonNull(composer).get();
    }
}
