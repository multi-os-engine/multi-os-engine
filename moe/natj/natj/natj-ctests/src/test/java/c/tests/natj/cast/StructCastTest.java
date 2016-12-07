/*
Copyright 2016 Migeran

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

package c.tests.natj.cast;

import c.binding.struct.NJPoint;
import c.binding.struct.NJRect;
import c.binding.struct.NJSize;
import c.tests.NatJTest;
import org.junit.Assert;
import org.junit.Test;
import org.moe.natj.c.CRuntime;

public class StructCastTest extends NatJTest {

    @Test
    public void test_StructToStruct_cast() {
        NJPoint point = new NJPoint(11.0, 22.0);
        NJSize size = new NJSize(33.0, 44.0);
        NJRect rect = new NJRect(point, size);

        NJPoint casted = CRuntime.cast(rect, NJPoint.class);

        Assert.assertSame(casted.getPeer(), rect.getPeer());
        Assert.assertEquals(casted.x(), point.x(), 0.0);
        Assert.assertEquals(casted.y(), point.y(), 0.0);
    }

}
