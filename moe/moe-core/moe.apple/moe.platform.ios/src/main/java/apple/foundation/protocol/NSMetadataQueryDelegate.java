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

package apple.foundation.protocol;

import apple.foundation.NSMetadataItem;
import apple.foundation.NSMetadataQuery;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSMetadataQueryDelegate")
public interface NSMetadataQueryDelegate {
    @NotNull
    @Generated
    @IsOptional
    @Selector("metadataQuery:replacementObjectForResultObject:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object metadataQueryReplacementObjectForResultObject(@NotNull NSMetadataQuery query,
            @NotNull NSMetadataItem result) {
        throw new java.lang.UnsupportedOperationException();
    }

    @NotNull
    @Generated
    @IsOptional
    @Selector("metadataQuery:replacementValueForAttribute:value:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object metadataQueryReplacementValueForAttributeValue(@NotNull NSMetadataQuery query,
            @NotNull String attrName, @NotNull @Mapped(ObjCObjectMapper.class) Object attrValue) {
        throw new java.lang.UnsupportedOperationException();
    }
}
