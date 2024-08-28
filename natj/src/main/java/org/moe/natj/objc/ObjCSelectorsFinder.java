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

package org.moe.natj.objc;

import org.moe.natj.general.NativeObject;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ObjCSelectorsFinder {

    Map<Method, Selector> methodsWithSelectorsForClass = new HashMap<Method, Selector>();

    public Selector getSelectorForMethod(Method m) {
        Selector sel = methodsWithSelectorsForClass.get(m);
        return sel;
    }

    public void prepareParentsSelectorsList(Class<?> inputClass) {
        methodsWithSelectorsForClass = getMethodsWithSelectorsForClass(inputClass);
    }

    private static Map<Method, Selector> getMethodsWithSelectorsForClass(
            Class<?> type) {

        Map<Method, Selector> selectors = new HashMap<Method, Selector>();
        List<Class<?>> classList = new LinkedList<Class<?>>();
        Class<?>[] implInterfaces = type.getInterfaces();
        classList.addAll(Arrays.asList(implInterfaces));
        classList.addAll(getParents(type));
        Method classMethod = null;
        for (Class<?> cls : classList) {

            Method[] lookupMethods = null;
            if (!cls.isInterface()) {
                lookupMethods = cls.getDeclaredMethods();
            } else if (cls.isInterface()
                && cls.getAnnotation(ObjCProtocolName.class) != null) {
                lookupMethods = cls.getMethods();
            } else {
                continue;
            }

            for (Method meth : lookupMethods) {
                Selector selAnn = meth.getAnnotation(Selector.class);
                if (selAnn == null) {
                    continue;
                }
                try {
                    classMethod = type.getMethod(meth.getName(),
                            meth.getParameterTypes());
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                    System.out.printf("Did not found method:" + meth.getName()
                        + " For class:" + type.getSimpleName());
                    continue;
                } catch (SecurityException e) {
                    e.printStackTrace();
                    throw new RuntimeException("SecurityException "
                    + "in Registrator getMethodsWithSelectorsForClass");
                }
                if (classMethod.getDeclaringClass().equals(type)
                    && (classMethod.getAnnotation(Selector.class) == null)
                    && !Modifier.isNative(classMethod.getModifiers())) {
                    selectors.put(classMethod, selAnn);
                }
            }

        }
        return selectors;
    }

    private static List<Class<?>> getParents(Class<?> type) {
        List<Class<?>> resultList = new LinkedList<Class<?>>();
        Class<?> superCls = type.getSuperclass();
        if (superCls != null && NativeObject.class.isAssignableFrom(superCls)) {
            resultList.add(superCls);
            Class<?>[] interfaces = superCls.getInterfaces();
            if (interfaces.length > 0) {
                resultList.addAll(Arrays.asList(interfaces));
            }
            resultList.addAll(getParents(superCls));
        }
        return resultList;
    }

}
