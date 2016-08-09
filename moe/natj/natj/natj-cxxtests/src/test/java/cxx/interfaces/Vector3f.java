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

package cxx.interfaces;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxMethod;

@CxxHeader("BaseTypes.hpp")
@CxxClass("natj::cxx::tests::Vector3f")
public interface Vector3f extends CxxObject {
    @CxxMethod(isConst = true)
    float getX();

    @CxxMethod(isConst = true)
    float getY();

    @CxxMethod(isConst = true)
    float getZ();
}
