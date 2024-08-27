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
import apple.uikit.struct.NSDirectionalEdgeInsets;
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
import apple.coremedia.struct.CMVideoDimensions;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import apple.corefoundation.struct.CGVector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSValue alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSValue allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSValue new_objc();

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

    @NotNull
    @Generated
    @Selector("value:withObjCType:")
    public static native NSValue valueWithObjCType(@NotNull ConstVoidPtr value,
            @NotNull @Mapped(CStringMapper.class) String type);

    @NotNull
    @Generated
    @Selector("valueWithBytes:objCType:")
    public static native NSValue valueWithBytesObjCType(@NotNull ConstVoidPtr value,
            @NotNull @Mapped(CStringMapper.class) String type);

    @NotNull
    @Generated
    @Selector("valueWithCATransform3D:")
    public static native NSValue valueWithCATransform3D(@ByValue CATransform3D t);

    @NotNull
    @Generated
    @Selector("valueWithCGAffineTransform:")
    public static native NSValue valueWithCGAffineTransform(@ByValue CGAffineTransform transform);

    @NotNull
    @Generated
    @Selector("valueWithCGPoint:")
    public static native NSValue valueWithCGPoint(@ByValue CGPoint point);

    @NotNull
    @Generated
    @Selector("valueWithCGRect:")
    public static native NSValue valueWithCGRect(@ByValue CGRect rect);

    @NotNull
    @Generated
    @Selector("valueWithCGSize:")
    public static native NSValue valueWithCGSize(@ByValue CGSize size);

    @NotNull
    @Generated
    @Selector("valueWithCGVector:")
    public static native NSValue valueWithCGVector(@ByValue CGVector vector);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("valueWithCMTime:")
    public static native NSValue valueWithCMTime(@ByValue CMTime time);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("valueWithCMTimeMapping:")
    public static native NSValue valueWithCMTimeMapping(@ByValue CMTimeMapping timeMapping);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("valueWithCMTimeRange:")
    public static native NSValue valueWithCMTimeRange(@ByValue CMTimeRange timeRange);

    @NotNull
    @Generated
    @Selector("valueWithMKCoordinate:")
    public static native NSValue valueWithMKCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    @NotNull
    @Generated
    @Selector("valueWithMKCoordinateSpan:")
    public static native NSValue valueWithMKCoordinateSpan(@ByValue MKCoordinateSpan span);

    @NotNull
    @Generated
    @Selector("valueWithNonretainedObject:")
    public static native NSValue valueWithNonretainedObject(@Nullable @Mapped(ObjCObjectMapper.class) Object anObject);

    @NotNull
    @Generated
    @Selector("valueWithPointer:")
    public static native NSValue valueWithPointer(@Nullable ConstVoidPtr pointer);

    @NotNull
    @Generated
    @Selector("valueWithRange:")
    public static native NSValue valueWithRange(@ByValue NSRange range);

    @NotNull
    @Generated
    @Selector("valueWithSCNMatrix4:")
    public static native NSValue valueWithSCNMatrix4(@ByValue SCNMatrix4 v);

    @NotNull
    @Generated
    @Selector("valueWithSCNVector3:")
    public static native NSValue valueWithSCNVector3(@ByValue SCNVector3 v);

    @NotNull
    @Generated
    @Selector("valueWithSCNVector4:")
    public static native NSValue valueWithSCNVector4(@ByValue SCNVector4 v);

    @NotNull
    @Generated
    @Selector("valueWithUIEdgeInsets:")
    public static native NSValue valueWithUIEdgeInsets(@ByValue UIEdgeInsets insets);

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("valueWithUIOffset:")
    public static native NSValue valueWithUIOffset(@ByValue UIOffset insets);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("CATransform3DValue")
    @ByValue
    public native CATransform3D CATransform3DValue();

    @Generated
    @Selector("CGAffineTransformValue")
    @ByValue
    public native CGAffineTransform CGAffineTransformValue();

    @Generated
    @Selector("CGPointValue")
    @ByValue
    public native CGPoint CGPointValue();

    @Generated
    @Selector("CGRectValue")
    @ByValue
    public native CGRect CGRectValue();

    @Generated
    @Selector("CGSizeValue")
    @ByValue
    public native CGSize CGSizeValue();

    @Generated
    @Selector("CGVectorValue")
    @ByValue
    public native CGVector CGVectorValue();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("CMTimeMappingValue")
    @ByValue
    public native CMTimeMapping CMTimeMappingValue();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("CMTimeRangeValue")
    @ByValue
    public native CMTimeRange CMTimeRangeValue();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("CMTimeValue")
    @ByValue
    public native CMTime CMTimeValue();

    @Generated
    @Selector("MKCoordinateSpanValue")
    @ByValue
    public native MKCoordinateSpan MKCoordinateSpanValue();

    @Generated
    @Selector("MKCoordinateValue")
    @ByValue
    public native CLLocationCoordinate2D MKCoordinateValue();

    @Generated
    @Selector("SCNMatrix4Value")
    @ByValue
    public native SCNMatrix4 SCNMatrix4Value();

    @Generated
    @Selector("SCNVector3Value")
    @ByValue
    public native SCNVector3 SCNVector3Value();

    @Generated
    @Selector("SCNVector4Value")
    @ByValue
    public native SCNVector4 SCNVector4Value();

    @Generated
    @Selector("UIEdgeInsetsValue")
    @ByValue
    public native UIEdgeInsets UIEdgeInsetsValue();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("UIOffsetValue")
    @ByValue
    public native UIOffset UIOffsetValue();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * This method is unsafe because it could potentially cause buffer overruns. You should use -getValue:size: instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("getValue:")
    public native void getValue(@NotNull VoidPtr value);

    @Generated
    @Selector("init")
    public native NSValue init();

    @Generated
    @Selector("initWithBytes:objCType:")
    public native NSValue initWithBytesObjCType(@NotNull ConstVoidPtr value,
            @NotNull @Mapped(CStringMapper.class) String type);

    @Generated
    @Selector("initWithCoder:")
    public native NSValue initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("isEqualToValue:")
    public native boolean isEqualToValue(@NotNull NSValue value);

    @Nullable
    @Generated
    @Selector("nonretainedObjectValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object nonretainedObjectValue();

    @NotNull
    @Generated
    @Selector("objCType")
    @MappedReturn(CStringMapper.class)
    public native String objCType();

    @Nullable
    @Generated
    @Selector("pointerValue")
    public native VoidPtr pointerValue();

    @Generated
    @Selector("rangeValue")
    @ByValue
    public native NSRange rangeValue();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("directionalEdgeInsetsValue")
    @ByValue
    public native NSDirectionalEdgeInsets directionalEdgeInsetsValue();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("getValue:size:")
    public native void getValueSize(@NotNull VoidPtr value, @NUInt long size);

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("valueWithDirectionalEdgeInsets:")
    public static native NSValue valueWithDirectionalEdgeInsets(@ByValue NSDirectionalEdgeInsets insets);

    /**
     * [@property] CMVideoDimensionsValue
     * 
     * Returns the CMVideoDimensions struct encoded by this object.
     * 
     * This property simplifies accessing the contents of AVCaptureDeviceFormat.supportedMaxPhotoDimensions which are
     * CMVideoDimension struct values encoded in NSValue objects.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("CMVideoDimensionsValue")
    @ByValue
    public native CMVideoDimensions CMVideoDimensionsValue();

    /**
     * valueWithCMVideoDimensions
     * 
     * Creates a NSValue object encoding a CMVideoDimensions struct value.
     * 
     * This extension simplifies converting CMVideoDimensions struct values into NSValue objects.
     * 
     * API-Since: 16.0
     * 
     * @param dimensions
     *                   The CMVideoDimensions struct to encode.
     * @return
     *         An NSValue object encoding the provided dimensions.
     */
    @Generated
    @Selector("valueWithCMVideoDimensions:")
    public static native NSValue valueWithCMVideoDimensions(@ByValue CMVideoDimensions dimensions);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
