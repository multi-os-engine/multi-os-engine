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
import org.moe.common.developer.NativeSDKUtil;
import org.moe.tools.natjgen.AbstractBinding.FrameworkBindingVisitor;
import org.moe.tools.natjgen.AbstractBinding.HeaderBindingVisitor;

import java.io.File;
import java.util.List;

/**
 * This class constructs a NatJGen configuration from the specified Bindings object.
 */
public class ConfigurationBuilder {

    /**
     * Bindings instance.
     */
    private final Bindings bindings;

    /**
     * Creates a new {@link ConfigurationBuilder} instance.
     *
     * @param bindings Bindings instance
     */
    public ConfigurationBuilder(Bindings bindings) {
        if (bindings == null) {
            throw new NullPointerException();
        }
        this.bindings = bindings;
    }

    /**
     * Returns the Bindings instance.
     *
     * @return Bindings instance
     */
    public Bindings getBindings() {
        return bindings;
    }

    /**
     * Utility class for building UnitRules.
     */
    private static class UnitRuleBuilder {
        /**
         * Is final flag.
         */
        private final boolean isFinal;
        /**
         * List of conditions.
         */
        private final JsonArray conditions = new JsonArray();
        /**
         * List of actions.
         */
        private final JsonArray actions = new JsonArray();

        /**
         * Creates a new UnitRuleBuilder instance.
         *
         * @param isFinal Is final flag
         */
        public UnitRuleBuilder(boolean isFinal) {
            this.isFinal = isFinal;
        }

        /**
         * Adds a condition to this UnitRule.
         *
         * @param condition Condition
         * @param value     Value
         * @return This UnitRuleBuilder
         */
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

        /**
         * Adds an action to this UnitRule.
         *
         * @param action Action
         * @param value  Value
         * @return This UnitRuleBuilder
         */
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

        /**
         * Creates a JsonObject for the configured UnitRule.
         *
         * @return JsonObject representing the configured UnitRule
         */
        public JsonObject build() {
            final JsonObject obj = new JsonObject();
            obj.addProperty("final", isFinal);
            obj.add("conditions", conditions);
            obj.add("actions", actions);
            return obj;
        }
    }

    /**
     * Creates a JSON string containing the NatJGen configuration.
     *
     * @return JSON string containing the NatJGen configuration
     * @throws ValidationException if an error occurs
     */
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
        final String platform = bindings.getPlatform() == null ? Bindings.PLATFORM_IOS : bindings.getPlatform();
        final File platformSDKsPath = NativeSDKUtil.getPlatformSDKsPath(platform);
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
        unitRules.add(getDisabledObjCRule("objc-class-method", "class"));
        unitRules.add(getDisabledObjCRule("objc-class-method", "initialize"));
        unitRules.add(getDisabledObjCRule("objc-class-method", "load"));
        unitRules.add(getDisabledObjCRule("objc-instance-method", "retain"));
        unitRules.add(getDisabledObjCRule("objc-instance-method", "release"));
        unitRules.add(getDisabledObjCRule("objc-instance-method", "autorelease"));
        unitRules.add(getDisabledObjCRule("objc-instance-method", "dealloc"));

        // @formatter:off
        unitRules.add(new UnitRuleBuilder(true)
                .addCondition("path-prefix", "${SDK}")
                .addAction("replace-package-base", "apple")
                .addAction("handling-mode", "external")
                .build());
        // @formatter:on

