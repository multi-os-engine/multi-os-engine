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
import apple.quartzcore.struct.CAFrameRateRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Class representing a timer bound to the display vsync. *
 * 
 * API-Since: 3.1
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CADisplayLink alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CADisplayLink allocWithZone(VoidPtr zone);

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

    /**
     * Create a new display link object for the main display. It will
     * invoke the method called 'sel' on 'target', the method has the
     * signature '(void)selector:(CADisplayLink *)sender'.
     * For macOS, see NSView/NSWindow/NSScreen.displayLink(withTarget:selector:).
     */
    @NotNull
    @Generated
    @Selector("displayLinkWithTarget:selector:")
    public static native CADisplayLink displayLinkWithTargetSelector(
            @NotNull @Mapped(ObjCObjectMapper.class) Object target, @NotNull SEL sel);

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
    public static native CADisplayLink new_objc();

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
     * Adds the receiver to the given run-loop and mode. Unless paused, it
     * will fire every vsync until removed. Each object may only be added
     * to a single run-loop, but it may be added in multiple modes at once.
     * While added to a run-loop it will implicitly be retained.
     */
    @Generated
    @Selector("addToRunLoop:forMode:")
    public native void addToRunLoopForMode(@NotNull NSRunLoop runloop, @NotNull String mode);

    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * Defines how many display frames must pass between each time the
     * display link fires. Default value is one, which means the display
     * link will fire for every display frame. Setting the interval to two
     * will cause the display link to fire every other display frame, and
     * so on. The behavior when using values less than one is undefined.
     * DEPRECATED - use preferredFramesPerSecond.
     * 
     * API-Since: 3.1
     * Deprecated-Since: 10.0
     * Deprecated-Message: preferredFramesPerSecond
     */
    @Deprecated
    @Generated
    @Selector("frameInterval")
    @NInt
    public native long frameInterval();

    @Generated
    @Selector("init")
    public native CADisplayLink init();

    /**
     * Removes the object from all runloop modes (releasing the receiver if
     * it has been implicitly retained) and releases the 'target' object.
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    /**
     * When true the object is prevented from firing. Initial state is
     * false.
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * When true the object is prevented from firing. Initial state is
     * false.
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * Defines the desired callback rate in frames-per-second for this display
     * link. If set to zero, the default value, the display link will fire at the
     * native cadence of the display hardware. The display link will make a
     * best-effort attempt at issuing callbacks at the requested rate.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("preferredFramesPerSecond")
    @NInt
    public native long preferredFramesPerSecond();

    /**
     * Removes the receiver from the given mode of the runloop. This will
     * implicitly release it when removed from the last mode it has been
     * registered for.
     */
    @Generated
    @Selector("removeFromRunLoop:forMode:")
    public native void removeFromRunLoopForMode(@NotNull NSRunLoop runloop, @NotNull String mode);

    /**
     * Defines how many display frames must pass between each time the
     * display link fires. Default value is one, which means the display
     * link will fire for every display frame. Setting the interval to two
     * will cause the display link to fire every other display frame, and
     * so on. The behavior when using values less than one is undefined.
     * DEPRECATED - use preferredFramesPerSecond.
     * 
     * API-Since: 3.1
     * Deprecated-Since: 10.0
     * Deprecated-Message: preferredFramesPerSecond
     */
    @Deprecated
    @Generated
    @Selector("setFrameInterval:")
    public native void setFrameInterval(@NInt long value);

    /**
     * Defines the desired callback rate in frames-per-second for this display
     * link. If set to zero, the default value, the display link will fire at the
     * native cadence of the display hardware. The display link will make a
     * best-effort attempt at issuing callbacks at the requested rate.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@NInt long value);

    /**
     * The next timestamp that the client should target their render for.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("targetTimestamp")
    public native double targetTimestamp();

    /**
     * The current time, and duration of the display frame associated with
     * the most recent target invocation. Time is represented using the
     * normal Core Animation conventions, i.e. Mach host time converted to
     * seconds.
     */
    @Generated
    @Selector("timestamp")
    public native double timestamp();

    /**
     * Defines the range of desired callback rate in frames-per-second for this
     * display link. If the range contains the same minimum and maximum frame rate,
     * this property is identical as preferredFramesPerSecond. Otherwise, the actual
     * callback rate will be dynamically adjusted to better align with other
     * animation sources.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("preferredFrameRateRange")
    @ByValue
    public native CAFrameRateRange preferredFrameRateRange();

    /**
     * Defines the range of desired callback rate in frames-per-second for this
     * display link. If the range contains the same minimum and maximum frame rate,
     * this property is identical as preferredFramesPerSecond. Otherwise, the actual
     * callback rate will be dynamically adjusted to better align with other
     * animation sources.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPreferredFrameRateRange:")
    public native void setPreferredFrameRateRange(@ByValue CAFrameRateRange value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
