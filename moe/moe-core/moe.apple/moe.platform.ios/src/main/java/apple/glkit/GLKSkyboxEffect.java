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
import apple.glkit.struct.GLKVector3;
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
 * GLKSkyboxEffect
 * <p>
 * GLKSkyboxEffect implements common skybox functionality as is used by many of todays games
 * and simulations.  A skybox is a textured cube that encloses the boundaries of the object
 * space of a 3D graphics application or game.  It provides a visual horizon in all camera
 * directions within 3D object space.
 * <p>
 * GLKSkyboxEffect requires at least an OpenGL ES 2.0 context on iOS and an OpenGL Core
 * Profile context on OS X. This context must be initialized and made current prior to creating
 * or initializing GLKSkyboxEffect instances.  No OpenGL context state settings are
 * modified when a GLKSkyboxEffect instance is created or its properties set.  When
 * -[GLKSkyboxEffect prepareToDraw] is called it modifies the following state:
 * <p>
 * GL_CURRENT_PROGRAM
 * GL_TEXTURE_BINDING_CUBE_MAP
 * GL_VERTEX_ARRAY_BINDING_OES
 * GL_ARRAY_BUFFER_BINDING
 * GL_VERTEX_ATTRIB_ARRAY_ENABLED (GLKVertexAttribPosition)
 * <p>
 * For performance reasons GLKSkyboxEffect does not restore any of these state settings.
 * It is up to the client application to save/restore/set these state elements as they choose.
 * <p>
 * A cube mapped texture name must be provided to GLKSkyboxEffect to provide it texture
 * data for the 6 faces of the skybox cube.  Care must be taken when preparing the
 * cubemap texture to prevent seams from appearing at the interfaces between adjacent
 * faces.
 * <p>
 * Unlike other named effects, GLKSkyboxEffect provides a -draw method and requires no ancillary
 * vertex attribute setup because the class maintains the simple, unambiguous geometry data
 * required to draw the skybox internally.
 * <p>
 * <p>
 * The following (4) steps are required to use GLKSkyboxEffect:
 * <p>
 * (1) Allocate and initialize an instance of GLKSkyboxEffect
 * <p>
 * skybox = [[GLKSkyboxEffect alloc] init];
 * <p>
 * (2) Create a cube map texture for the skybox
 * <p>
 * glGenTextures(1, &cubeMapName);
 * glBindTexture(GL_TEXTURE_CUBE_MAP, cubeMapName);
 * glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
 * glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
 * glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
 * glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
 * <p>
 * GLenum cubeMapBase = GL_TEXTURE_CUBE_MAP_POSITIVE_X;
 * <p>
 * for(face = 0; face < 6; face++)
 * glTexImage2D(cubeMapBase + face, 0, GL_RGB, width, height, 0, GL_RGB, GL_UNSIGNED_SHORT_5_6_5, faceData[face]);
 * <p>
 * (3) Configure the skybox effect transform, location, size, and texture properties
 * <p>
 * skybox.center = center;
 * skybox.xSize = xSize;
 * skybox.ySize = ySize;
 * skybox.zSize = zSize;
 * skybox.textureCubeMap = cubeMapName;     // created in step (2) above
 * <p>
 * (4) For each frame drawn:  Update properties that change per frame.  Synchronize the changed effect state
 * by calling -[GLKSkyboxEffect prepareToDraw].  Draw the the skybox.
 * <p>
 * skybox.transform.modelviewMatrix = modelviewMatrix;
 * [skybox prepareToDraw];
 * [skybox draw];
 */
@Generated
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKSkyboxEffect extends NSObject implements GLKNamedEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected GLKSkyboxEffect(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKSkyboxEffect alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native GLKSkyboxEffect allocWithZone(VoidPtr zone);

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
    public static native GLKSkyboxEffect new_objc();

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
     * { 0.0, 0.0, 0.0 }
     */
    @Generated
    @Selector("center")
    @ByValue
    public native GLKVector3 center();

    /**
     * Draw skybox
     */
    @Generated
    @Selector("draw")
    public native void draw();

    @Generated
    @Selector("init")
    public native GLKSkyboxEffect init();

    /**
     * nil
     */
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Selector("prepareToDraw")
    public native void prepareToDraw();

    /**
     * { 0.0, 0.0, 0.0 }
     */
    @Generated
    @Selector("setCenter:")
    public native void setCenter(@ByValue GLKVector3 value);

    /**
     * nil
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * 1.0, 1.0, 1.0
     */
    @Generated
    @Selector("setXSize:")
    public native void setXSize(float value);

    /**
     * 1.0, 1.0, 1.0
     */
    @Generated
    @Selector("setYSize:")
    public native void setYSize(float value);

    /**
     * 1.0, 1.0, 1.0
     */
    @Generated
    @Selector("setZSize:")
    public native void setZSize(float value);

    /**
     * name == 0, target == GL_TEXTURE_CUBE_MAP
     */
    @Generated
    @Selector("textureCubeMap")
    public native GLKEffectPropertyTexture textureCubeMap();

    /**
     * Identity for all matrices
     */
    @Generated
    @Selector("transform")
    public native GLKEffectPropertyTransform transform();

    /**
     * 1.0, 1.0, 1.0
     */
    @Generated
    @Selector("xSize")
    public native float xSize();

    /**
     * 1.0, 1.0, 1.0
     */
    @Generated
    @Selector("ySize")
    public native float ySize();

    /**
     * 1.0, 1.0, 1.0
     */
    @Generated
    @Selector("zSize")
    public native float zSize();
}
