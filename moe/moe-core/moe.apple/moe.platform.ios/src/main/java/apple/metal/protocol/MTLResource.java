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
    /**
     * cpuCacheMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLResource_Ref/index.html#//apple_ref/occ/intfp/MTLResource/cpuCacheMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    long cpuCacheMode();

    /**
     * device</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLResource_Ref/index.html#//apple_ref/occ/intfp/MTLResource/device">iOS Dev Center</a>
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    Object device();

    /**
     * label</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLResource_Ref/index.html#//apple_ref/occ/intfp/MTLResource/label">iOS Dev Center</a>
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * label</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLResource_Ref/index.html#//apple_ref/occ/intfp/MTLResource/label">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * setPurgeableState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLResource_Ref/index.html#//apple_ref/occ/intfm/MTLResource/setPurgeableState:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPurgeableState:")
    @NUInt
    long setPurgeableState(@NUInt long state);

    /**
     * storageMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLResource_Ref/index.html#//apple_ref/occ/intfp/MTLResource/storageMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    long storageMode();
}
