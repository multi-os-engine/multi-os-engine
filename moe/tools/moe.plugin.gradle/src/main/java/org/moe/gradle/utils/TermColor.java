/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TermColor {

    private final String string;

    private TermColor(String string) {
        this.string = string;
    }

    private static TermColor init(Integer... code) {
        if (!"1".equals(System.getenv("MOE_USE_TERM_COLORS"))) {
            return new TermColor("");
        }
        return new TermColor("\033[" + Arrays.stream(code).map(Object::toString).collect(Collectors.joining(";")) + "m");
    }

    private static TermColor init(String str) {
        if (!"1".equals(System.getenv("MOE_USE_TERM_COLORS"))) {
            return new TermColor("");
        }
        return new TermColor("\033[" + str);
    }

    // @formatter:off

    /*
     * Format set.
     */

    public static final TermColor FM_SET_BOLD       = init(1);
    public static final TermColor FM_SET_DIM        = init(2);
    public static final TermColor FM_SET_UNDERLINED = init(4);
    public static final TermColor FM_SET_BLINK      = init(5);
    public static final TermColor FM_SET_REVERSE    = init(7);
    public static final TermColor FM_SET_HIDDEN     = init(8);

    /*
     * Format reset.
     */

    public static final TermColor FM_RES_ALL        = init(0);
    public static final TermColor FM_RES_BOLD       = init(21);
    public static final TermColor FM_RES_DIM        = init(22);
    public static final TermColor FM_RES_UNDERLINED = init(24);
    public static final TermColor FM_RES_BLINK      = init(25);
    public static final TermColor FM_RES_REVERSE    = init(27);
    public static final TermColor FM_RES_HIDDEN     = init(28);

    /*
     * Foreground color set.
     */

    public static final TermColor FG_SET_DEFAULT       = init(39);
    public static final TermColor FG_SET_BLACK         = init(30);
    public static final TermColor FG_SET_RED           = init(31);
    public static final TermColor FG_SET_GREEN         = init(32);
    public static final TermColor FG_SET_YELLOW        = init(33);
    public static final TermColor FG_SET_BLUE          = init(34);
    public static final TermColor FG_SET_MAGENTA       = init(35);
    public static final TermColor FG_SET_CYAN          = init(36);
    public static final TermColor FG_SET_LIGHT_GRAY    = init(37);
    /* Not compatible with Windows, just ignore these...
    public static final TermColor FG_SET_DARK_GRAY     = init(90);
    public static final TermColor FG_SET_LIGHT_RED     = init(91);
    public static final TermColor FG_SET_LIGHT_GREEN   = init(92);
    public static final TermColor FG_SET_LIGHT_YELLOW  = init(93);
    public static final TermColor FG_SET_LIGHT_BLUE    = init(94);
    public static final TermColor FG_SET_LIGHT_MAGENTA = init(95);
    public static final TermColor FG_SET_LIGHT_CYAN    = init(96);
    */
    public static final TermColor FG_SET_WHITE         = init(97);

    /*
     * Commands
     */
    public static final TermColor SCR_SAVE = init("?47h");
    public static final TermColor SCR_RESTORE = init("?47l");
    public static final TermColor SCR_CLR = init("2J");

    /*
     * Styles.
     */

    public static final TermColor ST_REMOTE_TASK_START      = init(36);
    public static final TermColor ST_REMOTE_TASK_END        = init(36);
    public static final TermColor ST_REMOTE_TASK_ERROR      = init(31);
    public static final TermColor ST_REMOTE_TASK_ERROR_DESC = init(33);

    // @formatter:on

    @Override
    public String toString() {
        return string;
    }
}
