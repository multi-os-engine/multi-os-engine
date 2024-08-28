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

package org.moe.xosrt.binding.test.contextTest.testClasses;


import org.moe.natj.general.Pointer;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NLongPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.NULongPtr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.general.ptr.VoidPtr;

public class Context implements VoidPtr {

	private long identificator;
	
	public Context(long id) {
		identificator = id;
	}
	
	public long getId() {
		return identificator;
	}
	
	public void increase(long delta) {
		identificator += delta;
	}

	@Override
	public Pointer getPeer() {
		return null;
	}

	@Override
	public boolean isConstPtr() {
		return false;
	}

	@Override
	public int getDepth() {
		return 0;
	}

	@Override
	public void free() {

	}

	@Override
	public void forceFree() {

	}

	@Override
	public BoolPtr getBoolPtr() {
		return null;
	}

	@Override
	public BytePtr getBytePtr() {
		return null;
	}

	@Override
	public ShortPtr getShortPtr() {
		return null;
	}

	@Override
	public CharPtr getCharPtr() {
		return null;
	}

	@Override
	public IntPtr getIntPtr() {
		return null;
	}

	@Override
	public LongPtr getLongPtr() {
		return null;
	}

	@Override
	public FloatPtr getFloatPtr() {
		return null;
	}

	@Override
	public DoublePtr getDoublePtr() {
		return null;
	}

	@Override
	public NFloatPtr getNFloatPtr() {
		return null;
	}

	@Override
	public NUIntPtr getNUIntPtr() {
		return null;
	}

	@Override
	public NIntPtr getNIntPtr() {
		return null;
	}

	@Override
	public NULongPtr getNULongPtr() {
		return null;
	}

	@Override
	public NLongPtr getNLongPtr() {
		return null;
	}
}
