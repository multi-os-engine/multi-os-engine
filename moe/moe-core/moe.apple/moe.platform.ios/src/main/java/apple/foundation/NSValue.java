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
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeMapping;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.mapkit.struct.MKCoordinateSpan;
import apple.quartzcore.struct.CATransform3D;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
import apple.uikit.struct.UIEdgeInsets;
import apple.uikit.struct.UIOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.map.CStringMapper;
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
import org.moe.natj.general.ptr.ConstVoidPtr;
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
public class NSValue extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSValue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSValue alloc();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * value:withObjCType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/value:withObjCType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("value:withObjCType:")
    public static native NSValue valueWithObjCType(ConstVoidPtr value, @Mapped(CStringMapper.class) String type);

    /**
     * valueWithBytes:objCType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithBytes:objCType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithBytes:objCType:")
    public static native NSValue valueWithBytesObjCType(ConstVoidPtr value, @Mapped(CStringMapper.class) String type);

    /**
     * valueWithCATransform3D:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCATransform3D:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCATransform3D:")
    public static native NSValue valueWithCATransform3D(@ByValue CATransform3D t);

    /**
     * valueWithCGAffineTransform:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCGAffineTransform:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCGAffineTransform:")
    public static native NSValue valueWithCGAffineTransform(@ByValue CGAffineTransform transform);

    /**
     * valueWithCGPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCGPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCGPoint:")
    public static native NSValue valueWithCGPoint(@ByValue CGPoint point);

    /**
     * valueWithCGRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCGRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCGRect:")
    public static native NSValue valueWithCGRect(@ByValue CGRect rect);

    /**
     * valueWithCGSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCGSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCGSize:")
    public static native NSValue valueWithCGSize(@ByValue CGSize size);

    /**
     * valueWithCGVector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCGVector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCGVector:")
    public static native NSValue valueWithCGVector(@ByValue CGVector vector);

    /**
     * valueWithCMTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCMTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCMTime:")
    public static native NSValue valueWithCMTime(@ByValue CMTime time);

    /**
     * valueWithCMTimeMapping:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCMTimeMapping:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCMTimeMapping:")
    public static native NSValue valueWithCMTimeMapping(@ByValue CMTimeMapping timeMapping);

    /**
     * valueWithCMTimeRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithCMTimeRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithCMTimeRange:")
    public static native NSValue valueWithCMTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * valueWithMKCoordinate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithMKCoordinate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithMKCoordinate:")
    public static native NSValue valueWithMKCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    /**
     * valueWithMKCoordinateSpan:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithMKCoordinateSpan:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithMKCoordinateSpan:")
    public static native NSValue valueWithMKCoordinateSpan(@ByValue MKCoordinateSpan span);

    /**
     * valueWithNonretainedObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithNonretainedObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithNonretainedObject:")
    public static native NSValue valueWithNonretainedObject(@Mapped(ObjCObjectMapper.class) Object anObject);

    /**
     * valueWithPointer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithPointer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithPointer:")
    public static native NSValue valueWithPointer(ConstVoidPtr pointer);

    /**
     * valueWithRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithRange:")
    public static native NSValue valueWithRange(@ByValue NSRange range);

    /**
     * valueWithSCNMatrix4:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithSCNMatrix4:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithSCNMatrix4:")
    public static native NSValue valueWithSCNMatrix4(@ByValue SCNMatrix4 v);

    /**
     * valueWithSCNVector3:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithSCNVector3:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithSCNVector3:")
    public static native NSValue valueWithSCNVector3(@ByValue SCNVector3 v);

    /**
     * valueWithSCNVector4:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithSCNVector4:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithSCNVector4:")
    public static native NSValue valueWithSCNVector4(@ByValue SCNVector4 v);

    /**
     * valueWithUIEdgeInsets:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithUIEdgeInsets:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithUIEdgeInsets:")
    public static native NSValue valueWithUIEdgeInsets(@ByValue UIEdgeInsets insets);

    /**
     * valueWithUIOffset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/clm/NSValue/valueWithUIOffset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueWithUIOffset:")
    public static native NSValue valueWithUIOffset(@ByValue UIOffset insets);

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
     * CATransform3DValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/CATransform3DValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CATransform3DValue")
    @ByValue
    public native CATransform3D CATransform3DValue();

    /**
     * CGAffineTransformValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/CGAffineTransformValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CGAffineTransformValue")
    @ByValue
    public native CGAffineTransform CGAffineTransformValue();

    /**
     * CGPointValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/CGPointValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CGPointValue")
    @ByValue
    public native CGPoint CGPointValue();

    /**
     * CGRectValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/CGRectValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CGRectValue")
    @ByValue
    public native CGRect CGRectValue();

    /**
     * CGSizeValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/CGSizeValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CGSizeValue")
    @ByValue
    public native CGSize CGSizeValue();

    /**
     * CGVectorValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/CGVectorValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CGVectorValue")
    @ByValue
    public native CGVector CGVectorValue();

    /**
     * CMTimeMappingValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/CMTimeMappingValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CMTimeMappingValue")
    @ByValue
    public native CMTimeMapping CMTimeMappingValue();

    /**
     * CMTimeRangeValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/CMTimeRangeValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CMTimeRangeValue")
    @ByValue
    public native CMTimeRange CMTimeRangeValue();

    /**
     * CMTimeValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/CMTimeValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("CMTimeValue")
    @ByValue
    public native CMTime CMTimeValue();

    /**
     * MKCoordinateSpanValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/MKCoordinateSpanValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("MKCoordinateSpanValue")
    @ByValue
    public native MKCoordinateSpan MKCoordinateSpanValue();

    /**
     * MKCoordinateValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/MKCoordinateValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("MKCoordinateValue")
    @ByValue
    public native CLLocationCoordinate2D MKCoordinateValue();

    /**
     * SCNMatrix4Value</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/SCNMatrix4Value">iOS Dev Center</a>
     */
    @Generated
    @Selector("SCNMatrix4Value")
    @ByValue
    public native SCNMatrix4 SCNMatrix4Value();

    /**
     * SCNVector3Value</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/SCNVector3Value">iOS Dev Center</a>
     */
    @Generated
    @Selector("SCNVector3Value")
    @ByValue
    public native SCNVector3 SCNVector3Value();

    /**
     * SCNVector4Value</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/SCNVector4Value">iOS Dev Center</a>
     */
    @Generated
    @Selector("SCNVector4Value")
    @ByValue
    public native SCNVector4 SCNVector4Value();

    /**
     * UIEdgeInsetsValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/UIEdgeInsetsValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("UIEdgeInsetsValue")
    @ByValue
    public native UIEdgeInsets UIEdgeInsetsValue();

    /**
     * UIOffsetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/UIOffsetValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("UIOffsetValue")
    @ByValue
    public native UIOffset UIOffsetValue();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * getValue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/getValue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getValue:")
    public native void getValue(VoidPtr value);

    @Generated
    @Selector("init")
    public native NSValue init();

    /**
     * initWithBytes:objCType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/initWithBytes:objCType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBytes:objCType:")
    public native NSValue initWithBytesObjCType(ConstVoidPtr value, @Mapped(CStringMapper.class) String type);

    @Generated
    @Selector("initWithCoder:")
    public native NSValue initWithCoder(NSCoder aDecoder);

    /**
     * isEqualToValue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instm/NSValue/isEqualToValue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToValue:")
    public native boolean isEqualToValue(NSValue value);

    /**
     * nonretainedObjectValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/nonretainedObjectValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("nonretainedObjectValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object nonretainedObjectValue();

    /**
     * objCType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/objCType">iOS Dev Center</a>
     */
    @Generated
    @Selector("objCType")
    @MappedReturn(CStringMapper.class)
    public native String objCType();

    @Generated
    @Selector("pointerValue")
    public native VoidPtr pointerValue();

    /**
     * rangeValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValue_Class/index.html#//apple_ref/occ/instp/NSValue/rangeValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeValue")
    @ByValue
    public native NSRange rangeValue();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
