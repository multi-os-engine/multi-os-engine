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
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ptr.ConstNFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIVector extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CIVector(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIVector alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("vectorWithCGAffineTransform:")
    public static native CIVector vectorWithCGAffineTransform(@ByValue CGAffineTransform t);

    @Generated
    @Selector("vectorWithCGPoint:")
    public static native CIVector vectorWithCGPoint(@ByValue CGPoint p);

    @Generated
    @Selector("vectorWithCGRect:")
    public static native CIVector vectorWithCGRect(@ByValue CGRect r);

    @Generated
    @Selector("vectorWithString:")
    public static native CIVector vectorWithString(String representation);

    @Generated
    @Selector("vectorWithValues:count:")
    public static native CIVector vectorWithValuesCount(ConstNFloatPtr values, @NUInt long count);

    @Generated
    @Selector("vectorWithX:")
    public static native CIVector vectorWithX(@NFloat double x);

    @Generated
    @Selector("vectorWithX:Y:")
    public static native CIVector vectorWithXY(@NFloat double x, @NFloat double y);

    @Generated
    @Selector("vectorWithX:Y:Z:")
    public static native CIVector vectorWithXYZ(@NFloat double x, @NFloat double y, @NFloat double z);

    @Generated
    @Selector("vectorWithX:Y:Z:W:")
    public static native CIVector vectorWithXYZW(@NFloat double x, @NFloat double y, @NFloat double z,
            @NFloat double w);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("CGAffineTransformValue")
    @ByValue
    public native CGAffineTransform CGAffineTransformValue();

    @Generated
    @Selector("CGPointValue")
    @ByValue
    public native CGPoint CGPointValue();

    @Generated
    @Selector("CGRectValue")
    @ByValue
    public native CGRect CGRectValue();

    @Generated
    @Selector("W")
    @NFloat
    public native double W();

    @Generated
    @Selector("X")
    @NFloat
    public native double X();

    @Generated
    @Selector("Y")
    @NFloat
    public native double Y();

    @Generated
    @Selector("Z")
    @NFloat
    public native double Z();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native CIVector init();

    @Generated
    @Selector("initWithCGAffineTransform:")
    public native CIVector initWithCGAffineTransform(@ByValue CGAffineTransform r);

    @Generated
    @Selector("initWithCGPoint:")
    public native CIVector initWithCGPoint(@ByValue CGPoint p);

    @Generated
    @Selector("initWithCGRect:")
    public native CIVector initWithCGRect(@ByValue CGRect r);

    @Generated
    @Selector("initWithCoder:")
    public native CIVector initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithString:")
    public native CIVector initWithString(String representation);

    @Generated
    @Selector("initWithValues:count:")
    public native CIVector initWithValuesCount(ConstNFloatPtr values, @NUInt long count);

    @Generated
    @Selector("initWithX:")
    public native CIVector initWithX(@NFloat double x);

    @Generated
    @Selector("initWithX:Y:")
    public native CIVector initWithXY(@NFloat double x, @NFloat double y);

    @Generated
    @Selector("initWithX:Y:Z:")
    public native CIVector initWithXYZ(@NFloat double x, @NFloat double y, @NFloat double z);

    @Generated
    @Selector("initWithX:Y:Z:W:")
    public native CIVector initWithXYZW(@NFloat double x, @NFloat double y, @NFloat double z, @NFloat double w);

    @Generated
    @Selector("stringRepresentation")
    public native String stringRepresentation();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("valueAtIndex:")
    @NFloat
    public native double valueAtIndex(@NUInt long index);
}
