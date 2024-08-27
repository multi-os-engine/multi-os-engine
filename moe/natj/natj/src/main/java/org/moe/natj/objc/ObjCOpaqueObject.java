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

import org.moe.natj.general.Pointer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class ObjCOpaqueObject extends ObjCObject {

    protected ObjCOpaqueObject(Pointer peer) {
        super(peer);
    }

    public final HashMap<java.lang.Class<?>, Proxy> proxies = new HashMap<java.lang.Class<?>, Proxy>();

    public class ProtocolProxyHandler implements InvocationHandler {

        public HashMap<Method, Long> data;

        protected ProtocolProxyHandler(HashMap<Method, Long> data) {
            this.data = data;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            java.lang.Class<?> returnType = method.getReturnType();
            long mdata = data.get(method);
            Object result;
            if (returnType == Boolean.TYPE) {
                result = new Boolean(ObjCRuntime.forwardBooleanProtocolCall(getPeerPointer(), mdata, args));
            } else if (returnType == Byte.TYPE) {
                result = new Byte(ObjCRuntime.forwardByteProtocolCall(getPeerPointer(), mdata, args));
            } else if (returnType == Character.TYPE) {
                result = new Character(ObjCRuntime.forwardCharProtocolCall(getPeerPointer(), mdata, args));
            } else if (returnType == Short.TYPE) {
                result = new Short(ObjCRuntime.forwardShortProtocolCall(getPeerPointer(), mdata, args));
            } else if (returnType == Integer.TYPE) {
                result = new Integer(ObjCRuntime.forwardIntProtocolCall(getPeerPointer(), mdata, args));
            } else if (returnType == Long.TYPE) {
                result = new Long(ObjCRuntime.forwardLongProtocolCall(getPeerPointer(), mdata, args));
            } else if (returnType == Float.TYPE) {
                result = new Float(ObjCRuntime.forwardFloatProtocolCall(getPeerPointer(), mdata, args));
            } else if (returnType == Double.TYPE) {
                result = new Double(ObjCRuntime.forwardDoubleProtocolCall(getPeerPointer(), mdata, args));
            } else if (returnType == Void.TYPE) {
                ObjCRuntime.forwardVoidProtocolCall(getPeerPointer(), mdata, args);
                result = null;
            } else {
                result = ObjCRuntime.forwardObjectProtocolCall(getPeerPointer(), mdata, args);
            }
            return result;
        }

        public ObjCOpaqueObject getHolder() {
            return ObjCOpaqueObject.this;
        }

    }

    public ProtocolProxyHandler createProtocolProxyHandler(HashMap<Method, Long> data) {
        return new ProtocolProxyHandler(data);
    }

}
