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

package apple.coreimage;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIImageAccumulator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CIImageAccumulator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIImageAccumulator alloc();

    /**
     * clear</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/instm/CIImageAccumulator/clear">iOS Dev Center</a>
     */
    @Generated
    @Selector("clear")
    public native void clear();

    /**
     * extent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/instp/CIImageAccumulator/extent">iOS Dev Center</a>
     */
    @Generated
    @Selector("extent")
    @ByValue
    public native CGRect extent();

    /**
     * format</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/instp/CIImageAccumulator/format">iOS Dev Center</a>
     */
    @Generated
    @Selector("format")
    public native int format();

    /**
     * image</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/instm/CIImageAccumulator/image">iOS Dev Center</a>
     */
    @Generated
    @Selector("image")
    public native CIImage image();

    /**
     * imageAccumulatorWithExtent:format:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/clm/CIImageAccumulator/imageAccumulatorWithExtent:format:">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageAccumulatorWithExtent:format:")
    public static native CIImageAccumulator imageAccumulatorWithExtentFormat(@ByValue CGRect extent, int format);

    /**
     * imageAccumulatorWithExtent:format:colorSpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/clm/CIImageAccumulator/imageAccumulatorWithExtent:format:colorSpace:">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageAccumulatorWithExtent:format:colorSpace:")
    public static native CIImageAccumulator imageAccumulatorWithExtentFormatColorSpace(@ByValue CGRect extent,
            int format, CGColorSpaceRef colorSpace);

    @Generated
    @Selector("init")
    public native CIImageAccumulator init();

    /**
     * initWithExtent:format:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/instm/CIImageAccumulator/initWithExtent:format:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithExtent:format:")
    public native CIImageAccumulator initWithExtentFormat(@ByValue CGRect extent, int format);

    /**
     * initWithExtent:format:colorSpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/instm/CIImageAccumulator/initWithExtent:format:colorSpace:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithExtent:format:colorSpace:")
    public native CIImageAccumulator initWithExtentFormatColorSpace(@ByValue CGRect extent, int format,
            CGColorSpaceRef colorSpace);

    /**
     * setImage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/instm/CIImageAccumulator/setImage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(CIImage image);

    /**
     * setImage:dirtyRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImageAccumulator_Class/index.html#//apple_ref/occ/instm/CIImageAccumulator/setImage:dirtyRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImage:dirtyRect:")
    public native void setImageDirtyRect(CIImage image, @ByValue CGRect dirtyRect);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
