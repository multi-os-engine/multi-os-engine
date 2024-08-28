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

package apple.audiotoolbox.protocol;

import apple.audiotoolbox.AUAudioUnit;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.foundation.NSError;
import apple.foundation.protocol.NSExtensionRequestHandling;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * Protocol to which principal classes of v3 audio units (extensions) must conform.
 * 
 * The principal class of a non-UI v3 audio unit extension will generally derive from NSObject
 * and implement this protocol.
 * 
 * The principal class of a UI v3 audio unit extension must derive from AUViewController and
 * implement this protocol.
 */
@Generated
@Library("AudioToolbox")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AUAudioUnitFactory")
public interface AUAudioUnitFactory extends NSExtensionRequestHandling {
    /**
     * Create an instance of an extension's AUAudioUnit.
     * 
     * This method should create and return an instance of its audio unit.
     * 
     * This method will be called only once per instance of the factory.
     * 
     * Note that in non-ARC code, "create" methods return unretained objects (unlike "create"
     * C functions); the implementor should return an object with reference count 1 but
     * autoreleased.
     */
    @Nullable
    @Generated
    @Selector("createAudioUnitWithComponentDescription:error:")
    AUAudioUnit createAudioUnitWithComponentDescriptionError(@ByValue AudioComponentDescription desc,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
