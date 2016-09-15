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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSByteCountFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSByteCountFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSByteCountFormatter alloc();

    /**
     * allowedUnits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/allowedUnits">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowedUnits")
    @NUInt
    public native long allowedUnits();

    /**
     * allowsNonnumericFormatting</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/allowsNonnumericFormatting">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsNonnumericFormatting")
    public native boolean allowsNonnumericFormatting();

    /**
     * countStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/countStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("countStyle")
    @NInt
    public native long countStyle();

    /**
     * formattingContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/formattingContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    /**
     * includesActualByteCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/includesActualByteCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("includesActualByteCount")
    public native boolean includesActualByteCount();

    /**
     * includesCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/includesCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("includesCount")
    public native boolean includesCount();

    /**
     * includesUnit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/includesUnit">iOS Dev Center</a>
     */
    @Generated
    @Selector("includesUnit")
    public native boolean includesUnit();

    @Generated
    @Selector("init")
    public native NSByteCountFormatter init();

    /**
     * adaptive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/adaptive">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAdaptive")
    public native boolean isAdaptive();

    /**
     * adaptive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/adaptive">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAdaptive:")
    public native void setAdaptive(boolean value);

    /**
     * allowedUnits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/allowedUnits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowedUnits:")
    public native void setAllowedUnits(@NUInt long value);

    /**
     * allowsNonnumericFormatting</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/allowsNonnumericFormatting">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsNonnumericFormatting:")
    public native void setAllowsNonnumericFormatting(boolean value);

    /**
     * countStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/countStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCountStyle:")
    public native void setCountStyle(@NInt long value);

    /**
     * formattingContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/formattingContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    /**
     * includesActualByteCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/includesActualByteCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIncludesActualByteCount:")
    public native void setIncludesActualByteCount(boolean value);

    /**
     * includesCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/includesCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIncludesCount:")
    public native void setIncludesCount(boolean value);

    /**
     * includesUnit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/includesUnit">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIncludesUnit:")
    public native void setIncludesUnit(boolean value);

    /**
     * zeroPadsFractionDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/zeroPadsFractionDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZeroPadsFractionDigits:")
    public native void setZeroPadsFractionDigits(boolean value);

    /**
     * stringFromByteCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instm/NSByteCountFormatter/stringFromByteCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringFromByteCount:")
    public native String stringFromByteCount(long byteCount);

    /**
     * stringFromByteCount:countStyle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/clm/NSByteCountFormatter/stringFromByteCount:countStyle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringFromByteCount:countStyle:")
    public static native String stringFromByteCountCountStyle(long byteCount, @NInt long countStyle);

    /**
     * zeroPadsFractionDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSByteCountFormatter_Class/index.html#//apple_ref/occ/instp/NSByteCountFormatter/zeroPadsFractionDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("zeroPadsFractionDigits")
    public native boolean zeroPadsFractionDigits();

    @Generated
    @Selector("initWithCoder:")
    public native NSByteCountFormatter initWithCoder(NSCoder aDecoder);

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
    public static native long version_static();
}
