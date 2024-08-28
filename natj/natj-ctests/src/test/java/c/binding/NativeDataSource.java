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

package c.binding;

import c.binding.struct.NJRect;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;

@Generated
@Runtime(CRuntime.class)
@Library("TestClassesC")
public final class NativeDataSource {
    static {
        NatJ.register();
    }

    @Generated
    @CFunction()
    public static native void NativeDataSourceInit();

    @Generated
    @CFunction("getBoolTestPtr")
    public static native ConstBoolPtr getBoolTestPtr();

    @Generated
    @CFunction("getBoolZeroPtr")
    public static native ConstBoolPtr getBoolZeroPtr();

    @Generated
    @CFunction("getByteTestPtr")
    public static native ConstBytePtr getByteTestPtr();

    @Generated
    @CFunction("getByteZeroPtr")
    public static native ConstBytePtr getByteZeroPtr();

    @Generated
    @CFunction("getCharTestPtr")
    public static native ConstCharPtr getCharTestPtr();

    @Generated
    @CFunction("getCharZeroPtr")
    public static native ConstCharPtr getCharZeroPtr();

    @Generated
    @CFunction("getWCharTTestPtr")
    public static native ConstWCharTPtr getWCharTestPtr();

    @Generated
    @CFunction("getWCharTZeroPtr")
    public static native ConstWCharTPtr getWCharTZeroPtr();

    @Generated
    @CFunction("getDoubleTestPtr")
    public static native ConstDoublePtr getDoubleTestPtr();

    @Generated
    @CFunction("getDoubleZeroPtr")
    public static native ConstDoublePtr getDoubleZeroPtr();

    @Generated
    @CFunction("getFloatTestPtr")
    public static native ConstFloatPtr getFloatTestPtr();

    @Generated
    @CFunction("getFloatZeroPtr")
    public static native ConstFloatPtr getFloatZeroPtr();

    @Generated
    @CFunction("getIntTestPtr")
    public static native ConstIntPtr getIntTestPtr();

    @Generated
    @CFunction("getIntZeroPtr")
    public static native ConstIntPtr getIntZeroPtr();

    @Generated
    @CFunction("getLongTestPtr")
    public static native ConstLongPtr getLongTestPtr();

    @Generated
    @CFunction("getLongZeroPtr")
    public static native ConstLongPtr getLongZeroPtr();

    @Generated
    @CFunction("getNFloatTestPtr")
    public static native ConstNFloatPtr getNFloatTestPtr();

    @Generated
    @CFunction("getNFloatZeroPtr")
    public static native ConstNFloatPtr getNFloatZeroPtr();

    @Generated
    @CFunction("getNIntTestPtr")
    public static native ConstNIntPtr getNIntTestPtr();

    @Generated
    @CFunction("getNIntZeroPtr")
    public static native ConstNIntPtr getNIntZeroPtr();

    @Generated
    @CFunction("getNUIntTestPtr")
    public static native ConstNUIntPtr getNUIntTestPtr();

    @Generated
    @CFunction("getNUIntZeroPtr")
    public static native ConstNUIntPtr getNUIntZeroPtr();

    @Generated
    @CFunction("getNLongTestPtr")
    public static native ConstNLongPtr getNLongTestPtr();

    @Generated
    @CFunction("getNLongZeroPtr")
    public static native ConstNLongPtr getNLongZeroPtr();

    @Generated
    @CFunction("getNULongTestPtr")
    public static native ConstNULongPtr getNULongTestPtr();

    @Generated
    @CFunction("getNULongZeroPtr")
    public static native ConstNULongPtr getNULongZeroPtr();

    @Generated
    @CFunction("getShortTestPtr")
    public static native ConstShortPtr getShortTestPtr();

    @Generated
    @CFunction("getShortZeroPtr")
    public static native ConstShortPtr getShortZeroPtr();

    @Generated
    @CFunction("getStructTestPtr")
    @ReferenceInfo(type = NJRect.class)
    public static native ConstPtr<NJRect> getStructTestPtr();

    @Generated
    @CFunction("getStructZeroPtr")
    @ReferenceInfo(type = NJRect.class)
    public static native ConstPtr<NJRect> getStructZeroPtr();

}
