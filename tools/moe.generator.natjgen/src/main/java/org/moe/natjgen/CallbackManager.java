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

import org.moe.natjgen.Type.CallbackArgument;
import org.moe.natjgen.TypeResolver.Context;

import java.util.ArrayList;

public class CallbackManager {

    /**
     * Block type resolver
     */
    protected static final TypeResolver blockTResolver;

    /**
     * Function type resolver
     */
    protected static final TypeResolver funcTResolver;

    static {
        blockTResolver = new TypeResolver("Objective-C Block", Constants.ObjCRuntime, Context.CALLBACK);
        blockTResolver.set(TypeResolver.VOID, TypeResolver.BOTH, false, true, true);
        blockTResolver.add(TypeResolver.VOID, TypeResolver.RETURN, true, false, false);
        blockTResolver.set(TypeResolver.PRIMITIVE, TypeResolver.BOTH, true, true, true);
        blockTResolver.set(TypeResolver.STRUCT, TypeResolver.BOTH, true, true, true);
        blockTResolver.set(TypeResolver.OPAQUE, TypeResolver.BOTH, true, true, true);
        blockTResolver.set(TypeResolver.FUNCTION_CB, TypeResolver.BOTH, false, true, false);
        blockTResolver.set(TypeResolver.OBJC_OBJECT, TypeResolver.BOTH, true, true, true);
        blockTResolver.set(TypeResolver.OBJC_CLASS, TypeResolver.BOTH, true, false, false);
        blockTResolver.set(TypeResolver.OBJC_SELECTOR, TypeResolver.BOTH, true, false, false);
        blockTResolver.set(TypeResolver.OBJC_BLOCK, TypeResolver.BOTH, true, false, false);
        blockTResolver.setSupportedMappers(new String[] { Constants.CStringMapper, Constants.ObjCStringMapper
        });

        funcTResolver = new TypeResolver("Function Callback", Constants.CRuntime, Context.CALLBACK);
        funcTResolver.set(TypeResolver.VOID, TypeResolver.BOTH, false, true, true);
        funcTResolver.add(TypeResolver.VOID, TypeResolver.RETURN, true, false, false);
        funcTResolver.set(TypeResolver.PRIMITIVE, TypeResolver.BOTH, true, true, true);
        funcTResolver.set(TypeResolver.STRUCT, TypeResolver.BOTH, true, true, true);
        funcTResolver.set(TypeResolver.OPAQUE, TypeResolver.BOTH, true, true, true);
        funcTResolver.set(TypeResolver.FUNCTION_CB, TypeResolver.BOTH, false, true, false);
        funcTResolver.set(TypeResolver.OBJC_OBJECT, TypeResolver.BOTH, true, true, true);
        funcTResolver.set(TypeResolver.OBJC_CLASS, TypeResolver.BOTH, true, false, false);
        funcTResolver.set(TypeResolver.OBJC_SELECTOR, TypeResolver.BOTH, true, false, false);
        funcTResolver.set(TypeResolver.OBJC_BLOCK, TypeResolver.BOTH, true, false, false);
        funcTResolver.setSupportedMappers(new String[] { Constants.CStringMapper, Constants.ObjCStringMapper
        });
    }

    private final AbstractUnitManager manager;
    private final String callbackName;
    private final String prefix;
    private final String callbackPrefix = "call_";
    private final String commonSuffix;
    private final Type type;
    private final Type.CallbackDescriptor descriptor;
    private final TypeResolver tResolver;
    private final String runtime;

    private class NestedCallback implements IParameterizedCallable {
        private final ArrayList<CalleeArgument> arguments;

        public NestedCallback() {
            this.arguments = new ArrayList<>();
            for (CallbackArgument a : type.getCallbackDescriptor().getArguments()) {
                arguments.add(new CalleeArgument(a.getName(), a.getType()));
            }
        }

        @Override
        public ArrayList<CalleeArgument> getArguments() {
            return arguments;
        }

        @Override
        public boolean isVariadic() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String getVariadicName() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String getJavaName() {
            return getName();
        }

        @Override
        public Type getType() {
            return type;
        }

        @Override
        public String getDefaultRuntime() {
            return runtime;
        }
    }

    public CallbackManager(AbstractUnitManager manager, IParameterizedCallable callable, int idx) {
        if (manager == null || callable == null || idx < -1) {
            throw new IllegalArgumentException();
        }

        int spec_arg_count = 0;
        for (CalleeArgument arg : callable.getArguments()) {
            if (arg.getType().isObjCBlock() || arg.getType().isFunctionPtr()) {
                ++spec_arg_count;
            }
        }
        if (idx == -1) {
            commonSuffix = "_ret";
        } else if (spec_arg_count > 1) {
            commonSuffix = "_" + idx;
        } else {
            commonSuffix = "";
        }

        if (idx == -1) {
            type = callable.getType();
        } else {
            type = callable.getArguments().get(idx).getType();
        }

        this.manager = manager;
        this.callbackName = callable.getJavaName();
        this.descriptor = type.getCallbackDescriptor();
        this.runtime = callable.getDefaultRuntime();
        if (type.isObjCBlock()) {
            prefix = "Block_";
            tResolver = blockTResolver;
        } else {
            prefix = "Function_";
            tResolver = funcTResolver;
        }

        callbackPathMatch[0] = tResolver == funcTResolver ? TypeConfiguration.C_CALLBACK : TypeConfiguration.OBJC_BLOCK;
        callbackPathMatch[1] = getManager().getUnitName() + ":" + getName();
        updateMemberPreferredTypes(descriptor);
    }

