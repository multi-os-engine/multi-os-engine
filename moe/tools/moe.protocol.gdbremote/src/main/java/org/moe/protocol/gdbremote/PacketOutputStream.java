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

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Packet writing output stream.
 */
final class PacketOutputStream extends OutputStream {

	/**
	 * Related {@link Communication} object.
	 */
	private final Communication comm;

	/**
	 * Output stream to write to.
	 */
	private final DataOutputStream target;

	/**
	 * Calculated hash of the message.
	 */
	private int hash = 0;

	/**
	 * Create a new {@link PacketOutputStream}.
	 *
	 * @param comm
	 *            related communication
	 * @param target
	 *            target output stream
	 * @throws IOException if an I/O error occurs
	 */
	PacketOutputStream(Communication comm, DataOutputStream target)
			throws IOException {
		this.comm = comm;
		this.target = target;
		this.target.write('$');
	}

	@Override
	public void write(int b) throws IOException {
		hash += b;
		target.write(b);
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException(
				"don't call 'close' on PacketOutputStream directly, call 'send' instead!");
	}

	/**
	 * Write an integer as a string to the stream.
	 *
	 * @param number
	 *            number to write
	 * @throws IOException if an I/O error occurs
	 */
	void writeInteger(int number) throws IOException {
		writeASCII(Integer.toString(number));
	}

	/**
	 * Write an ASCII string directly to the stream.
	 *
	 * @param string
	 *            string to write
	 * @throws IOException if an I/O error occurs
	 */
	void writeASCII(String string) throws IOException {
		write(string.getBytes("ASCII"));
	}

	/**
	 * Write an ASCII string in two-digit hex encoded format to the stream.
	 *
	 * @param string
	 *            string to write
	 * @throws IOException if an I/O error occurs
	 */
	void writeHexASCII(String string) throws IOException {
		writeHex(string.getBytes("ASCII"));
	}

	/**
	 * Write an UTF-8 string in two-digit hex encoded format to the stream.
	 *
	 * @param string
	 *            string to write
	 * @throws IOException if an I/O error occurs
	 */
	void writeHexUTF8(String string) throws IOException {
		writeHex(string.getBytes("UTF-8"));
	}

	/**
	 * Write a byte array in two-digit hex encoded format to the stream.
	 *
	 * @param bytes
	 *            byte array to write
	 * @throws IOException if an I/O error occurs
	 */
	void writeHex(byte[] bytes) throws IOException {
		int count = bytes.length;
		for (int i = 0; i < count; ++i) {
			writeHexByte(bytes[i]);
		}
	}

	/**
	 * Writes a byte in hexadecimal format to the stream. The lower 8 bits of
	 * the argument will be written.
	 *
	 * @param b
	 *            byte to write
	 * @throws IOException if an I/O error occurs
	 */
	void writeHexByte(int b) throws IOException {
		writeHexHalfByte((b & 0xF0) >> 4);
		writeHexHalfByte((b & 0x0F) >> 0);
	}

	/**
	 * Write 4 bits in hexadecimal format to the stream. The lower 4 bits of the
	 * argument will be written.
	 *
	 * @param half
	 *            half-byte to write
	 * @throws IOException if an I/O error occurs
	 */
	private void writeHexHalfByte(int half) throws IOException {
		if (half < 10) {
			write(48 + half);
		} else {
			write(87 + half);
		}
	}

	/**
	 * Write the shortest representation of the number in two-digit hex encoded
	 * format to the stream.
	 *
	 * @param number
	 *            number to write
	 * @throws IOException if an I/O error occurs
	 */
	void writeHexInteger(int number) throws IOException {
		int part;
		part = (number >> 24) & 0xFF;
		boolean hasWritten = false;
		if (part > 0) {
			hasWritten = true;
			writeHexByte(part);
		}
		part = (number >> 16) & 0xFF;
		if (part > 0 || hasWritten) {
			hasWritten = true;
			writeHexByte(part);
		}
		part = (number >> 8) & 0xFF;
		if (part > 0 || hasWritten) {
			hasWritten = true;
			writeHexByte(part);
		}
		part = (number >> 0) & 0xFF;
		if (part > 0 || hasWritten) {
			hasWritten = true;
			writeHexByte(part);
		}

	}

	/**
	 * Add the calculated hash to the end of the packet and flush the target
	 * stream.
	 *
	 * @throws IOException if an I/O error occurs
	 */
	private final void _close() throws IOException {
		this.target.write('#');
		int hsh = hash % 256;
		this.target.write(String.format("%02x", hsh).getBytes());
		this.target.flush();
	}

	/**
	 * Send the packet and get acknowledgment.
	 *
	 * @return <code>true</code> on success
	 * @throws IOException if an I/O error occurs
	 */
	boolean send() throws IOException {
		_close();
		return comm.getAck();
	}

}
