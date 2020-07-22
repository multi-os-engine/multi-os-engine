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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ptr.BoolPtr;
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
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNSceneSource extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNSceneSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNSceneSource alloc();

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
    @Selector("sceneSourceWithData:options:")
    public static native SCNSceneSource sceneSourceWithDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("sceneSourceWithURL:options:")
    public static native SCNSceneSource sceneSourceWithURLOptions(NSURL url, NSDictionary<String, ?> options);

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
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("entriesPassingTest:")
    public native NSArray<?> entriesPassingTest(
            @ObjCBlock(name = "call_entriesPassingTest") Block_entriesPassingTest predicate);

    @Generated
    @Selector("entryWithIdentifier:withClass:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object entryWithIdentifierWithClass(String uid, Class entryClass);

    @Generated
    @Selector("identifiersOfEntriesWithClass:")
    public native NSArray<String> identifiersOfEntriesWithClass(Class entryClass);

    @Generated
    @Selector("init")
    public native SCNSceneSource init();

    @Generated
    @Selector("initWithData:options:")
    public native SCNSceneSource initWithDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithURL:options:")
    public native SCNSceneSource initWithURLOptions(NSURL url, NSDictionary<String, ?> options);

    @Generated
    @Selector("propertyForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyForKey(String key);

    @Generated
    @Selector("sceneWithOptions:error:")
    public native SCNScene sceneWithOptionsError(NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("sceneWithOptions:statusHandler:")
    public native SCNScene sceneWithOptionsStatusHandler(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_sceneWithOptionsStatusHandler") Block_sceneWithOptionsStatusHandler statusHandler);

    @Generated
    @Selector("url")
    public native NSURL url();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_entriesPassingTest {
        @Generated
        boolean call_entriesPassingTest(@Mapped(ObjCObjectMapper.class) Object entry, String identifier, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sceneWithOptionsStatusHandler {
        @Generated
        void call_sceneWithOptionsStatusHandler(float totalProgress, @NInt long status, NSError error, BoolPtr stop);
    }
}
