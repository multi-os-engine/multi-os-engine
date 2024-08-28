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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TypeConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(TypeConfiguration.class);

    /**
     * @formatter:off MATCH ->
     * options: {type resolving proposals, comma separated, not processed}
     * use: {resolving type}
     * <p>
     * c-function: {function name}
     * location: {location of the type, -1 is return type, 0..n are arguments}
     * MATCH
     * <p>
     * c-callback: {unit name:callback name}
     * location: {location of the type, -1 is return type, 0..n are arguments}
     * MATCH
     * <p>
     * c-variable: {variable name}
     * MATCH
     * <p>
     * c-struct: {struct name}
     * field: {field name}
     * MATCH
     * <p>
     * objc-class: {class name} ||
     * objc-protocol: {protocol name}
     * instance-method: {selector} ||
     * class-method: {selector}
     * location: {location of the type, -1 is return type, 0..n are arguments}
     * MATCH
     * <p>
     * objc-block: {unit name:callback name}
     * location: {location of the type, -1 is return type, 0..n are arguments}
     * MATCH
     * @formatter:on
     */

    public static final String C_FUNCTION = "c-function";
    public static final String LOCATION = "location";
    public static final String C_VARIABLE = "c-variable";
    public static final String C_STRUCT = "c-struct";
    public static final String C_CALLBACK = "c-callback";
    public static final String FIELD = "field";
    public static final String OBJC_CLASS = "objc-class";
    public static final String OBJC_PROTOCOL = "objc-protocol";
    public static final String INSTANCE_METHOD = "instance-method";
    public static final String CLASS_METHOD = "class-method";
    public static final String OBJC_BLOCK = "objc-block";
    public static final String OPTIONS = "options";
    public static final String USE = "use";
    public static final String MATCH = "match";

    private final MatchScope rootScope = new MatchScope();

    public final String getPreferredType(String... path) {
        MatchScope scope = _getScope(rootScope, path);
        if (scope == null || scope.item == null) {
            return null;
        }
        return scope.item.use;
    }

    public final String[] getOptions(String... path) {
        MatchScope scope = _getScope(rootScope, path);
        if (scope == null || scope.item == null) {
            return null;
        }
        return scope.item.options;
    }

    private MatchScope _getScope(MatchScope scope, String[] path) {
        if (path == null || path.length % 2 != 0) {
            new IllegalArgumentException();
        }
        int idx = 0;
        while (idx < path.length) {
            if (scope.children == null) {
                return null;
            }
            MatchArgument arg = scope.children.get(path[idx++]);
            if (arg == null) {
                return null;
            }
            scope = arg.children.get(path[idx++]);
            if (scope == null) {
                return null;
            }
        }
        return scope;
    }

    public final void setPreferredType(String path[], String use, String options[]) {
        _setScope(rootScope, path, use, options);
    }

    private void _setScope(MatchScope scope, String[] path, String use, String options[]) {
        if (path == null || path.length % 2 != 0) {
            new IllegalArgumentException();
        }
        int idx = 0;
        while (idx < path.length) {
            if (scope.children == null) {
                return;
            }

            MatchArgument arg = scope.children.get(path[idx]);
            if (arg == null) {
                arg = new MatchArgument();
                scope.children.put(path[idx], arg);
            }
            idx++;

            scope = arg.children.get(path[idx]);
            if (scope == null) {
                scope = new MatchScope(idx + 1 == path.length ? (new MatchItem(use, options)) : null);
                arg.children.put(path[idx], scope);
            }
            idx++;
        }
    }

    public final boolean updatePreferredType(String path[], String use) {
        return _updateScope(rootScope, path, use);
    }

    private boolean _updateScope(MatchScope scope, String[] path, String use) {
        if (path == null || path.length % 2 != 0) {
            new IllegalArgumentException();
        }
        int idx = 0;
        while (idx < path.length) {
            if (scope.children == null) {
                return false;
            }

            MatchArgument arg = scope.children.get(path[idx]);
            if (arg == null) {
                return false;
            }
            idx++;

            scope = arg.children.get(path[idx]);
            if (scope == null) {
                return false;
            }
            if (idx + 1 == path.length) {
                MatchScope newScope = new MatchScope(new MatchItem(use, scope.item.options));
                arg.children.put(path[idx], newScope);
                return true;
            }
            idx++;
        }
        return false;
    }

    private GsonBuilder getJsonBuilder() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(MatchScope.class, new MatchScope.Serializer());
        builder.registerTypeAdapter(MatchScope.class, new MatchScope.Deserializer());
        builder.registerTypeAdapter(MatchArgument.class, new MatchArgument.Serializer());
        builder.registerTypeAdapter(MatchArgument.class, new MatchArgument.Deserializer());
        builder.registerTypeAdapter(MatchItem.class, new MatchItem.Serializer());
        builder.registerTypeAdapter(MatchItem.class, new MatchItem.Deserializer());
        builder.setPrettyPrinting();
        return builder;
    }

    public void readFromFile(String path) throws IOException {
        final InputStream is = new FileInputStream(path);

        Gson gson = getJsonBuilder().create();
        MatchScope scope = gson.fromJson(new InputStreamReader(is), MatchScope.class);
        if (scope == null) {
            scope = new MatchScope();
        }

        rootScope.children.clear();
        rootScope.children.putAll(scope.children);

        is.close();
    }

    public void readFromString(String contents) {
        Gson gson = getJsonBuilder().create();
        MatchScope scope = gson.fromJson(contents, MatchScope.class);
        if (scope == null) {
            scope = new MatchScope();
        }

        rootScope.children.clear();
        rootScope.children.putAll(scope.children);
    }

    public void writeToFile(String path) {
        File f = new File(path);
        f.getParentFile().mkdirs();
        try {
            final OutputStream os = new FileOutputStream(path);
            final PrintStream printStream = new PrintStream(os);

            Gson gson = getJsonBuilder().create();
            String rep = gson.toJson(rootScope);
            printStream.append(rep);

            printStream.close();
            os.close();
        } catch (Exception e) {
            LOG.error("Failed to write type configuration!", e);
        }
    }

    public String getStringValue() {
        return getJsonBuilder().create().toJson(rootScope);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj instanceof TypeConfiguration) {
            TypeConfiguration ma = (TypeConfiguration)obj;
            return rootScope.equals(ma.rootScope);
        }

        return false;
    }

    public static class MatchScope {
        public final HashMap<String, MatchArgument> children;
        public final MatchItem item;

        public MatchScope() {
            this(null);
        }

        public MatchScope(MatchItem item) {
            if (item == null) {
                this.children = new HashMap<String, TypeConfiguration.MatchArgument>();
                this.item = null;
            } else {
                this.children = null;
                this.item = item;
            }
        }

        public int getCount(String filter) {
            MatchArgument a = children.get(filter);
            if (a != null) {
                return a.getCount();
            }
            return 0;
        }

        public int getCount() {
            if (item == null) {
                int count = 0;
                Iterator<Entry<String, MatchArgument>> it = children.entrySet().iterator();
                while (it.hasNext()) {
                    Entry<String, MatchArgument> e = it.next();
                    count += e.getValue().getCount();
                }
                return count;
            } else {
                return 1;
            }
        }

        public void enumerate(MatchScope.Enumerator cb) {
            _enumerate(new ArrayList<String>(10), 0, cb);
        }

        int _enumerate(ArrayList<String> path, int idx, MatchScope.Enumerator cb) {
            if (item == null) {
                int size = path.size();
                path.add("");

                Iterator<Entry<String, MatchArgument>> it = children.entrySet().iterator();
                while (it.hasNext()) {
                    Entry<String, MatchArgument> e = it.next();
                    path.set(size, e.getKey());
                    idx = e.getValue()._enumerate(path, idx, cb);
                }

                path.remove(size);
                return idx;
            } else {
                cb.next(path, idx, item);
                return idx + 1;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }

            if (obj instanceof MatchScope) {
                MatchScope ms = (MatchScope)obj;
                if (item == null) {
                    return equalMaps(children, ms.children);
                } else {
                    return item.equals(ms.item);
                }
            }

            return false;
        }

        public static interface Enumerator {

            public void next(ArrayList<String> path, int idx, MatchItem item);

        }

        private static class Serializer implements JsonSerializer<MatchScope> {

            @Override
            public JsonElement serialize(MatchScope src, Type typeOfSrc, JsonSerializationContext context) {
                if (src.item != null) {
                    JsonObject obj = new JsonObject();
                    obj.add(MATCH, context.serialize(src.item));
                    return obj;

                } else {
                    JsonArray array = new JsonArray();
                    String[] keys = new String[src.children.keySet().size()];
                    keys = src.children.keySet().toArray(keys);
                    Arrays.sort(keys);
                    for (String key : keys) {
                        JsonObject obj = new JsonObject();
                        obj.add(key, context.serialize(src.children.get(key)));
                        array.add(obj);
                    }
                    return array;
                }
            }

        }

        private static class Deserializer implements JsonDeserializer<MatchScope> {

            @Override
            public MatchScope deserialize(JsonElement element, Type typeOfSrc, JsonDeserializationContext context)
                    throws JsonParseException {
                if (element.isJsonObject()) {
                    JsonElement m = element.getAsJsonObject().get(MATCH);
                    if (m != null) {
                        MatchItem item = (MatchItem)context.deserialize(m, MatchItem.class);
                        if (item != null) {
                            return new MatchScope(item);
                        }
                    }
                } else if (element.isJsonArray()) {
                    MatchScope scope = new MatchScope();

                    JsonArray array = element.getAsJsonArray();
                    Iterator<JsonElement> it = array.iterator();
                    while (it.hasNext()) {
                        JsonElement e = it.next();
                        if (e.isJsonObject()) {
                            JsonObject o = e.getAsJsonObject();
                            Iterator<Entry<String, JsonElement>> mem_it = o.entrySet().iterator();
                            while (mem_it.hasNext()) {
                                Entry<String, JsonElement> mem = mem_it.next();
                                scope.children.put(mem.getKey(),
                                        (MatchArgument)context.deserialize(mem.getValue(), MatchArgument.class));
                            }
                        }
                    }
                    return scope;
                }

                LOG.error("element type is incorrect");
                return null;
            }
        }
    }

    public static class MatchArgument {
        public final HashMap<String, MatchScope> children = new HashMap<String, TypeConfiguration.MatchScope>();

        public int getCount() {
            int count = 0;
            Iterator<Entry<String, MatchScope>> it = children.entrySet().iterator();
            while (it.hasNext()) {
                Entry<String, MatchScope> e = it.next();
                count += e.getValue().getCount();
            }
            return count;
        }

        int _enumerate(ArrayList<String> path, int idx, MatchScope.Enumerator cb) {
            int size = path.size();
            path.add("");

            Iterator<Entry<String, MatchScope>> it = children.entrySet().iterator();
            while (it.hasNext()) {
                Entry<String, MatchScope> e = it.next();
                path.set(size, e.getKey());
                idx = e.getValue()._enumerate(path, idx, cb);
            }

            path.remove(size);
            return idx;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }

            if (obj instanceof MatchArgument) {
                MatchArgument ma = (MatchArgument)obj;
                return equalMaps(children, ma.children);
            }

            return false;
        }

        private static class Serializer implements JsonSerializer<MatchArgument> {

            @Override
            public JsonElement serialize(MatchArgument src, Type typeOfSrc, JsonSerializationContext context) {
                JsonArray array = new JsonArray();
                String[] keys = new String[src.children.keySet().size()];
                keys = src.children.keySet().toArray(keys);
                Arrays.sort(keys);
                for (String key : keys) {
                    JsonObject obj = new JsonObject();
                    obj.add(key, context.serialize(src.children.get(key)));
                    array.add(obj);
                }
                return array;
            }

        }

        private static class Deserializer implements JsonDeserializer<MatchArgument> {

            @Override
            public MatchArgument deserialize(JsonElement element, Type typeOfSrc, JsonDeserializationContext context)
                    throws JsonParseException {
                if (element.isJsonArray()) {
                    MatchArgument scope = new MatchArgument();

                    JsonArray array = element.getAsJsonArray();
                    Iterator<JsonElement> it = array.iterator();
                    while (it.hasNext()) {
                        JsonElement e = it.next();
                        if (e.isJsonObject()) {
                            JsonObject o = e.getAsJsonObject();
                            Iterator<Entry<String, JsonElement>> mem_it = o.entrySet().iterator();
                            while (mem_it.hasNext()) {
                                Entry<String, JsonElement> mem = mem_it.next();
                                scope.children.put(mem.getKey(),
                                        (MatchScope)context.deserialize(mem.getValue(), MatchScope.class));
                            }
                        }
                    }
                    return scope;
                }

                LOG.error("element type is incorrect");
                return null;
            }
        }

    }

    public static class MatchItem {

        public final String options[];
        public final String use;

        public MatchItem(String use, String options[]) {
            if (options == null) {
                throw new IllegalArgumentException();
            }
            this.use = use;
            this.options = options;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }

            if (obj instanceof MatchItem) {
                MatchItem mi = (MatchItem)obj;
                return Arrays.deepEquals(options, mi.options) && (use == null ? mi.use == null : use.equals(mi.use));
            }

            return false;
        }

        private static class Serializer implements JsonSerializer<MatchItem> {

            @Override
            public JsonElement serialize(MatchItem src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject obj = new JsonObject();
                obj.add(OPTIONS, context.serialize(src.options));
                obj.add(USE, context.serialize(src.use));
                return obj;
            }

        }

        private static class Deserializer implements JsonDeserializer<MatchItem> {

            @Override
            public MatchItem deserialize(JsonElement element, Type typeOfSrc, JsonDeserializationContext context)
                    throws JsonParseException {
                if (element.isJsonObject()) {
                    JsonObject o = element.getAsJsonObject();
                    String use = context.deserialize(o.get(USE), String.class);
                    String options[] = context.deserialize(o.get(OPTIONS), String[].class);
                    if (options == null) {
                        options = new String[0];
                    }
                    return new MatchItem(use, options);
                }

                LOG.error("element type is incorrect");
                return null;
            }
        }

    }

    public MatchScope getRoot() {
        return rootScope;
    }

    private static <K, V> boolean equalMaps(Map<K, V> m1, Map<K, V> m2) {
        if (m1.size() != m2.size()) return false;
        for (K key : m1.keySet())
            if (!m1.get(key).equals(m2.get(key))) return false;
        return true;
    }

}
