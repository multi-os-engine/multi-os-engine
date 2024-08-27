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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Communication base class. This class handles base communication with the remote server.
 */
final class Communication {

    /**
     * Static value for successful acknowledgment.
     */
    private static final String ACK_OK = "+";

    /**
     * Static value for failed acknowledgment.
     */
    private static final String ACK_NOK = "-";

    /**
     * Input stream from the server.
     */
    private final DataInputStream dis;

    /**
     * Output stream to the server.
     */
    private final DataOutputStream dos;

    /**
     * Variable for no-ack mode.
     */
    private boolean noAckMode = false;

    /**
     * List for the Stop-Reply-Packet listeners.
     */
    private final ArrayList<IStopReplyListener> listeners = new ArrayList<IStopReplyListener>();

    /**
     * Input stream processing thread.
     */
    private Thread inputProcessingThread;

    /**
     * Thread-safe queue for acknowledgments.
     */
    private final ConcurrentLinkedQueue<String> ackQueue = new ConcurrentLinkedQueue<String>();

    /**
     * Thread-safe queue for response packets.
     */
    private final ConcurrentLinkedQueue<String> responsePacketQueue = new ConcurrentLinkedQueue<String>();

    /**
     * Create a new {@link Communication} with input and output streams.
     *
     * @param is input stream
     * @param os output stream
     * @throws IOException if an I/O error occurs
     */
    Communication(InputStream is, OutputStream os) throws IOException {
        if (is == null || os == null) {
            throw new NullPointerException();
        }

        // Create streams
        dis = new DataInputStream(new BufferedInputStream(is, 8192));
        dos = new DataOutputStream(new BufferedOutputStream(os, 8192));

        // Start input processing thread
        _startInputProcessing();

        // Send first acknowledgment
        _send_acknowledgment(true);
    }

