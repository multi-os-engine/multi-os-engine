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
import apple.coredata.protocol.NSFetchRequestResult;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSFastEnumeration;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@SuppressWarnings({ "rawtypes", "unchecked" })
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDictionary<_KeyType, _ObjectType> extends NSObject
        implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, NSFetchRequestResult,
        Map<_KeyType, _ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDictionary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDictionary<?, ?> alloc();

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
    @Selector("dictionary")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionary();

    @Generated
    @Selector("dictionaryWithContentsOfFile:")
    public static native <_KeyType, _ObjectType> NSDictionary<_KeyType, _ObjectType> dictionaryWithContentsOfFile(
            String path);

    @Generated
    @Selector("dictionaryWithContentsOfURL:")
    public static native <_KeyType, _ObjectType> NSDictionary<_KeyType, _ObjectType> dictionaryWithContentsOfURL(
            NSURL url);

    @Generated
    @Selector("dictionaryWithDictionary:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithDictionary(
            NSDictionary<_KeyType, _ObjectType> dict);

    @Generated
    @Selector("dictionaryWithObject:forKey:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithObjectForKey(
            @Mapped(ObjCObjectMapper.class) _ObjectType object, @Mapped(ObjCObjectMapper.class) Object key);

    @Generated
    @Selector("dictionaryWithObjects:forKeys:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithObjectsForKeys(
            NSArray<_ObjectType> objects, NSArray<?> keys);

    @Generated
    @Selector("dictionaryWithObjects:forKeys:count:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithObjectsForKeysCount(
            @ReferenceInfo(type = ObjCObject.class) ConstPtr<_ObjectType> objects,
            @ReferenceInfo(type = ObjCObject.class) ConstPtr<ObjCObject> keys, @NUInt long cnt);

    @Generated
    @Variadic()
    @Selector("dictionaryWithObjectsAndKeys:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithObjectsAndKeys(
            @Mapped(ObjCObjectMapper.class) Object firstObject, Object... varargs);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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
    public static native <_KeyType, _ObjectType> boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("allKeys")
    public native NSArray<_KeyType> allKeys();

    @Generated
    @Selector("allKeysForObject:")
    public native NSArray<_KeyType> allKeysForObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("allValues")
    public native NSArray<_ObjectType> allValues();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("descriptionInStringsFileFormat")
    public native String descriptionInStringsFileFormat();

    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @Selector("descriptionWithLocale:indent:")
    public native String descriptionWithLocaleIndent(@Mapped(ObjCObjectMapper.class) Object locale, @NUInt long level);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("enumerateKeysAndObjectsUsingBlock:")
    public native void enumerateKeysAndObjectsUsingBlock(
            @ObjCBlock(name = "call_enumerateKeysAndObjectsUsingBlock") Block_enumerateKeysAndObjectsUsingBlock block);

    @Generated
    @Selector("enumerateKeysAndObjectsWithOptions:usingBlock:")
    public native void enumerateKeysAndObjectsWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateKeysAndObjectsWithOptionsUsingBlock") Block_enumerateKeysAndObjectsWithOptionsUsingBlock block);

    @Generated
    @Selector("fileCreationDate")
    public native NSDate fileCreationDate();

    @Generated
    @Selector("fileExtensionHidden")
    public native boolean fileExtensionHidden();

    @Generated
    @Selector("fileGroupOwnerAccountID")
    public native NSNumber fileGroupOwnerAccountID();

    @Generated
    @Selector("fileGroupOwnerAccountName")
    public native String fileGroupOwnerAccountName();

    @Generated
    @Selector("fileHFSCreatorCode")
    public native int fileHFSCreatorCode();

    @Generated
    @Selector("fileHFSTypeCode")
    public native int fileHFSTypeCode();

    @Generated
    @Selector("fileIsAppendOnly")
    public native boolean fileIsAppendOnly();

    @Generated
    @Selector("fileIsImmutable")
    public native boolean fileIsImmutable();

    @Generated
    @Selector("fileModificationDate")
    public native NSDate fileModificationDate();

    @Generated
    @Selector("fileOwnerAccountID")
    public native NSNumber fileOwnerAccountID();

    @Generated
    @Selector("fileOwnerAccountName")
    public native String fileOwnerAccountName();

    @Generated
    @Selector("filePosixPermissions")
    @NUInt
    public native long filePosixPermissions();

    @Generated
    @Selector("fileSize")
    public native long fileSize();

    @Generated
    @Selector("fileSystemFileNumber")
    @NUInt
    public native long fileSystemFileNumber();

    @Generated
    @Selector("fileSystemNumber")
    @NInt
    public native long fileSystemNumber();

    @Generated
    @Selector("fileType")
    public native String fileType();

    @Generated
    @Selector("getObjects:andKeys:")
    public native void getObjectsAndKeys(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> objects,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> keys);

    @Generated
    @Selector("getObjects:andKeys:count:")
    public native void getObjectsAndKeysCount(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> objects,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> keys, @NUInt long count);

    @Generated
    @Selector("init")
    public native NSDictionary<?, ?> init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDictionary<?, ?> initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSDictionary<_KeyType, _ObjectType> initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSDictionary<_KeyType, _ObjectType> initWithContentsOfURL(NSURL url);

    @Generated
    @Selector("initWithDictionary:")
    public native NSDictionary<?, ?> initWithDictionary(NSDictionary<_KeyType, _ObjectType> otherDictionary);

    @Generated
    @Selector("initWithDictionary:copyItems:")
    public native NSDictionary<?, ?> initWithDictionaryCopyItems(NSDictionary<_KeyType, _ObjectType> otherDictionary,
            boolean flag);

    @Generated
    @Selector("initWithObjects:forKeys:")
    public native NSDictionary<?, ?> initWithObjectsForKeys(NSArray<_ObjectType> objects, NSArray<?> keys);

    @Generated
    @Selector("initWithObjects:forKeys:count:")
    public native NSDictionary<?, ?> initWithObjectsForKeysCount(
            @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> keys, @NUInt long cnt);

    @Generated
    @Variadic()
    @Selector("initWithObjectsAndKeys:")
    public native NSDictionary<?, ?> initWithObjectsAndKeys(@Mapped(ObjCObjectMapper.class) Object firstObject,
            Object... varargs);

    @Generated
    @Selector("isEqualToDictionary:")
    public native boolean isEqualToDictionary(NSDictionary<_KeyType, _ObjectType> otherDictionary);

    @Generated
    @Selector("keyEnumerator")
    public native NSEnumerator<_KeyType> keyEnumerator();

    @Generated
    @Selector("keysOfEntriesPassingTest:")
    public native NSSet<_KeyType> keysOfEntriesPassingTest(
            @ObjCBlock(name = "call_keysOfEntriesPassingTest") Block_keysOfEntriesPassingTest predicate);

    @Generated
    @Selector("keysOfEntriesWithOptions:passingTest:")
    public native NSSet<_KeyType> keysOfEntriesWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_keysOfEntriesWithOptionsPassingTest") Block_keysOfEntriesWithOptionsPassingTest predicate);

    @Generated
    @Selector("keysSortedByValueUsingComparator:")
    public native NSArray<_KeyType> keysSortedByValueUsingComparator(
            @ObjCBlock(name = "call_keysSortedByValueUsingComparator") Block_keysSortedByValueUsingComparator cmptr);

    @Generated
    @Selector("keysSortedByValueUsingSelector:")
    public native NSArray<_KeyType> keysSortedByValueUsingSelector(SEL comparator);

    @Generated
    @Selector("keysSortedByValueWithOptions:usingComparator:")
    public native NSArray<_KeyType> keysSortedByValueWithOptionsUsingComparator(@NUInt long opts,
            @ObjCBlock(name = "call_keysSortedByValueWithOptionsUsingComparator") Block_keysSortedByValueWithOptionsUsingComparator cmptr);

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectForKey(@Mapped(ObjCObjectMapper.class) _KeyType aKey);

    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) _KeyType key);

    @Generated
    @Selector("objectsForKeys:notFoundMarker:")
    public native NSArray<_ObjectType> objectsForKeysNotFoundMarker(NSArray<_KeyType> keys,
            @Mapped(ObjCObjectMapper.class) _ObjectType marker);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType valueForKey(String key);

    @Generated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    @Generated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(NSURL url, boolean atomically);

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
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
        return new NSDictionaryEntrySet<_KeyType, _ObjectType>(this);
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
        return new NSDictionaryKeySet<_KeyType>(this);
    }

    @Override
    public _ObjectType put(_KeyType key, _ObjectType value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void putAll(Map<? extends _KeyType, ? extends _ObjectType> arg0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public _ObjectType remove(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return (int)count();
    }

    @Override
    public Collection<_ObjectType> values() {
        return new NSDictionaryValues<_ObjectType>(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Map) {
            Map<?, ?> map = (Map<?, ?>)object;
            if (size() != map.size()) {
                return false;
            }

            try {
                for (Entry entry : entrySet()) {
                    Object key = entry.getKey();
                    Object mine = entry.getValue();
                    Object theirs = map.get(key);
                    if (mine == null) {
                        if (theirs != null || !map.containsKey(key)) {
                            return false;
                        }
                    } else if (!mine.equals(theirs)) {
                        return false;
                    }
                }
            } catch (NullPointerException ignored) {
                return false;
            } catch (ClassCastException ignored) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 0;
        Iterator<Map.Entry<_KeyType, _ObjectType>> it = entrySet().iterator();
        while (it.hasNext()) {
            result += it.next().hashCode();
        }
        return result;
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateKeysAndObjectsUsingBlock {
        @Generated
        void call_enumerateKeysAndObjectsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateKeysAndObjectsWithOptionsUsingBlock {
        @Generated
        void call_enumerateKeysAndObjectsWithOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keysOfEntriesPassingTest {
        @Generated
        boolean call_keysOfEntriesPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keysOfEntriesWithOptionsPassingTest {
        @Generated
        boolean call_keysOfEntriesWithOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keysSortedByValueUsingComparator {
        @Generated
        @NInt
        long call_keysSortedByValueUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keysSortedByValueWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_keysSortedByValueWithOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    private static final class NSDictionaryEntrySet<_KeyType, _ObjectType>
            implements Set<Entry<_KeyType, _ObjectType>> {

        private final NSDictionary<_KeyType, _ObjectType> dict;

        public NSDictionaryEntrySet(NSDictionary<_KeyType, _ObjectType> dict) {
            this.dict = dict;
        }

        @Override
        public boolean add(Entry<_KeyType, _ObjectType> e) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends Entry<_KeyType, _ObjectType>> coll) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException();
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
            return new NSDictionaryEntrySetIterator<_KeyType, _ObjectType>(dict);
        }

        @Override
        public boolean remove(Object arg0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean removeAll(Collection<?> coll) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean retainAll(Collection<?> coll) {
            throw new UnsupportedOperationException();
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

        private final static class NSDictionaryEntrySetIterator<_KeyType, _ObjectType>
                implements Iterator<Entry<_KeyType, _ObjectType>> {

            private final NSDictionary<_KeyType, _ObjectType> dict;
            private final NSArray<_KeyType> keys;
            private int cursor = 0;

            public NSDictionaryEntrySetIterator(NSDictionary<_KeyType, _ObjectType> dict) {
                this.dict = dict;
                this.keys = dict.allKeys();
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
                        throw new UnsupportedOperationException();
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
                throw new UnsupportedOperationException();
            }

        }
    }

    private static final class NSDictionaryKeySet<_KeyType> implements Set<_KeyType> {

        private final NSDictionary<_KeyType, ?> dict;

        public NSDictionaryKeySet(NSDictionary<_KeyType, ?> dict) {
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
            throw new UnsupportedOperationException();
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
            return new NSDictionaryKeySetIterator<_KeyType>(dict);
        }

        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean removeAll(Collection<?> coll) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean retainAll(Collection<?> coll) {
            throw new UnsupportedOperationException();
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
            for (Object key : NSDictionaryKeySet.this) {
                hash += key.hashCode();
            }
            return hash;
        }

        private static final class NSDictionaryKeySetIterator<_KeyType> implements Iterator<_KeyType> {

            @SuppressWarnings("unused") private final NSDictionary<_KeyType, ?> dict;
            private final NSArray<_KeyType> keys;
            private int cursor = 0;

            public NSDictionaryKeySetIterator(NSDictionary<_KeyType, ?> dict) {
                this.dict = dict;
                this.keys = dict.allKeys();
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
                return keys.get(cursor++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        }

    }

    private static final class NSDictionaryValues<_ObjectType> implements Collection<_ObjectType> {

        private final NSDictionary<?, _ObjectType> dict;

        public NSDictionaryValues(NSDictionary<?, _ObjectType> dict) {
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
            throw new UnsupportedOperationException();
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
            return new NSDictionaryValuesIterator<_ObjectType>(dict);
        }

        @Override
        public boolean remove(final Object o) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean removeAll(final Collection<?> coll) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean retainAll(final Collection<?> coll) {
            throw new UnsupportedOperationException();
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

        private static final class NSDictionaryValuesIterator<_ObjectType> implements Iterator<_ObjectType> {

            @SuppressWarnings("unused") private final NSDictionary<?, _ObjectType> dict;
            private final Iterator<Entry<?, _ObjectType>> iterator;

            public NSDictionaryValuesIterator(NSDictionary dict) {
                this.dict = dict;
                this.iterator = dict.entrySet().iterator();
            }

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public _ObjectType next() {
                return iterator.next().getValue();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        }
    }
}
