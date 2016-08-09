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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.coregraphics.struct.CGSize;

@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ProxiedValueProtocol")
public interface ProxiedValueProtocol {

    @Selector("returnBool:")
    boolean returnBool(boolean value);

    @Selector("returnByte:")
    byte returnByte(byte value);

    @Selector("returnChar:")
    char returnChar(char value);

    @Selector("returnDouble:")
    double returnDouble(double value);

    @Selector("returnFloat:")
    float returnFloat(float value);

    @Selector("returnInt:")
    int returnInt(int value);

    @Selector("returnLong:")
    long returnLong(long value);

    @Selector("returnShort:")
    short returnShort(short value);

    @Selector("returnStruct:")
    @ByValue CGSize returnStruct(@ByValue CGSize value);

    @Selector("checkMultiple::::::::::::::::::")
    boolean checkMultiple(
            boolean bo1, byte by1, char ch1, double do1, float fl1, int in1, long lo1, short sh1, @ByValue CGSize si1,
            boolean bo2, byte by2, char ch2, double do2, float fl2, int in2, long lo2, short sh2, @ByValue CGSize si2);

}
