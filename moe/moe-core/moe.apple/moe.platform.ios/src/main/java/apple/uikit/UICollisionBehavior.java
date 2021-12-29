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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollisionBehavior alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollisionBehavior allocWithZone(VoidPtr zone);

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
    public static native UICollisionBehavior new_objc();

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

    @Generated
    @Selector("addBoundaryWithIdentifier:forPath:")
    public native void addBoundaryWithIdentifierForPath(@Mapped(ObjCObjectMapper.class) Object identifier,
            UIBezierPath bezierPath);

    @Generated
    @Selector("addBoundaryWithIdentifier:fromPoint:toPoint:")
    public native void addBoundaryWithIdentifierFromPointToPoint(@Mapped(ObjCObjectMapper.class) Object identifier,
            @ByValue CGPoint p1, @ByValue CGPoint p2);

    @Generated
    @Selector("addItem:")
    public native void addItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    @Generated
    @Selector("boundaryIdentifiers")
    public native NSArray<?> boundaryIdentifiers();

    @Generated
    @Selector("boundaryWithIdentifier:")
    public native UIBezierPath boundaryWithIdentifier(@Mapped(ObjCObjectMapper.class) Object identifier);

    @Generated
    @Selector("collisionDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICollisionBehaviorDelegate collisionDelegate();

    @Generated
    @Selector("collisionMode")
    @NUInt
    public native long collisionMode();

    @Generated
    @Selector("init")
    public native UICollisionBehavior init();

    @Generated
    @Selector("initWithItems:")
    public native UICollisionBehavior initWithItems(NSArray<?> items);

    @Generated
    @Selector("items")
    public native NSArray<?> items();

    @Generated
    @Selector("removeAllBoundaries")
    public native void removeAllBoundaries();

    @Generated
    @Selector("removeBoundaryWithIdentifier:")
    public native void removeBoundaryWithIdentifier(@Mapped(ObjCObjectMapper.class) Object identifier);

    @Generated
    @Selector("removeItem:")
    public native void removeItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    @Generated
    @Selector("setCollisionDelegate:")
    public native void setCollisionDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UICollisionBehaviorDelegate value);

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

    @Generated
    @Selector("setCollisionMode:")
    public native void setCollisionMode(@NUInt long value);

    @Generated
    @Selector("setTranslatesReferenceBoundsIntoBoundary:")
    public native void setTranslatesReferenceBoundsIntoBoundary(boolean value);

    @Generated
    @Selector("setTranslatesReferenceBoundsIntoBoundaryWithInsets:")
    public native void setTranslatesReferenceBoundsIntoBoundaryWithInsets(@ByValue UIEdgeInsets insets);

    @Generated
    @Selector("translatesReferenceBoundsIntoBoundary")
    public native boolean translatesReferenceBoundsIntoBoundary();
}
