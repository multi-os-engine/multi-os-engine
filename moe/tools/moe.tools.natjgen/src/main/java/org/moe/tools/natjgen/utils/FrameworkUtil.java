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

package org.moe.tools.natjgen.utils;

import org.moe.common.constants.MOEManifestConstants;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrameworkUtil {

    public static void copyFolder(File source, File destination) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            if (source.isDirectory()) {

                if (!destination.exists()) {
                    destination.mkdirs();
                }

                String fileArray[] = source.list();
                if (fileArray != null) {
                    for (String file : fileArray) {
                        File sourceFile = new File(source, file);
                        File destinationFile = new File(destination, file);

                        copyFolder(sourceFile, destinationFile);
                    }
                }
            }
            else {
                inputStream = new FileInputStream(source);
                outputStream = new FileOutputStream(destination);

                byte[] buf = new byte[1024];

                int length;
                while ((length = inputStream.read(buf)) > 0) {
                    outputStream.write(buf, 0, length);
                }
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    public static void copyFiles(File file1, File file2) {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = new FileInputStream(file1);
            outStream = new FileOutputStream(file2);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static List<CPU_TYPE> checkArchitectures(File framework) {
        List<CPU_TYPE> archList = new ArrayList<CPU_TYPE>();
        try {
            byte[] filedata = getFileBytes(framework);

            //read arch data
            //fat_header - 4kB
            //fat_arch - 20kB
            //fat_header + (5 * fat_arch) = 108
            int maxArchIdx = 108;

            for (int i = 8; i < maxArchIdx; i += 20) {

                if (filedata[i] != 0 || filedata[i + 1] != 0 || filedata[i + 2] != 0 || filedata[i + 3] != 0) {
                    ByteBuffer wrapped = ByteBuffer.wrap(new byte[]{filedata[i], filedata[i + 1], filedata[i + 2], filedata[i + 3]}); // big-endian by default
                    int cputype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 4], filedata[i + 5], filedata[i + 6], filedata[i + 7]}); // big-endian by default
                    int cpusubtype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 8], filedata[i + 9], filedata[i + 10], filedata[i + 11]}); // big-endian by default
                    int offset = wrapped.getInt();

                    if (offset < maxArchIdx) {
                        maxArchIdx = offset;
                    }
                    //check if static: A static archive library begins with the file identifier string !<arch>
                    if (offset + 6 < filedata.length) {
                        StringBuilder builder = new StringBuilder();
                        builder.append((char) filedata[offset])
                                .append((char) filedata[offset + 1])
                                .append((char) filedata[offset + 2])
                                .append((char) filedata[offset + 3])
                                .append((char) filedata[offset + 4])
                                .append((char) filedata[offset + 5])
                                .append((char) filedata[offset + 6]);
                        CPU_TYPE type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                        if (type != null) {
                            type.setStatic(builder.toString().equals("!<arch>"));
                            archList.add(type);
                        }
                    }
                } else {
                    break;
                }
            }

            if (archList.size() == 0) {
                int i = 4;
                ByteBuffer wrapped = ByteBuffer.wrap(new byte[]{filedata[i], filedata[i + 1], filedata[i + 2], filedata[i + 3]}); // big-endian by default
                int cputype = wrapped.getInt();

                wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 4], filedata[i + 5], filedata[i + 6], filedata[i + 7]}); // big-endian by default
                int cpusubtype = wrapped.getInt();

                wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 8], filedata[i + 9], filedata[i + 10], filedata[i + 11]}); // big-endian by default
                int offset = wrapped.getInt();

                CPU_TYPE type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                if (type == null) {
                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i], filedata[i + 1], filedata[i + 2], filedata[i + 3]}); // big-endian by default
                    wrapped.order(ByteOrder.LITTLE_ENDIAN);
                    cputype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 4], filedata[i + 5], filedata[i + 6], filedata[i + 7]}); // big-endian by default
                    wrapped.order(ByteOrder.LITTLE_ENDIAN);
                    cpusubtype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 8], filedata[i + 9], filedata[i + 10], filedata[i + 11]}); // big-endian by default
                    wrapped.order(ByteOrder.LITTLE_ENDIAN);
                    offset = wrapped.getInt();

                }

                //check if static: A static archive library begins with the file identifier string !<arch>
                if (offset + 6 < filedata.length) {
                    StringBuilder builder = new StringBuilder();
                    builder.append((char) filedata[offset])
                            .append((char) filedata[offset + 1])
                            .append((char) filedata[offset + 2])
                            .append((char) filedata[offset + 3])
                            .append((char) filedata[offset + 4])
                            .append((char) filedata[offset + 5])
                            .append((char) filedata[offset + 6]);

                    type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                    if (type != null) {
                        type.setStatic(builder.toString().equals("!<arch>"));
                        archList.add(type);
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return archList;
    }

    public enum CPU_TYPE {
        ARMV7("armv7", MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_armv7.name(), 12, 9, true),
        ARMV7S("armv7s", MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_armv7s.name(), 12, 11, true),
        I386("i386", MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_i386.name(), 7, 3, false),
        X86_64("x86_64", MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_x86_64.name(), 16777223, 3, false),
        ARM64("arm64", MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_arm64.name(), 16777228, 0, false);

        private String _arch_name;
        private String _manifest_const;
        private int _cpu_type;
        private int _cpu_subtype;
        private boolean _isArm;
        private boolean _isStatic;

        CPU_TYPE(String arch_name, String manifest_const, int cpu_type, int cpu_subtype, boolean isArm) {
            _arch_name = arch_name;
            _manifest_const = manifest_const;
            _cpu_type = cpu_type;
            _cpu_subtype = cpu_subtype;
            _isArm = isArm;
        }

        public static CPU_TYPE getArchByCPUType(int cpu_type, int cpu_subtype) {
            for (CPU_TYPE type : CPU_TYPE.values()) {
                if (type._cpu_type == cpu_type && type._cpu_subtype == cpu_subtype) {
                    return type;
                }
            }
            return null;
        }

        public boolean isStatic() {
            return _isStatic;
        }

        public void setStatic(boolean isStatic) {
            _isStatic = isStatic;
        }

        public boolean isArm() {
            return _isArm;
        }

        public String getName() {
            return _arch_name;
        }

        public String getManifestConst() {
            return _manifest_const;
        }

    }

    public static byte[] getFileBytes(File file) throws IOException {
        FileInputStream is = null;

        byte[] data;
        try {
            is = new FileInputStream(file);
            data = getInputStreamBytes(is);
        } finally {
            try {
                if(is != null) {
                    is.close();
                }
            } catch (IOException var9) {

            }

        }

        return data;
    }

    public static byte[] getInputStreamBytes(InputStream is) throws IOException {
        ByteArrayOutputStream os = null;

        try {
            os = new ByteArrayOutputStream(4096);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(is);
            byte[] buffer = new byte[4096];

            int count;
            while((count = bufferedInputStream.read(buffer, 0, 4096)) > 0) {
                os.write(buffer, 0, count);
            }

            os.flush();
            byte[] data = os.toByteArray();
            return data;
        } finally {
            try {
                if(os != null) {
                    os.close();
                }
            } catch (IOException var11) {
            }

        }
    }

    public static Map<String, String> getFrameworkMap() {
        BufferedReader reader = null;
        Map<String, String> result = new HashMap<String, String>();
        try {
            InputStream headerStream = FrameworkUtil.class.getResourceAsStream("/template/bindings/frameworks");
            reader = new BufferedReader(new InputStreamReader(headerStream));

            String line;
            StringBuilder contentHeader = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith("#")) {
                    String key = line.split("\\.")[0];
                    String value = String.format("-framework %s", key);
                    result.put(key, value);
                }

            }

        } catch (Exception e) {

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {

                }
            }
        }
        return result;
    }
}
