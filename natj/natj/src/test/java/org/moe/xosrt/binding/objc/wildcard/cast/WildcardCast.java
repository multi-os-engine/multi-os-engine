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

package org.moe.xosrt.binding.objc.wildcard.cast;

import apple.NSObject;
import apple.foundation.NSArray;
import org.moe.xosrt.binding.objc.wildcard.cast.bind.A;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.junit.Ignore;
import org.junit.Test;

public class WildcardCast extends XrtTest {

    @Ignore
    @Test
    public void GetWildcardArr()
    {
        NSArray<? extends A> arr =  CollectionProvider.getArrayOfA();
        NSObject element = arr.objectAtIndex(0);

        A a = (A)element;
    }

}
