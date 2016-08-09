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

package org.moe.common.utils;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtil {

    private static boolean isDesiredType(File file, SearchTarget targetType) {
        return ((targetType == FileUtil.SearchTarget.FILES) && file.isFile()) ||
                ((targetType == FileUtil.SearchTarget.DIRECTORIES) && file.isDirectory()) ||
                (targetType == FileUtil.SearchTarget.ALL);
    }

    private static void validateTargetDirPath(File targetDir) throws IOException {
        if (targetDir == null) {
            throw new NullPointerException("Search path equals null!");
        }

        if (!targetDir.exists()) {
            throw new IOException("Search path does not exist: '" + targetDir.getAbsolutePath() + "'");
        }

        if (!targetDir.isDirectory()) {
            throw new IOException("Search path is not a directory: '" + targetDir.getAbsolutePath() + "'");
        }
    }

    public
    static ArrayList<String> getFileNamesListByExtension(File targetDir, String extension, SearchTarget targetType)
            throws IOException {
        validateTargetDirPath(targetDir);

        ArrayList<String> result = new ArrayList<String>();

        File[] filesList = targetDir.listFiles(new FilterByExtension(extension));

        if ((filesList != null) && (filesList.length > 0)) {
            for (File file : filesList) {
                if (isDesiredType(file, targetType)) {
                    result.add(FilenameUtils.removeExtension(file.getName()));
                }
            }
        } else {
            throw new IOException("Failed to find files with extension '" + extension + "' in directory '" + targetDir.getAbsolutePath() + "'");
        }

        return result;
    }

    static class FilterByExtension implements FilenameFilter {

        private String extension;

        public FilterByExtension(String extension) {
            this.extension = extension;
        }

        public boolean accept(File dir, String name) {
            return FilenameUtils.isExtension(name, extension);
        }
    }

    public enum SearchTarget {
        FILES,
        DIRECTORIES,
        ALL
    }

    public static File checkFile(File fileToCheck) throws IOException {
        if (fileToCheck == null || !fileToCheck.exists()) {
            throw new IOException("Failed to find: " + (fileToCheck == null ? "null" : fileToCheck.getAbsolutePath()));
        }
        return fileToCheck;
    }
}
