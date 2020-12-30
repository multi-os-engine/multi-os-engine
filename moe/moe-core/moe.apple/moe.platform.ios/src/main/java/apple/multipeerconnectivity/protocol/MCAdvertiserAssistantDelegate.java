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

package apple.multipeerconnectivity.protocol;

import apple.multipeerconnectivity.MCAdvertiserAssistant;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MCAdvertiserAssistantDelegate")
public interface MCAdvertiserAssistantDelegate {
    /**
     * An invitation was dismissed from screen.
     */
    @Generated
    @IsOptional
    @Selector("advertiserAssistantDidDismissInvitation:")
    default void advertiserAssistantDidDismissInvitation(MCAdvertiserAssistant advertiserAssistant) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * An invitation will be presented to the user.
     */
    @Generated
    @IsOptional
    @Selector("advertiserAssistantWillPresentInvitation:")
    default void advertiserAssistantWillPresentInvitation(MCAdvertiserAssistant advertiserAssistant) {
        throw new java.lang.UnsupportedOperationException();
    }
}
