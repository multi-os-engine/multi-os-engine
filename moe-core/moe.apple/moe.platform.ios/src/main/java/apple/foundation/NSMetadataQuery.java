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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 5.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMetadataQuery allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSMetadataQuery new_objc();

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
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSMetadataQueryDelegate delegate();

    /**
     * these nest
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("disableUpdates")
    public native void disableUpdates();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("enableUpdates")
    public native void enableUpdates();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("enumerateResultsUsingBlock:")
    public native void enumerateResultsUsingBlock(
            @NotNull @ObjCBlock(name = "call_enumerateResultsUsingBlock") Block_enumerateResultsUsingBlock block);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("enumerateResultsWithOptions:usingBlock:")
    public native void enumerateResultsWithOptionsUsingBlock(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateResultsWithOptionsUsingBlock") Block_enumerateResultsWithOptionsUsingBlock block);

    /**
     * array of NSMetadataQueryResultGroups, for first grouping attribute
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("groupedResults")
    public native NSArray<? extends NSMetadataQueryResultGroup> groupedResults();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("groupingAttributes")
    public native NSArray<String> groupingAttributes();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("indexOfResult:")
    @NUInt
    public native long indexOfResult(@NotNull @Mapped(ObjCObjectMapper.class) Object result);

    @Generated
    @Selector("init")
    public native NSMetadataQuery init();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("isGathering")
    public native boolean isGathering();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("isStarted")
    public native boolean isStarted();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("isStopped")
    public native boolean isStopped();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("notificationBatchingInterval")
    public native double notificationBatchingInterval();

    /**
     * items can be a mixture of NSMetadataItem, NSURL objects (file URLs only)
     * and/or string paths; the getter returns the same mixture as was set
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("operationQueue")
    public native NSOperationQueue operationQueue();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("resultAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object resultAtIndex(@NUInt long idx);

    /**
     * Results are NSMetadataItems, or whatever the delegate replaces that with
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("resultCount")
    @NUInt
    public native long resultCount();

    /**
     * this is for K-V Bindings, and causes side-effects on the query
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("results")
    public native NSArray<?> results();

    /**
     * scopes is an NSArray of NSURL objects (file URLs only) and/or string
     * paths and/or the special string constants below, which specifies the
     * locations to which the search is limited; an empty array means no
     * limits, which is the default state.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("searchItems")
    public native NSArray<?> searchItems();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("searchScopes")
    public native NSArray<?> searchScopes();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSMetadataQueryDelegate value);

    /**
     * API-Since: 5.0
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSMetadataQueryDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setGroupingAttributes:")
    public native void setGroupingAttributes(@Nullable NSArray<String> value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setNotificationBatchingInterval:")
    public native void setNotificationBatchingInterval(double value);

    /**
     * items can be a mixture of NSMetadataItem, NSURL objects (file URLs only)
     * and/or string paths; the getter returns the same mixture as was set
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setOperationQueue:")
    public native void setOperationQueue(@Nullable NSOperationQueue value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(@Nullable NSPredicate value);

    /**
     * scopes is an NSArray of NSURL objects (file URLs only) and/or string
     * paths and/or the special string constants below, which specifies the
     * locations to which the search is limited; an empty array means no
     * limits, which is the default state.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setSearchItems:")
    public native void setSearchItems(@Nullable NSArray<?> value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setSearchScopes:")
    public native void setSearchScopes(@NotNull NSArray<?> value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setSortDescriptors:")
    public native void setSortDescriptors(@NotNull NSArray<? extends NSSortDescriptor> value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setValueListAttributes:")
    public native void setValueListAttributes(@NotNull NSArray<String> value);

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("sortDescriptors")
    public native NSArray<? extends NSSortDescriptor> sortDescriptors();

    /**
     * optional operation queue for notifications and delegate method calls
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("startQuery")
    public native boolean startQuery();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("stopQuery")
    public native void stopQuery();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("valueListAttributes")
    public native NSArray<String> valueListAttributes();

    /**
     * values are arrays of NSMetadataQueryAttributeValueTuple
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("valueLists")
    public native NSDictionary<String, ? extends NSArray<? extends NSMetadataQueryAttributeValueTuple>> valueLists();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("valueOfAttribute:forResultAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueOfAttributeForResultAtIndex(@NotNull String attrName, @NUInt long idx);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateResultsUsingBlock {
        @Generated
        void call_enumerateResultsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object result, @NUInt long idx,
                @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateResultsWithOptionsUsingBlock {
        @Generated
        void call_enumerateResultsWithOptionsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object result,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
