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

package org.moe.natj.processor.cxx;

import org.moe.natj.processor.cxx.decl.invokable.InvokableInfo;
import org.moe.natj.processor.cxx.decl.invokable.MethodVirtuality;
import org.moe.natj.processor.cxx.decl.invokable.OperatorInfo;
import org.moe.natj.processor.cxx.decl.invokable.OperatorKind;
import org.moe.natj.processor.cxx.utility.BridgeMethodDesc;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Class info resolver.
 */
public class CxxClassInfoResolver {

    /**
     * Class info to resolve.
     */
    private final CxxClassInfo info;

    /**
     * Create a new CxxClassInfoResolver.
     *
     * @param info Class info to resolve
     */
    private CxxClassInfoResolver(CxxClassInfo info) {
        if (info == null) {
            throw new NullPointerException();
        }
        this.info = info;
    }

    /**
     * Constructs a correct resolution order.
     *
     * @param classInfos Class info list to resolve
     * @return Correctly ordered list
     */
    private static List<CxxClassInfo> getResolutionOrder(final Collection<CxxClassInfo> classInfos) {
        final ArrayList<CxxClassInfo> infos = new ArrayList<>();
        for (CxxClassInfo classInfo : classInfos) {
            final HashSet<CxxClassInfo> processing = new HashSet<>();
            buildResolutionOrder(classInfo, infos, processing);
        }
        return infos;
    }

    /**
     * Constructs a correct resolution order for the specified class info.
     *
     * @param classInfo           Class info to resolve
     * @param order               Current order
     * @param infosBeingProcessed Class infos in queue
     */
    private static void buildResolutionOrder(CxxClassInfo classInfo, List<CxxClassInfo> order,
                                             Set<CxxClassInfo> infosBeingProcessed) {
        if (infosBeingProcessed.contains(classInfo)) {
            throw new RuntimeException("Could not resolve due to circular dependency");
        }
        infosBeingProcessed.add(classInfo);
        for (CxxClassInfo superInfo : classInfo.getCxxSupers()) {
            buildResolutionOrder(superInfo, order, infosBeingProcessed);
        }
        if (!order.contains(classInfo)) {
            order.add(classInfo);
        }
    }

    /**
     * Resolves all class infos.
     *
     * @param classInfos Class infos to resolve
     */
    public static void resolveAll(Collection<CxxClassInfo> classInfos) {
        if (classInfos == null) {
            throw new NullPointerException();
        }
        final List<CxxClassInfo> orderedClassInfos = getResolutionOrder(classInfos);
        for (CxxClassInfo classInfo : orderedClassInfos) {
            CxxClassInfoResolver cir = new CxxClassInfoResolver(classInfo);
            cir.resolve();
        }
    }

    /**
     * Returns the set of class methods and variables.
     *
     * @return Set of class methods and variables
     */
    private Set<CxxMemberImplInfo> getClassMethodsAndVars() {
        return info.getMembers().stream()
                .filter(member -> !(member instanceof OperatorInfo))
                .map(member -> new CxxMemberImplInfo(member, info))
                .collect(Collectors.toSet());
    }

    /**
     * Returns the set of class operators.
     *
     * @return Set of class operators
     */
    private Set<CxxMemberImplInfo> getClassOperators() {
        return info.getMembers().stream()
                .filter(member -> member instanceof OperatorInfo)
                .map(member -> new CxxMemberImplInfo((OperatorInfo) member, info))
                .collect(Collectors.toSet());
    }

    /**
     * Collects member methods from super classes.
     *
     * @return Set of super member methods.
     */
    private Set<CxxMemberImplInfo> collectSuperMembers() {
        // Add methods from info
        final HashSet<CxxMemberImplInfo> methods = new HashSet<>();
        final HashSet<CxxMemberImplInfo> methodImpls = new HashSet<>();
        info.getMembers().stream()
                .map(member -> new CxxMemberImplInfo(member, info))
                .forEach(impl -> {
                    methods.add(impl);
                    methodImpls.add(impl);
                });

        // Add methods from all other super C++ interfaces
        final HashSet<CxxClassInfo> processed = new HashSet<>();
        processed.add(info);
        HashSet<CxxClassInfo> toProcess = new HashSet<>(info.getCxxSupers());
        toProcess.removeAll(processed);
        processed.addAll(toProcess);
        while (!toProcess.isEmpty()) {
            for (CxxClassInfo current : toProcess) {
                current.getMembers().forEach(member -> methods.add(new CxxMemberImplInfo(member, current)));
            }

            HashSet<CxxClassInfo> newToProcess = new HashSet<>();
            for (CxxClassInfo current : toProcess) {
                newToProcess.addAll(current.getCxxSupers());
            }
            toProcess = newToProcess;
            toProcess.removeAll(processed);
            processed.addAll(toProcess);
        }

        // Remove methods from info
        methods.removeAll(methodImpls);
        return methods;
    }

