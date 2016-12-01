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

package org.moe.tools.natjgen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bindings implements Iterable<AbstractBinding> {

    private final List<AbstractBinding> bindings = new ArrayList<AbstractBinding>();

    private String outputDirectory;

    public int size() {
        return bindings.size();
    }

    public boolean isEmpty() {
        return bindings.isEmpty();
    }

    public Iterator<AbstractBinding> iterator() {
        return bindings.iterator();
    }

    public boolean add(AbstractBinding abstractBinding) {
        return bindings.add(abstractBinding);
    }

    public boolean remove(Object o) {
        return bindings.remove(o);
    }

    public AbstractBinding get(int index) {
        return bindings.get(index);
    }

    public void add(int index, AbstractBinding element) {
        bindings.add(index, element);
    }

    public AbstractBinding remove(int index) {
        return bindings.remove(index);
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }
}
