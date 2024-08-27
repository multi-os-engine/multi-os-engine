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

import com.google.gson.JsonObject;

/**
 * JSON adapter interface.
 */
public interface IJsonAdapter {
    /**
     * Returns a JsonObject representing this object.
     *
     * @return JsonObject representing this object
     */
    JsonObject getJsonObject();

    /**
     * Sets this object to represent the specified JsonObject.
     *
     * @param json The JsonObject this object should be equal to
     */
    void setJsonObject(JsonObject json);
}
