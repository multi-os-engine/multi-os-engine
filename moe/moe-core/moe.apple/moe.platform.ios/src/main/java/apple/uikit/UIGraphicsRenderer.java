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
import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import apple.corefoundation.struct.CGRect;

/**
 * An abstract base class for creating graphics renderers. Do not use this class directly.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIGraphicsRenderer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIGraphicsRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIGraphicsRenderer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIGraphicsRenderer allocWithZone(VoidPtr zone);

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
    public static native UIGraphicsRenderer new_objc();

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
     * If YES, this renderer may be used to generate CGImageRefs.
     */
    @Generated
    @Selector("allowsImageOutput")
    public native boolean allowsImageOutput();

    /**
     * The renderer format used to create this renderer instance. returned by copy.
     */
    @Generated
    @Selector("format")
    public native UIGraphicsRendererFormat format();

    @Generated
    @Selector("init")
    public native UIGraphicsRenderer init();

    /**
     * Creates a new UIGraphicsRenderer instance with the provides bounds and format, or a defaultFormat if none is
     * provided.
     * The format instance is copied by the initializer, and the provided instance may be immediately reused
     * for creating other renderer instances with the same or different bounds.
     */
    @Generated
    @Selector("initWithBounds:")
    public native UIGraphicsRenderer initWithBounds(@ByValue CGRect bounds);

    @Generated
    @Selector("initWithBounds:format:")
    public native UIGraphicsRenderer initWithBoundsFormat(@ByValue CGRect bounds, UIGraphicsRendererFormat format);

    /**
     * Override this to create a context with a custom format
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("contextWithFormat:")
    public static native CGContextRef contextWithFormat(UIGraphicsRendererFormat format);

    /**
     * Override this to provide a CGContext created by a renderer with a custom initial configuration
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("prepareCGContext:withRendererContext:")
    public static native void prepareCGContextWithRendererContext(CGContextRef context,
            UIGraphicsRendererContext rendererContext);

    /**
     * The Class of your UIGraphicsRendererContext subclass
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("rendererContextClass")
    public static native Class rendererContextClass();

    /**
     * Invokes the drawingActions with a context generated by +contextWithFormat:, captured in an instance of
     * +rendererContextClass, after preparation by +prepareCGContext:withRendererContext:
     * This method is not intended to be overridden.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("runDrawingActions:completionActions:error:")
    public native boolean runDrawingActionsCompletionActionsError(
            @ObjCBlock(name = "call_runDrawingActionsCompletionActionsError_0") Block_runDrawingActionsCompletionActionsError_0 drawingActions,
            @ObjCBlock(name = "call_runDrawingActionsCompletionActionsError_1") Block_runDrawingActionsCompletionActionsError_1 completionActions,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runDrawingActionsCompletionActionsError_0 {
        @Generated
        void call_runDrawingActionsCompletionActionsError_0(UIGraphicsRendererContext rendererContext);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runDrawingActionsCompletionActionsError_1 {
        @Generated
        void call_runDrawingActionsCompletionActionsError_1(UIGraphicsRendererContext rendererContext);
    }
}
