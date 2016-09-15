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
        implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, Map<_KeyType, _ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDictionary(Pointer peer) {
        super(peer);
    }

    /**
     * allKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instp/NSDictionary/allKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("allKeys")
    public native NSArray<_KeyType> allKeys();

    /**
     * allKeysForObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/allKeysForObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("allKeysForObject:")
    public native NSArray<_KeyType> allKeysForObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    /**
     * allValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instp/NSDictionary/allValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("allValues")
    public native NSArray<_ObjectType> allValues();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDictionary<?, ?> alloc();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * count</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instp/NSDictionary/count">iOS Dev Center</a>
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state, Ptr<ObjCObject> buffer, @NUInt long len);

    /**
     * description</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instp/NSDictionary/description">iOS Dev Center</a>
     */
    @Generated
    @Selector("description")
    public native String description();

    /**
     * descriptionInStringsFileFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instp/NSDictionary/descriptionInStringsFileFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptionInStringsFileFormat")
    public native String descriptionInStringsFileFormat();

    /**
     * descriptionWithLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/descriptionWithLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Mapped(ObjCObjectMapper.class) Object locale);

    /**
     * descriptionWithLocale:indent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/descriptionWithLocale:indent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptionWithLocale:indent:")
    public native String descriptionWithLocaleIndent(@Mapped(ObjCObjectMapper.class) Object locale, @NUInt long level);

    /**
     * dictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/dictionary">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionary")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionary();

    /**
     * dictionaryWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/dictionaryWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithContentsOfFile:")
    public static native <_KeyType, _ObjectType> NSDictionary<_KeyType, _ObjectType> dictionaryWithContentsOfFile(
            String path);

    /**
     * dictionaryWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/dictionaryWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithContentsOfURL:")
    public static native <_KeyType, _ObjectType> NSDictionary<_KeyType, _ObjectType> dictionaryWithContentsOfURL(
            NSURL url);

    /**
     * dictionaryWithDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/dictionaryWithDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithDictionary:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithDictionary(
            NSDictionary<_KeyType, _ObjectType> dict);

    /**
     * dictionaryWithObject:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/dictionaryWithObject:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithObject:forKey:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithObjectForKey(
            @Mapped(ObjCObjectMapper.class) _ObjectType object, @Mapped(ObjCObjectMapper.class) Object key);

    /**
     * dictionaryWithObjects:forKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/dictionaryWithObjects:forKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithObjects:forKeys:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithObjectsForKeys(
            NSArray<_ObjectType> objects, NSArray<?> keys);

    /**
     * dictionaryWithObjects:forKeys:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/dictionaryWithObjects:forKeys:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithObjects:forKeys:count:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithObjectsForKeysCount(
            ConstPtr<_ObjectType> objects, ConstPtr<ObjCObject> keys, @NUInt long cnt);

    /**
     * dictionaryWithObjectsAndKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/dictionaryWithObjectsAndKeys:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("dictionaryWithObjectsAndKeys:")
    public static native <_KeyType, _ObjectType> NSDictionary<?, ?> dictionaryWithObjectsAndKeys(
            @Mapped(ObjCObjectMapper.class) Object firstObject, Object... varargs);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateKeysAndObjectsUsingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/enumerateKeysAndObjectsUsingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateKeysAndObjectsUsingBlock:")
    public native void enumerateKeysAndObjectsUsingBlock(
            @ObjCBlock(name = "call_enumerateKeysAndObjectsUsingBlock") Block_enumerateKeysAndObjectsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateKeysAndObjectsUsingBlock {
        @Generated
        void call_enumerateKeysAndObjectsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    /**
     * enumerateKeysAndObjectsWithOptions:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/enumerateKeysAndObjectsWithOptions:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateKeysAndObjectsWithOptions:usingBlock:")
    public native void enumerateKeysAndObjectsWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateKeysAndObjectsWithOptionsUsingBlock") Block_enumerateKeysAndObjectsWithOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateKeysAndObjectsWithOptionsUsingBlock {
        @Generated
        void call_enumerateKeysAndObjectsWithOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    /**
     * fileCreationDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileCreationDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileCreationDate")
    public native NSDate fileCreationDate();

    /**
     * fileExtensionHidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileExtensionHidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileExtensionHidden")
    public native boolean fileExtensionHidden();

    /**
     * fileGroupOwnerAccountID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileGroupOwnerAccountID">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileGroupOwnerAccountID")
    public native NSNumber fileGroupOwnerAccountID();

    /**
     * fileGroupOwnerAccountName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileGroupOwnerAccountName">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileGroupOwnerAccountName")
    public native String fileGroupOwnerAccountName();

    /**
     * fileHFSCreatorCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileHFSCreatorCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileHFSCreatorCode")
    public native int fileHFSCreatorCode();

    /**
     * fileHFSTypeCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileHFSTypeCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileHFSTypeCode")
    public native int fileHFSTypeCode();

    /**
     * fileIsAppendOnly</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileIsAppendOnly">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileIsAppendOnly")
    public native boolean fileIsAppendOnly();

    /**
     * fileIsImmutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileIsImmutable">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileIsImmutable")
    public native boolean fileIsImmutable();

    /**
     * fileModificationDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileModificationDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileModificationDate")
    public native NSDate fileModificationDate();

    /**
     * fileOwnerAccountID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileOwnerAccountID">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileOwnerAccountID")
    public native NSNumber fileOwnerAccountID();

    /**
     * fileOwnerAccountName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileOwnerAccountName">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileOwnerAccountName")
    public native String fileOwnerAccountName();

    /**
     * filePosixPermissions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/filePosixPermissions">iOS Dev Center</a>
     */
    @Generated
    @Selector("filePosixPermissions")
    @NUInt
    public native long filePosixPermissions();

    /**
     * fileSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileSize")
    public native long fileSize();

    /**
     * fileSystemFileNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileSystemFileNumber">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileSystemFileNumber")
    @NUInt
    public native long fileSystemFileNumber();

    /**
     * fileSystemNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileSystemNumber">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileSystemNumber")
    @NInt
    public native long fileSystemNumber();

    /**
     * fileType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/fileType">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileType")
    public native String fileType();

    /**
     * getObjects:andKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/getObjects:andKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getObjects:andKeys:")
    public native void getObjectsAndKeys(Ptr<ObjCObject> objects, Ptr<ObjCObject> keys);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSDictionary<?, ?> init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDictionary<?, ?> initWithCoder(NSCoder aDecoder);

    /**
     * initWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/initWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSDictionary<_KeyType, _ObjectType> initWithContentsOfFile(String path);

    /**
     * initWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/initWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSDictionary<_KeyType, _ObjectType> initWithContentsOfURL(NSURL url);

    /**
     * initWithDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/initWithDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithDictionary:")
    public native NSDictionary<?, ?> initWithDictionary(NSDictionary<_KeyType, _ObjectType> otherDictionary);

    /**
     * initWithDictionary:copyItems:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/initWithDictionary:copyItems:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithDictionary:copyItems:")
    public native NSDictionary<?, ?> initWithDictionaryCopyItems(NSDictionary<_KeyType, _ObjectType> otherDictionary,
            boolean flag);

    /**
     * initWithObjects:forKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/initWithObjects:forKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithObjects:forKeys:")
    public native NSDictionary<?, ?> initWithObjectsForKeys(NSArray<_ObjectType> objects, NSArray<?> keys);

    /**
     * initWithObjects:forKeys:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/initWithObjects:forKeys:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithObjects:forKeys:count:")
    public native NSDictionary<?, ?> initWithObjectsForKeysCount(ConstPtr<_ObjectType> objects,
            ConstPtr<ObjCObject> keys, @NUInt long cnt);

    /**
     * initWithObjectsAndKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/initWithObjectsAndKeys:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("initWithObjectsAndKeys:")
    public native NSDictionary<?, ?> initWithObjectsAndKeys(@Mapped(ObjCObjectMapper.class) Object firstObject,
            Object... varargs);

    /**
     * isEqualToDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/isEqualToDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToDictionary:")
    public native boolean isEqualToDictionary(NSDictionary<_KeyType, _ObjectType> otherDictionary);

    @Generated
    @Selector("getObjects:andKeys:count:")
    public native void getObjectsAndKeysCount(Ptr<ObjCObject> objects, Ptr<ObjCObject> keys, @NUInt long count);

    @Generated
    @Selector("keyEnumerator")
    public native NSEnumerator<_KeyType> keyEnumerator();

    /**
     * keysOfEntriesPassingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/keysOfEntriesPassingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keysOfEntriesPassingTest:")
    public native NSSet<_KeyType> keysOfEntriesPassingTest(
            @ObjCBlock(name = "call_keysOfEntriesPassingTest") Block_keysOfEntriesPassingTest predicate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keysOfEntriesPassingTest {
        @Generated
        boolean call_keysOfEntriesPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    /**
     * keysOfEntriesWithOptions:passingTest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/keysOfEntriesWithOptions:passingTest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keysOfEntriesWithOptions:passingTest:")
    public native NSSet<_KeyType> keysOfEntriesWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_keysOfEntriesWithOptionsPassingTest") Block_keysOfEntriesWithOptionsPassingTest predicate);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keysOfEntriesWithOptionsPassingTest {
        @Generated
        boolean call_keysOfEntriesWithOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    /**
     * keysSortedByValueUsingComparator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/keysSortedByValueUsingComparator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keysSortedByValueUsingComparator:")
    public native NSArray<_KeyType> keysSortedByValueUsingComparator(
            @ObjCBlock(name = "call_keysSortedByValueUsingComparator") Block_keysSortedByValueUsingComparator cmptr);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keysSortedByValueUsingComparator {
        @Generated
        @NInt
        long call_keysSortedByValueUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    /**
     * keysSortedByValueUsingSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/keysSortedByValueUsingSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keysSortedByValueUsingSelector:")
    public native NSArray<_KeyType> keysSortedByValueUsingSelector(SEL comparator);

    /**
     * keysSortedByValueWithOptions:usingComparator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/keysSortedByValueWithOptions:usingComparator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keysSortedByValueWithOptions:usingComparator:")
    public native NSArray<_KeyType> keysSortedByValueWithOptionsUsingComparator(@NUInt long opts,
            @ObjCBlock(name = "call_keysSortedByValueWithOptionsUsingComparator") Block_keysSortedByValueWithOptionsUsingComparator cmptr);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keysSortedByValueWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_keysSortedByValueWithOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * objectEnumerator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/objectEnumerator">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    /**
     * objectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/objectForKey:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("objectForKey:")
    public native _ObjectType objectForKey(@Mapped(ObjCObjectMapper.class) _KeyType aKey);

    /**
     * objectForKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/objectForKeyedSubscript:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native _ObjectType objectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) _KeyType key);

    /**
     * objectsForKeys:notFoundMarker:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/objectsForKeys:notFoundMarker:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectsForKeys:notFoundMarker:")
    public native NSArray<_ObjectType> objectsForKeysNotFoundMarker(NSArray<_KeyType> keys,
            @Mapped(ObjCObjectMapper.class) _ObjectType marker);

    /**
     * sharedKeySetForKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/clm/NSDictionary/sharedKeySetForKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sharedKeySetForKeys:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native <_KeyType, _ObjectType> Object sharedKeySetForKeys(NSArray<?> keys);

    @Generated
    @Selector("supportsSecureCoding")
    public static native <_KeyType, _ObjectType> boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * valueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/valueForKey:">iOS Dev Center</a>
     */
    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("valueForKey:")
    public native _ObjectType valueForKey(String key);

    /**
     * writeToFile:atomically:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/writeToFile:atomically:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    /**
     * writeToURL:atomically:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDictionary_Class/index.html#//apple_ref/occ/instm/NSDictionary/writeToURL:atomically:">iOS Dev Center</a>
     */
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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