        // Setup bindings
        final FrameworkBindingVisitor frameworkBindingVisitor = new FrameworkBindingVisitor() {
            @Override
            public void visit(FrameworkBinding binding) {
                String objcClassGenerationMode = binding.getObjcClassGenerationMode();
                final boolean isBinding =
                        objcClassGenerationMode == null || objcClassGenerationMode.equals(Bindings.BINDING);
                // @formatter:off
                final UnitRuleBuilder ruleBuilder = new UnitRuleBuilder(true)
                        .addCondition("framework-match", binding.getFrameworkName())
                        .addAction("replace-package-base", binding.getPackageBase());
                if (!isBinding) {
                    ruleBuilder.addAction("generate-hybrid-class", null);
                }
                unitRules.add(ruleBuilder.build());
                // @formatter:on
                sourceFile.append(binding.getImportCode()).append("\n\n");
                copyPath(binding.getFrameworkParentPath(), frameworkSearchPaths);
            }
        };
        final HeaderBindingVisitor headerBindingVisitor = new HeaderBindingVisitor() {
            @Override
            public void visit(HeaderBinding binding) {
                String objcClassGenerationMode = binding.getObjcClassGenerationMode();
                final boolean isBinding =
                        objcClassGenerationMode == null || objcClassGenerationMode.equals(Bindings.BINDING);
                // @formatter:off
                final UnitRuleBuilder ruleBuilder = new UnitRuleBuilder(true)
                        .addCondition("path-prefix", projectRelativePath(binding.getHeaderPath()))
                        .addAction("replace-package-base", binding.getPackageBase());
                if (!isBinding) {
                    ruleBuilder.addAction("generate-hybrid-class", null);
                }
                // @formatter:on
                if (binding.getExplicitLibrary() != null) {
                    ruleBuilder.addAction("replace-library", binding.getExplicitLibrary());
                }
                unitRules.add(ruleBuilder.build());
                sourceFile.append(binding.getImportCode()).append("\n\n");
                copyPath(binding.getHeaderPath(), headerSearchPaths);
                copyPath(binding.getHeaderPath(), userHeaderSearchPaths);
                copyPaths(binding.getHeaderSearchPaths(), headerSearchPaths);
                copyPaths(binding.getUserHeaderSearchPaths(), userHeaderSearchPaths);
                copyPaths(binding.getFrameworkSearchPaths(), frameworkSearchPaths);
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

        String inlineOutput = bindings.getInlineFunctionBindingOutput();
        if (inlineOutput != null && !inlineOutput.isEmpty()) {
            cfg.addProperty("inline-function-binding-output", projectRelativePath(inlineOutput));
        }
        String typeConfInput = bindings.getTypeConfigInput();
        if (typeConfInput != null && !typeConfInput.isEmpty()) {
            cfg.addProperty("type-config-input", projectRelativePath(typeConfInput));
        }
        String typeConfOutput = bindings.getTypeConfigOutput();
        if (typeConfOutput != null && !typeConfOutput.isEmpty()) {
            cfg.addProperty("type-config-output", projectRelativePath(typeConfOutput));
        }
        cfg.add("header-search-paths", headerSearchPaths);
        cfg.add("user-header-search-paths", userHeaderSearchPaths);
        cfg.add("framework-search-paths", frameworkSearchPaths);
        cfg.add("header-file-resolving-paths", headerFileResolvingPaths);
        cfg.add("unit-rules", unitRules);

        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(cfg);
    }

    /**
     * Copy paths safely from a list to a JsonArray.
     *
     * @param source Input list
     * @param target Output array
     */
    private void copyPaths(List<String> source, JsonArray target) {
        for (String path : source) {
            copyPath(path, target);
        }
    }

    /**
     * Copy a path safely to a JsonArray.
     *
     * @param path   Input path
     * @param target Output array
     */
    private void copyPath(String path, JsonArray target) {
        target.add(projectRelativePath(path));
    }

    /**
     * Convert the specified path to a project relative path if necessary.
     *
     * @param path Path to convert
     * @return Converted path or if path was absolute, then the original path
     */
    private String projectRelativePath(String path) {
        if (path.startsWith("/")) {
            return path;
        } else {
            return "${PROJECT}/" + path;
        }
    }

    /**
     * Utility method for creating a disabling rule.
     *
     * @param type Type to match
     * @param name Name to match
     * @return JsonObject representing the UnitRule
     */
    private JsonElement getDisabledObjCRule(String type, String name) {
        if (type == null) {
            throw new NullPointerException();
        }
        if (name == null) {
            throw new NullPointerException();
        }
        // @formatter:off
        return new UnitRuleBuilder(true)
                .addCondition("type-match", type)
                .addCondition("name-match", name)
                .addAction("handling-mode", "disabled")
                .build();
        // @formatter:on
    }
}
