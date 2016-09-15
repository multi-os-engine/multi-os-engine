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

package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.storekit.protocol.SKPaymentTransactionObserver;
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
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKPaymentQueue extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKPaymentQueue(Pointer peer) {
        super(peer);
    }

    /**
     * addPayment:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/addPayment:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addPayment:")
    public native void addPayment(SKPayment payment);

    /**
     * addTransactionObserver:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/addTransactionObserver:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addTransactionObserver:")
    public native void addTransactionObserver(@Mapped(ObjCObjectMapper.class) SKPaymentTransactionObserver observer);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKPaymentQueue alloc();

    /**
     * canMakePayments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/clm/SKPaymentQueue/canMakePayments">iOS Dev Center</a>
     */
    @Generated
    @Selector("canMakePayments")
    public static native boolean canMakePayments();

    /**
     * cancelDownloads:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/cancelDownloads:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelDownloads:")
    public native void cancelDownloads(NSArray<? extends SKDownload> downloads);

    /**
     * defaultQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/clm/SKPaymentQueue/defaultQueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultQueue")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultQueue();

    /**
     * finishTransaction:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/finishTransaction:">iOS Dev Center</a>
     */
    @Generated
    @Selector("finishTransaction:")
    public native void finishTransaction(SKPaymentTransaction transaction);

    @Generated
    @Selector("init")
    public native SKPaymentQueue init();

    /**
     * pauseDownloads:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/pauseDownloads:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pauseDownloads:")
    public native void pauseDownloads(NSArray<? extends SKDownload> downloads);

    /**
     * removeTransactionObserver:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/removeTransactionObserver:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeTransactionObserver:")
    public native void removeTransactionObserver(@Mapped(ObjCObjectMapper.class) SKPaymentTransactionObserver observer);

    /**
     * restoreCompletedTransactions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/restoreCompletedTransactions">iOS Dev Center</a>
     */
    @Generated
    @Selector("restoreCompletedTransactions")
    public native void restoreCompletedTransactions();

    /**
     * restoreCompletedTransactionsWithApplicationUsername:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/restoreCompletedTransactionsWithApplicationUsername:">iOS Dev Center</a>
     */
    @Generated
    @Selector("restoreCompletedTransactionsWithApplicationUsername:")
    public native void restoreCompletedTransactionsWithApplicationUsername(String username);

    /**
     * resumeDownloads:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/resumeDownloads:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resumeDownloads:")
    public native void resumeDownloads(NSArray<? extends SKDownload> downloads);

    /**
     * startDownloads:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instm/SKPaymentQueue/startDownloads:">iOS Dev Center</a>
     */
    @Generated
    @Selector("startDownloads:")
    public native void startDownloads(NSArray<? extends SKDownload> downloads);

    /**
     * transactions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentQueue_Class/index.html#//apple_ref/occ/instp/SKPaymentQueue/transactions">iOS Dev Center</a>
     */
    @Generated
    @Selector("transactions")
    public native NSArray<? extends SKPaymentTransaction> transactions();

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
