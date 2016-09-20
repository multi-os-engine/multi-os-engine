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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCharacterSet;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextTab extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextTab(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextTab alloc();

    /**
     * columnTerminatorsForLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextTab_Class/index.html#//apple_ref/occ/clm/NSTextTab/columnTerminatorsForLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("columnTerminatorsForLocale:")
    public static native NSCharacterSet columnTerminatorsForLocale(NSLocale aLocale);

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

    /**
     * alignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextTab_Class/index.html#//apple_ref/occ/instp/NSTextTab/alignment">iOS Dev Center</a>
     */
    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native NSTextTab init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextTab initWithCoder(NSCoder aDecoder);

    /**
     * initWithTextAlignment:location:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextTab_Class/index.html#//apple_ref/occ/instm/NSTextTab/initWithTextAlignment:location:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTextAlignment:location:options:")
    public native NSTextTab initWithTextAlignmentLocationOptions(@NInt long alignment, @NFloat double loc,
            NSDictionary<String, ?> options);

    /**
     * location</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextTab_Class/index.html#//apple_ref/occ/instp/NSTextTab/location">iOS Dev Center</a>
     */
    @Generated
    @Selector("location")
    @NFloat
    public native double location();

    /**
     * options</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextTab_Class/index.html#//apple_ref/occ/instp/NSTextTab/options">iOS Dev Center</a>
     */
    @Generated
    @Selector("options")
    public native NSDictionary<String, ?> options();
}
