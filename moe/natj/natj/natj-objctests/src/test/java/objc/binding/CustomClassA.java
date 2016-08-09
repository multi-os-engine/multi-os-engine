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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class CustomClassA extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CustomClassA(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CustomClassA alloc();

    @Generated
    @Selector("getStringFive:")
    public static native String getStringFive(CustomClassA clazz);

    @Generated
    @Selector("getStringFour:")
    public static native String getStringFour(CustomClassA clazz);

    @Generated
    @Selector("getStringOne:")
    public static native String getStringOne(CustomClassA clazz);

    @Generated
    @Selector("getStringThree:")
    public static native String getStringThree(CustomClassA clazz);

    @Generated
    @Selector("getStringTwo:")
    public static native String getStringTwo(CustomClassA clazz);

    @Generated
    @Selector("init")
    public native CustomClassA init();

    @Generated
    @Selector("setStringFive:")
    public native void setStringFive(String value);

    @Generated
    @Selector("setStringFour:")
    public native void setStringFour(String value);

    @Generated
    @Selector("setStringOne:")
    public native void setStringOne(String value);

    @Generated
    @Selector("setStringThree:")
    public native void setStringThree(String value);

    @Generated
    @Selector("setStringTwo:")
    public native void setStringTwo(String value);

    @Generated
    @Selector("stringFive")
    public native String stringFive();

    @Generated
    @Selector("stringFour")
    public native String stringFour();

    @Generated
    @Selector("stringOne")
    public native String stringOne();

    @Generated
    @Selector("stringThree")
    public native String stringThree();

    @Generated
    @Selector("stringTwo")
    public native String stringTwo();
}