    /**
     * Collects member methods from super classes which can only be accessed through a direct interface.
     *
     * @return Set of direct-only super member methods.
     */
    private Set<CxxMemberImplInfo> collectSuperDirectOnlyMembers() {
        // Add methods from info
        final HashSet<CxxMemberImplInfo> methods = new HashSet<>();

        // Add methods from all other super C++ interfaces
        final HashSet<CxxClassInfo> processed = new HashSet<>();
        processed.add(info);
        HashSet<CxxClassInfo> toProcess = new HashSet<>(info.getCxxSupers());
        toProcess.removeAll(processed);
        processed.addAll(toProcess);
        while (!toProcess.isEmpty()) {
            for (CxxClassInfo current : toProcess) {
                methods.addAll(current.getInheritedDirectOnlyMethods());
            }

            HashSet<CxxClassInfo> newToProcess = new HashSet<>();
            for (CxxClassInfo current : toProcess) {
                newToProcess.addAll(current.getCxxSupers());
            }
            toProcess = newToProcess;
            toProcess.removeAll(processed);
            processed.addAll(toProcess);
        }

        return methods;
    }

    /**
     * Collects bridge methods from super classes.
     *
     * @return Set of bridge methods.
     */
    private Set<BridgeMethodDesc> collectBridgeMembers() {
        // Add methods from info
        final HashSet<BridgeMethodDesc> methods = new HashSet<>();

        // Add methods from all other super C++ interfaces
        final HashSet<CxxClassInfo> processed = new HashSet<>();
        processed.add(info);
        HashSet<CxxClassInfo> toProcess = new HashSet<>(info.getCxxSupers());
        toProcess.removeAll(processed);
        processed.addAll(toProcess);
        while (!toProcess.isEmpty()) {
            for (CxxClassInfo current : toProcess) {
                methods.addAll(current.getMemberBridgeMethods());
            }

            HashSet<CxxClassInfo> newToProcess = new HashSet<>();
            for (CxxClassInfo current : toProcess) {
                newToProcess.addAll(current.getCxxSupers());
            }
            toProcess = newToProcess;
            toProcess.removeAll(processed);
            processed.addAll(toProcess);
        }

        return methods;
    }

    /**
     * Returns the set of super class methods and variables.
     *
     * @return Set of super class methods and variables
     */
    private Set<CxxMemberImplInfo> getSuperMethodsAndVars() {
        return collectSuperMembers().stream()
                .filter(impl -> !(impl.declInfo instanceof OperatorInfo))
                .collect(Collectors.toSet());
    }

    /**
     * Returns the set of super class operators.
     *
     * @return Set of super class operators
     */
    private Set<CxxMemberImplInfo> getSuperOperators() {
        return collectSuperMembers().stream()
                .filter(impl -> impl.declInfo instanceof OperatorInfo)
                .collect(Collectors.toSet());
    }

    /**
     * Resolve class members.
     */
    private void resolve() {
        try {
            resolveInternal();
        } catch (Throwable e) {
            throw new RuntimeException("Failed to resolve class " + info.mapperType.getInternalName(), e);
        }
    }

    /**
     * Resolve class members.
     */
    private void resolveInternal() {
        final Set<CxxMemberImplInfo> cm = getClassMethodsAndVars();
        final Set<CxxMemberImplInfo> co = getClassOperators();
        final Set<CxxMemberImplInfo> sm = getSuperMethodsAndVars();
        final Set<CxxMemberImplInfo> so = getSuperOperators();
        final Set<BridgeMethodDesc> br = new HashSet<>(info.getMemberBridgeMethods());

        final CxxClassInfoResolutionResult rr = info.resolutionResult;

        // Prepare result containers
        final HashSet<CxxMemberImplInfo> implemented = new HashSet<>();
        final HashSet<CxxMemberImplInfo> directOnly = new HashSet<>(collectSuperDirectOnlyMembers());

        // Add all methods to implemented
        implemented.addAll(cm);
        implemented.addAll(co);
        implemented.addAll(sm);
        implemented.addAll(so);

        // Look for pure virtual methods
        final boolean hasPureVirtualMethod = implemented.stream()
                .anyMatch(impl -> impl.declInfo instanceof InvokableInfo
                        && ((InvokableInfo) impl.declInfo).getVirtuality() == MethodVirtuality.PURE_VIRTUAL);

        // Look for invalidated operators
        final HashSet<OperatorKind> invalidatedOps = new HashSet<>();
        co.forEach(op -> {
            // Get operator
            final OperatorKind kind = ((OperatorInfo) op.declInfo).getOperatorKind();
            if (invalidatedOps.contains(kind)) {
                return;
            }
            invalidatedOps.add(kind);

            // Collect colliding operators from super operators
            so.forEach(sop -> {
                final OperatorKind skind = ((OperatorInfo) sop.declInfo).getOperatorKind();
                if (skind.equals(kind)) {
                    directOnly.add(sop);
                }
            });
        });

        // Remove direct only members from `implemented`
        implemented.removeAll(directOnly);

        // Add bridge methods
        br.addAll(collectBridgeMembers());

        // Set resolution result
        rr.setImplementedMethods(implemented);
        rr.setInheritedDirectOnlyMethods(directOnly);
        rr.setClassHasPureVirtualMethod(hasPureVirtualMethod);
        rr.setBridgeMethodDescs(br);
    }
}
