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

package apple.coreaudio.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Generated
@Library("CoreAudio")
@Runtime(CRuntime.class)
public final class CoreAudio {
    static {
        NatJ.register();
    }

    @Generated
    private CoreAudio() {
    }

    @Generated
    @Inline
    @CFunction
    public static native int AudioChannelLayoutTag_GetNumberOfChannels(int inLayoutTag);

    @Generated public static final double kAudioStreamAnyRate = 0x0000000000000000L;
}
