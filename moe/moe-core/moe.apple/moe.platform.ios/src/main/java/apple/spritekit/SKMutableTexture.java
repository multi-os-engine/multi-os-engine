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
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKNoiseMap;
import apple.uikit.UIImage;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKMutableTexture extends SKTexture {
    static {
        NatJ.register();
    }

    @Generated
    protected SKMutableTexture(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKMutableTexture alloc();

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
    @Selector("mutableTextureWithSize:")
    public static native SKMutableTexture mutableTextureWithSize(@ByValue CGSize size);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("preloadTextures:withCompletionHandler:")
    public static native void preloadTexturesWithCompletionHandler(NSArray<? extends SKTexture> textures,
            @ObjCBlock(name = "call_preloadTexturesWithCompletionHandler") SKTexture.Block_preloadTexturesWithCompletionHandler completionHandler);

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
    @Selector("textureNoiseWithSmoothness:size:grayscale:")
    public static native SKMutableTexture textureNoiseWithSmoothnessSizeGrayscale(@NFloat double smoothness,
            @ByValue CGSize size, boolean grayscale);

    @Generated
    @Selector("textureVectorNoiseWithSmoothness:size:")
    public static native SKMutableTexture textureVectorNoiseWithSmoothnessSize(@NFloat double smoothness,
            @ByValue CGSize size);

    @Generated
    @Selector("textureWithCGImage:")
    public static native SKMutableTexture textureWithCGImage(CGImageRef image);

    @Generated
    @Selector("textureWithData:size:")
    public static native SKMutableTexture textureWithDataSize(NSData pixelData, @ByValue CGSize size);

    @Generated
    @Selector("textureWithData:size:flipped:")
    public static native SKMutableTexture textureWithDataSizeFlipped(NSData pixelData, @ByValue CGSize size,
            boolean flipped);

    @Generated
    @Selector("textureWithData:size:rowLength:alignment:")
    public static native SKMutableTexture textureWithDataSizeRowLengthAlignment(NSData pixelData, @ByValue CGSize size,
            int rowLength, int alignment);

    @Generated
    @Selector("textureWithImage:")
    public static native SKMutableTexture textureWithImage(UIImage image);

    @Generated
    @Selector("textureWithImageNamed:")
    public static native SKMutableTexture textureWithImageNamed(String name);

    @Generated
    @Selector("textureWithNoiseMap:")
    public static native SKMutableTexture textureWithNoiseMap(GKNoiseMap noiseMap);

    @Generated
    @Selector("textureWithRect:inTexture:")
    public static native SKMutableTexture textureWithRectInTexture(@ByValue CGRect rect, SKTexture texture);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native SKMutableTexture init();

    @Generated
    @Selector("initWithCoder:")
    public native SKMutableTexture initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithSize:")
    public native SKMutableTexture initWithSize(@ByValue CGSize size);

    @Generated
    @Selector("initWithSize:pixelFormat:")
    public native SKMutableTexture initWithSizePixelFormat(@ByValue CGSize size, int format);

    @Generated
    @Selector("modifyPixelDataWithBlock:")
    public native void modifyPixelDataWithBlock(
            @ObjCBlock(name = "call_modifyPixelDataWithBlock") Block_modifyPixelDataWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyPixelDataWithBlock {
        @Generated
        void call_modifyPixelDataWithBlock(VoidPtr arg0, @NUInt long arg1);
    }
}
