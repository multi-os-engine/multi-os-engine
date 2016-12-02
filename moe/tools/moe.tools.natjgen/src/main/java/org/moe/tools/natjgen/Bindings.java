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

package org.moe.tools.natjgen;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bindings implements Iterable<AbstractBinding>, IJsonAdapter {
    private final List<AbstractBinding> bindings = new ArrayList<AbstractBinding>();
    private String outputDirectory;

    public int size() {
        return bindings.size();
    }

    public boolean isEmpty() {
        return bindings.isEmpty();
    }

    public Iterator<AbstractBinding> iterator() {
        return bindings.iterator();
    }

    public boolean add(AbstractBinding abstractBinding) {
        return bindings.add(abstractBinding);
    }

    public boolean remove(Object o) {
        return bindings.remove(o);
    }

    public AbstractBinding get(int index) {
        return bindings.get(index);
    }

    public void add(int index, AbstractBinding element) {
        bindings.add(index, element);
    }

    public AbstractBinding remove(int index) {
        return bindings.remove(index);
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    @Override
    public JsonObject getJsonObject() {
        JsonObject obj = new JsonObject();
        if (outputDirectory != null) {
            obj.addProperty("output", outputDirectory);
        }
        JsonArray binds = new JsonArray();
        for (AbstractBinding binding : bindings) {
            binds.add(binding.getJsonObject());
        }
        obj.add("bindings", binds);
        return obj;
    }

    @Override
    public void setJsonObject(JsonObject json) {
        setOutputDirectory(null);
        bindings.clear();
        final JsonPrimitive jsonOutput = json.getAsJsonPrimitive("output");
        if (jsonOutput != null) {
            setOutputDirectory(jsonOutput.getAsString());
        }
        final JsonArray jsonBindings = json.getAsJsonArray("bindings");
        if (jsonBindings != null) {
            for (JsonElement jsonBinding : jsonBindings) {
                final JsonObject element = (JsonObject)jsonBinding;
                final String type = element.getAsJsonPrimitive("type").getAsString();
                if ("framework".equals(type)) {
                    FrameworkBinding binding = new FrameworkBinding();
                    binding.setJsonObject(element);
                    bindings.add(binding);

                } else if ("header".equals(type)) {
                    HeaderBinding binding = new HeaderBinding();
                    binding.setJsonObject(element);
                    bindings.add(binding);

                } else {
                    throw new RuntimeException("unrecognized binding type " + type);
                }
            }
        }
    }

    public void save(File target) throws IOException {
        if (target == null) {
            throw new NullPointerException();
        }
        final PrintWriter writer = new PrintWriter(target);
        try {
            writer.write(getJsonObject().toString());
        } finally {
            writer.close();
        }
    }

    public void load(File source) throws IOException {
        if (source == null) {
            throw new NullPointerException();
        }
        final FileReader reader = new FileReader(source);
        try {
            JsonParser parser = new JsonParser();
            setJsonObject(parser.parse(reader).getAsJsonObject());
        } finally {
            reader.close();
        }
    }
}
