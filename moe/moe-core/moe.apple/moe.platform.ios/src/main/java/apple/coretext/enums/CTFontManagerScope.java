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
 * [@enum] CTFontManagerScope
 * <p>
 * Scope for font registration. A uses session refers to a login session in macOS, and the current booted session in
 * iOS.
 * [@constant] kCTFontManagerScopeNone
 * The font is not registered and does not participate in font descriptor matching. This isn't a valid scope to specify
 * while registering fonts.
 * [@constant] kCTFontManagerScopeProcess
 * The font is available to the current process for the duration of the process unless directly unregistered.
 * [@constant] kCTFontManagerScopePersistent
 * The font is available to all processes for the current user session and will be available in subsequent sessions
 * unless unregistered.
 * [@constant] kCTFontManagerScopeSession
 * The font is available to the current user session, and will not be available in subsequent sessions.
 * Session scope is only available in macOS.
 */
@Generated
public final class CTFontManagerScope {
    @Generated public static final int None = 0x00000000;
    @Generated public static final int Process = 0x00000001;
    @Generated public static final int User = 0x00000002;

    @Generated
    private CTFontManagerScope() {
    }

    @Generated public static final int Persistent = 0x00000002;
}
