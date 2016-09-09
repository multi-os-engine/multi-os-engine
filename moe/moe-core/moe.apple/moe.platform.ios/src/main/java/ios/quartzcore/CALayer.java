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

package ios.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.opaque.CGColorRef;
import ios.coregraphics.opaque.CGContextRef;
import ios.coregraphics.opaque.CGPathRef;
import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.protocol.NSCoding;
import ios.quartzcore.protocol.CAMediaTiming;
import ios.quartzcore.struct.CATransform3D;
import ios.quartzcore.protocol.CAAction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CALayer extends NSObject implements NSCoding, CAMediaTiming {
	static {
		NatJ.register();
	}

	@Generated
	protected CALayer(Pointer peer) {
		super(peer);
	}

	/**
	 * actionForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/actionForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("actionForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native CAAction actionForKey(String event);

	/**
	 * actions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/actions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("actions")
	public native NSDictionary<String, ?> actions();

	/**
	 * addAnimation:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/addAnimation:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAnimation:forKey:")
	public native void addAnimationForKey(CAAnimation anim, String key);

	/**
	 * addSublayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/addSublayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addSublayer:")
	public native void addSublayer(CALayer layer);

	/**
	 * affineTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/affineTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("affineTransform")
	@ByValue
	public native CGAffineTransform affineTransform();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CALayer alloc();

	/**
	 * allowsEdgeAntialiasing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/allowsEdgeAntialiasing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsEdgeAntialiasing")
	public native boolean allowsEdgeAntialiasing();

	/**
	 * allowsGroupOpacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/allowsGroupOpacity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsGroupOpacity")
	public native boolean allowsGroupOpacity();

	/**
	 * anchorPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/anchorPoint">iOS Dev Center</a>
	 */
	@Generated
	@Selector("anchorPoint")
	@ByValue
	public native CGPoint anchorPoint();

	/**
	 * anchorPointZ</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/anchorPointZ">iOS Dev Center</a>
	 */
	@Generated
	@Selector("anchorPointZ")
	@NFloat
	public native double anchorPointZ();

	/**
	 * animationForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/animationForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animationForKey:")
	public native CAAnimation animationForKey(String key);

	/**
	 * animationKeys</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/animationKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animationKeys")
	public native NSArray<String> animationKeys();

	@Generated
	@Selector("autoreverses")
	public native boolean autoreverses();

	/**
	 * backgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/backgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundColor")
	public native CGColorRef backgroundColor();

	/**
	 * backgroundFilters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/backgroundFilters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundFilters")
	public native NSArray<?> backgroundFilters();

	@Generated
	@Selector("beginTime")
	public native double beginTime();

	/**
	 * borderColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/borderColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("borderColor")
	public native CGColorRef borderColor();

	/**
	 * borderWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/borderWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("borderWidth")
	@NFloat
	public native double borderWidth();

	/**
	 * bounds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/bounds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bounds")
	@ByValue
	public native CGRect bounds();

	/**
	 * compositingFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/compositingFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("compositingFilter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object compositingFilter();

	/**
	 * containsPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/containsPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containsPoint:")
	public native boolean containsPoint(@ByValue CGPoint p);

	/**
	 * contents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contents")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object contents();

	/**
	 * contentsAreFlipped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/contentsAreFlipped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentsAreFlipped")
	public native boolean contentsAreFlipped();

	/**
	 * contentsCenter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contentsCenter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentsCenter")
	@ByValue
	public native CGRect contentsCenter();

	/**
	 * contentsGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contentsGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentsGravity")
	public native String contentsGravity();

	/**
	 * contentsRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contentsRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentsRect")
	@ByValue
	public native CGRect contentsRect();

	/**
	 * contentsScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contentsScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentsScale")
	@NFloat
	public native double contentsScale();

	/**
	 * convertPoint:fromLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/convertPoint:fromLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPoint:fromLayer:")
	@ByValue
	public native CGPoint convertPointFromLayer(@ByValue CGPoint p, CALayer l);

	/**
	 * convertPoint:toLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/convertPoint:toLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPoint:toLayer:")
	@ByValue
	public native CGPoint convertPointToLayer(@ByValue CGPoint p, CALayer l);

	/**
	 * convertRect:fromLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/convertRect:fromLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertRect:fromLayer:")
	@ByValue
	public native CGRect convertRectFromLayer(@ByValue CGRect r, CALayer l);

	/**
	 * convertRect:toLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/convertRect:toLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertRect:toLayer:")
	@ByValue
	public native CGRect convertRectToLayer(@ByValue CGRect r, CALayer l);

	/**
	 * convertTime:fromLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/convertTime:fromLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertTime:fromLayer:")
	public native double convertTimeFromLayer(double t, CALayer l);

	/**
	 * convertTime:toLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/convertTime:toLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertTime:toLayer:")
	public native double convertTimeToLayer(double t, CALayer l);

	/**
	 * cornerRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/cornerRadius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cornerRadius")
	@NFloat
	public native double cornerRadius();

	/**
	 * defaultActionForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/clm/CALayer/defaultActionForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultActionForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native CAAction defaultActionForKey(String event);

	/**
	 * defaultValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/clm/CALayer/defaultValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultValueForKey(String key);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	/**
	 * display</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/display">iOS Dev Center</a>
	 */
	@Generated
	@Selector("display")
	public native void display();

	/**
	 * displayIfNeeded</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/displayIfNeeded">iOS Dev Center</a>
	 */
	@Generated
	@Selector("displayIfNeeded")
	public native void displayIfNeeded();

	/**
	 * drawInContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/drawInContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawInContext:")
	public native void drawInContext(CGContextRef ctx);

	/**
	 * drawsAsynchronously</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/drawsAsynchronously">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawsAsynchronously")
	public native boolean drawsAsynchronously();

	@Generated
	@Selector("duration")
	public native double duration();

	/**
	 * edgeAntialiasingMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/edgeAntialiasingMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("edgeAntialiasingMask")
	public native int edgeAntialiasingMask();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("fillMode")
	public native String fillMode();

	/**
	 * filters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/filters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filters")
	public native NSArray<?> filters();

	/**
	 * frame</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/frame">iOS Dev Center</a>
	 */
	@Generated
	@Selector("frame")
	@ByValue
	public native CGRect frame();

	/**
	 * hitTest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/hitTest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hitTest:")
	public native CALayer hitTest(@ByValue CGPoint p);

	/**
	 * init</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/init">iOS Dev Center</a>
	 */
	@Generated
	@Selector("init")
	public native CALayer init();

	@Generated
	@Selector("initWithCoder:")
	public native CALayer initWithCoder(NSCoder aDecoder);

	/**
	 * initWithLayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/initWithLayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithLayer:")
	public native CALayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	/**
	 * insertSublayer:above:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/insertSublayer:above:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertSublayer:above:")
	public native void insertSublayerAbove(CALayer layer, CALayer sibling);

	/**
	 * insertSublayer:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/insertSublayer:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertSublayer:atIndex:")
	public native void insertSublayerAtIndex(CALayer layer, int idx);

	/**
	 * insertSublayer:below:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/insertSublayer:below:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertSublayer:below:")
	public native void insertSublayerBelow(CALayer layer, CALayer sibling);

	/**
	 * doubleSided</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/doubleSided">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isDoubleSided")
	public native boolean isDoubleSided();

	/**
	 * geometryFlipped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/geometryFlipped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isGeometryFlipped")
	public native boolean isGeometryFlipped();

	/**
	 * hidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/hidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	/**
	 * opaque</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/opaque">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isOpaque")
	public native boolean isOpaque();

	/**
	 * layer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/clm/CALayer/layer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("layer")
	public static native CALayer layer();

	/**
	 * layoutIfNeeded</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/layoutIfNeeded">iOS Dev Center</a>
	 */
	@Generated
	@Selector("layoutIfNeeded")
	public native void layoutIfNeeded();

	/**
	 * layoutSublayers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/layoutSublayers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("layoutSublayers")
	public native void layoutSublayers();

	/**
	 * magnificationFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/magnificationFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("magnificationFilter")
	public native String magnificationFilter();

	/**
	 * mask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/mask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mask")
	public native CALayer mask();

	/**
	 * masksToBounds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/masksToBounds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("masksToBounds")
	public native boolean masksToBounds();

	/**
	 * minificationFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/minificationFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minificationFilter")
	public native String minificationFilter();

	/**
	 * minificationFilterBias</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/minificationFilterBias">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minificationFilterBias")
	public native float minificationFilterBias();

	/**
	 * modelLayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/modelLayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("modelLayer")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object modelLayer();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * needsDisplay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/needsDisplay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("needsDisplay")
	public native boolean needsDisplay();

	/**
	 * needsDisplayForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/clm/CALayer/needsDisplayForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("needsDisplayForKey:")
	public static native boolean needsDisplayForKey(String key);

	/**
	 * needsDisplayOnBoundsChange</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/needsDisplayOnBoundsChange">iOS Dev Center</a>
	 */
	@Generated
	@Selector("needsDisplayOnBoundsChange")
	public native boolean needsDisplayOnBoundsChange();

	/**
	 * needsLayout</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/needsLayout">iOS Dev Center</a>
	 */
	@Generated
	@Selector("needsLayout")
	public native boolean needsLayout();

	/**
	 * opacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/opacity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("opacity")
	public native float opacity();

	/**
	 * position</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/position">iOS Dev Center</a>
	 */
	@Generated
	@Selector("position")
	@ByValue
	public native CGPoint position();

	/**
	 * preferredFrameSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/preferredFrameSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredFrameSize")
	@ByValue
	public native CGSize preferredFrameSize();

	/**
	 * presentationLayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/presentationLayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentationLayer")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object presentationLayer();

	/**
	 * rasterizationScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/rasterizationScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rasterizationScale")
	@NFloat
	public native double rasterizationScale();

	/**
	 * removeAllAnimations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/removeAllAnimations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllAnimations")
	public native void removeAllAnimations();

	/**
	 * removeAnimationForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/removeAnimationForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAnimationForKey:")
	public native void removeAnimationForKey(String key);

	/**
	 * removeFromSuperlayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/removeFromSuperlayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeFromSuperlayer")
	public native void removeFromSuperlayer();

	/**
	 * renderInContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/renderInContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderInContext:")
	public native void renderInContext(CGContextRef ctx);

	@Generated
	@Selector("repeatCount")
	public native float repeatCount();

	@Generated
	@Selector("repeatDuration")
	public native double repeatDuration();

	/**
	 * replaceSublayer:with:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/replaceSublayer:with:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replaceSublayer:with:")
	public native void replaceSublayerWith(CALayer layer, CALayer layer2);

	/**
	 * scrollPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/scrollPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scrollPoint:")
	public native void scrollPoint(@ByValue CGPoint p);

	/**
	 * scrollRectToVisible:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/scrollRectToVisible:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scrollRectToVisible:")
	public native void scrollRectToVisible(@ByValue CGRect r);

	/**
	 * actions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/actions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActions:")
	public native void setActions(NSDictionary<String, ?> value);

	/**
	 * setAffineTransform:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/setAffineTransform:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAffineTransform:")
	public native void setAffineTransform(@ByValue CGAffineTransform m);

	/**
	 * allowsEdgeAntialiasing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/allowsEdgeAntialiasing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsEdgeAntialiasing:")
	public native void setAllowsEdgeAntialiasing(boolean value);

	/**
	 * allowsGroupOpacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/allowsGroupOpacity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsGroupOpacity:")
	public native void setAllowsGroupOpacity(boolean value);

	/**
	 * anchorPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/anchorPoint">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnchorPoint:")
	public native void setAnchorPoint(@ByValue CGPoint value);

	/**
	 * anchorPointZ</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/anchorPointZ">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnchorPointZ:")
	public native void setAnchorPointZ(@NFloat double value);

	@Generated
	@Selector("setAutoreverses:")
	public native void setAutoreverses(boolean value);

	/**
	 * backgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/backgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(CGColorRef value);

	/**
	 * backgroundFilters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/backgroundFilters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBackgroundFilters:")
	public native void setBackgroundFilters(NSArray<?> value);

	@Generated
	@Selector("setBeginTime:")
	public native void setBeginTime(double value);

	/**
	 * borderColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/borderColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBorderColor:")
	public native void setBorderColor(CGColorRef value);

	/**
	 * borderWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/borderWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBorderWidth:")
	public native void setBorderWidth(@NFloat double value);

	/**
	 * bounds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/bounds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBounds:")
	public native void setBounds(@ByValue CGRect value);

	/**
	 * compositingFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/compositingFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCompositingFilter:")
	public native void setCompositingFilter(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * contents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContents:")
	public native void setContents(@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * contentsCenter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contentsCenter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentsCenter:")
	public native void setContentsCenter(@ByValue CGRect value);

	/**
	 * contentsGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contentsGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentsGravity:")
	public native void setContentsGravity(String value);

	/**
	 * contentsRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contentsRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentsRect:")
	public native void setContentsRect(@ByValue CGRect value);

	/**
	 * contentsScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/contentsScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentsScale:")
	public native void setContentsScale(@NFloat double value);

	/**
	 * cornerRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/cornerRadius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCornerRadius:")
	public native void setCornerRadius(@NFloat double value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * doubleSided</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/doubleSided">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDoubleSided:")
	public native void setDoubleSided(boolean value);

	/**
	 * drawsAsynchronously</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/drawsAsynchronously">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDrawsAsynchronously:")
	public native void setDrawsAsynchronously(boolean value);

	@Generated
	@Selector("setDuration:")
	public native void setDuration(double value);

	/**
	 * edgeAntialiasingMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/edgeAntialiasingMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEdgeAntialiasingMask:")
	public native void setEdgeAntialiasingMask(int value);

	@Generated
	@Selector("setFillMode:")
	public native void setFillMode(String value);

	/**
	 * filters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/filters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFilters:")
	public native void setFilters(NSArray<?> value);

	/**
	 * frame</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/frame">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFrame:")
	public native void setFrame(@ByValue CGRect value);

	/**
	 * geometryFlipped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/geometryFlipped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGeometryFlipped:")
	public native void setGeometryFlipped(boolean value);

	/**
	 * hidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/hidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHidden:")
	public native void setHidden(boolean value);

	/**
	 * magnificationFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/magnificationFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMagnificationFilter:")
	public native void setMagnificationFilter(String value);

	/**
	 * mask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/mask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMask:")
	public native void setMask(CALayer value);

	/**
	 * masksToBounds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/masksToBounds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMasksToBounds:")
	public native void setMasksToBounds(boolean value);

	/**
	 * minificationFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/minificationFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinificationFilter:")
	public native void setMinificationFilter(String value);

	/**
	 * minificationFilterBias</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/minificationFilterBias">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinificationFilterBias:")
	public native void setMinificationFilterBias(float value);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * setNeedsDisplay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/setNeedsDisplay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNeedsDisplay")
	public native void setNeedsDisplay();

	/**
	 * setNeedsDisplayInRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/setNeedsDisplayInRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNeedsDisplayInRect:")
	public native void setNeedsDisplayInRect(@ByValue CGRect r);

	/**
	 * needsDisplayOnBoundsChange</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/needsDisplayOnBoundsChange">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNeedsDisplayOnBoundsChange:")
	public native void setNeedsDisplayOnBoundsChange(boolean value);

	/**
	 * setNeedsLayout</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/setNeedsLayout">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNeedsLayout")
	public native void setNeedsLayout();

	/**
	 * opacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/opacity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOpacity:")
	public native void setOpacity(float value);

	/**
	 * opaque</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/opaque">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOpaque:")
	public native void setOpaque(boolean value);

	/**
	 * position</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/position">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPosition:")
	public native void setPosition(@ByValue CGPoint value);

	/**
	 * rasterizationScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/rasterizationScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRasterizationScale:")
	public native void setRasterizationScale(@NFloat double value);

	@Generated
	@Selector("setRepeatCount:")
	public native void setRepeatCount(float value);

	@Generated
	@Selector("setRepeatDuration:")
	public native void setRepeatDuration(double value);

	/**
	 * shadowColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowColor:")
	public native void setShadowColor(CGColorRef value);

	/**
	 * shadowOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowOffset:")
	public native void setShadowOffset(@ByValue CGSize value);

	/**
	 * shadowOpacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowOpacity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowOpacity:")
	public native void setShadowOpacity(float value);

	/**
	 * shadowPath</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowPath">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowPath:")
	public native void setShadowPath(CGPathRef value);

	/**
	 * shadowRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowRadius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowRadius:")
	public native void setShadowRadius(@NFloat double value);

	/**
	 * shouldRasterize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shouldRasterize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShouldRasterize:")
	public native void setShouldRasterize(boolean value);

	@Generated
	@Selector("setSpeed:")
	public native void setSpeed(float value);

	/**
	 * style</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/style">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStyle:")
	public native void setStyle(NSDictionary<?, ?> value);

	/**
	 * sublayerTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/sublayerTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSublayerTransform:")
	public native void setSublayerTransform(@ByValue CATransform3D value);

	/**
	 * sublayers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/sublayers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSublayers:")
	public native void setSublayers(NSArray<? extends CALayer> value);

	@Generated
	@Selector("setTimeOffset:")
	public native void setTimeOffset(double value);

	/**
	 * transform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/transform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTransform:")
	public native void setTransform(@ByValue CATransform3D value);

	/**
	 * zPosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/zPosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setZPosition:")
	public native void setZPosition(@NFloat double value);

	/**
	 * shadowColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowColor")
	public native CGColorRef shadowColor();

	/**
	 * shadowOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowOffset")
	@ByValue
	public native CGSize shadowOffset();

	/**
	 * shadowOpacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowOpacity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowOpacity")
	public native float shadowOpacity();

	/**
	 * shadowPath</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowPath">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowPath")
	public native CGPathRef shadowPath();

	/**
	 * shadowRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shadowRadius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowRadius")
	@NFloat
	public native double shadowRadius();

	/**
	 * shouldArchiveValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instm/CALayer/shouldArchiveValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldArchiveValueForKey:")
	public native boolean shouldArchiveValueForKey(String key);

	/**
	 * shouldRasterize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/shouldRasterize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldRasterize")
	public native boolean shouldRasterize();

	@Generated
	@Selector("speed")
	public native float speed();

	/**
	 * style</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/style">iOS Dev Center</a>
	 */
	@Generated
	@Selector("style")
	public native NSDictionary<?, ?> style();

	/**
	 * sublayerTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/sublayerTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sublayerTransform")
	@ByValue
	public native CATransform3D sublayerTransform();

	/**
	 * sublayers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/sublayers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sublayers")
	public native NSArray<? extends CALayer> sublayers();

	/**
	 * superlayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/superlayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("superlayer")
	public native CALayer superlayer();

	@Generated
	@Selector("timeOffset")
	public native double timeOffset();

	/**
	 * transform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/transform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transform")
	@ByValue
	public native CATransform3D transform();

	/**
	 * visibleRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/visibleRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("visibleRect")
	@ByValue
	public native CGRect visibleRect();

	/**
	 * zPosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CALayer_class/index.html#//apple_ref/occ/instp/CALayer/zPosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("zPosition")
	@NFloat
	public native double zPosition();

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
