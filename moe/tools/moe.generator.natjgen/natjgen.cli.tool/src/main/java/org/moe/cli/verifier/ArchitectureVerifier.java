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

package org.moe.cli.verifier;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.moe.cli.exceptions.CheckArchitectureException;
import org.moe.cli.exceptions.UnsupportedTypeException;

public class ArchitectureVerifier {

	public enum CPU_TYPE {
		ARMV7("armv7", "MOE_ThirdpartyFramework_armv7", 12, 9, true),
		ARMV7S("armv7s", "MOE_ThirdpartyFramework_armv7s", 12, 11, true),
		I386("i386", "MOE_ThirdpartyFramework_i386", 7, 3, false),
		X86_64("x86_64", "MOE_ThirdpartyFramework_x86_64", 16777223, 3, false),
		ARM64("arm64", "MOE_ThirdpartyFramework_arm64", 16777228, 0, true);

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

		public void setStatic(boolean isStatic) {
			_isStatic = isStatic;
		}

		public boolean isStatic() {
			return _isStatic;
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
	
    public static List<CPU_TYPE> checkArchitectures(File framework) throws CheckArchitectureException {

        try {
            FAT_FILE fr = new FAT_FILE(Paths.get(framework.getPath()));
            List<CPU_TYPE> archListA = fr.getCPU_TYPEs();
            return archListA;
        } catch (UnsupportedTypeException e) {
            //TODO: It is a very-very-VERY bad design. Exceptions never should be accepted.
        }


        List<CPU_TYPE> archList = new ArrayList<CPU_TYPE>();
        try {
        	byte[] filedata = Files.readAllBytes(Paths.get(framework.getPath()));

            //read arch data
            //fat_header - 4kB
            //fat_arch - 20kB
            //fat_header + (5 * fat_arch) = 108
            int maxArchIdx = 108;

            for(int i = 8; i < maxArchIdx; i += 20){

                if(filedata[i] != 0 || filedata[i + 1] != 0 || filedata[i + 2] != 0 || filedata[i + 3] != 0){
                    ByteBuffer wrapped = ByteBuffer.wrap(new byte[]{filedata[i], filedata[i + 1], filedata[i + 2], filedata[i + 3]}); // big-endian by default
                    int cputype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 4], filedata[i + 5], filedata[i + 6], filedata[i + 7]}); // big-endian by default
                    int cpusubtype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 8], filedata[i + 9], filedata[i + 10], filedata[i + 11]}); // big-endian by default
                    int offset = wrapped.getInt();

                    if(offset < maxArchIdx){
                        maxArchIdx = offset;
                    }
                    //check if static: A static archive library begins with the file identifier string !<arch>
                    if(offset + 6 < filedata.length){
                        StringBuilder builder = new StringBuilder();
                        builder.append((char)filedata[offset])
                                .append((char) filedata[offset+1])
                                .append((char) filedata[offset+2])
                                .append((char) filedata[offset+3])
                                .append((char) filedata[offset+4])
                                .append((char) filedata[offset+5])
                                .append((char) filedata[offset + 6]);
                        CPU_TYPE type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                        if(type != null){
                            type.setStatic(builder.toString().equals("!<arch>"));
                            archList.add(type);
                        }
                    }
                }
                else{
                    break;
                }
            }

            if(archList.size() == 0){
                int i = 4;
                ByteBuffer wrapped = ByteBuffer.wrap(new byte[]{filedata[i], filedata[i + 1], filedata[i + 2], filedata[i + 3]}); // big-endian by default
                int cputype = wrapped.getInt();

                wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 4], filedata[i + 5], filedata[i + 6], filedata[i + 7]}); // big-endian by default
                int cpusubtype = wrapped.getInt();

                wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 8], filedata[i + 9], filedata[i + 10], filedata[i + 11]}); // big-endian by default
                int offset = wrapped.getInt();

                CPU_TYPE type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                if(type == null){
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
                if(offset + 6 < filedata.length){
                    StringBuilder builder = new StringBuilder();
                    builder.append((char)filedata[offset])
                            .append((char) filedata[offset+1])
                            .append((char) filedata[offset+2])
                            .append((char) filedata[offset+3])
                            .append((char) filedata[offset+4])
                            .append((char) filedata[offset+5])
                            .append((char) filedata[offset + 6]);

                    type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                    if(type != null){
                        type.setStatic(builder.toString().equals("!<arch>"));
                        archList.add(type);
                    }
                }

            }

        } catch (Exception e) {
            throw new CheckArchitectureException("An error occurred during check architecrute process " + e.getMessage());
        }
        return archList;
    }
}
