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

package org.moe.common;

/**
 * Class for representing and parsing a port number.
 */
public class Port {

    /**
     * Port.
     */
    private final short port;

    /**
     * Creates a new Port instance.
     *
     * @param port port
     */
    public Port(short port) {
        this.port = port;
    }

    /**
     * Parses a Port object from a string.
     *
     * @param string string to parse
     * @return Port object
     */
    public static Port parse(String string) {
        if (string == null) {
            throw new NullPointerException();
        }

        if (string.matches("[\\d]+")) {
            int port = Integer.parseInt(string);
            if (port >= 0 && port <= 65535) {
                return new Port((short) (port & 0xFFFF));
            }
        }

        throw new IllegalArgumentException("[0-65535]");
    }

    /**
     * Returns the port as a short.
     *
     * @return port
     */
    public short getShortPort() {
        return port;
    }

    /**
     * Returns the port as an int.
     *
     * @return port
     */
    public int getPort() {
        return port & 0xFFFF;
    }

    @Override
    public String toString() {
        return Integer.toString(getPort());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Port port1 = (Port) o;

        return port == port1.port;
    }

    @Override
    public int hashCode() {
        return (int) port;
    }
}
