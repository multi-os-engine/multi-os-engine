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

package org.moe.common.sdk;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;
import org.moe.common.utils.SplitOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SdkManager {
    public static final Pattern sdkPattern = Pattern.compile(".+iOS (\\d.\\d).+", Pattern.DOTALL);

    public static List<Sdk> list() throws Exception {
        String sdkVersion;

        List<Sdk> result = new ArrayList<Sdk>();

        SimpleExec exec = SimpleExec.getExec("xcodebuild");
        exec.getArguments().add("-showsdks");

        String lines[] = SplitOutput.split(ExecOutputCollector.collect(exec));

        boolean found;

        for(String line: lines) {
            Matcher matcher = sdkPattern.matcher(line);

            if(!matcher.matches()) {
                continue;
            }

            sdkVersion = matcher.group(1);

            found = false;

            for(Sdk sdk : result) {
                if(sdk.version().compareToIgnoreCase(sdkVersion) == 0) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                result.add(new Sdk(sdkVersion));
            }
        }

        return result;
    }

    public static List<Sdk> parse(String line) {
        Matcher matcher = sdkPattern.matcher(line);

        String sdk;

        List<Sdk> sdks = new ArrayList<Sdk>();

        while (matcher.find()) {
            sdk = matcher.group(0);
            sdks.add(new Sdk(sdk));
        }

        return sdks;
    }

}
