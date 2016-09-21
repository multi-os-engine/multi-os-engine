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
    @Owned
    @Selector("alloc")
    public static native UIScreen alloc();

    @Generated
    @Selector("mainScreen")
    public static native UIScreen mainScreen();

    @Generated
    @Selector("screens")
    public static native NSArray<? extends UIScreen> screens();

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

    @Deprecated
    @Generated
    @Selector("applicationFrame")
    @ByValue
    public native CGRect applicationFrame();

    @Generated
    @Selector("availableModes")
    public native NSArray<? extends UIScreenMode> availableModes();

    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    @Generated
    @Selector("brightness")
    @NFloat
    public native double brightness();

    @Generated
    @Selector("coordinateSpace")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICoordinateSpace coordinateSpace();

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
    @Selector("init")
    public native UIScreen init();

    @Generated
    @Selector("mirroredScreen")
    public native UIScreen mirroredScreen();

    @Generated
    @Selector("nativeBounds")
    @ByValue
    public native CGRect nativeBounds();

    @Generated
    @Selector("nativeScale")
    @NFloat
    public native double nativeScale();

    @Generated
    @Selector("overscanCompensation")
    @NInt
    public native long overscanCompensation();

    @Generated
    @Selector("preferredMode")
    public native UIScreenMode preferredMode();

    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    @Generated
    @Selector("setBrightness:")
    public native void setBrightness(@NFloat double value);

    @Generated
    @Selector("setCurrentMode:")
    public native void setCurrentMode(UIScreenMode value);

    @Generated
    @Selector("setOverscanCompensation:")
    public native void setOverscanCompensation(@NInt long value);

    @Generated
    @Selector("setWantsSoftwareDimming:")
    public native void setWantsSoftwareDimming(boolean value);

    @Generated
    @Selector("snapshotViewAfterScreenUpdates:")
    public native UIView snapshotViewAfterScreenUpdates(boolean afterUpdates);

    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();

    @Generated
    @Selector("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);

    @Generated
    @Selector("wantsSoftwareDimming")
    public native boolean wantsSoftwareDimming();

    @Generated
    @Selector("overscanCompensationInsets")
    @ByValue
    public native UIEdgeInsets overscanCompensationInsets();

    @Generated
    @Selector("focusedView")
    public native UIView focusedView();

    @Generated
    @Selector("supportsFocus")
    public native boolean supportsFocus();
}
