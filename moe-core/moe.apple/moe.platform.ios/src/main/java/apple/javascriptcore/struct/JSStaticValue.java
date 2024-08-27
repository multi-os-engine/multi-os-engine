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

package apple.javascriptcore.struct;

import apple.javascriptcore.opaque.JSContextRef;
import apple.javascriptcore.opaque.JSObjectRef;
import apple.javascriptcore.opaque.JSStringRef;
import apple.javascriptcore.opaque.JSValueRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;

@Generated
@Structure()
public final class JSStaticValue extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public JSStaticValue() {
        super(JSStaticValue.class);
    }

    @Generated
    protected JSStaticValue(Pointer peer) {
        super(peer);
    }

    @Generated
    public JSStaticValue(String name, @FunctionPtr(name = "call_getProperty") Function_getProperty getProperty,
            @FunctionPtr(name = "call_setProperty") Function_setProperty setProperty, int attributes) {
        super(JSStaticValue.class);
        setName(name);
        setGetProperty(getProperty);
        setSetProperty(setProperty);
        setAttributes(attributes);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native String name();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setName(String value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_getProperty")
    public native Function_getProperty getProperty();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGetProperty(@FunctionPtr(name = "call_getProperty") Function_getProperty value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_setProperty")
    public native Function_setProperty setProperty();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSetProperty(@FunctionPtr(name = "call_setProperty") Function_setProperty value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int attributes();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAttributes(int value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getProperty {
        @Generated
        JSValueRef call_getProperty(JSContextRef arg0, JSObjectRef arg1, JSStringRef arg2,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_setProperty {
        @Generated
        boolean call_setProperty(JSContextRef arg0, JSObjectRef arg1, JSStringRef arg2, JSValueRef arg3,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg4);
    }
}
