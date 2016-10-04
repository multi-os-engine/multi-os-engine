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

package org.moe.document.pbxproj.nextstep;

import org.moe.document.pbxproj.nextstep.Tokenizer.Token;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array<V extends NextStep> extends NextStep implements List<V> {

    private final ArrayList<V> values;

    static Array<NextStep> create(Tokenizer t) throws NextStepException {
        Token token = t.next();
        if (token == null) {
            throw new NextStepException("early end of token stream");
        }
        if (token.kind != Token.Parentheses_open) {
            throw new NextStepException("illegal state");
        }

        Array<NextStep> array = new Array<NextStep>();
        token = t.peek();
        while (token != null) {
            switch (token.kind) {
            case Token.Parentheses_close:
                t.next();
                return array;

            default:
                NextStep value = NextStep.get(t);

                token = t.next();
                if (token == null) {
                    throw new NextStepException("early end of token stream");
                }
                if (token.kind != Token.Comma) {
                    throw new NextStepException("illegal state");
                }

                array.add(value);
                break;
            }

            token = t.peek();
        }
        throw new NextStepException("early end of token stream");
    }

    public Array() {
        this(null, true);
    }

    public Array(ArrayList<V> subList) {
        this(subList, true);
    }

    public Array(ArrayList<V> subList, boolean copy) {
        if (subList == null) {
            this.values = new ArrayList<V>();
        } else {
            if (copy) {
                this.values = new ArrayList<V>(subList);
            } else {
                this.values = subList;
            }
        }
    }

    @Override
    public int hashCode() {
        return values.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof List<?>)) {
            return false;
        }

        return values.equals(obj);
    }

    @Override
    public String print(int depth) {
        StringBuilder builder = new StringBuilder();
        builder.append("(\n");
        for (NextStep value : values) {
            ident(builder, depth + 1);
            builder.append(value.print(depth + 1));
            builder.append(",\n");
        }
        ident(builder, depth);
        builder.append(")");
        return builder.toString();
    }

    @Override
    public String printInline(int depth) {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        for (NextStep value : values) {
            builder.append(value.printInline(depth + 1));
            builder.append(", ");
        }
        builder.append(")");
        return builder.toString();
    }

    @Override
    public boolean add(V object) {
        return values.add(object);
    }

    @Override
    public void add(int index, V object) {
        values.add(index, object);
    }

    @Override
    public boolean addAll(Collection<? extends V> collection) {
        return values.addAll(collection);
    }

    @Override
    public boolean addAll(int index, Collection<? extends V> collection) {
        return values.addAll(index, collection);
    }

    @Override
    public void clear() {
        values.clear();
    }

    @Override
    public boolean contains(Object object) {
        return values.contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return values.containsAll(collection);
    }

    @Override
    public V get(int index) {
        return values.get(index);
    }

    @Override
    public int indexOf(Object object) {
        return values.indexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return values.isEmpty();
    }

    @Override
    public Iterator<V> iterator() {
        return values.iterator();
    }

    @Override
    public int lastIndexOf(Object object) {
        return values.lastIndexOf(object);
    }

    @Override
    public ListIterator<V> listIterator() {
        return values.listIterator();
    }

    @Override
    public ListIterator<V> listIterator(int index) {
        return values.listIterator(index);
    }

    @Override
    public boolean remove(Object object) {
        return values.remove(object);
    }

    @Override
    public V remove(int index) {
        return values.remove(index);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return values.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return values.retainAll(collection);
    }

    @Override
    public V set(int index, V object) {
        return values.set(index, object);
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public List<V> subList(int from, int to) {
        return new Array<V>((ArrayList<V>)values.subList(from, to));
    }

    @Override
    public Object[] toArray() {
        return values.toArray();
    }

    @Override
    public <T> T[] toArray(T[] array) {
        return values.toArray(array);
    }

}
