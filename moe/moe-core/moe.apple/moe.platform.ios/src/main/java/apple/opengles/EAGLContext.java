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

package apple.opengles;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.opengles.protocol.EAGLDrawable;
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
 * EAGL Context
 * 
 * API-Since: 2.0
 * Deprecated-Since: 12.0
 * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
 */
@Deprecated
@Generated
@Library("OpenGLES")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EAGLContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected EAGLContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EAGLContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EAGLContext allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("currentContext")
    public static native EAGLContext currentContext();

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
    public static native EAGLContext new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setCurrentContext:")
    public static native boolean setCurrentContext(@Nullable EAGLContext context);

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
    @Selector("API")
    @NUInt
    public native long API();

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("debugLabel")
    public native String debugLabel();

    @Generated
    @Selector("init")
    public native EAGLContext init();

    @Generated
    @Selector("initWithAPI:")
    public native EAGLContext initWithAPI(@NUInt long api);

    @Generated
    @Selector("initWithAPI:sharegroup:")
    public native EAGLContext initWithAPISharegroup(@NUInt long api, @NotNull EAGLSharegroup sharegroup);

    /**
     * API-Since: 7.1
     */
    @Generated
    @Selector("isMultiThreaded")
    public native boolean isMultiThreaded();

    /**
     * API-Since: 7.1
     */
    @Generated
    @Selector("setMultiThreaded:")
    public native void setMultiThreaded(boolean value);

    /**
     * Request the native window system display the OpenGL ES renderbuffer bound to <target>
     */
    @Generated
    @Selector("presentRenderbuffer:")
    public native boolean presentRenderbuffer(@NUInt long target);

    /**
     * Request the native window system display the OpenGL ES renderbuffer bound to <target> at specified time
     */
    @Generated
    @Selector("presentRenderbuffer:atTime:")
    public native boolean presentRenderbufferAtTime(@NUInt long target, double presentationTime);

    /**
     * Attaches an EAGLDrawable as storage for the OpenGL ES renderbuffer object bound to <target>
     */
    @Generated
    @Selector("renderbufferStorage:fromDrawable:")
    public native boolean renderbufferStorageFromDrawable(@NUInt long target,
            @Nullable @Mapped(ObjCObjectMapper.class) EAGLDrawable drawable);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setDebugLabel:")
    public native void setDebugLabel(@Nullable String value);

    @NotNull
    @Generated
    @Selector("sharegroup")
    public native EAGLSharegroup sharegroup();

    /**
     * Request the native window system display the OpenGL ES renderbuffer bound to <target> after the previous frame is
     * presented for at least duration time
     */
    @Generated
    @Selector("presentRenderbuffer:afterMinimumDuration:")
    public native boolean presentRenderbufferAfterMinimumDuration(@NUInt long target, double duration);
}
