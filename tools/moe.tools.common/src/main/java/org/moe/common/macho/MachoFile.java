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

package org.moe.common.macho;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility for checking mach-o files.
 */
public class MachoFile {

	/*
     * Reference
	 * https://developer.apple.com/
	 * library/mac/documentation/DeveloperTools/Conceptual/MachORuntime/index.html
	 */

    /**
     * CPU name for arm.
     */
    public static final String CPU_NAME_ARM = "arm";
    /**
     * CPU name for arm64.
     */
    public static final String CPU_NAME_ARM64 = "arm64";
    /**
     * CPU name for i386.
     */
    public static final String CPU_NAME_I386 = "i386";
    /**
     * CPU name for x86_64.
     */
    public static final String CPU_NAME_X86_64 = "x86_64";

    /**
     * Flag for ABI64.
     */
    private static final int CPU_ARCH_ABI64 = 0x01000000;
    /**
     * CPU type for arm.
     */
    private static final int CPU_TYPE_ARM = 12;
    /**
     * CPU type for arm64.
     */
    private static final int CPU_TYPE_ARM64 = CPU_TYPE_ARM | CPU_ARCH_ABI64;
    /**
     * CPU type for i386.
     */
    private static final int CPU_TYPE_I386 = 7;
    /**
     * CPU type for x86_64.
     */
    private static final int CPU_TYPE_X86_64 = CPU_TYPE_I386 | CPU_ARCH_ABI64;

    /**
     * CPU types supported by the macho file.
     */
    private final ArrayList<String> cpuTypes = new ArrayList<String>();

    /**
     * Creates and reads the header of a mach-o file.
     *
     * @param input Mach-o file to read.
     * @throws IOException If any errors occurs
     */
    private MachoFile(InputStream input) throws IOException {
        if (input == null) {
            throw new NullPointerException();
        }
        DataInputStream dis = new DataInputStream(input);
        try {
            int magic = dis.readInt();

            if (magic == 0xcafebabe) {
                readFromFat(dis);
            } else if (magic == swap(0xfeedface)) {
                readFrom32(dis);
            } else if (magic == swap(0xfeedfacf)) {
                readFrom64(dis);
            } else {
                throw new IOException("Invalid magic");
            }
        } catch (IOException e) {
            throw new IOException("Read error", e);
        } finally {
            dis.close();
        }
    }

    /**
     * Returns the supported CPU types of the specified mach-o file.
     *
     * @param file file to read
     * @return List of supported CPU types.
     * @throws IOException If any errors occurs
     */
    public static List<String> getRecognizedCPUTypes(File file) throws IOException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("bad file");
        }
        return getRecognizedCPUTypes(new FileInputStream(file));
    }

    /**
     * Returns the supported CPU types of the specified mach-o file.
     *
     * @param stream data to read
     * @return List of supported CPU types.
     * @throws IOException If any errors occurs
     */
    public static List<String> getRecognizedCPUTypes(InputStream stream) throws IOException {
        MachoFile machoFile = new MachoFile(stream);
        return new ArrayList<String>(machoFile.cpuTypes);
    }

    /**
     * Reads a 64-bit mach-o binary.
     *
     * @param dis input stream
     * @throws IOException If a read error occurs
     */
    private void readFrom64(DataInputStream dis) throws IOException {
        int cpuType = dis.readInt();
        appendCPUType(swap(cpuType));
    }

    /**
     * Reads a 32-bit mach-o binary.
     *
     * @param dis input stream
     * @throws IOException If a read error occurs
     */
    private void readFrom32(DataInputStream dis) throws IOException {
        int cpuType = dis.readInt();
        appendCPUType(swap(cpuType));
    }

    /**
     * Reads a fat mach-o binary.
     *
     * @param dis input stream
     * @throws IOException If a read error occurs
     */
    private void readFromFat(DataInputStream dis) throws IOException {
        int num = dis.readInt();
        for (int i = 0; i < num; ++i) {
            int cpuType = dis.readInt();
            appendCPUType(cpuType);
            if (dis.skip(16) != 16) {
                throw new IOException("Failed to skip 16 bytes");
            }
        }
    }

    /**
     * Appends a CPU type if it is recognized.
     *
     * @param cpuType CPU type
     */
    private void appendCPUType(int cpuType) {
        String name = getCPUName(cpuType);
        if (name != null) {
            cpuTypes.add(name);
        }
    }

    /**
     * Returns the CPU name for the specified CPU type.
     *
     * @param cpuType CPU type
     * @return CPU name
     */
    public static String getCPUName(int cpuType) {
        switch (cpuType) {
        case CPU_TYPE_ARM:
            return CPU_NAME_ARM;
        case CPU_TYPE_ARM64:
            return CPU_NAME_ARM64;
        case CPU_TYPE_I386:
            return CPU_NAME_I386;
        case CPU_TYPE_X86_64:
            return CPU_NAME_X86_64;

        default:
            return null;
        }
    }

    /**
     * Swaps an integer value.
     *
     * @param value value to swap
     * @return swapped value
     */
    public static int swap(int value) {
        int b1 = (value) & 0xff;
        int b2 = (value >> 8) & 0xff;
        int b3 = (value >> 16) & 0xff;
        int b4 = (value >> 24) & 0xff;

        return b1 << 24 | b2 << 16 | b3 << 8 | b4;
    }
}
