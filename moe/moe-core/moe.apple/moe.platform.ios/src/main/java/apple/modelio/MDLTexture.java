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

package apple.modelio;

import apple.NSObject;
import apple.corefoundation.opaque.CFStringRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.modelio.protocol.MDLNamed;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLTexture extends NSObject implements MDLNamed {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLTexture(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLTexture alloc();

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
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("textureCubeWithImagesNamed:")
    public static native MDLTexture textureCubeWithImagesNamed(NSArray<String> names);

    @Generated
    @Selector("textureCubeWithImagesNamed:bundle:")
    public static native MDLTexture textureCubeWithImagesNamedBundle(NSArray<String> names, NSBundle bundleOrNil);

    @Generated
    @Selector("textureNamed:")
    public static native MDLTexture textureNamed(String name);

    @Generated
    @Selector("textureNamed:bundle:")
    public static native MDLTexture textureNamedBundle(String name, NSBundle bundleOrNil);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("channelCount")
    @NUInt
    public native long channelCount();

    @Generated
    @Selector("channelEncoding")
    @NInt
    public native long channelEncoding();

    @Generated
    @Selector("hasAlphaValues")
    public native boolean hasAlphaValues();

    @Generated
    @Selector("imageFromTexture")
    public native CGImageRef imageFromTexture();

    @Generated
    @Selector("init")
    public native MDLTexture init();

    @Generated
    @Selector("isCube")
    public native boolean isCube();

    @Generated
    @Selector("mipLevelCount")
    @NUInt
    public native long mipLevelCount();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("rowStride")
    @NInt
    public native long rowStride();

    @Generated
    @Selector("setHasAlphaValues:")
    public native void setHasAlphaValues(boolean value);

    @Generated
    @Selector("setIsCube:")
    public native void setIsCube(boolean value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("texelDataWithBottomLeftOrigin")
    public native NSData texelDataWithBottomLeftOrigin();

    @Generated
    @Selector("texelDataWithBottomLeftOriginAtMipLevel:create:")
    public native NSData texelDataWithBottomLeftOriginAtMipLevelCreate(@NInt long level, boolean create);

    @Generated
    @Selector("texelDataWithTopLeftOrigin")
    public native NSData texelDataWithTopLeftOrigin();

    @Generated
    @Selector("texelDataWithTopLeftOriginAtMipLevel:create:")
    public native NSData texelDataWithTopLeftOriginAtMipLevelCreate(@NInt long level, boolean create);

    @Generated
    @Selector("writeToURL:")
    public native boolean writeToURL(NSURL URL);

    @Generated
    @Selector("writeToURL:type:")
    public native boolean writeToURLType(NSURL nsurl, CFStringRef type);

    @Generated
    @Selector("imageFromTextureAtLevel:")
    public native CGImageRef imageFromTextureAtLevel(@NUInt long level);

    @Generated
    @Selector("writeToURL:level:")
    public native boolean writeToURLLevel(NSURL URL, @NUInt long level);

    @Generated
    @Selector("writeToURL:type:level:")
    public native boolean writeToURLTypeLevel(NSURL nsurl, CFStringRef type, @NUInt long level);
}
