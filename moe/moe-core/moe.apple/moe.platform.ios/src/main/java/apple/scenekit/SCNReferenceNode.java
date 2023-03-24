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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.modelio.MDLObject;
import apple.scenekit.struct.SCNVector3;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNReferenceNode
 * 
 * Node that references an external file.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNReferenceNode extends SCNNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNReferenceNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNReferenceNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNReferenceNode allocWithZone(VoidPtr zone);

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
    public static native SCNReferenceNode new_objc();

    @Generated
    @Selector("node")
    public static native SCNReferenceNode node();

    @NotNull
    @Generated
    @Selector("nodeWithGeometry:")
    public static native SCNNode nodeWithGeometry(@Nullable SCNGeometry geometry);

    @Generated
    @Selector("nodeWithMDLObject:")
    public static native SCNReferenceNode nodeWithMDLObject(@NotNull MDLObject mdlObject);

    /**
     * referenceNodeWithURL:
     * 
     * Creates a reference node with a url.
     */
    @Generated
    @Selector("referenceNodeWithURL:")
    public static native SCNReferenceNode referenceNodeWithURL(@NotNull NSURL referenceURL);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native SCNReferenceNode init();

    /**
     * initWithCoder:
     * 
     * Support coding and decoding via NSKeyedArchiver.
     */
    @Generated
    @Selector("initWithCoder:")
    public native SCNReferenceNode initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * initWithURL:
     * 
     * Creates a reference node with a url.
     */
    @Generated
    @Selector("initWithURL:")
    public native SCNReferenceNode initWithURL(@NotNull NSURL referenceURL);

    /**
     * [@property] loaded
     * 
     * Indicates whether the referenced URL has been loaded.
     */
    @Generated
    @Selector("isLoaded")
    public native boolean isLoaded();

    /**
     * load
     * 
     * Force the reference to be loaded if it hasn't been loaded already. The resolved nodes will be added
     * as child nodes of the receiver.
     */
    @Generated
    @Selector("load")
    public native void load_objc();

    /**
     * [@property] loadingPolicy
     * 
     * Specifies when to load the reference. see SCNReferenceLoadingPolicy above. Defaults to
     * SCNReferenceLoadingPolicyImmediately.
     */
    @Generated
    @Selector("loadingPolicy")
    @NInt
    public native long loadingPolicy();

    /**
     * [@property] referenceURL
     * 
     * Specifies the url to resolve.
     */
    @NotNull
    @Generated
    @Selector("referenceURL")
    public native NSURL referenceURL();

    /**
     * [@property] loadingPolicy
     * 
     * Specifies when to load the reference. see SCNReferenceLoadingPolicy above. Defaults to
     * SCNReferenceLoadingPolicyImmediately.
     */
    @Generated
    @Selector("setLoadingPolicy:")
    public native void setLoadingPolicy(@NInt long value);

    /**
     * [@property] referenceURL
     * 
     * Specifies the url to resolve.
     */
    @Generated
    @Selector("setReferenceURL:")
    public native void setReferenceURL(@NotNull NSURL value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * unload
     * 
     * Remove the child nodes and mark as unloaded.
     */
    @Generated
    @Selector("unload")
    public native void unload();

    @Generated
    @Selector("localFront")
    @ByValue
    public static native SCNVector3 localFront();

    @Generated
    @Selector("localRight")
    @ByValue
    public static native SCNVector3 localRight();

    @Generated
    @Selector("localUp")
    @ByValue
    public static native SCNVector3 localUp();
}
