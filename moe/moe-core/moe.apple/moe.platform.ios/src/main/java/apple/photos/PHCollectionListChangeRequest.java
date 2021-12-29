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

package apple.photos;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * PHCollectionListChangeRequest can only be created or used within a -[PHPhotoLibrary performChanges:] or -[PHPhotoLibrary performChangesAndWait:] block.
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHCollectionListChangeRequest extends PHChangeRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected PHCollectionListChangeRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHCollectionListChangeRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHCollectionListChangeRequest allocWithZone(VoidPtr zone);

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

    /**
     * if the collection list does not allow the type of change requested, these methods will raise an exception, call canPerformEditOperation: on the collection list to determine if the type of edit operation is allowed.
     */
    @Generated
    @Selector("changeRequestForCollectionList:")
    public static native PHCollectionListChangeRequest changeRequestForCollectionList(PHCollectionList collectionList);

    /**
     * to add, remove or rearrange child collections in a collection list, passing in the fetched collections in that collection list will ensure that the child collection positions are tracked correctly in the case that the collection list has been externally edited after the fetch, but before this change is applied
     */
    @Generated
    @Selector("changeRequestForCollectionList:childCollections:")
    public static native PHCollectionListChangeRequest changeRequestForCollectionListChildCollections(
            PHCollectionList collectionList, PHFetchResult<? extends PHCollection> childCollections);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("creationRequestForCollectionListWithTitle:")
    public static native PHCollectionListChangeRequest creationRequestForCollectionListWithTitle(String title);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * requests that the specified collection lists and all their child collections (recursively) be deleted
     */
    @Generated
    @Selector("deleteCollectionLists:")
    public static native void deleteCollectionLists(@Mapped(ObjCObjectMapper.class) NSFastEnumeration collectionLists);

    @Generated
    @Selector("description")
    public static native String description_static();

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
    public static native PHCollectionListChangeRequest new_objc();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * A PHCollection can only belong to a single parent PHCollection
     */
    @Generated
    @Selector("addChildCollections:")
    public native void addChildCollections(@Mapped(ObjCObjectMapper.class) NSFastEnumeration collections);

    @Generated
    @Selector("init")
    public native PHCollectionListChangeRequest init();

    @Generated
    @Selector("insertChildCollections:atIndexes:")
    public native void insertChildCollectionsAtIndexes(@Mapped(ObjCObjectMapper.class) NSFastEnumeration collections,
            NSIndexSet indexes);

    /**
     * The move removes the child collections at fromIndexes first then inserts those collections at the toIndex, so toIndex should point to a location based on the updated indexes after having removed the child collections at fromIndexes
     */
    @Generated
    @Selector("moveChildCollectionsAtIndexes:toIndex:")
    public native void moveChildCollectionsAtIndexesToIndex(NSIndexSet indexes, @NUInt long toIndex);

    /**
     * This can be used to fetch the newly created collection list after the change block has completed by using -localIdentifier
     * It can also be added directly to collection lists within the current change block
     */
    @Generated
    @Selector("placeholderForCreatedCollectionList")
    public native PHObjectPlaceholder placeholderForCreatedCollectionList();

    @Generated
    @Selector("removeChildCollections:")
    public native void removeChildCollections(@Mapped(ObjCObjectMapper.class) NSFastEnumeration collections);

    @Generated
    @Selector("removeChildCollectionsAtIndexes:")
    public native void removeChildCollectionsAtIndexes(NSIndexSet indexes);

    @Generated
    @Selector("replaceChildCollectionsAtIndexes:withChildCollections:")
    public native void replaceChildCollectionsAtIndexesWithChildCollections(NSIndexSet indexes,
            @Mapped(ObjCObjectMapper.class) NSFastEnumeration collections);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("title")
    public native String title();

    /**
     * to add, remove or rearrange child collections in the TOP LEVEL collection list, passing in the fetched collections in that collection list will ensure that the child collection positions are tracked correctly in the case that the collection list has been externally edited after the fetch, but before this change is applied
     */
    @Generated
    @Selector("changeRequestForTopLevelCollectionListUserCollections:")
    public static native PHCollectionListChangeRequest changeRequestForTopLevelCollectionListUserCollections(
            PHFetchResult<? extends PHCollection> childCollections);
}
