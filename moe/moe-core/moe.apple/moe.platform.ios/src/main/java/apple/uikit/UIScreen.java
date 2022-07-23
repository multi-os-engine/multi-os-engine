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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CADisplayLink;
import apple.uikit.protocol.UICoordinateSpace;
import apple.uikit.protocol.UIFocusItem;
import apple.uikit.protocol.UITraitEnvironment;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIScreen extends NSObject implements UITraitEnvironment {
    static {
        NatJ.register();
    }

    @Generated
    protected UIScreen(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIScreen alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIScreen allocWithZone(VoidPtr zone);

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

    /**
     * the device's internal screen
     */
    @Generated
    @Selector("mainScreen")
    public static native UIScreen mainScreen();

    @Generated
    @Owned
    @Selector("new")
    public static native UIScreen new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * all screens currently attached to the device
     */
    @Generated
    @Selector("screens")
    public static native NSArray<? extends UIScreen> screens();

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
    @Deprecated
    @Selector("applicationFrame")
    @ByValue
    public native CGRect applicationFrame();

    /**
     * The list of modes that this screen supports
     */
    @Generated
    @Selector("availableModes")
    public native NSArray<? extends UIScreenMode> availableModes();

    /**
     * Bounds of entire screen in points
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    /**
     * 0 .. 1.0, where 1.0 is maximum brightness. Only supported by main screen.
     */
    @Generated
    @Selector("brightness")
    @NFloat
    public native double brightness();

    @Generated
    @Selector("coordinateSpace")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICoordinateSpace coordinateSpace();

    /**
     * Current mode of this screen
     */
    @Generated
    @Selector("currentMode")
    public native UIScreenMode currentMode();

    @Generated
    @Selector("displayLinkWithTarget:selector:")
    public native CADisplayLink displayLinkWithTargetSelector(@Mapped(ObjCObjectMapper.class) Object target, SEL sel);

    @Generated
    @Selector("fixedCoordinateSpace")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICoordinateSpace fixedCoordinateSpace();

    @Generated
    @Selector("focusedItem")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusItem focusedItem();

    @Generated
    @Selector("focusedView")
    public native UIView focusedView();

    @Generated
    @Selector("init")
    public native UIScreen init();

    /**
     * The screen being mirrored by the receiver. nil if mirroring is disabled or unsupported. Moving a UIWindow to this
     * screen will disable mirroring
     */
    @Generated
    @Selector("mirroredScreen")
    public native UIScreen mirroredScreen();

    /**
     * Native bounds of the physical screen in pixels
     */
    @Generated
    @Selector("nativeBounds")
    @ByValue
    public native CGRect nativeBounds();

    /**
     * Native scale factor of the physical screen
     */
    @Generated
    @Selector("nativeScale")
    @NFloat
    public native double nativeScale();

    /**
     * Default is UIScreenOverscanCompensationScale. Determines how the screen behaves if the connected display is
     * overscanning
     */
    @Generated
    @Selector("overscanCompensation")
    @NInt
    public native long overscanCompensation();

    /**
     * The amount that should be inset to avoid clipping
     */
    @Generated
    @Selector("overscanCompensationInsets")
    @ByValue
    public native UIEdgeInsets overscanCompensationInsets();

    /**
     * Preferred mode of this screen. Choosing this mode will likely produce the best results
     */
    @Generated
    @Selector("preferredMode")
    public native UIScreenMode preferredMode();

    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    /**
     * 0 .. 1.0, where 1.0 is maximum brightness. Only supported by main screen.
     */
    @Generated
    @Selector("setBrightness:")
    public native void setBrightness(@NFloat double value);

    /**
     * Current mode of this screen
     */
    @Generated
    @Selector("setCurrentMode:")
    public native void setCurrentMode(UIScreenMode value);

    /**
     * Default is UIScreenOverscanCompensationScale. Determines how the screen behaves if the connected display is
     * overscanning
     */
    @Generated
    @Selector("setOverscanCompensation:")
    public native void setOverscanCompensation(@NInt long value);

    /**
     * Default is NO. If YES, brightness levels lower than that of which the hardware is capable are emulated in
     * software, if necessary. Having enabled may entail performance cost.
     */
    @Generated
    @Selector("setWantsSoftwareDimming:")
    public native void setWantsSoftwareDimming(boolean value);

    /**
     * Please see snapshotViewAfterScreenUpdates: in UIView.h for some important details on the behavior of this method
     * when called from layoutSubviews.
     */
    @Generated
    @Selector("snapshotViewAfterScreenUpdates:")
    public native UIView snapshotViewAfterScreenUpdates(boolean afterUpdates);

    @Generated
    @Selector("supportsFocus")
    public native boolean supportsFocus();

    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();

    @Generated
    @Selector("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);

    /**
     * Default is NO. If YES, brightness levels lower than that of which the hardware is capable are emulated in
     * software, if necessary. Having enabled may entail performance cost.
     */
    @Generated
    @Selector("wantsSoftwareDimming")
    public native boolean wantsSoftwareDimming();

    /**
     * True if this screen is being captured (e.g. recorded, AirPlayed, mirrored, etc.)
     */
    @Generated
    @Selector("isCaptured")
    public native boolean isCaptured();

    /**
     * The maximumFramesPerSecond this screen is capable of
     */
    @Generated
    @Selector("maximumFramesPerSecond")
    @NInt
    public native long maximumFramesPerSecond();

    /**
     * The latency of the display hardware associated with this screen.
     * Can be used along with CoreAudio devices' kAudioDeviceLatencyProperty to
     * achieve A/V sync when writing custom video playback software.
     * Will be `0` if display latency has not been calibrated by the user.
     */
    @Generated
    @Selector("calibratedLatency")
    public native double calibratedLatency();
}
