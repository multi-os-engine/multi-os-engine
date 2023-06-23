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

package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * AVCaptureAutoExposureBracketedStillImageSettings
 * 
 * AVCaptureAutoExposureBracketedStillImageSettings is a concrete subclass of AVCaptureBracketedStillImageSettings to be
 * used when bracketing exposure target bias.
 * 
 * An AVCaptureAutoExposureBracketedStillImageSettings instance defines the exposure target bias setting that should be
 * applied to one image in a bracket. An array of settings objects is passed to -[AVCaptureStillImageOutput
 * captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:]. Min and max exposure
 * target bias are queryable properties of the AVCaptureDevice supplying data to an AVCaptureStillImageOutput instance.
 * If you wish to leave exposureTargetBias unchanged for this bracketed still image, you may pass the special value
 * AVCaptureExposureTargetBiasCurrent (see AVCaptureDevice.h).
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureAutoExposureBracketedStillImageSettings extends AVCaptureBracketedStillImageSettings {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureAutoExposureBracketedStillImageSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureAutoExposureBracketedStillImageSettings alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureAutoExposureBracketedStillImageSettings allocWithZone(VoidPtr zone);

    /**
     * autoExposureSettingsWithExposureTargetBias
     * 
     * Creates an AVCaptureAutoExposureBracketedStillImageSettings using the specified exposure target bias.
     * 
     * @param exposureTargetBias
     *                           The exposure target bias. Pass AVCaptureExposureTargetBiasCurrent to leave the
     *                           exposureTargetBias unchanged for this image.
     * @return
     *         An initialized AVCaptureAutoExposureBracketedStillImageSettings instance.
     */
    @NotNull
    @Generated
    @Selector("autoExposureSettingsWithExposureTargetBias:")
    public static native AVCaptureAutoExposureBracketedStillImageSettings autoExposureSettingsWithExposureTargetBias(
            float exposureTargetBias);

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
    public static native AVCaptureAutoExposureBracketedStillImageSettings new_objc();

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
     * [@property] exposureTargetBias
     * 
     * The exposure bias for the auto exposure bracketed settings
     */
    @Generated
    @Selector("exposureTargetBias")
    public native float exposureTargetBias();

    @Generated
    @Selector("init")
    public native AVCaptureAutoExposureBracketedStillImageSettings init();
}
