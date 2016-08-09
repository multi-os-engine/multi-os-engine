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

public interface JavaInterface {
    boolean getI1();

    byte getI8();

    short getI16();

    int getI32();

    long getIL();

    long getI64();

    byte getU8();

    char getU16();

    int getU32();

    long getUL();

    long getU64();

    float getF32();

    double getF64();
}
