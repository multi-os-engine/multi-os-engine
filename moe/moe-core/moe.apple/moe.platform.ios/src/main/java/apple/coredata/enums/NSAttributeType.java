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
 * types explicitly distinguish between bit sizes to ensure data store independence of the underlying operating system
 */
@Generated
public final class NSAttributeType {
    @Generated
    private NSAttributeType() {
    }

    @Generated @NUInt public static final long NSUndefinedAttributeType = 0x0000000000000000L;
    @Generated @NUInt public static final long NSInteger16AttributeType = 0x0000000000000064L;
    @Generated @NUInt public static final long NSInteger32AttributeType = 0x00000000000000C8L;
    @Generated @NUInt public static final long NSInteger64AttributeType = 0x000000000000012CL;
    @Generated @NUInt public static final long NSDecimalAttributeType = 0x0000000000000190L;
    @Generated @NUInt public static final long NSDoubleAttributeType = 0x00000000000001F4L;
    @Generated @NUInt public static final long NSFloatAttributeType = 0x0000000000000258L;
    @Generated @NUInt public static final long NSStringAttributeType = 0x00000000000002BCL;
    @Generated @NUInt public static final long NSBooleanAttributeType = 0x0000000000000320L;
    @Generated @NUInt public static final long NSDateAttributeType = 0x0000000000000384L;
    @Generated @NUInt public static final long NSBinaryDataAttributeType = 0x00000000000003E8L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long NSUUIDAttributeType = 0x000000000000044CL;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long NSURIAttributeType = 0x00000000000004B0L;
    /**
     * If your attribute is of NSTransformableAttributeType, the attributeValueClassName must be set or attribute value
     * class must implement NSCopying.
     * 
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long NSTransformableAttributeType = 0x0000000000000708L;
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long NSObjectIDAttributeType = 0x00000000000007D0L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long NSCompositeAttributeType = 0x0000000000000834L;
}
