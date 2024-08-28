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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CTWritingDirection
 * 
 * These constants specify the writing direction
 * 
 * [@constant] kCTWritingDirectionNatural
 * The writing direction is algorithmically determined
 * using the Unicode Bidirectional Algorithm rules P2 and P3.
 * 
 * [@constant] kCTWritingDirectionLeftToRight
 * The writing direction is left to right.
 * 
 * [@constant] kCTWritingDirectionRightToLeft
 * The writing direction is right to left.
 */
@Generated
public final class CTWritingDirection {
    @Generated public static final byte Natural = -1;
    @Generated public static final byte LeftToRight = 0;
    @Generated public static final byte RightToLeft = 1;

    @Generated
    private CTWritingDirection() {
    }
}
