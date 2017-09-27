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
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSSecureCoding;
import apple.gameplaykit.protocol.GKSceneRootNodeType;
import apple.modelio.MDLAsset;
import apple.scenekit.protocol.SCNSceneExportDelegate;
import apple.scenekit.struct.SCNMatrix4;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNScene extends NSObject implements NSSecureCoding, GKSceneRootNodeType {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNScene(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNScene alloc();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scene")
    public static native SCNScene scene();

    @Generated
    @Selector("sceneNamed:")
    public static native SCNScene sceneNamed(String name);

    @Generated
    @Selector("sceneNamed:inDirectory:options:")
    public static native SCNScene sceneNamedInDirectoryOptions(String name, String directory,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("sceneWithMDLAsset:")
    public static native SCNScene sceneWithMDLAsset(MDLAsset mdlAsset);

    @Generated
    @Selector("sceneWithURL:options:error:")
    public static native SCNScene sceneWithURLOptionsError(NSURL url, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    @Selector("addParticleSystem:withTransform:")
    public native void addParticleSystemWithTransform(SCNParticleSystem system, @ByValue SCNMatrix4 transform);

    @Generated
    @Selector("attributeForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attributeForKey(String key);

    @Generated
    @Selector("background")
    public native SCNMaterialProperty background();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("fogColor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object fogColor();

    @Generated
    @Selector("fogDensityExponent")
    @NFloat
    public native double fogDensityExponent();

    @Generated
    @Selector("fogEndDistance")
    @NFloat
    public native double fogEndDistance();

    @Generated
    @Selector("fogStartDistance")
    @NFloat
    public native double fogStartDistance();

    @Generated
    @Selector("init")
    public native SCNScene init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNScene initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    @Generated
    @Selector("lightingEnvironment")
    public native SCNMaterialProperty lightingEnvironment();

    @Generated
    @Selector("particleSystems")
    public native NSArray<? extends SCNParticleSystem> particleSystems();

    @Generated
    @Selector("physicsWorld")
    public native SCNPhysicsWorld physicsWorld();

    @Generated
    @Selector("removeAllParticleSystems")
    public native void removeAllParticleSystems();

    @Generated
    @Selector("removeParticleSystem:")
    public native void removeParticleSystem(SCNParticleSystem system);

    @Generated
    @Selector("rootNode")
    public native SCNNode rootNode();

    @Generated
    @Selector("setAttribute:forKey:")
    public native void setAttributeForKey(@Mapped(ObjCObjectMapper.class) Object attribute, String key);

    @Generated
    @Selector("setFogColor:")
    public native void setFogColor(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setFogDensityExponent:")
    public native void setFogDensityExponent(@NFloat double value);

    @Generated
    @Selector("setFogEndDistance:")
    public native void setFogEndDistance(@NFloat double value);

    @Generated
    @Selector("setFogStartDistance:")
    public native void setFogStartDistance(@NFloat double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("writeToURL:options:delegate:progressHandler:")
    public native boolean writeToURLOptionsDelegateProgressHandler(NSURL url, NSDictionary<String, ?> options,
            @Mapped(ObjCObjectMapper.class) SCNSceneExportDelegate delegate,
            @ObjCBlock(name = "call_writeToURLOptionsDelegateProgressHandler") Block_writeToURLOptionsDelegateProgressHandler progressHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeToURLOptionsDelegateProgressHandler {
        @Generated
        void call_writeToURLOptionsDelegateProgressHandler(float arg0, NSError arg1, BoolPtr arg2);
    }
}
