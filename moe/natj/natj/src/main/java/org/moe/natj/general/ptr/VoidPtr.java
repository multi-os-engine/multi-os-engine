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

package org.moe.natj.general.ptr;

/**
 * Void pointer interface.
 */
public interface VoidPtr extends ConstVoidPtr {

    @Override
    public BoolPtr getBoolPtr();

    @Override
    public BytePtr getBytePtr();

    @Override
    public ShortPtr getShortPtr();

    @Override
    public CharPtr getCharPtr();

    @Override
    public IntPtr getIntPtr();

    @Override
    public LongPtr getLongPtr();

    @Override
    public FloatPtr getFloatPtr();

    @Override
    public DoublePtr getDoublePtr();

    @Override
    public NFloatPtr getNFloatPtr();

    @Override
    public NUIntPtr getNUIntPtr();

    @Override
    public NIntPtr getNIntPtr();

    @Override
    public NULongPtr getNULongPtr();

    @Override
    public NLongPtr getNLongPtr();

}
