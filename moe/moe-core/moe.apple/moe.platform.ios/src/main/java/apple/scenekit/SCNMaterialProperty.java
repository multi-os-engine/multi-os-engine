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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNAnimation;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNMaterialProperty
 * <p>
 * The contents of a SCNMaterial slot
 * <p>
 * This can be used to specify the various properties of SCNMaterial slots such as diffuse, ambient, etc.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNMaterialProperty extends NSObject implements SCNAnimatable, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNMaterialProperty(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNMaterialProperty alloc();

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

    /**
     * materialPropertyWithContents:
     * <p>
     * Creates and initialize a property instance with the specified contents.
     */
    @Generated
    @Selector("materialPropertyWithContents:")
    public static native SCNMaterialProperty materialPropertyWithContents(
            @Mapped(ObjCObjectMapper.class) Object contents);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * [@property] borderColor
     * <p>
     * Determines the receiver's border color (CGColorRef or UIColor). Animatable.
     * <p>
     * The border color is ignored on iOS and is always considered as clear color (0,0,0,0) when the texture has an alpha channel and opaque back (0,0,0,1) otherwise.
     */
    @Generated
    @Selector("borderColor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object borderColor();

    /**
     * [@property] contents
     * <p>
     * Specifies the receiver's contents. This can be a color (NSColor, UIColor, CGColorRef), an image (NSImage, UIImage, CGImageRef), a layer (CALayer), a path (NSString or NSURL), a SpriteKit scene (SKScene), a texture (SKTexture, id<MTLTexture> or GLKTextureInfo), or a floating value between 0 and 1 (NSNumber) for metalness and roughness properties. AVCaptureDevice is supported on iOS 11 and AVPlayer is supported on macOS 10.13, iOS 11 and tvOS 11. Animatable when set to a color.
     * <p>
     * Setting the contents to an instance of SKTexture will automatically update the wrapS, wrapT, contentsTransform, minification, magnification and mip filters according to the SKTexture settings.
     * When a cube map is expected (e.g. SCNMaterial.reflective, SCNScene.background, SCNScene.lightingEnvironment) you can use
     * 1. A horizontal strip image                          where `6 * image.height ==     image.width`
     * 2. A vertical strip image                            where `    image.height == 6 * image.width`
     * 3. A spherical projection image (latitude/longitude) where `2 * image.height ==     image.width`
     * 4. A NSArray of 6 images. This array must contain images of the exact same dimensions, in the following order, in a left-handed coordinate system: +X, -X, +Y, -Y, +Z, -Z (or Right, Left, Top, Bottom, Front, Back).
     */
    @Generated
    @Selector("contents")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contents();

    /**
     * [@property] contentsTransform
     * <p>
     * Determines the receiver's contents transform. Animatable.
     */
    @Generated
    @Selector("contentsTransform")
    @ByValue
    public native SCNMatrix4 contentsTransform();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native SCNMaterialProperty init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNMaterialProperty initWithCoder(NSCoder coder);

    /**
     * [@property] intensity
     * <p>
     * Determines the receiver's intensity. This intensity is used to modulate the properties in several ways.
     * It dims the diffuse, specular and emission properties, it varies the bumpiness of the normal property and the
     * filter property is blended with white. Default value is 1.0. Animatable.
     */
    @Generated
    @Selector("intensity")
    @NFloat
    public native double intensity();

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * [@property] magnificationFilter
     * <p>
     * Specifies the filter type to use when rendering the the contents (specified in the `contents' property).
     * <p>
     * The magnification filter is used when to increase the size of image data. See above the list of available modes. Defaults to SCNFilterModeLinear.
     */
    @Generated
    @Selector("magnificationFilter")
    @NInt
    public native long magnificationFilter();

    /**
     * [@property] mappingChannel
     * <p>
     * Determines the receiver's mapping channel. Defaults to 0.
     * <p>
     * Geometries potentially have multiple sources of texture coordinates. Every source has a unique mapping channel index. The mapping channel allows to select which source of texture coordinates is used to map the content of the receiver.
     */
    @Generated
    @Selector("mappingChannel")
    @NInt
    public native long mappingChannel();

    /**
     * [@property] maxAnisotropy
     * <p>
     * Specifies the receiver's max anisotropy. Defaults to 1.0.
     * <p>
     * Anisotropic filtering reduces blur and preserves detail at extreme viewing angles.
     */
    @Generated
    @Selector("maxAnisotropy")
    @NFloat
    public native double maxAnisotropy();

    /**
     * [@property] minificationFilter
     * <p>
     * Specifies the filter type to use when rendering the contents (specified in the `contents' property).
     * <p>
     * The minification filter is used when to reduce the size of image data. See above the list of available modes. Defaults to SCNFilterModeLinear.
     */
    @Generated
    @Selector("minificationFilter")
    @NInt
    public native long minificationFilter();

    /**
     * [@property] mipFilter
     * <p>
     * Specifies the mipmap filter to use during minification.
     * <p>
     * Defaults to SCNFilterModeNearest starting macOS 10.12, iOS 10, tvOS 10 and watchOS 3. Defaults to SCNFilterModeNone in previous versions.
     */
    @Generated
    @Selector("mipFilter")
    @NInt
    public native long mipFilter();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    /**
     * [@property] borderColor
     * <p>
     * Determines the receiver's border color (CGColorRef or UIColor). Animatable.
     * <p>
     * The border color is ignored on iOS and is always considered as clear color (0,0,0,0) when the texture has an alpha channel and opaque back (0,0,0,1) otherwise.
     */
    @Generated
    @Selector("setBorderColor:")
    public native void setBorderColor(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@property] contents
     * <p>
     * Specifies the receiver's contents. This can be a color (NSColor, UIColor, CGColorRef), an image (NSImage, UIImage, CGImageRef), a layer (CALayer), a path (NSString or NSURL), a SpriteKit scene (SKScene), a texture (SKTexture, id<MTLTexture> or GLKTextureInfo), or a floating value between 0 and 1 (NSNumber) for metalness and roughness properties. AVCaptureDevice is supported on iOS 11 and AVPlayer is supported on macOS 10.13, iOS 11 and tvOS 11. Animatable when set to a color.
     * <p>
     * Setting the contents to an instance of SKTexture will automatically update the wrapS, wrapT, contentsTransform, minification, magnification and mip filters according to the SKTexture settings.
     * When a cube map is expected (e.g. SCNMaterial.reflective, SCNScene.background, SCNScene.lightingEnvironment) you can use
     * 1. A horizontal strip image                          where `6 * image.height ==     image.width`
     * 2. A vertical strip image                            where `    image.height == 6 * image.width`
     * 3. A spherical projection image (latitude/longitude) where `2 * image.height ==     image.width`
     * 4. A NSArray of 6 images. This array must contain images of the exact same dimensions, in the following order, in a left-handed coordinate system: +X, -X, +Y, -Y, +Z, -Z (or Right, Left, Top, Bottom, Front, Back).
     */
    @Generated
    @Selector("setContents:")
    public native void setContents(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@property] contentsTransform
     * <p>
     * Determines the receiver's contents transform. Animatable.
     */
    @Generated
    @Selector("setContentsTransform:")
    public native void setContentsTransform(@ByValue SCNMatrix4 value);

    /**
     * [@property] intensity
     * <p>
     * Determines the receiver's intensity. This intensity is used to modulate the properties in several ways.
     * It dims the diffuse, specular and emission properties, it varies the bumpiness of the normal property and the
     * filter property is blended with white. Default value is 1.0. Animatable.
     */
    @Generated
    @Selector("setIntensity:")
    public native void setIntensity(@NFloat double value);

    /**
     * [@property] magnificationFilter
     * <p>
     * Specifies the filter type to use when rendering the the contents (specified in the `contents' property).
     * <p>
     * The magnification filter is used when to increase the size of image data. See above the list of available modes. Defaults to SCNFilterModeLinear.
     */
    @Generated
    @Selector("setMagnificationFilter:")
    public native void setMagnificationFilter(@NInt long value);

    /**
     * [@property] mappingChannel
     * <p>
     * Determines the receiver's mapping channel. Defaults to 0.
     * <p>
     * Geometries potentially have multiple sources of texture coordinates. Every source has a unique mapping channel index. The mapping channel allows to select which source of texture coordinates is used to map the content of the receiver.
     */
    @Generated
    @Selector("setMappingChannel:")
    public native void setMappingChannel(@NInt long value);

    /**
     * [@property] maxAnisotropy
     * <p>
     * Specifies the receiver's max anisotropy. Defaults to 1.0.
     * <p>
     * Anisotropic filtering reduces blur and preserves detail at extreme viewing angles.
     */
    @Generated
    @Selector("setMaxAnisotropy:")
    public native void setMaxAnisotropy(@NFloat double value);

    /**
     * [@property] minificationFilter
     * <p>
     * Specifies the filter type to use when rendering the contents (specified in the `contents' property).
     * <p>
     * The minification filter is used when to reduce the size of image data. See above the list of available modes. Defaults to SCNFilterModeLinear.
     */
    @Generated
    @Selector("setMinificationFilter:")
    public native void setMinificationFilter(@NInt long value);

    /**
     * [@property] mipFilter
     * <p>
     * Specifies the mipmap filter to use during minification.
     * <p>
     * Defaults to SCNFilterModeNearest starting macOS 10.12, iOS 10, tvOS 10 and watchOS 3. Defaults to SCNFilterModeNone in previous versions.
     */
    @Generated
    @Selector("setMipFilter:")
    public native void setMipFilter(@NInt long value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    /**
     * [@property] wrapS
     * <p>
     * Determines the receiver's wrap mode for the s texture coordinate. Defaults to SCNWrapModeClamp.
     */
    @Generated
    @Selector("setWrapS:")
    public native void setWrapS(@NInt long value);

    /**
     * [@property] wrapT
     * <p>
     * Determines the receiver's wrap mode for the t texture coordinate. Defaults to SCNWrapModeClamp.
     */
    @Generated
    @Selector("setWrapT:")
    public native void setWrapT(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] wrapS
     * <p>
     * Determines the receiver's wrap mode for the s texture coordinate. Defaults to SCNWrapModeClamp.
     */
    @Generated
    @Selector("wrapS")
    @NInt
    public native long wrapS();

    /**
     * [@property] wrapT
     * <p>
     * Determines the receiver's wrap mode for the t texture coordinate. Defaults to SCNWrapModeClamp.
     */
    @Generated
    @Selector("wrapT")
    @NInt
    public native long wrapT();

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    /**
     * [@property] textureComponents
     * <p>
     * Specifies the texture components to sample in the shader. Defaults to SCNColorMaskRed for displacement property, and to SCNColorMaskAll for other properties.
     * <p>
     * Use this property to when using a texture that combine multiple informations in the different texture components. For example if you pack the roughness in red and metalness in blue etc... You can specify what component to use from the texture for this given material property. This property is only supported by Metal renderers.
     */
    @Generated
    @Selector("setTextureComponents:")
    public native void setTextureComponents(@NInt long value);

    /**
     * [@property] textureComponents
     * <p>
     * Specifies the texture components to sample in the shader. Defaults to SCNColorMaskRed for displacement property, and to SCNColorMaskAll for other properties.
     * <p>
     * Use this property to when using a texture that combine multiple informations in the different texture components. For example if you pack the roughness in red and metalness in blue etc... You can specify what component to use from the texture for this given material property. This property is only supported by Metal renderers.
     */
    @Generated
    @Selector("textureComponents")
    @NInt
    public native long textureComponents();

    @Generated
    @Selector("removeAllAnimationsWithBlendOutDuration:")
    public native void removeAllAnimationsWithBlendOutDuration(@NFloat double duration);
}
