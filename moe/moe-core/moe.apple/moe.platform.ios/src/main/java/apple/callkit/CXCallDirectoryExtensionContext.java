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

package apple.callkit;

import apple.NSObject;
import apple.callkit.protocol.CXCallDirectoryExtensionContextDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSExtensionContext;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * API-Since: 10.0
 */
@Generated
@Library("CallKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CXCallDirectoryExtensionContext extends NSExtensionContext {
    static {
        NatJ.register();
    }

    @Generated
    protected CXCallDirectoryExtensionContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CXCallDirectoryExtensionContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CXCallDirectoryExtensionContext allocWithZone(VoidPtr zone);

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
    public static native CXCallDirectoryExtensionContext new_objc();

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
    @Selector("addBlockingEntryWithNextSequentialPhoneNumber:")
    public native void addBlockingEntryWithNextSequentialPhoneNumber(long phoneNumber);

    @Generated
    @Selector("addIdentificationEntryWithNextSequentialPhoneNumber:label:")
    public native void addIdentificationEntryWithNextSequentialPhoneNumberLabel(long phoneNumber,
            @NotNull String label);

    @Generated
    @Selector("completeRequestWithCompletionHandler:")
    public native void completeRequestWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_completeRequestWithCompletionHandler") Block_completeRequestWithCompletionHandler completion);

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CXCallDirectoryExtensionContextDelegate delegate();

    @Generated
    @Selector("init")
    public native CXCallDirectoryExtensionContext init();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) CXCallDirectoryExtensionContextDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CXCallDirectoryExtensionContextDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completeRequestWithCompletionHandler {
        @Generated
        void call_completeRequestWithCompletionHandler(boolean expired);
    }

    /**
     * Whether the request should provide incremental data.
     * 
     * If this is called at the beginning of the request (before any entries have been added or removed) and the result
     * is YES,
     * then the request must only provide an "incremental" set of entries, i.e. only add or remove entries relative to
     * the last time data
     * was loaded for the extension. Otherwise, if this method is not called OR is called and returns NO, then the
     * request must provide
     * a "complete" set of entries, adding the full list of entries from scratch (and removing none), regardless of
     * whether data has ever been
     * successfully loaded in the past.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isIncremental")
    public native boolean isIncremental();

    /**
     * Remove all currently-stored blocking entries.
     * 
     * May only be used when `-isIncremental` returns YES, indicating that the request should provide incremental
     * entries and thus may use this
     * API to remove all previously-added blocking entries.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("removeAllBlockingEntries")
    public native void removeAllBlockingEntries();

    /**
     * Remove all currently-stored identification entries.
     * 
     * May only be used when `-isIncremental` returns YES, indicating that the request should provide incremental
     * entries and thus may use this
     * API to remove all previously-added identification entries.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("removeAllIdentificationEntries")
    public native void removeAllIdentificationEntries();

    /**
     * Remove blocking entry with the specified phone number.
     * 
     * May only be used when `-isIncremental` returns YES, indicating that the request should provide incremental
     * entries and thus may use this
     * API to remove a previously-added blocking entry.
     * 
     * @param phoneNumber The blocking entry phone number to remove.
     * 
     *                    API-Since: 11.0
     */
    @Generated
    @Selector("removeBlockingEntryWithPhoneNumber:")
    public native void removeBlockingEntryWithPhoneNumber(long phoneNumber);

    /**
     * Remove identification entry with the specified phone number.
     * 
     * May only be used when `-isIncremental` returns YES, indicating that the request should provide incremental
     * entries and thus may use this
     * API to remove a previously-added identification entry. Removes all identification entries with the specified
     * phone number, even if
     * multiple identification entries with different labels are present for a single phone number.
     * 
     * @param phoneNumber The identification entry phone number to remove.
     * 
     *                    API-Since: 11.0
     */
    @Generated
    @Selector("removeIdentificationEntryWithPhoneNumber:")
    public native void removeIdentificationEntryWithPhoneNumber(long phoneNumber);
}
