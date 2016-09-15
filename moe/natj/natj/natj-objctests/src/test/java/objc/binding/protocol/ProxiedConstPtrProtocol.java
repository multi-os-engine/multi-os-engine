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

package objc.binding.protocol;

import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.coregraphics.struct.CGSize;

@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ProxiedConstPtrProtocol")
public interface ProxiedConstPtrProtocol {

    @Selector("returnConstBoolPtr:")
    boolean returnConstBoolPtr(ConstBoolPtr value);

    @Selector("returnConstBytePtr:")
    byte returnConstBytePtr(ConstBytePtr value);

    @Selector("returnConstCharPtr:")
    char returnConstCharPtr(ConstCharPtr value);

    @Selector("returnConstDoublePtr:")
    double returnConstDoublePtr(ConstDoublePtr value);

    @Selector("returnConstFloatPtr:")
    float returnConstFloatPtr(ConstFloatPtr value);

    @Selector("returnConstIntPtr:")
    int returnConstIntPtr(ConstIntPtr value);

    @Selector("returnConstLongPtr:")
    long returnConstLongPtr(ConstLongPtr value);

    @Selector("returnConstShortPtr:")
    short returnConstShortPtr(ConstShortPtr value);

    @Selector("returnConstStructPtr:")
    @ByValue CGSize returnConstStructPtr(@ReferenceInfo(type = CGSize.class)ConstPtr<CGSize> value);

}
