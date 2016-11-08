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

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Dictionary<K extends Value, V extends NextStep> extends NextStep implements Map<K, V> {

    public static class Field<K extends Value, V extends NextStep> {

        private K mKey;
        private V mValue;

        public Field(K key, V value) {
            if (key == null) {
                throw new NullPointerException();
            }
            if (value == null) {
                throw new NullPointerException();
            }
            this.mKey = key;
            this.mValue = value;
        }

        public K getKey() {
            return mKey;
        }

        private void replaceKey(K key) {
            if (key == null) {
                throw new NullPointerException();
            }
            this.mKey = key;
        }

        public V getValue() {
            return mValue;
        }

        public V setValue(V value) {
            if (value == null) {
                throw new NullPointerException();
            }
            final V old = this.mValue;
            this.mValue = value;
            return old;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Field<?, ?> field = (Field<?, ?>)o;

            return mKey.equals(field.mKey) && (mValue != null ? mValue.equals(field.mValue) : field.mValue == null);
        }

        @Override
        public int hashCode() {
            int result = mKey.hashCode();
            result = 31 * result + (mValue != null ? mValue.hashCode() : 0);
            return result;
        }
    }

    private static final FieldPrinter<Value, NextStep> NULL_FIELD_PRINTER = new NullFieldPrinter();

    private FieldPrinter<K, V> customPrinter;

    private final ArrayList<Field<K, V>> fields;

    public ArrayList<Field<K, V>> rawData() {
        return fields;
    }

    static Dictionary<Value, NextStep> create(Tokenizer t) throws NextStepException {
        Token token = t.next();
        if (token == null) {
            throw new NextStepException("early end of token stream");
        }
        if (token.kind != Token.Brace_open) {
            throw new NextStepException("illegal state");
        }

        Dictionary<Value, NextStep> dict = new Dictionary<Value, NextStep>();
        token = t.peek();
        while (token != null) {
            switch (token.kind) {
            case Token.Brace_close:
                t.next();
                return dict;

            default:
                if (token.kind != Token.Value) {
                    throw new NextStepException("illegal state");
                }
                Value key = Value.create(t);

                token = t.next();
                if (token == null) {
                    throw new NextStepException("early end of token stream");
                }
                if (token.kind != Token.Equal) {
                    throw new NextStepException("illegal state");
                }

                NextStep value = get(t);

                token = t.next();
                if (token == null) {
                    throw new NextStepException("early end of token stream");
                }
                if (token.kind != Token.Semicolon) {
                    throw new NextStepException("illegal state");
                }

                dict.put(key, value);
                break;
            }

            token = t.peek();
        }
        throw new NextStepException("early end of token stream");
    }

    public Dictionary() {
        this(null, true);
    }

    protected Dictionary(Dictionary<K, V> dict) {
        this(dict, true);
    }

    protected Dictionary(Dictionary<K, V> dict, boolean copy) {
        if (dict == null) {
            this.fields = new ArrayList<Field<K, V>>();
        } else {
            if (copy) {
                this.fields = (ArrayList<Field<K, V>>)dict.fields.clone();
            } else {
                this.fields = dict.fields;
            }
        }
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Dictionary<?, ?>)) {
            return false;
        }

        return fields.equals(((Dictionary<?, ?>)obj).fields);
    }

    @Override
    public String print(int depth) {
        if (isInline()/* && depth == 2 */) {
            return printInline(depth);
        }

        FieldPrinter<K, V> printer = getCustomPrinter();
        if (printer == null) {
            printer = (FieldPrinter<K, V>)NULL_FIELD_PRINTER;
        }
        printer.initialize();

        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        for (Field<K, V> f : fields) {
            boolean hasnext = fields.indexOf(f) + 1 < fields.size();
            printer.beforeField(f, hasnext, builder);
            if (!printer.printField(f, hasnext, builder)) {
                ident(builder, depth + 1);
                builder.append(f.getKey());
                builder.append(" = ");
                builder.append(f.getValue().print(depth + 1));
                builder.append(";\n");
            }
            printer.afterField(f, hasnext, builder);
        }
        ident(builder, depth);
        builder.append("}");
        return builder.toString();
    }

    @Override
    public String printInline(int depth) {
        FieldPrinter<K, V> printer = getCustomPrinter();
        if (printer == null) {
            printer = (FieldPrinter<K, V>)NULL_FIELD_PRINTER;
        }
        printer.initialize();

        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (Field<K, V> f : fields) {
            boolean hasnext = fields.indexOf(f) + 1 < fields.size();
            printer.beforeField(f, hasnext, builder);
            if (!printer.printField(f, hasnext, builder)) {
                builder.append(f.getKey());
                builder.append(" = ");
                builder.append(f.getValue().printInline(depth + 1));
                builder.append("; ");
            }
            printer.afterField(f, hasnext, builder);
        }
        builder.append("}");
        return builder.toString();
    }

    protected boolean isInline() {
        return false;
    }

    protected abstract class BaseIterator {
        int idx = -1;
        boolean removed;

        public boolean hasNext() {
            return idx + 1 < Dictionary.this.size();
        }

        public Map.Entry<K, V> nextEntry() {
            if (idx + 1 >= Dictionary.this.size()) {
                throw new NoSuchElementException();
            }
            ++idx;
            removed = false;
            return new EntryImpl<K, V>(fields.get(idx), idx);
        }

        public void remove() {
            if (removed) {
                throw new IllegalStateException();
            }
            removed = true;
            Dictionary.this.fields.remove(idx);
        }
    }

    protected class EntryImpl<K extends Value, V extends NextStep> implements Map.Entry<K, V> {

        private final Field<K, V> field;
        private final int fieldIdx;

        private EntryImpl(Field<K, V> field, int fieldIdx) {
            this.field = field;
            this.fieldIdx = fieldIdx;
        }

        @Override
        public K getKey() {
            return field.getKey();
        }

        @Override
        public V getValue() {
            return field.getValue();
        }

        @Override
        public V setValue(V value) {
            return field.setValue(value);
        }

        public void replaceKey(K key) {
            field.replaceKey(key);
        }
    }

    private final class KeyIterator extends BaseIterator implements Iterator<K> {
        public K next() {
            return nextEntry().getKey();
        }
    }

    private final class ValueIterator extends BaseIterator implements Iterator<V> {
        public V next() {
            return nextEntry().getValue();
        }
    }

    private final class EntryIterator extends BaseIterator implements Iterator<Entry<K, V>> {
        public Entry<K, V> next() {
            return nextEntry();
        }
    }

    @Override
    public int size() {
        return fields.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private Field<K, V> fieldForKey(Object key) {
        if (key == null) {
            throw new NullPointerException();
        }
        if (key instanceof String) {
            for (Field<K, V> field : fields) {
                if (field.getKey().value.equals(key)) {
                    return field;
                }
            }
        } else {
            for (Field<K, V> field : fields) {
                if (field.getKey().equals(key)) {
                    return field;
                }
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        return fieldForKey(key) != null;
    }

    @Override
    public boolean containsValue(Object value) {
        if (value == null) {
            throw new NullPointerException();
        }
        NextStep _value = (NextStep)value;
        for (Field<K, V> field : fields) {
            if (field.getValue().equals(_value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        final Field<K, V> field = fieldForKey(key);
        return field == null ? null : field.getValue();
    }

    public V get(String key) {
        return get((Object)key);
    }

    @Override
    public V put(K key, V value) {
        if (key == null) {
            throw new NullPointerException();
        }
        if (value == null) {
            throw new NullPointerException();
        }
        final Field<K, V> field = fieldForKey(key);
        if (field == null) {
            fields.add(new Field<K, V>(key, value));
            return null;
        } else {
            final V old = field.getValue();
            field.setValue(value);
            return old;
        }
    }

    public V put(String key, V value) {
        if (key == null) {
            throw new NullPointerException();
        }
        return put((K)new Value(key), value);
    }

    @Override
    public V remove(Object key) {
        if (key == null) {
            throw new NullPointerException();
        }
        final Field<K, V> field = fieldForKey(key);
        if (field != null) {
            fields.remove(field);
            return field.getValue();
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        fields.clear();
    }

    @Override
    public Set<K> keySet() {
        return new AbstractSet<K>() {
            @Override
            public Iterator<K> iterator() {
                return new KeyIterator();
            }

            @Override
            public int size() {
                return fields.size();
            }
        };
    }

    @Override
    public Collection<V> values() {
        return new AbstractCollection<V>() {
            @Override
            public Iterator<V> iterator() {
                return new ValueIterator();
            }

            @Override
            public int size() {
                return fields.size();
            }
        };
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return new AbstractSet<Entry<K, V>>() {
            @Override
            public Iterator<Entry<K, V>> iterator() {
                return new EntryIterator();
            }

            @Override
            public int size() {
                return fields.size();
            }
        };
    }

    public void sortByKeys() {
        Collections.sort(fields, new Comparator<Field<K, V>>() {
            @Override
            public int compare(Field<K, V> o1, Field<K, V> o2) {
                return o1.getKey().value.compareTo(o2.getKey().value);
            }
        });
    }

    public FieldPrinter<K, V> getCustomPrinter() {
        return customPrinter;
    }

    public void setCustomPrinter(FieldPrinter<K, V> customPrinter) {
        this.customPrinter = customPrinter;
    }

    public interface FieldPrinter<K extends Value, V extends NextStep> {
        void initialize();

        void beforeField(Field<K, V> current, boolean hasNext, StringBuilder builder);

        boolean printField(Field<K, V> current, boolean hasNext, StringBuilder builder);

        void afterField(Field<K, V> current, boolean hasNext, StringBuilder builder);
    }

    private static class NullFieldPrinter implements FieldPrinter<Value, NextStep> {

        @Override
        public void initialize() {
        }

        @Override
        public void beforeField(Field<Value, NextStep> current, boolean hasNext, StringBuilder builder) {
        }

        @Override
        public boolean printField(Field<Value, NextStep> current, boolean hasNext, StringBuilder builder) {
            return false;
        }

        @Override
        public void afterField(Field<Value, NextStep> current, boolean hasNext, StringBuilder builder) {
        }
    }

    public interface Consumer<T extends Value, U extends NextStep> {
        void accept(Dictionary<T, U> array);
    }

    public void accept(Consumer<K, V> consumer) {
        consumer.accept(this);
    }
}
