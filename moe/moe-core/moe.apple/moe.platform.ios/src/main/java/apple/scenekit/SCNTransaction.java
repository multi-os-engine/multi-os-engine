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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CAMediaTimingFunction;
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

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNTransaction extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNTransaction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNTransaction alloc();

    /**
     * animationDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/animationDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("animationDuration")
    public static native double animationDuration();

    /**
     * animationTimingFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/animationTimingFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("animationTimingFunction")
    public static native CAMediaTimingFunction animationTimingFunction();

    /**
     * begin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/begin">iOS Dev Center</a>
     */
    @Generated
    @Selector("begin")
    public static native void begin();

    /**
     * commit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/commit">iOS Dev Center</a>
     */
    @Generated
    @Selector("commit")
    public static native void commit();

    /**
     * disableActions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/disableActions">iOS Dev Center</a>
     */
    @Generated
    @Selector("disableActions")
    public static native boolean disableActions();

    /**
     * flush</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/flush">iOS Dev Center</a>
     */
    @Generated
    @Selector("flush")
    public static native void flush();

    /**
     * lock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/lock">iOS Dev Center</a>
     */
    @Generated
    @Selector("lock")
    public static native void lock();

    /**
     * setAnimationDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/setAnimationDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration(double duration);

    /**
     * setAnimationTimingFunction:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/setAnimationTimingFunction:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationTimingFunction:")
    public static native void setAnimationTimingFunction(CAMediaTimingFunction animationTimingFunction);

    /**
     * setCompletionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/setCompletionBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCompletionBlock:")
    public static native void setCompletionBlock(
            @ObjCBlock(name = "call_setCompletionBlock") Block_setCompletionBlock block);

    /**
     * setDisableActions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/setDisableActions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDisableActions:")
    public static native void setDisableActions(boolean flag);

    /**
     * setValue:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/setValue:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:forKey:")
    public static native void setValueForKey_static(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * unlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/unlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("unlock")
    public static native void unlock();

    /**
     * valueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/valueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object valueForKey_static(String key);

    /**
     * completionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNTransaction_Class/index.html#//apple_ref/occ/clm/SCNTransaction/completionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("completionBlock")
    @ObjCBlock(name = "call_completionBlock_ret")
    public static native Block_completionBlock_ret completionBlock();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native SCNTransaction init();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionBlock {
        @Generated
        void call_setCompletionBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionBlock_ret {
        @Generated
        void call_completionBlock_ret();
    }
}
