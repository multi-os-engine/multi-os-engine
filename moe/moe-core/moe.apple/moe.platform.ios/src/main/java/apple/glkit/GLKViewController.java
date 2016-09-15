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
    @Owned
    @Selector("alloc")
    public static native GLKViewController alloc();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GLKViewControllerDelegate delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * framesDisplayed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/framesDisplayed">iOS Dev Center</a>
     */
    @Generated
    @Selector("framesDisplayed")
    @NInt
    public native long framesDisplayed();

    /**
     * framesPerSecond</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/framesPerSecond">iOS Dev Center</a>
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
    public native GLKViewController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GLKViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * pauseOnWillResignActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/pauseOnWillResignActive">iOS Dev Center</a>
     */
    @Generated
    @Selector("pauseOnWillResignActive")
    public native boolean pauseOnWillResignActive();

    /**
     * preferredFramesPerSecond</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/preferredFramesPerSecond">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredFramesPerSecond")
    @NInt
    public native long preferredFramesPerSecond();

    /**
     * resumeOnDidBecomeActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/resumeOnDidBecomeActive">iOS Dev Center</a>
     */
    @Generated
    @Selector("resumeOnDidBecomeActive")
    public native boolean resumeOnDidBecomeActive();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) GLKViewControllerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/delegate">iOS Dev Center</a>
     */
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
     * pauseOnWillResignActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/pauseOnWillResignActive">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPauseOnWillResignActive:")
    public native void setPauseOnWillResignActive(boolean value);

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * preferredFramesPerSecond</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/preferredFramesPerSecond">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@NInt long value);

    /**
     * resumeOnDidBecomeActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/resumeOnDidBecomeActive">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResumeOnDidBecomeActive:")
    public native void setResumeOnDidBecomeActive(boolean value);

    /**
     * timeSinceFirstResume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/timeSinceFirstResume">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeSinceFirstResume")
    public native double timeSinceFirstResume();

    /**
     * timeSinceLastDraw</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/timeSinceLastDraw">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeSinceLastDraw")
    public native double timeSinceLastDraw();

    /**
     * timeSinceLastResume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/timeSinceLastResume">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeSinceLastResume")
    public native double timeSinceLastResume();

    /**
     * timeSinceLastUpdate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKViewController_ClassRef/index.html#//apple_ref/occ/instp/GLKViewController/timeSinceLastUpdate">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeSinceLastUpdate")
    public native double timeSinceLastUpdate();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

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
}
