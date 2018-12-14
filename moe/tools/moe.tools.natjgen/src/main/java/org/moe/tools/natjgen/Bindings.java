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
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import org.moe.common.developer.NativeSDKUtil;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Main type used for defining binding configurations.
 */
public class Bindings implements Iterable<AbstractBinding>, IJsonAdapter {
    /**
     * iOS platform name.
     */
    public final static String PLATFORM_IOS = NativeSDKUtil.PLATFORM_IOS;
    /**
     * macOS platform name.
     */
    public final static String PLATFORM_OSX = NativeSDKUtil.PLATFORM_OSX;

    /**
     * Objective-C class generation mode - binding.
     */
    public final static String BINDING = "Binding";

    /**
     * Objective-C class generation mode - hybrid.
     */
    public final static String HYBRID = "Hybrid";

    /**
     * Name of the platform to create bindings for.
     */
    private String platform;

    /**
     * Ordered list of bindings.
     */
    private final List<AbstractBinding> bindings = new ArrayList<AbstractBinding>();

    /**
     * Output directory for bindings.
     */
    private String outputDirectory;

    /**
     * Inline function output directory for bindings.
     */
    private String inlineFunctionBindingOutput;

    /**
     * Type configuration output directory for bindings.
     */
    private String typeConfigOutput;

    /**
     * Type configuration input directory for bindings.
     */
    private String typeConfigInput;

    /**
     * Returns the target platform's name.
     *
     * @return Target platform's name
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the target platform.
     *
     * @param platform Target platform's name
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * Returns the number of bindings.
     *
     * @return Number of bindings
     */
    public int size() {
        return bindings.size();
    }

    /**
     * Returns true iff the number of bindings is zero.
     *
     * @return <tt>true</tt> iff the number of bindings is zero
     */
    public boolean isEmpty() {
        return bindings.isEmpty();
    }

    /**
     * Returns an iterator for the bindings.
     *
     * @return Iterator for the bindings
     */
    public Iterator<AbstractBinding> iterator() {
        return bindings.iterator();
    }

    /**
     * Adds the specified binding to the end of the bindings list.
     *
     * @param abstractBinding Binding to add
     * @return <tt>true</tt> (as specified by {@link java.util.Collection#add})
     */
    public boolean add(AbstractBinding abstractBinding) {
        return bindings.add(abstractBinding);
    }

    /**
     * Removes the first occurrence of the specified element from the bindings list.
     *
     * @param o Binding to remove
     * @return <tt>true</tt> if the bindings list contained the specified element
     */
    public boolean remove(Object o) {
        return bindings.remove(o);
    }

    /**
     * Returns the element at the specified position in the bindings list.
     *
     * @param index Index of the element to return
     * @return The element at the specified position in the bindings list
     */
    public AbstractBinding get(int index) {
        return bindings.get(index);
    }

    /**
     * Inserts the specified binding at the specified position in the bindings list.
     *
     * @param index   Index at which the specified element is to be inserted
     * @param element Binding to be inserted
     */
    public void add(int index, AbstractBinding element) {
        bindings.add(index, element);
    }

    /**
     * Removes the binding at the specified position in the bindings list.
     *
     * @param index the index of the element to be removed
     * @return The binding previously at the specified position
     */
    public AbstractBinding remove(int index) {
        return bindings.remove(index);
    }

    /**
     * Returns the output directory of the bindings.
     *
     * @return Output directory of the bindings
     */
    public String getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Sets the output directory of the bindings.
     *
     * @param outputDirectory output directory
     */
    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    /**
     * Returns the inline function output directory of the bindings.
     *
     * @return Output directory of the bindings
     */
    public String getInlineFunctionBindingOutput() {
        return inlineFunctionBindingOutput;
    }

    /**
     * Sets the inline function output directory of the bindings.
     *
     * @param inlineFunctionBindingOutput output directory
     */
    public void setInlineFunctionBindingOutput(String inlineFunctionBindingOutput) {
        this.inlineFunctionBindingOutput = inlineFunctionBindingOutput;
    }

    /**
     * Returns the type configuration output directory of the bindings.
     *
     * @return Output directory of the bindings
     */
    public String getTypeConfigOutput() {
        return typeConfigOutput;
    }

    /**
     * Sets the type configuration output directory of the bindings.
     *
     * @param typeConfigOutput output directory
     */
    public void setTypeConfigOutput(String typeConfigOutput) {
        this.typeConfigOutput = typeConfigOutput;
    }

    /**
     * Returns the type input directory of the bindings.
     *
     * @return Output directory of the bindings
     */
    public String getTypeConfigInput() {
        return typeConfigInput;
    }

    /**
     * Sets the type configuration input directory of the bindings.
     *
     * @param typeConfigInput input directory
     */
    public void setTypeConfigInput(String typeConfigInput) {
        this.typeConfigInput = typeConfigInput;
    }


    @Override
    public JsonObject getJsonObject() {
        JsonObject obj = new JsonObject();
        if (outputDirectory != null) {
            obj.addProperty("output", outputDirectory);
        }
        if (platform != null) {
            obj.addProperty("platform", platform);
        }

        if (inlineFunctionBindingOutput != null) {
            obj.addProperty("inline-function-binding-output", inlineFunctionBindingOutput);
        }

        if (typeConfigInput != null) {
            obj.addProperty("type-config-input", typeConfigInput);
        }

        if (typeConfigOutput != null) {
            obj.addProperty("type-config-output", typeConfigOutput);
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
        final JsonPrimitive jsonOutput = json.getAsJsonPrimitive("output");
        if (jsonOutput != null) {
            setOutputDirectory(jsonOutput.getAsString());
        }

        setPlatform(null);
        final JsonPrimitive jsonPlatform = json.getAsJsonPrimitive("platform");
        if (jsonPlatform != null) {
            setPlatform(jsonPlatform.getAsString());
        }

        setTypeConfigInput(null);
        final JsonPrimitive jsonTypeConfigInput = json.getAsJsonPrimitive("type-config-input");
        if (jsonTypeConfigInput != null) {
            setTypeConfigInput(jsonTypeConfigInput.getAsString());
        }

        setTypeConfigOutput(null);
        final JsonPrimitive jsonTypeConfigOutput = json.getAsJsonPrimitive("type-config-output");
        if (jsonTypeConfigOutput != null) {
            setTypeConfigOutput(jsonTypeConfigOutput.getAsString());
        }

        setInlineFunctionBindingOutput(null);
        final JsonPrimitive jsonInlineFunctionBindingOutput =
                json.getAsJsonPrimitive("inline-function-binding-output");
        if (jsonInlineFunctionBindingOutput != null) {
            setInlineFunctionBindingOutput(jsonInlineFunctionBindingOutput.getAsString());
        }

        bindings.clear();
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

    /**
     * Saves this Bindings object as JSON in the specified file.
     *
     * @param target File to save into
     * @throws IOException if an error occurs
     */
    public void save(File target) throws IOException {
        if (target == null) {
            throw new NullPointerException();
        }
        final PrintWriter writer = new PrintWriter(target);
        try {
            JsonWriter jsonWriter = new JsonWriter(writer);
            jsonWriter.setLenient(true);
            jsonWriter.setIndent("  ");
            Streams.write(getJsonObject(), jsonWriter);
        } finally {
            writer.close();
        }
    }

    /**
     * Loads this Bindings object from the specified file.
     *
     * @param source File to load from
     * @throws IOException if an error occurs
     */
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
