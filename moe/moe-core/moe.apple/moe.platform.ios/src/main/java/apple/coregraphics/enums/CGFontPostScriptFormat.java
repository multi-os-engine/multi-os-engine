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

package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

/**
 * The format of a PostScript font subset. Type1 is documented in "Adobe
 * Type 1 Font Format"; Type3 in "PostScript Language Reference, 3rd ed."
 * and Type42 in "Adobe Technical Note 5012, The Type 42 Font Format
 * Specification". 
 */
@Generated
public final class CGFontPostScriptFormat {
    @Generated public static final int Type1 = 0x00000001;
    @Generated public static final int Type3 = 0x00000003;
    @Generated public static final int Type42 = 0x0000002A;

    @Generated
    private CGFontPostScriptFormat() {
    }
}
