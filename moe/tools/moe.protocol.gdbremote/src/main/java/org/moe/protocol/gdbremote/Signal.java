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

package org.moe.protocol.gdbremote;

/**
 * Signals.
 */
public final class Signal {

    /**
     * Signal code.
     */
    private final byte code;

    /**
     * Signal name.
     */
    private final String name;

    /**
     * EXC_BAD_ACCESS signal.
     */
    public static final Signal EXC_BAD_ACCESS = new Signal((byte)0x91, "EXC_BAD_ACCESS");

    /**
     * EXC_BAD_INSTRUCTION signal.
     */
    public static final Signal EXC_BAD_INSTRUCTION = new Signal((byte)0x92, "EXC_BAD_INSTRUCTION");

    /**
     * EXC_ARITHMETIC signal.
     */
    public static final Signal EXC_ARITHMETIC = new Signal((byte)0x93, "EXC_ARITHMETIC");

    /**
     * An array of predefined signals.
     */
    private static final Signal[] signals = new Signal[] { EXC_BAD_ACCESS, EXC_BAD_INSTRUCTION, EXC_ARITHMETIC };

    /**
     * Creates a new {@link Signal} with the specified code and name.
     *
     * @param code code
     * @param name name
     */
    private Signal(byte code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Returns the signal name (if available) or code as a string.
     *
     * @param code signal code
     * @return string representation
     */
    public static String getSignal(byte code) {
        for (Signal s : signals) {
            if (s.getCode() == code) {
                return s.getName();
            }
        }
        return "" + (((int)code) & 0xFF);
    }

    /**
     * Returns the signal's code.
     *
     * @return signal's code
     */
    public byte getCode() {
        return code;
    }

    /**
     * Returns the signal's name.
     *
     * @return signal's name
     */
    public String getName() {
        return name;
    }

}
