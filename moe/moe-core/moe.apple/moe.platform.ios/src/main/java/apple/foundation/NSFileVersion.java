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
import apple.foundation.protocol.NSCoding;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileVersion extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileVersion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileVersion alloc();

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
    @Selector("currentVersionOfItemAtURL:")
    public static native NSFileVersion currentVersionOfItemAtURL(NSURL url);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("getNonlocalVersionsOfItemAtURL:completionHandler:")
    public static native void getNonlocalVersionsOfItemAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_getNonlocalVersionsOfItemAtURLCompletionHandler") Block_getNonlocalVersionsOfItemAtURLCompletionHandler completionHandler);

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
    @Selector("otherVersionsOfItemAtURL:")
    public static native NSArray<? extends NSFileVersion> otherVersionsOfItemAtURL(NSURL url);

    @Generated
    @Selector("removeOtherVersionsOfItemAtURL:error:")
    public static native boolean removeOtherVersionsOfItemAtURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    @Selector("unresolvedConflictVersionsOfItemAtURL:")
    public static native NSArray<? extends NSFileVersion> unresolvedConflictVersionsOfItemAtURL(NSURL url);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("versionOfItemAtURL:forPersistentIdentifier:")
    public static native NSFileVersion versionOfItemAtURLForPersistentIdentifier(NSURL url,
            @Mapped(ObjCObjectMapper.class) Object persistentIdentifier);

    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("hasLocalContents")
    public native boolean hasLocalContents();

    @Generated
    @Selector("hasThumbnail")
    public native boolean hasThumbnail();

    @Generated
    @Selector("init")
    public native NSFileVersion init();

    @Generated
    @Selector("isConflict")
    public native boolean isConflict();

    @Generated
    @Selector("isResolved")
    public native boolean isResolved();

    @Generated
    @Selector("setResolved:")
    public native void setResolved(boolean value);

    @Generated
    @Selector("localizedName")
    public native String localizedName();

    @Generated
    @Selector("localizedNameOfSavingComputer")
    public native String localizedNameOfSavingComputer();

    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    @Generated
    @Selector("persistentIdentifier")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSCoding persistentIdentifier();

    @Generated
    @Selector("removeAndReturnError:")
    public native boolean removeAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("replaceItemAtURL:options:error:")
    public native NSURL replaceItemAtURLOptionsError(NSURL url, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNonlocalVersionsOfItemAtURLCompletionHandler {
        @Generated
        void call_getNonlocalVersionsOfItemAtURLCompletionHandler(NSArray<? extends NSFileVersion> arg0, NSError arg1);
    }
}
