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

package apple.quartzcore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSRunLoop;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CADisplayLink extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CADisplayLink(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CADisplayLink alloc();

    /**
     * displayLinkWithTarget:selector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/clm/CADisplayLink/displayLinkWithTarget:selector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("displayLinkWithTarget:selector:")
    public static native CADisplayLink displayLinkWithTargetSelector(@Mapped(ObjCObjectMapper.class) Object target,
            SEL sel);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addToRunLoop:forMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instm/CADisplayLink/addToRunLoop:forMode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addToRunLoop:forMode:")
    public native void addToRunLoopForMode(NSRunLoop runloop, String mode);

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instp/CADisplayLink/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * frameInterval</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instp/CADisplayLink/frameInterval">iOS Dev Center</a>
     */
    @Generated
    @Selector("frameInterval")
    @NInt
    public native long frameInterval();

    @Generated
    @Selector("init")
    public native CADisplayLink init();

    /**
     * invalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instm/CADisplayLink/invalidate">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instp/CADisplayLink/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instp/CADisplayLink/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * removeFromRunLoop:forMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instm/CADisplayLink/removeFromRunLoop:forMode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFromRunLoop:forMode:")
    public native void removeFromRunLoopForMode(NSRunLoop runloop, String mode);

    /**
     * frameInterval</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instp/CADisplayLink/frameInterval">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFrameInterval:")
    public native void setFrameInterval(@NInt long value);

    /**
     * timestamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CADisplayLink_ClassRef/index.html#//apple_ref/occ/instp/CADisplayLink/timestamp">iOS Dev Center</a>
     */
    @Generated
    @Selector("timestamp")
    public native double timestamp();
}
