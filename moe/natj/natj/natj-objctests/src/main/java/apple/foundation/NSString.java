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

package apple.foundation;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSString extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("componentsSeparatedByString:")
    public native NSArray componentsSeparatedByString(String separator);

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("init")
    public native NSString init();

    @Generated
    @Selector("length")
    public native long length();

    @Generated
    @Selector("stringWithString:")
    public static native NSString stringWithString(String string);
}
