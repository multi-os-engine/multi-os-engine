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

package org.moe.common.developer;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SigningIdentity implements Comparable<SigningIdentity>, Serializable {

    private final static String PATTERN = "^\\d+\\)\\s+([0-9A-F]+)\\s+\"([^\"]*)\"\\s*(.*)";

    private final String name;
    private final String fingerprint;

    public SigningIdentity(String name, String fingerprint) {
        this.name = name;
        this.fingerprint = fingerprint;
    }

    private static SigningIdentity parse(String line) {
        SigningIdentity identity = null;

        Pattern pattern = Pattern.compile(PATTERN);

        Matcher matcher = pattern.matcher(line);

        if (!matcher.find()) {
            return null;
        }

        String name = matcher.group(2);
        String fingerprint = matcher.group(1);
        String flags = matcher.group(3);

        if (flags == null || !flags.contains("CSSMERR_TP_CERT_")) {
            identity = new SigningIdentity(name, fingerprint);
        }

        return identity;
    }

    public static List<SigningIdentity> getIdentities() throws Exception {

        ArrayList<SigningIdentity> list = new ArrayList<SigningIdentity>();

        SimpleExec exec = SimpleExec.getExec("security");
        List<String> execArgs = exec.getArguments();

        execArgs.add("find-identity");
        execArgs.add("-v");
        execArgs.add("-p");
        execArgs.add("codesigning");

        String output = ExecOutputCollector.collect(exec);

        if (output == null) {
            return Collections.emptyList();
        }

        String[] lines = output.split("\n");

        for (String line : lines) {
            SigningIdentity identity = parse(line.trim());

            if (identity != null) {
                list.add(identity);
            }
        }

        return list;
    }

    public String fingerprint() {
        return fingerprint;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "SigningIdentity [name=" + name + ",fingerprint=" + fingerprint + "]";
    }

    @Override
    public int compareTo(SigningIdentity compareTo) {
        return this.name.compareToIgnoreCase(compareTo.name);
    }

    public String getFormattedOutput(int nIndex) {
        return String.valueOf(nIndex) + ") " + fingerprint + " \"" + name + '\"';
    }
}