    public final boolean isSupported() {
        // Check return type
        if (descriptor.getType().isCallback()) {
            CallbackManager cbman = descriptor.getType().getCallbackManager();
            if (cbman == null) {
                cbman = new CallbackManager(manager, new NestedCallback(), -1);
                descriptor.getType().setCallbackManager(cbman);
            }
            if (!cbman.isSupported()) {
                return false;
            }
        }
        if (!tResolver.supports(descriptor.getType(), false)) {
            return false;
        }

        // Check argument types
        int idx = 0;
        for (Type.CallbackArgument cb_arg : descriptor.getArguments()) {
            if (cb_arg.getType().isCallback()) {
                CallbackManager cbman = cb_arg.getType().getCallbackManager();
                if (cbman == null) {
                    cbman = new CallbackManager(manager, new NestedCallback(), idx);
                    cb_arg.getType().setCallbackManager(cbman);
                }
                if (!cbman.isSupported()) {
                    return false;
                }
            }
            if (!tResolver.supports(cb_arg.getType(), true)) {
                return false;
            }
            ++idx;
        }

        return true;
    }

    public final String getName() {
        return prefix + callbackName + commonSuffix;
    }

    public final void update(ClassMemberEditor cme) throws GeneratorException {
        if (cme.getManager() != manager) {
            return;
        }

        ClassEditor editor = cme.getBlockClass(getName());

        if (editor != null && editor.isEditable()) {
            editor.setInterface();
            editor.setClassName(getName());
            editor.setSuperClass(null);
            editor.setInterfaces();

            ModifierEditor modifiers = editor.getModifiers();
            modifiers.setPublic();
            modifiers.setGenerated();
            modifiers.setRuntime(cme.getManager().addImport(runtime));

            editor.close();
        }

        if (editor != null) {
            ClassMemberEditor cme2 = editor.getMemberEditor();
            updateCallback(cme2);
            cme2.close();
        }
    }

    private final void updateCallback(ClassMemberEditor cme) throws GeneratorException {
        // Generate nested callback first
        if (descriptor.getType().isCallback()) {
            CallbackManager cbman = descriptor.getType().getCallbackManager();
            cbman.update(cme);
        }
        for (Type.CallbackArgument arg : descriptor.getArguments()) {
            if (arg.getType().isCallback()) {
                CallbackManager cbman = arg.getType().getCallbackManager();
                cbman.update(cme);
            }
        }

        MethodEditor editor = cme.getMehtod(getCallbackName(), false, descriptor.getArguments().size());
        if (editor == null) {
            editor = cme.newMethod();
        }

        if (editor != null && editor.isEditable()) {
            editor.setName(getCallbackName());
            editor.setType(descriptor.getType(), tResolver);
            editor.setArgumentCount(descriptor.getArguments().size());
            int idx = 0;
            for (Type.CallbackArgument arg : descriptor.getArguments()) {
                editor.setArgument(idx, arg.getName(), arg.getType(), tResolver);
                ++idx;
            }

            ModifierEditor modifiers = editor.getModifiers();
            modifiers.setGenerated();

            editor.close();
        }

        // Add uncertain bindings to outputTypeConfiguration
        TypeConfiguration otc = getManager().getIndexer().getOutputTypeConfiguration();
        for (MethodEditor.UncertainElem uncert : editor.getUncertains()) {
            callbackPathMatch[3] = uncert.getLocation();
            if (uncert.getDescriptor().isFallback()) {
                getManager().logType(Statistics.UNCERTAIN_TYPE, Statistics.CALLBACK);
                otc.setPreferredType(callbackPathMatch, null, uncert.getDescriptor().getOptions());
            } else {
                getManager().logType(Statistics.RESOLVED_UNCERTAIN_TYPE, Statistics.CALLBACK);
                otc.setPreferredType(callbackPathMatch, uncert.getDescriptor().getResolved(),
                        uncert.getDescriptor().getOptions());
            }
        }
    }

    public final String getCallbackName() {
        return callbackPrefix + callbackName + commonSuffix;
    }

    public final AbstractUnitManager getManager() {
        return manager;
    }

    /**
     * Cached callback path match
     */
    protected final String callbackPathMatch[] = new String[] { null, null, TypeConfiguration.LOCATION, null
    };

    protected void updateMemberPreferredTypes(Type.CallbackDescriptor method) {
        TypeConfiguration tConf = getManager().getIndexer().getInputTypeConfiguration();

        // Update uncertain binding resolving
        callbackPathMatch[3] = "-1";
        String preferredType = tConf.getPreferredType(callbackPathMatch);
        method.getType().setPreferredResolving(preferredType);

        int idx = 0;
        for (Type.CallbackArgument arg : method.getArguments()) {
            callbackPathMatch[3] = Integer.toString(idx);
            arg.getType().setPreferredResolving(tConf.getPreferredType(callbackPathMatch));
            ++idx;
        }
    }

}
