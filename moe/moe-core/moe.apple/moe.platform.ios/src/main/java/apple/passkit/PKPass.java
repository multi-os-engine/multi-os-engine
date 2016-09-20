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

package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPass extends PKObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPass(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPass alloc();

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

    /**
     * authenticationToken</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/authenticationToken">iOS Dev Center</a>
     */
    @Generated
    @Selector("authenticationToken")
    public native String authenticationToken();

    /**
     * icon</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/icon">iOS Dev Center</a>
     */
    @Generated
    @Selector("icon")
    public native UIImage icon();

    @Generated
    @Selector("init")
    public native PKPass init();

    /**
     * initWithData:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instm/PKPass/initWithData:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithData:error:")
    public native PKPass initWithDataError(NSData data, Ptr<NSError> error);

    /**
     * localizedDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/localizedDescription">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * localizedName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/localizedName">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * localizedValueForFieldKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instm/PKPass/localizedValueForFieldKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedValueForFieldKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object localizedValueForFieldKey(String key);

    /**
     * organizationName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/organizationName">iOS Dev Center</a>
     */
    @Generated
    @Selector("organizationName")
    public native String organizationName();

    /**
     * passType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/passType">iOS Dev Center</a>
     */
    @Generated
    @Selector("passType")
    @NUInt
    public native long passType();

    /**
     * passTypeIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/passTypeIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("passTypeIdentifier")
    public native String passTypeIdentifier();

    /**
     * passURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/passURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("passURL")
    public native NSURL passURL();

    /**
     * paymentPass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/paymentPass">iOS Dev Center</a>
     */
    @Generated
    @Selector("paymentPass")
    public native PKPaymentPass paymentPass();

    /**
     * relevantDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/relevantDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("relevantDate")
    public native NSDate relevantDate();

    /**
     * serialNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/serialNumber">iOS Dev Center</a>
     */
    @Generated
    @Selector("serialNumber")
    public native String serialNumber();

    /**
     * userInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/userInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * webServiceURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/webServiceURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("webServiceURL")
    public native NSURL webServiceURL();

    /**
     * deviceName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/deviceName">iOS Dev Center</a>
     */
    @Generated
    @Selector("deviceName")
    public native String deviceName();

    /**
     * remotePass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPass_Ref/index.html#//apple_ref/occ/instp/PKPass/remotePass">iOS Dev Center</a>
     */
    @Generated
    @Selector("isRemotePass")
    public native boolean isRemotePass();
}
