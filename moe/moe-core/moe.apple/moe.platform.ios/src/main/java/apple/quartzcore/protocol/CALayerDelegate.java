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

package apple.quartzcore.protocol;

import apple.coregraphics.opaque.CGContextRef;
import apple.quartzcore.CALayer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CALayerDelegate")
public interface CALayerDelegate {
    @Generated
    @IsOptional
    @Selector("actionForLayer:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    default CAAction actionForLayerForKey(CALayer layer, String event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("displayLayer:")
    default void displayLayer(CALayer layer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("drawLayer:inContext:")
    default void drawLayerInContext(CALayer layer, CGContextRef ctx) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layerWillDraw:")
    default void layerWillDraw(CALayer layer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutSublayersOfLayer:")
    default void layoutSublayersOfLayer(CALayer layer) {
        throw new java.lang.UnsupportedOperationException();
    }
}
