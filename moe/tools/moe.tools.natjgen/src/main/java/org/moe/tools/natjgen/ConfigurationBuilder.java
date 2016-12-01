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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.moe.tools.natjgen.AbstractBinding.FrameworkBindingVisitor;
import org.moe.tools.natjgen.AbstractBinding.HeaderBindingVisitor;
import org.moe.tools.natjgen.util.XcodeUtil;

import java.io.File;

public class ConfigurationBuilder {

    private final Bindings bindings;

    public ConfigurationBuilder(Bindings bindings) {
        if (bindings == null) {
            throw new NullPointerException();
        }
        this.bindings = bindings;
    }

    public Bindings getBindings() {
        return bindings;
    }

    private static class UnitRuleBuilder {
        private final boolean isFinal;
        private final JsonArray conditions = new JsonArray();
        private final JsonArray actions = new JsonArray();

        public UnitRuleBuilder(boolean isFinal) {
            this.isFinal = isFinal;
        }

        public UnitRuleBuilder addCondition(String condition, String value) {
            if (condition == null) {
                throw new NullPointerException();
            }
            if (condition.length() == 0) {
                throw new IllegalArgumentException();
            }
            final JsonObject obj = new JsonObject();
            obj.addProperty("condition", condition);
            if (value != null) {
                obj.addProperty("value", value);
            }
            conditions.add(obj);
            return this;
        }

        public UnitRuleBuilder addAction(String action, String value) {
            if (action == null) {
                throw new NullPointerException();
            }
            if (action.length() == 0) {
                throw new IllegalArgumentException();
            }
            final JsonObject obj = new JsonObject();
            obj.addProperty("action", action);
            if (value != null) {
                obj.addProperty("value", value);
            }
            actions.add(obj);
            return this;
        }

        public JsonObject build() {
            final JsonObject obj = new JsonObject();
            obj.addProperty("final", isFinal);
            obj.add("conditions", conditions);
            obj.add("actions", actions);
            return obj;
        }
    }

    public String build() throws ValidationException {
        if (bindings.getOutputDirectory() == null) {
            throw new ValidationException("output directory is not set");
        }
        for (AbstractBinding binding : bindings) {
            binding.validate();
        }

        final JsonArray headerSearchPaths = new JsonArray();
        final JsonArray userHeaderSearchPaths = new JsonArray();
        final JsonArray frameworkSearchPaths = new JsonArray();
        final JsonArray headerFileResolvingPaths = new JsonArray();
        final StringBuilder sourceFile = new StringBuilder();
        final JsonArray unitRules = new JsonArray();

        // Lookup SDK
        final String platform = XcodeUtil.PLATFORM_IOS;
        final File platformSDKsPath = XcodeUtil.getPlatformSDKsPath(platform);
        if (platformSDKsPath == null || !platformSDKsPath.exists() && !platformSDKsPath.isDirectory()) {
            throw new RuntimeException("failed to locate platform SDK (" + platform + ")");
        }

        int latestSDK = -1;
        String platformSDKsAbsolutePath = null;
        for (File sdk : platformSDKsPath.listFiles()) {
            if (sdk.isDirectory() && sdk.isAbsolute() && !sdk.isHidden()) {
                platformSDKsAbsolutePath = sdk.getAbsolutePath();
                break;
            }
        }
        if (platformSDKsAbsolutePath == null) {
            throw new RuntimeException("failed to locate platform SDK (" + platform + ")");
        }

        // Add default unit rules
        // @formatter:off
        unitRules.add(new UnitRuleBuilder(true)
                .addCondition("path-prefix", "${SDK}")
                .addAction("replace-package-base", "apple")
                .addAction("handling-mode", "external")
                .build());
        // @formatter:on
        unitRules.add(getDisabledObjCRule("objc-class-method", "class"));
        unitRules.add(getDisabledObjCRule("objc-instance-method", "retain"));
        unitRules.add(getDisabledObjCRule("objc-instance-method", "release"));
        unitRules.add(getDisabledObjCRule("objc-instance-method", "autorelease"));
        unitRules.add(getDisabledObjCRule("objc-instance-method", "dealloc"));

        // Setup bindings
        final FrameworkBindingVisitor frameworkBindingVisitor = new FrameworkBindingVisitor() {
            @Override
            public void visit(FrameworkBinding binding) {
                // @formatter:off
                unitRules.add(new UnitRuleBuilder(true)
                        .addCondition("framework-match", binding.getFrameworkName())
                        .addAction("replace-package-base", binding.getPackageBase())
                        .build());
                // @formatter:on
                sourceFile.append(binding.getImportCode()).append("\n\n");
                frameworkSearchPaths.add("${PROJECT}/" + binding.getFrameworkParent());
            }
        };
        final HeaderBindingVisitor headerBindingVisitor = new HeaderBindingVisitor() {
            @Override
            public void visit(HeaderBinding binding) {

            }
        };
        for (AbstractBinding binding : bindings) {
            binding.visit(frameworkBindingVisitor);
            binding.visit(headerBindingVisitor);
        }

        // Disable generation of all non-configured entity
        // @formatter:off
        unitRules.add(new UnitRuleBuilder(true)
                .addAction("handling-mode", "disabled")
                .build());
        // @formatter:on

        // Create configuration object
        final JsonObject cfg = new JsonObject();
        cfg.addProperty("platform", platform);
        cfg.addProperty("package-base", "undefined");
        cfg.addProperty("base-sdk", platformSDKsAbsolutePath);
        cfg.addProperty("source", sourceFile.toString());
        cfg.addProperty("output", bindings.getOutputDirectory());
        cfg.add("header-search-paths", headerSearchPaths);
        cfg.add("user-header-search-paths", userHeaderSearchPaths);
        cfg.add("framework-search-paths", frameworkSearchPaths);
        cfg.add("header-file-resolving-paths", headerFileResolvingPaths);
        cfg.add("unit-rules", unitRules);

        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(cfg);
    }

    private JsonElement getDisabledObjCRule(String type, String name) {
        if (type == null) {
            throw new NullPointerException();
        }
        if (name == null) {
            throw new NullPointerException();
        }
        // @formatter:off
        return new UnitRuleBuilder(false)
                .addCondition("type-match", type)
                .addCondition("name-match", name)
                .addAction("handling-mode", "disabled")
                .build();
        // @formatter:on
    }
}
