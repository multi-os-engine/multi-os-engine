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


package apple.foundation;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.NSObject;

@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSArray<_ObjectType> extends NSObject {
    static {
        NatJ.register();
    }

	protected NSArray(Pointer peer) {
		super(peer);
	}


	@Owned
	@Selector("alloc")
	public static native NSArray<?> alloc();

	@Selector("array")
	public static native <_ObjectType> NSArray<?> array();

    @MappedReturn(ObjCObjectMapper.class)
    @Selector("objectAtIndex:")
    public native _ObjectType objectAtIndex(@NUInt long index);


}
