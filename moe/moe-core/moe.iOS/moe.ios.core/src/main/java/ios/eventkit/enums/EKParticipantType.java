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

package ios.eventkit.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class EKParticipantType {
	@Generated
	private EKParticipantType() {
	}

	@Generated
	@NInt
	public static final long Unknown = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Person = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Room = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long Resource = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long Group = 0x0000000000000004L;
}
