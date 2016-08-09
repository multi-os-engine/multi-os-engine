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

package org.moe.xosrt.binding.test.Runner;

/*import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import org.moe.xosrt.binding.test.constructTest.ConstructTest;
import org.moe.xosrt.binding.test.structTest.StructTest;

@RunWith(Suite.class)
@SuiteClasses({
        ConstructTest.class,
        StructTest.class
})

public class TestRunnerSuite{
    public static void main(String args[]){
        JUnitCore junit = new JUnitCore();
        Result result = junit.runClasses(TestRunnerSuite.class);
        for (Failure failure : result.getFailures()) {
                        System.out.println(failure.toString());
                }
                System.out.println(result.wasSuccessful());
    }
}*/

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@Ignore
@RunWith(Suite.class)
@Suite.SuiteClasses({
    org.moe.xosrt.binding.test.CArrayTest.CArrayTest.class,
    org.moe.xosrt.binding.test.CFunctionWithStruct.CFunctionWithStructTest.class,
    org.moe.xosrt.binding.test.CFunctionWithStruct.CFunctionWithStructTest.class,
    org.moe.xosrt.binding.test.constructTest.ConstructTest.class,
    org.moe.xosrt.binding.test.contextTest.ContextTest.class,
    org.moe.xosrt.binding.test.delegateTest.DelegateTest.class,
    org.moe.xosrt.binding.test.directCallTest.DirectCallBlock.class,
    org.moe.xosrt.binding.test.directCallTest.DirectCallEnum.class,
    org.moe.xosrt.binding.test.directCallTest.DirectCallProperties.class,
    org.moe.xosrt.binding.test.directCallTest.DirectCallTest.class,
    org.moe.xosrt.binding.test.directCallTest.DirectCallTestPointers.class,
    org.moe.xosrt.binding.test.directCallTest.DirectCallTestsStructures.class,
    org.moe.xosrt.binding.test.directCallTest.ReferenceCallTest.class,
    org.moe.xosrt.binding.test.directCallTest.UpcastTest.class,
    org.moe.xosrt.binding.test.globalValueTest.GlobalValueTest.class,
    org.moe.xosrt.binding.test.polytypes.PolyTypesTests.class,
    org.moe.xosrt.binding.test.PropertiesTest.TestProperties.class,
    org.moe.xosrt.binding.test.StaticSections.StaticSectionsInit.class,
    org.moe.xosrt.binding.test.structTest.StructTest.class,
    //org.moe.xosrt.binding.test.dispatch.DispatchTest.class,
    //org.moe.xosrt.binding.test.foundation.NSAffineTransformTests.class,
    //org.moe.xosrt.binding.test.foundation.NSArrayTests.class,
    //org.moe.xosrt.binding.test.foundation.NSBundleTest.class,
    //org.moe.xosrt.binding.test.foundation.NSDictionaryTests.class,
    //org.moe.xosrt.binding.test.foundation.NSIndexPathTests.class,
    //org.moe.xosrt.binding.test.foundation.NSStringTests.class,
    //org.moe.xosrt.binding.test.foundation.NSURLTests.class
})
public class TestRunnerSuite {

}
