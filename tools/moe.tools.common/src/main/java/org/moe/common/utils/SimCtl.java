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

package org.moe.common.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Utility class for Xcode simctl command-line tool.
 */
public class SimCtl {

    /**
     * Creates a new SimCtl instance.
     */
    private SimCtl() {
    }

    /**
     * Simple pair class.
     *
     * @param <L> Left type
     * @param <R> Right type
     */
    private static class Pair<L, R> {
        /**
         * Left object.
         */
        final L left;
        /**
         * Right object.
         */
        final R right;

        /**
         * Creates a new Pair instance.
         *
         * @param left  Left object
         * @param right Right object
         */
        Pair(final L left, final R right) {
            super();
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Simulator device.
     */
    public static class Device {
        /**
         * Simulator's name.
         */
        public final String name;
        /**
         * Simulator's UDID.
         */
        public final String udid;
        /**
         * Simulator's runtime.
         */
        public final String runtime;
        /**
         * Simulator's running state.
         */
        public final String state;

        /**
         * Creates a new Device instance.
         *
         * @param name    Name
         * @param udid    UDID
         * @param runtime Runtime
         * @param state   state
         */
        Device(String name, String udid, String runtime, String state) {
            this.name = name;
            this.udid = udid;
            this.runtime = runtime;
            this.state = state;
        }

        @Override
        public String toString() {
            return udid + " - " + runtime + " - " + name + " - " + state;
        }
    }

    /**
     * Returns the list of available simulators.
     *
     * @return List of available simulators
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static List<Device> getDevices() throws IOException, InterruptedException {
        SimpleExec exec = SimpleExec.getExec("xcrun");
        exec.getArguments().addAll(Arrays.asList("simctl", "list", "-j", "runtimes", "devices"));

        final String json = ExecOutputCollector.collect(exec);

        final JsonObject root = new JsonParser().parse(json).getAsJsonObject();
        final Map<String, String> runtimesNI = new HashMap<String, String>();
        final Map<String, String> runtimesIN = new HashMap<String, String>();
        final String platformDisplayName = "ios";

        for (JsonElement _runtime : root.getAsJsonArray("runtimes")) {
            final JsonObject runtime = _runtime.getAsJsonObject();
            if (!isAvailable(runtime)) continue;

            final String identifier = runtime.get("identifier").getAsString();
            final String lastcomp = identifier.substring(identifier.lastIndexOf('.') + 1);
            if (!lastcomp.toLowerCase().startsWith(platformDisplayName)) continue;

            final String name = runtime.get("name").getAsString();
            runtimesNI.put(name, identifier);
            runtimesIN.put(identifier, name);
        }

        final List<Device> devices = new ArrayList<Device>();
        for (Map.Entry<String, JsonElement> e : root.getAsJsonObject("devices").entrySet()) {
            if (!(runtimesIN.containsKey(e.getKey()) || runtimesNI.containsKey(e.getKey()))) continue;

            for (JsonElement _x : e.getValue().getAsJsonArray()) {
                final Pair<String, JsonObject> x = new Pair<String, JsonObject>(e.getKey(), _x.getAsJsonObject());
                if (!isAvailable(x.right)) continue;

                final String key = x.left;
                final String runtime;
                if (runtimesIN.containsKey(key)) {
                    runtime = runtimesIN.get(key);
                } else {
                    runtime = key;
                }
                final JsonObject value = x.right;
                devices.add(new Device(value.get("name").getAsString(), value.get("udid").getAsString(), runtime, value.get("state").getAsString()));
            }
        }
        return devices;
    }

    private static boolean isAvailable(JsonObject node) {
        boolean available = false;
        if (node.has("isAvailable")) {
            // Xcode 11+ removed 'availability'
            available = node.get("isAvailable").getAsBoolean();
        } else if (node.has("availability")) {
            // Just in case some really old Xcode doesn't have 'isAvailable'
            available = node.get("availability").getAsString().equals("(available)");
        }

        return available;
    }
}
