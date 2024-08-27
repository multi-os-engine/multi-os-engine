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

package cxx.tests;

import org.moe.natj.processor.cxx.ITypeResolverPlugin;
import org.moe.natj.processor.cxx.TypeResolverPluginConfiguration;

public class TestTypeResolver implements ITypeResolverPlugin {
    private static final String CLASS_PREFIXES = "cxx/tests/binding/DynamicTypeTests$";

    @Override
    public void setup(TypeResolverPluginConfiguration config) {
        config.registerType(1, CLASS_PREFIXES + "DynTypeA");
        config.registerType(2, CLASS_PREFIXES + "DynTypeB");
        config.registerType(3, CLASS_PREFIXES + "DynTypeC");
        config.registerType(4, CLASS_PREFIXES + "DynTypeD");
        config.registerType(11, CLASS_PREFIXES + "DynTypeX");
        config.registerType(12, CLASS_PREFIXES + "DynTypeY");
        config.registerType(13, CLASS_PREFIXES + "DynTypeZ");
        config.registerType(14, CLASS_PREFIXES + "DynTypeW");
        config.registerType(21, CLASS_PREFIXES + "DynTypeM");
        config.registerType(22, CLASS_PREFIXES + "DynTypeN");
        config.userHeaders.add("binding/DynamicTypes.hpp");
    }

    @Override
    public boolean match(String internalName) {
        return internalName.startsWith(CLASS_PREFIXES);
    }

    @Override
    public String nativeTypeIDResolver(String nativeObject) {
        return "return reinterpret_cast<natj::cxx::tests::binding::DynTypeRoot*>(" + nativeObject + ")->getTID();";
    }

    @Override
    public String getImplementingClass() {
        return CLASS_PREFIXES + "DynTypeA";
    }
}
