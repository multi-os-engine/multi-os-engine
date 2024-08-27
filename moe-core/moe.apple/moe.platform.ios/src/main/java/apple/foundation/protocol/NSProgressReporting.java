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

import apple.foundation.NSProgress;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * If your class supports reporting progress, then you can adopt the NSProgressReporting protocol. Objects that adopt
 * this protocol should typically be "one-shot" -- that is, the progress is setup at initialization of the object and is
 * updated when work is done. The value of the property should not be set to another progress object. Instead, the user
 * of the NSProgressReporting class should create a new instance to represent a new set of work.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSProgressReporting")
public interface NSProgressReporting {
    @NotNull
    @Generated
    @Selector("progress")
    NSProgress progress();
}
