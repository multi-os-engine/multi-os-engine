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
import apple.coregraphics.struct.CGSize;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.mapkit.protocol.MKOverlay;
import apple.mapkit.struct.MKMapRect;
import apple.mapkit.struct.MKTileOverlayPath;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKTileOverlay extends NSObject implements MKOverlay {
    static {
        NatJ.register();
    }

    @Generated
    protected MKTileOverlay(Pointer peer) {
        super(peer);
    }

    /**
     * URLForTilePath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instm/MKTileOverlay/URLForTilePath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForTilePath:")
    public native NSURL URLForTilePath(@ByValue MKTileOverlayPath path);

    /**
     * URLTemplate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/URLTemplate">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLTemplate")
    public native String URLTemplate();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKTileOverlay alloc();

    @Generated
    @Selector("boundingMapRect")
    @ByValue
    public native MKMapRect boundingMapRect();

    @Generated
    @Selector("canReplaceMapContent")
    public native boolean canReplaceMapContent();

    @Generated
    @Selector("coordinate")
    @ByValue
    public native CLLocationCoordinate2D coordinate();

    @Generated
    @Selector("init")
    public native MKTileOverlay init();

    /**
     * initWithURLTemplate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instm/MKTileOverlay/initWithURLTemplate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURLTemplate:")
    public native MKTileOverlay initWithURLTemplate(String URLTemplate);

    @Generated
    @IsOptional
    @Selector("intersectsMapRect:")
    public native boolean intersectsMapRect(@ByValue MKMapRect mapRect);

    /**
     * geometryFlipped</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/geometryFlipped">iOS Dev Center</a>
     */
    @Generated
    @Selector("isGeometryFlipped")
    public native boolean isGeometryFlipped();

    /**
     * loadTileAtPath:result:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instm/MKTileOverlay/loadTileAtPath:result:">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadTileAtPath:result:")
    public native void loadTileAtPathResult(@ByValue MKTileOverlayPath path,
            @ObjCBlock(name = "call_loadTileAtPathResult") Block_loadTileAtPathResult result);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTileAtPathResult {
        @Generated
        void call_loadTileAtPathResult(NSData arg0, NSError arg1);
    }

    /**
     * maximumZ</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/maximumZ">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumZ")
    @NInt
    public native long maximumZ();

    /**
     * minimumZ</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/minimumZ">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumZ")
    @NInt
    public native long minimumZ();

    /**
     * canReplaceMapContent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/canReplaceMapContent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCanReplaceMapContent:")
    public native void setCanReplaceMapContent(boolean value);

    @Generated
    @IsOptional
    @Selector("setCoordinate:")
    public native void setCoordinate(@ByValue CLLocationCoordinate2D newCoordinate);

    /**
     * geometryFlipped</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/geometryFlipped">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGeometryFlipped:")
    public native void setGeometryFlipped(boolean value);

    /**
     * maximumZ</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/maximumZ">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumZ:")
    public native void setMaximumZ(@NInt long value);

    /**
     * minimumZ</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/minimumZ">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinimumZ:")
    public native void setMinimumZ(@NInt long value);

    /**
     * tileSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/tileSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTileSize:")
    public native void setTileSize(@ByValue CGSize value);

    @Generated
    @IsOptional
    @Selector("subtitle")
    public native String subtitle();

    /**
     * tileSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKTileOverlay_class/index.html#//apple_ref/occ/instp/MKTileOverlay/tileSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("tileSize")
    @ByValue
    public native CGSize tileSize();

    @Generated
    @IsOptional
    @Selector("title")
    public native String title();

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
}
