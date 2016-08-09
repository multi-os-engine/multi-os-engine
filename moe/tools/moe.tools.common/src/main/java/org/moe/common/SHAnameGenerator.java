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

package org.moe.common;


import java.security.NoSuchAlgorithmException;

public class SHAnameGenerator {

    public static String generateUniqueRemoteFolderName(String projectLocalDirPath) {
        final int MAX_FOLDER_NAME_LENGTH = 20;

        String localUserName = System.getProperty("user.name");
        String digestString = "";

        try {
            digestString = generateSHA(MAX_FOLDER_NAME_LENGTH, projectLocalDirPath, localUserName);

        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException("Failed to generate unique remote folder name " + ex.getMessage());
        }

        return digestString;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static String generateSHA(int length, String... args) throws NoSuchAlgorithmException{
        String digestString = "randomizer";
        Sha1Hex digest = new Sha1Hex();

        for (String arg : args) {
            digestString = digest.makeSHA1Hash(digestString + arg);
        }
        if (length < digestString.length()) {
            digestString = digestString.substring(digestString.length() - length);
        }

        return digestString;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
}
