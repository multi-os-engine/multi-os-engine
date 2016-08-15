/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.remote.file;

import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.IOException;

public class FileEntry extends Entry {

    @NotNull
    private final File localFile;

    FileEntry(@NotNull String name, @NotNull EntryParent parent, @NotNull File localFile) {
        super(name, parent);
        this.localFile = Require.nonNull(localFile.getAbsoluteFile());
    }

    @Override
    public String toString() {
        return getRemotePath() + " [" + localFile.toString() + "]";
    }

    @NotNull
    public File getLocalFile() {
        return localFile;
    }

    @Override
    protected void walk(@NotNull Walker walker) throws IOException {
        walker.visitFile(this, parent.isLast(this));
    }
}
