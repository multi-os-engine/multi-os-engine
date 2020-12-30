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

import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Action (event handler) protocol. *
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CAAction")
public interface CAAction {
    /**
     * Called to trigger the event named 'path' on the receiver. The object
     * (e.g. the layer) on which the event happened is 'anObject'. The
     * arguments dictionary may be nil, if non-nil it carries parameters
     * associated with the event.
     */
    @Generated
    @Selector("runActionForKey:object:arguments:")
    void runActionForKeyObjectArguments(String event, @Mapped(ObjCObjectMapper.class) Object anObject,
            NSDictionary<?, ?> dict);
}
