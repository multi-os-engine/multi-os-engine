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
import com.google.gson.JsonPrimitive;

import java.util.List;

/**
 * Base class for binding implementations.
 */
public abstract class AbstractBinding implements IJsonAdapter {

    /**
     * Name of the binding.
     */
    private String name;

    /**
     * Type of the binding.
     */
    private final String type;

    /**
     * Objective-C class generation mode.
     */
    private String objcClassGenerationMode;

    /**
     * Creates a new abstract binding.
     *
     * @param type Type of the binding
     */
    public AbstractBinding(String type) {
        if (type == null) {
            throw new NullPointerException();
        }
        this.type = type;
    }

    /**
     * Returns the type of this binding.
     *
     * @return Binding type
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the name of this binding.
     *
     * @return Binding name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this binding.
     *
     * @param name Binding name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the Objective-C class generation mode.
     *
     * @return Objective-C class generation mode
     */
    public String getObjcClassGenerationMode() {
        return objcClassGenerationMode;
    }

    /**
     * Sets the Objective-C class generation mode.
     *
     * @param mode Objective-C class generation mode
     */
    public void setObjcClassGenerationMode(String mode) {
        this.objcClassGenerationMode = mode;
    }

    /**
     * Validates this binding.
     *
     * @throws ValidationException if validation fails
     */
    public abstract void validate() throws ValidationException;

    /**
     * Checks condition and throws an exception if conditions is false.
     *
     * @param condition Condition
     * @param error     Error message for exception
     * @throws ValidationException if condition is false
     */
    protected void validate(boolean condition, String error) throws ValidationException {
        if (!condition) {
            throw new ValidationException(error);
        }
    }

    /**
     * FrameworkBinding visitor interface.
     */
    public interface FrameworkBindingVisitor {
        /**
         * Visits the specified FrameworkBinding.
         *
         * @param binding Binding to visit
         */
        void visit(FrameworkBinding binding);
    }

    /**
     * Visits this binding with the specified visitor iff this binding is a FrameworkBinding.
     *
     * @param visitor Visitor to visit with
     */
    public void visit(FrameworkBindingVisitor visitor) {
        if (this instanceof FrameworkBinding) {
            visitor.visit((FrameworkBinding)this);
        }
    }

    /**
     * HeaderBinding visitor interface.
     */
    public interface HeaderBindingVisitor {
        /**
         * Visits the specified HeaderBinding.
         *
         * @param binding Binding to visit
         */
        void visit(HeaderBinding binding);
    }

    /**
     * Visits this binding with the specified visitor iff this binding is a HeaderBinding.
     *
     * @param visitor Visitor to visit with
     */
    public void visit(HeaderBindingVisitor visitor) {
        if (this instanceof HeaderBinding) {
            visitor.visit((HeaderBinding)this);
        }
    }

    @Override
    public JsonObject getJsonObject() {
        final JsonObject json = new JsonObject();
        json.addProperty("type", getType());
        if (getName() != null) {
            json.addProperty("name", getName());
        }
        if (objcClassGenerationMode != null) {
            json.addProperty("objcClassGenerationMode", objcClassGenerationMode);
        }
        return json;
    }

    @Override
    public void setJsonObject(JsonObject json) {
        final JsonPrimitive jsonType = json.getAsJsonPrimitive("type");
        if (jsonType == null) {
            throw new NullPointerException();
        }
        if (!type.equals(jsonType.getAsString())) {
            throw new IllegalArgumentException();
        }

        setName(null);
        final JsonPrimitive jsonName = json.getAsJsonPrimitive("name");
        if (jsonName != null) {
            setName(jsonName.getAsString());
        }

        setObjcClassGenerationMode(null);
        final JsonPrimitive jsonObjcClassGenerationMode = json.getAsJsonPrimitive("objcClassGenerationMode");
        if (jsonObjcClassGenerationMode != null) {
            setObjcClassGenerationMode(jsonObjcClassGenerationMode.getAsString());
        } else {
            setObjcClassGenerationMode(Bindings.BINDING);
        }
    }

    /**
     * Reads a String filled JsonArray and adds the values to the specified list.
     *
     * @param array  Input array
     * @param target Output list
     */
    protected void readJsonStringArray(JsonArray array, List<String> target) {
        target.clear();
        if (array == null) {
            return;
        }
        for (JsonElement jsonElement : array) {
            target.add(jsonElement.getAsString());
        }
    }
}
