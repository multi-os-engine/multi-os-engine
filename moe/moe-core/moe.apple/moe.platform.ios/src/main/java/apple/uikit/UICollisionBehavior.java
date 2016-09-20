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
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UICollisionBehaviorDelegate;
import apple.uikit.protocol.UIDynamicItem;
import apple.uikit.struct.UIEdgeInsets;
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
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollisionBehavior extends UIDynamicBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollisionBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollisionBehavior alloc();

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
     * addBoundaryWithIdentifier:forPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/addBoundaryWithIdentifier:forPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addBoundaryWithIdentifier:forPath:")
    public native void addBoundaryWithIdentifierForPath(@Mapped(ObjCObjectMapper.class) Object identifier,
            UIBezierPath bezierPath);

    /**
     * addBoundaryWithIdentifier:fromPoint:toPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/addBoundaryWithIdentifier:fromPoint:toPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addBoundaryWithIdentifier:fromPoint:toPoint:")
    public native void addBoundaryWithIdentifierFromPointToPoint(@Mapped(ObjCObjectMapper.class) Object identifier,
            @ByValue CGPoint p1, @ByValue CGPoint p2);

    /**
     * addItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/addItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addItem:")
    public native void addItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * boundaryIdentifiers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/boundaryIdentifiers">iOS Dev Center</a>
     */
    @Generated
    @Selector("boundaryIdentifiers")
    public native NSArray<?> boundaryIdentifiers();

    /**
     * boundaryWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/boundaryWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("boundaryWithIdentifier:")
    public native UIBezierPath boundaryWithIdentifier(@Mapped(ObjCObjectMapper.class) Object identifier);

    /**
     * collisionDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/collisionDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("collisionDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICollisionBehaviorDelegate collisionDelegate();

    /**
     * collisionMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/collisionMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("collisionMode")
    @NUInt
    public native long collisionMode();

    @Generated
    @Selector("init")
    public native UICollisionBehavior init();

    /**
     * initWithItems:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/initWithItems:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithItems:")
    public native UICollisionBehavior initWithItems(NSArray<?> items);

    /**
     * items</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/items">iOS Dev Center</a>
     */
    @Generated
    @Selector("items")
    public native NSArray<?> items();

    /**
     * removeAllBoundaries</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/removeAllBoundaries">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllBoundaries")
    public native void removeAllBoundaries();

    /**
     * removeBoundaryWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/removeBoundaryWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeBoundaryWithIdentifier:")
    public native void removeBoundaryWithIdentifier(@Mapped(ObjCObjectMapper.class) Object identifier);

    /**
     * removeItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/removeItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeItem:")
    public native void removeItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * collisionDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/collisionDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCollisionDelegate:")
    public native void setCollisionDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UICollisionBehaviorDelegate value);

    /**
     * collisionDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/collisionDelegate">iOS Dev Center</a>
     */
    @Generated
    public void setCollisionDelegate(@Mapped(ObjCObjectMapper.class) UICollisionBehaviorDelegate value) {
        Object __old = collisionDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setCollisionDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * collisionMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/collisionMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCollisionMode:")
    public native void setCollisionMode(@NUInt long value);

    /**
     * translatesReferenceBoundsIntoBoundary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/translatesReferenceBoundsIntoBoundary">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTranslatesReferenceBoundsIntoBoundary:")
    public native void setTranslatesReferenceBoundsIntoBoundary(boolean value);

    /**
     * setTranslatesReferenceBoundsIntoBoundaryWithInsets:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instm/UICollisionBehavior/setTranslatesReferenceBoundsIntoBoundaryWithInsets:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTranslatesReferenceBoundsIntoBoundaryWithInsets:")
    public native void setTranslatesReferenceBoundsIntoBoundaryWithInsets(@ByValue UIEdgeInsets insets);

    /**
     * translatesReferenceBoundsIntoBoundary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehavior_Class/index.html#//apple_ref/occ/instp/UICollisionBehavior/translatesReferenceBoundsIntoBoundary">iOS Dev Center</a>
     */
    @Generated
    @Selector("translatesReferenceBoundsIntoBoundary")
    public native boolean translatesReferenceBoundsIntoBoundary();
}
