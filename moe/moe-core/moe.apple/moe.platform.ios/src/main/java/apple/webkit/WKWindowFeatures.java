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

package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWindowFeatures extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWindowFeatures(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWindowFeatures alloc();

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

    /**
     * allowsResizing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWindowFeatures_Ref/index.html#//apple_ref/occ/instp/WKWindowFeatures/allowsResizing">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsResizing")
    public native NSNumber allowsResizing();

    /**
     * height</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWindowFeatures_Ref/index.html#//apple_ref/occ/instp/WKWindowFeatures/height">iOS Dev Center</a>
     */
    @Generated
    @Selector("height")
    public native NSNumber height();

    @Generated
    @Selector("init")
    public native WKWindowFeatures init();

    /**
     * menuBarVisibility</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWindowFeatures_Ref/index.html#//apple_ref/occ/instp/WKWindowFeatures/menuBarVisibility">iOS Dev Center</a>
     */
    @Generated
    @Selector("menuBarVisibility")
    public native NSNumber menuBarVisibility();

    /**
     * statusBarVisibility</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWindowFeatures_Ref/index.html#//apple_ref/occ/instp/WKWindowFeatures/statusBarVisibility">iOS Dev Center</a>
     */
    @Generated
    @Selector("statusBarVisibility")
    public native NSNumber statusBarVisibility();

    /**
     * toolbarsVisibility</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWindowFeatures_Ref/index.html#//apple_ref/occ/instp/WKWindowFeatures/toolbarsVisibility">iOS Dev Center</a>
     */
    @Generated
    @Selector("toolbarsVisibility")
    public native NSNumber toolbarsVisibility();

    /**
     * width</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWindowFeatures_Ref/index.html#//apple_ref/occ/instp/WKWindowFeatures/width">iOS Dev Center</a>
     */
    @Generated
    @Selector("width")
    public native NSNumber width();

    /**
     * x</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWindowFeatures_Ref/index.html#//apple_ref/occ/instp/WKWindowFeatures/x">iOS Dev Center</a>
     */
    @Generated
    @Selector("x")
    public native NSNumber x();

    /**
     * y</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWindowFeatures_Ref/index.html#//apple_ref/occ/instp/WKWindowFeatures/y">iOS Dev Center</a>
     */
    @Generated
    @Selector("y")
    public native NSNumber y();
}
