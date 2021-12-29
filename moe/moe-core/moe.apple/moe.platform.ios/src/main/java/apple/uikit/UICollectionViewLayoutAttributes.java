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
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.quartzcore.struct.CATransform3D;
import apple.uikit.protocol.UIDynamicItem;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewLayoutAttributes extends NSObject implements NSCopying, UIDynamicItem {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewLayoutAttributes(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewLayoutAttributes alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewLayoutAttributes allocWithZone(VoidPtr zone);

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
    @Selector("layoutAttributesForCellWithIndexPath:")
    public static native UICollectionViewLayoutAttributes layoutAttributesForCellWithIndexPath(NSIndexPath indexPath);

    @Generated
    @Selector("layoutAttributesForDecorationViewOfKind:withIndexPath:")
    public static native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKindWithIndexPath(
            String decorationViewKind, NSIndexPath indexPath);

    @Generated
    @Selector("layoutAttributesForSupplementaryViewOfKind:withIndexPath:")
    public static native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKindWithIndexPath(
            String elementKind, NSIndexPath indexPath);

    @Generated
    @Owned
    @Selector("new")
    public static native UICollectionViewLayoutAttributes new_objc();

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
    @Selector("alpha")
    @NFloat
    public native double alpha();

    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    @Generated
    @Selector("center")
    @ByValue
    public native CGPoint center();

    @Generated
    @IsOptional
    @Selector("collisionBoundingPath")
    public native UIBezierPath collisionBoundingPath();

    @Generated
    @IsOptional
    @Selector("collisionBoundsType")
    @NUInt
    public native long collisionBoundsType();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    @Generated
    @Selector("indexPath")
    public native NSIndexPath indexPath();

    @Generated
    @Selector("init")
    public native UICollectionViewLayoutAttributes init();

    /**
     * As an optimization, UICollectionView might not create a view for items whose hidden attribute is YES
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * As an optimization, UICollectionView might not create a view for items whose hidden attribute is YES
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    @Generated
    @Selector("representedElementCategory")
    @NUInt
    public native long representedElementCategory();

    /**
     * nil when representedElementCategory is UICollectionElementCategoryCell
     */
    @Generated
    @Selector("representedElementKind")
    public native String representedElementKind();

    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(@NFloat double value);

    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    @Generated
    @Selector("setCenter:")
    public native void setCenter(@ByValue CGPoint value);

    @Generated
    @Selector("setFrame:")
    public native void setFrame(@ByValue CGRect value);

    @Generated
    @Selector("setIndexPath:")
    public native void setIndexPath(NSIndexPath value);

    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    @Generated
    @Selector("setTransform3D:")
    public native void setTransform3D(@ByValue CATransform3D value);

    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue CGAffineTransform value);

    /**
     * default is 0
     */
    @Generated
    @Selector("setZIndex:")
    public native void setZIndex(@NInt long value);

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("transform")
    @ByValue
    public native CGAffineTransform transform();

    @Generated
    @Selector("transform3D")
    @ByValue
    public native CATransform3D transform3D();

    /**
     * default is 0
     */
    @Generated
    @Selector("zIndex")
    @NInt
    public native long zIndex();
}
