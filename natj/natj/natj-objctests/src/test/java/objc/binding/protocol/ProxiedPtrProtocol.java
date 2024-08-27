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
@ObjCProtocolName("ProxiedPtrProtocol")
public interface ProxiedPtrProtocol {

    @Selector("returnBoolPtr:")
    boolean returnBoolPtr(BoolPtr value);

    @Selector("returnBytePtr:")
    byte returnBytePtr(BytePtr value);

    @Selector("returnCharPtr:")
    char returnCharPtr(CharPtr value);

    @Selector("returnDoublePtr:")
    double returnDoublePtr(DoublePtr value);

    @Selector("returnFloatPtr:")
    float returnFloatPtr(FloatPtr value);

    @Selector("returnIntPtr:")
    int returnIntPtr(IntPtr value);

    @Selector("returnLongPtr:")
    long returnLongPtr(LongPtr value);

    @Selector("returnShortPtr:")
    short returnShortPtr(ShortPtr value);

    @Selector("returnStructPtr2:")
    @ByValue CGSize returnStructPtr2(CGSize value);

    @Selector("returnStructPtr:")
    @ByValue CGSize returnStructPtr(@ReferenceInfo(type = CGSize.class) Ptr<CGSize> value);

}
