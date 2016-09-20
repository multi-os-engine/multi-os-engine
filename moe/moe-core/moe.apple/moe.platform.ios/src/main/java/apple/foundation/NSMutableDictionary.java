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

package apple.foundation;

import apple.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@SuppressWarnings({ "rawtypes", "unchecked" })
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableDictionary<_KeyType, _ObjectType> extends NSDictionary<_KeyType, _ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableDictionary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableDictionary<?, ?> alloc();

    @Generated
    @Selector("dictionary")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<?, ?> dictionary();

    /**
     * dictionaryWithCapacity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/clm/NSMutableDictionary/dictionaryWithCapacity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithCapacity:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<?, ?> dictionaryWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("dictionaryWithContentsOfFile:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<_KeyType, _ObjectType> dictionaryWithContentsOfFile(
            String path);

    @Generated
    @Selector("dictionaryWithContentsOfURL:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<_KeyType, _ObjectType> dictionaryWithContentsOfURL(
            NSURL url);

    @Generated
    @Selector("dictionaryWithDictionary:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<?, ?> dictionaryWithDictionary(
            NSDictionary<_KeyType, _ObjectType> dict);

    @Generated
    @Selector("dictionaryWithObject:forKey:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<?, ?> dictionaryWithObjectForKey(
            @Mapped(ObjCObjectMapper.class) _ObjectType object, @Mapped(ObjCObjectMapper.class) Object key);

    @Generated
    @Selector("dictionaryWithObjects:forKeys:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<?, ?> dictionaryWithObjectsForKeys(
            NSArray<_ObjectType> objects, NSArray<?> keys);

    @Generated
    @Selector("dictionaryWithObjects:forKeys:count:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<?, ?> dictionaryWithObjectsForKeysCount(
            ConstPtr<_ObjectType> objects, ConstPtr<ObjCObject> keys, @NUInt long cnt);

    @Generated
    @Variadic()
    @Selector("dictionaryWithObjectsAndKeys:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<?, ?> dictionaryWithObjectsAndKeys(
            @Mapped(ObjCObjectMapper.class) Object firstObject, Object... varargs);

    /**
     * dictionaryWithSharedKeySet:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/clm/NSMutableDictionary/dictionaryWithSharedKeySet:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithSharedKeySet:")
    public static native <_KeyType, _ObjectType> NSMutableDictionary<_KeyType, _ObjectType> dictionaryWithSharedKeySet(
            @Mapped(ObjCObjectMapper.class) Object keyset);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sharedKeySetForKeys:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native <_KeyType, _ObjectType> Object sharedKeySetForKeys(NSArray<?> keys);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addEntriesFromDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/addEntriesFromDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addEntriesFromDictionary:")
    public native void addEntriesFromDictionary(NSDictionary<_KeyType, _ObjectType> otherDictionary);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSMutableDictionary<?, ?> init();

    /**
     * initWithCapacity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/initWithCapacity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableDictionary<?, ?> initWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableDictionary<?, ?> initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSMutableDictionary<_KeyType, _ObjectType> initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSMutableDictionary<_KeyType, _ObjectType> initWithContentsOfURL(NSURL url);

    @Generated
    @Selector("initWithDictionary:")
    public native NSMutableDictionary<?, ?> initWithDictionary(NSDictionary<_KeyType, _ObjectType> otherDictionary);

    @Generated
    @Selector("initWithDictionary:copyItems:")
    public native NSMutableDictionary<?, ?> initWithDictionaryCopyItems(
            NSDictionary<_KeyType, _ObjectType> otherDictionary, boolean flag);

    @Generated
    @Selector("initWithObjects:forKeys:")
    public native NSMutableDictionary<?, ?> initWithObjectsForKeys(NSArray<_ObjectType> objects, NSArray<?> keys);

    @Generated
    @Selector("initWithObjects:forKeys:count:")
    public native NSMutableDictionary<?, ?> initWithObjectsForKeysCount(ConstPtr<_ObjectType> objects,
            ConstPtr<ObjCObject> keys, @NUInt long cnt);

    @Generated
    @Variadic()
    @Selector("initWithObjectsAndKeys:")
    public native NSMutableDictionary<?, ?> initWithObjectsAndKeys(@Mapped(ObjCObjectMapper.class) Object firstObject,
            Object... varargs);

    /**
     * removeAllObjects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/removeAllObjects">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    /**
     * removeObjectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/removeObjectForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObjectForKey:")
    public native void removeObjectForKey(@Mapped(ObjCObjectMapper.class) _KeyType aKey);

    /**
     * removeObjectsForKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/removeObjectsForKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObjectsForKeys:")
    public native void removeObjectsForKeys(NSArray<_KeyType> keyArray);

    /**
     * setDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/setDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDictionary:")
    public native void setDictionary(NSDictionary<_KeyType, _ObjectType> otherDictionary);

    /**
     * setObject:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/setObject:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @Mapped(ObjCObjectMapper.class) Object aKey);

    /**
     * setObject:forKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/setObject:forKeyedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) _ObjectType obj,
            @Mapped(ObjCObjectMapper.class) Object key);

    /**
     * setValue:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableDictionary_Class/index.html#//apple_ref/occ/instm/NSMutableDictionary/setValue:forKey:">iOS Dev Center</a>
     */
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Override
    public void clear() {
        removeAllObjects();
    }

    @Override
    public boolean containsKey(Object key) {
        if (key == null) {
            throw new NullPointerException();
        }
        return allKeys().containsObject((_KeyType)key);
    }

    @Override
    public boolean containsValue(Object value) {
        if (value == null) {
            throw new NullPointerException();
        }
        return allValues().containsObject((_ObjectType)value);
    }

    @Override
    public Set<Entry<_KeyType, _ObjectType>> entrySet() {
        return new NSMutableDictionaryEntrySet<_KeyType, _ObjectType>(this);
    }

    @Override
    public _ObjectType get(Object key) {
        if (key == null) {
            throw new NullPointerException();
        }
        return objectForKey((_KeyType)key);
    }

    @Override
    public boolean isEmpty() {
        return count() == 0;
    }

    @Override
    public Set<_KeyType> keySet() {
        return new NSMutableDictionaryKeySet<_KeyType>(this);
    }

    @Override
    public _ObjectType put(_KeyType key, _ObjectType value) {
        if (key == null || value == null) {
            throw new NullPointerException();
        }
        _ObjectType old = objectForKey(key);
        setObjectForKey(value, key);
        return old;
    }

    @Override
    public void putAll(Map<? extends _KeyType, ? extends _ObjectType> coll) {
        if (coll == null) {
            throw new NullPointerException();
        }
        for (Map.Entry<? extends _KeyType, ? extends _ObjectType> e : coll.entrySet()) {
            if (e == null || e.getKey() == null || e.getValue() == null) {
                throw new NullPointerException();
            }
        }
        for (Map.Entry<? extends _KeyType, ? extends _ObjectType> e : coll.entrySet()) {
            put(e.getKey(), e.getValue());
        }
    }

    @Override
    public _ObjectType remove(Object key) {
        if (key == null) {
            throw new NullPointerException();
        }
        _ObjectType old = objectForKey((_KeyType)key);
        removeObjectForKey((_KeyType)key);
        return old;
    }

    @Override
    public int size() {
        return (int)count();
    }

    @Override
    public Collection<_ObjectType> values() {
        return new NSMutableDictionaryValues<_ObjectType>(this);
    }

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    private static final class NSMutableDictionaryEntrySet<_KeyType, _ObjectType>
            implements Set<Entry<_KeyType, _ObjectType>> {

        private final NSMutableDictionary<_KeyType, _ObjectType> dict;

        public NSMutableDictionaryEntrySet(NSMutableDictionary<_KeyType, _ObjectType> dict) {
            this.dict = dict;
        }

        @Override
        public boolean add(Entry e) {
            if (e == null || e.getKey() == null || e.getValue() == null) {
                throw new NullPointerException();
            }
            boolean cont = dict.containsKey(e.getKey());
            dict.setObjectForKey((_ObjectType)e.getValue(), e.getKey());
            return !cont;
        }

        @Override
        public boolean addAll(Collection<? extends Entry<_KeyType, _ObjectType>> coll) {
            if (coll == null) {
                throw new NullPointerException();
            }
            for (Entry e : coll) {
                if (e == null || e.getKey() == null || e.getValue() == null) {
                    throw new NullPointerException();
                }
            }
            boolean changed = false;
            for (Entry e : coll) {
                dict.setObjectForKey((_ObjectType)e.getValue(), e.getKey());
                changed = true;
            }
            return changed;
        }

        @Override
        public void clear() {
            dict.removeAllObjects();
        }

        @Override
        public boolean contains(Object e) {
            if (e == null) {
                throw new NullPointerException();
            }
            if (!(e instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry)e;
            if (entry.getKey() == null || entry.getValue() == null) {
                return false;
            }
            if (!dict.containsKey(entry.getKey())) {
                return false;
            }
            Object obj = dict.objectForKey((_KeyType)entry.getKey());
            return entry.getValue().equals(obj);
        }

        @Override
        public boolean containsAll(Collection<?> coll) {
            if (coll == null) {
                throw new NullPointerException();
            }
            for (Object e : coll) {
                if (!contains(e)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return dict.count() == 0;
        }

        @Override
        public Iterator<Entry<_KeyType, _ObjectType>> iterator() {
            return new NSMutableDictionaryEntrySetIterator<_KeyType, _ObjectType>(dict);
        }

        @Override
        public boolean remove(Object arg0) {
            if (!contains(arg0)) {
                return false;
            }
            dict.removeObjectForKey(((Entry<_KeyType, _ObjectType>)arg0).getKey());
            return true;
        }

        @Override
        public boolean removeAll(Collection<?> coll) {
            if (coll == null) {
                throw new NullPointerException();
            }
            boolean changed = false;
            for (Object e : coll) {
                if (remove(e)) {
                    changed = true;
                }
            }
            return changed;
        }

        @Override
        public boolean retainAll(Collection<?> coll) {
            if (coll == null) {
                throw new NullPointerException();
            }
            boolean changed = false;
            Iterator it = dict.entrySet().iterator();
            while (it.hasNext()) {
                Object e = it.next();
                if (!coll.contains(e)) {
                    it.remove();
                    changed = true;
                }
            }
            return changed;
        }

        @Override
        public int size() {
            return (int)dict.count();
        }

        @Override
        public Object[] toArray() {
            Object[] array = new Object[size()];
            int idx = 0;
            Iterator it = dict.entrySet().iterator();
            while (it.hasNext()) {
                Object e = it.next();
                array[idx++] = e;
            }
            return array;
        }

        @Override
        public <T> T[] toArray(T[] a) {
            if (a == null) {
                throw new NullPointerException();
            }
            final int count = size();
            if (a.length < count) {
                return (T[])toArray();
            } else {
                int idx = 0;
                Iterator it = dict.entrySet().iterator();
                while (it.hasNext()) {
                    Object e = it.next();
                    a[idx++] = (T)e;
                }
                if (a.length > count) {
                    a[count] = null;
                }
                return a;
            }
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object instanceof Set) {
                Set<?> s = (Set<?>)object;

                try {
                    return size() == s.size() && containsAll(s);
                } catch (NullPointerException ignored) {
                    return false;
                } catch (ClassCastException ignored) {
                    return false;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int result = 0;
            Iterator<Entry<_KeyType, _ObjectType>> it = iterator();
            while (it.hasNext()) {
                Entry<_KeyType, _ObjectType> next = it.next();
                result += next == null ? 0 : next.hashCode();
            }
            return result;
        }

        private final static class NSMutableDictionaryEntrySetIterator<_KeyType, _ObjectType>
                implements Iterator<Entry<_KeyType, _ObjectType>> {

            private final NSMutableDictionary<_KeyType, _ObjectType> dict;
            private final NSMutableArray<_KeyType> keys;
            private int editCursor = -1;
            private int cursor = 0;

            public NSMutableDictionaryEntrySetIterator(NSMutableDictionary<_KeyType, _ObjectType> dict) {
                this.dict = dict;
                this.keys = (NSMutableArray<_KeyType>)NSMutableArray.arrayWithArray(dict.allKeys());
            }

            @Override
            public boolean hasNext() {
                return cursor < keys.size();
            }

            @Override
            public Entry<_KeyType, _ObjectType> next() {
                if (cursor >= keys.size()) {
                    throw new NoSuchElementException();
                }
                editCursor = cursor;
                final _KeyType key = keys.get(cursor++);
                final _ObjectType value = dict.objectForKey(key);
                return new Entry<_KeyType, _ObjectType>() {

                    @Override
                    public _KeyType getKey() {
                        return key;
                    }

                    @Override
                    public _ObjectType getValue() {
                        return value;
                    }

                    @Override
                    public _ObjectType setValue(_ObjectType value) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        _ObjectType old = getValue();
                        dict.setObjectForKey(value, key);
                        return old;
                    }

                    @Override
                    public boolean equals(Object o) {
                        if (o instanceof Entry) {
                            Entry e2 = (Entry)o;
                            return (getKey() == null ? e2.getKey() == null : getKey().equals(e2.getKey())) && (
                                    getValue() == null ? e2.getValue() == null : getValue().equals(e2.getValue()));
                        }
                        return false;
                    }

                    @Override
                    public int hashCode() {
                        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() == null ?
                                0 :
                                getValue().hashCode());
                    }
                };
            }

            @Override
            public void remove() {
                if (editCursor == -1) {
                    throw new IllegalStateException();
                }
                final Object key = keys.get(editCursor);
                editCursor = -1;
                --cursor;

                keys.remove(key);
                dict.removeObjectForKey((_KeyType)key);
            }

        }

    }

    private static final class NSMutableDictionaryKeySet<_KeyType> implements Set<_KeyType> {

        private final NSMutableDictionary<_KeyType, ?> dict;

        public NSMutableDictionaryKeySet(NSMutableDictionary<_KeyType, ?> dict) {
            this.dict = dict;
        }

        @Override
        public boolean add(_KeyType e) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends _KeyType> c) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            dict.removeAllObjects();
        }

        @Override
        public boolean contains(Object o) {
            if (o == null) {
                throw new NullPointerException();
            }
            return dict.containsKey(o);
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            if (c == null) {
                throw new NullPointerException();
            }
            Iterator<?> it = c.iterator();
            while (it.hasNext()) {
                Object o = it.next();
                if (o == null) {
                    throw new NullPointerException();
                }
                if (!contains(o)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return dict.isEmpty();
        }

        @Override
        public Iterator<_KeyType> iterator() {
            return new NSMutableDictionaryKeySetIterator<_KeyType>(dict);
        }

        @Override
        public boolean remove(Object o) {
            return dict.remove(o) != null;
        }

        @Override
        public boolean removeAll(Collection<?> coll) {
            if (coll == null) {
                throw new NullPointerException();
            }
            for (Object e : coll) {
                if (e == null) {
                    throw new NullPointerException();
                }
            }
            boolean changed = false;
            for (Object e : coll) {
                if (remove(e)) {
                    changed = true;
                }
            }
            return changed;
        }

        @Override
        public boolean retainAll(Collection<?> coll) {
            if (coll == null) {
                throw new NullPointerException();
            }
            boolean changed = false;
            Iterator it = dict.entrySet().iterator();
            while (it.hasNext()) {
                Object e = it.next();
                if (!coll.contains(e)) {
                    it.remove();
                    changed = true;
                }
            }
            return changed;
        }

        @Override
        public int size() {
            return dict.size();
        }

        @Override
        public Object[] toArray() {
            return dict.allKeys().toArray();
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return (T[])dict.allKeys().toArray(a);
        }

        @Override
        public int hashCode() {
            int hash = 0;
            for (Object key : NSMutableDictionaryKeySet.this) {
                hash += key.hashCode();
            }
            return hash;
        }

        private static final class NSMutableDictionaryKeySetIterator<_KeyType> implements Iterator<_KeyType> {

            private final NSMutableDictionary<_KeyType, ?> dict;
            private final NSMutableArray<_KeyType> keys;
            private int editCursor = -1;
            private int cursor = 0;

            public NSMutableDictionaryKeySetIterator(NSMutableDictionary<_KeyType, ?> dict) {
                this.dict = dict;
                this.keys = (NSMutableArray<_KeyType>)NSMutableArray.arrayWithArray(dict.allKeys());
            }

            @Override
            public boolean hasNext() {
                return cursor < keys.size();
            }

            @Override
            public _KeyType next() {
                if (cursor >= keys.size()) {
                    throw new NoSuchElementException();
                }
                editCursor = cursor;
                return keys.get(cursor++);
            }

            @Override
            public void remove() {
                if (editCursor == -1) {
                    throw new IllegalStateException();
                }
                final Object key = keys.get(editCursor);
                editCursor = -1;
                --cursor;

                keys.remove(key);
                dict.removeObjectForKey((_KeyType)key);
            }

        }

    }

    private static final class NSMutableDictionaryValues<_ObjectType> implements Collection<_ObjectType> {

        private final NSMutableDictionary<?, _ObjectType> dict;

        public NSMutableDictionaryValues(NSMutableDictionary<?, _ObjectType> dict) {
            this.dict = dict;
        }

        @Override
        public boolean add(_ObjectType e) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends _ObjectType> c) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            dict.removeAllObjects();
        }

        @Override
        public boolean contains(Object o) {
            if (o == null) {
                throw new NullPointerException();
            }
            NSArray values = dict.allValues();
            return values.contains(o);
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            if (c == null) {
                throw new NullPointerException();
            }
            Iterator<?> it = c.iterator();
            while (it.hasNext()) {
                Object o = it.next();
                if (o == null) {
                    throw new NullPointerException();
                }
                if (!contains(o)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return dict.isEmpty();
        }

        @Override
        public Iterator<_ObjectType> iterator() {
            return new NSMutableDictionaryValuesIterator<_ObjectType>(dict);
        }

        @Override
        public boolean remove(final Object o) {
            if (o == null) {
                throw new NullPointerException();
            }
            final ArrayList keys = new ArrayList(1);
            dict.enumerateKeysAndObjectsUsingBlock(new Block_enumerateKeysAndObjectsUsingBlock() {
                @Override
                public void call_enumerateKeysAndObjectsUsingBlock(Object key, Object value, BoolPtr stop) {
                    if (o.equals(value)) {
                        keys.add(key);
                    }
                }
            });
            boolean changed = false;
            for (Object k : keys) {
                dict.remove(k);
                changed = true;
            }
            return changed;
        }

        @Override
        public boolean removeAll(final Collection<?> coll) {
            if (coll == null) {
                throw new NullPointerException();
            }
            for (Object e : coll) {
                if (e == null) {
                    throw new NullPointerException();
                }
            }
            final ArrayList keys = new ArrayList(coll.size());
            dict.enumerateKeysAndObjectsUsingBlock(new Block_enumerateKeysAndObjectsUsingBlock() {
                @Override
                public void call_enumerateKeysAndObjectsUsingBlock(Object key, Object value, BoolPtr stop) {
                    if (coll.contains(value)) {
                        keys.add(key);
                    }
                }
            });
            boolean changed = false;
            for (Object k : keys) {
                dict.remove(k);
                changed = true;
            }
            return changed;
        }

        @Override
        public boolean retainAll(final Collection<?> coll) {
            if (coll == null) {
                throw new NullPointerException();
            }
            for (Object e : coll) {
                if (e == null) {
                    throw new NullPointerException();
                }
            }
            final ArrayList keys = new ArrayList(coll.size());
            dict.enumerateKeysAndObjectsUsingBlock(new Block_enumerateKeysAndObjectsUsingBlock() {
                @Override
                public void call_enumerateKeysAndObjectsUsingBlock(Object key, Object value, BoolPtr stop) {
                    if (!coll.contains(value)) {
                        keys.add(key);
                    }
                }
            });
            boolean changed = false;
            for (Object k : keys) {
                dict.remove(k);
                changed = true;
            }
            return changed;
        }

        @Override
        public int size() {
            return dict.size();
        }

        @Override
        public Object[] toArray() {
            return dict.allValues().toArray();
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return (T[])dict.allValues().toArray(a);
        }

        private static final class NSMutableDictionaryValuesIterator<_ObjectType> implements Iterator<_ObjectType> {

            @SuppressWarnings("unused") private final NSMutableDictionary<?, _ObjectType> dict;
            private final Iterator<?> iterator;

            public NSMutableDictionaryValuesIterator(NSMutableDictionary<?, _ObjectType> dict) {
                this.dict = dict;
                this.iterator = dict.entrySet().iterator();
            }

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public _ObjectType next() {
                return ((Entry<?, _ObjectType>)iterator.next()).getValue();
            }

            @Override
            public void remove() {
                iterator.remove();
            }

        }
    }
}
