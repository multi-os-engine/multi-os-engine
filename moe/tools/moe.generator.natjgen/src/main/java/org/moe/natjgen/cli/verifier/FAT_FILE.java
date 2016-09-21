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

package org.moe.natjgen.cli.verifier;

import org.moe.natjgen.cli.exceptions.UnsupportedTypeException;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FAT_FILE {

    List<mach_header> archs = new ArrayList<mach_header>();

    FAT_FILE(Path fatFile) throws UnsupportedTypeException {
        try {
            byte[] filedata = Files.readAllBytes(fatFile);
            fat_header fatHeader = new fat_header(filedata);
            int nArch = fatHeader.getNArch();
            boolean isBigEndian = fatHeader.isBigEndian();
            for (int i = 0; i < nArch; i++) {
                fat_arch fatArch = new fat_arch(filedata, 8 + i * 20, true);
                mach_header header = new mach_header(filedata, fatArch.getOffset());
                archs.add(header);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    List<ArchitectureVerifier.CPU_TYPE> getCPU_TYPEs() throws UnsupportedTypeException {
        List<ArchitectureVerifier.CPU_TYPE> archList = new ArrayList<ArchitectureVerifier.CPU_TYPE>();
        for (mach_header arch : archs) {
            ArchitectureVerifier.CPU_TYPE type = ArchitectureVerifier.CPU_TYPE
                    .getArchByCPUType(arch.getCputype(), arch.getCpuSubtype());
            type.setStatic(arch.isStatic());
            archList.add(type);
        }
        return archList;
    }

    private static class fat_header {
        /*
         *  For more information see http://opensource.apple.com//source/xnu/xnu-2422.1.72/EXTERNAL_HEADERS/mach-o/fat.h
         */

        private static final int FAT_MAGIC = 0xcafebabe;
        private static final int FAT_CIGAM = 0xbebafeca;

        private int magic; /* FAT_MAGIC */
        private int nfat_arch; /* number of structs that follow */

        fat_header(byte[] filedata) throws UnsupportedTypeException {
            magic = readInt(filedata, 0, true);
            if (magic == FAT_MAGIC) { //big endian
                nfat_arch = readInt(filedata, 4, true);
            } else if (magic == FAT_CIGAM) { //little endian
                nfat_arch = readInt(filedata, 4, false);
            } else throw new UnsupportedTypeException("Not a fat file");
        }

        int getNArch() {
            return nfat_arch;
        }

        boolean isBigEndian() {
            return magic == FAT_MAGIC;
        }
    }

    private static class fat_arch {
        /*
         *  For more information see http://opensource.apple.com//source/xnu/xnu-2422.1.72/EXTERNAL_HEADERS/mach-o/fat.h
         *  and http://opensource.apple.com/source/cctools/cctools-822/include/mach/machine.h
         */

        public enum CPU_TYPE {

            ANY("ANY", -1),
            VAX("VAX", 1),
            ROMP("ROMP", 2),
            NS32032("NS32032", 4),
            NS32332("NS32332", 5),
            MC680x0("MC680x0", 6),
            I386("I386", 7),
            MIPS("MIPS", 8),
            NS32532("NS32532", 9),
            HPPA("HPPA", 11),
            ARM("ARM", 12),
            MC88000("MC88000", 13),
            SPARC("SPARC", 14),
            I860("I860", 15),
            // big-endian
            I860_LITTLE("I860_LITTLE", 16),
            // little-endian
            RS6000("RS6000", 17),
            MC98000("MC98000", 18),
            POWERPC("POWERPC", 18),
            ABI64("ABI64", 0x1000000),
            POWERPC64("POWERPC64", (getIdByType("POWERPC") | getIdByType("ABI64"))),
            VEO("VEO", 255),
            X86_64("X86_64", (getIdByType("I386") | getIdByType("ABI64")));

            private String cpu_type;
            private int cpu_id;

            CPU_TYPE(String _cpu_type, int _cpu_id) {
                cpu_type = _cpu_type;
                cpu_id = _cpu_id;
            }

            public static CPU_TYPE getCpuById(int _cpu_id) throws UnsupportedTypeException {
                for (CPU_TYPE type : CPU_TYPE.values()) {
                    if (type.cpu_id == _cpu_id) {
                        return type;
                    }
                }
                throw new UnsupportedTypeException("Unknown CPU id");
            }

            private static int getIdByType(String _cpu_type) {
                for (CPU_TYPE type : CPU_TYPE.values()) {
                    if (type.cpu_type.equals(_cpu_type)) {
                        return type.cpu_id;
                    }
                }
                throw new RuntimeException("Unknown CPU type");
            }
        }

        private int cputype;	/* cpu specifier (int) */
        private int cpusubtype;	/* machine specifier (int) */
        private int offset;		/* file offset to this object file */
        private int size;		/* size of this object file */
        private int align;		/* alignment as a power of 2 */

        fat_arch(byte[] filedata, int begining, boolean isBigEndian) {
            cputype = readInt(filedata, begining, isBigEndian);
            cpusubtype = readInt(filedata, begining + 4, isBigEndian);
            offset = readInt(filedata, begining + 8, isBigEndian);
            size = readInt(filedata, begining + 12, isBigEndian);
            align = readInt(filedata, begining + 16, isBigEndian);
        }

        public int getOffset() {
            return offset;
        }

    }

    private static class mach_header {
        /*
         *  For more information see http://opensource.apple.com//source/xnu/xnu-2050.18.24/EXTERNAL_HEADERS/mach-o/loader.h
         */

        public enum FILE_TYPE {

            MH_OBJECT(0x1, true),		/* relocatable object file */
            MH_EXECUTE(0x2, false),		/* demand paged executable file */
            MH_FVMLIB(0x3, false),		/* fixed VM shared library file */
            //MH_CORE	(0x4,???),		/* core file */
            //MH_PRELOAD(0x5,???),		/* preloaded executable file */
            MH_DYLIB(0x6, false),		/* dynamically bound shared library */
            MH_DYLINKER(0x7, false),		/* dynamic link editor */
            MH_BUNDLE(0x8, false),		/* dynamically bound bundle file */
            MH_DYLIB_STUB(0x9, false),		/* shared library stub for static */
            /*  linking only, no section contents */
            MH_DSYM(0xa, true),		/* companion file with only debug */
            /*  sections */
            MH_KEXT_BUNDLE(0xb, true);		/* x86_64 kexts */

            private int id;
            private boolean isStatic;

            FILE_TYPE(int _id, boolean _isStatic) {
                id = _id;
                isStatic = _isStatic;
            }

            public static boolean isStatic(int _id) throws UnsupportedTypeException {
                for (FILE_TYPE type : FILE_TYPE.values()) {
                    if (type.id == _id) {
                        return type.isStatic;
                    }
                }
                throw new UnsupportedTypeException("Unknown filetype id");
            }
        }

        /* Constant for the magic field of the mach_header (32-bit architectures) */
        private static final int MH_MAGIC = 0xfeedface;	/* the mach magic number */
        private static final int MH_CIGAM = 0xcefaedfe;	/* NXSwapInt(MH_MAGIC) */

        /* Constant for the magic field of the mach_header_64 (64-bit architectures) */
        private static final int MH_MAGIC_64 = 0xfeedfacf; /* the 64-bit mach magic number */
        private static final int MH_CIGAM_64 = 0xcffaedfe; /* NXSwapInt(MH_MAGIC_64) */

        private int magic;		/* mach magic number identifier */
        private int cputype;	/* cpu specifier */
        private int cpusubtype;	/* machine specifier */
        private int filetype;	/* type of file */
        private int ncmds;		/* number of load commands */
        private int sizeofcmds;	/* the size of all the load commands */
        private int flags;		/* flags */
        private int reserved;	/* reserved; for 64bit */

        mach_header(byte[] filedata, int begining) {
            magic = readInt(filedata, begining, true);
            boolean isBigEndian = (magic == MH_MAGIC || magic == MH_MAGIC_64);
            cputype = readInt(filedata, begining + 4, isBigEndian);
            cpusubtype = readInt(filedata, begining + 8, isBigEndian);
            filetype = readInt(filedata, begining + 12, isBigEndian);
            ncmds = readInt(filedata, begining + 16, isBigEndian);
            sizeofcmds = readInt(filedata, begining + 20, isBigEndian);
            flags = readInt(filedata, begining + 24, isBigEndian);
            reserved = readInt(filedata, begining + 28, isBigEndian);
        }

        public int getCputype() {
            return cputype;
        }

        public int getCpuSubtype() {
            return cpusubtype;
        }

        public boolean isStatic() throws UnsupportedTypeException {
            return FILE_TYPE.isStatic(filetype);
        }
    }

    private static int readInt(byte[] filedata, int index, boolean isBigEndian) {
        ByteBuffer wrapped = ByteBuffer
                .wrap(new byte[] { filedata[index], filedata[index + 1], filedata[index + 2], filedata[index + 3] });
        wrapped.order(isBigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        return wrapped.getInt();
    }
}
