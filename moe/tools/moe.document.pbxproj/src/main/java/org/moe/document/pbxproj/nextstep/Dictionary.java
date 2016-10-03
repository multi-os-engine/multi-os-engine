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

@SuppressWarnings("unchecked")
public class Dictionary<K extends Value, V extends NextStep> extends NextStep {

    public static class Field<K, V> {

        public Field() {

        }

        public Field(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K key;
        public V value;

        public boolean isValid() {
            return (key != null) && (value != null);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if ((obj == null) || !(obj instanceof Field<?, ?>) || !this.isValid()) {
                return false;
            }

            Field<K, V> field = (Field<K, V>)obj;
            if (field.isValid() && key.equals(field.key) && value.equals(field.value)) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static final FieldPrinter<Value, NextStep> nullPrinter = new NullFieldPrinter();

    private FieldPrinter<K, V> customPrinter;

    private final ArrayList<Field<K, V>> fields;

    static Dictionary<Value, NextStep> create(Tokenizer t) throws NextStepException {
        Token token = t.next();
        if (token == null) {
            throw new NextStepException("early end of tokenstream");
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
                Field<Value, NextStep> field = new Field<Value, NextStep>();

                if (token.kind != Token.Value) {
                    throw new NextStepException("illegal state");
                }
                field.key = Value.create(t);

                token = t.next();
                if (token == null) {
                    throw new NextStepException("early end of tokenstream");
                }
                if (token.kind != Token.Equal) {
                    throw new NextStepException("illegal state");
                }

                field.value = get(t);

                token = t.next();
                if (token == null) {
                    throw new NextStepException("early end of tokenstream");
                }
                if (token.kind != Token.Semicolon) {
                    throw new NextStepException("illegal state");
                }

                dict.add(field);
                break;
            }

            token = t.peek();
        }
        throw new NextStepException("early end of tokenstream");
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
            printer = (FieldPrinter<K, V>)nullPrinter;
        }
        printer.initialize();

        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        for (Field<K, V> f : fields) {
            boolean hasnext = fields.indexOf(f) + 1 < fields.size();
            printer.beforeField(f, hasnext, builder);
            if (!printer.printField(f, hasnext, builder)) {
                ident(builder, depth + 1);
                builder.append(f.key);
                builder.append(" = ");
                builder.append(f.value.print(depth + 1));
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
            printer = (FieldPrinter<K, V>)nullPrinter;
        }
        printer.initialize();

        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (Field<K, V> f : fields) {
            boolean hasnext = fields.indexOf(f) + 1 < fields.size();
            printer.beforeField(f, hasnext, builder);
            if (!printer.printField(f, hasnext, builder)) {
                builder.append(f.key);
                builder.append(" = ");
                builder.append(f.value.printInline(depth + 1));
                builder.append("; ");
            }
            printer.afterField(f, hasnext, builder);
        }
        builder.append("}");
        return builder.toString();
    }

    ;

    protected boolean isInline() {
        return false;
    }

    public int size() {
        return fields.size();
    }

    public int indexOf(String key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        int count = fields.size();
        for (int i = 0; i < count; ++i) {
            Field<K, V> f = fields.get(i);
            if (f.key.value.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        return indexOf(key.value);
    }

    public boolean contains(String key) {
        return indexOf(key) != -1;
    }

    public boolean contains(K key) {
        return indexOf(key) != -1;
    }

    public void add(Field<K, V> field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (!field.isValid()) {
            throw new IllegalArgumentException("field isn't valid");
        }
        if (fields.contains(field)) {
            return;
        }
        if (indexOf(field.key) != -1) {
            throw new IllegalArgumentException("key is already in the dictionary");
        }

        fields.add(field);
    }

    public void add(K key, V value) {
        add(new Field<K, V>(key, value));
    }

    public void update(Field<K, V> field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (!field.isValid()) {
            if (field.value == null && field.key != null) {
                remove(field.key);
                return;
            }
            throw new IllegalArgumentException("field isn't valid");
        }
        if (fields.contains(field)) {
            return;
        }
        int idx = indexOf(field.key);
        if (idx != -1) {
            fields.set(idx, field);
        } else {
            fields.add(field);
        }
    }

    public void update(K key, V value) {
        update(new Field<K, V>(key, value));
    }

    public V remove(String key) {
        int idx = indexOf(key);
        if (idx != -1) {
            V value = fields.get(idx).value;
            fields.remove(idx);
            return value;
        }
        return null;
    }

    public V remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        return remove(key.value);
    }

    public K getKey(String key) {
        int idx = indexOf(key);
        if (idx != -1) {
            return fields.get(idx).key;
        }
        return null;
    }

    public K replaceKey(String key, K newKey) {
        if (newKey == null) {
            throw new IllegalArgumentException();
        }

        int idx = indexOf(key);
        if (idx != -1) {
            Field<K, V> f = fields.get(idx);
            K oldKey = f.key;
            f.key = newKey;
            return oldKey;
        }
        return null;
    }

    public K replaceKey(K key, K newKey) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        return replaceKey(key.value, newKey);
    }

    public V getValue(String key) {
        int idx = indexOf(key);
        if (idx != -1) {
            return fields.get(idx).value;
        }
        return null;
    }

    public V getValue(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        return getValue(key.value);
    }

    public V replaceValue(String key, V newValue) {
        if (newValue == null) {
            throw new IllegalArgumentException();
        }

        int idx = indexOf(key);
        if (idx != -1) {
            Field<K, V> f = fields.get(idx);
            V oldValue = f.value;
            f.value = newValue;
            return oldValue;
        }
        return null;
    }

    public V replaceValue(K key, V newValue) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        return replaceValue(key.value, newValue);
    }

    public void iterate(FieldIterator<K, V> dictionaryIterator) {
        for (Field<K, V> f : fields) {
            dictionaryIterator.process(f);
        }
    }

    public Field<K, V> findFirst(FieldPredicate<K, V> dictionaryIterator) {
        for (Field<K, V> f : fields) {
            if (dictionaryIterator.predicate(f)) {
                return f;
            }
        }
        return null;
    }

    public FieldPrinter<K, V> getCustomPrinter() {
        return customPrinter;
    }

    public void setCustomPrinter(FieldPrinter<K, V> customPrinter) {
        this.customPrinter = customPrinter;
    }

    public ArrayList<Field<K, V>> rawData() {
        return fields;
    }

    public interface FieldIterator<K extends Value, V extends NextStep> {
        void process(Field<K, V> field);
    }

    public interface FieldPredicate<K extends Value, V extends NextStep> {
        boolean predicate(Field<K, V> field);
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

}
