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
import apple.cloudkit.protocol.CKRecordValue;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDate extends NSObject implements NSCopying, NSSecureCoding, CKRecordValue {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDate alloc();

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
    @Selector("date")
    public static native NSDate date();

    @Generated
    @Selector("dateWithTimeInterval:sinceDate:")
    public static native NSDate dateWithTimeIntervalSinceDate(double secsToBeAdded, NSDate date);

    @Generated
    @Selector("dateWithTimeIntervalSince1970:")
    public static native NSDate dateWithTimeIntervalSince1970(double secs);

    @Generated
    @Selector("dateWithTimeIntervalSinceNow:")
    public static native NSDate dateWithTimeIntervalSinceNow(double secs);

    @Generated
    @Selector("dateWithTimeIntervalSinceReferenceDate:")
    public static native NSDate dateWithTimeIntervalSinceReferenceDate(double ti);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("distantFuture")
    public static native NSDate distantFuture();

    @Generated
    @Selector("distantPast")
    public static native NSDate distantPast();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("timeIntervalSinceReferenceDate")
    public static native double timeIntervalSinceReferenceDate_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("addTimeInterval:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object addTimeInterval(double seconds);

    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(NSDate other);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("dateByAddingTimeInterval:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object dateByAddingTimeInterval(double ti);

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @Selector("earlierDate:")
    public native NSDate earlierDate(NSDate anotherDate);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native NSDate init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDate initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithTimeInterval:sinceDate:")
    public native NSDate initWithTimeIntervalSinceDate(double secsToBeAdded, NSDate date);

    @Generated
    @Selector("initWithTimeIntervalSince1970:")
    public native NSDate initWithTimeIntervalSince1970(double secs);

    @Generated
    @Selector("initWithTimeIntervalSinceNow:")
    public native NSDate initWithTimeIntervalSinceNow(double secs);

    @Generated
    @Selector("initWithTimeIntervalSinceReferenceDate:")
    public native NSDate initWithTimeIntervalSinceReferenceDate(double ti);

    @Generated
    @Selector("isEqualToDate:")
    public native boolean isEqualToDate(NSDate otherDate);

    @Generated
    @Selector("laterDate:")
    public native NSDate laterDate(NSDate anotherDate);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("timeIntervalSince1970")
    public native double timeIntervalSince1970();

    @Generated
    @Selector("timeIntervalSinceDate:")
    public native double timeIntervalSinceDate(NSDate anotherDate);

    @Generated
    @Selector("timeIntervalSinceNow")
    public native double timeIntervalSinceNow();

    @Generated
    @Selector("timeIntervalSinceReferenceDate")
    public native double timeIntervalSinceReferenceDate();
}
