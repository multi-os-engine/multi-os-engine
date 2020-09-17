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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.photos.protocol.PHPhotoLibraryAvailabilityObserver;
import apple.photos.protocol.PHPhotoLibraryChangeObserver;
import apple.uikit.UIViewController;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHPhotoLibrary extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHPhotoLibrary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHPhotoLibrary alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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
    @Selector("requestAuthorization:")
    public static native void requestAuthorization(
            @ObjCBlock(name = "call_requestAuthorization") Block_requestAuthorization handler);

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
    @Selector("sharedPhotoLibrary")
    public static native PHPhotoLibrary sharedPhotoLibrary();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native PHPhotoLibrary init();

    @Generated
    @Selector("performChanges:completionHandler:")
    public native void performChangesCompletionHandler(
            @ObjCBlock(name = "call_performChangesCompletionHandler_0") Block_performChangesCompletionHandler_0 changeBlock,
            @ObjCBlock(name = "call_performChangesCompletionHandler_1") Block_performChangesCompletionHandler_1 completionHandler);

    @Generated
    @Selector("performChangesAndWait:error:")
    public native boolean performChangesAndWaitError(
            @ObjCBlock(name = "call_performChangesAndWaitError") Block_performChangesAndWaitError changeBlock,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("registerChangeObserver:")
    public native void registerChangeObserver(@Mapped(ObjCObjectMapper.class) PHPhotoLibraryChangeObserver observer);

    @Generated
    @Selector("unregisterChangeObserver:")
    public native void unregisterChangeObserver(@Mapped(ObjCObjectMapper.class) PHPhotoLibraryChangeObserver observer);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performChangesCompletionHandler_0 {
        @Generated
        void call_performChangesCompletionHandler_0();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performChangesCompletionHandler_1 {
        @Generated
        void call_performChangesCompletionHandler_1(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performChangesAndWaitError {
        @Generated
        void call_performChangesAndWaitError();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorization {
        @Generated
        void call_requestAuthorization(@NInt long status);
    }

    @Generated
    @Selector("cloudIdentifiersForLocalIdentifiers:")
    public native NSArray<? extends PHCloudIdentifier> cloudIdentifiersForLocalIdentifiers(
            NSArray<String> localIdentifiers);

    @Generated
    @Selector("localIdentifiersForCloudIdentifiers:")
    public native NSArray<String> localIdentifiersForCloudIdentifiers(
            NSArray<? extends PHCloudIdentifier> cloudIdentifiers);

    @Generated
    @Selector("registerAvailabilityObserver:")
    public native void registerAvailabilityObserver(
            @Mapped(ObjCObjectMapper.class) PHPhotoLibraryAvailabilityObserver observer);

    @Generated
    @Selector("unavailabilityReason")
    public native NSError unavailabilityReason();

    @Generated
    @Selector("unregisterAvailabilityObserver:")
    public native void unregisterAvailabilityObserver(
            @Mapped(ObjCObjectMapper.class) PHPhotoLibraryAvailabilityObserver observer);

    @Generated
    @Selector("authorizationStatusForAccessLevel:")
    @NInt
    public static native long authorizationStatusForAccessLevel(@NInt long accessLevel);

    @Generated
    @Selector("presentLimitedLibraryPickerFromViewController:")
    public native void presentLimitedLibraryPickerFromViewController(UIViewController controller);

    @Generated
    @Selector("requestAuthorizationForAccessLevel:handler:")
    public static native void requestAuthorizationForAccessLevelHandler(@NInt long accessLevel,
            @ObjCBlock(name = "call_requestAuthorizationForAccessLevelHandler") Block_requestAuthorizationForAccessLevelHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorizationForAccessLevelHandler {
        @Generated
        void call_requestAuthorizationForAccessLevelHandler(@NInt long status);
    }
}
