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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSSecureCoding;
import apple.gameplaykit.protocol.GKSceneRootNodeType;
import apple.modelio.MDLAsset;
import apple.scenekit.protocol.SCNSceneExportDelegate;
import apple.scenekit.struct.SCNMatrix4;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNScene
 * <p>
 * SCNScene is the class that describes a 3d scene. It encapsulates a node hierarchy.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNScene extends NSObject implements NSSecureCoding, GKSceneRootNodeType {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNScene(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNScene alloc();

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
    @Selector("scene")
    public static native SCNScene scene();

    /**
     * sceneNamed:
     * <p>
     * Creates and returns a scene associated with the specified filename.
     * <p>
     * This method initializes with no options and does not check for errors. The resulting object is not cached.
     *
     * @param name The name of the file. The method looks for a file with the specified name in the application’s main bundle.
     */
    @Generated
    @Selector("sceneNamed:")
    public static native SCNScene sceneNamed(String name);

    /**
     * sceneNamed:options:
     * <p>
     * Creates and returns a scene associated with the specified filename.
     * <p>
     * This method initializes with no options and does not check for errors. The resulting object is not cached.
     *
     * @param name      The name of the file. The method looks for a file with the specified name in the application’s main bundle.
     * @param directory The name of the bundle sub-directory to search into.
     * @param options   An options dictionary. The relevant keys are documented in the SCNSceneSource class.
     */
    @Generated
    @Selector("sceneNamed:inDirectory:options:")
    public static native SCNScene sceneNamedInDirectoryOptions(String name, String directory,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("sceneWithMDLAsset:")
    public static native SCNScene sceneWithMDLAsset(MDLAsset mdlAsset);

    /**
     * sceneWithURL:options:error:
     * <p>
     * Creates and returns a scene from the specified URL.
     * <p>
     * This method is here for convenience. It is equivalent to initializing a SCNSceneSource with the specified
     * url and options, and asking it for its scene with the same options.
     *
     * @param url     The URL to the 3D file.
     * @param options An options dictionary. The relevant keys are documented in the SCNSceneSource class.
     * @param error   A NSError object passed by reference to get more information about the error when a nil is returned.
     */
    @Generated
    @Selector("sceneWithURL:options:error:")
    public static native SCNScene sceneWithURLOptionsError(NSURL url, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Add a particle system at the given location.
     */
    @Generated
    @Selector("addParticleSystem:withTransform:")
    public native void addParticleSystemWithTransform(SCNParticleSystem system, @ByValue SCNMatrix4 transform);

    /**
     * attributeForKey:
     * <p>
     * Retrieves a scene attribute.
     * <p>
     * The available keys are listed in the "Scene attributes" group.
     *
     * @param key An NSString object that specifies the attribute to be read
     */
    @Generated
    @Selector("attributeForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attributeForKey(String key);

    /**
     * [@property] background
     * <p>
     * Specifies the background of the receiver.
     * <p>
     * The background is rendered before the rest of the scene.
     * The background can be rendered as a skybox by setting a cube map as described in SCNMaterialProperty.h
     * Colors are supported starting in macOS 10.12 and iOS 10. Prior to that you can use SCNView.backgroundColor.
     * MDLSkyCubeTexture is supported starting in macOS 10.13 and iOS 11.
     */
    @Generated
    @Selector("background")
    public native SCNMaterialProperty background();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] fogColor
     * <p>
     * Specifies the receiver's fog color (NSColor or CGColorRef). Animatable. Defaults to white.
     * <p>
     * The initial value is a NSColor.
     */
    @Generated
    @Selector("fogColor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object fogColor();

    /**
     * [@property] fogDensityExponent
     * <p>
     * Specifies the receiver's fog power exponent. Animatable. Defaults to 1.
     * <p>
     * Controls the attenuation between the start and end fog distances. 0 means a constant fog, 1 a linear fog and 2 a quadratic fog, but any positive value will work.
     */
    @Generated
    @Selector("fogDensityExponent")
    @NFloat
    public native double fogDensityExponent();

    /**
     * [@property] fogEndDistance
     * <p>
     * Specifies the receiver's fog end distance. Animatable. Defaults to 0.
     */
    @Generated
    @Selector("fogEndDistance")
    @NFloat
    public native double fogEndDistance();

    /**
     * [@property] fogStartDistance
     * <p>
     * Specifies the receiver's fog start distance. Animatable. Defaults to 0.
     */
    @Generated
    @Selector("fogStartDistance")
    @NFloat
    public native double fogStartDistance();

    @Generated
    @Selector("init")
    public native SCNScene init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNScene initWithCoder(NSCoder coder);

    /**
     * [@property] paused
     * <p>
     * Controls whether or not the scene is paused. Defaults to NO.
     * <p>
     * Pausing a scene will pause animations, actions, particles and physics.
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * [@property] paused
     * <p>
     * Controls whether or not the scene is paused. Defaults to NO.
     * <p>
     * Pausing a scene will pause animations, actions, particles and physics.
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * [@property] lightingEnvironment
     * <p>
     * Specifies the receiver's environment for image-based lighting (IBL).
     * <p>
     * The environment should be a cube map as described in SCNMaterialProperty.h.
     * MDLSkyCubeTexture is supported starting in macOS 10.13 and iOS 11.
     */
    @Generated
    @Selector("lightingEnvironment")
    public native SCNMaterialProperty lightingEnvironment();

    /**
     * The particle systems attached to the scene that are active.
     */
    @Generated
    @Selector("particleSystems")
    public native NSArray<? extends SCNParticleSystem> particleSystems();

    /**
     * [@property] physicsWorld
     * <p>
     * Specifies the physics world of the receiver.
     * <p>
     * Every scene automatically creates a physics world object to simulate physics on nodes in the scene. You use this property to access the scene’s global physics properties, such as gravity. To add physics to a particular node, see physicsBody.
     */
    @Generated
    @Selector("physicsWorld")
    public native SCNPhysicsWorld physicsWorld();

    /**
     * Remove all particle systems in the scene.
     */
    @Generated
    @Selector("removeAllParticleSystems")
    public native void removeAllParticleSystems();

    /**
     * Remove the specified particle system from the receiver.
     */
    @Generated
    @Selector("removeParticleSystem:")
    public native void removeParticleSystem(SCNParticleSystem system);

    /**
     * [@property] root
     * <p>
     * Specifies the root node of the node hierarchy.
     * <p>
     * Note that we have only one root node, whereas some file formats might have many nodes
     * at the root of their hierarchies. The root node(s) of the imported files will therefore be children
     * of the SCNScene's root node.
     */
    @Generated
    @Selector("rootNode")
    public native SCNNode rootNode();

    /**
     * setAttribute:forKey:
     * <p>
     * Sets a scene attribute
     * <p>
     * The available keys are listed in the "Scene attributes" group.
     *
     * @param attribute An object that specifies the value of the attribute to be written.
     * @param key       An NSString object that specifies the attribute to be written
     */
    @Generated
    @Selector("setAttribute:forKey:")
    public native void setAttributeForKey(@Mapped(ObjCObjectMapper.class) Object attribute, String key);

    /**
     * [@property] fogColor
     * <p>
     * Specifies the receiver's fog color (NSColor or CGColorRef). Animatable. Defaults to white.
     * <p>
     * The initial value is a NSColor.
     */
    @Generated
    @Selector("setFogColor:")
    public native void setFogColor(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@property] fogDensityExponent
     * <p>
     * Specifies the receiver's fog power exponent. Animatable. Defaults to 1.
     * <p>
     * Controls the attenuation between the start and end fog distances. 0 means a constant fog, 1 a linear fog and 2 a quadratic fog, but any positive value will work.
     */
    @Generated
    @Selector("setFogDensityExponent:")
    public native void setFogDensityExponent(@NFloat double value);

    /**
     * [@property] fogEndDistance
     * <p>
     * Specifies the receiver's fog end distance. Animatable. Defaults to 0.
     */
    @Generated
    @Selector("setFogEndDistance:")
    public native void setFogEndDistance(@NFloat double value);

    /**
     * [@property] fogStartDistance
     * <p>
     * Specifies the receiver's fog start distance. Animatable. Defaults to 0.
     */
    @Generated
    @Selector("setFogStartDistance:")
    public native void setFogStartDistance(@NFloat double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * writeToURL:options:delegate:progressHandler:
     * <p>
     * write the scene to the specified url.
     * <p>
     * macOS 10.10 and lower only supports exporting to .dae files.
     * Starting macOS 10.11 exporting supports .dae, .scn as well as file all formats supported by Model I/O.
     * Starting iOS 10 exporting supports .scn as well as all file formats supported by Model I/O.
     *
     * @param url             the destination url to write the scene to.
     * @param options         A dictionary of options. The valid keys are described in the "Scene writing options" section.
     * @param delegate        an optional delegate to manage external references such as images.
     * @param progressHandler an optional block to handle the progress of the operation.
     * @return Returns YES if the operation succeeded, NO otherwise. Errors checking can be done via the "error"
     * parameter of the 'progressHandler'.
     */
    @Generated
    @Selector("writeToURL:options:delegate:progressHandler:")
    public native boolean writeToURLOptionsDelegateProgressHandler(NSURL url, NSDictionary<String, ?> options,
            @Mapped(ObjCObjectMapper.class) SCNSceneExportDelegate delegate,
            @ObjCBlock(name = "call_writeToURLOptionsDelegateProgressHandler") Block_writeToURLOptionsDelegateProgressHandler progressHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeToURLOptionsDelegateProgressHandler {
        @Generated
        void call_writeToURLOptionsDelegateProgressHandler(float totalProgress, NSError error, BoolPtr stop);
    }

    /**
     * [@property] screenSpaceReflectionMaximumDistance
     * <p>
     * Determines the maximum distance in world units.
     * <p>
     * Defaults to 1000.
     */
    @Generated
    @Selector("screenSpaceReflectionMaximumDistance")
    @NFloat
    public native double screenSpaceReflectionMaximumDistance();

    /**
     * [@property] screenSpaceReflectionSampleCount
     * <p>
     * Determines the sample count of the screen space reflection.
     * <p>
     * Defaults to 64.
     */
    @Generated
    @Selector("screenSpaceReflectionSampleCount")
    @NInt
    public native long screenSpaceReflectionSampleCount();

    /**
     * [@property] screenSpaceReflectionStride
     * <p>
     * Raytracing step size in pixel. The lower the better, the higher the faster.
     * <p>
     * Defaults to 8.
     */
    @Generated
    @Selector("screenSpaceReflectionStride")
    @NFloat
    public native double screenSpaceReflectionStride();

    /**
     * [@property] screenSpaceReflectionMaximumDistance
     * <p>
     * Determines the maximum distance in world units.
     * <p>
     * Defaults to 1000.
     */
    @Generated
    @Selector("setScreenSpaceReflectionMaximumDistance:")
    public native void setScreenSpaceReflectionMaximumDistance(@NFloat double value);

    /**
     * [@property] screenSpaceReflectionSampleCount
     * <p>
     * Determines the sample count of the screen space reflection.
     * <p>
     * Defaults to 64.
     */
    @Generated
    @Selector("setScreenSpaceReflectionSampleCount:")
    public native void setScreenSpaceReflectionSampleCount(@NInt long value);

    /**
     * [@property] screenSpaceReflectionStride
     * <p>
     * Raytracing step size in pixel. The lower the better, the higher the faster.
     * <p>
     * Defaults to 8.
     */
    @Generated
    @Selector("setScreenSpaceReflectionStride:")
    public native void setScreenSpaceReflectionStride(@NFloat double value);

    /**
     * [@property] wantsScreenSpaceReflection
     * <p>
     * Determines if the scene use screen space reflection.
     * <p>
     * Defaults to NO.
     */
    @Generated
    @Selector("setWantsScreenSpaceReflection:")
    public native void setWantsScreenSpaceReflection(boolean value);

    /**
     * [@property] wantsScreenSpaceReflection
     * <p>
     * Determines if the scene use screen space reflection.
     * <p>
     * Defaults to NO.
     */
    @Generated
    @Selector("wantsScreenSpaceReflection")
    public native boolean wantsScreenSpaceReflection();
}
