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
 * API-Since: 9.0
 * Deprecated-Since: 12.0
 * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
 */
@Deprecated
@Generated
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKSubmesh extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GLKSubmesh(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKSubmesh alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GLKSubmesh allocWithZone(VoidPtr zone);

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
    public static native GLKSubmesh new_objc();

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
     * [@property] elementBuffer
     * 
     * Name of buffer object with index data
     * 
     * The buffer name to be used with DrawElements
     */
    @NotNull
    @Generated
    @Selector("elementBuffer")
    public native GLKMeshBuffer elementBuffer();

    /**
     * [@property] elementCount
     * 
     * Number of elements (aka indicies) in the elementBuffer (aka indexBuffer)
     * 
     * This value should be used for the count parameter in glDrawElements
     */
    @Generated
    @Selector("elementCount")
    public native int elementCount();

    @Generated
    @Selector("init")
    public native GLKSubmesh init();

    /**
     * [@property] mesh
     * 
     * Parent GLKit mesh containing vertex data of this object
     * 
     * Buffer of this parent mesh should be set in the encoder before a drawIndexedPrimitives call is made
     */
    @Nullable
    @Generated
    @Selector("mesh")
    public native GLKMesh mesh();

    /**
     * [@property] mode
     * 
     * Primitive type mode value of data in the elementBuffer (aka indexBuffer)
     * 
     * This value should be used for the mode parameter in glDrawElements
     */
    @Generated
    @Selector("mode")
    public native int mode();

    /**
     * [@property] name
     * 
     * Name from the original MDLSubmesh object.
     * 
     * Although not directly used by this object, the application may use this to identify the submesh in it
     * renderer/scene/world.
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] type
     * 
     * Type of data in the elementBuffer (aka indexBuffer)
     * 
     * This value should be used for the type parameter of glDrawElements
     */
    @Generated
    @Selector("type")
    public native int type();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
