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

package org.clang.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StdHeaders {

    private static String PATH;

    private StdHeaders() {
    }

    public static synchronized String getPath() {
        if (PATH != null) {
            return PATH;
        }

        File tmp;
        try {
            tmp = File.createTempFile("NatJGen", "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tmp.delete();
        tmp.mkdir();
        PATH = tmp.getAbsolutePath();

        copyStdHeader("__clang_cuda_cmath.h");
        copyStdHeader("__clang_cuda_intrinsics.h");
        copyStdHeader("__clang_cuda_math_forward_declares.h");
        copyStdHeader("__clang_cuda_runtime_wrapper.h");
        copyStdHeader("__stddef_max_align_t.h");
        copyStdHeader("__wmmintrin_aes.h");
        copyStdHeader("__wmmintrin_pclmul.h");
        copyStdHeader("adxintrin.h");
        copyStdHeader("altivec.h");
        copyStdHeader("ammintrin.h");
        copyStdHeader("arm_acle.h");
        copyStdHeader("arm_neon.h");
        copyStdHeader("avx2intrin.h");
        copyStdHeader("avx512bwintrin.h");
        copyStdHeader("avx512cdintrin.h");
        copyStdHeader("avx512dqintrin.h");
        copyStdHeader("avx512erintrin.h");
        copyStdHeader("avx512fintrin.h");
        copyStdHeader("avx512ifmaintrin.h");
        copyStdHeader("avx512ifmavlintrin.h");
        copyStdHeader("avx512pfintrin.h");
        copyStdHeader("avx512vbmiintrin.h");
        copyStdHeader("avx512vbmivlintrin.h");
        copyStdHeader("avx512vlbwintrin.h");
        copyStdHeader("avx512vlcdintrin.h");
        copyStdHeader("avx512vldqintrin.h");
        copyStdHeader("avx512vlintrin.h");
        copyStdHeader("avxintrin.h");
        copyStdHeader("bmi2intrin.h");
        copyStdHeader("bmiintrin.h");
        copyStdHeader("clflushoptintrin.h");
        copyStdHeader("cpuid.h");
        copyStdHeader("cuda_builtin_vars.h");
        copyStdHeader("emmintrin.h");
        copyStdHeader("f16cintrin.h");
        copyStdHeader("float.h");
        copyStdHeader("fma4intrin.h");
        copyStdHeader("fmaintrin.h");
        copyStdHeader("fxsrintrin.h");
        copyStdHeader("htmintrin.h");
        copyStdHeader("htmxlintrin.h");
        copyStdHeader("ia32intrin.h");
        copyStdHeader("immintrin.h");
        copyStdHeader("intrin.h");
        copyStdHeader("inttypes.h");
        copyStdHeader("iso646.h");
        copyStdHeader("limits.h");
        copyStdHeader("lzcntintrin.h");
        copyStdHeader("mm_malloc.h");
        copyStdHeader("mm3dnow.h");
        copyStdHeader("mmintrin.h");
        copyStdHeader("module.modulemap");
        copyStdHeader("mwaitxintrin.h");
        copyStdHeader("nmmintrin.h");
        copyStdHeader("opencl-c.h");
        copyStdHeader("pkuintrin.h");
        copyStdHeader("pmmintrin.h");
        copyStdHeader("popcntintrin.h");
        copyStdHeader("prfchwintrin.h");
        copyStdHeader("rdseedintrin.h");
        copyStdHeader("rtmintrin.h");
        copyStdHeader("s390intrin.h");
        copyStdHeader("shaintrin.h");
        copyStdHeader("smmintrin.h");
        copyStdHeader("stdalign.h");
        copyStdHeader("stdarg.h");
        copyStdHeader("stdatomic.h");
        copyStdHeader("stdbool.h");
        copyStdHeader("stddef.h");
        copyStdHeader("stdint.h");
        copyStdHeader("stdnoreturn.h");
        copyStdHeader("tbmintrin.h");
        copyStdHeader("tgmath.h");
        copyStdHeader("tmmintrin.h");
        copyStdHeader("unwind.h");
        copyStdHeader("vadefs.h");
        copyStdHeader("varargs.h");
        copyStdHeader("vecintrin.h");
        copyStdHeader("wmmintrin.h");
        copyStdHeader("x86intrin.h");
        copyStdHeader("xmmintrin.h");
        copyStdHeader("xopintrin.h");
        copyStdHeader("xsavecintrin.h");
        copyStdHeader("xsaveintrin.h");
        copyStdHeader("xsaveoptintrin.h");
        copyStdHeader("xsavesintrin.h");
        copyStdHeader("xtestintrin.h");

        return PATH;
    }

    private static void copyStdHeader(String resourceName) {
        try {
            copyResource(resourceName, new File(PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void copyResource(String resourceName, File target) throws IOException {
        InputStream stream = StdHeaders.class.getResourceAsStream(resourceName);
        if (stream == null) {
            throw new IOException("Resource " + resourceName + " not found");
        }
        try {
            File targetFile = new File(target, resourceName);
            if (!targetFile.getParentFile().exists()) {
                targetFile.getParentFile().mkdirs();
            }
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(targetFile);
                byte buffer[] = new byte[8192];
                int read;
                while ((read = stream.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
