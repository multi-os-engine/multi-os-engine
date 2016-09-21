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

package org.moe.natjgen.cli.executable;

import org.eclipse.jdt.annotation.NonNull;
import org.moe.natjgen.cli.exceptions.ExecutionException;
import org.moe.natjgen.cli.executable.Svn.NotDirectoryException;
import org.moe.natjgen.cli.utils.Utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Pod {

    private static final String[] PATH = new String[] { "/usr/local/bin/pod", "/usr/bin/pod" };
    private static File POD;

    private static void configureEnvironment() throws PodNotFoundException, IOException {
        if (POD != null) return;
        for (String path : PATH) {
            File pod = new File(path);
            if (pod.exists()) {
                POD = pod;
            }
        }
        if (POD == null) throw new PodNotFoundException(
                "Cocoapods does not installed. Install it on OS X by running the following command from the terminal 'sudo gem install cocoapods'");

        String[] output = Utils.execute(null, POD + " repo update", null);
        if (output[1] != null) {
            System.out.println(output[0]);
            System.err.println(output[1]);
            throw new IOException("Cocoapods has a problem with internet connection; please check your proxy settings");
        }

    }

    public static void install(File dir) throws PodNotFoundException, NotDirectoryException, IOException {
        configureEnvironment();
        if (dir != null && !dir.isDirectory()) {
            throw new NotDirectoryException(dir.toString() + " is not a directory!");
        }
        System.setProperty("LANG", "en_US.UTF-8");
        Map<String, String> env = new HashMap<>();
        env.put("LANG", "en_US.UTF-8");
        String[] res = Utils.execute(dir, POD.getAbsolutePath() + " install", env);
        if (res[1] != null) throw new RuntimeException(res[0] + "\n" + res[1]); //Something wrong
    }

    public static String getSpecContent(@NonNull String pod) throws PodNotFoundException, IOException {
        configureEnvironment();
        String[] result = Utils.execute(null, POD.getAbsolutePath() + " spec cat " + pod, null);
        if (result[1] != null) throw new RuntimeException(result[0] + result[1]);
        return result[0];
    }

    public static class PodNotFoundException extends ExecutionException {

        private static final long serialVersionUID = -9103733687479200379L;

        public PodNotFoundException(String error) {
            super(error);
        }

    }

}
