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
 * Class for representing and parsing a local and remote port for proxying.
 */
public class ProxyPort {

    /**
     * Local port.
     */
    private final short localPort;
    /**
     * Remote port.
     */
    private final short remotePort;

    /**
     * Creates a new ProxyPort instance.
     *
     * @param localPort  local port
     * @param remotePort remote port
     */
    public ProxyPort(short localPort, short remotePort) {
        this.localPort = localPort;
        this.remotePort = remotePort;
    }

    /**
     * Parses a ProxyPort object from a string.
     *
     * @param string string to parse
     * @return ProxyPort object
     */
    public static ProxyPort parse(String string) {
        if (string == null) {
            throw new NullPointerException();
        }

        if (string.matches("[\\d]+")) {
            int port = Integer.parseInt(string);
            if (port >= 0 && port <= 65535) {
                return new ProxyPort((short)(port & 0xFFFF), (short)(port & 0xFFFF));
            }
        } else if (string.matches("[\\d]+:[\\d]+")) {
            int spl = string.indexOf(':');
            int local = Integer.parseInt(string.substring(0, spl));
            int remote = Integer.parseInt(string.substring(spl + 1));
            if (local >= 0 && local <= 65535 && remote >= 0 && remote <= 65535) {
                return new ProxyPort((short)(local & 0xFFFF), (short)(remote & 0xFFFF));
            }
        }

        throw new IllegalArgumentException("[0-65535] or [0-65535]:[0-65535]");
    }

    /**
     * Returns the local port as a short.
     *
     * @return local port
     */
    public short getShortLocalPort() {
        return localPort;
    }

    /**
     * Returns the remote port as a short.
     *
     * @return remote port
     */
    public short getShortRemotePort() {
        return remotePort;
    }

    /**
     * Returns the local port as an int.
     *
     * @return local port
     */
    public int getLocalPort() {
        return localPort & 0xFFFF;
    }

    /**
     * Returns the remote port as an int.
     *
     * @return remote port
     */
    public int getRemotePort() {
        return remotePort & 0xFFFF;
    }

    @Override
    public String toString() {
        return getLocalPort() + ":" + getRemotePort();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProxyPort proxyPort = (ProxyPort)o;

        return localPort == proxyPort.localPort && remotePort == proxyPort.remotePort;
    }

    @Override
    public int hashCode() {
        int result = (int)localPort;
        result = 31 * result + (int)remotePort;
        return result;
    }
}
