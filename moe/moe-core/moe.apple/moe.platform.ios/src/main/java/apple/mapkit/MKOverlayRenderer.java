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

package apple.mapkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mapkit.protocol.MKOverlay;
import apple.mapkit.struct.MKMapPoint;
import apple.mapkit.struct.MKMapRect;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKOverlayRenderer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MKOverlayRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKOverlayRenderer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKOverlayRenderer allocWithZone(VoidPtr zone);

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
    public static native MKOverlayRenderer new_objc();

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

    /**
     * Return YES if the renderer is currently ready to draw in the specified rect.
     * Return NO if the renderer will not draw in the specified rect or if the
     * data necessary to draw in the specified rect is not available. In the
     * case where the renderer may want to draw in the specified rect but the data is
     * not available, use setNeedsDisplayInMapRect:zoomLevel: to signal when the
     * data does become available.
     */
    @Generated
    @Selector("canDrawMapRect:zoomScale:")
    public native boolean canDrawMapRectZoomScale(@ByValue MKMapRect mapRect, @NFloat double zoomScale);

    @Generated
    @Selector("contentScaleFactor")
    @NFloat
    public native double contentScaleFactor();

    @Generated
    @Selector("drawMapRect:zoomScale:inContext:")
    public native void drawMapRectZoomScaleInContext(@ByValue MKMapRect mapRect, @NFloat double zoomScale,
            CGContextRef context);

    @Generated
    @Selector("init")
    public native MKOverlayRenderer init();

    @Generated
    @Selector("initWithOverlay:")
    public native MKOverlayRenderer initWithOverlay(@Mapped(ObjCObjectMapper.class) MKOverlay overlay);

    @Generated
    @Selector("mapPointForPoint:")
    @ByValue
    public native MKMapPoint mapPointForPoint(@ByValue CGPoint point);

    @Generated
    @Selector("mapRectForRect:")
    @ByValue
    public native MKMapRect mapRectForRect(@ByValue CGRect rect);

    @Generated
    @Selector("overlay")
    @MappedReturn(ObjCObjectMapper.class)
    public native MKOverlay overlay();

    /**
     * Convert points relative to this view to absolute MKMapPoints
     */
    @Generated
    @Selector("pointForMapPoint:")
    @ByValue
    public native CGPoint pointForMapPoint(@ByValue MKMapPoint mapPoint);

    @Generated
    @Selector("rectForMapRect:")
    @ByValue
    public native CGRect rectForMapRect(@ByValue MKMapRect mapRect);

    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(@NFloat double value);

    @Generated
    @Selector("setNeedsDisplay")
    public native void setNeedsDisplay();

    @Generated
    @Selector("setNeedsDisplayInMapRect:")
    public native void setNeedsDisplayInMapRect(@ByValue MKMapRect mapRect);

    @Generated
    @Selector("setNeedsDisplayInMapRect:zoomScale:")
    public native void setNeedsDisplayInMapRectZoomScale(@ByValue MKMapRect mapRect, @NFloat double zoomScale);
}
