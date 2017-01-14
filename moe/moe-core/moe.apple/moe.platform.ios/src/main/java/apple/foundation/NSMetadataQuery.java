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
import apple.foundation.protocol.NSMetadataQueryDelegate;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMetadataQuery extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMetadataQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMetadataQuery alloc();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSMetadataQueryDelegate delegate();

    @Generated
    @Selector("disableUpdates")
    public native void disableUpdates();

    @Generated
    @Selector("enableUpdates")
    public native void enableUpdates();

    @Generated
    @Selector("enumerateResultsUsingBlock:")
    public native void enumerateResultsUsingBlock(
            @ObjCBlock(name = "call_enumerateResultsUsingBlock") Block_enumerateResultsUsingBlock block);

    @Generated
    @Selector("enumerateResultsWithOptions:usingBlock:")
    public native void enumerateResultsWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateResultsWithOptionsUsingBlock") Block_enumerateResultsWithOptionsUsingBlock block);

    @Generated
    @Selector("groupedResults")
    public native NSArray<? extends NSMetadataQueryResultGroup> groupedResults();

    @Generated
    @Selector("groupingAttributes")
    public native NSArray<String> groupingAttributes();

    @Generated
    @Selector("indexOfResult:")
    @NUInt
    public native long indexOfResult(@Mapped(ObjCObjectMapper.class) Object result);

    @Generated
    @Selector("init")
    public native NSMetadataQuery init();

    @Generated
    @Selector("isGathering")
    public native boolean isGathering();

    @Generated
    @Selector("isStarted")
    public native boolean isStarted();

    @Generated
    @Selector("isStopped")
    public native boolean isStopped();

    @Generated
    @Selector("notificationBatchingInterval")
    public native double notificationBatchingInterval();

    @Generated
    @Selector("operationQueue")
    public native NSOperationQueue operationQueue();

    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    @Generated
    @Selector("resultAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object resultAtIndex(@NUInt long idx);

    @Generated
    @Selector("resultCount")
    @NUInt
    public native long resultCount();

    @Generated
    @Selector("results")
    public native NSArray<?> results();

    @Generated
    @Selector("searchItems")
    public native NSArray<?> searchItems();

    @Generated
    @Selector("searchScopes")
    public native NSArray<?> searchScopes();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSMetadataQueryDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSMetadataQueryDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setGroupingAttributes:")
    public native void setGroupingAttributes(NSArray<String> value);

    @Generated
    @Selector("setNotificationBatchingInterval:")
    public native void setNotificationBatchingInterval(double value);

    @Generated
    @Selector("setOperationQueue:")
    public native void setOperationQueue(NSOperationQueue value);

    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(NSPredicate value);

    @Generated
    @Selector("setSearchItems:")
    public native void setSearchItems(NSArray<?> value);

    @Generated
    @Selector("setSearchScopes:")
    public native void setSearchScopes(NSArray<?> value);

    @Generated
    @Selector("setSortDescriptors:")
    public native void setSortDescriptors(NSArray<? extends NSSortDescriptor> value);

    @Generated
    @Selector("setValueListAttributes:")
    public native void setValueListAttributes(NSArray<String> value);

    @Generated
    @Selector("sortDescriptors")
    public native NSArray<? extends NSSortDescriptor> sortDescriptors();

    @Generated
    @Selector("startQuery")
    public native boolean startQuery();

    @Generated
    @Selector("stopQuery")
    public native void stopQuery();

    @Generated
    @Selector("valueListAttributes")
    public native NSArray<String> valueListAttributes();

    @Generated
    @Selector("valueLists")
    public native NSDictionary<String, ? extends NSArray<? extends NSMetadataQueryAttributeValueTuple>> valueLists();

    @Generated
    @Selector("valueOfAttribute:forResultAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueOfAttributeForResultAtIndex(String attrName, @NUInt long idx);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateResultsUsingBlock {
        @Generated
        void call_enumerateResultsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateResultsWithOptionsUsingBlock {
        @Generated
        void call_enumerateResultsWithOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }
}
