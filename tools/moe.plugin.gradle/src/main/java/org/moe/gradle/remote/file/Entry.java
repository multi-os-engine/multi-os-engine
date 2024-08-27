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

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class Entry {
    protected final String name;

    @NotNull
    protected final EntryParent parent;

    protected Entry(@NotNull String name, @NotNull EntryParent parent) {
        this.name = Require.nonNull(name);
        this.parent = Require.nonNull(parent);
    }

    protected abstract void walk(@NotNull Walker walker) throws IOException;

    @Override
    public final int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public String toString() {
        return getRemotePath().toString();
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public Path getRemotePath() {
        List<DirectoryEntry> parents = new ArrayList<>();

        EntryParent parent = this.parent;
        while (parent instanceof DirectoryEntry) {
            parents.add(0, parent.getEntry());
            parent = parent.getEntryParent();
        }
        if (parents.size() == 0) {
            return Paths.get(name);
        } else {
            Path path = Paths.get(parents.get(0).name);
            for (int i = 1; i < parents.size(); i++) {
                path = path.resolve(parents.get(i).name);
            }
            return path.resolve(name);
        }
    }
}
