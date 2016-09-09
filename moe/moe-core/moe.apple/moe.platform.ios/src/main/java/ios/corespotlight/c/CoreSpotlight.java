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

package ios.corespotlight.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreSpotlight")
@Runtime(CRuntime.class)
public final class CoreSpotlight {
	static {
		NatJ.register();
	}

	@Generated
	private CoreSpotlight() {
	}

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSSearchableItemActionType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSSearchableItemActivityIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSIndexErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSMailboxInbox();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSMailboxDrafts();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSMailboxSent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSMailboxJunk();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSMailboxTrash();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CSMailboxArchive();

	@Generated
	@CVariable()
	public static native double CoreSpotlightVersionNumber();

	@Generated
	@CVariable()
	public static native ConstBytePtr CoreSpotlightVersionString();
}
