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
import java.util.ArrayList;
import java.util.List;

public class DirectoryEntry extends Entry implements EntryParent {
    final List<Entry> entries = new ArrayList<>();

    DirectoryEntry(@NotNull String name, @NotNull EntryParent parent) {
        super(name, parent);
    }

    @Override
    protected void walk(@NotNull Walker walker) throws IOException {
        final boolean isLast = parent.isLast(this);
        walker.preVisitDirectory(this, isLast);
        for (Entry entry : entries) {
            entry.walk(walker);
        }
        walker.postVisitDirectory(this, isLast);
    }

    @Override
    public DirectoryEntry getEntry() {
        return this;
    }

    @Override
    public EntryParent getEntryParent() {
        return parent;
    }

    @Override
    public boolean isLast(Entry entry) {
        Require.TRUE(entries.contains(entry), "unexpected state");
        Require.sizeGT(entries, 0);
        return entries.indexOf(entry) == entries.size() - 1;
    }
}
