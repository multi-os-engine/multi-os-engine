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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScanner extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSScanner(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSScanner alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSScanner allocWithZone(VoidPtr zone);

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
    @Selector("localizedScannerWithString:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object localizedScannerWithString(String string);

    @Generated
    @Owned
    @Selector("new")
    public static native NSScanner new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scannerWithString:")
    public static native NSScanner scannerWithString(String string);

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
    @Selector("caseSensitive")
    public native boolean caseSensitive();

    @Generated
    @Selector("charactersToBeSkipped")
    public native NSCharacterSet charactersToBeSkipped();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native NSScanner init();

    @Generated
    @Selector("initWithString:")
    public native NSScanner initWithString(String string);

    @Generated
    @Selector("isAtEnd")
    public native boolean isAtEnd();

    @Generated
    @Selector("locale")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object locale();

    @Generated
    @Selector("scanCharactersFromSet:intoString:")
    public native boolean scanCharactersFromSetIntoString(NSCharacterSet set,
            @ReferenceInfo(type = NSString.class) Ptr<NSString> result);

    @Generated
    @Selector("scanDecimal:")
    public native boolean scanDecimal(VoidPtr dcm);

    @Generated
    @Selector("scanDouble:")
    public native boolean scanDouble(DoublePtr result);

    @Generated
    @Selector("scanFloat:")
    public native boolean scanFloat(FloatPtr result);

    /**
     * Corresponding to %a or %A formatting. Requires "0x" or "0X" prefix.
     */
    @Generated
    @Selector("scanHexDouble:")
    public native boolean scanHexDouble(DoublePtr result);

    /**
     * Corresponding to %a or %A formatting. Requires "0x" or "0X" prefix.
     */
    @Generated
    @Selector("scanHexFloat:")
    public native boolean scanHexFloat(FloatPtr result);

    /**
     * Optionally prefixed with "0x" or "0X"
     */
    @Generated
    @Selector("scanHexInt:")
    public native boolean scanHexInt(IntPtr result);

    /**
     * Optionally prefixed with "0x" or "0X"
     */
    @Generated
    @Selector("scanHexLongLong:")
    public native boolean scanHexLongLong(LongPtr result);

    /**
     * On overflow, the below methods will return success and clamp
     */
    @Generated
    @Selector("scanInt:")
    public native boolean scanInt(IntPtr result);

    @Generated
    @Selector("scanInteger:")
    public native boolean scanInteger(NIntPtr result);

    @Generated
    @Selector("scanLocation")
    @NUInt
    public native long scanLocation();

    @Generated
    @Selector("scanLongLong:")
    public native boolean scanLongLong(LongPtr result);

    @Generated
    @Selector("scanString:intoString:")
    public native boolean scanStringIntoString(String string,
            @ReferenceInfo(type = NSString.class) Ptr<NSString> result);

    @Generated
    @Selector("scanUnsignedLongLong:")
    public native boolean scanUnsignedLongLong(LongPtr result);

    @Generated
    @Selector("scanUpToCharactersFromSet:intoString:")
    public native boolean scanUpToCharactersFromSetIntoString(NSCharacterSet set,
            @ReferenceInfo(type = NSString.class) Ptr<NSString> result);

    @Generated
    @Selector("scanUpToString:intoString:")
    public native boolean scanUpToStringIntoString(String string,
            @ReferenceInfo(type = NSString.class) Ptr<NSString> result);

    @Generated
    @Selector("setCaseSensitive:")
    public native void setCaseSensitive(boolean value);

    @Generated
    @Selector("setCharactersToBeSkipped:")
    public native void setCharactersToBeSkipped(NSCharacterSet value);

    @Generated
    @Selector("setLocale:")
    public native void setLocale(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setScanLocation:")
    public native void setScanLocation(@NUInt long value);

    @Generated
    @Selector("string")
    public native String string();
}
