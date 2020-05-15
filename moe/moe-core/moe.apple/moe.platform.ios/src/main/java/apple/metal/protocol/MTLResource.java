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

package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLResource")
public interface MTLResource {
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    long cpuCacheMode();

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Generated
    @Selector("heap")
    @MappedReturn(ObjCObjectMapper.class)
    MTLHeap heap();

    @Generated
    @Selector("isAliasable")
    boolean isAliasable();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("makeAliasable")
    void makeAliasable();

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    @Generated
    @Selector("setPurgeableState:")
    @NUInt
    long setPurgeableState(@NUInt long state);

    @Generated
    @Selector("storageMode")
    @NUInt
    long storageMode();

    @Generated
    @Selector("allocatedSize")
    @NUInt
    long allocatedSize();

    @Generated
    @Selector("hazardTrackingMode")
    @NUInt
    long hazardTrackingMode();

    @Generated
    @Selector("heapOffset")
    @NUInt
    long heapOffset();

    @Generated
    @Selector("resourceOptions")
    @NUInt
    long resourceOptions();
}
