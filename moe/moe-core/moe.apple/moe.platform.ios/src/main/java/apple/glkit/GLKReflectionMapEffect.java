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
import apple.glkit.protocol.GLKNamedEffect;
import apple.glkit.struct.GLKMatrix3;
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

/**
 * GLKReflectionMapEffect
 * 
 * GLKReflectionMapEffect is a subclass of GLKBaseEffect. It is expected that GLKBaseEffect
 * functionality will be used in combination with GLKReflectionMapEffect.
 * 
 * GLKReflectionMapEffect implements common reflection mapping functionality as is used by many of
 * todays games and simulations. A reflection or environment map can be thought of as a texture
 * mapped polyhedral or spherical mesh that encloses a 3D model. When the model is rendered
 * surface normals from the model are used to calculate reflection vectors which intersect
 * the environment map at some location. The environment map texture color at this location
 * is used to impart a modulated environment map color on the model giving the appearance that
 * the shiny model is reflecting its surroundings to the viewer.
 * 
 * The polyhedral shape used for GLKReflectionMapEffect is a cube.
 * 
 * Because reflection mapping relies on surface normals to compute the intersection between
 * reflected rays and the environment map the GLKVertexAttribNormal array must be enabled
 * in order for GLKReflectionMapEffect to work properly. The normals are always normalized.
 * 
 * GLKReflectionMapEffect requires at least an OpenGL ES 2.0 context on iOS and an OpenGL Core
 * Profile context on OS X. This context must be initialized and made current prior to creating
 * or initializing GLKReflectionMapEffect instances. No OpenGL context state settings are
 * modified when a GLKReflectionMapEffect instance is created or its properties set. When
 * -[GLKReflectionMapEffect prepareToDraw] is called it modifies the following state:
 * 
 * GL_CURRENT_PROGRAM
 * GL_TEXTURE_BINDING_CUBE_MAP
 * 
 * For performance reasons GLKReflectionMapEffect does not restore any of these state settings.
 * It is up to the client application to save/restore/set these state elements as they choose.
 * 
 * A cube mapped texture name must be provided to GLKReflectionMapEffect to provide it texture
 * data for the 6 faces of the environment map.
 * 
 * GLKReflectionMapEffect reflection vectors are computed in eye space per section 2.11.4 of the
 * OpenGL 2.1 desktop specification for the GL_REFLECTION_MAP texgen mode. Typical reflection
 * mapping uses an environment map with a fixed position (e.g. the sky in a real world rendering)
 * and will accurately map the reflection map on the model regardless of the modelview transformation.
 * To achieve this effect decompose the modelview matrix into its model and view components
 * (i.e. the transforms on the object are the model and the transforms on the view are the camera).
 * Then undo the viewing transform by inverting the viewing matrix - call this Vinv. Now, starting
 * with Vinv, treat it as the canonical normal matrix by applying an inverse transpose to it and
 * choosing the upper 3x3 elements of the result. inverseTranspose(Vinv) simplifies to Vtranspose.
 * To apply this result to GLKReflectionMapEffect set its matrix property as follows:
 * 
 * reflectionMapEffect.matrix = GLKMatrix4GetMatrix3(Vtranspose);
 * 
 * to get correct, view-angle independent reflection mapping.
 * 
 * 
 * The following (5) steps are required to use GLKReflectionMapEffect:
 * 
 * (1) Allocate and initialize an instance of GLKReflectionMapEffect
 * 
 * reflectionMapEffect = [[GLKReflectionMapEffect alloc] init];
 * 
 * (2) Initialize vertex attribute / vertex array state preferrably with a vertex array object
 * for the model or scene to be drawn.
 * 
 * glGenVertexArraysOES(1, &vaoName);
 * glBindVertexArrayOES(vaoName);
 * 
 * // Create and initialize VBO for each vertex attribute
 * // The example below shows an example of setup up the position and normal vertex attributes.
 * // Specifying and binding a GLKVertexAttribNormal array attribute is required for GLKReflectionMapEffect
 * // to work properly. The normals are always normalized.
 * 
 * glGenBuffers(1, &positionVBO);
 * glBindBuffer(positionVBO);
 * glBufferData(GL_ARRAY_BUFFER, vboSize, dataBufPtr, GL_STATIC_DRAW);
 * glVertexAttribPointer(GLKVertexAttribPosition, size, type, normalize, stride, NULL);
 * 
 * glGenBuffers(1, &normalVBO);
 * glBindBuffer(normalVBO);
 * glBufferData(GL_ARRAY_BUFFER, vboSize, dataBufPtr, GL_STATIC_DRAW);
 * glVertexAttribPointer(GLKVertexAttribNormal, size, type, normalize, stride, NULL);
 * 
 * ... repeat the steps above for other desired vertex attributes
 * 
 * glBindVertexArrayOES(0); // unbind the VAO we created above
 * 
 * (3) Create a cube map texture for the reflection map
 * 
 * glGenTextures(1, &textureCubeMap);
 * glBindTexture(GL_TEXTURE_CUBE_MAP, textureCubeMap);
 * glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
 * glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
 * glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
 * glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
 * 
 * GLenum cubeMapBase = GL_TEXTURE_CUBE_MAP_POSITIVE_X;
 * 
 * for(face = 0; face < 6; face++)
 * glTexImage2D(cubeMapBase + face, 0, GL_RGB, width, height, 0, GL_RGB, GL_UNSIGNED_SHORT_5_6_5, faceData[face]);
 * 
 * (4) Set the textureCubeMap property to our new GL cube map and turn on reflection mapping
 * 
 * reflectionMapEffect.enable = GL_TRUE;
 * reflectionMapEffect.textureCubeMap = textureCubeMap; // created in step (2) above
 * 
 * (5) For each frame drawn: Update properties that change per frame. Synchronize the changed effect state
 * by calling -[GLKReflectionMapEffect prepareToDraw]. Draw the model with the effect
 * 
 * reflectionMapEffect.transform.modelviewMatrix = modelviewMatrix;
 * [reflectionMapEffect prepareToDraw];
 * glBindVertexArrayOES(vaoName);
 * glDrawArrays(GL_TRIANGLE_STRIP, 0, vertCt);
 * 
 * API-Since: 5.0
 * Deprecated-Since: 12.0
 * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
 */
@Deprecated
@Generated
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKReflectionMapEffect extends GLKBaseEffect implements GLKNamedEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected GLKReflectionMapEffect(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKReflectionMapEffect alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GLKReflectionMapEffect allocWithZone(VoidPtr zone);

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
    public static native GLKReflectionMapEffect new_objc();

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
    @Selector("init")
    public native GLKReflectionMapEffect init();

    /**
     * Identity
     */
    @Generated
    @Selector("matrix")
    @ByValue
    public native GLKMatrix3 matrix();

    @Generated
    @Selector("prepareToDraw")
    public native void prepareToDraw();

    /**
     * Identity
     */
    @Generated
    @Selector("setMatrix:")
    public native void setMatrix(@ByValue GLKMatrix3 value);

    /**
     * GL Texture Name == 0
     */
    @Generated
    @Selector("textureCubeMap")
    public native GLKEffectPropertyTexture textureCubeMap();
}
