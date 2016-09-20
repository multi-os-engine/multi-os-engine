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
import apple.coreimage.CIFilter;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
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
public class SKTexture extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTexture(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTexture alloc();

    /**
     * preloadTextures:withCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/preloadTextures:withCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("preloadTextures:withCompletionHandler:")
    public static native void preloadTexturesWithCompletionHandler(NSArray<? extends SKTexture> textures,
            @ObjCBlock(name = "call_preloadTexturesWithCompletionHandler") Block_preloadTexturesWithCompletionHandler completionHandler);

    /**
     * textureNoiseWithSmoothness:size:grayscale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureNoiseWithSmoothness:size:grayscale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureNoiseWithSmoothness:size:grayscale:")
    public static native SKTexture textureNoiseWithSmoothnessSizeGrayscale(@NFloat double smoothness,
            @ByValue CGSize size, boolean grayscale);

    /**
     * textureVectorNoiseWithSmoothness:size:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureVectorNoiseWithSmoothness:size:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureVectorNoiseWithSmoothness:size:")
    public static native SKTexture textureVectorNoiseWithSmoothnessSize(@NFloat double smoothness,
            @ByValue CGSize size);

    /**
     * textureWithCGImage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureWithCGImage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureWithCGImage:")
    public static native SKTexture textureWithCGImage(CGImageRef image);

    /**
     * textureWithData:size:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureWithData:size:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureWithData:size:")
    public static native SKTexture textureWithDataSize(NSData pixelData, @ByValue CGSize size);

    /**
     * textureWithData:size:flipped:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureWithData:size:flipped:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureWithData:size:flipped:")
    public static native SKTexture textureWithDataSizeFlipped(NSData pixelData, @ByValue CGSize size, boolean flipped);

    /**
     * textureWithData:size:rowLength:alignment:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureWithData:size:rowLength:alignment:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureWithData:size:rowLength:alignment:")
    public static native SKTexture textureWithDataSizeRowLengthAlignment(NSData pixelData, @ByValue CGSize size,
            int rowLength, int alignment);

    /**
     * textureWithImage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureWithImage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureWithImage:")
    public static native SKTexture textureWithImage(UIImage image);

    /**
     * textureWithImageNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureWithImageNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureWithImageNamed:")
    public static native SKTexture textureWithImageNamed(String name);

    /**
     * textureWithRect:inTexture:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/clm/SKTexture/textureWithRect:inTexture:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureWithRect:inTexture:")
    public static native SKTexture textureWithRectInTexture(@ByValue CGRect rect, SKTexture texture);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * filteringMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instp/SKTexture/filteringMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("filteringMode")
    @NInt
    public native long filteringMode();

    @Generated
    @Selector("init")
    public native SKTexture init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTexture initWithCoder(NSCoder aDecoder);

    /**
     * preloadWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instm/SKTexture/preloadWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("preloadWithCompletionHandler:")
    public native void preloadWithCompletionHandler(
            @ObjCBlock(name = "call_preloadWithCompletionHandler") Block_preloadWithCompletionHandler completionHandler);

    /**
     * filteringMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instp/SKTexture/filteringMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFilteringMode:")
    public native void setFilteringMode(@NInt long value);

    /**
     * usesMipmaps</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instp/SKTexture/usesMipmaps">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesMipmaps:")
    public native void setUsesMipmaps(boolean value);

    /**
     * size</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instm/SKTexture/size">iOS Dev Center</a>
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * textureByApplyingCIFilter:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instm/SKTexture/textureByApplyingCIFilter:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureByApplyingCIFilter:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object textureByApplyingCIFilter(CIFilter filter);

    /**
     * textureByGeneratingNormalMap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instm/SKTexture/textureByGeneratingNormalMap">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureByGeneratingNormalMap")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object textureByGeneratingNormalMap();

    /**
     * textureByGeneratingNormalMapWithSmoothness:contrast:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instm/SKTexture/textureByGeneratingNormalMapWithSmoothness:contrast:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureByGeneratingNormalMapWithSmoothness:contrast:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object textureByGeneratingNormalMapWithSmoothnessContrast(@NFloat double smoothness,
            @NFloat double contrast);

    /**
     * textureRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instm/SKTexture/textureRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureRect")
    @ByValue
    public native CGRect textureRect();

    /**
     * usesMipmaps</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instp/SKTexture/usesMipmaps">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesMipmaps")
    public native boolean usesMipmaps();

    /**
     * CGImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTexture_Ref/index.html#//apple_ref/occ/instm/SKTexture/CGImage">iOS Dev Center</a>
     */
    @Generated
    @Selector("CGImage")
    public native CGImageRef CGImage();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preloadTexturesWithCompletionHandler {
        @Generated
        void call_preloadTexturesWithCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preloadWithCompletionHandler {
        @Generated
        void call_preloadWithCompletionHandler();
    }
}
