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

import apple.javascriptcore.opaque.JSClassRef;
import apple.javascriptcore.opaque.JSContextRef;
import apple.javascriptcore.opaque.JSObjectRef;
import apple.javascriptcore.opaque.JSPropertyNameAccumulatorRef;
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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.Ptr;

@Generated
@Structure()
public final class JSClassDefinition extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public JSClassDefinition() {
        super(JSClassDefinition.class);
    }

    @Generated
    protected JSClassDefinition(Pointer peer) {
        super(peer);
    }

    /**
     * current (and only) version is 0
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    /**
     * current (and only) version is 0
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int attributes();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAttributes(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native String className();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setClassName(String value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native JSClassRef parentClass();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setParentClass(JSClassRef value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ReferenceInfo(type = JSStaticValue.class)
    public native ConstPtr<JSStaticValue> staticValues();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setStaticValues(ConstPtr<JSStaticValue> value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @ReferenceInfo(type = JSStaticFunction.class)
    public native ConstPtr<JSStaticFunction> staticFunctions();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setStaticFunctions(ConstPtr<JSStaticFunction> value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @FunctionPtr(name = "call_initialize")
    public native Function_initialize initialize();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setInitialize(@FunctionPtr(name = "call_initialize") Function_initialize value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @FunctionPtr(name = "call__finalize")
    public native Function__finalize _finalize();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void set_finalize(@FunctionPtr(name = "call__finalize") Function__finalize value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @FunctionPtr(name = "call_hasProperty")
    public native Function_hasProperty hasProperty();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setHasProperty(@FunctionPtr(name = "call_hasProperty") Function_hasProperty value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @FunctionPtr(name = "call_getProperty")
    public native Function_getProperty getProperty();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setGetProperty(@FunctionPtr(name = "call_getProperty") Function_getProperty value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @FunctionPtr(name = "call_setProperty")
    public native Function_setProperty setProperty();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setSetProperty(@FunctionPtr(name = "call_setProperty") Function_setProperty value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    @FunctionPtr(name = "call_deleteProperty")
    public native Function_deleteProperty deleteProperty();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setDeleteProperty(@FunctionPtr(name = "call_deleteProperty") Function_deleteProperty value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    @FunctionPtr(name = "call_getPropertyNames")
    public native Function_getPropertyNames getPropertyNames();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setGetPropertyNames(
            @FunctionPtr(name = "call_getPropertyNames") Function_getPropertyNames value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    @FunctionPtr(name = "call_callAsFunction")
    public native Function_callAsFunction callAsFunction();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setCallAsFunction(@FunctionPtr(name = "call_callAsFunction") Function_callAsFunction value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    @FunctionPtr(name = "call_callAsConstructor")
    public native Function_callAsConstructor callAsConstructor();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setCallAsConstructor(
            @FunctionPtr(name = "call_callAsConstructor") Function_callAsConstructor value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    @FunctionPtr(name = "call_hasInstance")
    public native Function_hasInstance hasInstance();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setHasInstance(@FunctionPtr(name = "call_hasInstance") Function_hasInstance value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    @FunctionPtr(name = "call_convertToType")
    public native Function_convertToType convertToType();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setConvertToType(@FunctionPtr(name = "call_convertToType") Function_convertToType value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_initialize {
        @Generated
        void call_initialize(JSContextRef arg0, JSObjectRef arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__finalize {
        @Generated
        void call__finalize(JSObjectRef arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_hasProperty {
        @Generated
        boolean call_hasProperty(JSContextRef arg0, JSObjectRef arg1, JSStringRef arg2);
    }

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

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_deleteProperty {
        @Generated
        boolean call_deleteProperty(JSContextRef arg0, JSObjectRef arg1, JSStringRef arg2,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getPropertyNames {
        @Generated
        void call_getPropertyNames(JSContextRef arg0, JSObjectRef arg1, JSPropertyNameAccumulatorRef arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_callAsFunction {
        @Generated
        JSValueRef call_callAsFunction(JSContextRef arg0, JSObjectRef arg1, JSObjectRef arg2, @NUInt long arg3,
                @ReferenceInfo(type = JSValueRef.class) ConstPtr<JSValueRef> arg4,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_callAsConstructor {
        @Generated
        JSObjectRef call_callAsConstructor(JSContextRef arg0, JSObjectRef arg1, @NUInt long arg2,
                @ReferenceInfo(type = JSValueRef.class) ConstPtr<JSValueRef> arg3,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_hasInstance {
        @Generated
        boolean call_hasInstance(JSContextRef arg0, JSObjectRef arg1, JSValueRef arg2,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_convertToType {
        @Generated
        JSValueRef call_convertToType(JSContextRef arg0, JSObjectRef arg1, int arg2,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg3);
    }
}
