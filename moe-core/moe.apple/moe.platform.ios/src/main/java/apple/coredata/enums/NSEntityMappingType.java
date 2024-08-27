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

package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * mapping types
 */
@Generated
public final class NSEntityMappingType {
    @Generated @NUInt public static final long UndefinedEntityMappingType = 0x0000000000000000L;
    /**
     * developer handles destination instance creation
     */
    @Generated @NUInt public static final long CustomEntityMappingType = 0x0000000000000001L;
    /**
     * new entity in destination
     */
    @Generated @NUInt public static final long AddEntityMappingType = 0x0000000000000002L;
    /**
     * source instances aren't mapped to destination
     */
    @Generated @NUInt public static final long RemoveEntityMappingType = 0x0000000000000003L;
    /**
     * migrate instances as-is
     */
    @Generated @NUInt public static final long CopyEntityMappingType = 0x0000000000000004L;
    /**
     * entity exists in source and destination and is mapped
     */
    @Generated @NUInt public static final long TransformEntityMappingType = 0x0000000000000005L;

    @Generated
    private NSEntityMappingType() {
    }
}
