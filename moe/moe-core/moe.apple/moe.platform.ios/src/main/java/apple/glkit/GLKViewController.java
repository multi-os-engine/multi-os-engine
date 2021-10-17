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

package apple.glkit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.glkit.protocol.GLKViewControllerDelegate;
import apple.glkit.protocol.GLKViewDelegate;
import apple.uikit.UIViewController;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKViewController extends UIViewController implements NSCoding, GLKViewDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected GLKViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GLKViewControllerDelegate delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * The total number of frames displayed since drawing began.
     */
    @Generated
    @Selector("framesDisplayed")
    @NInt
    public native long framesDisplayed();

    /**
     * The actual frames per second that was decided upon given the value for preferredFramesPerSecond
     * and the screen for which the GLKView resides. The value chosen will be as close to
     * preferredFramesPerSecond as possible, without exceeding the screen's refresh rate. This value
     * does not account for dropped frames, so it is not a measurement of your statistical frames per
     * second. It is the static value for which updates will take place.
     */
    @Generated
    @Selector("framesPerSecond")
    @NInt
    public native long framesPerSecond();

    @Generated
    @Selector("glkView:drawInRect:")
    public native void glkViewDrawInRect(GLKView view, @ByValue CGRect rect);

    @Generated
    @Selector("init")
    public native GLKViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native GLKViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GLKViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Used to pause and resume the controller.
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * Used to pause and resume the controller.
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * If true, the controller will pause when the application recevies a willResignActive notification.
     * If false, the controller will not pause and it is expected that some other mechanism will pause
     * the controller when necessary.
     * The default is true.
     */
    @Generated
    @Selector("pauseOnWillResignActive")
    public native boolean pauseOnWillResignActive();

    /**
     * For setting the desired frames per second at which the update and drawing will take place.
     * The default is 30.
     */
    @Generated
    @Selector("preferredFramesPerSecond")
    @NInt
    public native long preferredFramesPerSecond();

    /**
     * If true, the controller will resume when the application recevies a didBecomeActive notification.
     * If false, the controller will not resume and it is expected that some other mechanism will resume
     * the controller when necessary.
     * The default is true.
     */
    @Generated
    @Selector("resumeOnDidBecomeActive")
    public native boolean resumeOnDidBecomeActive();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) GLKViewControllerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) GLKViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * If true, the controller will pause when the application recevies a willResignActive notification.
     * If false, the controller will not pause and it is expected that some other mechanism will pause
     * the controller when necessary.
     * The default is true.
     */
    @Generated
    @Selector("setPauseOnWillResignActive:")
    public native void setPauseOnWillResignActive(boolean value);

    /**
     * For setting the desired frames per second at which the update and drawing will take place.
     * The default is 30.
     */
    @Generated
    @Selector("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@NInt long value);

    /**
     * If true, the controller will resume when the application recevies a didBecomeActive notification.
     * If false, the controller will not resume and it is expected that some other mechanism will resume
     * the controller when necessary.
     * The default is true.
     */
    @Generated
    @Selector("setResumeOnDidBecomeActive:")
    public native void setResumeOnDidBecomeActive(boolean value);

    /**
     * Time interval since properties.
     */
    @Generated
    @Selector("timeSinceFirstResume")
    public native double timeSinceFirstResume();

    @Generated
    @Selector("timeSinceLastDraw")
    public native double timeSinceLastDraw();

    @Generated
    @Selector("timeSinceLastResume")
    public native double timeSinceLastResume();

    @Generated
    @Selector("timeSinceLastUpdate")
    public native double timeSinceLastUpdate();
}
