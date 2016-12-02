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

public abstract class AbstractBinding implements IJsonAdapter {
    private String name;
    private final String type;

    public AbstractBinding(String type) {
        if (type == null) {
            throw new NullPointerException();
        }
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void validate() throws ValidationException;

    protected void validate(boolean condition, String error) throws ValidationException {
        if (!condition) {
            throw new ValidationException(error);
        }
    }

    public interface FrameworkBindingVisitor {
        void visit(FrameworkBinding binding);
    }

    public void visit(FrameworkBindingVisitor visitor) {
        if (this instanceof FrameworkBinding) {
            visitor.visit((FrameworkBinding)this);
        }
    }

    public interface HeaderBindingVisitor {
        void visit(HeaderBinding binding);
    }

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
    }

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