    /**
     * Starts the input stream processing thread.
     */
    private void _startInputProcessing() {
        inputProcessingThread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    ByteArrayOutputStream baos = new ByteArrayOutputStream(2112);

                    while (!Thread.currentThread().isInterrupted()) {
                        int _byte;
                        _byte = dis.read();

                        if (_byte == '+') {
                            ackQueue.add(ACK_OK);

                        } else if (_byte == '-') {
                            ackQueue.add(ACK_NOK);

                        } else if (_byte == '$') {
                            _byte = dis.readByte();
                            int calc_hash = 0;
                            while (_byte != '#') {
                                calc_hash += _byte;
                                baos.write(_byte);
                                _byte = dis.readByte();
                            }
                            calc_hash %= 256;
                            int pkt_hash = getValueOfHex((char)dis.readByte());
                            pkt_hash <<= 4;
                            pkt_hash += getValueOfHex((char)dis.readByte());
                            if (isInNoAckMode() || pkt_hash == calc_hash) {
                                _dispatchPacket(baos.toString("ASCII"));
                                _send_acknowledgment(true);
                            } else {
                                _send_acknowledgment(false);
                            }
                            baos.reset();

                        } else {
                            // Probably just a disconnect...
                            if (_byte == -1) {
                                break;
                            }
                            throw new IOException("unrecognized packet");
                        }
                    }
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }
        });
        inputProcessingThread.start();
    }

    /**
     * Dispatch a packet to the proper target.
     *
     * @param packet packet to dispatch
     */
    private void _dispatchPacket(String packet) {
        if (!_forwardToListeners(packet)) {
            responsePacketQueue.add(packet);
        }
    }

    /**
     * Add a new {@link IStopReplyListener} listener.
     *
     * @param listener listener to add
     */
    void addListener(IStopReplyListener listener) {
        if (listener == null) {
            throw new NullPointerException();
        }
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    /**
     * Remove the specified {@link IStopReplyListener}.
     *
     * @param listener listener to remove
     * @return <code>true</code> if the listener was found and removed
     */
    boolean removeListener(IStopReplyListener listener) {
        if (listener == null) {
            throw new NullPointerException();
        }
        synchronized (listeners) {
            return listeners.remove(listener);
        }
    }

    /**
     * Forwards a packet to all of the listeners.
     *
     * @param packet packet to forward
     * @return <code>true</code> if the packet was forwarded
     */
    private boolean _forwardToListeners(String packet) {
        if (packet.startsWith("S")) {
            if (!packet.matches("T\\d\\d")) {
                return false;
            }
            int code = Integer.parseInt(packet.substring(1, 3), 16);
            synchronized (listeners) {
                for (IStopReplyListener listener : listeners) {
                    listener.processSignaled((byte)code, null);
                }
            }
            return true;
        } else if (packet.startsWith("T")) {
            if (!packet.matches("T\\d\\d([^;:]+\\:[^;:]+;)*")) {
                return false;
            }
            int code = Integer.parseInt(packet.substring(1, 3), 16);
            Map<String, String> info = Util.converToMap(packet.substring(3), ";", ":");
            synchronized (listeners) {
                for (IStopReplyListener listener : listeners) {
                    listener.processSignaled((byte)code, info);
                }
            }
            return true;
        } else if (packet.startsWith("W")) {
            if (!packet.matches("W\\d\\d(process\\:[\\w\\d]+;)?")) {
                return false;
            }
            int code = Integer.parseInt(packet.substring(1, 3), 16);
            synchronized (listeners) {
                for (IStopReplyListener listener : listeners) {
                    listener.processExited((byte)code);
                }
            }
            return true;
        } else if (packet.startsWith("X")) {
            if (!packet.matches("X\\d\\d(process\\:[\\w\\d]+;)?")) {
                return false;
            }
            int code = Integer.parseInt(packet.substring(1, 3), 16);
            synchronized (listeners) {
                for (IStopReplyListener listener : listeners) {
                    listener.processTerminated((byte)code);
                }
            }
            return true;
        } else if (packet.startsWith("O")) {
            if (packet.length() % 2 != 1) {
                return false;
            }
            if (!packet.matches("O([a-fA-F0-9][a-fA-F0-9])*")) {
                return false;
            }
            String msg = decodeHex(packet, 1, packet.length());
            synchronized (listeners) {
                for (IStopReplyListener listener : listeners) {
                    listener.processOutput(msg);
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Decode a two-digit hex encoded string in the specified range.
     *
     * @param packet packet containing the two-digit hex encoded string
     * @param start  index to decoded from (inclusive)
     * @param end    index to decoded to (exclusive)
     * @return decoded string
     */
    static String decodeHex(String packet, int start, int end) {
        if ((end - start) % 2 != 0) {
            throw new IllegalArgumentException();
        }
        int idx = start;
        byte chars[] = new byte[(end - start) / 2];
        while (idx < end) {
            byte c = 0;
            c += getValueOfHex(packet.charAt(idx + 0));
            c <<= 4;
            c += getValueOfHex(packet.charAt(idx + 1));
            chars[(idx - start) / 2] = c;
            idx += 2;
        }
        return new String(chars);
    }

    /**
     * Returns the integer value of a hex char.
     *
     * @param ch value
     * @return integer value of a hex char of -1 if conversion failed
     */
    static byte getValueOfHex(char ch) {
        if (ch >= '0' && ch <= '9') {
            return (byte)(ch - '0');
        }
        if (ch >= 'A' && ch <= 'F') {
            return (byte)(ch - 55);
        }
        if (ch >= 'a' && ch <= 'f') {
            return (byte)(ch - 87);
        }
        return -1;
    }

    /**
     * Sends an acknowledgment if in ackMode.
     *
     * @param ack <code>true</code> will send "+" otherwise "-" will be sent
     * @throws IOException if an I/O error occurs
     */
    private void _send_acknowledgment(boolean ack) throws IOException {
        if (!isInNoAckMode()) {
            if (ack) {
                dos.write('+');
                dos.flush();
            } else {
                dos.write('-');
                dos.flush();
            }
        }
    }

    /**
     * Create a new {@link PacketOutputStream}.
     *
     * @return new {@link PacketOutputStream}
     * @throws IOException if an I/O error occurs
     */
    PacketOutputStream newPacket() throws IOException {
        return new PacketOutputStream(this, dos);
    }

    /**
     * Wait for acknowledgment from the server.
     *
     * @return <code>true</code> if acknowledged or in noAckMode, otherwise
     * false
     * @throws IOException if an I/O error occurs
     */
    boolean getAck() throws IOException {
        if (isInNoAckMode()) {
            return true;
        }
        while (ackQueue.size() == 0) {
            if (inputProcessingThread == null || !inputProcessingThread.isAlive()) {
                throw new IOException("waiting for ack failed, connection closed");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new IOException("waiting for ack interrupted");
            }
        }
        return ackQueue.poll() == ACK_OK;
    }

    /**
     * Returns <code>true</code> if the communication is in noAckMode.
     *
     * @return <code>true</code> if the communication is in noAckMode
     */
    boolean isInNoAckMode() {
        return noAckMode;
    }

    /**
     * Sets noAckMode.
     *
     * @param noAckMode <code>true</code> will turn on noAckMode.
     */
    void setNoAckMode(boolean noAckMode) {
        this.noAckMode = noAckMode;
    }

    /**
     * Sends a packet which is constructed from a string and returns the ack.
     *
     * @param string message of the packet
     * @return acknowledgment result
     * @throws IOException if an I/O error occurs
     */
    boolean sendASCIIPacket(String string) throws IOException {
        // Send packet
        PacketOutputStream pos = newPacket();
        pos.writeASCII(string);
        return pos.send();
    }

    /**
     * Wait for and get the next response packet.
     *
     * @return next packet in the queue
     * @throws IOException if an I/O error occurs
     */
    String nextResponse() throws IOException {
        while (responsePacketQueue.size() == 0) {
            if (inputProcessingThread == null || !inputProcessingThread.isAlive()) {
                throw new IOException("waiting for response failed, connection closed");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new IOException("waiting for response interrupted");
            }
        }
        return responsePacketQueue.poll();
    }

    /**
     * Close the communication.
     */
    void close() {
        try {
            if (inputProcessingThread != null && !inputProcessingThread.isAlive()) {
                inputProcessingThread.interrupt();
            }
        } catch (Exception e) {
        }
    }

}
