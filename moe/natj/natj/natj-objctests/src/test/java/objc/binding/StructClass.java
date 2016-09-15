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

package objc.binding;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;
import objc.binding.struct.NG_ISMulti_Struct;
import objc.binding.struct.NG_I_Struct;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class StructClass extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected StructClass(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("ISMultiStructCreate::")
    @ByValue
    public native NG_ISMulti_Struct ISMultiStructCreate(int x, int y);

    @Generated
    @Selector("ISMultiStructCreate::")
    @ByValue
    public static native NG_ISMulti_Struct ISMultiStructCreate_static(int x,
                                                                      int y);

    @Generated
    @Selector("ISMultiStructCreatePtr::")
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native NG_ISMulti_Struct ISMultiStructCreatePtr(int x, int y);

    @Generated
    @Selector("ISMultiStructCreatePtr::")
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native NG_ISMulti_Struct ISMultiStructCreatePtr_static(int x,
                                                                         int y);

    @Generated
    @Selector("ISMultiStructFind:::")
    public native int ISMultiStructFind(@ByValue NG_ISMulti_Struct value,
                                        int x, int y);

    @Generated
    @Selector("ISMultiStructFind:::")
    public static native int ISMultiStructFind_static(
            @ByValue NG_ISMulti_Struct value, int x, int y);

    @Generated
    @Selector("ISMultiStructRefFree:")
    public native void ISMultiStructRefFree(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_ISMulti_Struct value);

    @Generated
    @Selector("ISMultiStructRefFree:")
    public static native void ISMultiStructRefFree_static(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_ISMulti_Struct value);

    @Generated
    @Selector("IStructCompare:::")
    public native boolean IStructCompare(@ByValue NG_I_Struct value, int x,
                                         int y);

    @Generated
    @Selector("IStructCompare:::")
    public static native boolean IStructCompare_static(
            @ByValue NG_I_Struct value, int x, int y);

    @Generated
    @Selector("IStructCreate::")
    @ByValue
    public native NG_I_Struct IStructCreate(int x, int y);

    @Generated
    @Selector("IStructCreate::")
    @ByValue
    public static native NG_I_Struct IStructCreate_static(int x, int y);

    @Generated
    @Selector("IStructCreatePtr:")
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native NG_I_Struct IStructCreatePtr(@ByValue NG_I_Struct value);

    @Generated
    @Selector("IStructCreatePtr:")
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native NG_I_Struct IStructCreatePtr_static(
            @ByValue NG_I_Struct value);

    @Generated
    @Selector("IStructRefCompare:::")
    public native boolean IStructRefCompare(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_I_Struct value,
            int x, int y);

    @Generated
    @Selector("IStructRefCompare:::")
    public static native boolean IStructRefCompare_static(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_I_Struct value,
            int x, int y);

    @Generated
    @Selector("IStructRefFree:")
    public native void IStructRefFree(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_I_Struct value);

    @Generated
    @Selector("IStructRefFree:")
    public static native void IStructRefFree_static(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_I_Struct value);

    @Generated
    @Owned
    @Selector("alloc")
    public static native StructClass alloc();

    @Generated
    @Selector("init")
    public native StructClass init();
}
