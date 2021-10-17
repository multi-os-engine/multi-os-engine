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

package apple.spritekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTextureAtlas extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTextureAtlas(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTextureAtlas alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native SKTextureAtlas allocWithZone(VoidPtr zone);

    /**
     * Atlas with .png and .plist file name
     */
    @Generated
    @Selector("atlasNamed:")
    public static native SKTextureAtlas atlasNamed(String name);

    /**
     * Create a texture atlas on the fly
     */
    @Generated
    @Selector("atlasWithDictionary:")
    public static native SKTextureAtlas atlasWithDictionary(NSDictionary<String, ?> properties);

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
    public static native SKTextureAtlas new_objc();

    /**
     * Start a texture atlas preload operation on an array of texture atlas
     *
     * @param textureAtlases    an array of SKTextureAtlas to be preloaded
     * @param completionHandler will be called upon the preload completion
     */
    @Generated
    @Selector("preloadTextureAtlases:withCompletionHandler:")
    public static native void preloadTextureAtlasesWithCompletionHandler(
            NSArray<? extends SKTextureAtlas> textureAtlases,
            @ObjCBlock(name = "call_preloadTextureAtlasesWithCompletionHandler") Block_preloadTextureAtlasesWithCompletionHandler completionHandler);

    /**
     * Start a texture atlas preload operation on an array of texture atlas identifiers, error == nil if all atlases were found,
     * else an NSError is returned and the user info will contain a list of the atlases that couldn't be found
     * the ones that could be found are looked up and prefetched.
     *
     * @param atlasNames        is an array of the SKTextureAtlas, that were located and preloaded.
     * @param completionHandler will be called upon the preload completion.
     */
    @Generated
    @Selector("preloadTextureAtlasesNamed:withCompletionHandler:")
    public static native void preloadTextureAtlasesNamedWithCompletionHandler(NSArray<String> atlasNames,
            @ObjCBlock(name = "call_preloadTextureAtlasesNamedWithCompletionHandler") Block_preloadTextureAtlasesNamedWithCompletionHandler completionHandler);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native SKTextureAtlas init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTextureAtlas initWithCoder(NSCoder coder);

    /**
     * Request that this texture atlas be loaded into vram on the next render update, with a callback handler.
     */
    @Generated
    @Selector("preloadWithCompletionHandler:")
    public native void preloadWithCompletionHandler(
            @ObjCBlock(name = "call_preloadWithCompletionHandler") Block_preloadWithCompletionHandler completionHandler);

    /**
     * Individual texture for image name within the atlas
     */
    @Generated
    @Selector("textureNamed:")
    public native SKTexture textureNamed(String name);

    /**
     * Returns the array of valid textures in the atlas
     */
    @Generated
    @Selector("textureNames")
    public native NSArray<String> textureNames();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preloadTextureAtlasesWithCompletionHandler {
        @Generated
        void call_preloadTextureAtlasesWithCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preloadTextureAtlasesNamedWithCompletionHandler {
        @Generated
        void call_preloadTextureAtlasesNamedWithCompletionHandler(NSError error,
                NSArray<? extends SKTextureAtlas> foundAtlases);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preloadWithCompletionHandler {
        @Generated
        void call_preloadWithCompletionHandler();
    }

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
