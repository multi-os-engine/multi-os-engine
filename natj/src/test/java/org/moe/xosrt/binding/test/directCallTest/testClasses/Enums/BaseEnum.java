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

package org.moe.xosrt.binding.test.directCallTest.testClasses.Enums;

import org.moe.natj.general.ann.Generated;
import org.moe.xosrt.binding.test.common._NSUInteger;

public enum BaseEnum {
	
	Zero(0L),
	First(1L),
	Second(2L);
	
	private final long value;
	//private BaseEnum(@_NSUInteger value) {
	private BaseEnum(long value) {
		this.value = value;
	}

	@_NSUInteger
	@Generated
	public long value() {
		return value;
	}
}
